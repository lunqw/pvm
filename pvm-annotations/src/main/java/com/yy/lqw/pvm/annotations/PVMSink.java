package com.yy.lqw.pvm.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by lunqingwen on 2016/10/23.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PVMSink {
    int ordinal() default 0;
}
