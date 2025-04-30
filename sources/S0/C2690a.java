package s0;

import G7.j;
import Q7.AbstractC0255x;
import Q7.InterfaceC0253v;
import w7.k;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2690a implements AutoCloseable, InterfaceC0253v {
    public final k b;

    public C2690a(k kVar) {
        j.e(kVar, "coroutineContext");
        this.b = kVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        AbstractC0255x.c(this.b, null);
    }

    @Override // Q7.InterfaceC0253v
    public final k k() {
        return this.b;
    }
}
