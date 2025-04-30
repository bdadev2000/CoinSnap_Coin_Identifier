package w8;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes3.dex */
public interface x extends Closeable, Flushable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d(f fVar, long j7);

    void flush();

    A timeout();
}
