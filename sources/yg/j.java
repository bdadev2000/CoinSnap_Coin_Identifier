package yg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes4.dex */
public @interface j {
    boolean ignore() default false;

    String name() default "\u0000";
}
