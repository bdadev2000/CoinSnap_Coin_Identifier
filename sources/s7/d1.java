package s7;

/* loaded from: classes3.dex */
public final class d1 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final d1 f24312h = new c1().a();

    /* renamed from: i, reason: collision with root package name */
    public static final String f24313i = n9.h0.E(0);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24314j = n9.h0.E(1);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24315k = n9.h0.E(2);

    /* renamed from: l, reason: collision with root package name */
    public static final String f24316l = n9.h0.E(3);

    /* renamed from: m, reason: collision with root package name */
    public static final String f24317m = n9.h0.E(4);

    /* renamed from: n, reason: collision with root package name */
    public static final com.facebook.appevents.m f24318n = new com.facebook.appevents.m(27);

    /* renamed from: b, reason: collision with root package name */
    public final long f24319b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24320c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24321d;

    /* renamed from: f, reason: collision with root package name */
    public final float f24322f;

    /* renamed from: g, reason: collision with root package name */
    public final float f24323g;

    public d1(long j3, long j10, long j11, float f10, float f11) {
        this.f24319b = j3;
        this.f24320c = j10;
        this.f24321d = j11;
        this.f24322f = f10;
        this.f24323g = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        if (this.f24319b == d1Var.f24319b && this.f24320c == d1Var.f24320c && this.f24321d == d1Var.f24321d && this.f24322f == d1Var.f24322f && this.f24323g == d1Var.f24323g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        long j3 = this.f24319b;
        long j10 = this.f24320c;
        int i11 = ((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f24321d;
        int i12 = (i11 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.f24322f;
        int i13 = 0;
        if (f10 != 0.0f) {
            i10 = Float.floatToIntBits(f10);
        } else {
            i10 = 0;
        }
        int i14 = (i12 + i10) * 31;
        float f11 = this.f24323g;
        if (f11 != 0.0f) {
            i13 = Float.floatToIntBits(f11);
        }
        return i14 + i13;
    }
}
