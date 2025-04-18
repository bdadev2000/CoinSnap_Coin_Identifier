package v2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class i implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f25987c;

    /* renamed from: f, reason: collision with root package name */
    public volatile Runnable f25989f;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f25986b = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Object f25988d = new Object();

    public i(ExecutorService executorService) {
        this.f25987c = executorService;
    }

    public final void a() {
        synchronized (this.f25988d) {
            Runnable runnable = (Runnable) this.f25986b.poll();
            this.f25989f = runnable;
            if (runnable != null) {
                this.f25987c.execute(this.f25989f);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f25988d) {
            this.f25986b.add(new androidx.appcompat.widget.j(this, runnable, 6));
            if (this.f25989f == null) {
                a();
            }
        }
    }
}
