package vc;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class f0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        if (aVar.b0() == 9) {
            aVar.X();
            return null;
        }
        String Z = aVar.Z();
        try {
            com.facebook.appevents.g.c(Z);
            return new BigInteger(Z);
        } catch (NumberFormatException e2) {
            StringBuilder o10 = a4.j.o("Failed parsing '", Z, "' as BigInteger; at path ");
            o10.append(aVar.s(true));
            throw new com.google.gson.v(o10.toString(), e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.W((BigInteger) obj);
    }
}
