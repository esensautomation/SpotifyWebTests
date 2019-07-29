package com.spotify.automation.web.steps;

import com.esens.automationFwk.web.steps.WebScenarioContext;

public class SpotifyWebScenarioContext extends WebScenarioContext {

    private static SpotifyWebScenarioContext instance = new SpotifyWebScenarioContext();

    public SpotifyWebScenarioContext(){

    }

    public static SpotifyWebScenarioContext getInstance(){
        return instance;
    }
}
