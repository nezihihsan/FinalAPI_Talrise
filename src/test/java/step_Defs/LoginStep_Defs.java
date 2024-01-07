package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Then;
import services.Login;
import services.LoginPOJO;

public class LoginStep_Defs {

    Login login = new Login();

    LoginPOJO loginPOJO = new LoginPOJO();

    @Given("I make a request with valid credentials")
    public void i_make_a_request_with_valid_credentials() {

        //login.loginRequest();
        //login.hamcrestLogin();
        loginPOJO.loginPojo();

    }
    @Then("Verify response with status code {int} and response body")
    public void verify_response_with_status_code_and_response_body(Integer Code) {

        //login.verifyBody(Code);
        //login.hamcrestLogin();
        loginPOJO.verifyPOJO();
    }

    @Given("I make a request with invalid {string} and {string}")
    public void ıMakeARequestWithInvalidAnd(String email, String password) {

        login.loginNegatives(email, password);
    }

    @Then("Verify response with status code {int}")
    public void verifyResponseWithStatusCode(int StatusCode) {

        login.verifyNegativeTests(StatusCode);
    }
}
