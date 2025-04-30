package w8;

import Q7.n0;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import u7.AbstractC2815f;
import y2.AbstractC2947c;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public final class f implements h, g, Cloneable, ByteChannel {
    public u b;

    /* renamed from: c, reason: collision with root package name */
    public long f24014c;

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g A(i iVar) {
        l(iVar);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g B(int i9, int i10, byte[] bArr) {
        m(bArr, i9, i10);
        return this;
    }

    public final long a() {
        long j7 = this.f24014c;
        if (j7 == 0) {
            return 0L;
        }
        u uVar = this.b;
        G7.j.b(uVar);
        u uVar2 = uVar.f24046g;
        G7.j.b(uVar2);
        if (uVar2.f24042c < 8192 && uVar2.f24044e) {
            j7 -= r3 - uVar2.b;
        }
        return j7;
    }

    public final void b(f fVar, long j7, long j9) {
        G7.j.e(fVar, "out");
        AbstractC2947c.h(this.f24014c, j7, j9);
        if (j9 != 0) {
            fVar.f24014c += j9;
            u uVar = this.b;
            while (true) {
                G7.j.b(uVar);
                long j10 = uVar.f24042c - uVar.b;
                if (j7 < j10) {
                    break;
                }
                j7 -= j10;
                uVar = uVar.f24045f;
            }
            while (j9 > 0) {
                G7.j.b(uVar);
                u c9 = uVar.c();
                int i9 = c9.b + ((int) j7);
                c9.b = i9;
                c9.f24042c = Math.min(i9 + ((int) j9), c9.f24042c);
                u uVar2 = fVar.b;
                if (uVar2 == null) {
                    c9.f24046g = c9;
                    c9.f24045f = c9;
                    fVar.b = c9;
                } else {
                    u uVar3 = uVar2.f24046g;
                    G7.j.b(uVar3);
                    uVar3.b(c9);
                }
                j9 -= c9.f24042c - c9.b;
                uVar = uVar.f24045f;
                j7 = 0;
            }
        }
    }

    public final byte c(long j7) {
        AbstractC2947c.h(this.f24014c, j7, 1L);
        u uVar = this.b;
        if (uVar != null) {
            long j9 = this.f24014c;
            if (j9 - j7 < j7) {
                while (j9 > j7) {
                    uVar = uVar.f24046g;
                    G7.j.b(uVar);
                    j9 -= uVar.f24042c - uVar.b;
                }
                return uVar.f24041a[(int) ((uVar.b + j7) - j9)];
            }
            long j10 = 0;
            while (true) {
                int i9 = uVar.f24042c;
                int i10 = uVar.b;
                long j11 = (i9 - i10) + j10;
                if (j11 > j7) {
                    return uVar.f24041a[(int) ((i10 + j7) - j10)];
                }
                uVar = uVar.f24045f;
                G7.j.b(uVar);
                j10 = j11;
            }
        } else {
            G7.j.b(null);
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w8.f] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.f24014c != 0) {
            u uVar = this.b;
            G7.j.b(uVar);
            u c9 = uVar.c();
            obj.b = c9;
            c9.f24046g = c9;
            c9.f24045f = c9;
            for (u uVar2 = uVar.f24045f; uVar2 != uVar; uVar2 = uVar2.f24045f) {
                u uVar3 = c9.f24046g;
                G7.j.b(uVar3);
                G7.j.b(uVar2);
                uVar3.b(uVar2.c());
            }
            obj.f24014c = this.f24014c;
        }
        return obj;
    }

    @Override // w8.x
    public final void d(f fVar, long j7) {
        u uVar;
        u b;
        int i9;
        G7.j.e(fVar, "source");
        if (fVar != this) {
            AbstractC2947c.h(fVar.f24014c, 0L, j7);
            while (j7 > 0) {
                u uVar2 = fVar.b;
                G7.j.b(uVar2);
                int i10 = uVar2.f24042c;
                u uVar3 = fVar.b;
                G7.j.b(uVar3);
                long j9 = i10 - uVar3.b;
                int i11 = 0;
                if (j7 < j9) {
                    u uVar4 = this.b;
                    if (uVar4 != null) {
                        uVar = uVar4.f24046g;
                    } else {
                        uVar = null;
                    }
                    if (uVar != null && uVar.f24044e) {
                        long j10 = uVar.f24042c + j7;
                        if (uVar.f24043d) {
                            i9 = 0;
                        } else {
                            i9 = uVar.b;
                        }
                        if (j10 - i9 <= 8192) {
                            u uVar5 = fVar.b;
                            G7.j.b(uVar5);
                            uVar5.d(uVar, (int) j7);
                            fVar.f24014c -= j7;
                            this.f24014c += j7;
                            return;
                        }
                    }
                    u uVar6 = fVar.b;
                    G7.j.b(uVar6);
                    int i12 = (int) j7;
                    if (i12 > 0 && i12 <= uVar6.f24042c - uVar6.b) {
                        if (i12 >= 1024) {
                            b = uVar6.c();
                        } else {
                            b = v.b();
                            int i13 = uVar6.b;
                            AbstractC2815f.v(uVar6.f24041a, 0, i13, b.f24041a, i13 + i12);
                        }
                        b.f24042c = b.b + i12;
                        uVar6.b += i12;
                        u uVar7 = uVar6.f24046g;
                        G7.j.b(uVar7);
                        uVar7.b(b);
                        fVar.b = b;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                u uVar8 = fVar.b;
                G7.j.b(uVar8);
                long j11 = uVar8.f24042c - uVar8.b;
                fVar.b = uVar8.a();
                u uVar9 = this.b;
                if (uVar9 == null) {
                    this.b = uVar8;
                    uVar8.f24046g = uVar8;
                    uVar8.f24045f = uVar8;
                } else {
                    u uVar10 = uVar9.f24046g;
                    G7.j.b(uVar10);
                    uVar10.b(uVar8);
                    u uVar11 = uVar8.f24046g;
                    if (uVar11 != uVar8) {
                        G7.j.b(uVar11);
                        if (uVar11.f24044e) {
                            int i14 = uVar8.f24042c - uVar8.b;
                            u uVar12 = uVar8.f24046g;
                            G7.j.b(uVar12);
                            int i15 = 8192 - uVar12.f24042c;
                            u uVar13 = uVar8.f24046g;
                            G7.j.b(uVar13);
                            if (!uVar13.f24043d) {
                                u uVar14 = uVar8.f24046g;
                                G7.j.b(uVar14);
                                i11 = uVar14.b;
                            }
                            if (i14 <= i15 + i11) {
                                u uVar15 = uVar8.f24046g;
                                G7.j.b(uVar15);
                                uVar8.d(uVar15, i14);
                                uVar8.a();
                                v.a(uVar8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                fVar.f24014c -= j11;
                this.f24014c += j11;
                j7 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // w8.h
    public final long e(i iVar) {
        G7.j.e(iVar, "targetBytes");
        return h(iVar, 0L);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                long j7 = this.f24014c;
                f fVar = (f) obj;
                if (j7 == fVar.f24014c) {
                    if (j7 != 0) {
                        u uVar = this.b;
                        G7.j.b(uVar);
                        u uVar2 = fVar.b;
                        G7.j.b(uVar2);
                        int i9 = uVar.b;
                        int i10 = uVar2.b;
                        long j9 = 0;
                        while (j9 < this.f24014c) {
                            long min = Math.min(uVar.f24042c - i9, uVar2.f24042c - i10);
                            if (0 < min) {
                                long j10 = 0;
                                do {
                                    j10++;
                                    int i11 = i9 + 1;
                                    byte b = uVar.f24041a[i9];
                                    int i12 = i10 + 1;
                                    if (b == uVar2.f24041a[i10]) {
                                        i10 = i12;
                                        i9 = i11;
                                    }
                                } while (j10 < min);
                            }
                            if (i9 == uVar.f24042c) {
                                u uVar3 = uVar.f24045f;
                                G7.j.b(uVar3);
                                i9 = uVar3.b;
                                uVar = uVar3;
                            }
                            if (i10 == uVar2.f24042c) {
                                uVar2 = uVar2.f24045f;
                                G7.j.b(uVar2);
                                i10 = uVar2.b;
                            }
                            j9 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // w8.h
    public final boolean exhausted() {
        if (this.f24014c == 0) {
            return true;
        }
        return false;
    }

    @Override // w8.h
    public final long f(f fVar) {
        long j7 = this.f24014c;
        if (j7 > 0) {
            fVar.d(this, j7);
        }
        return j7;
    }

    @Override // w8.h
    public final int g(q qVar) {
        G7.j.e(qVar, "options");
        int b = x8.a.b(this, qVar, false);
        if (b == -1) {
            return -1;
        }
        skip(qVar.b[b].c());
        return b;
    }

    public final long h(i iVar, long j7) {
        int i9;
        int i10;
        int i11;
        int i12;
        G7.j.e(iVar, "targetBytes");
        long j9 = 0;
        if (j7 >= 0) {
            u uVar = this.b;
            if (uVar == null) {
                return -1L;
            }
            long j10 = this.f24014c;
            if (j10 - j7 < j7) {
                while (j10 > j7) {
                    uVar = uVar.f24046g;
                    G7.j.b(uVar);
                    j10 -= uVar.f24042c - uVar.b;
                }
                byte[] bArr = iVar.b;
                if (bArr.length == 2) {
                    byte b = bArr[0];
                    byte b8 = bArr[1];
                    while (j10 < this.f24014c) {
                        i11 = (int) ((uVar.b + j7) - j10);
                        int i13 = uVar.f24042c;
                        while (i11 < i13) {
                            byte b9 = uVar.f24041a[i11];
                            if (b9 != b && b9 != b8) {
                                i11++;
                            } else {
                                i12 = uVar.b;
                            }
                        }
                        j10 += uVar.f24042c - uVar.b;
                        uVar = uVar.f24045f;
                        G7.j.b(uVar);
                        j7 = j10;
                    }
                    return -1L;
                }
                while (j10 < this.f24014c) {
                    i11 = (int) ((uVar.b + j7) - j10);
                    int i14 = uVar.f24042c;
                    while (i11 < i14) {
                        byte b10 = uVar.f24041a[i11];
                        int length = bArr.length;
                        int i15 = 0;
                        while (i15 < length) {
                            byte b11 = bArr[i15];
                            i15++;
                            if (b10 == b11) {
                                i12 = uVar.b;
                            }
                        }
                        i11++;
                    }
                    j10 += uVar.f24042c - uVar.b;
                    uVar = uVar.f24045f;
                    G7.j.b(uVar);
                    j7 = j10;
                }
                return -1L;
                return (i11 - i12) + j10;
            }
            while (true) {
                long j11 = (uVar.f24042c - uVar.b) + j9;
                if (j11 > j7) {
                    break;
                }
                uVar = uVar.f24045f;
                G7.j.b(uVar);
                j9 = j11;
            }
            byte[] bArr2 = iVar.b;
            if (bArr2.length == 2) {
                byte b12 = bArr2[0];
                byte b13 = bArr2[1];
                while (j9 < this.f24014c) {
                    i9 = (int) ((uVar.b + j7) - j9);
                    int i16 = uVar.f24042c;
                    while (i9 < i16) {
                        byte b14 = uVar.f24041a[i9];
                        if (b14 != b12 && b14 != b13) {
                            i9++;
                        } else {
                            i10 = uVar.b;
                        }
                    }
                    j9 += uVar.f24042c - uVar.b;
                    uVar = uVar.f24045f;
                    G7.j.b(uVar);
                    j7 = j9;
                }
                return -1L;
            }
            while (j9 < this.f24014c) {
                i9 = (int) ((uVar.b + j7) - j9);
                int i17 = uVar.f24042c;
                while (i9 < i17) {
                    byte b15 = uVar.f24041a[i9];
                    int length2 = bArr2.length;
                    int i18 = 0;
                    while (i18 < length2) {
                        byte b16 = bArr2[i18];
                        i18++;
                        if (b15 == b16) {
                            i10 = uVar.b;
                        }
                    }
                    i9++;
                }
                j9 += uVar.f24042c - uVar.b;
                uVar = uVar.f24045f;
                G7.j.b(uVar);
                j7 = j9;
            }
            return -1L;
            return (i9 - i10) + j9;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "fromIndex < 0: ").toString());
    }

    public final int hashCode() {
        u uVar = this.b;
        if (uVar == null) {
            return 0;
        }
        int i9 = 1;
        do {
            int i10 = uVar.f24042c;
            for (int i11 = uVar.b; i11 < i10; i11++) {
                i9 = (i9 * 31) + uVar.f24041a[i11];
            }
            uVar = uVar.f24045f;
            G7.j.b(uVar);
        } while (uVar != this.b);
        return i9;
    }

    public final i i() {
        boolean z8;
        long j7 = this.f24014c;
        if (j7 <= 2147483647L) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            return j((int) j7);
        }
        throw new IllegalStateException(G7.j.j(Long.valueOf(j7), "size > Int.MAX_VALUE: ").toString());
    }

    public final long indexOf(byte b, long j7, long j9) {
        long j10;
        u uVar;
        long j11 = 0;
        boolean z8 = false;
        if (0 <= j7 && j7 <= j9) {
            z8 = true;
        }
        if (z8) {
            long j12 = this.f24014c;
            if (j9 > j12) {
                j10 = j12;
            } else {
                j10 = j9;
            }
            if (j7 == j10 || (uVar = this.b) == null) {
                return -1L;
            }
            if (j12 - j7 < j7) {
                while (j12 > j7) {
                    uVar = uVar.f24046g;
                    G7.j.b(uVar);
                    j12 -= uVar.f24042c - uVar.b;
                }
                while (j12 < j10) {
                    int min = (int) Math.min(uVar.f24042c, (uVar.b + j10) - j12);
                    for (int i9 = (int) ((uVar.b + j7) - j12); i9 < min; i9++) {
                        if (uVar.f24041a[i9] == b) {
                            return (i9 - uVar.b) + j12;
                        }
                    }
                    j12 += uVar.f24042c - uVar.b;
                    uVar = uVar.f24045f;
                    G7.j.b(uVar);
                    j7 = j12;
                }
                return -1L;
            }
            while (true) {
                long j13 = (uVar.f24042c - uVar.b) + j11;
                if (j13 > j7) {
                    break;
                }
                uVar = uVar.f24045f;
                G7.j.b(uVar);
                j11 = j13;
            }
            while (j11 < j10) {
                int min2 = (int) Math.min(uVar.f24042c, (uVar.b + j10) - j11);
                for (int i10 = (int) ((uVar.b + j7) - j11); i10 < min2; i10++) {
                    if (uVar.f24041a[i10] == b) {
                        return (i10 - uVar.b) + j11;
                    }
                }
                j11 += uVar.f24042c - uVar.b;
                uVar = uVar.f24045f;
                G7.j.b(uVar);
                j7 = j11;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f24014c + " fromIndex=" + j7 + " toIndex=" + j9).toString());
    }

    @Override // w8.h
    public final InputStream inputStream() {
        return new e(this, 0);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final i j(int i9) {
        if (i9 == 0) {
            return i.f24015f;
        }
        AbstractC2947c.h(this.f24014c, 0L, i9);
        u uVar = this.b;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            G7.j.b(uVar);
            int i13 = uVar.f24042c;
            int i14 = uVar.b;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                uVar = uVar.f24045f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12];
        int[] iArr = new int[i12 * 2];
        u uVar2 = this.b;
        int i15 = 0;
        while (i10 < i9) {
            G7.j.b(uVar2);
            bArr[i15] = uVar2.f24041a;
            i10 += uVar2.f24042c - uVar2.b;
            iArr[i15] = Math.min(i10, i9);
            iArr[i15 + i12] = uVar2.b;
            uVar2.f24043d = true;
            i15++;
            uVar2 = uVar2.f24045f;
        }
        return new w(bArr, iArr);
    }

    public final u k(int i9) {
        if (i9 >= 1 && i9 <= 8192) {
            u uVar = this.b;
            if (uVar == null) {
                u b = v.b();
                this.b = b;
                b.f24046g = b;
                b.f24045f = b;
                return b;
            }
            u uVar2 = uVar.f24046g;
            G7.j.b(uVar2);
            if (uVar2.f24042c + i9 <= 8192 && uVar2.f24044e) {
                return uVar2;
            }
            u b8 = v.b();
            uVar2.b(b8);
            return b8;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void l(i iVar) {
        G7.j.e(iVar, "byteString");
        iVar.k(this, iVar.c());
    }

    public final void m(byte[] bArr, int i9, int i10) {
        G7.j.e(bArr, "source");
        long j7 = i10;
        AbstractC2947c.h(bArr.length, i9, j7);
        int i11 = i10 + i9;
        while (i9 < i11) {
            u k6 = k(1);
            int min = Math.min(i11 - i9, 8192 - k6.f24042c);
            int i12 = i9 + min;
            AbstractC2815f.v(bArr, k6.f24042c, i9, k6.f24041a, i12);
            k6.f24042c += min;
            i9 = i12;
        }
        this.f24014c += j7;
    }

    public final void n(int i9) {
        u k6 = k(1);
        int i10 = k6.f24042c;
        k6.f24042c = i10 + 1;
        k6.f24041a[i10] = (byte) i9;
        this.f24014c++;
    }

    public final void o(long j7) {
        boolean z8;
        byte[] bArr;
        if (j7 == 0) {
            n(48);
            return;
        }
        int i9 = 1;
        if (j7 < 0) {
            j7 = -j7;
            if (j7 < 0) {
                u("-9223372036854775808");
                return;
            }
            z8 = true;
        } else {
            z8 = false;
        }
        if (j7 < 100000000) {
            if (j7 < 10000) {
                if (j7 < 100) {
                    if (j7 >= 10) {
                        i9 = 2;
                    }
                } else if (j7 < 1000) {
                    i9 = 3;
                } else {
                    i9 = 4;
                }
            } else if (j7 < 1000000) {
                if (j7 < 100000) {
                    i9 = 5;
                } else {
                    i9 = 6;
                }
            } else if (j7 < 10000000) {
                i9 = 7;
            } else {
                i9 = 8;
            }
        } else if (j7 < 1000000000000L) {
            if (j7 < 10000000000L) {
                if (j7 < C.NANOS_PER_SECOND) {
                    i9 = 9;
                } else {
                    i9 = 10;
                }
            } else if (j7 < 100000000000L) {
                i9 = 11;
            } else {
                i9 = 12;
            }
        } else if (j7 < 1000000000000000L) {
            if (j7 < 10000000000000L) {
                i9 = 13;
            } else if (j7 < 100000000000000L) {
                i9 = 14;
            } else {
                i9 = 15;
            }
        } else if (j7 < 100000000000000000L) {
            if (j7 < 10000000000000000L) {
                i9 = 16;
            } else {
                i9 = 17;
            }
        } else if (j7 < 1000000000000000000L) {
            i9 = 18;
        } else {
            i9 = 19;
        }
        if (z8) {
            i9++;
        }
        u k6 = k(i9);
        int i10 = k6.f24042c + i9;
        while (true) {
            bArr = k6.f24041a;
            if (j7 == 0) {
                break;
            }
            long j9 = 10;
            i10--;
            bArr[i10] = x8.a.f24249a[(int) (j7 % j9)];
            j7 /= j9;
        }
        if (z8) {
            bArr[i10 - 1] = (byte) 45;
        }
        k6.f24042c += i9;
        this.f24014c += i9;
    }

    public final void p(long j7) {
        if (j7 == 0) {
            n(48);
            return;
        }
        long j9 = (j7 >>> 1) | j7;
        long j10 = j9 | (j9 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i9 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        u k6 = k(i9);
        int i10 = k6.f24042c;
        for (int i11 = (i10 + i9) - 1; i11 >= i10; i11--) {
            k6.f24041a[i11] = x8.a.f24249a[(int) (15 & j7)];
            j7 >>>= 4;
        }
        k6.f24042c += i9;
        this.f24014c += i9;
    }

    public final void q(int i9) {
        u k6 = k(4);
        int i10 = k6.f24042c;
        byte[] bArr = k6.f24041a;
        bArr[i10] = (byte) ((i9 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i9 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i9 & 255);
        k6.f24042c = i10 + 4;
        this.f24014c += 4;
    }

    public final void r(int i9) {
        u k6 = k(2);
        int i10 = k6.f24042c;
        byte[] bArr = k6.f24041a;
        bArr[i10] = (byte) ((i9 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i9 & 255);
        k6.f24042c = i10 + 2;
        this.f24014c += 2;
    }

    @Override // w8.y
    public final long read(f fVar, long j7) {
        G7.j.e(fVar, "sink");
        if (j7 >= 0) {
            long j9 = this.f24014c;
            if (j9 == 0) {
                return -1L;
            }
            if (j7 > j9) {
                j7 = j9;
            }
            fVar.d(this, j7);
            return j7;
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount < 0: ").toString());
    }

    @Override // w8.h
    public final byte readByte() {
        if (this.f24014c != 0) {
            u uVar = this.b;
            G7.j.b(uVar);
            int i9 = uVar.b;
            int i10 = uVar.f24042c;
            int i11 = i9 + 1;
            byte b = uVar.f24041a[i9];
            this.f24014c--;
            if (i11 == i10) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i11;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // w8.h
    public final byte[] readByteArray() {
        return readByteArray(this.f24014c);
    }

    @Override // w8.h
    public final i readByteString() {
        return readByteString(this.f24014c);
    }

    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, w8.f] */
    public final long readDecimalLong() {
        int i9;
        String str;
        if (this.f24014c != 0) {
            long j7 = -7;
            long j9 = 0;
            int i10 = 0;
            boolean z8 = false;
            boolean z9 = false;
            do {
                u uVar = this.b;
                G7.j.b(uVar);
                int i11 = uVar.b;
                int i12 = uVar.f24042c;
                while (i11 < i12) {
                    byte b = uVar.f24041a[i11];
                    byte b8 = (byte) 48;
                    if (b >= b8 && b <= ((byte) 57)) {
                        int i13 = b8 - b;
                        if (j9 >= -922337203685477580L && (j9 != -922337203685477580L || i13 >= j7)) {
                            j9 = (j9 * 10) + i13;
                        } else {
                            ?? obj = new Object();
                            obj.o(j9);
                            obj.n(b);
                            if (!z8) {
                                obj.readByte();
                            }
                            throw new NumberFormatException(G7.j.j(obj.readUtf8(), "Number too large: "));
                        }
                    } else if (b == ((byte) 45) && i10 == 0) {
                        j7--;
                        z8 = true;
                    } else {
                        z9 = true;
                        break;
                    }
                    i11++;
                    i10++;
                }
                if (i11 == i12) {
                    this.b = uVar.a();
                    v.a(uVar);
                } else {
                    uVar.b = i11;
                }
                if (z9) {
                    break;
                }
            } while (this.b != null);
            long j10 = this.f24014c - i10;
            this.f24014c = j10;
            if (z8) {
                i9 = 2;
            } else {
                i9 = 1;
            }
            if (i10 < i9) {
                if (j10 != 0) {
                    if (z8) {
                        str = "Expected a digit";
                    } else {
                        str = "Expected a digit or '-'";
                    }
                    StringBuilder c9 = AbstractC2965e.c(str, " but was 0x");
                    byte c10 = c(0L);
                    char[] cArr = x8.b.f24250a;
                    c9.append(new String(new char[]{cArr[(c10 >> 4) & 15], cArr[c10 & Ascii.SI]}));
                    throw new NumberFormatException(c9.toString());
                }
                throw new EOFException();
            }
            if (!z8) {
                return -j9;
            }
            return j9;
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[EDGE_INSN: B:39:0x00aa->B:36:0x00aa BREAK  A[LOOP:0: B:4:0x0010->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, w8.f] */
    @Override // w8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long readHexadecimalUnsignedLong() {
        /*
            r17 = this;
            r0 = r17
            r1 = 4
            r2 = 0
            r3 = 1
            long r4 = r0.f24014c
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto Lb1
            r8 = r2
            r9 = r8
            r4 = r6
        L10:
            w8.u r10 = r0.b
            G7.j.b(r10)
            int r11 = r10.b
            int r12 = r10.f24042c
        L19:
            if (r11 >= r12) goto L96
            byte[] r13 = r10.f24041a
            r13 = r13[r11]
            r14 = 48
            byte r14 = (byte) r14
            if (r13 < r14) goto L2c
            r15 = 57
            byte r15 = (byte) r15
            if (r13 > r15) goto L2c
            int r14 = r13 - r14
            goto L46
        L2c:
            r14 = 97
            byte r14 = (byte) r14
            if (r13 < r14) goto L3b
            r15 = 102(0x66, float:1.43E-43)
            byte r15 = (byte) r15
            if (r13 > r15) goto L3b
        L36:
            int r14 = r13 - r14
            int r14 = r14 + 10
            goto L46
        L3b:
            r14 = 65
            byte r14 = (byte) r14
            if (r13 < r14) goto L6e
            r15 = 70
            byte r15 = (byte) r15
            if (r13 > r15) goto L6e
            goto L36
        L46:
            r15 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r15 = r15 & r4
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 != 0) goto L53
            long r4 = r4 << r1
            long r13 = (long) r14
            long r4 = r4 | r13
            int r11 = r11 + r3
            int r8 = r8 + r3
            goto L19
        L53:
            w8.f r1 = new w8.f
            r1.<init>()
            r1.p(r4)
            r1.n(r13)
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.readUtf8()
            java.lang.String r3 = "Number too large: "
            java.lang.String r1 = G7.j.j(r1, r3)
            r2.<init>(r1)
            throw r2
        L6e:
            if (r8 == 0) goto L72
            r9 = r3
            goto L96
        L72:
            java.lang.NumberFormatException r4 = new java.lang.NumberFormatException
            char[] r5 = x8.b.f24250a
            int r1 = r13 >> 4
            r1 = r1 & 15
            char r1 = r5[r1]
            r6 = r13 & 15
            char r5 = r5[r6]
            r6 = 2
            char[] r6 = new char[r6]
            r6[r2] = r1
            r6[r3] = r5
            java.lang.String r1 = new java.lang.String
            r1.<init>(r6)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = G7.j.j(r1, r2)
            r4.<init>(r1)
            throw r4
        L96:
            if (r11 != r12) goto La2
            w8.u r11 = r10.a()
            r0.b = r11
            w8.v.a(r10)
            goto La4
        La2:
            r10.b = r11
        La4:
            if (r9 != 0) goto Laa
            w8.u r10 = r0.b
            if (r10 != 0) goto L10
        Laa:
            long r1 = r0.f24014c
            long r6 = (long) r8
            long r1 = r1 - r6
            r0.f24014c = r1
            return r4
        Lb1:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w8.f.readHexadecimalUnsignedLong():long");
    }

    @Override // w8.h
    public final int readInt() {
        if (this.f24014c >= 4) {
            u uVar = this.b;
            G7.j.b(uVar);
            int i9 = uVar.b;
            int i10 = uVar.f24042c;
            if (i10 - i9 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = uVar.f24041a;
            int i11 = i9 + 3;
            int i12 = ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 2] & 255) << 8);
            int i13 = i9 + 4;
            int i14 = i12 | (bArr[i11] & 255);
            this.f24014c -= 4;
            if (i13 == i10) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i13;
            }
            return i14;
        }
        throw new EOFException();
    }

    @Override // w8.h
    public final short readShort() {
        if (this.f24014c >= 2) {
            u uVar = this.b;
            G7.j.b(uVar);
            int i9 = uVar.b;
            int i10 = uVar.f24042c;
            if (i10 - i9 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            int i11 = i9 + 1;
            byte[] bArr = uVar.f24041a;
            int i12 = (bArr[i9] & 255) << 8;
            int i13 = i9 + 2;
            int i14 = (bArr[i11] & 255) | i12;
            this.f24014c -= 2;
            if (i13 == i10) {
                this.b = uVar.a();
                v.a(uVar);
            } else {
                uVar.b = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // w8.h
    public final String readString(Charset charset) {
        return readString(this.f24014c, charset);
    }

    public final String readUtf8() {
        return readString(this.f24014c, O7.a.f2244a);
    }

    @Override // w8.h
    public final String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // w8.h
    public final boolean request(long j7) {
        if (this.f24014c >= j7) {
            return true;
        }
        return false;
    }

    @Override // w8.h
    public final void require(long j7) {
        if (this.f24014c >= j7) {
        } else {
            throw new EOFException();
        }
    }

    public final void s(String str, int i9, int i10, Charset charset) {
        G7.j.e(str, "string");
        if (i9 >= 0) {
            if (i10 >= i9) {
                if (i10 <= str.length()) {
                    if (charset.equals(O7.a.f2244a)) {
                        t(i9, i10, str);
                        return;
                    }
                    String substring = str.substring(i9, i10);
                    G7.j.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    byte[] bytes = substring.getBytes(charset);
                    G7.j.d(bytes, "(this as java.lang.String).getBytes(charset)");
                    m(bytes, 0, bytes.length);
                    return;
                }
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString().toString());
            }
            throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(G7.j.j(Integer.valueOf(i9), "beginIndex < 0: ").toString());
    }

    @Override // w8.h
    public final void skip(long j7) {
        while (j7 > 0) {
            u uVar = this.b;
            if (uVar != null) {
                int min = (int) Math.min(j7, uVar.f24042c - uVar.b);
                long j9 = min;
                this.f24014c -= j9;
                j7 -= j9;
                int i9 = uVar.b + min;
                uVar.b = i9;
                if (i9 == uVar.f24042c) {
                    this.b = uVar.a();
                    v.a(uVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final void t(int i9, int i10, String str) {
        char charAt;
        char c9;
        G7.j.e(str, "string");
        if (i9 >= 0) {
            if (i10 >= i9) {
                if (i10 <= str.length()) {
                    while (i9 < i10) {
                        char charAt2 = str.charAt(i9);
                        if (charAt2 < 128) {
                            u k6 = k(1);
                            int i11 = k6.f24042c - i9;
                            int min = Math.min(i10, 8192 - i11);
                            int i12 = i9 + 1;
                            byte[] bArr = k6.f24041a;
                            bArr[i9 + i11] = (byte) charAt2;
                            while (true) {
                                i9 = i12;
                                if (i9 >= min || (charAt = str.charAt(i9)) >= 128) {
                                    break;
                                }
                                i12 = i9 + 1;
                                bArr[i9 + i11] = (byte) charAt;
                            }
                            int i13 = k6.f24042c;
                            int i14 = (i11 + i9) - i13;
                            k6.f24042c = i13 + i14;
                            this.f24014c += i14;
                        } else {
                            if (charAt2 < 2048) {
                                u k7 = k(2);
                                int i15 = k7.f24042c;
                                byte b = (byte) ((charAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                                byte[] bArr2 = k7.f24041a;
                                bArr2[i15] = b;
                                bArr2[i15 + 1] = (byte) ((charAt2 & '?') | 128);
                                k7.f24042c = i15 + 2;
                                this.f24014c += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i16 = i9 + 1;
                                if (i16 < i10) {
                                    c9 = str.charAt(i16);
                                } else {
                                    c9 = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c9 && c9 <= 57343) {
                                    int i17 = (((charAt2 & 1023) << 10) | (c9 & 1023)) + 65536;
                                    u k9 = k(4);
                                    int i18 = k9.f24042c;
                                    byte b8 = (byte) ((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                                    byte[] bArr3 = k9.f24041a;
                                    bArr3[i18] = b8;
                                    bArr3[i18 + 1] = (byte) (((i17 >> 12) & 63) | 128);
                                    bArr3[i18 + 2] = (byte) (((i17 >> 6) & 63) | 128);
                                    bArr3[i18 + 3] = (byte) ((i17 & 63) | 128);
                                    k9.f24042c = i18 + 4;
                                    this.f24014c += 4;
                                    i9 += 2;
                                } else {
                                    n(63);
                                    i9 = i16;
                                }
                            } else {
                                u k10 = k(3);
                                int i19 = k10.f24042c;
                                byte[] bArr4 = k10.f24041a;
                                bArr4[i19] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i19 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i19 + 2] = (byte) ((charAt2 & '?') | 128);
                                k10.f24042c = i19 + 3;
                                this.f24014c += 3;
                            }
                            i9++;
                        }
                    }
                    return;
                }
                StringBuilder p2 = n0.p(i10, "endIndex > string.length: ", " > ");
                p2.append(str.length());
                throw new IllegalArgumentException(p2.toString().toString());
            }
            throw new IllegalArgumentException(n0.e(i10, i9, "endIndex < beginIndex: ", " < ").toString());
        }
        throw new IllegalArgumentException(G7.j.j(Integer.valueOf(i9), "beginIndex < 0: ").toString());
    }

    @Override // w8.y
    public final A timeout() {
        return A.f23999d;
    }

    public final String toString() {
        return i().toString();
    }

    public final void u(String str) {
        G7.j.e(str, "string");
        t(0, str.length(), str);
    }

    public final void v(int i9) {
        String str;
        int i10 = 0;
        if (i9 < 128) {
            n(i9);
            return;
        }
        if (i9 < 2048) {
            u k6 = k(2);
            int i11 = k6.f24042c;
            byte b = (byte) ((i9 >> 6) | PsExtractor.AUDIO_STREAM);
            byte[] bArr = k6.f24041a;
            bArr[i11] = b;
            bArr[1 + i11] = (byte) ((i9 & 63) | 128);
            k6.f24042c = i11 + 2;
            this.f24014c += 2;
            return;
        }
        if (55296 <= i9 && i9 <= 57343) {
            n(63);
            return;
        }
        if (i9 < 65536) {
            u k7 = k(3);
            int i12 = k7.f24042c;
            byte[] bArr2 = k7.f24041a;
            bArr2[i12] = (byte) ((i9 >> 12) | 224);
            bArr2[1 + i12] = (byte) (((i9 >> 6) & 63) | 128);
            bArr2[2 + i12] = (byte) ((i9 & 63) | 128);
            k7.f24042c = i12 + 3;
            this.f24014c += 3;
            return;
        }
        if (i9 <= 1114111) {
            u k9 = k(4);
            int i13 = k9.f24042c;
            byte b8 = (byte) ((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            byte[] bArr3 = k9.f24041a;
            bArr3[i13] = b8;
            bArr3[1 + i13] = (byte) (((i9 >> 12) & 63) | 128);
            bArr3[2 + i13] = (byte) (((i9 >> 6) & 63) | 128);
            bArr3[3 + i13] = (byte) ((i9 & 63) | 128);
            k9.f24042c = i13 + 4;
            this.f24014c += 4;
            return;
        }
        if (i9 != 0) {
            char[] cArr = x8.b.f24250a;
            char[] cArr2 = {cArr[(i9 >> 28) & 15], cArr[(i9 >> 24) & 15], cArr[(i9 >> 20) & 15], cArr[(i9 >> 16) & 15], cArr[(i9 >> 12) & 15], cArr[(i9 >> 8) & 15], cArr[(i9 >> 4) & 15], cArr[i9 & 15]};
            while (i10 < 8 && cArr2[i10] == '0') {
                i10++;
            }
            if (i10 >= 0) {
                if (i10 <= 8) {
                    str = new String(cArr2, i10, 8 - i10);
                } else {
                    throw new IllegalArgumentException(n0.f(i10, "startIndex: ", " > endIndex: 8"));
                }
            } else {
                throw new IndexOutOfBoundsException(n0.f(i10, "startIndex: ", ", endIndex: 8, size: 8"));
            }
        } else {
            str = "0";
        }
        throw new IllegalArgumentException(G7.j.j(str, "Unexpected code point: 0x"));
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        G7.j.e(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i9 = remaining;
        while (i9 > 0) {
            u k6 = k(1);
            int min = Math.min(i9, 8192 - k6.f24042c);
            byteBuffer.get(k6.f24041a, k6.f24042c, min);
            i9 -= min;
            k6.f24042c += min;
        }
        this.f24014c += remaining;
        return remaining;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeByte(int i9) {
        n(i9);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeDecimalLong(long j7) {
        o(j7);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeHexadecimalUnsignedLong(long j7) {
        p(j7);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeInt(int i9) {
        q(i9);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeShort(int i9) {
        r(i9);
        return this;
    }

    @Override // w8.g
    public final /* bridge */ /* synthetic */ g writeUtf8(String str) {
        u(str);
        return this;
    }

    @Override // w8.g
    public final long z(y yVar) {
        G7.j.e(yVar, "source");
        long j7 = 0;
        while (true) {
            long read = yVar.read(this, 8192L);
            if (read == -1) {
                return j7;
            }
            j7 += read;
        }
    }

    public final String readString(long j7, Charset charset) {
        G7.j.e(charset, "charset");
        if (!(j7 >= 0 && j7 <= 2147483647L)) {
            throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount: ").toString());
        }
        if (this.f24014c < j7) {
            throw new EOFException();
        }
        if (j7 == 0) {
            return "";
        }
        u uVar = this.b;
        G7.j.b(uVar);
        int i9 = uVar.b;
        if (i9 + j7 > uVar.f24042c) {
            return new String(readByteArray(j7), charset);
        }
        int i10 = (int) j7;
        String str = new String(uVar.f24041a, i9, i10, charset);
        int i11 = uVar.b + i10;
        uVar.b = i11;
        this.f24014c -= j7;
        if (i11 == uVar.f24042c) {
            this.b = uVar.a();
            v.a(uVar);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, w8.f] */
    @Override // w8.h
    public final String readUtf8LineStrict(long j7) {
        if (j7 >= 0) {
            long j9 = j7 != Long.MAX_VALUE ? j7 + 1 : Long.MAX_VALUE;
            byte b = (byte) 10;
            long indexOf = indexOf(b, 0L, j9);
            if (indexOf != -1) {
                return x8.a.a(this, indexOf);
            }
            if (j9 < this.f24014c && c(j9 - 1) == ((byte) 13) && c(j9) == b) {
                return x8.a.a(this, j9);
            }
            ?? obj = new Object();
            b(obj, 0L, Math.min(32, this.f24014c));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f24014c, j7) + " content=" + obj.readByteString(obj.f24014c).d() + (char) 8230);
        }
        throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "limit < 0: ").toString());
    }

    public final byte[] readByteArray(long j7) {
        int i9 = 0;
        if (!(j7 >= 0 && j7 <= 2147483647L)) {
            throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount: ").toString());
        }
        if (this.f24014c >= j7) {
            int i10 = (int) j7;
            byte[] bArr = new byte[i10];
            while (i9 < i10) {
                int read = read(bArr, i9, i10 - i9);
                if (read == -1) {
                    throw new EOFException();
                }
                i9 += read;
            }
            return bArr;
        }
        throw new EOFException();
    }

    @Override // w8.h
    public final i readByteString(long j7) {
        if (!(j7 >= 0 && j7 <= 2147483647L)) {
            throw new IllegalArgumentException(G7.j.j(Long.valueOf(j7), "byteCount: ").toString());
        }
        if (this.f24014c < j7) {
            throw new EOFException();
        }
        if (j7 >= 4096) {
            i j9 = j((int) j7);
            skip(j7);
            return j9;
        }
        return new i(readByteArray(j7));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        G7.j.e(byteBuffer, "sink");
        u uVar = this.b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f24042c - uVar.b);
        byteBuffer.put(uVar.f24041a, uVar.b, min);
        int i9 = uVar.b + min;
        uVar.b = i9;
        this.f24014c -= min;
        if (i9 == uVar.f24042c) {
            this.b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // w8.g
    public final g write(byte[] bArr) {
        m(bArr, 0, bArr.length);
        return this;
    }

    public final int read(byte[] bArr, int i9, int i10) {
        G7.j.e(bArr, "sink");
        AbstractC2947c.h(bArr.length, i9, i10);
        u uVar = this.b;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i10, uVar.f24042c - uVar.b);
        int i11 = uVar.b;
        AbstractC2815f.v(uVar.f24041a, i9, i11, bArr, i11 + min);
        int i12 = uVar.b + min;
        uVar.b = i12;
        this.f24014c -= min;
        if (i12 == uVar.f24042c) {
            this.b = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, w8.x
    public final void close() {
    }

    @Override // w8.g
    public final g emitCompleteSegments() {
        return this;
    }

    @Override // w8.g, w8.x, java.io.Flushable
    public final void flush() {
    }

    @Override // w8.h, w8.g
    public final f y() {
        return this;
    }
}
