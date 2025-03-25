package launchbrowser.reisystems;

import io.cucumber.java.en.*;

public class OnlineShoppingSteps {
	@Given("user is logged into the shopping website")
	public void user_is_logged_into_the_shopping_website() {
		System.out.println("user is logged into the shopping website");
	    
	}

	@Given("user is on the product page")
	public void user_is_on_the_product_page() {
		System.out.println("user is on the product page");
		
	}

	@When("user adds a product to the cart")
	public void user_adds_a_product_to_the_cart() {
		System.out.println("user is on the product page");
	    
	}

	@Then("product should be displayed in the cart")
	public void product_should_be_displayed_in_the_cart() {
		System.out.println("product should be displayed in the cart");
	    
	}

	@When("user proceeds to checkout")
	public void user_proceeds_to_checkout() {
		System.out.println("user proceeds to checkout");
	    
	}

	@When("selects a payment method")
	public void selects_a_payment_method() {
		System.out.println("selects a payment method");
	    
	}

	@When("confirms the order")
	public void confirms_the_order() {
		System.out.println("confirms the order");
	     
	}

	@Then("order should be placed successfully")
	public void order_should_be_placed_successfully() {
		System.out.println("order should be placed successfully");
	     
	}

	@Then("order successfully placed message will be displayed")
	public void order_successfully_placed_message_will_be_displayed() {
		System.out.println("order successfully placed message will be displayed");
	     
	}



}
