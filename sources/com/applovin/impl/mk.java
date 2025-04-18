package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes.dex */
final class mk {

    /* renamed from: a, reason: collision with root package name */
    private final bh f25589a = new bh(8);

    /* renamed from: b, reason: collision with root package name */
    private int f25590b;

    private long a(l8 l8Var) {
        int i2 = 0;
        l8Var.c(this.f25589a.c(), 0, 1);
        int i3 = this.f25589a.c()[0] & UnsignedBytes.MAX_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i4 = 128;
        int i5 = 0;
        while ((i3 & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = i3 & (~i4);
        l8Var.c(this.f25589a.c(), 1, i5);
        while (i2 < i5) {
            i2++;
            i6 = (this.f25589a.c()[i2] & UnsignedBytes.MAX_VALUE) + (i6 << 8);
        }
        this.f25590b = i5 + 1 + this.f25590b;
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean b(com.applovin.impl.l8 r14) {
        /*
            r13 = this;
            long r0 = r14.a()
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 1024(0x400, double:5.06E-321)
            if (r2 == 0) goto L12
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L11
            goto L12
        L11:
            r3 = r0
        L12:
            int r3 = (int) r3
            com.applovin.impl.bh r4 = r13.f25589a
            byte[] r4 = r4.c()
            r5 = 0
            r6 = 4
            r14.c(r4, r5, r6)
            com.applovin.impl.bh r4 = r13.f25589a
            long r7 = r4.y()
            r13.f25590b = r6
        L26:
            r9 = 440786851(0x1a45dfa3, double:2.1777764E-315)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r6 = 1
            if (r4 == 0) goto L54
            int r4 = r13.f25590b
            int r4 = r4 + r6
            r13.f25590b = r4
            if (r4 != r3) goto L36
            return r5
        L36:
            com.applovin.impl.bh r4 = r13.f25589a
            byte[] r4 = r4.c()
            r14.c(r4, r5, r6)
            r4 = 8
            long r6 = r7 << r4
            r8 = -256(0xffffffffffffff00, double:NaN)
            long r6 = r6 & r8
            com.applovin.impl.bh r4 = r13.f25589a
            byte[] r4 = r4.c()
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            long r8 = (long) r4
            long r7 = r6 | r8
            goto L26
        L54:
            long r3 = r13.a(r14)
            int r7 = r13.f25590b
            long r7 = (long) r7
            r9 = -9223372036854775808
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 == 0) goto L9e
            if (r2 == 0) goto L6a
            long r11 = r7 + r3
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 < 0) goto L6a
            goto L9e
        L6a:
            int r0 = r13.f25590b
            long r0 = (long) r0
            long r11 = r7 + r3
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 >= 0) goto L9b
            long r0 = r13.a(r14)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 != 0) goto L7c
            return r5
        L7c:
            long r0 = r13.a(r14)
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L9a
            r11 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L8e
            goto L9a
        L8e:
            if (r2 == 0) goto L6a
            int r0 = (int) r0
            r14.c(r0)
            int r1 = r13.f25590b
            int r1 = r1 + r0
            r13.f25590b = r1
            goto L6a
        L9a:
            return r5
        L9b:
            if (r0 != 0) goto L9e
            r5 = r6
        L9e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mk.b(com.applovin.impl.l8):boolean");
    }
}
