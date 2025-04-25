package androidx.webkit;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public abstract class WebResourceErrorCompat {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface NetErrorCode {
    }

    public abstract CharSequence getDescription();

    public abstract int getErrorCode();
}
