package A1;

import android.graphics.PointF;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f4a;
    public String b;

    /* renamed from: c, reason: collision with root package name */
    public float f5c;

    /* renamed from: d, reason: collision with root package name */
    public int f6d;

    /* renamed from: e, reason: collision with root package name */
    public int f7e;

    /* renamed from: f, reason: collision with root package name */
    public float f8f;

    /* renamed from: g, reason: collision with root package name */
    public float f9g;

    /* renamed from: h, reason: collision with root package name */
    public int f10h;

    /* renamed from: i, reason: collision with root package name */
    public int f11i;

    /* renamed from: j, reason: collision with root package name */
    public float f12j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13k;
    public PointF l;
    public PointF m;

    public final int hashCode() {
        int d2 = ((AbstractC2965e.d(this.f6d) + (((int) (AbstractC2914a.b(this.f4a.hashCode() * 31, 31, this.b) + this.f5c)) * 31)) * 31) + this.f7e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f8f);
        return (((d2 * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f10h;
    }
}
