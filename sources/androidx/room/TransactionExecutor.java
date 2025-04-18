package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class TransactionExecutor implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f21393a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f21394b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f21395c;
    public final Object d;

    public TransactionExecutor(Executor executor) {
        p0.a.s(executor, "executor");
        this.f21393a = executor;
        this.f21394b = new ArrayDeque();
        this.d = new Object();
    }

    public final void a() {
        synchronized (this.d) {
            Object poll = this.f21394b.poll();
            Runnable runnable = (Runnable) poll;
            this.f21395c = runnable;
            if (poll != null) {
                this.f21393a.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        p0.a.s(runnable, "command");
        synchronized (this.d) {
            this.f21394b.offer(new androidx.core.content.res.a(6, runnable, this));
            if (this.f21395c == null) {
                a();
            }
        }
    }
}
