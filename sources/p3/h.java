package p3;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class h extends k {
    public h(List list) {
        super(list);
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        return Float.valueOf(m(aVar, f10));
    }

    public final float l() {
        return m(b(), d());
    }

    public final float m(z3.a aVar, float f10) {
        Float f11;
        if (aVar.f28472b != null && aVar.f28473c != null) {
            h.c cVar = this.f23363e;
            Object obj = aVar.f28472b;
            if (cVar != null && (f11 = (Float) cVar.A(aVar.f28477g, aVar.f28478h.floatValue(), (Float) obj, (Float) aVar.f28473c, f10, e(), this.f23362d)) != null) {
                return f11.floatValue();
            }
            if (aVar.f28479i == -3987645.8f) {
                aVar.f28479i = ((Float) obj).floatValue();
            }
            float f12 = aVar.f28479i;
            if (aVar.f28480j == -3987645.8f) {
                aVar.f28480j = ((Float) aVar.f28473c).floatValue();
            }
            float f13 = aVar.f28480j;
            PointF pointF = y3.f.a;
            return vd.e.b(f13, f12, f10, f12);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
