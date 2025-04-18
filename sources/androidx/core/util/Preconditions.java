package androidx.core.util;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes3.dex */
public final class Preconditions {
    public static void a(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(String str, float f2) {
        if (Float.isNaN(f2)) {
            throw new IllegalArgumentException(str.concat(" must not be NaN"));
        }
        if (Float.isInfinite(f2)) {
            throw new IllegalArgumentException(str.concat(" must not be infinite"));
        }
    }

    public static void c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
