package s7;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class y1 extends m2 {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24878f = n9.h0.E(1);

    /* renamed from: g, reason: collision with root package name */
    public static final nb.a f24879g = new nb.a(3);

    /* renamed from: d, reason: collision with root package name */
    public final float f24880d;

    public y1() {
        this.f24880d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y1)) {
            return false;
        }
        if (this.f24880d != ((y1) obj).f24880d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24880d)});
    }

    public y1(float f10) {
        v8.u0.e(f10 >= 0.0f && f10 <= 100.0f, "percent must be in the range of [0, 100]");
        this.f24880d = f10;
    }
}
