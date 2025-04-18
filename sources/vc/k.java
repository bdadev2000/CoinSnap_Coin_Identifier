package vc;

import java.io.Writer;

/* loaded from: classes3.dex */
public final class k extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new AssertionError();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw new AssertionError();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i10, int i11) {
        throw new AssertionError();
    }
}
