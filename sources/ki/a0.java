package ki;

import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final OutputStream f20950b;

    /* renamed from: c, reason: collision with root package name */
    public final m0 f20951c;

    public a0(OutputStream out, m0 timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f20950b = out;
        this.f20951c = timeout;
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        mi.a.c(source.f20994c, 0L, j3);
        while (j3 > 0) {
            this.f20951c.f();
            f0 f0Var = source.f20993b;
            Intrinsics.checkNotNull(f0Var);
            int min = (int) Math.min(j3, f0Var.f20980c - f0Var.f20979b);
            this.f20950b.write(f0Var.a, f0Var.f20979b, min);
            int i10 = f0Var.f20979b + min;
            f0Var.f20979b = i10;
            long j10 = min;
            j3 -= j10;
            source.f20994c -= j10;
            if (i10 == f0Var.f20980c) {
                source.f20993b = f0Var.a();
                g0.a(f0Var);
            }
        }
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f20950b.close();
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
        this.f20950b.flush();
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f20951c;
    }

    public final String toString() {
        return "sink(" + this.f20950b + ')';
    }
}
