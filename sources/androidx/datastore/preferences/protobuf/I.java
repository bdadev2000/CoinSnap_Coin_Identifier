package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class I implements O {

    /* renamed from: a, reason: collision with root package name */
    public O[] f4514a;

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean isSupported(Class cls) {
        for (O o3 : this.f4514a) {
            if (o3.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final Z messageInfoFor(Class cls) {
        for (O o3 : this.f4514a) {
            if (o3.isSupported(cls)) {
                return o3.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
