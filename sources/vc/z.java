package vc;

/* loaded from: classes3.dex */
public final class z extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        try {
            return Long.valueOf(aVar.U());
        } catch (NumberFormatException e2) {
            throw new com.google.gson.v(e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.t();
        } else {
            bVar.U(number.longValue());
        }
    }
}
