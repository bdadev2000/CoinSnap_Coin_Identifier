package ki;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements j {

    /* renamed from: b, reason: collision with root package name */
    public final i0 f20965b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20966c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20967d;

    public d0(i0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f20965b = sink;
        this.f20966c = new i();
    }

    @Override // ki.j
    public final j E(l byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (!this.f20967d) {
            this.f20966c.v(byteString);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final long L(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j3 = 0;
        while (true) {
            long read = ((d) source).read(this.f20966c, 8192L);
            if (read != -1) {
                j3 += read;
                emitCompleteSegments();
            } else {
                return j3;
            }
        }
    }

    @Override // ki.j
    public final j P(int i10, int i11, String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f20967d) {
            this.f20966c.X(i10, i11, string);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j S(int i10, int i11, byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f20967d) {
            this.f20966c.u(i10, i11, source);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f20967d) {
            this.f20966c.a(source, j3);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        i0 i0Var = this.f20965b;
        if (!this.f20967d) {
            try {
                i iVar = this.f20966c;
                long j3 = iVar.f20994c;
                if (j3 > 0) {
                    i0Var.a(iVar, j3);
                }
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                i0Var.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f20967d = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final j d() {
        if (!this.f20967d) {
            i iVar = this.f20966c;
            long j3 = iVar.f20994c;
            if (j3 > 0) {
                this.f20965b.a(iVar, j3);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j emitCompleteSegments() {
        if (!this.f20967d) {
            i iVar = this.f20966c;
            long g10 = iVar.g();
            if (g10 > 0) {
                this.f20965b.a(iVar, g10);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j, ki.i0, java.io.Flushable
    public final void flush() {
        if (!this.f20967d) {
            i iVar = this.f20966c;
            long j3 = iVar.f20994c;
            i0 i0Var = this.f20965b;
            if (j3 > 0) {
                i0Var.a(iVar, j3);
            }
            i0Var.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final h g() {
        return new h(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f20967d;
    }

    public final void j(int i10) {
        if (!this.f20967d) {
            this.f20966c.U(((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8));
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.i0
    public final m0 timeout() {
        return this.f20965b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f20965b + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f20967d) {
            int write = this.f20966c.write(source);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeByte(int i10) {
        if (!this.f20967d) {
            this.f20966c.w(i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeDecimalLong(long j3) {
        if (!this.f20967d) {
            this.f20966c.x(j3);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeHexadecimalUnsignedLong(long j3) {
        if (!this.f20967d) {
            this.f20966c.T(j3);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeInt(int i10) {
        if (!this.f20967d) {
            this.f20966c.U(i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeShort(int i10) {
        if (!this.f20967d) {
            this.f20966c.V(i10);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final j writeUtf8(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (!this.f20967d) {
            this.f20966c.Y(string);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.j
    public final i y() {
        return this.f20966c;
    }

    @Override // ki.j
    public final j write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f20967d) {
            i iVar = this.f20966c;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            iVar.u(0, source.length, source);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
