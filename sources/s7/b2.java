package s7;

/* loaded from: classes3.dex */
public final class b2 implements i {

    /* renamed from: f, reason: collision with root package name */
    public static final b2 f24301f = new b2(1.0f, 1.0f);

    /* renamed from: b, reason: collision with root package name */
    public final float f24302b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24303c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24304d;

    static {
        n9.h0.E(0);
        n9.h0.E(1);
    }

    public b2(float f10, float f11) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        v8.u0.d(z10);
        v8.u0.d(f11 > 0.0f);
        this.f24302b = f10;
        this.f24303c = f11;
        this.f24304d = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b2.class != obj.getClass()) {
            return false;
        }
        b2 b2Var = (b2) obj;
        if (this.f24302b == b2Var.f24302b && this.f24303c == b2Var.f24303c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f24303c) + ((Float.floatToRawIntBits(this.f24302b) + 527) * 31);
    }

    public final String toString() {
        return n9.h0.k("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f24302b), Float.valueOf(this.f24303c));
    }
}
