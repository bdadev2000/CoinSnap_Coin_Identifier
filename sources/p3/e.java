package p3;

import java.util.List;

/* loaded from: classes.dex */
public final class e extends k {
    public e(List list) {
        super(list);
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        return Integer.valueOf(l(aVar, f10));
    }

    public final int l(z3.a aVar, float f10) {
        Float f11;
        Integer num;
        if (aVar.f28472b != null && aVar.f28473c != null) {
            h.c cVar = this.f23363e;
            Object obj = aVar.f28472b;
            if (cVar != null && (f11 = aVar.f28478h) != null && (num = (Integer) cVar.A(aVar.f28477g, f11.floatValue(), (Integer) obj, (Integer) aVar.f28473c, f10, e(), this.f23362d)) != null) {
                return num.intValue();
            }
            return d6.g.n(y3.f.b(f10, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) aVar.f28473c).intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
