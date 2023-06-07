package minhtrung.bai3.validator;

import minhtrung.bai3.entity.User;
import minhtrung.bai3.validator.annotation.ValidUserId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidUserIdValidator implements ConstraintValidator<ValidUserId,User> {
    @Override
    public boolean isValid(User user,ConstraintValidatorContext context){
        if(user==null)
            return true;
        return user.getId() != null;
    }
}
