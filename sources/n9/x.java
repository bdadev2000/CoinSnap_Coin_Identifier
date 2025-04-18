package n9;

import com.google.common.collect.b1;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.UByte;
import v8.u0;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final char[] f22596d = {'\r', '\n'};

    /* renamed from: e, reason: collision with root package name */
    public static final char[] f22597e = {'\n'};

    /* renamed from: f, reason: collision with root package name */
    public static final b1 f22598f = b1.i(5, ra.f.a, ra.f.f24049c, ra.f.f24052f, ra.f.f24050d, ra.f.f24051e);
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f22599b;

    /* renamed from: c, reason: collision with root package name */
    public int f22600c;

    public x() {
        this.a = h0.f22548f;
    }

    public final int A() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f22599b = i11 + 1;
        return (bArr[i11] & UByte.MAX_VALUE) | i12;
    }

    public final long B() {
        int i10;
        int i11;
        long j3 = this.a[this.f22599b];
        int i12 = 7;
        while (true) {
            if (i12 < 0) {
                break;
            }
            if (((1 << i12) & j3) != 0) {
                i12--;
            } else if (i12 < 6) {
                j3 &= r6 - 1;
                i11 = 7 - i12;
            } else if (i12 == 7) {
                i11 = 1;
            }
        }
        i11 = 0;
        if (i11 != 0) {
            for (i10 = 1; i10 < i11; i10++) {
                if ((this.a[this.f22599b + i10] & 192) == 128) {
                    j3 = (j3 << 6) | (r3 & 63);
                } else {
                    throw new NumberFormatException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Invalid UTF-8 sequence continuation byte: ", j3));
                }
            }
            this.f22599b += i11;
            return j3;
        }
        throw new NumberFormatException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Invalid UTF-8 sequence first byte: ", j3));
    }

    public final Charset C() {
        int i10 = this.f22600c;
        int i11 = this.f22599b;
        if (i10 - i11 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i11] == -17 && bArr[i11 + 1] == -69 && bArr[i11 + 2] == -65) {
                this.f22599b = i11 + 3;
                return ra.f.f24049c;
            }
        }
        if (i10 - i11 >= 2) {
            byte[] bArr2 = this.a;
            byte b3 = bArr2[i11];
            if (b3 == -2 && bArr2[i11 + 1] == -1) {
                this.f22599b = i11 + 2;
                return ra.f.f24050d;
            }
            if (b3 == -1 && bArr2[i11 + 1] == -2) {
                this.f22599b = i11 + 2;
                return ra.f.f24051e;
            }
            return null;
        }
        return null;
    }

    public final void D(int i10) {
        byte[] bArr = this.a;
        if (bArr.length < i10) {
            bArr = new byte[i10];
        }
        E(bArr, i10);
    }

    public final void E(byte[] bArr, int i10) {
        this.a = bArr;
        this.f22600c = i10;
        this.f22599b = 0;
    }

    public final void F(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.a.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.f22600c = i10;
    }

    public final void G(int i10) {
        boolean z10;
        if (i10 >= 0 && i10 <= this.f22600c) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        this.f22599b = i10;
    }

    public final void H(int i10) {
        G(this.f22599b + i10);
    }

    public final void a(int i10) {
        byte[] bArr = this.a;
        if (i10 > bArr.length) {
            this.a = Arrays.copyOf(bArr, i10);
        }
    }

    public final char b(Charset charset) {
        u0.e(f22598f.contains(charset), "Unsupported charset: " + charset);
        return (char) (c(charset) >> 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int c(java.nio.charset.Charset r10) {
        /*
            r9 = this;
            java.nio.charset.Charset r0 = ra.f.f24049c
            boolean r0 = r10.equals(r0)
            java.lang.String r1 = "Out of range: %s"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L14
            java.nio.charset.Charset r0 = ra.f.a
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L43
        L14:
            int r0 = r9.f22600c
            int r4 = r9.f22599b
            int r0 = r0 - r4
            if (r0 < r3) goto L43
            byte[] r10 = r9.a
            r10 = r10[r4]
            r10 = r10 & 255(0xff, float:3.57E-43)
            long r4 = (long) r10
            int r10 = (int) r4
            char r10 = (char) r10
            long r6 = (long) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = r3
            goto L2c
        L2b:
            r0 = r2
        L2c:
            if (r0 == 0) goto L31
            byte r10 = (byte) r10
            r4 = r3
            goto L84
        L31:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            r0[r2] = r3
            java.lang.String r0 = v8.u0.P(r1, r0)
            r10.<init>(r0)
            throw r10
        L43:
            java.nio.charset.Charset r0 = ra.f.f24052f
            boolean r0 = r10.equals(r0)
            r4 = 2
            if (r0 != 0) goto L54
            java.nio.charset.Charset r0 = ra.f.f24050d
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L69
        L54:
            int r0 = r9.f22600c
            int r5 = r9.f22599b
            int r0 = r0 - r5
            if (r0 < r4) goto L69
            byte[] r10 = r9.a
            r0 = r10[r5]
            int r5 = r5 + r3
            r10 = r10[r5]
            int r0 = r0 << 8
        L64:
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r10 | r0
            char r10 = (char) r10
            goto L83
        L69:
            java.nio.charset.Charset r0 = ra.f.f24051e
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto La7
            int r10 = r9.f22600c
            int r0 = r9.f22599b
            int r10 = r10 - r0
            if (r10 < r4) goto La7
            byte[] r10 = r9.a
            int r5 = r0 + 1
            r5 = r10[r5]
            r10 = r10[r0]
            int r0 = r5 << 8
            goto L64
        L83:
            byte r10 = (byte) r10
        L84:
            long r5 = (long) r10
            int r10 = (int) r5
            char r10 = (char) r10
            long r7 = (long) r10
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L8e
            r0 = r3
            goto L8f
        L8e:
            r0 = r2
        L8f:
            if (r0 == 0) goto L95
            int r10 = r10 << 16
            int r10 = r10 + r4
            return r10
        L95:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r0[r2] = r3
            java.lang.String r0 = v8.u0.P(r1, r0)
            r10.<init>(r0)
            throw r10
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.x.c(java.nio.charset.Charset):int");
    }

    public final void d(byte[] bArr, int i10, int i11) {
        System.arraycopy(this.a, this.f22599b, bArr, i10, i11);
        this.f22599b += i11;
    }

    public final char e(Charset charset, char[] cArr) {
        boolean z10;
        int c10 = c(charset);
        if (c10 != 0) {
            char c11 = (char) (c10 >> 16);
            int length = cArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (cArr[i10] == c11) {
                        z10 = true;
                        break;
                    }
                    i10++;
                } else {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                this.f22599b += c10 & 65535;
                return c11;
            }
        }
        return (char) 0;
    }

    public final int f() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i11] & UByte.MAX_VALUE) << 16);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 8);
        this.f22599b = i14 + 1;
        return (bArr[i14] & UByte.MAX_VALUE) | i15;
    }

    public final String g() {
        return h(ra.f.f24049c);
    }

    public final String h(Charset charset) {
        int i10;
        boolean z10;
        boolean z11;
        u0.e(f22598f.contains(charset), "Unsupported charset: " + charset);
        if (this.f22600c - this.f22599b == 0) {
            return null;
        }
        Charset charset2 = ra.f.a;
        if (!charset.equals(charset2)) {
            C();
        }
        if (!charset.equals(ra.f.f24049c) && !charset.equals(charset2)) {
            if (!charset.equals(ra.f.f24052f) && !charset.equals(ra.f.f24051e) && !charset.equals(ra.f.f24050d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i10 = 2;
        } else {
            i10 = 1;
        }
        int i11 = this.f22599b;
        while (true) {
            int i12 = this.f22600c;
            if (i11 < i12 - (i10 - 1)) {
                boolean z12 = false;
                if (charset.equals(ra.f.f24049c) || charset.equals(ra.f.a)) {
                    byte b3 = this.a[i11];
                    int i13 = h0.a;
                    if (b3 != 10 && b3 != 13) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        break;
                    }
                }
                if (charset.equals(ra.f.f24052f) || charset.equals(ra.f.f24050d)) {
                    byte[] bArr = this.a;
                    if (bArr[i11] == 0) {
                        byte b10 = bArr[i11 + 1];
                        int i14 = h0.a;
                        if (b10 != 10 && b10 != 13) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            break;
                        }
                    }
                }
                if (charset.equals(ra.f.f24051e)) {
                    byte[] bArr2 = this.a;
                    if (bArr2[i11 + 1] == 0) {
                        byte b11 = bArr2[i11];
                        int i15 = h0.a;
                        if (b11 == 10 || b11 == 13) {
                            z12 = true;
                        }
                        if (z12) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i11 += i10;
            } else {
                i11 = i12;
                break;
            }
        }
        String t5 = t(i11 - this.f22599b, charset);
        if (this.f22599b == this.f22600c) {
            return t5;
        }
        if (e(charset, f22596d) == '\r') {
            e(charset, f22597e);
        }
        return t5;
    }

    public final int i() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        int i14 = i12 + 1;
        int i15 = i13 | ((bArr[i12] & UByte.MAX_VALUE) << 16);
        this.f22599b = i14 + 1;
        return ((bArr[i14] & UByte.MAX_VALUE) << 24) | i15;
    }

    public final long j() {
        byte[] bArr = this.a;
        long j3 = bArr[r1] & 255;
        int i10 = this.f22599b + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        long j11 = j10 | ((bArr[i10] & 255) << 24);
        long j12 = j11 | ((bArr[r3] & 255) << 32);
        long j13 = j12 | ((bArr[r4] & 255) << 40);
        long j14 = j13 | ((bArr[r3] & 255) << 48);
        this.f22599b = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | ((bArr[r4] & 255) << 56);
    }

    public final short k() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f22599b = i11 + 1;
        return (short) (((bArr[i11] & UByte.MAX_VALUE) << 8) | i12);
    }

    public final long l() {
        byte[] bArr = this.a;
        long j3 = bArr[r1] & 255;
        int i10 = this.f22599b + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 8) | ((bArr[r1] & 255) << 16);
        this.f22599b = i10 + 1;
        return j10 | ((bArr[i10] & 255) << 24);
    }

    public final int m() {
        int i10 = i();
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(eb.j.i("Top bit not zero: ", i10));
    }

    public final int n() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = bArr[i10] & UByte.MAX_VALUE;
        this.f22599b = i11 + 1;
        return ((bArr[i11] & UByte.MAX_VALUE) << 8) | i12;
    }

    public final long o() {
        byte[] bArr = this.a;
        long j3 = (bArr[r1] & 255) << 56;
        int i10 = this.f22599b + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 48) | ((bArr[r1] & 255) << 40);
        long j11 = j10 | ((bArr[i10] & 255) << 32);
        long j12 = j11 | ((bArr[r3] & 255) << 24);
        long j13 = j12 | ((bArr[r4] & 255) << 16);
        long j14 = j13 | ((bArr[r3] & 255) << 8);
        this.f22599b = i10 + 1 + 1 + 1 + 1 + 1;
        return j14 | (bArr[r4] & 255);
    }

    public final String p() {
        int i10 = this.f22600c;
        int i11 = this.f22599b;
        if (i10 - i11 == 0) {
            return null;
        }
        while (i11 < this.f22600c && this.a[i11] != 0) {
            i11++;
        }
        byte[] bArr = this.a;
        int i12 = this.f22599b;
        int i13 = h0.a;
        String str = new String(bArr, i12, i11 - i12, ra.f.f24049c);
        this.f22599b = i11;
        if (i11 < this.f22600c) {
            this.f22599b = i11 + 1;
        }
        return str;
    }

    public final String q(int i10) {
        int i11;
        if (i10 == 0) {
            return "";
        }
        int i12 = this.f22599b;
        int i13 = (i12 + i10) - 1;
        if (i13 < this.f22600c && this.a[i13] == 0) {
            i11 = i10 - 1;
        } else {
            i11 = i10;
        }
        byte[] bArr = this.a;
        int i14 = h0.a;
        String str = new String(bArr, i12, i11, ra.f.f24049c);
        this.f22599b += i10;
        return str;
    }

    public final short r() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = (bArr[i10] & UByte.MAX_VALUE) << 8;
        this.f22599b = i11 + 1;
        return (short) ((bArr[i11] & UByte.MAX_VALUE) | i12);
    }

    public final String s(int i10) {
        return t(i10, ra.f.f24049c);
    }

    public final String t(int i10, Charset charset) {
        String str = new String(this.a, this.f22599b, i10, charset);
        this.f22599b += i10;
        return str;
    }

    public final int u() {
        return (v() << 21) | (v() << 14) | (v() << 7) | v();
    }

    public final int v() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        this.f22599b = i10 + 1;
        return bArr[i10] & UByte.MAX_VALUE;
    }

    public final long w() {
        byte[] bArr = this.a;
        long j3 = (bArr[r1] & 255) << 24;
        int i10 = this.f22599b + 1 + 1 + 1;
        long j10 = j3 | ((bArr[r2] & 255) << 16) | ((bArr[r1] & 255) << 8);
        this.f22599b = i10 + 1;
        return j10 | (bArr[i10] & 255);
    }

    public final int x() {
        byte[] bArr = this.a;
        int i10 = this.f22599b;
        int i11 = i10 + 1;
        int i12 = i11 + 1;
        int i13 = ((bArr[i10] & UByte.MAX_VALUE) << 16) | ((bArr[i11] & UByte.MAX_VALUE) << 8);
        this.f22599b = i12 + 1;
        return (bArr[i12] & UByte.MAX_VALUE) | i13;
    }

    public final int y() {
        int f10 = f();
        if (f10 >= 0) {
            return f10;
        }
        throw new IllegalStateException(eb.j.i("Top bit not zero: ", f10));
    }

    public final long z() {
        long o10 = o();
        if (o10 >= 0) {
            return o10;
        }
        throw new IllegalStateException(kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.k("Top bit not zero: ", o10));
    }

    public x(int i10) {
        this.a = new byte[i10];
        this.f22600c = i10;
    }

    public x(byte[] bArr) {
        this.a = bArr;
        this.f22600c = bArr.length;
    }

    public x(byte[] bArr, int i10) {
        this.a = bArr;
        this.f22600c = i10;
    }
}
