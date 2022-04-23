package oop.assets;
import java.lang.annotation.*;

@Target(value = { ElementType.TYPE })
@Retention(value = RetentionPolicy.SOURCE)
public @interface PersonAnnotation {

    String name();
    String description() default "";

    String[] tags() default {};
}
