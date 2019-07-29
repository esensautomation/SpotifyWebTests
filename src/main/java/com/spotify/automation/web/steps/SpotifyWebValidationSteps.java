package com.spotify.automation.web.steps;

import com.esens.automationFwk.web.steps.WebScenarioContext;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.nio.file.Paths;
import java.util.function.Function;

public class SpotifyWebValidationSteps {

    @Then("sample spotify web then step")
    public void sampleSpotifyWebThenStep(){

    }

    @Then("I should have spotify installation file in my downloads folder in less than {int} seconds")
    public void iShouldHaveSpotifyInstallationFileInMyDownloadsFolderInLessThanSeconds(int maxTime) {
        WebDriverWait wait = new WebDriverWait(WebScenarioContext.getInstance().getDriver(), maxTime);
        wait.until((Function<WebDriver, Object>) s -> {
            File folder = new File(getDownloadsPath());
            File[] downloadFiles = folder.listFiles();
            boolean isSpotifyInstallerPresent = false;
            assert downloadFiles != null && downloadFiles.length >= 1;
            for (File downloadFile : downloadFiles) {
                if (downloadFile.getName().contains("SpotifySetup")){
                    isSpotifyInstallerPresent = true;
                    break;
                }
                if (downloadFile.getName().contains("SpotifyInstaller")){
                    isSpotifyInstallerPresent = true;
                    break;
                }
            }
            return isSpotifyInstallerPresent;
        });
    }

    private String getDownloadsPath(){
        return Paths.get(System.getProperty("user.home"), "Downloads").toString();
    }
}
