package o9;

import n9.h0;

/* loaded from: classes3.dex */
public final class z implements s7.i {

    /* renamed from: g, reason: collision with root package name */
    public static final z f23275g = new z(0, 0, 0, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    public static final String f23276h = h0.E(0);

    /* renamed from: i, reason: collision with root package name */
    public static final String f23277i = h0.E(1);

    /* renamed from: j, reason: collision with root package name */
    public static final String f23278j = h0.E(2);

    /* renamed from: k, reason: collision with root package name */
    public static final String f23279k = h0.E(3);

    /* renamed from: b, reason: collision with root package name */
    public final int f23280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23282d;

    /* renamed from: f, reason: collision with root package name */
    public final float f23283f;

    public z(int i10, int i11, int i12, float f10) {
        this.f23280b = i10;
        this.f23281c = i11;
        this.f23282d = i12;
        this.f23283f = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f23280b == zVar.f23280b && this.f23281c == zVar.f23281c && this.f23282d == zVar.f23282d && this.f23283f == zVar.f23283f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f23283f) + ((((((217 + this.f23280b) * 31) + this.f23281c) * 31) + this.f23282d) * 31);
    }
}
