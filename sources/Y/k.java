package y;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k implements f4.c {
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public final j f24274c = new j(this);

    public k(i iVar) {
        this.b = new WeakReference(iVar);
    }

    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        this.f24274c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        i iVar = (i) this.b.get();
        boolean cancel = this.f24274c.cancel(z8);
        if (cancel && iVar != null) {
            iVar.f24270a = null;
            iVar.b = null;
            iVar.f24271c.h(null);
        }
        return cancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f24274c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24274c.b instanceof C2934b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f24274c.isDone();
    }

    public final String toString() {
        return this.f24274c.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        return this.f24274c.get(j7, timeUnit);
    }
}
