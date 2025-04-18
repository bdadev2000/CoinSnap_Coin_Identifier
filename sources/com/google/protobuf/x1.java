package com.google.protobuf;

/* loaded from: classes4.dex */
public final class x1 {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    public static a2 create() {
        a2 invokeSubclassFactory = invokeSubclassFactory("newInstance");
        if (invokeSubclassFactory == null) {
            return new a2();
        }
        return invokeSubclassFactory;
    }

    public static a2 createEmpty() {
        a2 invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        if (invokeSubclassFactory == null) {
            return a2.EMPTY_REGISTRY_LITE;
        }
        return invokeSubclassFactory;
    }

    private static final a2 invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (a2) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isFullRegistry(a2 a2Var) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls != null && cls.isAssignableFrom(a2Var.getClass())) {
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
