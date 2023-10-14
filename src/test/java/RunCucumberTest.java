import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", // Location of your feature files
        glue = "org.example") // Location of your step definitions

public class RunCucumberTest {

}
