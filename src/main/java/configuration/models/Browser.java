package configuration.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@NoArgsConstructor
public class Browser {
    private String browserName;
    private boolean browserAttachScreenshot;
    private boolean headlessMode;
    private int browserTimeout;
    private String appUrl;
}
