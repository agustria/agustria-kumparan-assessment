Kumparan UI Testing (Cucumber - Rest Assured) 
========================================
This is automation suite is designed to test https://kumparan.com/

The project has scenarios (include bugs found) that that can be located within the feature files: 
 - src/test/resources/assessment.feature  

**assessment.feature bugs found scenarios (with tags @bug):**
    Scenario: The number of like is increase when non login choose love icon.
    Scenario: Content not found when access Opini & Cerita via comment page on non-login user.
    Scenario: No content yet when access News from mom article on non-login user.
    Scenario: Trending not displayed when access from mom article on non-login user.
    Scenario: Opini & Cerita not loaded when access from mom article on non-login user.

**assessment.feature scenarios (with tags @test-case):**
    Scenario: Verify kumparan menu pages displayed

```
You will need:
- Java 1.8+ installed (Does not work with Java below 1.8) [I ran it on JDK 11 as well]
- Maven Installed (I use version 3.5.2) OR Gradle 3.6.1
- Eclipse (Or another Java IDE)
```
**Important: This suite should work on both windows and mac platforms however has only been tested on a Mac. If possible please use a Mac to execute the test suite**
