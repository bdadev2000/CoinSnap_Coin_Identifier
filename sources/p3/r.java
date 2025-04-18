package p3;

import java.util.List;

/* loaded from: classes.dex */
public final class r extends k {
    public r(List list) {
        super(list);
    }

    @Override // p3.d
    public final Object g(z3.a aVar, float f10) {
        Object obj;
        float floatValue;
        r3.b bVar;
        h.c cVar = this.f23363e;
        Object obj2 = aVar.f28472b;
        if (cVar != null) {
            float f11 = aVar.f28477g;
            Float f12 = aVar.f28478h;
            if (f12 == null) {
                floatValue = Float.MAX_VALUE;
            } else {
                floatValue = f12.floatValue();
            }
            r3.b bVar2 = (r3.b) obj2;
            Object obj3 = aVar.f28473c;
            if (obj3 == null) {
                bVar = bVar2;
            } else {
                bVar = (r3.b) obj3;
            }
            return (r3.b) cVar.A(f11, floatValue, bVar2, bVar, f10, d(), this.f23362d);
        }
        if (f10 == 1.0f && (obj = aVar.f28473c) != null) {
            return (r3.b) obj;
        }
        return (r3.b) obj2;
    }
}
