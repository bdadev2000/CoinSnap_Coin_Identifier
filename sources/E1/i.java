package e1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f20037c;

    /* renamed from: f, reason: collision with root package name */
    public volatile Runnable f20039f;
    public final ArrayDeque b = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f20038d = new Object();

    public i(ExecutorService executorService) {
        this.f20037c = executorService;
    }

    public final void a() {
        synchronized (this.f20038d) {
            try {
                Runnable runnable = (Runnable) this.b.poll();
                this.f20039f = runnable;
                if (runnable != null) {
                    this.f20037c.execute(this.f20039f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f20038d) {
            try {
                this.b.add(new f4.b(17, this, runnable));
                if (this.f20039f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
