package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q2 extends m2 {

    /* renamed from: g, reason: collision with root package name */
    public static final String f24682g = n9.h0.E(1);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24683h = n9.h0.E(2);

    /* renamed from: i, reason: collision with root package name */
    public static final nb.a f24684i = new nb.a(9);

    /* renamed from: d, reason: collision with root package name */
    public final int f24685d;

    /* renamed from: f, reason: collision with root package name */
    public final float f24686f;

    public q2(int i10) {
        v8.u0.e(i10 > 0, "maxStars must be a positive integer");
        this.f24685d = i10;
        this.f24686f = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        q2 q2Var = (q2) obj;
        if (this.f24685d != q2Var.f24685d || this.f24686f != q2Var.f24686f) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24685d), Float.valueOf(this.f24686f)});
    }

    public q2(int i10, float f10) {
        v8.u0.e(i10 > 0, "maxStars must be a positive integer");
        v8.u0.e(f10 >= 0.0f && f10 <= ((float) i10), "starRating is out of range [0, maxStars]");
        this.f24685d = i10;
        this.f24686f = f10;
    }
}
