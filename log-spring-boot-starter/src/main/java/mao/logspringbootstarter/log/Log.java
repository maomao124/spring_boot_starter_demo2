package mao.logspringbootstarter.log;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) //ElementType.METHOD：只用在方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface Log
{
    /**
     * 方法的描述信息
     *
     * @return {@link String}
     */
    String desc() default "";
}
