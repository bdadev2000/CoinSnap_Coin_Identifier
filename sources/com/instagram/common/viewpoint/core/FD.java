package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;

/* loaded from: assets/audience_network.dex */
public final class FD {
    public static String[] A0I = {"eg4X", "Nz0nuhBBXIgKGoX4FaY", "pup", "Qfko2ZJrbd8qm9P7Z", "VNYZn1e9X4HoU78C3Y7Is8XN4Zmjwad1", "gssx", "oXowgT48tsY3I7JxijMLCGdkVoBj4zuG", "nF70W2ZNTzYocw3julTnZ7qnHb7KYrhT"};
    public int A00;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public Format A08;
    public int A01 = 1000;
    public int[] A0D = new int[this.A01];
    public long[] A0E = new long[this.A01];
    public long[] A0F = new long[this.A01];
    public int[] A0B = new int[this.A01];
    public int[] A0C = new int[this.A01];
    public C8[] A0H = new C8[this.A01];
    public Format[] A0G = new Format[this.A01];
    public long A06 = Long.MIN_VALUE;
    public long A07 = Long.MIN_VALUE;
    public boolean A09 = true;
    public boolean A0A = true;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized int A09(C04029u c04029u, C1023Yw c1023Yw, boolean z2, boolean z3, Format format, FC fc) {
        if (!A0I()) {
            if (z3) {
                c1023Yw.A02(4);
                return -4;
            }
            if (this.A08 == null || (!z2 && this.A08 == format)) {
                return -3;
            }
            c04029u.A00 = this.A08;
            return -5;
        }
        int A00 = A00(this.A03);
        if (z2 || this.A0G[A00] != format) {
            c04029u.A00 = this.A0G[A00];
            return -5;
        }
        if (c1023Yw.A0B()) {
            return -3;
        }
        c1023Yw.A00 = this.A0F[A00];
        c1023Yw.A02(this.A0B[A00]);
        fc.A00 = this.A0C[A00];
        fc.A01 = this.A0E[A00];
        fc.A02 = this.A0H[A00];
        this.A03++;
        return -4;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 21
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A0G(long j2, int i2, long j3, int i3, C8 c8) {
        if (this.A0A) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.A0A = false;
            }
        }
        AbstractC0576Hf.A04(!this.A09);
        A04(j2);
        int A00 = A00(this.A02);
        this.A0F[A00] = j2;
        this.A0E[A00] = j3;
        this.A0C[A00] = i3;
        this.A0B[A00] = i2;
        this.A0H[A00] = c8;
        this.A0G[A00] = this.A08;
        this.A0D[A00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i4 = this.A01 + 1000;
            int[] iArr = new int[i4];
            long[] jArr = new long[i4];
            long[] jArr2 = new long[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            C8[] c8Arr = new C8[i4];
            Format[] formatArr = new Format[i4];
            int i5 = this.A01 - this.A04;
            System.arraycopy(this.A0E, this.A04, jArr, 0, i5);
            System.arraycopy(this.A0F, this.A04, jArr2, 0, i5);
            System.arraycopy(this.A0B, this.A04, iArr2, 0, i5);
            System.arraycopy(this.A0C, this.A04, iArr3, 0, i5);
            System.arraycopy(this.A0H, this.A04, c8Arr, 0, i5);
            System.arraycopy(this.A0G, this.A04, formatArr, 0, i5);
            System.arraycopy(this.A0D, this.A04, iArr, 0, i5);
            int i6 = this.A04;
            System.arraycopy(this.A0E, 0, jArr, i5, i6);
            System.arraycopy(this.A0F, 0, jArr2, i5, i6);
            System.arraycopy(this.A0B, 0, iArr2, i5, i6);
            System.arraycopy(this.A0C, 0, iArr3, i5, i6);
            System.arraycopy(this.A0H, 0, c8Arr, i5, i6);
            System.arraycopy(this.A0G, 0, formatArr, i5, i6);
            System.arraycopy(this.A0D, 0, iArr, i5, i6);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c8Arr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            this.A02 = this.A01;
            this.A01 = i4;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized boolean A0J(long j2) {
        if (this.A02 == 0) {
            return j2 > this.A06;
        }
        if (Math.max(this.A06, A03(this.A03)) >= j2) {
            return false;
        }
        int i2 = this.A02;
        int A00 = A00(this.A02 - 1);
        while (i2 > this.A03 && this.A0F[A00] >= j2) {
            i2--;
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
            }
        }
        A0C(this.A00 + i2);
        return true;
    }

    private int A00(int i2) {
        int i3 = this.A04 + i2;
        int relativeIndex = this.A01;
        if (i3 < relativeIndex) {
            return i3;
        }
        int relativeIndex2 = this.A01;
        return i3 - relativeIndex2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if ((r0 & 1) != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A01(int r7, int r8, long r9, boolean r11) {
        /*
            r6 = this;
            r5 = -1
            r3 = 0
        L2:
            if (r3 >= r8) goto L3d
            long[] r0 = r6.A0F
            r0 = r0[r7]
            int r4 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.FD.A0I
            r0 = 4
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 119(0x77, float:1.67E-43)
            if (r1 == r0) goto L1f
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L1f:
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.FD.A0I
            java.lang.String r1 = "2t88pR0KuusKqROhFGTpPzoT6JtiYocO"
            r0 = 7
            r2[r0] = r1
            if (r4 > 0) goto L3d
            if (r11 == 0) goto L32
            int[] r0 = r6.A0B
            r0 = r0[r7]
            r0 = r0 & 1
            if (r0 == 0) goto L33
        L32:
            r5 = r3
        L33:
            int r7 = r7 + 1
            int r0 = r6.A01
            if (r7 != r0) goto L3a
            r7 = 0
        L3a:
            int r3 = r3 + 1
            goto L2
        L3d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.FD.A01(int, int, long, boolean):int");
    }

    private long A02(int i2) {
        this.A06 = Math.max(this.A06, A03(i2));
        this.A02 -= i2;
        this.A00 += i2;
        this.A04 += i2;
        if (this.A04 >= this.A01) {
            this.A04 -= this.A01;
        }
        this.A03 -= i2;
        if (this.A03 < 0) {
            this.A03 = 0;
        }
        if (this.A02 == 0) {
            int relativeLastDiscardIndex = this.A04 == 0 ? this.A01 : this.A04;
            int i3 = relativeLastDiscardIndex - 1;
            long j2 = this.A0E[i3];
            int relativeLastDiscardIndex2 = this.A0C[i3];
            return j2 + relativeLastDiscardIndex2;
        }
        return this.A0E[this.A04];
    }

    private long A03(int i2) {
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        long j2 = Long.MIN_VALUE;
        int A00 = A00(i2 - 1);
        for (int i3 = 0; i3 < i2; i3++) {
            long largestTimestampUs = this.A0F[A00];
            j2 = Math.max(j2, largestTimestampUs);
            if ((this.A0B[A00] & 1) != 0) {
                break;
            }
            A00--;
            if (A00 == -1) {
                A00 = this.A01 - 1;
                if (A0I[1].length() != 19) {
                    throw new RuntimeException();
                }
                A0I[6] = "3SlA6b43nql7FrrkKRcIyQIEhITz0K6U";
            }
        }
        return j2;
    }

    private final synchronized void A04(long j2) {
        this.A07 = Math.max(this.A07, j2);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i2;
        i2 = this.A02 - this.A03;
        int skipCount = this.A02;
        this.A03 = skipCount;
        return i2;
    }

    public final synchronized int A08(long j2, boolean z2, boolean z3) {
        int A00 = A00(this.A03);
        if (!A0I() || j2 < this.A0F[A00] || (j2 > this.A07 && !z3)) {
            return -1;
        }
        int i2 = this.A02;
        int relativeReadIndex = this.A03;
        int offset = A01(A00, i2 - relativeReadIndex, j2, z2);
        if (offset == -1) {
            return -1;
        }
        int relativeReadIndex2 = this.A03;
        this.A03 = relativeReadIndex2 + offset;
        return offset;
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[RETURN] */
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
            if (r2 < 0) goto L2d
            int r1 = r5.A02
            int r0 = r5.A03
            int r1 = r1 - r0
            if (r2 > r1) goto L2d
            r0 = 1
        L10:
            com.instagram.common.viewpoint.core.AbstractC0576Hf.A03(r0)
            int r0 = r5.A02
            int r0 = r0 - r2
            r5.A02 = r0
            long r2 = r5.A06
            int r0 = r5.A02
            long r0 = r5.A03(r0)
            long r0 = java.lang.Math.max(r2, r0)
            r5.A07 = r0
            int r0 = r5.A02
            if (r0 != 0) goto L2f
            r0 = 0
            return r0
        L2d:
            r0 = 0
            goto L10
        L2f:
            int r0 = r5.A02
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.FD.A0C(int):long");
    }

    public final synchronized long A0D(long j2, boolean z2, boolean z3) {
        if (this.A02 != 0 && j2 >= this.A0F[this.A04]) {
            int A01 = A01(this.A04, (!z3 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j2, z2);
            if (A01 == -1) {
                return -1L;
            }
            return A02(A01);
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final void A0H(boolean z2) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z2) {
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
        if (IK.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
