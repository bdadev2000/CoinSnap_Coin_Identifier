package androidx.compose.foundation.lazy.staggeredgrid;

import com.google.android.gms.common.api.Api;
import e0.n;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LazyStaggeredGridMeasureKt {
    public static final ArrayList a(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, n[] nVarArr, int[] iArr, int i2) {
        int i3 = 0;
        for (n nVar : nVarArr) {
            i3 += nVar.f30212c;
        }
        ArrayList arrayList = new ArrayList(i3);
        while (true) {
            for (n nVar2 : nVarArr) {
                if (!nVar2.isEmpty()) {
                    int length = nVarArr.length;
                    int i4 = -1;
                    int i5 = Integer.MAX_VALUE;
                    for (int i6 = 0; i6 < length; i6++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) nVarArr[i6].f();
                        int i7 = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.f5018a : Integer.MAX_VALUE;
                        if (i5 > i7) {
                            i4 = i6;
                            i5 = i7;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem2 = (LazyStaggeredGridMeasuredItem) nVarArr[i4].removeFirst();
                    int i8 = lazyStaggeredGridMeasuredItem2.e;
                    if (i8 == i4) {
                        long j2 = (i8 << 32) | ((lazyStaggeredGridMeasuredItem2.f5021f + i8) & 4294967295L);
                        int d = d(iArr, j2);
                        lazyStaggeredGridMeasuredItem2.h(d, lazyStaggeredGridMeasureContext.d.f5045a[i4], i2);
                        arrayList.add(lazyStaggeredGridMeasuredItem2);
                        int i9 = (int) (j2 & 4294967295L);
                        for (int i10 = (int) (j2 >> 32); i10 < i9; i10++) {
                            iArr[i10] = lazyStaggeredGridMeasuredItem2.f5029n + d;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    public static final int b(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public static int c(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (-2147483647 <= i5 && i5 < i3) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    public static final int d(int[] iArr, long j2) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = Integer.MIN_VALUE;
        for (int i4 = (int) (j2 >> 32); i4 < i2; i4++) {
            i3 = Math.max(i3, iArr[i4]);
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x061e, code lost:
    
        if (r6[r3] > r11) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
    
        r4 = b(r8);
        r6 = r8[r4];
        r7 = r12.length;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        if (r9 >= r7) goto L414;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        r20 = r7;
        r24 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        if (r8[r9] == r8[r4]) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        r7 = r12[r9];
        r15 = r12[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        if (r7 >= r15) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        r12[r9] = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x03af, code lost:
    
        r2 = c(r9);
        r4 = b(r40);
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x03b7, code lost:
    
        if (r2 == r4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x03bf, code lost:
    
        if (r9[r2] != r9[r4]) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x03c1, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
    
        r9 = r9 + 1;
        r7 = r20;
        r15 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x03c2, code lost:
    
        r4 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x03cc, code lost:
    
        r15 = r40[r2];
        r36 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x03d1, code lost:
    
        if (r15 != (-1)) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x03d3, code lost:
    
        r15 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x03d4, code lost:
    
        r0 = r5.d(r15, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x03d8, code lost:
    
        if (r0 >= 0) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0425, code lost:
    
        r23 = r8;
        r41 = r12;
        r39 = r13;
        r12 = r21;
        r13 = r42;
        r42 = r7;
        r59 = r40;
        r40 = r6;
        r7 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.a(r13, r0, r2);
        r1 = (int) (r7 & 4294967295L);
        r24 = r3;
        r61 = r4;
        r2 = (int) (r7 >> 32);
        r3 = r1 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0453, code lost:
    
        if (r3 == 1) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0455, code lost:
    
        r4 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0458, code lost:
    
        r5.i(r0, r4);
        r4 = r10.c(r0, r7);
        r7 = d(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0464, code lost:
    
        if (r3 == 1) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0466, code lost:
    
        r3 = r5.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x046d, code lost:
    
        r8 = r2;
        r2 = r61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0470, code lost:
    
        if (r8 >= r1) goto L489;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0472, code lost:
    
        r25 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0476, code lost:
    
        if (r9[r8] == r7) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0478, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0479, code lost:
    
        r22[r8].addFirst(r4);
        r59[r8] = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0480, code lost:
    
        if (r3 != null) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0482, code lost:
    
        r61 = r0;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x048a, code lost:
    
        r9[r8] = (r4.f5029n + r7) + r1;
        r8 = r8 + 1;
        r0 = r61;
        r1 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0486, code lost:
    
        r1 = r3[r8];
        r61 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x046b, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0457, code lost:
    
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x03da, code lost:
    
        r15 = r60;
        r0 = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x03de, code lost:
    
        if (r4 != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x03e4, code lost:
    
        if (f(r0, r15, r9, r2) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x03e7, code lost:
    
        r2 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0410, code lost:
    
        r21 = r1;
        r24 = r3;
        r1 = r4;
        r40 = r6;
        r23 = r8;
        r41 = r12;
        r39 = r13;
        r13 = r42;
        r6 = r0;
        r12 = r2;
        r42 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00eb, code lost:
    
        r24 = r15;
        r6 = r5.d(r6, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x03ea, code lost:
    
        if (r64 == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x03ec, code lost:
    
        r5.g();
        r0 = r0.length;
        r1 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x03f3, code lost:
    
        if (r3 >= r0) goto L492;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x03f5, code lost:
    
        r1[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x03fb, code lost:
    
        r0 = r9.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x03ff, code lost:
    
        if (r4 >= r0) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        if (r6 >= 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0401, code lost:
    
        r3[r4] = r9[r2];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x040f, code lost:
    
        return e(r15, r21, r1, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x03c5, code lost:
    
        r2 = r2;
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fa, code lost:
    
        r0 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext.a(r3, r6, r4);
        r7 = r3;
        r3 = (int) (r0 & 4294967295L);
        r15 = r13;
        r63 = r14;
        r4 = (int) (r0 >> 32);
        r9 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (r9 == 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0114, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0117, code lost:
    
        r5.i(r6, r14);
        r14 = r10.c(r6, r0);
        r0 = d(r12, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        if (r9 == 1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0124, code lost:
    
        r18 = r5.e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        r1 = r62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x012a, code lost:
    
        if (r4 >= r3) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
    
        r8[r4] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012e, code lost:
    
        if (r18 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0130, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0134, code lost:
    
        r13 = (r14.f5029n + r0) + r9;
        r12[r4] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        if ((r13 + r11) > 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013d, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013e, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0132, code lost:
    
        r9 = r18[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0116, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
    
        r7 = r3;
        r15 = r13;
        r63 = r14;
        r0 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult e(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r60, int r61, int[] r62, int[] r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 2478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.e(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    public static final boolean f(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        int i3 = 0;
        while (true) {
            LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = lazyStaggeredGridMeasureContext.f4984q;
            if (i3 >= length) {
                int length2 = iArr.length;
                for (int i4 = 0; i4 < length2; i4++) {
                    if (lazyStaggeredGridLaneInfo.d(iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                        return true;
                    }
                }
                int f2 = lazyStaggeredGridLaneInfo.f(0);
                return (f2 == 0 || f2 == -1 || f2 == -2) ? false : true;
            }
            if (lazyStaggeredGridLaneInfo.d(iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
            i3++;
        }
    }

    public static final void g(int i2, int[] iArr) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }
}
