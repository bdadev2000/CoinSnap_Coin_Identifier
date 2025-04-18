package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public class SerialExecutor implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Executor f22198b;
    public volatile Runnable d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f22197a = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Object f22199c = new Object();

    /* loaded from: classes3.dex */
    public static class Task implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final SerialExecutor f22200a;

        /* renamed from: b, reason: collision with root package name */
        public final Runnable f22201b;

        public Task(SerialExecutor serialExecutor, Runnable runnable) {
            this.f22200a = serialExecutor;
            this.f22201b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SerialExecutor serialExecutor = this.f22200a;
            try {
                this.f22201b.run();
            } finally {
                serialExecutor.a();
            }
        }
    }

    public SerialExecutor(ExecutorService executorService) {
        this.f22198b = executorService;
    }

    public final void a() {
        synchronized (this.f22199c) {
            try {
                Runnable runnable = (Runnable) this.f22197a.poll();
                this.d = runnable;
                if (runnable != null) {
                    this.f22198b.execute(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f22199c) {
            try {
                this.f22197a.add(new Task(this, runnable));
                if (this.d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
