package w8;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class c extends A {

    /* renamed from: h, reason: collision with root package name */
    public static final long f24007h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f24008i;

    /* renamed from: j, reason: collision with root package name */
    public static c f24009j;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24010e;

    /* renamed from: f, reason: collision with root package name */
    public c f24011f;

    /* renamed from: g, reason: collision with root package name */
    public long f24012g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f24007h = millis;
        f24008i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [w8.c, java.lang.Object] */
    public final void h() {
        c cVar;
        long j7 = this.f24001c;
        boolean z8 = this.f24000a;
        if (j7 == 0 && !z8) {
            return;
        }
        synchronized (c.class) {
            try {
                if (!this.f24010e) {
                    this.f24010e = true;
                    if (f24009j == null) {
                        f24009j = new Object();
                        S1.a aVar = new S1.a("Okio Watchdog");
                        aVar.setDaemon(true);
                        aVar.start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j7 != 0 && z8) {
                        this.f24012g = Math.min(j7, c() - nanoTime) + nanoTime;
                    } else if (j7 != 0) {
                        this.f24012g = j7 + nanoTime;
                    } else if (z8) {
                        this.f24012g = c();
                    } else {
                        throw new AssertionError();
                    }
                    long j9 = this.f24012g - nanoTime;
                    c cVar2 = f24009j;
                    G7.j.b(cVar2);
                    while (true) {
                        cVar = cVar2.f24011f;
                        if (cVar == null || j9 < cVar.f24012g - nanoTime) {
                            break;
                        } else {
                            cVar2 = cVar;
                        }
                    }
                    this.f24011f = cVar;
                    cVar2.f24011f = this;
                    if (cVar2 == f24009j) {
                        c.class.notify();
                    }
                } else {
                    throw new IllegalStateException("Unbalanced enter/exit".toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean i() {
        synchronized (c.class) {
            if (!this.f24010e) {
                return false;
            }
            this.f24010e = false;
            c cVar = f24009j;
            while (cVar != null) {
                c cVar2 = cVar.f24011f;
                if (cVar2 == this) {
                    cVar.f24011f = this.f24011f;
                    this.f24011f = null;
                    return false;
                }
                cVar = cVar2;
            }
            return true;
        }
    }

    public IOException j(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void k() {
    }
}
