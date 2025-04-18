package ki;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class e extends m0 {

    /* renamed from: h, reason: collision with root package name */
    public static final ReentrantLock f20968h;

    /* renamed from: i, reason: collision with root package name */
    public static final Condition f20969i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f20970j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f20971k;

    /* renamed from: l, reason: collision with root package name */
    public static e f20972l;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20973e;

    /* renamed from: f, reason: collision with root package name */
    public e f20974f;

    /* renamed from: g, reason: collision with root package name */
    public long f20975g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f20968h = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "lock.newCondition()");
        f20969i = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f20970j = millis;
        f20971k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void h() {
        long j3 = this.f21005c;
        boolean z10 = this.a;
        if (j3 == 0 && !z10) {
            return;
        }
        ReentrantLock reentrantLock = f20968h;
        reentrantLock.lock();
        try {
            if (!this.f20973e) {
                this.f20973e = true;
                if (f20972l == null) {
                    f20972l = new e();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j3 != 0 && z10) {
                    this.f20975g = Math.min(j3, c() - nanoTime) + nanoTime;
                } else if (j3 != 0) {
                    this.f20975g = j3 + nanoTime;
                } else if (z10) {
                    this.f20975g = c();
                } else {
                    throw new AssertionError();
                }
                long j10 = this.f20975g - nanoTime;
                e eVar = f20972l;
                Intrinsics.checkNotNull(eVar);
                while (true) {
                    e eVar2 = eVar.f20974f;
                    if (eVar2 == null) {
                        break;
                    }
                    Intrinsics.checkNotNull(eVar2);
                    if (j10 < eVar2.f20975g - nanoTime) {
                        break;
                    }
                    eVar = eVar.f20974f;
                    Intrinsics.checkNotNull(eVar);
                }
                this.f20974f = eVar.f20974f;
                eVar.f20974f = this;
                if (eVar == f20972l) {
                    f20969i.signal();
                }
                Unit unit = Unit.INSTANCE;
                return;
            }
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean i() {
        ReentrantLock reentrantLock = f20968h;
        reentrantLock.lock();
        try {
            if (!this.f20973e) {
                return false;
            }
            this.f20973e = false;
            e eVar = f20972l;
            while (eVar != null) {
                e eVar2 = eVar.f20974f;
                if (eVar2 == this) {
                    eVar.f20974f = this.f20974f;
                    this.f20974f = null;
                    return false;
                }
                eVar = eVar2;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
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
