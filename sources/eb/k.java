package eb;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class k implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f17282h = Logger.getLogger(k.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final Executor f17283b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f17284c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f17285d = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f17286f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final i f17287g = new i(this, 0);

    public k(Executor executor) {
        this.f17283b = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f17284c) {
            int i10 = this.f17285d;
            if (i10 != 4 && i10 != 3) {
                long j3 = this.f17286f;
                i iVar = new i(this, runnable);
                this.f17284c.add(iVar);
                this.f17285d = 2;
                boolean z10 = true;
                try {
                    this.f17283b.execute(this.f17287g);
                    if (this.f17285d == 2) {
                        z10 = false;
                    }
                    if (z10) {
                        return;
                    }
                    synchronized (this.f17284c) {
                        if (this.f17286f == j3 && this.f17285d == 2) {
                            this.f17285d = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f17284c) {
                        int i11 = this.f17285d;
                        if ((i11 != 1 && i11 != 2) || !this.f17284c.removeLastOccurrence(iVar)) {
                            z10 = false;
                        }
                        if (!(e2 instanceof RejectedExecutionException) || z10) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.f17284c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f17283b + "}";
    }
}
