package k;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: k.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC2421j implements Executor {
    public final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f21307c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Executor f21308d;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f21309f;

    public ExecutorC2421j(j2.f fVar) {
        this.f21308d = fVar;
    }

    public final void a() {
        synchronized (this.b) {
            try {
                Runnable runnable = (Runnable) this.f21307c.poll();
                this.f21309f = runnable;
                if (runnable != null) {
                    this.f21308d.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.b) {
            try {
                this.f21307c.add(new com.facebook.appevents.k(14, this, runnable));
                if (this.f21309f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
