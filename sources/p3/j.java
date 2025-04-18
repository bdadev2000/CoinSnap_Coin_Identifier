package p3;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends k {
    public j(List list) {
        super(list);
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(z3.a aVar, float f10) {
        Integer num;
        if (aVar.f28472b != null && aVar.f28473c != null) {
            h.c cVar = this.f23363e;
            Object obj = aVar.f28472b;
            if (cVar != null && (num = (Integer) cVar.A(aVar.f28477g, aVar.f28478h.floatValue(), (Integer) obj, (Integer) aVar.f28473c, f10, e(), this.f23362d)) != null) {
                return num.intValue();
            }
            if (aVar.f28481k == 784923401) {
                aVar.f28481k = ((Integer) obj).intValue();
            }
            int i10 = aVar.f28481k;
            if (aVar.f28482l == 784923401) {
                aVar.f28482l = ((Integer) aVar.f28473c).intValue();
            }
            int i11 = aVar.f28482l;
            PointF pointF = y3.f.a;
            return (int) ((f10 * (i11 - i10)) + i10);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
