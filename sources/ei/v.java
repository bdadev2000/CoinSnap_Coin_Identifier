package ei;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ki.k0;
import ki.m0;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements k0 {

    /* renamed from: b, reason: collision with root package name */
    public final ki.k f17486b;

    /* renamed from: c, reason: collision with root package name */
    public int f17487c;

    /* renamed from: d, reason: collision with root package name */
    public int f17488d;

    /* renamed from: f, reason: collision with root package name */
    public int f17489f;

    /* renamed from: g, reason: collision with root package name */
    public int f17490g;

    /* renamed from: h, reason: collision with root package name */
    public int f17491h;

    public v(ki.k source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f17486b = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ki.k0
    public final long read(ki.i sink, long j3) {
        int i10;
        int readInt;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i11 = this.f17490g;
            ki.k kVar = this.f17486b;
            if (i11 == 0) {
                kVar.skip(this.f17491h);
                this.f17491h = 0;
                if ((this.f17488d & 4) != 0) {
                    return -1L;
                }
                i10 = this.f17489f;
                int s5 = xh.b.s(kVar);
                this.f17490g = s5;
                this.f17487c = s5;
                int readByte = kVar.readByte() & UByte.MAX_VALUE;
                this.f17488d = kVar.readByte() & UByte.MAX_VALUE;
                Logger logger = w.f17492g;
                if (logger.isLoggable(Level.FINE)) {
                    ki.l lVar = g.a;
                    logger.fine(g.a(this.f17489f, this.f17487c, readByte, this.f17488d, true));
                }
                readInt = kVar.readInt() & Integer.MAX_VALUE;
                this.f17489f = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long read = kVar.read(sink, Math.min(j3, i11));
                if (read == -1) {
                    return -1L;
                }
                this.f17490g -= (int) read;
                return read;
            }
        } while (readInt == i10);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f17486b.timeout();
    }
}
