package vc;

import java.util.Currency;

/* loaded from: classes3.dex */
public final class o0 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        String Z = aVar.Z();
        try {
            return Currency.getInstance(Z);
        } catch (IllegalArgumentException e2) {
            StringBuilder o10 = a4.j.o("Failed parsing '", Z, "' as Currency; at path ");
            o10.append(aVar.s(true));
            throw new com.google.gson.v(o10.toString(), e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.X(((Currency) obj).getCurrencyCode());
    }
}
