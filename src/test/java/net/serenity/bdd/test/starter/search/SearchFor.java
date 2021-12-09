package net.serenity.bdd.test.starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class SearchFor extends UIInteractionSteps {
    @Steps
    Help help;
    @Step("Search for term {0}")
    public void term(String term) {
        $(SearchForm.SEARCH_FIELD).clear();
        $(SearchForm.SEARCH_FIELD).type(term);
        $(SearchForm.SEARCH_BUTTON).click();
    }

    @Step("Search for term {0}")
    public void termOnSearchResultsPage(String term) {
        $(SearchForm.SEARCH_FIELD_ON_RESULT_PAGE).clear();
        $(SearchForm.SEARCH_FIELD_ON_RESULT_PAGE).type(term);
        $(SearchForm.SEARCH_BUTTON_ON_RESULT_PAGE).click();
    }

    @Step("This will print the name")
    public void printMyName(String name){
        System.out.println("This is my name :"+name);
        contactMyName(name);
    }

    @Step("This will concat the name ")
    public void contactMyName(String name){
        help.contactMyName(name);
       // System.out.println("My name is "+name+""+"JADHAV");
    }

}
