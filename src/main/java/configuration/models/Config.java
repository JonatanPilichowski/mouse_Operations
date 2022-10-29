package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class Config {

    private Browser browser;

    Map<String, Environment> environments = new LinkedHashMap<>();
    private String activeEnv;


    @JsonAnySetter
    public void setEnvironment(String key, Environment value) {
        environments.put(key, value);
    }

    @JsonAnyGetter
    public List<Environment> getEnvironments() {
        return environments.values().stream().toList();
    }
}
