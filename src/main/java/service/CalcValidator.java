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
		
		ValidationUtils.rejectIfEmpty(errors, "vlAction", "field.action");
        ValidationUtils.rejectIfEmpty(errors, "vlInterest", "field.interest");
        ValidationUtils.rejectIfEmpty(errors, "qtPurch", "field.purchased");

		Calculator calculator = (Calculator) target;

		if (calculator.getVlAction() < 0) {
			errors.rejectValue("action", "field.action");
		}

		if (calculator.getVlInterest() < 0) {
			errors.rejectValue("vlInterest", "field.interest");
		}

		if (calculator.getQtPurch() < 0) {
			errors.rejectValue("qtPurch", "field.purchased");
		}
	}
}
