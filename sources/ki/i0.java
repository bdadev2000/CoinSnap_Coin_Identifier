package ki;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes5.dex */
public interface i0 extends Closeable, Flushable {
    void a(i iVar, long j3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    m0 timeout();
}
