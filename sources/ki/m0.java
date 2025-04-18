package ki;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class m0 {

    /* renamed from: d, reason: collision with root package name */
    public static final l0 f21003d = new l0();
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public long f21004b;

    /* renamed from: c, reason: collision with root package name */
    public long f21005c;

    public m0 a() {
        this.a = false;
        return this;
    }

    public m0 b() {
        this.f21005c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.f21004b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public m0 d(long j3) {
        this.a = true;
        this.f21004b = j3;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.f21004b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public m0 g(long j3, TimeUnit unit) {
        boolean z10;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f21005c = unit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("timeout < 0: ", j3).toString());
    }
}
