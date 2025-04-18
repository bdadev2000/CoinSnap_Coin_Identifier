package com.google.protobuf;

/* loaded from: classes4.dex */
public final class y1 {
    static final Class<?> INSTANCE = resolveExtensionClass();

    private y1() {
    }

    public static Class<?> resolveExtensionClass() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
