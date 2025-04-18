package ki;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class p implements i0 {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f21013b;

    public p(i0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f21013b = delegate;
    }

    @Override // ki.i0
    public void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f21013b.a(source, j3);
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f21013b.close();
    }

    @Override // ki.i0, java.io.Flushable
    public void flush() {
        this.f21013b.flush();
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f21013b.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f21013b + ')';
    }
}
