package com.google.protobuf;

/* loaded from: classes3.dex */
public final class U1 {
    static final Class<?> INSTANCE = resolveExtensionClass();

    private U1() {
    }

    public static Class<?> resolveExtensionClass() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
