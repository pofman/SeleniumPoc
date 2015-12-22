package selenium.poc.selenum;

import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;
import org.junit.Test;
/**
 * Created by martinmendez on 12/22/15.
 */
@Config(
        browser = Browser.CHROME,
        url     = "http://www.ticketmaster.com/"
)
public class HomePageTest extends Locomotive {
    @Test
    public void SearchForLadyGaga() {

        validatePresent(HomePage.searchInput)
                .validatePresent(HomePage.searchButton);

        HomePage.Write(driver, "Lady Gaga");
        HomePage.ClickSearch(driver);
    }
}
