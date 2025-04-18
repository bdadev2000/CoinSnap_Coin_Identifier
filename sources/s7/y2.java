package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y2 implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final String f24881h = n9.h0.E(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f24882i = n9.h0.E(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24883j = n9.h0.E(3);

    /* renamed from: k, reason: collision with root package name */
    public static final String f24884k = n9.h0.E(4);

    /* renamed from: b, reason: collision with root package name */
    public final int f24885b;

    /* renamed from: c, reason: collision with root package name */
    public final v8.i1 f24886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24887d;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f24888f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f24889g;

    static {
        new nb.a(15);
    }

    public y2(v8.i1 i1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = i1Var.f26163b;
        this.f24885b = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8.u0.d(z11);
        this.f24886c = i1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f24887d = z12;
        this.f24888f = (int[]) iArr.clone();
        this.f24889g = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y2.class != obj.getClass()) {
            return false;
        }
        y2 y2Var = (y2) obj;
        if (this.f24887d == y2Var.f24887d && this.f24886c.equals(y2Var.f24886c) && Arrays.equals(this.f24888f, y2Var.f24888f) && Arrays.equals(this.f24889g, y2Var.f24889g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24889g) + ((Arrays.hashCode(this.f24888f) + (((this.f24886c.hashCode() * 31) + (this.f24887d ? 1 : 0)) * 31)) * 31);
    }
}
