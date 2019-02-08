package com.ing.assessment.controller;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ValidatorControllerTest {

	ValidatorController controller;
	
	@Test
	public void ValidateVersionWhenNoUrl() {
		controller = new ValidatorController();
		boolean isMatched = controller.validate(null);
		assertFalse(isMatched);
	}

	@Test
	public void ValidateVersionWhenUrlIsNotEmpty() {
		controller = new ValidatorController();
		boolean isMatched = controller.validate("url");
		assertFalse(!isMatched);
	}
	

}
