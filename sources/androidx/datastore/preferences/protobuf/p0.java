package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class p0 extends q0 {
    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean c(Object obj, long j7) {
        return this.f4597a.getBoolean(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final byte d(Object obj, long j7) {
        return this.f4597a.getByte(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final double e(Object obj, long j7) {
        return this.f4597a.getDouble(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final float f(Object obj, long j7) {
        return this.f4597a.getFloat(obj, j7);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void k(Object obj, long j7, boolean z8) {
        this.f4597a.putBoolean(obj, j7, z8);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void l(Object obj, long j7, byte b) {
        this.f4597a.putByte(obj, j7, b);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void m(Object obj, long j7, double d2) {
        this.f4597a.putDouble(obj, j7, d2);
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void n(Object obj, long j7, float f9) {
        this.f4597a.putFloat(obj, j7, f9);
    }
}
