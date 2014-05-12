/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

package entities;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import validator.Email;

/**
 *
 * @author Alexander Nowak
 */
public class Customer {
    @NotNull @Size(min = 2, max = 200)
    String firstName;
    String lastName;
    @Email
    String email;
    String PhoneNr;
    @Past
    Date dateOfBirth;
    
}
