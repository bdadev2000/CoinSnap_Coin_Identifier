package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class y1 extends a2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1487b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y1(Unsafe unsafe, int i10) {
        super(unsafe);
        this.f1487b = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final boolean c(Object obj, long j3) {
        switch (this.f1487b) {
            case 0:
                if (b2.f1352g) {
                    if (b2.i(obj, j3) != 0) {
                        return true;
                    }
                } else if (b2.j(obj, j3) != 0) {
                    return true;
                }
                return false;
            default:
                if (b2.f1352g) {
                    if (b2.i(obj, j3) != 0) {
                        return true;
                    }
                } else if (b2.j(obj, j3) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final byte d(Object obj, long j3) {
        switch (this.f1487b) {
            case 0:
                if (b2.f1352g) {
                    return b2.i(obj, j3);
                }
                return b2.j(obj, j3);
            default:
                if (b2.f1352g) {
                    return b2.i(obj, j3);
                }
                return b2.j(obj, j3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final double e(Object obj, long j3) {
        switch (this.f1487b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j3));
            default:
                return Double.longBitsToDouble(h(obj, j3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final float f(Object obj, long j3) {
        switch (this.f1487b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j3));
            default:
                return Float.intBitsToFloat(g(obj, j3));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void k(Object obj, long j3, boolean z10) {
        switch (this.f1487b) {
            case 0:
                if (b2.f1352g) {
                    b2.r(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    b2.s(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (b2.f1352g) {
                    b2.r(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    b2.s(obj, j3, z10 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void l(Object obj, long j3, byte b3) {
        switch (this.f1487b) {
            case 0:
                if (b2.f1352g) {
                    b2.r(obj, j3, b3);
                    return;
                } else {
                    b2.s(obj, j3, b3);
                    return;
                }
            default:
                if (b2.f1352g) {
                    b2.r(obj, j3, b3);
                    return;
                } else {
                    b2.s(obj, j3, b3);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void m(Object obj, long j3, double d10) {
        switch (this.f1487b) {
            case 0:
                p(obj, j3, Double.doubleToLongBits(d10));
                return;
            default:
                p(obj, j3, Double.doubleToLongBits(d10));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final void n(Object obj, long j3, float f10) {
        switch (this.f1487b) {
            case 0:
                o(obj, j3, Float.floatToIntBits(f10));
                return;
            default:
                o(obj, j3, Float.floatToIntBits(f10));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.a2
    public final boolean s() {
        return false;
    }
}
