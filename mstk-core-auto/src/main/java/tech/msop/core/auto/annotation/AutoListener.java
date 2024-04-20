package tech.msop.core.auto.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * ApplicationListener 处理
 *
 * @author ruozhuliufeng
 */
@Documented
@Retention(SOURCE)
@Target(TYPE)
public @interface AutoListener {
}
