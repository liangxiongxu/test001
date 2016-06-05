package com.snc.sdlc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for traceability of requirements tests
 * 
 * This allows to tag automated tests associated with an epic for auditing and
 * reporting
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
@Inherited
public @interface Epic {
	/**
	 * One or more task ids (ex: EPIC123456)
	 */
	public String[] value();
}
