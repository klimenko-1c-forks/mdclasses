package com.github._1c_syntax.mdclasses.metadata.configurations;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.github._1c_syntax.mdclasses.jabx.original.Configuration;
import com.github._1c_syntax.mdclasses.jabx.original.MetaDataObject;
import com.github._1c_syntax.mdclasses.metadata.additional.CompatibilityMode;
import com.github._1c_syntax.mdclasses.metadata.additional.ConfigurationSource;
import com.github._1c_syntax.mdclasses.metadata.additional.ScriptVariant;
import com.github._1c_syntax.mdclasses.metadata.utils.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class DesignConfiguration extends AbstractConfiguration {

  private static final Logger LOGGER = LoggerFactory.getLogger(DesignConfiguration.class.getSimpleName());

  public DesignConfiguration(ConfigurationSource configurationSource, Path rootPath) {
    super(configurationSource, rootPath);
  }

  @Override
  public void initialize(File xml) {

    MetaDataObject mdObject = null;

    XmlMapper xmlMapper = new XmlMapper();
    xmlMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

    try {
      mdObject = xmlMapper.readValue(xml, MetaDataObject.class);
    } catch (IOException e) {
      LOGGER.error(e.getMessage(), e);
    }

    if (mdObject != null) {

      Configuration configurationXML = mdObject.getConfiguration();
      initializeProperties(configurationXML);
      initializeModuleType();

    }

  }

  private void initializeProperties(Configuration configurationXML) {

    // Режим совместимости
    compatibilityMode = new CompatibilityMode("Version_8_3_12");
    try {
      compatibilityMode =
        new CompatibilityMode(
          configurationXML.getProperties().getCompatibilityMode().name());
    } catch (NullPointerException e) {
      LOGGER.error("Не удалось получить значение CompatibilityMode.", e);
    }

    // Язык скрипта
    String scriptVariantString = "RUSSIAN";
    try {
      scriptVariantString = configurationXML.getProperties().getScriptVariant().name().toUpperCase();
    } catch (NullPointerException e) {
      LOGGER.error("Не удалось получить значение ScriptVariant.", e);
    }
    scriptVariant = ScriptVariant.valueOf(scriptVariantString);

  }

  private void initializeModuleType() {
    setModulesByType(Common.getModuleTypesByPath(rootPath));
  }

}