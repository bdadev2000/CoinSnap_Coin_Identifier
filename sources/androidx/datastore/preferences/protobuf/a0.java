package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class a0 implements z0 {
    public static final a0 a = new a0();

    @Override // androidx.datastore.preferences.protobuf.z0
    public final boolean isSupported(Class cls) {
        return e0.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final y0 messageInfoFor(Class cls) {
        if (e0.class.isAssignableFrom(cls)) {
            try {
                return (y0) e0.g(cls.asSubclass(e0.class)).e(d0.BUILD_MESSAGE_INFO);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}
