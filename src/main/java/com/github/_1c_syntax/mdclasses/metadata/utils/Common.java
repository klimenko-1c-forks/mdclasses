package com.github._1c_syntax.mdclasses.metadata.utils;

import com.github._1c_syntax.mdclasses.mdo.MDObjectBase;
import com.github._1c_syntax.mdclasses.metadata.Configuration;
import com.github._1c_syntax.mdclasses.metadata.SupportConfiguration;
import com.github._1c_syntax.mdclasses.metadata.additional.ConfigurationSource;
import com.github._1c_syntax.mdclasses.metadata.additional.ModuleType;
import com.github._1c_syntax.mdclasses.metadata.additional.SupportVariant;
import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.net.URI;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Common {

  public static final String EXTENSION_XML = "xml";
  public static final String EXTENSION_MDO = "mdo";

  private Common() {
    // only statics
  }

  public static Map<URI, Map<SupportConfiguration, SupportVariant>> getModuleSupports(Configuration configuration) {
    Map<URI, Map<SupportConfiguration, SupportVariant>> modulesBySupport = new HashMap<>();
    File fileParentConfiguration;
    if (configuration.getConfigurationSource() == ConfigurationSource.EDT) {
      fileParentConfiguration = Paths.get(configuration.getRootPath().toString(),
        "src", "Configuration/ParentConfigurations.bin")
        .toFile();
    } else {
      fileParentConfiguration = Paths.get(configuration.getRootPath().toString(),
        "Ext/ParentConfigurations.bin")
        .toFile();
    }

    if (fileParentConfiguration.exists()) {
      ParseSupportData supportData = new ParseSupportData(fileParentConfiguration.toPath());
      final Map<String, Map<SupportConfiguration, SupportVariant>> supportMap = supportData.getSupportMap();

      Map<String, MDObjectBase> uuids = new HashMap<>();

      configuration.getChildren().forEach(mdObject -> {
        uuids.put(mdObject.getUuid(), mdObject);
        if (mdObject.getForms() != null) {
          mdObject.getForms().forEach(form -> uuids.put(form.getUuid(), form));
        }
      });

      supportMap.forEach((uuid, supportConfiguration) -> {
        var mdo = uuids.get(uuid);
        if (mdo != null && mdo.getModulesByType() != null) {
          mdo.getModulesByType().forEach((uri, moduleType) ->
            modulesBySupport.put(uri, supportConfiguration)
          );
        }
      });
    }

    return modulesBySupport;
  }

  public static Map<URI, ModuleType> getModuleTypesByPath(Configuration configuration) {
    Map<URI, ModuleType> modulesByType = new HashMap<>();

    configuration.getChildren().forEach(mdObject -> {
        if (mdObject.getModulesByType() != null) {
          mdObject.getModulesByType().forEach(modulesByType::put);
        }
        if (mdObject.getForms() != null) {
          mdObject.getForms().forEach(form -> {
            if (form.getModulesByType() != null) {
              form.getModulesByType().forEach(modulesByType::put);
            }
          });
        }
      }
    );
    return modulesByType;
  }

}
