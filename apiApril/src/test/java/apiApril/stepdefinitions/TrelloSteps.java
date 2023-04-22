package apiApril.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrelloSteps {
    
    @Given("The board exists and contains the correct information")
    public void getBoardDataAndCheckInfo(){
        System.out.println("1st step was executed");
    }

    @When("I change the board title to {string}")
    public void iChangeTheBoardTitleTo(String title) {
        System.out.println("2nd step was executed");
    }

    @And("I check that the board name is updated to {string}")
    public void iCheckThatTheBoardNameIsUpdatedTo(String title) {
        System.out.println("3rd step was executed");
    }

    @Then("I add a list with a name {string} to the board")
    public void iAddAListWithANameToTheBoard(String listName) {
        System.out.println("4th step was executed");
    }
}
