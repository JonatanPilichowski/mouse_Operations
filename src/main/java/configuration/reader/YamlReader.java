package configuration.reader;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import configuration.models.Config;
import configuration.properties.AllProperties;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class YamlReader {
    private static final Logger logger = LoggerFactory.getLogger(YamlReader.class);
    private final Config config;

    @SneakyThrows
    public YamlReader() {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        this.config = mapper.readValue(new File("src/main/resources/config.yaml"), Config.class);
        logger.info(">>>>>>>>>>>Loaded the config to object mapper");
    }

    public Config getConfig() {
        return config;
    }
}
