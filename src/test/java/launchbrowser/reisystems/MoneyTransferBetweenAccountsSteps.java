package launchbrowser.reisystems;

import io.cucumber.java.en.*;

public class MoneyTransferBetweenAccountsSteps {
	@Given("user is logged into the banking application")
	public void user_is_logged_into_the_banking_application() {
	    System.out.println("user logged into th banking application");
	}

	@Given("navigates to the transfer money page") 
	public void navigates_to_the_transfer_money_page() {
		System.out.println("user navigates to money transfer page");
	    
	}

	@When("user selects accounts of both {string} and {string}")
	public void user_selects_accounts_of_both_and(String string, String string2) {
		System.out.println("user select account of both sender and receiver");
	}

	@When("enter valid {string}")
	public void enter_valid(String string) {
		System.out.println("user enter valid amount");
	    
	}

	@Then("confirms transaction")
	public void confirms_transaction() {
		System.out.println("user confirms transaction");
	   
	}

	@Then("specified amount should be deducted form sender's account")
	public void specified_amount_should_be_deducted_form_sender_s_account() {
		System.out.println("specified amount deducted from senders account");
	    
	}

	@Then("specified amount should be deducted form senders account")
	public void specified_amount_should_be_deducted_form_senders_account() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("creadited to the recivers account")
	public void creadited_to_the_recivers_account() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then("money transfer message should displayed")
	public void money_transfer_message_should_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


}
