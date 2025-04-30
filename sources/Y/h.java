package y;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.o;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class h implements f4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f24264f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f24265g = Logger.getLogger(h.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final R2.b f24266h;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f24267i;
    public volatile Object b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C2936d f24268c;

    /* renamed from: d, reason: collision with root package name */
    public volatile C2939g f24269d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [R2.b] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new C2937e(AtomicReferenceFieldUpdater.newUpdater(C2939g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2939g.class, C2939g.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B), AtomicReferenceFieldUpdater.newUpdater(h.class, C2939g.class, "d"), AtomicReferenceFieldUpdater.newUpdater(h.class, C2936d.class, com.mbridge.msdk.foundation.controller.a.f15376a), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f24266h = r32;
        if (th != null) {
            f24265g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f24267i = new Object();
    }

    public static void c(h hVar) {
        C2939g c2939g;
        C2936d c2936d;
        C2936d c2936d2;
        C2936d c2936d3;
        do {
            c2939g = hVar.f24269d;
        } while (!f24266h.h(hVar, c2939g, C2939g.f24262c));
        while (true) {
            c2936d = null;
            if (c2939g == null) {
                break;
            }
            Thread thread = c2939g.f24263a;
            if (thread != null) {
                c2939g.f24263a = null;
                LockSupport.unpark(thread);
            }
            c2939g = c2939g.b;
        }
        hVar.b();
        do {
            c2936d2 = hVar.f24268c;
        } while (!f24266h.f(hVar, c2936d2, C2936d.f24255d));
        while (true) {
            c2936d3 = c2936d;
            c2936d = c2936d2;
            if (c2936d == null) {
                break;
            }
            c2936d2 = c2936d.f24257c;
            c2936d.f24257c = c2936d3;
        }
        while (c2936d3 != null) {
            C2936d c2936d4 = c2936d3.f24257c;
            d(c2936d3.f24256a, c2936d3.b);
            c2936d3 = c2936d4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f24265g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object e(Object obj) {
        if (!(obj instanceof C2934b)) {
            if (!(obj instanceof C2935c)) {
                if (obj == f24267i) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((C2935c) obj).f24254a);
        }
        Throwable th = ((C2934b) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        String valueOf;
        boolean z8 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    sb.append("CANCELLED");
                    return;
                } catch (RuntimeException e4) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e4.getClass());
                    sb.append(" thrown from get()]");
                    return;
                } catch (ExecutionException e9) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e9.getCause());
                    sb.append("]");
                    return;
                }
            } catch (InterruptedException unused2) {
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
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    @Override // f4.c
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        C2936d c2936d = this.f24268c;
        C2936d c2936d2 = C2936d.f24255d;
        if (c2936d != c2936d2) {
            C2936d c2936d3 = new C2936d(runnable, executor);
            do {
                c2936d3.f24257c = c2936d;
                if (f24266h.f(this, c2936d, c2936d3)) {
                    return;
                } else {
                    c2936d = this.f24268c;
                }
            } while (c2936d != c2936d2);
        }
        d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        C2934b c2934b;
        Object obj = this.b;
        if (obj != null) {
            return false;
        }
        if (f24264f) {
            c2934b = new C2934b(z8, new CancellationException("Future.cancel() was called."));
        } else if (z8) {
            c2934b = C2934b.f24251c;
        } else {
            c2934b = C2934b.f24252d;
        }
        if (!f24266h.g(this, obj, c2934b)) {
            return false;
        }
        c(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void g(C2939g c2939g) {
        c2939g.f24263a = null;
        while (true) {
            C2939g c2939g2 = this.f24269d;
            if (c2939g2 == C2939g.f24262c) {
                return;
            }
            C2939g c2939g3 = null;
            while (c2939g2 != null) {
                C2939g c2939g4 = c2939g2.b;
                if (c2939g2.f24263a != null) {
                    c2939g3 = c2939g2;
                } else if (c2939g3 != null) {
                    c2939g3.b = c2939g4;
                    if (c2939g3.f24263a == null) {
                        break;
                    }
                } else if (!f24266h.h(this, c2939g2, c2939g4)) {
                    break;
                }
                c2939g2 = c2939g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j7, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j7);
        if (!Thread.interrupted()) {
            Object obj = this.b;
            if (obj != null) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C2939g c2939g = this.f24269d;
                C2939g c2939g2 = C2939g.f24262c;
                if (c2939g != c2939g2) {
                    C2939g c2939g3 = new C2939g();
                    do {
                        R2.b bVar = f24266h;
                        bVar.v(c2939g3, c2939g);
                        if (bVar.h(this, c2939g, c2939g3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.b;
                                    if (obj2 != null) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    g(c2939g3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            g(c2939g3);
                        } else {
                            c2939g = this.f24269d;
                        }
                    } while (c2939g != c2939g2);
                }
                return e(this.b);
            }
            while (nanos > 0) {
                Object obj3 = this.b;
                if (obj3 != null) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String hVar = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder a6 = AbstractC2933a.a("Waited ", j7, " ");
            a6.append(timeUnit.toString().toLowerCase(locale));
            String sb = a6.toString();
            if (nanos + 1000 < 0) {
                String j9 = o.j(sb, " (plus ");
                long j10 = -nanos;
                long convert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
                long nanos2 = j10 - timeUnit.toNanos(convert);
                boolean z8 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str = j9 + convert + " " + lowerCase;
                    if (z8) {
                        str = o.j(str, ",");
                    }
                    j9 = o.j(str, " ");
                }
                if (z8) {
                    j9 = j9 + nanos2 + " nanoseconds ";
                }
                sb = o.j(j9, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(o.j(sb, " but future completed as timeout expired"));
            }
            throw new TimeoutException(o.k(sb, " for ", hVar));
        }
        throw new InterruptedException();
    }

    public boolean h(Object obj) {
        if (obj == null) {
            obj = f24267i;
        }
        if (f24266h.g(this, null, obj)) {
            c(this);
            return true;
        }
        return false;
    }

    public boolean i(Throwable th) {
        th.getClass();
        if (f24266h.g(this, null, new C2935c(th))) {
            c(this);
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b instanceof C2934b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.b != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.b instanceof C2934b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = f();
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

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.b;
            if (obj2 != null) {
                return e(obj2);
            }
            C2939g c2939g = this.f24269d;
            C2939g c2939g2 = C2939g.f24262c;
            if (c2939g != c2939g2) {
                C2939g c2939g3 = new C2939g();
                do {
                    R2.b bVar = f24266h;
                    bVar.v(c2939g3, c2939g);
                    if (bVar.h(this, c2939g, c2939g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.b;
                            } else {
                                g(c2939g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return e(obj);
                    }
                    c2939g = this.f24269d;
                } while (c2939g != c2939g2);
            }
            return e(this.b);
        }
        throw new InterruptedException();
    }
}
