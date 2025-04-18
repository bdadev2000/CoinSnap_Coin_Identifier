package wh;

/* loaded from: classes5.dex */
public final class c extends ki.q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f27027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ki.k0 k0Var, d dVar) {
        super(k0Var);
        this.f27027b = dVar;
    }

    @Override // ki.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27027b.f27028b.close();
        super.close();
    }
}
