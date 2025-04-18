package vc;

/* loaded from: classes3.dex */
public final class b0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return Double.valueOf(aVar.x());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.t();
        } else {
            bVar.T(number.doubleValue());
        }
    }
}
