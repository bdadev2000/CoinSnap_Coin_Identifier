package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes4.dex */
public final class MutableIntSet extends IntSet {
    public int e;

    public MutableIntSet(int i2) {
        this.f1443a = ScatterMapKt.f1590a;
        this.f1444b = IntSetKt.f1446a;
        if (i2 >= 0) {
            e(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r3 = d(r20);
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0085, code lost:
    
        if (r37.e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (((r37.f1443a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        r3 = r37.f1445c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a3, code lost:
    
        if (r3 <= 8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b7, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.d * 32, r3 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        r3 = r37.f1443a;
        r5 = r37.f1445c;
        r6 = r37.f1444b;
        androidx.collection.ScatterMapKt.a(r3, r5);
        r9 = 0;
        r14 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        if (r9 == r5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c6, code lost:
    
        r17 = r9 >> 3;
        r18 = (r9 & 7) << 3;
        r24 = (r3[r17] >> r18) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        if (r24 != r7) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r24 == 254) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
    
        r24 = java.lang.Integer.hashCode(r6[r9]) * (-862048943);
        r11 = r14;
        r14 = (r24 ^ (r24 << 16)) >>> 7;
        r26 = d(r14);
        r14 = r14 & r5;
        r25 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0112, code lost:
    
        if ((((r26 - r14) & r5) / 8) != (((r9 - r14) & r5) / 8)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0114, code lost:
    
        r3[r17] = (r3[r17] & (~(255 << r18))) | ((r21 & 127) << r18);
        r3[r3.length - r15] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r25 + 1;
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0131, code lost:
    
        r7 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0134, code lost:
    
        r7 = r26 >> 3;
        r8 = r3[r7];
        r10 = (r26 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0144, code lost:
    
        if (((r8 >> r10) & 255) != 128) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0146, code lost:
    
        r35 = r2;
        r3[r7] = ((~(255 << r10)) & r8) | ((r21 & 127) << r10);
        r3[r17] = (r3[r17] & (~(255 << r18))) | (128 << r18);
        r6[r26] = r6[r25];
        r6[r25] = 0;
        r9 = r25;
        r14 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0193, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r15 = 1;
        r2 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016d, code lost:
    
        r35 = r2;
        r3[r7] = ((r21 & 127) << r10) | (r8 & (~(255 << r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017b, code lost:
    
        if (r11 != (-1)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017d, code lost:
    
        r14 = androidx.collection.ScatterMapKt.b(r3, r25 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0185, code lost:
    
        r6[r14] = r6[r26];
        r6[r26] = r6[r25];
        r6[r25] = r6[r14];
        r9 = r25 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0184, code lost:
    
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
    
        r14 = r9;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a6, code lost:
    
        r35 = r2;
        r37.e = androidx.collection.ScatterMapKt.c(r37.f1445c) - r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0227, code lost:
    
        r18 = d(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0230, code lost:
    
        r2 = true;
        r37.d++;
        r1 = r37.e;
        r3 = r37.f1443a;
        r4 = r18 >> 3;
        r5 = r3[r4];
        r7 = (r18 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0249, code lost:
    
        if (((r5 >> r7) & 255) != 128) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x024b, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x024e, code lost:
    
        r37.e = r1 - r8;
        r1 = r37.f1445c;
        r5 = (r5 & (~(255 << r7))) | (r22 << r7);
        r3[r4] = r5;
        r3[(((r18 - 7) & r1) + (r1 & 7)) >> 3] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x024d, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01b6, code lost:
    
        r35 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
    
        r1 = androidx.collection.ScatterMapKt.e(r37.f1445c);
        r2 = r37.f1443a;
        r3 = r37.f1444b;
        r5 = r37.f1445c;
        e(r1);
        r1 = r37.f1443a;
        r6 = r37.f1444b;
        r7 = r37.f1445c;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d5, code lost:
    
        if (r9 >= r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01e5, code lost:
    
        if (((r2[r9 >> 3] >> ((r9 & 7) << 3)) & 255) >= 128) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e7, code lost:
    
        r10 = r3[r9];
        r11 = java.lang.Integer.hashCode(r10) * (-862048943);
        r11 = r11 ^ (r11 << 16);
        r15 = d(r11 >>> 7);
        r17 = r9;
        r8 = r11 & 127;
        r11 = r15 >> 3;
        r18 = (r15 & 7) << 3;
        r8 = (r8 << r18) | (r1[r11] & (~(255 << r18)));
        r1[r11] = r8;
        r1[(((r15 - 7) & r7) + (r7 & 7)) >> 3] = r8;
        r6[r15] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0223, code lost:
    
        r9 = r17 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0221, code lost:
    
        r17 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ba, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x009b, code lost:
    
        r35 = r2;
        r22 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x022e, code lost:
    
        r18 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r38) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableIntSet.b(int):boolean");
    }

    public final void c() {
        this.d = 0;
        long[] jArr = this.f1443a;
        if (jArr != ScatterMapKt.f1590a) {
            q.Y(jArr);
            long[] jArr2 = this.f1443a;
            int i2 = this.f1445c;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        this.e = ScatterMapKt.c(this.f1445c) - this.d;
    }

    public final int d(int i2) {
        int i3 = this.f1445c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1443a;
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

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.f1445c = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1443a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.e = ScatterMapKt.c(this.f1445c) - this.d;
        this.f1444b = new int[max];
    }

    public final void f(int i2) {
        this.d--;
        long[] jArr = this.f1443a;
        int i3 = this.f1445c;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
    }

    public /* synthetic */ MutableIntSet() {
        this(6);
    }
}
