package ki;

import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes5.dex */
public final class i implements k, j, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name */
    public f0 f20993b;

    /* renamed from: c, reason: collision with root package name */
    public long f20994c;

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j E(l lVar) {
        v(lVar);
        return this;
    }

    @Override // ki.j
    public final long L(k0 source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j3 = 0;
        while (true) {
            long read = source.read(this, 8192L);
            if (read != -1) {
                j3 += read;
            } else {
                return j3;
            }
        }
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j P(int i10, int i11, String str) {
        X(i10, i11, str);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j S(int i10, int i11, byte[] bArr) {
        u(i10, i11, bArr);
        return this;
    }

    public final i T(long j3) {
        if (j3 == 0) {
            w(48);
        } else {
            long j10 = (j3 >>> 1) | j3;
            long j11 = j10 | (j10 >>> 2);
            long j12 = j11 | (j11 >>> 4);
            long j13 = j12 | (j12 >>> 8);
            long j14 = j13 | (j13 >>> 16);
            long j15 = j14 | (j14 >>> 32);
            long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
            long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
            long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
            long j19 = j18 + (j18 >>> 8);
            long j20 = j19 + (j19 >>> 16);
            int i10 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
            f0 t5 = t(i10);
            int i11 = t5.f20980c;
            for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
                t5.a[i12] = li.a.a[(int) (15 & j3)];
                j3 >>>= 4;
            }
            t5.f20980c += i10;
            this.f20994c += i10;
        }
        return this;
    }

    public final void U(int i10) {
        f0 t5 = t(4);
        int i11 = t5.f20980c;
        int i12 = i11 + 1;
        byte[] bArr = t5.a;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        t5.f20980c = i14 + 1;
        this.f20994c += 4;
    }

    public final void V(int i10) {
        f0 t5 = t(2);
        int i11 = t5.f20980c;
        int i12 = i11 + 1;
        byte[] bArr = t5.a;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        t5.f20980c = i12 + 1;
        this.f20994c += 2;
    }

    public final i W(String string, int i10, int i11, Charset charset) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(charset, "charset");
        boolean z12 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 > string.length()) {
                    z12 = false;
                }
                if (z12) {
                    if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                        X(i10, i11, string);
                        return this;
                    }
                    String substring = string.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                    u(0, bytes.length, bytes);
                    return this;
                }
                StringBuilder m10 = a4.j.m("endIndex > string.length: ", i11, " > ");
                m10.append(string.length());
                throw new IllegalArgumentException(m10.toString().toString());
            }
            throw new IllegalArgumentException(a4.j.e("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(eb.j.i("beginIndex < 0: ", i10).toString());
    }

    public final void X(int i10, int i11, String string) {
        boolean z10;
        boolean z11;
        boolean z12;
        char charAt;
        char c10;
        boolean z13;
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i11 >= i10) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (i11 <= string.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    while (i10 < i11) {
                        char charAt2 = string.charAt(i10);
                        if (charAt2 < 128) {
                            f0 t5 = t(1);
                            int i12 = t5.f20980c - i10;
                            int min = Math.min(i11, 8192 - i12);
                            int i13 = i10 + 1;
                            byte[] bArr = t5.a;
                            bArr[i10 + i12] = (byte) charAt2;
                            while (true) {
                                i10 = i13;
                                if (i10 >= min || (charAt = string.charAt(i10)) >= 128) {
                                    break;
                                }
                                i13 = i10 + 1;
                                bArr[i10 + i12] = (byte) charAt;
                            }
                            int i14 = t5.f20980c;
                            int i15 = (i12 + i10) - i14;
                            t5.f20980c = i14 + i15;
                            this.f20994c += i15;
                        } else {
                            if (charAt2 < 2048) {
                                f0 t10 = t(2);
                                int i16 = t10.f20980c;
                                byte b3 = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                                byte[] bArr2 = t10.a;
                                bArr2[i16] = b3;
                                bArr2[i16 + 1] = (byte) ((charAt2 & '?') | 128);
                                t10.f20980c = i16 + 2;
                                this.f20994c += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i17 = i10 + 1;
                                if (i17 < i11) {
                                    c10 = string.charAt(i17);
                                } else {
                                    c10 = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c10 && c10 < 57344) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        int i18 = (((charAt2 & 1023) << 10) | (c10 & 1023)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                                        f0 t11 = t(4);
                                        int i19 = t11.f20980c;
                                        byte b10 = (byte) ((i18 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                        byte[] bArr3 = t11.a;
                                        bArr3[i19] = b10;
                                        bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                        bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                        bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                        t11.f20980c = i19 + 4;
                                        this.f20994c += 4;
                                        i10 += 2;
                                    }
                                }
                                w(63);
                                i10 = i17;
                            } else {
                                f0 t12 = t(3);
                                int i20 = t12.f20980c;
                                byte[] bArr4 = t12.a;
                                bArr4[i20] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i20 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i20 + 2] = (byte) ((charAt2 & '?') | 128);
                                t12.f20980c = i20 + 3;
                                this.f20994c += 3;
                            }
                            i10++;
                        }
                    }
                    return;
                }
                StringBuilder m10 = a4.j.m("endIndex > string.length: ", i11, " > ");
                m10.append(string.length());
                throw new IllegalArgumentException(m10.toString().toString());
            }
            throw new IllegalArgumentException(a4.j.e("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        throw new IllegalArgumentException(eb.j.i("beginIndex < 0: ", i10).toString());
    }

    public final void Y(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        X(0, string.length(), string);
    }

    public final void Z(int i10) {
        boolean z10;
        String str;
        if (i10 < 128) {
            w(i10);
            return;
        }
        if (i10 < 2048) {
            f0 t5 = t(2);
            int i11 = t5.f20980c;
            byte b3 = (byte) ((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            byte[] bArr = t5.a;
            bArr[i11] = b3;
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            t5.f20980c = i11 + 2;
            this.f20994c += 2;
            return;
        }
        int i12 = 0;
        if (55296 <= i10 && i10 < 57344) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            w(63);
            return;
        }
        if (i10 < 65536) {
            f0 t10 = t(3);
            int i13 = t10.f20980c;
            byte[] bArr2 = t10.a;
            bArr2[i13] = (byte) ((i10 >> 12) | 224);
            bArr2[i13 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i13 + 2] = (byte) ((i10 & 63) | 128);
            t10.f20980c = i13 + 3;
            this.f20994c += 3;
            return;
        }
        if (i10 <= 1114111) {
            f0 t11 = t(4);
            int i14 = t11.f20980c;
            byte b10 = (byte) ((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            byte[] bArr3 = t11.a;
            bArr3[i14] = b10;
            bArr3[i14 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i14 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i14 + 3] = (byte) ((i10 & 63) | 128);
            t11.f20980c = i14 + 4;
            this.f20994c += 4;
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected code point: 0x");
        if (i10 != 0) {
            char[] cArr = li.b.a;
            char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
            while (i12 < 8 && cArr2[i12] == '0') {
                i12++;
            }
            str = StringsKt.concatToString(cArr2, i12, 8);
        } else {
            str = "0";
        }
        sb2.append(str);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // ki.i0
    public final void a(i source, long j3) {
        boolean z10;
        boolean z11;
        int i10;
        f0 f0Var;
        boolean z12;
        f0 b3;
        int i11;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != this) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            mi.a.c(source.f20994c, 0L, j3);
            while (j3 > 0) {
                f0 f0Var2 = source.f20993b;
                Intrinsics.checkNotNull(f0Var2);
                int i12 = f0Var2.f20980c;
                Intrinsics.checkNotNull(source.f20993b);
                if (j3 < i12 - r3.f20979b) {
                    f0 f0Var3 = this.f20993b;
                    if (f0Var3 != null) {
                        Intrinsics.checkNotNull(f0Var3);
                        f0Var = f0Var3.f20984g;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var != null && f0Var.f20982e) {
                        long j10 = f0Var.f20980c + j3;
                        if (f0Var.f20981d) {
                            i11 = 0;
                        } else {
                            i11 = f0Var.f20979b;
                        }
                        if (j10 - i11 <= 8192) {
                            f0 f0Var4 = source.f20993b;
                            Intrinsics.checkNotNull(f0Var4);
                            f0Var4.d(f0Var, (int) j3);
                            source.f20994c -= j3;
                            this.f20994c += j3;
                            return;
                        }
                    }
                    f0 f0Var5 = source.f20993b;
                    Intrinsics.checkNotNull(f0Var5);
                    int i13 = (int) j3;
                    f0Var5.getClass();
                    if (i13 > 0 && i13 <= f0Var5.f20980c - f0Var5.f20979b) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        if (i13 >= 1024) {
                            b3 = f0Var5.c();
                        } else {
                            b3 = g0.b();
                            int i14 = f0Var5.f20979b;
                            ArraysKt___ArraysJvmKt.copyInto$default(f0Var5.a, b3.a, 0, i14, i14 + i13, 2, (Object) null);
                        }
                        b3.f20980c = b3.f20979b + i13;
                        f0Var5.f20979b += i13;
                        f0 f0Var6 = f0Var5.f20984g;
                        Intrinsics.checkNotNull(f0Var6);
                        f0Var6.b(b3);
                        source.f20993b = b3;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                f0 f0Var7 = source.f20993b;
                Intrinsics.checkNotNull(f0Var7);
                long j11 = f0Var7.f20980c - f0Var7.f20979b;
                source.f20993b = f0Var7.a();
                f0 f0Var8 = this.f20993b;
                if (f0Var8 == null) {
                    this.f20993b = f0Var7;
                    f0Var7.f20984g = f0Var7;
                    f0Var7.f20983f = f0Var7;
                } else {
                    Intrinsics.checkNotNull(f0Var8);
                    f0 f0Var9 = f0Var8.f20984g;
                    Intrinsics.checkNotNull(f0Var9);
                    f0Var9.b(f0Var7);
                    f0 f0Var10 = f0Var7.f20984g;
                    if (f0Var10 != f0Var7) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        Intrinsics.checkNotNull(f0Var10);
                        if (f0Var10.f20982e) {
                            int i15 = f0Var7.f20980c - f0Var7.f20979b;
                            f0 f0Var11 = f0Var7.f20984g;
                            Intrinsics.checkNotNull(f0Var11);
                            int i16 = 8192 - f0Var11.f20980c;
                            f0 f0Var12 = f0Var7.f20984g;
                            Intrinsics.checkNotNull(f0Var12);
                            if (f0Var12.f20981d) {
                                i10 = 0;
                            } else {
                                f0 f0Var13 = f0Var7.f20984g;
                                Intrinsics.checkNotNull(f0Var13);
                                i10 = f0Var13.f20979b;
                            }
                            if (i15 <= i16 + i10) {
                                f0 f0Var14 = f0Var7.f20984g;
                                Intrinsics.checkNotNull(f0Var14);
                                f0Var7.d(f0Var14, i15);
                                f0Var7.a();
                                g0.a(f0Var7);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                source.f20994c -= j11;
                this.f20994c += j11;
                j3 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // ki.k
    public final long c(l targetBytes) {
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        return q(0L, targetBytes);
    }

    public final Object clone() {
        i iVar = new i();
        if (this.f20994c != 0) {
            f0 f0Var = this.f20993b;
            Intrinsics.checkNotNull(f0Var);
            f0 c10 = f0Var.c();
            iVar.f20993b = c10;
            c10.f20984g = c10;
            c10.f20983f = c10;
            for (f0 f0Var2 = f0Var.f20983f; f0Var2 != f0Var; f0Var2 = f0Var2.f20983f) {
                f0 f0Var3 = c10.f20984g;
                Intrinsics.checkNotNull(f0Var3);
                Intrinsics.checkNotNull(f0Var2);
                f0Var3.b(f0Var2.c());
            }
            iVar.f20994c = this.f20994c;
        }
        return iVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, ki.i0
    public final void close() {
    }

    public final void d() {
        skip(this.f20994c);
    }

    @Override // ki.k
    public final int e(z options) {
        Intrinsics.checkNotNullParameter(options, "options");
        int c10 = li.a.c(this, options, false);
        if (c10 == -1) {
            return -1;
        }
        skip(options.f21035b[c10].d());
        return c10;
    }

    @Override // ki.j
    public final j emitCompleteSegments() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                long j3 = this.f20994c;
                i iVar = (i) obj;
                if (j3 == iVar.f20994c) {
                    if (j3 != 0) {
                        f0 f0Var = this.f20993b;
                        Intrinsics.checkNotNull(f0Var);
                        f0 f0Var2 = iVar.f20993b;
                        Intrinsics.checkNotNull(f0Var2);
                        int i10 = f0Var.f20979b;
                        int i11 = f0Var2.f20979b;
                        long j10 = 0;
                        while (j10 < this.f20994c) {
                            long min = Math.min(f0Var.f20980c - i10, f0Var2.f20980c - i11);
                            long j11 = 0;
                            while (j11 < min) {
                                int i12 = i10 + 1;
                                byte b3 = f0Var.a[i10];
                                int i13 = i11 + 1;
                                if (b3 == f0Var2.a[i11]) {
                                    j11++;
                                    i11 = i13;
                                    i10 = i12;
                                }
                            }
                            if (i10 == f0Var.f20980c) {
                                f0 f0Var3 = f0Var.f20983f;
                                Intrinsics.checkNotNull(f0Var3);
                                i10 = f0Var3.f20979b;
                                f0Var = f0Var3;
                            }
                            if (i11 == f0Var2.f20980c) {
                                f0Var2 = f0Var2.f20983f;
                                Intrinsics.checkNotNull(f0Var2);
                                i11 = f0Var2.f20979b;
                            }
                            j10 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // ki.k
    public final boolean exhausted() {
        return this.f20994c == 0;
    }

    @Override // ki.k
    public final long f(l bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        return p(0L, bytes);
    }

    @Override // ki.j, ki.i0, java.io.Flushable
    public final void flush() {
    }

    public final long g() {
        long j3 = this.f20994c;
        if (j3 == 0) {
            return 0L;
        }
        f0 f0Var = this.f20993b;
        Intrinsics.checkNotNull(f0Var);
        f0 f0Var2 = f0Var.f20984g;
        Intrinsics.checkNotNull(f0Var2);
        if (f0Var2.f20980c < 8192 && f0Var2.f20982e) {
            j3 -= r3 - f0Var2.f20979b;
        }
        return j3;
    }

    @Override // ki.k
    public final boolean h(l bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int length = bytes.f20997b.length;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (length < 0 || this.f20994c - 0 < length || bytes.f20997b.length - 0 < length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (k(i10 + 0) != bytes.f20997b[0 + i10]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        f0 f0Var = this.f20993b;
        if (f0Var == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = f0Var.f20980c;
            for (int i12 = f0Var.f20979b; i12 < i11; i12++) {
                i10 = (i10 * 31) + f0Var.a[i12];
            }
            f0Var = f0Var.f20983f;
            Intrinsics.checkNotNull(f0Var);
        } while (f0Var != this.f20993b);
        return i10;
    }

    public final long indexOf(byte b3, long j3, long j10) {
        f0 f0Var;
        long j11 = j3;
        long j12 = j10;
        long j13 = 0;
        boolean z10 = false;
        if (0 <= j11 && j11 <= j12) {
            z10 = true;
        }
        if (z10) {
            long j14 = this.f20994c;
            if (j12 > j14) {
                j12 = j14;
            }
            if (j11 != j12 && (f0Var = this.f20993b) != null) {
                if (j14 - j11 < j11) {
                    while (j14 > j11) {
                        f0Var = f0Var.f20984g;
                        Intrinsics.checkNotNull(f0Var);
                        j14 -= f0Var.f20980c - f0Var.f20979b;
                    }
                    while (j14 < j12) {
                        byte[] bArr = f0Var.a;
                        int min = (int) Math.min(f0Var.f20980c, (f0Var.f20979b + j12) - j14);
                        for (int i10 = (int) ((f0Var.f20979b + j11) - j14); i10 < min; i10++) {
                            if (bArr[i10] == b3) {
                                return (i10 - f0Var.f20979b) + j14;
                            }
                        }
                        j14 += f0Var.f20980c - f0Var.f20979b;
                        f0Var = f0Var.f20983f;
                        Intrinsics.checkNotNull(f0Var);
                        j11 = j14;
                    }
                } else {
                    while (true) {
                        long j15 = (f0Var.f20980c - f0Var.f20979b) + j13;
                        if (j15 > j11) {
                            break;
                        }
                        f0Var = f0Var.f20983f;
                        Intrinsics.checkNotNull(f0Var);
                        j13 = j15;
                    }
                    while (j13 < j12) {
                        byte[] bArr2 = f0Var.a;
                        int min2 = (int) Math.min(f0Var.f20980c, (f0Var.f20979b + j12) - j13);
                        for (int i11 = (int) ((f0Var.f20979b + j11) - j13); i11 < min2; i11++) {
                            if (bArr2[i11] == b3) {
                                return (i11 - f0Var.f20979b) + j13;
                            }
                        }
                        j13 += f0Var.f20980c - f0Var.f20979b;
                        f0Var = f0Var.f20983f;
                        Intrinsics.checkNotNull(f0Var);
                        j11 = j13;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f20994c + " fromIndex=" + j11 + " toIndex=" + j12).toString());
    }

    @Override // ki.k
    public final g inputStream() {
        return new g(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final void j(long j3, long j10, i out) {
        Intrinsics.checkNotNullParameter(out, "out");
        mi.a.c(this.f20994c, j3, j10);
        if (j10 != 0) {
            out.f20994c += j10;
            f0 f0Var = this.f20993b;
            while (true) {
                Intrinsics.checkNotNull(f0Var);
                long j11 = f0Var.f20980c - f0Var.f20979b;
                if (j3 < j11) {
                    break;
                }
                j3 -= j11;
                f0Var = f0Var.f20983f;
            }
            while (j10 > 0) {
                Intrinsics.checkNotNull(f0Var);
                f0 c10 = f0Var.c();
                int i10 = c10.f20979b + ((int) j3);
                c10.f20979b = i10;
                c10.f20980c = Math.min(i10 + ((int) j10), c10.f20980c);
                f0 f0Var2 = out.f20993b;
                if (f0Var2 == null) {
                    c10.f20984g = c10;
                    c10.f20983f = c10;
                    out.f20993b = c10;
                } else {
                    Intrinsics.checkNotNull(f0Var2);
                    f0 f0Var3 = f0Var2.f20984g;
                    Intrinsics.checkNotNull(f0Var3);
                    f0Var3.b(c10);
                }
                j10 -= c10.f20980c - c10.f20979b;
                f0Var = f0Var.f20983f;
                j3 = 0;
            }
        }
    }

    public final byte k(long j3) {
        mi.a.c(this.f20994c, j3, 1L);
        f0 f0Var = this.f20993b;
        if (f0Var != null) {
            long j10 = this.f20994c;
            if (j10 - j3 < j3) {
                while (j10 > j3) {
                    f0Var = f0Var.f20984g;
                    Intrinsics.checkNotNull(f0Var);
                    j10 -= f0Var.f20980c - f0Var.f20979b;
                }
                Intrinsics.checkNotNull(f0Var);
                return f0Var.a[(int) ((f0Var.f20979b + j3) - j10)];
            }
            long j11 = 0;
            while (true) {
                long j12 = (f0Var.f20980c - f0Var.f20979b) + j11;
                if (j12 <= j3) {
                    f0Var = f0Var.f20983f;
                    Intrinsics.checkNotNull(f0Var);
                    j11 = j12;
                } else {
                    Intrinsics.checkNotNull(f0Var);
                    return f0Var.a[(int) ((f0Var.f20979b + j3) - j11)];
                }
            }
        } else {
            Intrinsics.checkNotNull(null);
            throw null;
        }
    }

    @Override // ki.k
    public final long l(i sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j3 = this.f20994c;
        if (j3 > 0) {
            sink.a(this, j3);
        }
        return j3;
    }

    public final long p(long j3, l bytes) {
        boolean z10;
        long j10 = j3;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        boolean z11 = true;
        if (bytes.f20997b.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long j11 = 0;
            if (j10 < 0) {
                z11 = false;
            }
            if (z11) {
                f0 f0Var = this.f20993b;
                if (f0Var != null) {
                    long j12 = this.f20994c;
                    if (j12 - j10 < j10) {
                        while (j12 > j10) {
                            f0Var = f0Var.f20984g;
                            Intrinsics.checkNotNull(f0Var);
                            j12 -= f0Var.f20980c - f0Var.f20979b;
                        }
                        byte[] bArr = bytes.f20997b;
                        byte b3 = bArr[0];
                        int length = bArr.length;
                        long j13 = (this.f20994c - length) + 1;
                        while (j12 < j13) {
                            byte[] bArr2 = f0Var.a;
                            long j14 = j13;
                            int min = (int) Math.min(f0Var.f20980c, (f0Var.f20979b + j13) - j12);
                            for (int i10 = (int) ((f0Var.f20979b + j10) - j12); i10 < min; i10++) {
                                if (bArr2[i10] == b3 && li.a.a(f0Var, i10 + 1, bArr, length)) {
                                    return (i10 - f0Var.f20979b) + j12;
                                }
                            }
                            j12 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j10 = j12;
                            j13 = j14;
                        }
                    } else {
                        while (true) {
                            long j15 = (f0Var.f20980c - f0Var.f20979b) + j11;
                            if (j15 > j10) {
                                break;
                            }
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j11 = j15;
                        }
                        byte[] bArr3 = bytes.f20997b;
                        byte b10 = bArr3[0];
                        int length2 = bArr3.length;
                        long j16 = (this.f20994c - length2) + 1;
                        while (j11 < j16) {
                            byte[] bArr4 = f0Var.a;
                            long j17 = j16;
                            int min2 = (int) Math.min(f0Var.f20980c, (f0Var.f20979b + j16) - j11);
                            for (int i11 = (int) ((f0Var.f20979b + j10) - j11); i11 < min2; i11++) {
                                if (bArr4[i11] == b10 && li.a.a(f0Var, i11 + 1, bArr3, length2)) {
                                    return (i11 - f0Var.f20979b) + j11;
                                }
                            }
                            j11 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j10 = j11;
                            j16 = j17;
                        }
                    }
                }
                return -1L;
            }
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("fromIndex < 0: ", j10).toString());
        }
        throw new IllegalArgumentException("bytes is empty".toString());
    }

    public final long q(long j3, l targetBytes) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long j10 = 0;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f0 f0Var = this.f20993b;
            if (f0Var != null) {
                long j11 = this.f20994c;
                if (j11 - j3 < j3) {
                    while (j11 > j3) {
                        f0Var = f0Var.f20984g;
                        Intrinsics.checkNotNull(f0Var);
                        j11 -= f0Var.f20980c - f0Var.f20979b;
                    }
                    byte[] bArr = targetBytes.f20997b;
                    if (bArr.length == 2) {
                        byte b3 = bArr[0];
                        byte b10 = bArr[1];
                        while (j11 < this.f20994c) {
                            byte[] bArr2 = f0Var.a;
                            i12 = (int) ((f0Var.f20979b + j3) - j11);
                            int i14 = f0Var.f20980c;
                            while (i12 < i14) {
                                byte b11 = bArr2[i12];
                                if (b11 != b3 && b11 != b10) {
                                    i12++;
                                } else {
                                    i13 = f0Var.f20979b;
                                    return (i12 - i13) + j11;
                                }
                            }
                            j11 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j3 = j11;
                        }
                    } else {
                        while (j11 < this.f20994c) {
                            byte[] bArr3 = f0Var.a;
                            i12 = (int) ((f0Var.f20979b + j3) - j11);
                            int i15 = f0Var.f20980c;
                            while (i12 < i15) {
                                byte b12 = bArr3[i12];
                                for (byte b13 : bArr) {
                                    if (b12 == b13) {
                                        i13 = f0Var.f20979b;
                                        return (i12 - i13) + j11;
                                    }
                                }
                                i12++;
                            }
                            j11 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j3 = j11;
                        }
                    }
                } else {
                    while (true) {
                        long j12 = (f0Var.f20980c - f0Var.f20979b) + j10;
                        if (j12 > j3) {
                            break;
                        }
                        f0Var = f0Var.f20983f;
                        Intrinsics.checkNotNull(f0Var);
                        j10 = j12;
                    }
                    byte[] bArr4 = targetBytes.f20997b;
                    if (bArr4.length == 2) {
                        byte b14 = bArr4[0];
                        byte b15 = bArr4[1];
                        while (j10 < this.f20994c) {
                            byte[] bArr5 = f0Var.a;
                            i10 = (int) ((f0Var.f20979b + j3) - j10);
                            int i16 = f0Var.f20980c;
                            while (i10 < i16) {
                                byte b16 = bArr5[i10];
                                if (b16 != b14 && b16 != b15) {
                                    i10++;
                                } else {
                                    i11 = f0Var.f20979b;
                                    return (i10 - i11) + j10;
                                }
                            }
                            j10 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j3 = j10;
                        }
                    } else {
                        while (j10 < this.f20994c) {
                            byte[] bArr6 = f0Var.a;
                            i10 = (int) ((f0Var.f20979b + j3) - j10);
                            int i17 = f0Var.f20980c;
                            while (i10 < i17) {
                                byte b17 = bArr6[i10];
                                for (byte b18 : bArr4) {
                                    if (b17 == b18) {
                                        i11 = f0Var.f20979b;
                                        return (i10 - i11) + j10;
                                    }
                                }
                                i10++;
                            }
                            j10 += f0Var.f20980c - f0Var.f20979b;
                            f0Var = f0Var.f20983f;
                            Intrinsics.checkNotNull(f0Var);
                            j3 = j10;
                        }
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("fromIndex < 0: ", j3).toString());
    }

    public final l r() {
        boolean z10;
        long j3 = this.f20994c;
        if (j3 <= 2147483647L) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return s((int) j3);
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f20994c).toString());
    }

    @Override // ki.k0
    public final long read(i sink, long j3) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j3 >= 0) {
            long j10 = this.f20994c;
            if (j10 == 0) {
                return -1L;
            }
            if (j3 > j10) {
                j3 = j10;
            }
            sink.a(this, j3);
            return j3;
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount < 0: ", j3).toString());
    }

    @Override // ki.k
    public final byte readByte() {
        if (this.f20994c != 0) {
            f0 f0Var = this.f20993b;
            Intrinsics.checkNotNull(f0Var);
            int i10 = f0Var.f20979b;
            int i11 = f0Var.f20980c;
            int i12 = i10 + 1;
            byte b3 = f0Var.a[i10];
            this.f20994c--;
            if (i12 == i11) {
                this.f20993b = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f20979b = i12;
            }
            return b3;
        }
        throw new EOFException();
    }

    @Override // ki.k
    public final byte[] readByteArray() {
        return readByteArray(this.f20994c);
    }

    @Override // ki.k
    public final l readByteString() {
        return readByteString(this.f20994c);
    }

    public final long readDecimalLong() {
        int i10;
        String str;
        long j3 = 0;
        if (this.f20994c != 0) {
            long j10 = -7;
            int i11 = 0;
            boolean z10 = false;
            boolean z11 = false;
            do {
                f0 f0Var = this.f20993b;
                Intrinsics.checkNotNull(f0Var);
                byte[] bArr = f0Var.a;
                int i12 = f0Var.f20979b;
                int i13 = f0Var.f20980c;
                while (i12 < i13) {
                    byte b3 = bArr[i12];
                    if (b3 >= 48 && b3 <= 57) {
                        int i14 = 48 - b3;
                        if (j3 >= -922337203685477580L && (j3 != -922337203685477580L || i14 >= j10)) {
                            j3 = (j3 * 10) + i14;
                        } else {
                            i iVar = new i();
                            iVar.x(j3);
                            iVar.w(b3);
                            if (!z10) {
                                iVar.readByte();
                            }
                            throw new NumberFormatException("Number too large: ".concat(iVar.readUtf8()));
                        }
                    } else if (b3 == 45 && i11 == 0) {
                        j10--;
                        z10 = true;
                    } else {
                        z11 = true;
                        break;
                    }
                    i12++;
                    i11++;
                }
                if (i12 == i13) {
                    this.f20993b = f0Var.a();
                    g0.a(f0Var);
                } else {
                    f0Var.f20979b = i12;
                }
                if (z11) {
                    break;
                }
            } while (this.f20993b != null);
            long j11 = this.f20994c - i11;
            this.f20994c = j11;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            if (i11 < i10) {
                if (j11 != 0) {
                    if (z10) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder n10 = eb.j.n(str, " but was 0x");
                    byte k10 = k(0L);
                    char[] cArr = li.b.a;
                    n10.append(StringsKt.concatToString(new char[]{cArr[(k10 >> 4) & 15], cArr[k10 & Ascii.SI]}));
                    throw new NumberFormatException(n10.toString());
                }
                throw new EOFException();
            }
            if (!z10) {
                return -j3;
            }
            return j3;
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[EDGE_INSN: B:41:0x00ab->B:38:0x00ab BREAK  A[LOOP:0: B:4:0x000c->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    @Override // ki.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            long r0 = r15.f20994c
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb2
            r0 = 0
            r1 = r0
            r4 = r1
            r5 = r2
        Lc:
            ki.f0 r7 = r15.f20993b
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            byte[] r8 = r7.a
            int r9 = r7.f20979b
            int r10 = r7.f20980c
        L17:
            if (r9 >= r10) goto L97
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3d
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-97)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L68
            r12 = 70
            if (r11 > r12) goto L68
            int r12 = r11 + (-65)
        L3b:
            int r12 = r12 + 10
        L3d:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r5
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4d
            r11 = 4
            long r5 = r5 << r11
            long r11 = (long) r12
            long r5 = r5 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4d:
            ki.i r0 = new ki.i
            r0.<init>()
            r0.T(r5)
            r0.w(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.readUtf8()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L68:
            r4 = 1
            if (r1 == 0) goto L6c
            goto L97
        L6c:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r2.<init>(r3)
            r3 = 2
            char[] r3 = new char[r3]
            char[] r5 = li.b.a
            int r6 = r11 >> 4
            r6 = r6 & 15
            char r6 = r5[r6]
            r3[r0] = r6
            r0 = r11 & 15
            char r0 = r5[r0]
            r3[r4] = r0
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L97:
            if (r9 != r10) goto La3
            ki.f0 r8 = r7.a()
            r15.f20993b = r8
            ki.g0.a(r7)
            goto La5
        La3:
            r7.f20979b = r9
        La5:
            if (r4 != 0) goto Lab
            ki.f0 r7 = r15.f20993b
            if (r7 != 0) goto Lc
        Lab:
            long r2 = r15.f20994c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f20994c = r2
            return r5
        Lb2:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.i.readHexadecimalUnsignedLong():long");
    }

    @Override // ki.k
    public final int readInt() {
        if (this.f20994c >= 4) {
            f0 f0Var = this.f20993b;
            Intrinsics.checkNotNull(f0Var);
            int i10 = f0Var.f20979b;
            int i11 = f0Var.f20980c;
            if (i11 - i10 < 4) {
                return ((readByte() & UByte.MAX_VALUE) << 24) | ((readByte() & UByte.MAX_VALUE) << 16) | ((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE);
            }
            int i12 = i10 + 1;
            byte[] bArr = f0Var.a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i12] & UByte.MAX_VALUE) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & UByte.MAX_VALUE) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & UByte.MAX_VALUE);
            this.f20994c -= 4;
            if (i17 == i11) {
                this.f20993b = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f20979b = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // ki.k
    public final int readIntLe() {
        int readInt = readInt();
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // ki.k
    public final long readLongLe() {
        long j3;
        if (this.f20994c >= 8) {
            f0 f0Var = this.f20993b;
            Intrinsics.checkNotNull(f0Var);
            int i10 = f0Var.f20979b;
            int i11 = f0Var.f20980c;
            if (i11 - i10 < 8) {
                j3 = ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            } else {
                byte[] bArr = f0Var.a;
                int i12 = i10 + 1 + 1;
                long j10 = ((bArr[i10] & 255) << 56) | ((bArr[r6] & 255) << 48);
                long j11 = j10 | ((bArr[i12] & 255) << 40);
                long j12 = j11 | ((bArr[r6] & 255) << 32);
                long j13 = j12 | ((bArr[r4] & 255) << 24);
                long j14 = j13 | ((bArr[r6] & 255) << 16);
                long j15 = j14 | ((bArr[r4] & 255) << 8);
                int i13 = i12 + 1 + 1 + 1 + 1 + 1 + 1;
                long j16 = j15 | (bArr[r6] & 255);
                this.f20994c -= 8;
                if (i13 == i11) {
                    this.f20993b = f0Var.a();
                    g0.a(f0Var);
                } else {
                    f0Var.f20979b = i13;
                }
                j3 = j16;
            }
            return ((j3 & 255) << 56) | (((-72057594037927936L) & j3) >>> 56) | ((71776119061217280L & j3) >>> 40) | ((280375465082880L & j3) >>> 24) | ((1095216660480L & j3) >>> 8) | ((4278190080L & j3) << 8) | ((16711680 & j3) << 24) | ((65280 & j3) << 40);
        }
        throw new EOFException();
    }

    @Override // ki.k
    public final short readShort() {
        if (this.f20994c >= 2) {
            f0 f0Var = this.f20993b;
            Intrinsics.checkNotNull(f0Var);
            int i10 = f0Var.f20979b;
            int i11 = f0Var.f20980c;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & UByte.MAX_VALUE) << 8) | (readByte() & UByte.MAX_VALUE));
            }
            int i12 = i10 + 1;
            byte[] bArr = f0Var.a;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & UByte.MAX_VALUE) << 8) | (bArr[i12] & UByte.MAX_VALUE);
            this.f20994c -= 2;
            if (i13 == i11) {
                this.f20993b = f0Var.a();
                g0.a(f0Var);
            } else {
                f0Var.f20979b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    public final short readShortLe() {
        int readShort = readShort() & UShort.MAX_VALUE;
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // ki.k
    public final String readString(Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        return readString(this.f20994c, charset);
    }

    public final String readUtf8() {
        return readString(this.f20994c, Charsets.UTF_8);
    }

    @Override // ki.k
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // ki.k
    public final boolean request(long j3) {
        return this.f20994c >= j3;
    }

    @Override // ki.k
    public final void require(long j3) {
        if (this.f20994c < j3) {
            throw new EOFException();
        }
    }

    public final l s(int i10) {
        if (i10 == 0) {
            return l.f20996f;
        }
        mi.a.c(this.f20994c, 0L, i10);
        f0 f0Var = this.f20993b;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(f0Var);
            int i14 = f0Var.f20980c;
            int i15 = f0Var.f20979b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                f0Var = f0Var.f20983f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13];
        int[] iArr = new int[i13 * 2];
        f0 f0Var2 = this.f20993b;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(f0Var2);
            bArr[i16] = f0Var2.a;
            i11 += f0Var2.f20980c - f0Var2.f20979b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = f0Var2.f20979b;
            f0Var2.f20981d = true;
            i16++;
            f0Var2 = f0Var2.f20983f;
        }
        return new h0(bArr, iArr);
    }

    @Override // ki.k
    public final void skip(long j3) {
        while (j3 > 0) {
            f0 f0Var = this.f20993b;
            if (f0Var != null) {
                int min = (int) Math.min(j3, f0Var.f20980c - f0Var.f20979b);
                long j10 = min;
                this.f20994c -= j10;
                j3 -= j10;
                int i10 = f0Var.f20979b + min;
                f0Var.f20979b = i10;
                if (i10 == f0Var.f20980c) {
                    this.f20993b = f0Var.a();
                    g0.a(f0Var);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final f0 t(int i10) {
        boolean z10 = true;
        if (i10 < 1 || i10 > 8192) {
            z10 = false;
        }
        if (z10) {
            f0 f0Var = this.f20993b;
            if (f0Var == null) {
                f0 b3 = g0.b();
                this.f20993b = b3;
                b3.f20984g = b3;
                b3.f20983f = b3;
                return b3;
            }
            Intrinsics.checkNotNull(f0Var);
            f0 f0Var2 = f0Var.f20984g;
            Intrinsics.checkNotNull(f0Var2);
            if (f0Var2.f20980c + i10 <= 8192 && f0Var2.f20982e) {
                return f0Var2;
            }
            f0 b10 = g0.b();
            f0Var2.b(b10);
            return b10;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    @Override // ki.k0
    public final m0 timeout() {
        return m0.f21003d;
    }

    public final String toString() {
        return r().toString();
    }

    public final void u(int i10, int i11, byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j3 = i11;
        mi.a.c(source.length, i10, j3);
        int i12 = i11 + i10;
        while (i10 < i12) {
            f0 t5 = t(1);
            int min = Math.min(i12 - i10, 8192 - t5.f20980c);
            int i13 = i10 + min;
            ArraysKt.copyInto(source, t5.a, t5.f20980c, i10, i13);
            t5.f20980c += min;
            i10 = i13;
        }
        this.f20994c += j3;
    }

    public final void v(l byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.r(this, byteString.d());
    }

    public final void w(int i10) {
        f0 t5 = t(1);
        int i11 = t5.f20980c;
        t5.f20980c = i11 + 1;
        t5.a[i11] = (byte) i10;
        this.f20994c++;
    }

    @Override // ki.j
    public final j write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        u(0, source.length, source);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeByte(int i10) {
        w(i10);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeDecimalLong(long j3) {
        x(j3);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeHexadecimalUnsignedLong(long j3) {
        T(j3);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeInt(int i10) {
        U(i10);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeShort(int i10) {
        V(i10);
        return this;
    }

    @Override // ki.j
    public final /* bridge */ /* synthetic */ j writeUtf8(String str) {
        Y(str);
        return this;
    }

    public final i x(long j3) {
        boolean z10;
        byte[] bArr;
        if (j3 == 0) {
            w(48);
        } else {
            int i10 = 1;
            if (j3 < 0) {
                j3 = -j3;
                if (j3 < 0) {
                    Y("-9223372036854775808");
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            if (j3 < 100000000) {
                if (j3 < 10000) {
                    if (j3 < 100) {
                        if (j3 >= 10) {
                            i10 = 2;
                        }
                    } else if (j3 < 1000) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (j3 < 1000000) {
                    if (j3 < 100000) {
                        i10 = 5;
                    } else {
                        i10 = 6;
                    }
                } else if (j3 < 10000000) {
                    i10 = 7;
                } else {
                    i10 = 8;
                }
            } else if (j3 < 1000000000000L) {
                if (j3 < 10000000000L) {
                    if (j3 < C.NANOS_PER_SECOND) {
                        i10 = 9;
                    } else {
                        i10 = 10;
                    }
                } else if (j3 < 100000000000L) {
                    i10 = 11;
                } else {
                    i10 = 12;
                }
            } else if (j3 < 1000000000000000L) {
                if (j3 < 10000000000000L) {
                    i10 = 13;
                } else if (j3 < 100000000000000L) {
                    i10 = 14;
                } else {
                    i10 = 15;
                }
            } else if (j3 < 100000000000000000L) {
                if (j3 < 10000000000000000L) {
                    i10 = 16;
                } else {
                    i10 = 17;
                }
            } else if (j3 < 1000000000000000000L) {
                i10 = 18;
            } else {
                i10 = 19;
            }
            if (z10) {
                i10++;
            }
            f0 t5 = t(i10);
            int i11 = t5.f20980c + i10;
            while (true) {
                bArr = t5.a;
                if (j3 == 0) {
                    break;
                }
                long j10 = 10;
                i11--;
                bArr[i11] = li.a.a[(int) (j3 % j10)];
                j3 /= j10;
            }
            if (z10) {
                bArr[i11 - 1] = 45;
            }
            t5.f20980c += i10;
            this.f20994c += i10;
        }
        return this;
    }

    @Override // ki.k
    public final i y() {
        return this;
    }

    public final String readString(long j3, Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (!(j3 >= 0 && j3 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount: ", j3).toString());
        }
        if (this.f20994c < j3) {
            throw new EOFException();
        }
        if (j3 == 0) {
            return "";
        }
        f0 f0Var = this.f20993b;
        Intrinsics.checkNotNull(f0Var);
        int i10 = f0Var.f20979b;
        if (i10 + j3 > f0Var.f20980c) {
            return new String(readByteArray(j3), charset);
        }
        int i11 = (int) j3;
        String str = new String(f0Var.a, i10, i11, charset);
        int i12 = f0Var.f20979b + i11;
        f0Var.f20979b = i12;
        this.f20994c -= j3;
        if (i12 == f0Var.f20980c) {
            this.f20993b = f0Var.a();
            g0.a(f0Var);
        }
        return str;
    }

    public final String readUtf8(long j3) {
        return readString(j3, Charsets.UTF_8);
    }

    @Override // ki.k
    public final String readUtf8LineStrict(long j3) {
        if (j3 >= 0) {
            long j10 = j3 != Long.MAX_VALUE ? j3 + 1 : Long.MAX_VALUE;
            long indexOf = indexOf((byte) 10, 0L, j10);
            if (indexOf != -1) {
                return li.a.b(this, indexOf);
            }
            if (j10 < this.f20994c && k(j10 - 1) == 13 && k(j10) == 10) {
                return li.a.b(this, j10);
            }
            i iVar = new i();
            j(0L, Math.min(32, this.f20994c), iVar);
            throw new EOFException("\\n not found: limit=" + Math.min(this.f20994c, j3) + " content=" + iVar.readByteString().e() + Typography.ellipsis);
        }
        throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("limit < 0: ", j3).toString());
    }

    public final byte[] readByteArray(long j3) {
        int i10 = 0;
        if (!(j3 >= 0 && j3 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount: ", j3).toString());
        }
        if (this.f20994c >= j3) {
            int i11 = (int) j3;
            byte[] sink = new byte[i11];
            Intrinsics.checkNotNullParameter(sink, "sink");
            while (i10 < i11) {
                int read = read(sink, i10, i11 - i10);
                if (read == -1) {
                    throw new EOFException();
                }
                i10 += read;
            }
            return sink;
        }
        throw new EOFException();
    }

    @Override // ki.k
    public final l readByteString(long j3) {
        if (!(j3 >= 0 && j3 <= 2147483647L)) {
            throw new IllegalArgumentException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("byteCount: ", j3).toString());
        }
        if (this.f20994c < j3) {
            throw new EOFException();
        }
        if (j3 >= 4096) {
            l s5 = s((int) j3);
            skip(j3);
            return s5;
        }
        return new l(readByteArray(j3));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        int remaining = source.remaining();
        int i10 = remaining;
        while (i10 > 0) {
            f0 t5 = t(1);
            int min = Math.min(i10, 8192 - t5.f20980c);
            source.get(t5.a, t5.f20980c, min);
            i10 -= min;
            t5.f20980c += min;
        }
        this.f20994c += remaining;
        return remaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        f0 f0Var = this.f20993b;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), f0Var.f20980c - f0Var.f20979b);
        sink.put(f0Var.a, f0Var.f20979b, min);
        int i10 = f0Var.f20979b + min;
        f0Var.f20979b = i10;
        this.f20994c -= min;
        if (i10 == f0Var.f20980c) {
            this.f20993b = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }

    public final int read(byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        mi.a.c(sink.length, i10, i11);
        f0 f0Var = this.f20993b;
        if (f0Var == null) {
            return -1;
        }
        int min = Math.min(i11, f0Var.f20980c - f0Var.f20979b);
        int i12 = f0Var.f20979b;
        ArraysKt.copyInto(f0Var.a, sink, i10, i12, i12 + min);
        int i13 = f0Var.f20979b + min;
        f0Var.f20979b = i13;
        this.f20994c -= min;
        if (i13 == f0Var.f20980c) {
            this.f20993b = f0Var.a();
            g0.a(f0Var);
        }
        return min;
    }
}
