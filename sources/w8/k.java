package w8;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class k implements y {
    private final y delegate;

    public k(y yVar) {
        G7.j.e(yVar, "delegate");
        this.delegate = yVar;
    }

    /* renamed from: -deprecated_delegate, reason: not valid java name */
    public final y m127deprecated_delegate() {
        return this.delegate;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final y delegate() {
        return this.delegate;
    }

    @Override // w8.y
    public long read(f fVar, long j7) {
        G7.j.e(fVar, "sink");
        return this.delegate.read(fVar, j7);
    }

    @Override // w8.y
    public A timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.delegate);
        sb.append(')');
        return sb.toString();
    }
}
