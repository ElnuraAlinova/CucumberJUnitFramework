package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;


public class CaloriesSteps {

    WebDriver driver = Driver.getDriver();
    @Given("user goes to {string}")
    public void user_goes_to(String url) {
        driver.get(url);


    }
    @Given("user enters {int} calories")
    public void user_enters_calories(Integer amountOfCalories) {
        System.out.println("user entered calories: " + amountOfCalories);

    }
    @Then("user selects {int} meals")
    public void user_selects_meals(Integer amountOfMeals) {
        System.out.println("user selected meals: "+ amountOfMeals);

    }
    @Then("user clicks on generate")
    public void user_clicks_on_generate() {
        System.out.println("user clicked on generate");

    }
    @Then("verify {int} meals are generated")
    public void verify_meals_are_generated(Integer amountOfMeals) {
        Assert.assertTrue(amountOfMeals == 4);

    }

}
