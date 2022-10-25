package configuration.factory;

import configuration.models.Config;
import configuration.models.Environment;
import configuration.reader.YamlReader;

public class EnvironmentFactory {

    private static class EnvironmentFactorySingleton {
        private static final Environment INSTANCE = loadConfig();
    }
    public static Environment getInstance() {
        return EnvironmentFactory.EnvironmentFactorySingleton.INSTANCE;
    }

    public static Environment loadConfig(){
        YamlReader yamlReader = new YamlReader();
        Config config = yamlReader.getConfig();
        try {
            String activeEnvironment = config.getActiveEnvironment();
            return  config.getEnvironments().get(activeEnvironment);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public Environment getConfig() {return getInstance();}
}
