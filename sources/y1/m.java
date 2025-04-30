package y1;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f24308i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f24309j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f24310k;
    public final PathMeasure l;
    public l m;

    public m(List list) {
        super(list);
        this.f24308i = new PointF();
        this.f24309j = new float[2];
        this.f24310k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // y1.e
    public final Object f(I1.a aVar, float f9) {
        l lVar = (l) aVar;
        Path path = lVar.f24306q;
        if (path == null) {
            return (PointF) aVar.b;
        }
        E1.d dVar = this.f24292e;
        if (dVar != null) {
            PointF pointF = (PointF) dVar.t(lVar.f1413g, lVar.f1414h.floatValue(), (PointF) lVar.b, (PointF) lVar.f1409c, d(), f9, this.f24291d);
            if (pointF != null) {
                return pointF;
            }
        }
        l lVar2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (lVar2 != lVar) {
            pathMeasure.setPath(path, false);
            this.m = lVar;
        }
        float length = pathMeasure.getLength();
        float f10 = f9 * length;
        float[] fArr = this.f24309j;
        float[] fArr2 = this.f24310k;
        pathMeasure.getPosTan(f10, fArr, fArr2);
        PointF pointF2 = this.f24308i;
        pointF2.set(fArr[0], fArr[1]);
        if (f10 < 0.0f) {
            pointF2.offset(fArr2[0] * f10, fArr2[1] * f10);
        } else if (f10 > length) {
            float f11 = f10 - length;
            pointF2.offset(fArr2[0] * f11, fArr2[1] * f11);
        }
        return pointF2;
    }
}
