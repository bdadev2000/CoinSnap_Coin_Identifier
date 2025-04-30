package V7;

import Q7.InterfaceC0253v;

/* loaded from: classes3.dex */
public final class e implements InterfaceC0253v {
    public final w7.k b;

    public e(w7.k kVar) {
        this.b = kVar;
    }

    @Override // Q7.InterfaceC0253v
    public final w7.k k() {
        return this.b;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.b + ')';
    }
}
