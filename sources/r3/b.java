package r3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class b {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f23971b;

    /* renamed from: c, reason: collision with root package name */
    public float f23972c;

    /* renamed from: d, reason: collision with root package name */
    public int f23973d;

    /* renamed from: e, reason: collision with root package name */
    public int f23974e;

    /* renamed from: f, reason: collision with root package name */
    public float f23975f;

    /* renamed from: g, reason: collision with root package name */
    public float f23976g;

    /* renamed from: h, reason: collision with root package name */
    public int f23977h;

    /* renamed from: i, reason: collision with root package name */
    public int f23978i;

    /* renamed from: j, reason: collision with root package name */
    public float f23979j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23980k;

    /* renamed from: l, reason: collision with root package name */
    public PointF f23981l;

    /* renamed from: m, reason: collision with root package name */
    public PointF f23982m;

    public b(String str, String str2, float f10, int i10, int i11, float f11, float f12, int i12, int i13, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.a = str;
        this.f23971b = str2;
        this.f23972c = f10;
        this.f23973d = i10;
        this.f23974e = i11;
        this.f23975f = f11;
        this.f23976g = f12;
        this.f23977h = i12;
        this.f23978i = i13;
        this.f23979j = f13;
        this.f23980k = z10;
        this.f23981l = pointF;
        this.f23982m = pointF2;
    }

    public final int hashCode() {
        int b3 = ((t.h.b(this.f23973d) + (((int) (vd.e.c(this.f23971b, this.a.hashCode() * 31, 31) + this.f23972c)) * 31)) * 31) + this.f23974e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f23975f);
        return (((b3 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f23977h;
    }

    public b() {
    }
}
