package p4;

import P1.RunnableC0227a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class k implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f22238h = Logger.getLogger(k.class.getName());
    public final Executor b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f22239c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public int f22240d = 1;

    /* renamed from: f, reason: collision with root package name */
    public long f22241f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final f4.b f22242g = new f4.b(this);

    public k(Executor executor) {
        this.b = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f22239c) {
            int i9 = this.f22240d;
            if (i9 != 4 && i9 != 3) {
                long j7 = this.f22241f;
                RunnableC0227a runnableC0227a = new RunnableC0227a(runnable, 2);
                this.f22239c.add(runnableC0227a);
                this.f22240d = 2;
                try {
                    this.b.execute(this.f22242g);
                    if (this.f22240d != 2) {
                        return;
                    }
                    synchronized (this.f22239c) {
                        try {
                            if (this.f22241f == j7 && this.f22240d == 2) {
                                this.f22240d = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e4) {
                    synchronized (this.f22239c) {
                        try {
                            int i10 = this.f22240d;
                            boolean z8 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f22239c.removeLastOccurrence(runnableC0227a)) {
                                z8 = false;
                            }
                            if (!(e4 instanceof RejectedExecutionException) || z8) {
                                throw e4;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f22239c.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.b + "}";
    }
}
