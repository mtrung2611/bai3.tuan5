package minhtrung.bai3.Validator;

import minhtrung.bai3.entity.Category;
import minhtrung.bai3.Validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
public class ValidCategoryIdValidator  implements ConstraintValidator<ValidCategoryId, Category>{
    @Override
    public boolean isValid(Category category,ConstraintValidatorContext context){
        return category !=null && category.getId() !=null;
    }

}
