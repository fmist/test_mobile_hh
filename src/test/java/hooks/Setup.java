package hooks;

import driver.DriverCreator;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Setup {

    DriverCreator driverCreator = new DriverCreator();
    @Before
    public void init() {
        driverCreator.createDriver();
    }

    @After
    public void quit() {
        driverCreator.closeDriver();
    }
}
