/*In TestCase class we just need to call the methods from the page
 * which handles all the login over there 
 * And all the test cases are grouped by category in order to run specific types
 */

package com.framework.testcase;

import org.testng.annotations.Test;

import com.framework.annotations.Annotation;
import com.framework.pages.LoginPage;
import com.framework.reports.Report;
import com.framework.utils.Data;

public class AddToCartTest extends Annotation{
	Report rep = new Report();
	
	@Test(priority=1, groups="smoke")
	public void addToCartTest() {
		rep.startTestCase("AddCart_001", "Check whether we can able to add an item in card");
		String itemName="Sauce Labs Bolt T-Shirt";
		new LoginPage().loginWithValidCredentials(Data.validUserName, Data.validPassword).addToCart(itemName)
		.clickCartButton().verifyCartAdded(itemName);
	}
	
}
