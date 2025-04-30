package w8;

import java.nio.ByteBuffer;
import y2.AbstractC2947c;

/* loaded from: classes3.dex */
public final class s implements g {
    public final x b;

    /* renamed from: c, reason: collision with root package name */
    public final f f24037c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24038d;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w8.f] */
    public s(x xVar) {
        G7.j.e(xVar, "sink");
        this.b = xVar;
        this.f24037c = new Object();
    }

    @Override // w8.g
    public final g A(i iVar) {
        G7.j.e(iVar, "byteString");
        if (!this.f24038d) {
            this.f24037c.l(iVar);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g B(int i9, int i10, byte[] bArr) {
        G7.j.e(bArr, "source");
        if (!this.f24038d) {
            this.f24037c.m(bArr, i9, i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final g a() {
        if (!this.f24038d) {
            f fVar = this.f24037c;
            long j7 = fVar.f24014c;
            if (j7 > 0) {
                this.b.d(fVar, j7);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void b(int i9) {
        if (!this.f24038d) {
            this.f24037c.q(AbstractC2947c.w(i9));
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        x xVar = this.b;
        if (!this.f24038d) {
            try {
                f fVar = this.f24037c;
                long j7 = fVar.f24014c;
                if (j7 > 0) {
                    xVar.d(fVar, j7);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                xVar.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f24038d = true;
            if (th == null) {
            } else {
                throw th;
            }
        }
    }

    @Override // w8.x
    public final void d(f fVar, long j7) {
        G7.j.e(fVar, "source");
        if (!this.f24038d) {
            this.f24037c.d(fVar, j7);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g emitCompleteSegments() {
        if (!this.f24038d) {
            f fVar = this.f24037c;
            long a6 = fVar.a();
            if (a6 > 0) {
                this.b.d(fVar, a6);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g, w8.x, java.io.Flushable
    public final void flush() {
        if (!this.f24038d) {
            f fVar = this.f24037c;
            long j7 = fVar.f24014c;
            x xVar = this.b;
            if (j7 > 0) {
                xVar.d(fVar, j7);
            }
            xVar.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f24038d;
    }

    @Override // w8.x
    public final A timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        G7.j.e(byteBuffer, "source");
        if (!this.f24038d) {
            int write = this.f24037c.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeByte(int i9) {
        if (!this.f24038d) {
            this.f24037c.n(i9);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeDecimalLong(long j7) {
        if (!this.f24038d) {
            this.f24037c.o(j7);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeHexadecimalUnsignedLong(long j7) {
        if (!this.f24038d) {
            this.f24037c.p(j7);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeInt(int i9) {
        if (!this.f24038d) {
            this.f24037c.q(i9);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeShort(int i9) {
        if (!this.f24038d) {
            this.f24037c.r(i9);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final g writeUtf8(String str) {
        G7.j.e(str, "string");
        if (!this.f24038d) {
            this.f24037c.u(str);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.g
    public final f y() {
        return this.f24037c;
    }

    @Override // w8.g
    public final long z(y yVar) {
        long j7 = 0;
        while (true) {
            long read = ((C2912b) yVar).read(this.f24037c, 8192L);
            if (read == -1) {
                return j7;
            }
            j7 += read;
            emitCompleteSegments();
        }
    }

    @Override // w8.g
    public final g write(byte[] bArr) {
        if (!this.f24038d) {
            f fVar = this.f24037c;
            fVar.getClass();
            fVar.m(bArr, 0, bArr.length);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
