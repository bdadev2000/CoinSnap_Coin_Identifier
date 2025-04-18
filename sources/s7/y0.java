package s7;

/* loaded from: classes3.dex */
public abstract class y0 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final z0 f24866h = new z0(new x0());

    /* renamed from: i, reason: collision with root package name */
    public static final String f24867i = n9.h0.E(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24868j = n9.h0.E(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24869k = n9.h0.E(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24870l = n9.h0.E(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24871m = n9.h0.E(4);

    /* renamed from: n, reason: collision with root package name */
    public static final com.facebook.appevents.m f24872n = new com.facebook.appevents.m(25);

    /* renamed from: b, reason: collision with root package name */
    public final long f24873b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24874c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24875d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24876f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24877g;

    public y0(x0 x0Var) {
        this.f24873b = x0Var.a;
        this.f24874c = x0Var.f24858b;
        this.f24875d = x0Var.f24859c;
        this.f24876f = x0Var.f24860d;
        this.f24877g = x0Var.f24861e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f24873b == y0Var.f24873b && this.f24874c == y0Var.f24874c && this.f24875d == y0Var.f24875d && this.f24876f == y0Var.f24876f && this.f24877g == y0Var.f24877g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f24873b;
        int i10 = ((int) (j3 ^ (j3 >>> 32))) * 31;
        long j10 = this.f24874c;
        return ((((((i10 + ((int) ((j10 >>> 32) ^ j10))) * 31) + (this.f24875d ? 1 : 0)) * 31) + (this.f24876f ? 1 : 0)) * 31) + (this.f24877g ? 1 : 0);
    }
}
