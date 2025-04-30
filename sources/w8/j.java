package w8;

/* loaded from: classes3.dex */
public abstract class j implements x {
    public final x b;

    public j(x xVar) {
        G7.j.e(xVar, "delegate");
        this.b = xVar;
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.close();
    }

    @Override // w8.x
    public void d(f fVar, long j7) {
        G7.j.e(fVar, "source");
        this.b.d(fVar, j7);
    }

    @Override // w8.x, java.io.Flushable
    public void flush() {
        this.b.flush();
    }

    @Override // w8.x
    public final A timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getClass().getSimpleName());
        sb.append('(');
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
