package f1;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import x0.AbstractC2914a;
import y2.AbstractC2947c;

/* renamed from: f1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2260i implements f4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f20260f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f20261g = Logger.getLogger(AbstractC2260i.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final AbstractC2947c f20262h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f20263i;
    public volatile Object b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C2255d f20264c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C2259h f20265d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [y2.c] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new C2256e(AtomicReferenceFieldUpdater.newUpdater(C2259h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2259h.class, C2259h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(AbstractC2260i.class, C2259h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2260i.class, C2255d.class, com.mbridge.msdk.foundation.controller.a.f15376a), AtomicReferenceFieldUpdater.newUpdater(AbstractC2260i.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f20262h = r32;
        if (th != null) {
            f20261g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f20263i = new Object();
    }

    public static void b(AbstractC2260i abstractC2260i) {
        C2255d c2255d;
        C2255d c2255d2;
        C2255d c2255d3 = null;
        while (true) {
            C2259h c2259h = abstractC2260i.f20265d;
            if (f20262h.g(abstractC2260i, c2259h, C2259h.f20258c)) {
                while (c2259h != null) {
                    Thread thread = c2259h.f20259a;
                    if (thread != null) {
                        c2259h.f20259a = null;
                        LockSupport.unpark(thread);
                    }
                    c2259h = c2259h.b;
                }
                do {
                    c2255d = abstractC2260i.f20264c;
                } while (!f20262h.e(abstractC2260i, c2255d, C2255d.f20250d));
                while (true) {
                    c2255d2 = c2255d3;
                    c2255d3 = c2255d;
                    if (c2255d3 == null) {
                        break;
                    }
                    c2255d = c2255d3.f20252c;
                    c2255d3.f20252c = c2255d2;
                }
                while (c2255d2 != null) {
                    c2255d3 = c2255d2.f20252c;
                    Runnable runnable = c2255d2.f20251a;
                    if (runnable instanceof RunnableC2257f) {
                        RunnableC2257f runnableC2257f = (RunnableC2257f) runnable;
                        abstractC2260i = runnableC2257f.b;
                        if (abstractC2260i.b == runnableC2257f) {
                            if (f20262h.f(abstractC2260i, runnableC2257f, e(runnableC2257f.f20257c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, c2255d2.b);
                    }
                    c2255d2 = c2255d3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f20261g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object d(Object obj) {
        if (!(obj instanceof C2252a)) {
            if (!(obj instanceof C2254c)) {
                if (obj == f20263i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C2254c) obj).f20249a);
        }
        Throwable th = ((C2252a) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object e(f4.c cVar) {
        if (cVar instanceof AbstractC2260i) {
            Object obj = ((AbstractC2260i) cVar).b;
            if (obj instanceof C2252a) {
                C2252a c2252a = (C2252a) obj;
                if (c2252a.f20248a) {
                    if (c2252a.b != null) {
                        return new C2252a(false, (CancellationException) c2252a.b);
                    }
                    return C2252a.f20247d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f20260f) & isCancelled) {
            return C2252a.f20247d;
        }
        try {
            Object f9 = f(cVar);
            if (f9 == null) {
                return f20263i;
            }
            return f9;
        } catch (CancellationException e4) {
            if (!isCancelled) {
                return new C2254c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e4));
            }
            return new C2252a(false, e4);
        } catch (ExecutionException e9) {
            return new C2254c(e9.getCause());
        } catch (Throwable th) {
            return new C2254c(th);
        }
    }

    public static Object f(Future future) {
        Object obj;
        boolean z8 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z8 = true;
            } catch (Throwable th) {
                if (z8) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z8) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object f9 = f(this);
            sb.append("SUCCESS, result=[");
            if (f9 == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(f9);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e9) {
            sb.append("FAILURE, cause=[");
            sb.append(e9.getCause());
            sb.append("]");
        }
    }

    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C2255d c2255d = this.f20264c;
        C2255d c2255d2 = C2255d.f20250d;
        if (c2255d != c2255d2) {
            C2255d c2255d3 = new C2255d(runnable, executor);
            do {
                c2255d3.f20252c = c2255d;
                if (f20262h.e(this, c2255d, c2255d3)) {
                    return;
                } else {
                    c2255d = this.f20264c;
                }
            } while (c2255d != c2255d2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        boolean z9;
        C2252a c2252a;
        boolean z10;
        Object obj = this.b;
        if (obj == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!(z9 | (obj instanceof RunnableC2257f))) {
            return false;
        }
        if (f20260f) {
            c2252a = new C2252a(z8, new CancellationException("Future.cancel() was called."));
        } else if (z8) {
            c2252a = C2252a.f20246c;
        } else {
            c2252a = C2252a.f20247d;
        }
        AbstractC2260i abstractC2260i = this;
        boolean z11 = false;
        while (true) {
            if (f20262h.f(abstractC2260i, obj, c2252a)) {
                b(abstractC2260i);
                if (!(obj instanceof RunnableC2257f)) {
                    return true;
                }
                f4.c cVar = ((RunnableC2257f) obj).f20257c;
                if (cVar instanceof AbstractC2260i) {
                    abstractC2260i = (AbstractC2260i) cVar;
                    obj = abstractC2260i.b;
                    if (obj == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!(z10 | (obj instanceof RunnableC2257f))) {
                        return true;
                    }
                    z11 = true;
                } else {
                    cVar.cancel(z8);
                    return true;
                }
            } else {
                obj = abstractC2260i.b;
                if (!(obj instanceof RunnableC2257f)) {
                    return z11;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String g() {
        String valueOf;
        Object obj = this.b;
        if (obj instanceof RunnableC2257f) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            f4.c cVar = ((RunnableC2257f) obj).f20257c;
            if (cVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(cVar);
            }
            return AbstractC2914a.h(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a8 -> B:33:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.AbstractC2260i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public final void h(C2259h c2259h) {
        c2259h.f20259a = null;
        while (true) {
            C2259h c2259h2 = this.f20265d;
            if (c2259h2 == C2259h.f20258c) {
                return;
            }
            C2259h c2259h3 = null;
            while (c2259h2 != null) {
                C2259h c2259h4 = c2259h2.b;
                if (c2259h2.f20259a != null) {
                    c2259h3 = c2259h2;
                } else if (c2259h3 != null) {
                    c2259h3.b = c2259h4;
                    if (c2259h3.f20259a == null) {
                        break;
                    }
                } else if (!f20262h.g(this, c2259h2, c2259h4)) {
                    break;
                }
                c2259h2 = c2259h4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof C2252a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z8;
        if (this.b != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        return (!(r0 instanceof RunnableC2257f)) & z8;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof C2252a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = g();
            } catch (RuntimeException e4) {
                str = "Exception thrown from implementation: " + e4.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2257f))) {
                return d(obj2);
            }
            C2259h c2259h = this.f20265d;
            C2259h c2259h2 = C2259h.f20258c;
            if (c2259h != c2259h2) {
                C2259h c2259h3 = new C2259h();
                do {
                    AbstractC2947c abstractC2947c = f20262h;
                    abstractC2947c.s(c2259h3, c2259h);
                    if (abstractC2947c.g(this, c2259h, c2259h3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                h(c2259h3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2257f))));
                        return d(obj);
                    }
                    c2259h = this.f20265d;
                } while (c2259h != c2259h2);
            }
            return d(this.b);
        }
        throw new InterruptedException();
    }
}
