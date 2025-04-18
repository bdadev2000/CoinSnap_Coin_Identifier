package vc;

/* loaded from: classes3.dex */
public final class a0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return Float.valueOf((float) aVar.x());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            bVar.t();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        bVar.W(number);
    }
}
