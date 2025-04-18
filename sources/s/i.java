package s;

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
public abstract class i implements ua.b {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f24139f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f24140g = Logger.getLogger(i.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final a f24141h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f24142i;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f24143b;

    /* renamed from: c, reason: collision with root package name */
    public volatile e f24144c;

    /* renamed from: d, reason: collision with root package name */
    public volatile h f24145d;

    static {
        a gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(i.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(i.class, e.class, com.mbridge.msdk.foundation.controller.a.a), AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            gVar = new g();
        }
        f24141h = gVar;
        if (th != null) {
            f24140g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f24142i = new Object();
    }

    public static void c(i iVar) {
        h hVar;
        e eVar;
        e eVar2;
        e eVar3;
        do {
            hVar = iVar.f24145d;
        } while (!f24141h.g(iVar, hVar, h.f24137c));
        while (true) {
            eVar = null;
            if (hVar == null) {
                break;
            }
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.f24138b;
        }
        iVar.b();
        do {
            eVar2 = iVar.f24144c;
        } while (!f24141h.e(iVar, eVar2, e.f24129d));
        while (true) {
            eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                break;
            }
            eVar2 = eVar.f24131c;
            eVar.f24131c = eVar3;
        }
        while (eVar3 != null) {
            e eVar4 = eVar3.f24131c;
            d(eVar3.a, eVar3.f24130b);
            eVar3 = eVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f24140g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
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
        e eVar = this.f24144c;
        e eVar2 = e.f24129d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f24131c = eVar;
                if (f24141h.e(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f24144c;
                }
            } while (eVar != eVar2);
        }
        d(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean z11;
        b bVar;
        Object obj = this.f24143b;
        if (obj == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 | false) {
            if (f24139f) {
                bVar = new b(z10, new CancellationException("Future.cancel() was called."));
            } else if (z10) {
                bVar = b.f24125c;
            } else {
                bVar = b.f24126d;
            }
            if (f24141h.f(this, obj, bVar)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    public final Object e(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof d)) {
                if (obj == f24142i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).a);
        }
        Throwable th2 = ((b) obj).f24127b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th2);
        throw cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.f24145d;
            if (hVar2 == h.f24137c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f24138b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f24138b = hVar4;
                    if (hVar3.a == null) {
                        break;
                    }
                } else if (!f24141h.g(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x009e -> B:33:0x00a4). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r13, java.util.concurrent.TimeUnit r15) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.i.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean h(Object obj) {
        if (obj == null) {
            obj = f24142i;
        }
        if (f24141h.f(this, null, obj)) {
            c(this);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th2) {
        th2.getClass();
        if (f24141h.f(this, null, new d(th2))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f24143b instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f24143b != null) & true;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f24143b instanceof b) {
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
            Object obj2 = this.f24143b;
            if ((obj2 != null) & true) {
                return e(obj2);
            }
            h hVar = this.f24145d;
            h hVar2 = h.f24137c;
            if (hVar != hVar2) {
                h hVar3 = new h();
                do {
                    a aVar = f24141h;
                    aVar.p(hVar3, hVar);
                    if (aVar.g(this, hVar, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f24143b;
                            } else {
                                g(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & true));
                        return e(obj);
                    }
                    hVar = this.f24145d;
                } while (hVar != hVar2);
            }
            return e(this.f24143b);
        }
        throw new InterruptedException();
    }
}
