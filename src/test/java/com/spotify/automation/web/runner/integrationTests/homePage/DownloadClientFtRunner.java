package com.spotify.automation.web.runner.integrationTests.homePage;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/spotifyWeb/IntegrationTests/HomePage/download_client.feature"},
        glue = {
                "com.esens.automationFwk.steps",
                "com.esens.automationFwk.web.steps",
                "com.spotify.automation.web.steps"
        }
)
public class DownloadClientFtRunner {
}
