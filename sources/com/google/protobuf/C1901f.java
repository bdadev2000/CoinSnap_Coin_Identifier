package com.google.protobuf;

/* renamed from: com.google.protobuf.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1901f {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class<?> MEMORY_CLASS = getClassForName("libcore.io.Memory");

    static {
        boolean z8;
        if (!ASSUME_ANDROID && getClassForName("org.robolectric.Robolectric") != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        IS_ROBOLECTRIC = z8;
    }

    private C1901f() {
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
        if (!ASSUME_ANDROID && (MEMORY_CLASS == null || IS_ROBOLECTRIC)) {
            return false;
        }
        return true;
    }
}
