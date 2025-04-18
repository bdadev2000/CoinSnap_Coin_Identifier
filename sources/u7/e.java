package u7;

import androidx.recyclerview.widget.y1;

/* loaded from: classes3.dex */
public final class e implements s7.i {

    /* renamed from: i, reason: collision with root package name */
    public static final e f25551i;

    /* renamed from: b, reason: collision with root package name */
    public final int f25552b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25553c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25554d;

    /* renamed from: f, reason: collision with root package name */
    public final int f25555f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25556g;

    /* renamed from: h, reason: collision with root package name */
    public kc.c f25557h;

    static {
        y1 y1Var = new y1(2);
        f25551i = new e(y1Var.a, y1Var.f2084b, y1Var.f2085c, y1Var.f2086d, y1Var.f2087e);
        n9.h0.E(0);
        n9.h0.E(1);
        n9.h0.E(2);
        n9.h0.E(3);
        n9.h0.E(4);
    }

    public e(int i10, int i11, int i12, int i13, int i14) {
        this.f25552b = i10;
        this.f25553c = i11;
        this.f25554d = i12;
        this.f25555f = i13;
        this.f25556g = i14;
    }

    public final kc.c a() {
        if (this.f25557h == null) {
            this.f25557h = new kc.c(this, 0);
        }
        return this.f25557h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f25552b == eVar.f25552b && this.f25553c == eVar.f25553c && this.f25554d == eVar.f25554d && this.f25555f == eVar.f25555f && this.f25556g == eVar.f25556g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((527 + this.f25552b) * 31) + this.f25553c) * 31) + this.f25554d) * 31) + this.f25555f) * 31) + this.f25556g;
    }
}
