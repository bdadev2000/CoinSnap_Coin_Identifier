package wh;

/* loaded from: classes5.dex */
public final class f extends ki.p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f27053c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f27054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, g gVar, ki.i0 i0Var) {
        super(i0Var);
        this.f27053c = hVar;
        this.f27054d = gVar;
    }

    @Override // ki.p, ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        h hVar = this.f27053c;
        g gVar = this.f27054d;
        synchronized (hVar) {
            if (gVar.f27057d) {
                return;
            }
            gVar.f27057d = true;
            super.close();
            this.f27054d.a.c();
        }
    }
}
