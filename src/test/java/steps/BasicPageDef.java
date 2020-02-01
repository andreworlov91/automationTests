package steps;
import io.cucumber.java.en.Then;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @Then("Click {string} button")
    public void clickButton(String arg) {
        basicPage.clickButton(arg);
    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg) {
        basicPage.clickButtonSpan(arg);
    }

    @Then("Content with {string} visible")
    public void contentIsVisible(String arg) {
        basicPage.contentIsVisible(arg);
    }
}
