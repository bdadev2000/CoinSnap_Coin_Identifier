package ki;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final v f21000b;

    /* renamed from: c, reason: collision with root package name */
    public long f21001c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f21002d;

    public m(v fileHandle, long j3) {
        Intrinsics.checkNotNullParameter(fileHandle, "fileHandle");
        this.f21000b = fileHandle;
        this.f21001c = j3;
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f21002d) {
            v vVar = this.f21000b;
            long j10 = this.f21001c;
            vVar.getClass();
            mi.a.c(source.f20994c, 0L, j3);
            long j11 = j3 + j10;
            while (j10 < j11) {
                f0 f0Var = source.f20993b;
                Intrinsics.checkNotNull(f0Var);
                int min = (int) Math.min(j11 - j10, f0Var.f20980c - f0Var.f20979b);
                byte[] array = f0Var.a;
                int i10 = f0Var.f20979b;
                synchronized (vVar) {
                    Intrinsics.checkNotNullParameter(array, "array");
                    vVar.f21033g.seek(j10);
                    vVar.f21033g.write(array, i10, min);
                }
                int i11 = f0Var.f20979b + min;
                f0Var.f20979b = i11;
                long j12 = min;
                j10 += j12;
                source.f20994c -= j12;
                if (i11 == f0Var.f20980c) {
                    source.f20993b = f0Var.a();
                    g0.a(f0Var);
                }
            }
            this.f21001c += j3;
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f21002d) {
            return;
        }
        this.f21002d = true;
        v vVar = this.f21000b;
        ReentrantLock reentrantLock = vVar.f21032f;
        reentrantLock.lock();
        try {
            int i10 = vVar.f21031d - 1;
            vVar.f21031d = i10;
            if (i10 == 0 && vVar.f21030c) {
                Unit unit = Unit.INSTANCE;
                synchronized (vVar) {
                    vVar.f21033g.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        if (!this.f21002d) {
            v vVar = this.f21000b;
            synchronized (vVar) {
                vVar.f21033g.getFD().sync();
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0
    public final m0 timeout() {
        return m0.f21003d;
    }
}
