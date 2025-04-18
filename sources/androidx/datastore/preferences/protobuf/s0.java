package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class s0 implements z0 {
    public final z0[] a;

    public s0(z0... z0VarArr) {
        this.a = z0VarArr;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final boolean isSupported(Class cls) {
        for (z0 z0Var : this.a) {
            if (z0Var.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.z0
    public final y0 messageInfoFor(Class cls) {
        for (z0 z0Var : this.a) {
            if (z0Var.isSupported(cls)) {
                return z0Var.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
