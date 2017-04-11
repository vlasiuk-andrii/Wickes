import org.junit.AfterClass;
import org.junit.BeforeClass;
import wickes.ServiceWD;

public class BaseSpec {

    ServiceWD serviceWD = new ServiceWD();

    @BeforeClass
    public void setUp() {
        serviceWD.initWD();
    }

    @AfterClass
    public void tearDown() {
        serviceWD.getDriver().close();
        serviceWD.getDriver().quit();
    }
}