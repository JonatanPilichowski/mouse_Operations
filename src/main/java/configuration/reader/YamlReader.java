package configuration.reader;


import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import configuration.models.Config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class YamlReader {
    private Config config;

    public YamlReader() {
        try {
            ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
            this.config = mapper.readValue(new File("src/main/resources.config.yaml"), Config.class);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Config getConfig() {return  config;}
}
