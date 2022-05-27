package stepDefinitions;

import helpers.StringHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StringExpressionsSteps {

    private String inputWord;
    private boolean isCaseSensitive;
    private String firstSentence;
    private String secondSentence;

    @Given("user inputs the word {string}")
    public void user_inputs_the_word(String inputString) {
        inputWord = inputString;
    }

    @When("the letter {string} is removed")
    public void the_letter_is_removed(String letter) {

        inputWord = inputWord.replace(letter, "");
    }

    @Then("verify the result is {string}")
    public void the_result_is(String finalResult) {

        System.out.println("Updated word: " + inputWord);
        Assert.assertTrue(StringHelper.compareWords(inputWord,finalResult,isCaseSensitive));
    }

    @Given("_First sentence is set to: {string}")
    public void _first_sentence_is_set_to(String firstInputSentence) {
        firstSentence = firstInputSentence;
    }
    @When("first occurrence of symbol {string} is removed")
    public void first_occurrence_of_symbol_is_removed(String exclamationMark) {
        firstSentence = firstSentence.replaceFirst(exclamationMark,"");
        System.out.println("Updated first sentence: " + firstSentence);
    }
    @Given("_Second sentence is set to: {string}")
    public void _second_sentence_is_set_to(String secondInputSentence) {

        secondSentence = secondInputSentence;
    }
    @When("all occurrences of symbol {string} is removed")
    public void all_occurrences_of_symbols_and_are_removed(String symbol) {
        secondSentence = secondSentence.replace(symbol,"");
        System.out.println("Updated second sentence: " +secondSentence);
    }
    @When("case sensitivity is set")
    public void case_sensitivity_is_set() {

    }
    @Then("check the equality of _First sentence and _Second sentence")
    public void check_the_equality_of__first_sentence_and__second_sentence() {
        Assert.assertEquals("The sentences are not equal!",firstSentence,secondSentence);
    }

}
