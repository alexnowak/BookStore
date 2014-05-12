/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

package validator;

import java.util.regex.Pattern;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author Alexander Nowak
 */
class ZipValidator implements ConstraintValidator<ZipCode,String> {
    @Inject @USA
    private ZipCodeChecker checker;
    private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5}?");

    @Override
    public void initialize(ZipCode zipCode) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
