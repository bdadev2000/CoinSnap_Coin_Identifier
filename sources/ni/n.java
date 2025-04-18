package ni;

import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class n implements c {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22823b;

    /* renamed from: c, reason: collision with root package name */
    public final c f22824c;

    public n(Executor executor, c cVar) {
        this.f22823b = executor;
        this.f22824c = cVar;
    }

    @Override // ni.c
    public final void cancel() {
        this.f22824c.cancel();
    }

    @Override // ni.c
    public final void enqueue(f fVar) {
        this.f22824c.enqueue(new g(2, this, fVar));
    }

    @Override // ni.c
    public final boolean isCanceled() {
        return this.f22824c.isCanceled();
    }

    @Override // ni.c
    public final wh.o0 request() {
        return this.f22824c.request();
    }

    @Override // ni.c
    public final c clone() {
        return new n(this.f22823b, this.f22824c.clone());
    }
}
