package com.spotify.automation.web.steps;

import com.esens.automationFwk.web.steps.WebScenarioContext;
import com.spotify.automation.web.enumerations.SpotifyLang;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SpotifyWebInitializationSteps {

    @Given("sample spotify web given step")
    public void sampleSpotifyWebGivenStep(){

    }

    @And("using spotify web with language {string}")
    public void usingSpotifyWebWithLanguage(String spotifyLang) {
        SpotifyLang languageValue = SpotifyLang.valueOf(spotifyLang);
        String previousBaseUrl = WebScenarioContext.getInstance().getBaseUrl();
        WebScenarioContext.getInstance().setBaseUrl(previousBaseUrl + "/" + languageValue);
    }
}
