package s;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements ua.b {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f24150b;

    /* renamed from: c, reason: collision with root package name */
    public final k f24151c = new k(this);

    public l(j jVar) {
        this.f24150b = new WeakReference(jVar);
    }

    @Override // ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        this.f24151c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        j jVar = (j) this.f24150b.get();
        boolean cancel = this.f24151c.cancel(z10);
        if (cancel && jVar != null) {
            jVar.a = null;
            jVar.f24146b = null;
            jVar.f24147c.h(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24151c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24151c.f24143b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24151c.isDone();
    }

    public final String toString() {
        return this.f24151c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        return this.f24151c.get(j3, timeUnit);
    }
}
