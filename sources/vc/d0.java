package vc;

/* loaded from: classes3.dex */
public final class d0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int b02 = aVar.b0();
        if (b02 == 9) {
            aVar.X();
            return null;
        }
        if (b02 == 8) {
            return Boolean.toString(aVar.w());
        }
        return aVar.Z();
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.X((String) obj);
    }
}
