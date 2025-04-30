package com.google.protobuf;

/* loaded from: classes3.dex */
public final class T1 {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static W1 create() {
        W1 invokeSubclassFactory = invokeSubclassFactory("newInstance");
        if (invokeSubclassFactory == null) {
            return new W1();
        }
        return invokeSubclassFactory;
    }

    public static W1 createEmpty() {
        W1 invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        if (invokeSubclassFactory == null) {
            return W1.EMPTY_REGISTRY_LITE;
        }
        return invokeSubclassFactory;
    }

    private static final W1 invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (W1) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(W1 w1) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls != null && cls.isAssignableFrom(w1.getClass())) {
            return true;
        }
        return false;
    }

    public static Class<?> reflectExtensionRegistry() {
        try {
            return Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
