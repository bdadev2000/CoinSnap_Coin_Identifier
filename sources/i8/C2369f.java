package i8;

/* renamed from: i8.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2369f extends w8.j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2370g f20824c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O5.c f20825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2369f(C2370g c2370g, O5.c cVar, w8.x xVar) {
        super(xVar);
        this.f20824c = c2370g;
        this.f20825d = cVar;
    }

    @Override // w8.j, w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C2370g c2370g = this.f20824c;
        O5.c cVar = this.f20825d;
        synchronized (c2370g) {
            if (cVar.f2198a) {
                return;
            }
            cVar.f2198a = true;
            super.close();
            ((H0.b) this.f20825d.b).b();
        }
    }
}
