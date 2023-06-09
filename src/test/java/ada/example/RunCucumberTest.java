package ada.example;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("ada/example")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
@IncludeTags("Smoke")
@ExcludeTags("Ignore")

public class RunCucumberTest {
}
