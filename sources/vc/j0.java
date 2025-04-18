package vc;

/* loaded from: classes3.dex */
public final class j0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        return new StringBuffer(aVar.Z());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        String stringBuffer;
        StringBuffer stringBuffer2 = (StringBuffer) obj;
        if (stringBuffer2 == null) {
            stringBuffer = null;
        } else {
            stringBuffer = stringBuffer2.toString();
        }
        bVar.X(stringBuffer);
    }
}
