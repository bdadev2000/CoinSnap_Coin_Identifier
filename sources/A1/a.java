package A1;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f2a;
    public final PointF b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f3c;

    public a() {
        this.f2a = new PointF();
        this.b = new PointF();
        this.f3c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f3c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f2a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2a = pointF;
        this.b = pointF2;
        this.f3c = pointF3;
    }
}
