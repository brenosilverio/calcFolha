package service;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import model.Calculator;

public class CalcValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		return Calculator.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "action", "field.required");
        ValidationUtils.rejectIfEmpty(errors, "interest", "field.required");
        ValidationUtils.rejectIfEmpty(errors, "purch", "field.required");

		Calculator calculator = (Calculator) target;

		if (calculator.getVlAction() < 0) {
			errors.rejectValue("action", "field.required");
		}

		if (calculator.getVlInterest() < 0) {
			errors.rejectValue("interest", "field.required");
		}

		if (calculator.getQtPurch() < 0) {
			errors.rejectValue("purch", "field.required");
		}
	}
}
