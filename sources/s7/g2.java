package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class g2 implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Object f24376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24377c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f24378d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f24379f;

    /* renamed from: g, reason: collision with root package name */
    public final int f24380g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24381h;

    /* renamed from: i, reason: collision with root package name */
    public final long f24382i;

    /* renamed from: j, reason: collision with root package name */
    public final int f24383j;

    /* renamed from: k, reason: collision with root package name */
    public final int f24384k;

    static {
        n9.h0.E(0);
        n9.h0.E(1);
        n9.h0.E(2);
        n9.h0.E(3);
        n9.h0.E(4);
        n9.h0.E(5);
        n9.h0.E(6);
    }

    public g2(Object obj, int i10, j1 j1Var, Object obj2, int i11, long j3, long j10, int i12, int i13) {
        this.f24376b = obj;
        this.f24377c = i10;
        this.f24378d = j1Var;
        this.f24379f = obj2;
        this.f24380g = i11;
        this.f24381h = j3;
        this.f24382i = j10;
        this.f24383j = i12;
        this.f24384k = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g2.class != obj.getClass()) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (this.f24377c == g2Var.f24377c && this.f24380g == g2Var.f24380g && this.f24381h == g2Var.f24381h && this.f24382i == g2Var.f24382i && this.f24383j == g2Var.f24383j && this.f24384k == g2Var.f24384k && v8.u0.t(this.f24376b, g2Var.f24376b) && v8.u0.t(this.f24379f, g2Var.f24379f) && v8.u0.t(this.f24378d, g2Var.f24378d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24376b, Integer.valueOf(this.f24377c), this.f24378d, this.f24379f, Integer.valueOf(this.f24380g), Long.valueOf(this.f24381h), Long.valueOf(this.f24382i), Integer.valueOf(this.f24383j), Integer.valueOf(this.f24384k)});
    }
}
