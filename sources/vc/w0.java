package vc;

/* loaded from: classes3.dex */
public final class w0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int b02 = aVar.b0();
        if (b02 == 9) {
            aVar.X();
            return null;
        }
        if (b02 == 6) {
            return Boolean.valueOf(Boolean.parseBoolean(aVar.Z()));
        }
        return Boolean.valueOf(aVar.w());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.V((Boolean) obj);
    }
}
