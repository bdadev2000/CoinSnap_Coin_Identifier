package w2;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h implements ua.b {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f26684f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f26685g = Logger.getLogger(h.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final va.b f26686h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f26687i;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f26688b;

    /* renamed from: c, reason: collision with root package name */
    public volatile c f26689c;

    /* renamed from: d, reason: collision with root package name */
    public volatile g f26690d;

    static {
        va.b fVar;
        try {
            fVar = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "d"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, com.mbridge.msdk.foundation.controller.a.a), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            fVar = new f();
        }
        f26686h = fVar;
        if (th != null) {
            f26685g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f26687i = new Object();
    }

    public static void b(h hVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            g gVar = hVar.f26690d;
            if (f26686h.i(hVar, gVar, g.f26682c)) {
                while (gVar != null) {
                    Thread thread = gVar.a;
                    if (thread != null) {
                        gVar.a = null;
                        LockSupport.unpark(thread);
                    }
                    gVar = gVar.f26683b;
                }
                do {
                    cVar = hVar.f26689c;
                } while (!f26686h.g(hVar, cVar, c.f26672d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f26674c;
                    cVar3.f26674c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f26674c;
                    Runnable runnable = cVar2.a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        hVar = eVar.f26680b;
                        if (hVar.f26688b == eVar) {
                            if (f26686h.h(hVar, eVar, e(eVar.f26681c))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, cVar2.f26673b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f26685g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(ua.b bVar) {
        Object obj;
        if (bVar instanceof h) {
            Object obj2 = ((h) bVar).f26688b;
            if (obj2 instanceof a) {
                a aVar = (a) obj2;
                if (aVar.a) {
                    if (aVar.f26670b != null) {
                        return new a(false, aVar.f26670b);
                    }
                    return a.f26669d;
                }
                return obj2;
            }
            return obj2;
        }
        boolean isCancelled = bVar.isCancelled();
        boolean z10 = true;
        if ((!f26684f) & isCancelled) {
            return a.f26669d;
        }
        boolean z11 = false;
        while (true) {
            try {
                try {
                    obj = bVar.get();
                    break;
                } catch (CancellationException e2) {
                    if (!isCancelled) {
                        return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e2));
                    }
                    return new a(false, e2);
                } catch (ExecutionException e10) {
                    return new b(e10.getCause());
                } catch (Throwable th2) {
                    return new b(th2);
                }
            } catch (InterruptedException unused) {
                z11 = z10;
            } catch (Throwable th3) {
                if (z11) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        if (obj == null) {
            return f26687i;
        }
        return obj;
    }

    public final void a(StringBuilder sb2) {
        Object obj;
        String valueOf;
        boolean z10 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb2.append("CANCELLED");
                    return;
                } catch (RuntimeException e2) {
                    sb2.append("UNKNOWN, cause=[");
                    sb2.append(e2.getClass());
                    sb2.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e10) {
                    sb2.append("FAILURE, cause=[");
                    sb2.append(e10.getCause());
                    sb2.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        sb2.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb2.append(valueOf);
        sb2.append("]");
    }

    @Override // ua.b
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        c cVar = this.f26689c;
        c cVar2 = c.f26672d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f26674c = cVar;
                if (f26686h.g(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f26689c;
                }
            } while (cVar != cVar2);
        }
        c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        a aVar;
        boolean z12;
        Object obj = this.f26688b;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!(z11 | (obj instanceof e))) {
            return false;
        }
        if (f26684f) {
            aVar = new a(z10, new CancellationException("Future.cancel() was called."));
        } else if (z10) {
            aVar = a.f26668c;
        } else {
            aVar = a.f26669d;
        }
        h hVar = this;
        boolean z13 = false;
        while (true) {
            if (f26686h.h(hVar, obj, aVar)) {
                b(hVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                ua.b bVar = ((e) obj).f26681c;
                if (bVar instanceof h) {
                    hVar = (h) bVar;
                    obj = hVar.f26688b;
                    if (obj == null) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!(z12 | (obj instanceof e))) {
                        return true;
                    }
                    z13 = true;
                } else {
                    bVar.cancel(z10);
                    return true;
                }
            } else {
                obj = hVar.f26688b;
                if (!(obj instanceof e)) {
                    return z13;
                }
            }
        }
    }

    public final Object d(Object obj) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof b)) {
                if (obj == f26687i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((b) obj).a);
        }
        Throwable th2 = ((a) obj).f26670b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String f() {
        String valueOf;
        Object obj = this.f26688b;
        if (obj instanceof e) {
            StringBuilder sb2 = new StringBuilder("setFuture=[");
            ua.b bVar = ((e) obj).f26681c;
            if (bVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(bVar);
            }
            return vd.e.h(sb2, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(g gVar) {
        gVar.a = null;
        while (true) {
            g gVar2 = this.f26690d;
            if (gVar2 == g.f26682c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f26683b;
                if (gVar2.a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f26683b = gVar4;
                    if (gVar3.a == null) {
                        break;
                    }
                } else if (!f26686h.i(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a7 -> B:33:0x00ad). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r13, java.util.concurrent.TimeUnit r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f26688b instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        if (this.f26688b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return (!(r0 instanceof e)) & z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f26688b instanceof a) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = f();
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f26688b;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return d(obj2);
            }
            g gVar = this.f26690d;
            g gVar2 = g.f26682c;
            if (gVar != gVar2) {
                g gVar3 = new g();
                do {
                    va.b bVar = f26686h;
                    bVar.q(gVar3, gVar);
                    if (bVar.i(this, gVar, gVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f26688b;
                            } else {
                                g(gVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return d(obj);
                    }
                    gVar = this.f26690d;
                } while (gVar != gVar2);
            }
            return d(this.f26688b);
        }
        throw new InterruptedException();
    }
}
