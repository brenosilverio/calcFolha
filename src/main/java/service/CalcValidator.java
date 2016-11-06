package service;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import model.Calculator;

public class CalcValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Calculator.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		Calculator calculator = (Calculator) target;

		if (calculator.getVlAction() < 0) {
			errors.rejectValue("vlAction", "field.required");
		}

		if (calculator.getInterestPurch() < 0) {
			errors.rejectValue("vlInterest", "field.required");
		}

		if (calculator.getQtPurch() < 0) {
			errors.rejectValue("qtPurch", "field.required");
		}
	}
}
