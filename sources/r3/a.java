package r3;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {
    public final PointF a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f23969b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f23970c;

    public a() {
        this.a = new PointF();
        this.f23969b = new PointF();
        this.f23970c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f23970c;
        PointF pointF2 = this.a;
        PointF pointF3 = this.f23969b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(pointF.x), Float.valueOf(pointF.y), Float.valueOf(pointF2.x), Float.valueOf(pointF2.y), Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.a = pointF;
        this.f23969b = pointF2;
        this.f23970c = pointF3;
    }
}
