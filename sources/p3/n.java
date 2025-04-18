package p3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends k {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f23380i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f23381j;

    /* renamed from: k, reason: collision with root package name */
    public final PathMeasure f23382k;

    /* renamed from: l, reason: collision with root package name */
    public m f23383l;

    public n(List list) {
        super(list);
        this.f23380i = new PointF();
        this.f23381j = new float[2];
        this.f23382k = new PathMeasure();
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        PointF pointF;
        m mVar = (m) aVar;
        Path path = mVar.f23378q;
        if (path == null) {
            return (PointF) aVar.f28472b;
        }
        h.c cVar = this.f23363e;
        if (cVar == null || (pointF = (PointF) cVar.A(mVar.f28477g, mVar.f28478h.floatValue(), (PointF) mVar.f28472b, (PointF) mVar.f28473c, e(), f10, this.f23362d)) == null) {
            m mVar2 = this.f23383l;
            PathMeasure pathMeasure = this.f23382k;
            if (mVar2 != mVar) {
                pathMeasure.setPath(path, false);
                this.f23383l = mVar;
            }
            float length = pathMeasure.getLength() * f10;
            float[] fArr = this.f23381j;
            pathMeasure.getPosTan(length, fArr, null);
            PointF pointF2 = this.f23380i;
            pointF2.set(fArr[0], fArr[1]);
            return pointF2;
        }
        return pointF;
    }
}
