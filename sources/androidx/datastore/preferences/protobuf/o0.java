package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class o0 extends q0 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o0(Unsafe unsafe, int i9) {
        super(unsafe);
        this.b = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final boolean c(Object obj, long j7) {
        switch (this.b) {
            case 0:
                if (r0.f4604h) {
                    if (r0.g(obj, j7) == 0) {
                        return false;
                    }
                } else if (r0.h(obj, j7) == 0) {
                    return false;
                }
                return true;
            default:
                if (r0.f4604h) {
                    if (r0.g(obj, j7) == 0) {
                        return false;
                    }
                } else if (r0.h(obj, j7) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final byte d(Object obj, long j7) {
        switch (this.b) {
            case 0:
                if (r0.f4604h) {
                    return r0.g(obj, j7);
                }
                return r0.h(obj, j7);
            default:
                if (r0.f4604h) {
                    return r0.g(obj, j7);
                }
                return r0.h(obj, j7);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final double e(Object obj, long j7) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(h(obj, j7));
            default:
                return Double.longBitsToDouble(h(obj, j7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final float f(Object obj, long j7) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(g(obj, j7));
            default:
                return Float.intBitsToFloat(g(obj, j7));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void k(Object obj, long j7, boolean z8) {
        switch (this.b) {
            case 0:
                if (r0.f4604h) {
                    r0.n(obj, j7, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    r0.o(obj, j7, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (r0.f4604h) {
                    r0.n(obj, j7, z8 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    r0.o(obj, j7, z8 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void l(Object obj, long j7, byte b) {
        switch (this.b) {
            case 0:
                if (r0.f4604h) {
                    r0.n(obj, j7, b);
                    return;
                } else {
                    r0.o(obj, j7, b);
                    return;
                }
            default:
                if (r0.f4604h) {
                    r0.n(obj, j7, b);
                    return;
                } else {
                    r0.o(obj, j7, b);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void m(Object obj, long j7, double d2) {
        switch (this.b) {
            case 0:
                p(obj, j7, Double.doubleToLongBits(d2));
                return;
            default:
                p(obj, j7, Double.doubleToLongBits(d2));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public final void n(Object obj, long j7, float f9) {
        switch (this.b) {
            case 0:
                o(obj, j7, Float.floatToIntBits(f9));
                return;
            default:
                o(obj, j7, Float.floatToIntBits(f9));
                return;
        }
    }
}
