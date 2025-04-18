package s7;

/* loaded from: classes3.dex */
public final class n1 {
    public final v8.z a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24599b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24600c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24601d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24602e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24603f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24604g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f24605h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f24606i;

    public n1(v8.z zVar, long j3, long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        boolean z15;
        boolean z16 = false;
        if (z13 && !z11) {
            z14 = false;
        } else {
            z14 = true;
        }
        v8.u0.d(z14);
        if (z12 && !z11) {
            z15 = false;
        } else {
            z15 = true;
        }
        v8.u0.d(z15);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z16 = true;
        }
        v8.u0.d(z16);
        this.a = zVar;
        this.f24599b = j3;
        this.f24600c = j10;
        this.f24601d = j11;
        this.f24602e = j12;
        this.f24603f = z10;
        this.f24604g = z11;
        this.f24605h = z12;
        this.f24606i = z13;
    }

    public final n1 a(long j3) {
        if (j3 == this.f24600c) {
            return this;
        }
        return new n1(this.a, this.f24599b, j3, this.f24601d, this.f24602e, this.f24603f, this.f24604g, this.f24605h, this.f24606i);
    }

    public final n1 b(long j3) {
        if (j3 == this.f24599b) {
            return this;
        }
        return new n1(this.a, j3, this.f24600c, this.f24601d, this.f24602e, this.f24603f, this.f24604g, this.f24605h, this.f24606i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n1.class != obj.getClass()) {
            return false;
        }
        n1 n1Var = (n1) obj;
        if (this.f24599b == n1Var.f24599b && this.f24600c == n1Var.f24600c && this.f24601d == n1Var.f24601d && this.f24602e == n1Var.f24602e && this.f24603f == n1Var.f24603f && this.f24604g == n1Var.f24604g && this.f24605h == n1Var.f24605h && this.f24606i == n1Var.f24606i && n9.h0.a(this.a, n1Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.f24599b)) * 31) + ((int) this.f24600c)) * 31) + ((int) this.f24601d)) * 31) + ((int) this.f24602e)) * 31) + (this.f24603f ? 1 : 0)) * 31) + (this.f24604g ? 1 : 0)) * 31) + (this.f24605h ? 1 : 0)) * 31) + (this.f24606i ? 1 : 0);
    }
}
