package ki;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f implements i0 {
    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j3);
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ki.i0, java.io.Flushable
    public final void flush() {
    }

    @Override // ki.i0
    public final m0 timeout() {
        return m0.f21003d;
    }
}
