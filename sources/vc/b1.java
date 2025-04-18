package vc;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class b1 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        try {
            return new AtomicInteger(aVar.T());
        } catch (NumberFormatException e2) {
            throw new com.google.gson.v(e2);
        }
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.U(((AtomicInteger) obj).get());
    }
}
