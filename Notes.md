Cucumber is a testing framework which supports Behaviour Driven Development. It lets us define application behaviour in plan meaning English Text Using simple grammer defined by a language called Gherkin.

Feature: User Certification

    Scenario: User is Passed

        Given that the user Vinod is given a task to clear Java certification exam

        When Vinod got 60 marks in exam

        Then Vinod is known as Java certified
        
        Feature represent name of the feature. a name that can be used to identify the feature.
        Scenario define scenario. Here we are writing the name of scenario that we want to test. In out case we are testing that user is certified.
        
        
 public class UserSteps {
  
  private User user = new User();
 
    @Given("^that the user (.*) is given a task to clear (.*) certification exam$")

    public void certificationName(String name, String certication) throws Throwable {

        user.setName(name);
        user.setCertification(certication);
    }
 
    @When("^(.*) got (\\d+) marks in exam$")
    public void gotMarks(String name, int marks) throws Throwable {
        user.setName(name);
        user.setMarks(marks);
    }

 
    @Then("^(.*) is known as (.*) certified$")
    public void certifiedYes(String name, String certification) throws Throwable {
        assertThat(name, is(user.getName()));
        assertThat(user.getCertification(), equalTo("Java"));
        assertThat(user.getResult(), is(true));
    }
}

As you can see we have used @Given(), @When(), and @Then() annotations for the Given, When and Then of cucumber. we can write the regualr expression inside out annotations to test scenarios.

Main Entry class

The main class runs out Test Cases

package junitcucumber;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
public class UserTest {
}

As you can see the class is annotated with @RunWith(Cucumber.class) class. And one more thing that needs to be noted is that the class has nothing inside it.
It is bare minimum class that helps in running our tests with cucumber.

When you run your test case by right clicking the above class and Run As --> JUnit test, then you will see the following output in the console and the JUnit window.

OUTPUT at CONSOLE

Scenarios ( [32m1 passed [0m)
Steps ( [32m3 passed [0m)
0m0.129s
