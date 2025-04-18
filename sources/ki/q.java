package ki;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class q implements k0 {
    private final k0 delegate;

    public q(k0 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "delegate", imports = {}))
    @JvmName(name = "-deprecated_delegate")
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final k0 m140deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @JvmName(name = "delegate")
    public final k0 delegate() {
        return this.delegate;
    }

    @Override // ki.k0
    public long read(i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return this.delegate.read(sink, j3);
    }

    @Override // ki.k0
    public m0 timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
