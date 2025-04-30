package y1;

import android.graphics.PointF;
import java.util.List;
import w4.v0;

/* loaded from: classes.dex */
public final class f extends k {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24296i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i9) {
        super(list);
        this.f24296i = i9;
    }

    @Override // y1.e
    public final Object f(I1.a aVar, float f9) {
        Object obj;
        float floatValue;
        A1.b bVar;
        switch (this.f24296i) {
            case 0:
                return Integer.valueOf(k(aVar, f9));
            case 1:
                return Integer.valueOf(k(aVar, f9));
            default:
                E1.d dVar = this.f24292e;
                Object obj2 = aVar.b;
                if (dVar != null) {
                    Float f10 = aVar.f1414h;
                    if (f10 == null) {
                        floatValue = Float.MAX_VALUE;
                    } else {
                        floatValue = f10.floatValue();
                    }
                    float f11 = floatValue;
                    A1.b bVar2 = (A1.b) obj2;
                    Object obj3 = aVar.f1409c;
                    if (obj3 == null) {
                        bVar = bVar2;
                    } else {
                        bVar = (A1.b) obj3;
                    }
                    return (A1.b) dVar.t(aVar.f1413g, f11, bVar2, bVar, f9, c(), this.f24291d);
                }
                if (f9 == 1.0f && (obj = aVar.f1409c) != null) {
                    return (A1.b) obj;
                }
                return (A1.b) obj2;
        }
    }

    public int k(I1.a aVar, float f9) {
        Float f10;
        switch (this.f24296i) {
            case 0:
                if (aVar.b != null && aVar.f1409c != null) {
                    E1.d dVar = this.f24292e;
                    Object obj = aVar.b;
                    if (dVar != null && (f10 = aVar.f1414h) != null) {
                        Integer num = (Integer) dVar.t(aVar.f1413g, f10.floatValue(), (Integer) obj, (Integer) aVar.f1409c, f9, d(), this.f24291d);
                        if (num != null) {
                            return num.intValue();
                        }
                    }
                    return v0.k(H1.g.b(f9, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) aVar.f1409c).intValue());
                }
                throw new IllegalStateException("Missing values for keyframe.");
            default:
                if (aVar.b != null && aVar.f1409c != null) {
                    E1.d dVar2 = this.f24292e;
                    Object obj2 = aVar.b;
                    if (dVar2 != null) {
                        Integer num2 = (Integer) dVar2.t(aVar.f1413g, aVar.f1414h.floatValue(), (Integer) obj2, (Integer) aVar.f1409c, f9, d(), this.f24291d);
                        if (num2 != null) {
                            return num2.intValue();
                        }
                    }
                    if (aVar.f1417k == 784923401) {
                        aVar.f1417k = ((Integer) obj2).intValue();
                    }
                    int i9 = aVar.f1417k;
                    if (aVar.l == 784923401) {
                        aVar.l = ((Integer) aVar.f1409c).intValue();
                    }
                    int i10 = aVar.l;
                    PointF pointF = H1.g.f1365a;
                    return (int) ((f9 * (i10 - i9)) + i9);
                }
                throw new IllegalStateException("Missing values for keyframe.");
        }
    }
}
