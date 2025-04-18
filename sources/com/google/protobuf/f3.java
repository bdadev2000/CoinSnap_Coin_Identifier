package com.google.protobuf;

/* loaded from: classes4.dex */
public final class f3 implements m5 {
    private static final f3 instance = new f3();

    private f3() {
    }

    public static f3 getInstance() {
        return instance;
    }

    @Override // com.google.protobuf.m5
    public boolean isSupported(Class<?> cls) {
        return o3.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.m5
    public l5 messageInfoFor(Class<?> cls) {
        if (o3.class.isAssignableFrom(cls)) {
            try {
                return (l5) o3.getDefaultInstance(cls.asSubclass(o3.class)).buildMessageInfo();
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
