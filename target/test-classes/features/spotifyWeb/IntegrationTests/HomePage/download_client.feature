@Spotify @Web @IntegrationTest @HomePage @Smoke
Feature: [Spotify][Web][IntegrationTests] Home Page - Download rich client

  @NominalCase
  Scenario: Nominal Case
    Given base web url is "https://www.spotify.com/"
    And using spotify web with language "fr"
    When I go to web url "/"
    Then I can see element by xpath "//a[@id='nav-link-download']"
    When I click element by xpath "//a[@id='nav-link-download']"
    Then I should have spotify installation file in my downloads folder in less than 30 seconds
