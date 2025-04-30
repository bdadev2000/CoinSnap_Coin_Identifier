package w8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class A {

    /* renamed from: d, reason: collision with root package name */
    public static final z f23999d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f24000a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public long f24001c;

    public A a() {
        this.f24000a = false;
        return this;
    }

    public A b() {
        this.f24001c = 0L;
        return this;
    }

    public long c() {
        if (this.f24000a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public A d(long j7) {
        this.f24000a = true;
        this.b = j7;
        return this;
    }

    public boolean e() {
        return this.f24000a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f24000a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public A g(long j7, TimeUnit timeUnit) {
        boolean z8;
        G7.j.e(timeUnit, "unit");
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            this.f24001c = timeUnit.toNanos(j7);
            return this;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "timeout < 0: ").toString());
    }
}
