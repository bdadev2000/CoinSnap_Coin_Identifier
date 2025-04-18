package vc;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class c1 extends com.google.gson.c0 {
    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        return new AtomicBoolean(aVar.w());
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.Y(((AtomicBoolean) obj).get());
    }
}
