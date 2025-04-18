package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes2.dex */
public final class MutableIntIntMap extends IntIntMap {

    /* renamed from: f, reason: collision with root package name */
    public int f1472f;

    public MutableIntIntMap(int i2) {
        this.f1429a = ScatterMapKt.f1590a;
        int[] iArr = IntSetKt.f1446a;
        this.f1430b = iArr;
        this.f1431c = iArr;
        if (i2 >= 0) {
            f(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void d() {
        this.e = 0;
        long[] jArr = this.f1429a;
        if (jArr != ScatterMapKt.f1590a) {
            q.Y(jArr);
            long[] jArr2 = this.f1429a;
            int i2 = this.d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        this.f1472f = ScatterMapKt.c(this.d) - this.e;
    }

    public final int e(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1429a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    public final void f(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1429a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1472f = ScatterMapKt.c(this.d) - this.e;
        this.f1430b = new int[max];
        this.f1431c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r2 = r0.e(r4);
        r6 = 128;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r0.f1472f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (((r0.f1429a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        r2 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009c, code lost:
    
        if (r2 <= 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        if (java.lang.Long.compareUnsigned(r0.e * 32, r2 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r2 = r0.f1429a;
        r5 = r0.d;
        r8 = r0.f1430b;
        r9 = r0.f1431c;
        androidx.collection.ScatterMapKt.a(r2, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bf, code lost:
    
        if (r15 == r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c1, code lost:
    
        r18 = r15 >> 3;
        r25 = (r15 & 7) << 3;
        r23 = (r2[r18] >> r25) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
    
        if (r23 != r6) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00db, code lost:
    
        if (r23 == 254) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e0, code lost:
    
        r23 = java.lang.Integer.hashCode(r8[r15]) * r3;
        r10 = (r23 ^ (r23 << 16)) >>> 7;
        r26 = r0.e(r10);
        r10 = r10 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0107, code lost:
    
        if ((((r26 - r10) & r5) / 8) != (((r15 - r10) & r5) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0109, code lost:
    
        r2[r18] = (r2[r18] & (~(255 << r25))) | ((r23 & 127) << r25);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r3 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0130, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0133, code lost:
    
        r14 = r13;
        r6 = r15;
        r3 = r26 >> 3;
        r19 = r2[r3];
        r7 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        if (((r19 >> r7) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0147, code lost:
    
        r2[r3] = (r19 & (~(255 << r7))) | ((r23 & 127) << r7);
        r2[r18] = (r2[r18] & (~(255 << r25))) | (128 << r25);
        r8[r26] = r8[r6];
        r8[r6] = 0;
        r9[r26] = r9[r6];
        r9[r6] = 0;
        r1 = r6;
        r18 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a7, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r3 = -862048943;
        r0 = r37;
        r13 = r6;
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0173, code lost:
    
        r18 = r9;
        r2[r3] = ((r23 & 127) << r7) | (r19 & (~(255 << r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0182, code lost:
    
        if (r14 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0184, code lost:
    
        r13 = androidx.collection.ScatterMapKt.b(r2, r6 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018c, code lost:
    
        r8[r13] = r8[r26];
        r8[r26] = r8[r6];
        r8[r6] = r8[r13];
        r18[r13] = r18[r26];
        r18[r26] = r18[r6];
        r18[r6] = r18[r13];
        r1 = r6 - 1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x018b, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00dd, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        r36 = r15;
        r15 = r15 + 1;
        r13 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c2, code lost:
    
        r1 = r0;
        r19 = 0;
        r1.f1472f = androidx.collection.ScatterMapKt.c(r1.d) - r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0259, code lost:
    
        r2 = r1.e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x025d, code lost:
    
        r3 = 1;
        r1.e++;
        r0 = r1.f1472f;
        r4 = r1.f1429a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0278, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x027b, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x027d, code lost:
    
        r1.f1472f = r0 - r3;
        r0 = r1.d;
        r6 = (r6 & (~(255 << r8))) | (r21 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d2, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d3, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        r0 = androidx.collection.ScatterMapKt.e(r1.d);
        r2 = r1.f1429a;
        r3 = r1.f1430b;
        r5 = r1.f1431c;
        r6 = r1.d;
        r1.f(r0);
        r0 = r1.f1429a;
        r7 = r1.f1430b;
        r8 = r1.f1431c;
        r9 = r1.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01f5, code lost:
    
        if (r10 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0206, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r11) >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0208, code lost:
    
        r14 = r3[r10];
        r15 = java.lang.Integer.hashCode(r14) * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r13 = r1.e(r15 >>> 7);
        r11 = r15 & 127;
        r15 = r13 >> 3;
        r16 = (r13 & 7) << 3;
        r18 = r2;
        r27 = r3;
        r2 = (r0[r15] & (~(255 << r16))) | (r11 << r16);
        r0[r15] = r2;
        r0[(((r13 - 7) & r9) + (r9 & 7)) >> 3] = r2;
        r7[r13] = r14;
        r8[r13] = r5[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0250, code lost:
    
        r10 = r10 + 1;
        r2 = r18;
        r3 = r27;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0249, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d6, code lost:
    
        r1 = r0;
        r21 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0093, code lost:
    
        r1 = r0;
        r21 = r9;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r38, int r39) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntIntMap.g(int, int):void");
    }

    public /* synthetic */ MutableIntIntMap() {
        this(6);
    }
}
