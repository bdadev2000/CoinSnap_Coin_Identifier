package vc;

/* loaded from: classes3.dex */
public final class a1 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        try {
            return Integer.valueOf(aVar.T());
        } catch (NumberFormatException e2) {
            throw new com.google.gson.v(e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        if (((Number) obj) == null) {
            bVar.t();
        } else {
            bVar.U(r4.intValue());
        }
    }
}
