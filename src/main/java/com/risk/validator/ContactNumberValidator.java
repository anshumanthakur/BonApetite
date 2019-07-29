package com.risk.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumberValidator implements ConstraintValidator<IsValidEmail, String> {

	@Override
	public void initialize(IsValidEmail is) {
		is.message();

	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {

		if (email.isEmpty()) {

			return false;
		}

		String expression = "^[\\w.+\\-]+@gmail\\.com$";
		CharSequence inputStr = email;

		// It used to match text or expression against a regular expression more than
		// one time.
		Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(inputStr);

		if (matcher.matches()) {
			return true;
		} else

			return false;

	}

}
