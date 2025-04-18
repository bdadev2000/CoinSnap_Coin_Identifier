package p3;

import android.graphics.Path;
import android.graphics.PointF;

/* loaded from: classes.dex */
public final class m extends z3.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f23378q;

    /* renamed from: r, reason: collision with root package name */
    public final z3.a f23379r;

    public m(m3.j jVar, z3.a aVar) {
        super(jVar, (PointF) aVar.f28472b, (PointF) aVar.f28473c, aVar.f28474d, aVar.f28475e, aVar.f28476f, aVar.f28477g, aVar.f28478h);
        this.f23379r = aVar;
        d();
    }

    public final void d() {
        boolean z10;
        Object obj;
        Object obj2 = this.f28473c;
        Object obj3 = this.f28472b;
        if (obj2 != null && obj3 != null && ((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (obj3 != null && (obj = this.f28473c) != null && !z10) {
            PointF pointF = (PointF) obj3;
            PointF pointF2 = (PointF) obj;
            z3.a aVar = this.f23379r;
            PointF pointF3 = aVar.f28485o;
            PointF pointF4 = aVar.f28486p;
            y3.g gVar = y3.h.a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
                float f10 = pointF3.x + pointF.x;
                float f11 = pointF.y + pointF3.y;
                float f12 = pointF2.x;
                float f13 = f12 + pointF4.x;
                float f14 = pointF2.y;
                path.cubicTo(f10, f11, f13, f14 + pointF4.y, f12, f14);
            } else {
                path.lineTo(pointF2.x, pointF2.y);
            }
            this.f23378q = path;
        }
    }
}
