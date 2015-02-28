package nopcommerce;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Srikanth on 28/02/2015.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"html:target/CucumberReports"},tags="@Cat1")
public class RunTests {
}
