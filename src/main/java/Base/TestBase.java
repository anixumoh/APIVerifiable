package Base;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import static utility.Utility.fetchvalue;

public class TestBase {
    public String baseurl;

    @BeforeClass(alwaysRun = true)

    public void SetUp() {
        switch (fetchvalue("Environment")) {
            case "Production":
                baseurl = fetchvalue("baseurlProd");
                break;
            case "Staging":
                baseurl = fetchvalue("baseurlStaging");
                break;
        }
    }
}
