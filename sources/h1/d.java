package h1;

/* loaded from: classes3.dex */
public final class d extends g {
    public static final d d = new g(k.f30756c, k.d, k.f30754a, k.e);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // b1.z
    public final String toString() {
        return "Dispatchers.Default";
    }
}
