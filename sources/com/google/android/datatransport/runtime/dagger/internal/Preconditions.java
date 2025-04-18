package com.google.android.datatransport.runtime.dagger.internal;

/* loaded from: classes2.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static <T> void checkBuilderRequirement(T t2, Class<T> cls) {
        if (t2 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T checkNotNull(T t2) {
        t2.getClass();
        return t2;
    }

    public static <T> T checkNotNullFromComponent(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }

    public static <T> T checkNotNullFromProvides(T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public static <T> T checkNotNull(T t2, String str) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(str);
    }

    public static <T> T checkNotNull(T t2, String str, Object obj) {
        String valueOf;
        if (t2 != null) {
            return t2;
        }
        if (str.contains("%s")) {
            if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                if (obj instanceof Class) {
                    valueOf = ((Class) obj).getCanonicalName();
                } else {
                    valueOf = String.valueOf(obj);
                }
                throw new NullPointerException(str.replace("%s", valueOf));
            }
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
    }
}
