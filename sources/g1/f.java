package g1;

/* loaded from: classes2.dex */
public final class f implements b1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0.l f30606a;

    public f(h0.l lVar) {
        this.f30606a = lVar;
    }

    @Override // b1.d0
    public final h0.l getCoroutineContext() {
        return this.f30606a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f30606a + ')';
    }
}
