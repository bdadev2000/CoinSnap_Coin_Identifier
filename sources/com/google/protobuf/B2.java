package com.google.protobuf;

/* loaded from: classes3.dex */
public final class B2 implements L3 {
    private static final B2 instance = new B2();

    private B2() {
    }

    public static B2 getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.L3
    public boolean isSupported(Class<?> cls) {
        return L2.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.L3
    public K3 messageInfoFor(Class<?> cls) {
        if (L2.class.isAssignableFrom(cls)) {
            try {
                return (K3) L2.getDefaultInstance(cls.asSubclass(L2.class)).buildMessageInfo();
            } catch (Exception e4) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
