package com.google.protobuf;

/* loaded from: classes4.dex */
public final class f {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        boolean z10;
        if (!ASSUME_ANDROID && getClassForName("org.robolectric.Robolectric") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        IS_ROBOLECTRIC = z10;
    }

    private f() {
    }

    private static <T> Class<T> getClassForName(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        return ASSUME_ANDROID || !(MEMORY_CLASS == null || IS_ROBOLECTRIC);
    }
}
