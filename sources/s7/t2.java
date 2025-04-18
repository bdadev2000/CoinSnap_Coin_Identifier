package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class t2 extends m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f24763g = n9.h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24764h = n9.h0.E(2);

    /* renamed from: i, reason: collision with root package name */
    public static final nb.a f24765i = new nb.a(10);

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24766d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24767f;

    public t2() {
        this.f24766d = false;
        this.f24767f = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj;
        if (this.f24767f != t2Var.f24767f || this.f24766d != t2Var.f24766d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f24766d), Boolean.valueOf(this.f24767f)});
    }

    public t2(boolean z10) {
        this.f24766d = true;
        this.f24767f = z10;
    }
}
