package y1;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class l extends I1.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f24306q;

    /* renamed from: r, reason: collision with root package name */
    public final I1.a f24307r;

    public l(v1.i iVar, I1.a aVar) {
        super(iVar, (PointF) aVar.b, (PointF) aVar.f1409c, aVar.f1410d, aVar.f1411e, aVar.f1412f, aVar.f1413g, aVar.f1414h);
        this.f24307r = aVar;
        d();
    }

    public final void d() {
        boolean z8;
        Object obj;
        Object obj2 = this.f1409c;
        Object obj3 = this.b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (obj3 != null && (obj = this.f1409c) != null && !z8) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            I1.a aVar = this.f24307r;
            PointF pointF3 = aVar.f1419o;
            PointF pointF4 = aVar.f1420p;
            H1.h hVar = H1.i.f1367a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f9 = pointF3.x + pointF.x;
                float f10 = pointF.y + pointF3.y;
                float f11 = pointF2.x;
                float f12 = f11 + pointF4.x;
                float f13 = pointF2.y;
                path.cubicTo(f9, f10, f12, f13 + pointF4.y, f11, f13);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f24306q = path;
        }
    }
}
