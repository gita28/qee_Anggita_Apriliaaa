package User;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"}
        features = "scr/test/resource/api"


)

public class CucumberTestSuite {
}
