package w8;

import Q7.n0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class t implements h {
    public final y b;

    /* renamed from: c, reason: collision with root package name */
    public final f f24039c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24040d;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, w8.f] */
    public t(y yVar) {
        G7.j.e(yVar, "source");
        this.b = yVar;
        this.f24039c = new Object();
    }

    public final t a() {
        return r8.k.f(new r(this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f24040d) {
            this.f24040d = true;
            this.b.close();
            f fVar = this.f24039c;
            fVar.skip(fVar.f24014c);
        }
    }

    @Override // w8.h
    public final long e(i iVar) {
        G7.j.e(iVar, "targetBytes");
        if (!this.f24040d) {
            long j7 = 0;
            while (true) {
                f fVar = this.f24039c;
                long h6 = fVar.h(iVar, j7);
                if (h6 == -1) {
                    long j9 = fVar.f24014c;
                    if (this.b.read(fVar, 8192L) == -1) {
                        return -1L;
                    }
                    j7 = Math.max(j7, j9);
                } else {
                    return h6;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // w8.h
    public final boolean exhausted() {
        if (!this.f24040d) {
            f fVar = this.f24039c;
            if (fVar.exhausted() && this.b.read(fVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.h
    public final long f(f fVar) {
        f fVar2;
        long j7 = 0;
        while (true) {
            y yVar = this.b;
            fVar2 = this.f24039c;
            if (yVar.read(fVar2, 8192L) == -1) {
                break;
            }
            long a6 = fVar2.a();
            if (a6 > 0) {
                j7 += a6;
                fVar.d(fVar2, a6);
            }
        }
        long j9 = fVar2.f24014c;
        if (j9 > 0) {
            long j10 = j7 + j9;
            fVar.d(fVar2, j9);
            return j10;
        }
        return j7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // w8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(w8.q r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            G7.j.e(r8, r0)
            boolean r0 = r7.f24040d
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            w8.f r0 = r7.f24039c
            int r2 = x8.a.b(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            w8.i[] r8 = r8.b
            r8 = r8[r2]
            int r8 = r8.c()
            long r3 = (long) r8
            r0.skip(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            w8.y r2 = r7.b
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.read(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
            goto L24
        L35:
            return r2
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.t.g(w8.q):int");
    }

    public final long indexOf(byte b, long j7, long j9) {
        if (!this.f24040d) {
            long j10 = 0;
            if (0 <= j9) {
                while (j10 < j9) {
                    long indexOf = this.f24039c.indexOf(b, j10, j9);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    f fVar = this.f24039c;
                    long j11 = fVar.f24014c;
                    if (j11 >= j9 || this.b.read(fVar, 8192L) == -1) {
                        return -1L;
                    }
                    j10 = Math.max(j10, j11);
                }
                return -1L;
            }
            throw new IllegalArgumentException(n0.g(j9, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.h
    public final InputStream inputStream() {
        return new e(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f24040d;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        G7.j.e(byteBuffer, "sink");
        f fVar = this.f24039c;
        if (fVar.f24014c == 0 && this.b.read(fVar, 8192L) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // w8.h
    public final byte readByte() {
        require(1L);
        return this.f24039c.readByte();
    }

    @Override // w8.h
    public final byte[] readByteArray() {
        y yVar = this.b;
        f fVar = this.f24039c;
        fVar.z(yVar);
        return fVar.readByteArray(fVar.f24014c);
    }

    @Override // w8.h
    public final i readByteString() {
        y yVar = this.b;
        f fVar = this.f24039c;
        fVar.z(yVar);
        return fVar.readByteString(fVar.f24014c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        com.facebook.appevents.g.a(16);
        com.facebook.appevents.g.a(16);
        r1 = java.lang.Integer.toString(r8, 16);
        G7.j.d(r1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        throw new java.lang.NumberFormatException(G7.j.j(r1, "Expected a digit or '-' but was 0x"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readDecimalLong() {
        /*
            r11 = this;
            r0 = 1
            r11.require(r0)
            r2 = 0
            r4 = r2
        L8:
            long r6 = r4 + r0
            boolean r8 = r11.request(r6)
            w8.f r9 = r11.f24039c
            if (r8 == 0) goto L4c
            byte r8 = r9.c(r4)
            r10 = 48
            byte r10 = (byte) r10
            if (r8 < r10) goto L20
            r10 = 57
            byte r10 = (byte) r10
            if (r8 <= r10) goto L2a
        L20:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L2c
            r5 = 45
            byte r5 = (byte) r5
            if (r8 == r5) goto L2a
            goto L2c
        L2a:
            r4 = r6
            goto L8
        L2c:
            if (r4 == 0) goto L2f
            goto L4c
        L2f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            com.facebook.appevents.g.a(r1)
            com.facebook.appevents.g.a(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            G7.j.d(r1, r2)
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            java.lang.String r1 = G7.j.j(r1, r2)
            r0.<init>(r1)
            throw r0
        L4c:
            long r0 = r9.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.t.readDecimalLong():long");
    }

    @Override // w8.h
    public final long readHexadecimalUnsignedLong() {
        f fVar;
        byte c9;
        require(1L);
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            boolean request = request(i10);
            fVar = this.f24039c;
            if (!request) {
                break;
            }
            c9 = fVar.c(i9);
            if ((c9 < ((byte) 48) || c9 > ((byte) 57)) && ((c9 < ((byte) 97) || c9 > ((byte) 102)) && (c9 < ((byte) 65) || c9 > ((byte) 70)))) {
                break;
            }
            i9 = i10;
        }
        if (i9 == 0) {
            com.facebook.appevents.g.a(16);
            com.facebook.appevents.g.a(16);
            String num = Integer.toString(c9, 16);
            G7.j.d(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
            throw new NumberFormatException(G7.j.j(num, "Expected leading [0-9a-fA-F] character but was 0x"));
        }
        return fVar.readHexadecimalUnsignedLong();
    }

    @Override // w8.h
    public final int readInt() {
        require(4L);
        return this.f24039c.readInt();
    }

    @Override // w8.h
    public final short readShort() {
        require(2L);
        return this.f24039c.readShort();
    }

    @Override // w8.h
    public final String readString(Charset charset) {
        f fVar = this.f24039c;
        fVar.z(this.b);
        return fVar.readString(fVar.f24014c, charset);
    }

    @Override // w8.h
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // w8.h
    public final boolean request(long j7) {
        boolean z8;
        f fVar;
        if (j7 >= 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            if (!(!this.f24040d)) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                fVar = this.f24039c;
                if (fVar.f24014c >= j7) {
                    return true;
                }
            } while (this.b.read(fVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // w8.h
    public final void require(long j7) {
        if (request(j7)) {
        } else {
            throw new EOFException();
        }
    }

    @Override // w8.h
    public final void skip(long j7) {
        if (!this.f24040d) {
            while (j7 > 0) {
                f fVar = this.f24039c;
                if (fVar.f24014c == 0 && this.b.read(fVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j7, fVar.f24014c);
                fVar.skip(min);
                j7 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // w8.y
    public final A timeout() {
        return this.b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.b + ')';
    }

    @Override // w8.h, w8.g
    public final f y() {
        return this.f24039c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, w8.f] */
    @Override // w8.h
    public final String readUtf8LineStrict(long j7) {
        if (j7 >= 0) {
            long j9 = j7 == Long.MAX_VALUE ? Long.MAX_VALUE : j7 + 1;
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j9);
            f fVar = this.f24039c;
            if (indexOf != -1) {
                return x8.a.a(fVar, indexOf);
            }
            if (j9 < Long.MAX_VALUE && request(j9) && fVar.c(j9 - 1) == ((byte) 13) && request(1 + j9) && fVar.c(j9) == b) {
                return x8.a.a(fVar, j9);
            }
            ?? obj = new Object();
            fVar.b(obj, 0L, Math.min(32, fVar.f24014c));
            throw new EOFException("\\n not found: limit=" + Math.min(fVar.f24014c, j7) + " content=" + obj.readByteString(obj.f24014c).d() + (char) 8230);
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "limit < 0: ").toString());
    }

    @Override // w8.y
    public final long read(f fVar, long j7) {
        G7.j.e(fVar, "sink");
        if (j7 >= 0) {
            if (!this.f24040d) {
                f fVar2 = this.f24039c;
                if (fVar2.f24014c == 0 && this.b.read(fVar2, 8192L) == -1) {
                    return -1L;
                }
                return fVar2.read(fVar, Math.min(j7, fVar2.f24014c));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // w8.h
    public final i readByteString(long j7) {
        require(j7);
        return this.f24039c.readByteString(j7);
    }
}
