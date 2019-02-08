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
	public void ValidateVersionForPcfUrl_whenNoVersionProvided() {
		boolean isMatched = controller.validatePcfUrl(null);
		assertFalse(isMatched);
	}

	@Test
	public void ValidateVersionForPcfUrl_whenVersionProvided() {
		boolean isMatched = controller.validatePcfUrl("2.63.0");
		assertFalse(isMatched);
	}

	@Test
	public void ValidateVersionForPcfUrl_whenMatchingVersionProvided() {
		boolean isMatched = controller.validatePcfUrl("2.128.0");
		assertFalse(!isMatched);
	}
	
	@Test
	public void ValidateVersionForBlueMixUrl_whenNoVersionProvided() {
		boolean isMatched = controller.validateBlueMixUrl(null);
		assertFalse(isMatched);
	}

	@Test
	public void ValidateVersionForBlueMixUrl_whenVersionProvided() {
		boolean isMatched = controller.validateBlueMixUrl("2.54.0");
		assertFalse(isMatched);
	}
	
	@Test
	public void ValidateVersionForBlueMixUrl_whenMatchingVersionProvided() {
		boolean isMatched = controller.validateBlueMixUrl("2.106.0");
		assertFalse(!isMatched);
	}


}
