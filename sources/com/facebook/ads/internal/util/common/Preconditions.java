package com.facebook.ads.internal.util.common;

import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes.dex */
public final class Preconditions {
    public static void checkIsOnMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new RuntimeException("Must be called from the UiThread");
        }
    }

    public static void checkIsTrue(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    public static <T> T checkNotNull(T t5, String str) {
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException(str);
    }
}
