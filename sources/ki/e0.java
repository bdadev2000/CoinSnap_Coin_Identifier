package ki;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class e0 implements k {

    /* renamed from: b, reason: collision with root package name */
    public final k0 f20976b;

    /* renamed from: c, reason: collision with root package name */
    public final i f20977c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20978d;

    public e0(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f20976b = source;
        this.f20977c = new i();
    }

    @Override // ki.k
    public final long c(l targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!this.f20978d) {
            long j3 = 0;
            while (true) {
                i iVar = this.f20977c;
                long q10 = iVar.q(j3, targetBytes);
                if (q10 == -1) {
                    long j10 = iVar.f20994c;
                    if (this.f20976b.read(iVar, 8192L) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, j10);
                } else {
                    return q10;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f20978d) {
            this.f20978d = true;
            this.f20976b.close();
            this.f20977c.d();
        }
    }

    public final e0 d() {
        return a6.k.f(new c0(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:?, code lost:
    
        return -1;
     */
    @Override // ki.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(ki.z r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r7.f20978d
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L36
        Lb:
            ki.i r0 = r7.f20977c
            int r2 = li.a.c(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L26
            if (r2 == r4) goto L24
            ki.l[] r8 = r8.f21035b
            r8 = r8[r2]
            int r8 = r8.d()
            long r3 = (long) r8
            r0.skip(r3)
            goto L35
        L24:
            r2 = r4
            goto L35
        L26:
            ki.k0 r2 = r7.f20976b
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
        throw new UnsupportedOperationException("Method not decompiled: ki.e0.e(ki.z):int");
    }

    @Override // ki.k
    public final boolean exhausted() {
        if (!this.f20978d) {
            i iVar = this.f20977c;
            if (iVar.exhausted() && this.f20976b.read(iVar, 8192L) == -1) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.k
    public final long f(l bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f20978d) {
            long j3 = 0;
            while (true) {
                i iVar = this.f20977c;
                long p10 = iVar.p(j3, bytes);
                if (p10 == -1) {
                    long j10 = iVar.f20994c;
                    if (this.f20976b.read(iVar, 8192L) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, (j10 - bytes.f20997b.length) + 1);
                } else {
                    return p10;
                }
            }
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // ki.k
    public final boolean h(l bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.f20997b.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!this.f20978d) {
            if (length >= 0 && bytes.f20997b.length - 0 >= length) {
                for (int i10 = 0; i10 < length; i10++) {
                    long j3 = i10 + 0;
                    if (request(1 + j3)) {
                        if (this.f20977c.k(j3) == bytes.f20997b[0 + i10]) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long indexOf(byte b3, long j3, long j10) {
        boolean z10 = true;
        if (!this.f20978d) {
            long j11 = 0;
            if (0 > j10) {
                z10 = false;
            }
            if (z10) {
                while (j11 < j10) {
                    long indexOf = this.f20977c.indexOf(b3, j11, j10);
                    if (indexOf != -1) {
                        return indexOf;
                    }
                    i iVar = this.f20977c;
                    long j12 = iVar.f20994c;
                    if (j12 >= j10 || this.f20976b.read(iVar, 8192L) == -1) {
                        return -1L;
                    }
                    j11 = Math.max(j11, j12);
                }
                return -1L;
            }
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("fromIndex=0 toIndex=", j10).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.k
    public final g inputStream() {
        return new g(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f20978d;
    }

    @Override // ki.k
    public final long l(i sink) {
        i iVar;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = 0;
        while (true) {
            k0 k0Var = this.f20976b;
            iVar = this.f20977c;
            if (k0Var.read(iVar, 8192L) == -1) {
                break;
            }
            long g10 = iVar.g();
            if (g10 > 0) {
                j3 += g10;
                sink.a(iVar, g10);
            }
        }
        long j10 = iVar.f20994c;
        if (j10 > 0) {
            long j11 = j3 + j10;
            sink.a(iVar, j10);
            return j11;
        }
        return j3;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        i iVar = this.f20977c;
        if (iVar.f20994c == 0 && this.f20976b.read(iVar, 8192L) == -1) {
            return -1;
        }
        return iVar.read(sink);
    }

    @Override // ki.k
    public final byte readByte() {
        require(1L);
        return this.f20977c.readByte();
    }

    @Override // ki.k
    public final byte[] readByteArray() {
        k0 k0Var = this.f20976b;
        i iVar = this.f20977c;
        iVar.L(k0Var);
        return iVar.readByteArray();
    }

    @Override // ki.k
    public final l readByteString() {
        k0 k0Var = this.f20976b;
        i iVar = this.f20977c;
        iVar.L(k0Var);
        return iVar.readByteString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (r4 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        r1 = new java.lang.StringBuilder("Expected a digit or '-' but was 0x");
        r2 = java.lang.Integer.toString(r8, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
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
            ki.i r9 = r11.f20977c
            if (r8 == 0) goto L53
            byte r8 = r9.k(r4)
            r10 = 48
            if (r8 < r10) goto L1e
            r10 = 57
            if (r8 <= r10) goto L27
        L1e:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 != 0) goto L29
            r5 = 45
            if (r8 == r5) goto L27
            goto L29
        L27:
            r4 = r6
            goto L8
        L29:
            if (r4 == 0) goto L2c
            goto L53
        L2c:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a digit or '-' but was 0x"
            r1.<init>(r2)
            r2 = 16
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r2 = java.lang.Integer.toString(r8, r2)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L53:
            long r0 = r9.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.e0.readDecimalLong():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
    
        r1 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r2 = java.lang.Integer.toString(r2, kotlin.text.CharsKt.checkRadix(kotlin.text.CharsKt.checkRadix(16)));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "toString(this, checkRadix(radix))");
        r1.append(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        throw new java.lang.NumberFormatException(r1.toString());
     */
    @Override // ki.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.request(r2)
            ki.i r3 = r6.f20977c
            if (r2 == 0) goto L5b
            long r4 = (long) r0
            byte r2 = r3.k(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L5b
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r3)
            r3 = 16
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            int r3 = kotlin.text.CharsKt.checkRadix(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L5b:
            long r0 = r3.readHexadecimalUnsignedLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.e0.readHexadecimalUnsignedLong():long");
    }

    @Override // ki.k
    public final int readInt() {
        require(4L);
        return this.f20977c.readInt();
    }

    @Override // ki.k
    public final int readIntLe() {
        require(4L);
        return this.f20977c.readIntLe();
    }

    @Override // ki.k
    public final long readLongLe() {
        require(8L);
        return this.f20977c.readLongLe();
    }

    @Override // ki.k
    public final short readShort() {
        require(2L);
        return this.f20977c.readShort();
    }

    public final short readShortLe() {
        require(2L);
        return this.f20977c.readShortLe();
    }

    @Override // ki.k
    public final String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        k0 k0Var = this.f20976b;
        i iVar = this.f20977c;
        iVar.L(k0Var);
        return iVar.readString(charset);
    }

    public final String readUtf8(long j3) {
        require(j3);
        return this.f20977c.readUtf8(j3);
    }

    @Override // ki.k
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // ki.k
    public final boolean request(long j3) {
        boolean z10;
        i iVar;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (!(!this.f20978d)) {
                throw new IllegalStateException("closed".toString());
            }
            do {
                iVar = this.f20977c;
                if (iVar.f20994c >= j3) {
                    return true;
                }
            } while (this.f20976b.read(iVar, 8192L) != -1);
            return false;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
    }

    @Override // ki.k
    public final void require(long j3) {
        if (!request(j3)) {
            throw new EOFException();
        }
    }

    @Override // ki.k
    public final void skip(long j3) {
        if (!this.f20978d) {
            while (j3 > 0) {
                i iVar = this.f20977c;
                if (iVar.f20994c == 0 && this.f20976b.read(iVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, iVar.f20994c);
                iVar.skip(min);
                j3 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // ki.k0
    public final m0 timeout() {
        return this.f20976b.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f20976b + ')';
    }

    @Override // ki.k
    public final i y() {
        return this.f20977c;
    }

    @Override // ki.k
    public final String readUtf8LineStrict(long j3) {
        if (j3 >= 0) {
            long j10 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
            long indexOf = indexOf((byte) 10, 0L, j10);
            i iVar = this.f20977c;
            if (indexOf != -1) {
                return li.a.b(iVar, indexOf);
            }
            if (j10 < Long.MAX_VALUE && request(j10) && iVar.k(j10 - 1) == 13 && request(1 + j10) && iVar.k(j10) == 10) {
                return li.a.b(iVar, j10);
            }
            i iVar2 = new i();
            iVar.j(0L, Math.min(32, iVar.f20994c), iVar2);
            throw new EOFException("\\n not found: limit=" + Math.min(iVar.f20994c, j3) + " content=" + iVar2.readByteString().e() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("limit < 0: ", j3).toString());
    }

    @Override // ki.k
    public final l readByteString(long j3) {
        require(j3);
        return this.f20977c.readByteString(j3);
    }

    @Override // ki.k0
    public final long read(i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j3 >= 0) {
            if (!this.f20978d) {
                i iVar = this.f20977c;
                if (iVar.f20994c == 0 && this.f20976b.read(iVar, 8192L) == -1) {
                    return -1L;
                }
                return iVar.read(sink, Math.min(j3, iVar.f20994c));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
    }
}
