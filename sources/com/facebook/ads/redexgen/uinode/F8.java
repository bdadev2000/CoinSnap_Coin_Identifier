package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class F8 {
    public static String[] A0I = {"AXNp2q2PpEahITHLh", "xQEpoEpGgC2eanPxpW7aZYHhG9yms2rq", "3j6TAof", "i8THqobYCLYXuqAnsJGXzeKTVyKCbEfb", "ggw9auSRsP4B09On0iatBfmdaYF861sQ", "10OfiNQ0BRtOqE95ZnYZi1qGxLNxD1sx", "iFzh6NRuyiOyJdjYiPViJ2RhowiTnlD0", "JJpEbWQFS8eJaCoVgzG8fIG9CRI9jzfg"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Format A08;
    public int A01 = 1000;
    public int[] A0D = new int[1000];
    public long[] A0E = new long[1000];
    public long[] A0F = new long[1000];
    public int[] A0B = new int[1000];
    public int[] A0C = new int[1000];
    public C3[] A0H = new C3[1000];
    public Format[] A0G = new Format[1000];
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09(C04539p c04539p, C1048Xr c1048Xr, boolean z10, boolean z11, Format format, F7 f72) {
        if (!A0I()) {
            if (z11) {
                c1048Xr.A02(4);
                return -4;
            }
            Format format2 = this.A08;
            if (format2 == null || (!z10 && format2 == format)) {
                return -3;
            }
            c04539p.A00 = format2;
            return -5;
        }
        int A00 = A00(this.A03);
        if (z10 || this.A0G[A00] != format) {
            c04539p.A00 = this.A0G[A00];
            return -5;
        }
        if (c1048Xr.A0B()) {
            return -3;
        }
        c1048Xr.A00 = this.A0F[A00];
        c1048Xr.A02(this.A0B[A00]);
        f72.A00 = this.A0C[A00];
        f72.A01 = this.A0E[A00];
        f72.A02 = this.A0H[A00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0G(long j3, int i10, long j10, int i11, C3 c32) {
        if (this.A0A) {
            if ((i10 & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        AbstractC0626Ha.A04(!this.A09);
        A04(j3);
        int A00 = A00(this.A02);
        this.A0F[A00] = j3;
        long[] jArr = this.A0E;
        jArr[A00] = j10;
        this.A0C[A00] = i11;
        this.A0B[A00] = i10;
        this.A0H[A00] = c32;
        this.A0G[A00] = this.A08;
        this.A0D[A00] = this.A05;
        int i12 = this.A02 + 1;
        this.A02 = i12;
        int i13 = this.A01;
        if (i12 == i13) {
            int i14 = i13 + 1000;
            int[] iArr = new int[i14];
            long[] jArr2 = new long[i14];
            long[] jArr3 = new long[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            C3[] c3Arr = new C3[i14];
            Format[] formatArr = new Format[i14];
            int i15 = this.A04;
            int i16 = i13 - i15;
            System.arraycopy(jArr, i15, jArr2, 0, i16);
            System.arraycopy(this.A0F, this.A04, jArr3, 0, i16);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i16);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i16);
            System.arraycopy(this.A0H, this.A04, c3Arr, 0, i16);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i16);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i16);
            int i17 = this.A04;
            System.arraycopy(this.A0E, 0, jArr2, i16, i17);
            System.arraycopy(this.A0F, 0, jArr3, i16, i17);
            System.arraycopy(this.A0B, 0, iArr2, i16, i17);
            System.arraycopy(this.A0C, 0, iArr3, i16, i17);
            System.arraycopy(this.A0H, 0, c3Arr, i16, i17);
            System.arraycopy(this.A0G, 0, formatArr, i16, i17);
            System.arraycopy(this.A0D, 0, iArr, i16, i17);
            this.A0E = jArr2;
            this.A0F = jArr3;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c3Arr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i14;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A0J(long j3) {
        if (this.A02 == 0) {
            return j3 > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j3) {
            return false;
        }
        int i10 = this.A02;
        int A00 = A00(i10 - 1);
        while (i10 > this.A03 && this.A0F[A00] >= j3) {
            i10--;
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i10);
        return true;
    }

    private int A00(int i10) {
        int i11 = this.A04 + i10;
        int relativeIndex = this.A01;
        return i11 < relativeIndex ? i11 : i11 - relativeIndex;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if ((r0 & 1) != 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A01(int r6, int r7, long r8, boolean r10) {
        /*
            r5 = this;
            r4 = -1
            r3 = 0
        L2:
            if (r3 >= r7) goto L21
            long[] r0 = r5.A0F
            r1 = r0[r6]
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L21
            if (r10 == 0) goto L16
            int[] r0 = r5.A0B
            r0 = r0[r6]
            r0 = r0 & 1
            if (r0 == 0) goto L17
        L16:
            r4 = r3
        L17:
            int r6 = r6 + 1
            int r0 = r5.A01
            if (r6 != r0) goto L1e
            r6 = 0
        L1e:
            int r3 = r3 + 1
            goto L2
        L21:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.F8.A01(int, int, long, boolean):int");
    }

    private long A02(int i10) {
        this.A06 = Math.max(this.A06, A03(i10));
        int i11 = this.A02 - i10;
        this.A02 = i11;
        this.A00 += i10;
        int i12 = this.A04 + i10;
        this.A04 = i12;
        int i13 = this.A01;
        if (i12 >= i13) {
            this.A04 = i12 - i13;
        }
        int i14 = this.A03 - i10;
        this.A03 = i14;
        if (i14 < 0) {
            this.A03 = 0;
        }
        if (i11 == 0) {
            int i15 = this.A04;
            if (i15 != 0) {
                i13 = i15;
            }
            return this.A0E[i13 - 1] + this.A0C[r1];
        }
        return this.A0E[this.A04];
    }

    private long A03(int i10) {
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        long j3 = Long.MIN_VALUE;
        int A00 = A00(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = Math.max(j3, this.A0F[A00]);
            int i12 = this.A0B[A00];
            if ((i12 & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                int i13 = this.A01;
                String[] strArr = A0I;
                if (strArr[6].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[2] = "ogUh654";
                strArr2[5] = "2cGjVSXzBWiJJ6u2fOJU9D000d34dgjx";
                A00 = i13 - 1;
            }
        }
        return j3;
    }

    private final synchronized void A04(long j3) {
        this.A07 = Math.max(this.A07, j3);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i10;
        int skipCount = this.A02;
        i10 = skipCount - this.A03;
        this.A03 = skipCount;
        return i10;
    }

    public final synchronized int A08(long j3, boolean z10, boolean z11) {
        int A00 = A00(this.A03);
        if (!A0I() || j3 < this.A0F[A00] || (j3 > this.A07 && !z11)) {
            return -1;
        }
        int i10 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(A00, i10 - relativeReadIndex, j3, z10);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        int i10 = this.A02;
        if (i10 == 0) {
            return -1L;
        }
        return A02(i10);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long A0C(int r6) {
        /*
            r5 = this;
            int r2 = r5.A06()
            int r2 = r2 - r6
            r4 = 1
            if (r2 < 0) goto L2b
            int r1 = r5.A02
            int r0 = r5.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L2b
            r0 = 1
        L10:
            com.facebook.ads.redexgen.uinode.AbstractC0626Ha.A03(r0)
            int r0 = r5.A02
            int r0 = r0 - r2
            r5.A02 = r0
            long r2 = r5.A06
            long r0 = r5.A03(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r5.A07 = r0
            int r0 = r5.A02
            if (r0 != 0) goto L2d
            r0 = 0
            return r0
        L2b:
            r0 = 0
            goto L10
        L2d:
            int r0 = r0 - r4
            int r1 = r5.A00(r0)
            long[] r0 = r5.A0E
            r2 = r0[r1]
            int[] r0 = r5.A0C
            r0 = r0[r1]
            long r0 = (long) r0
            long r2 = r2 + r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.F8.A0C(int):long");
    }

    public final synchronized long A0D(long j3, boolean z10, boolean z11) {
        int i10;
        int i11 = this.A02;
        if (i11 != 0) {
            long[] jArr = this.A0F;
            int searchLength = this.A04;
            if (j3 >= jArr[searchLength]) {
                if (z11 && (i10 = this.A03) != i11) {
                    i11 = i10 + 1;
                }
                int A01 = A01(searchLength, i11, j3, z10);
                if (A01 == -1) {
                    return -1L;
                }
                return A02(A01);
            }
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z10) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z10) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (IF.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
