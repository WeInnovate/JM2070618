package com.jm2070618.learn.annotation.custom.classinfo;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface ClassInfo {

	String author();

	String createdOn();

	String[] reviewers() default {"Atul"};

	int version() default 1;
}
