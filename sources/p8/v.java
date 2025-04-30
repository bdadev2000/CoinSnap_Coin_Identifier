package p8;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class v implements w8.y {
    public final w8.h b;

    /* renamed from: c, reason: collision with root package name */
    public int f22476c;

    /* renamed from: d, reason: collision with root package name */
    public int f22477d;

    /* renamed from: f, reason: collision with root package name */
    public int f22478f;

    /* renamed from: g, reason: collision with root package name */
    public int f22479g;

    /* renamed from: h, reason: collision with root package name */
    public int f22480h;

    public v(w8.h hVar) {
        G7.j.e(hVar, "source");
        this.b = hVar;
    }

    @Override // w8.y
    public final long read(w8.f fVar, long j7) {
        int i9;
        int readInt;
        G7.j.e(fVar, "sink");
        do {
            int i10 = this.f22479g;
            w8.h hVar = this.b;
            if (i10 == 0) {
                hVar.skip(this.f22480h);
                this.f22480h = 0;
                if ((this.f22477d & 4) != 0) {
                    return -1L;
                }
                i9 = this.f22478f;
                int s5 = j8.b.s(hVar);
                this.f22479g = s5;
                this.f22476c = s5;
                int readByte = hVar.readByte() & 255;
                this.f22477d = hVar.readByte() & 255;
                Logger logger = w.f22481g;
                if (logger.isLoggable(Level.FINE)) {
                    w8.i iVar = g.f22413a;
                    logger.fine(g.a(true, this.f22478f, this.f22476c, readByte, this.f22477d));
                }
                readInt = hVar.readInt() & Integer.MAX_VALUE;
                this.f22478f = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long read = hVar.read(fVar, Math.min(j7, i10));
                if (read == -1) {
                    return -1L;
                }
                this.f22479g -= (int) read;
                return read;
            }
        } while (readInt == i9);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // w8.y
    public final w8.A timeout() {
        return this.b.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
