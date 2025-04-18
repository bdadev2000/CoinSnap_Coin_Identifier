package okio;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class ForwardingSource implements Source {

    @NotNull
    private final Source delegate;

    public ForwardingSource(@NotNull Source source) {
        p0.a.s(source, "delegate");
        this.delegate = source;
    }

    @d0.a
    @NotNull
    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m781deprecated_delegate() {
        return this.delegate;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @NotNull
    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(@NotNull Buffer buffer, long j2) throws IOException {
        p0.a.s(buffer, "sink");
        return this.delegate.read(buffer, j2);
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @NotNull
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
