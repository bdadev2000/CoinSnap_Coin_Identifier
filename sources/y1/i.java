package y1;

/* loaded from: classes.dex */
public final class i extends k {
    @Override // y1.e
    public final Object f(I1.a aVar, float f9) {
        return Float.valueOf(l(aVar, f9));
    }

    public final float k() {
        return l(this.f24290c.c(), c());
    }

    public final float l(I1.a aVar, float f9) {
        if (aVar.b != null && aVar.f1409c != null) {
            E1.d dVar = this.f24292e;
            Object obj = aVar.b;
            if (dVar != null) {
                Float f10 = (Float) aVar.f1409c;
                float d2 = d();
                float f11 = this.f24291d;
                Float f12 = (Float) dVar.t(aVar.f1413g, aVar.f1414h.floatValue(), (Float) obj, f10, f9, d2, f11);
                if (f12 != null) {
                    return f12.floatValue();
                }
            }
            if (aVar.f1415i == -3987645.8f) {
                aVar.f1415i = ((Float) obj).floatValue();
            }
            float f13 = aVar.f1415i;
            if (aVar.f1416j == -3987645.8f) {
                aVar.f1416j = ((Float) aVar.f1409c).floatValue();
            }
            return H1.g.e(f13, aVar.f1416j, f9);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}
