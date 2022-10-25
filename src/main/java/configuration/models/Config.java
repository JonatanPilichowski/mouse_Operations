package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import configuration.factory.BrowserFactory;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@NoArgsConstructor
public class Config {

    private String activeEnvironment;
    private HashMap<String, Environment> environments = new HashMap<>();
    @JsonAnySetter
    public void setEnvironment(String key, Environment value) {environments.put(key, value);}
    @JsonAnyGetter
    public HashMap<String, Environment> getEnvironments() {return environments;}
}
