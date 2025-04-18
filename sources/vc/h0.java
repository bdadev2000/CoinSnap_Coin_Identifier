package vc;

/* loaded from: classes3.dex */
public final class h0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return new StringBuilder(aVar.Z());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String sb2;
        StringBuilder sb3 = (StringBuilder) obj;
        if (sb3 == null) {
            sb2 = null;
        } else {
            sb2 = sb3.toString();
        }
        bVar.X(sb2);
    }
}
