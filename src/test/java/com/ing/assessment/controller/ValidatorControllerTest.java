package com.ing.assessment.controller;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class ValidatorControllerTest {

	private ValidatorController controller;
	
	@Before
	public void setup() {
		controller = new ValidatorController();
	}
	
	@Test
	public void ValidateVersionForPcfUrl() {
		boolean isMatched = controller.validatePcfUrl();
		assertFalse(isMatched);
	}

	@Test
	public void ValidateVersionForBlueMixUrl() {
		boolean isMatched = controller.validateBlueMixUrl();
		assertFalse(isMatched);
	}
	

}
