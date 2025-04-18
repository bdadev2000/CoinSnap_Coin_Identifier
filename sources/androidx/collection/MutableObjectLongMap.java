package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes3.dex */
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {

    /* renamed from: f, reason: collision with root package name */
    public int f1486f;

    public MutableObjectLongMap(int i2) {
        this.f1553a = ScatterMapKt.f1590a;
        this.f1554b = ContainerHelpersKt.f1619c;
        this.f1555c = LongSetKt.f1465a;
        if (i2 >= 0) {
            d(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int c(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1553a;
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

    public final void d(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1553a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1486f = ScatterMapKt.c(this.d) - this.e;
        this.f1554b = new Object[max];
        this.f1555c = new long[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        r2 = r0.c(r4);
        r6 = 128;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r0.f1486f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0095, code lost:
    
        if (((r0.f1553a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        r2 = r0.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2 <= 8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (java.lang.Long.compareUnsigned(r0.e * 32, r2 * 25) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        r2 = r0.f1553a;
        r5 = r0.d;
        r8 = r0.f1554b;
        r9 = r0.f1555c;
        androidx.collection.ScatterMapKt.a(r2, r5);
        r13 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        if (r15 == r5) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        r16 = r15 >> 3;
        r27 = (r15 & 7) << 3;
        r25 = (r2[r16] >> r27) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
    
        if (r25 != r6) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dd, code lost:
    
        if (r25 == 254) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e2, code lost:
    
        r25 = r8[r15];
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e4, code lost:
    
        if (r25 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        r25 = r25.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ed, code lost:
    
        r25 = r25 * r3;
        r10 = (r25 ^ (r25 << 16)) >>> 7;
        r28 = r0.c(r10);
        r10 = r10 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
    
        if ((((r28 - r10) & r5) / 8) != (((r15 - r10) & r5) / 8)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0110, code lost:
    
        r2[r16] = (r2[r16] & (~(255 << r27))) | ((r25 & 127) << r27);
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r13 = r13;
        r3 = -862048943;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0137, code lost:
    
        r6 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        r14 = r13;
        r6 = r15;
        r3 = r28 >> 3;
        r19 = r2[r3];
        r7 = (r28 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014c, code lost:
    
        if (((r19 >> r7) & 255) != 128) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014e, code lost:
    
        r2[r3] = (r19 & (~(255 << r7))) | ((r25 & 127) << r7);
        r2[r16] = (r2[r16] & (~(255 << r27))) | (128 << r27);
        r8[r28] = r8[r6];
        r8[r6] = null;
        r9[r28] = r9[r6];
        r9[r6] = 0;
        r1 = r6;
        r16 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ae, code lost:
    
        r2[r2.length - 1] = (r2[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r1 + 1;
        r3 = -862048943;
        r0 = r39;
        r13 = r6;
        r9 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x017a, code lost:
    
        r16 = r9;
        r2[r3] = ((r25 & 127) << r7) | (r19 & (~(255 << r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0189, code lost:
    
        if (r14 != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
    
        r13 = androidx.collection.ScatterMapKt.b(r2, r6 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0193, code lost:
    
        r8[r13] = r8[r28];
        r8[r28] = r8[r6];
        r8[r6] = r8[r13];
        r16[r13] = r16[r28];
        r16[r28] = r16[r6];
        r16[r6] = r16[r13];
        r1 = r6 - 1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00eb, code lost:
    
        r25 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00df, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d3, code lost:
    
        r38 = r15;
        r15 = r15 + 1;
        r13 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c9, code lost:
    
        r1 = r0;
        r19 = 0;
        r1.f1486f = androidx.collection.ScatterMapKt.c(r1.d) - r1.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0266, code lost:
    
        r2 = r1.c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x026a, code lost:
    
        r3 = 1;
        r1.e++;
        r0 = r1.f1486f;
        r4 = r1.f1553a;
        r5 = r2 >> 3;
        r6 = r4[r5];
        r8 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0285, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0288, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x028a, code lost:
    
        r1.f1486f = r0 - r3;
        r0 = r1.d;
        r6 = (r6 & (~(255 << r8))) | (r23 << r8);
        r4[r5] = r6;
        r4[(((r2 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r0 = ~r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d9, code lost:
    
        r1 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01da, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e1, code lost:
    
        r0 = androidx.collection.ScatterMapKt.e(r1.d);
        r2 = r1.f1553a;
        r3 = r1.f1554b;
        r5 = r1.f1555c;
        r6 = r1.d;
        r1.d(r0);
        r0 = r1.f1553a;
        r7 = r1.f1554b;
        r8 = r1.f1555c;
        r9 = r1.d;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01fc, code lost:
    
        if (r10 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020d, code lost:
    
        if (((r2[r10 >> 3] >> ((r10 & 7) << 3)) & r11) >= 128) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x020f, code lost:
    
        r14 = r3[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0211, code lost:
    
        if (r14 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0213, code lost:
    
        r15 = r14.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021e, code lost:
    
        r15 = r15 * (-862048943);
        r15 = r15 ^ (r15 << 16);
        r13 = r1.c(r15 >>> 7);
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
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025d, code lost:
    
        r10 = r10 + 1;
        r2 = r18;
        r3 = r27;
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x021b, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0256, code lost:
    
        r18 = r2;
        r27 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01dd, code lost:
    
        r1 = r0;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0097, code lost:
    
        r1 = r0;
        r23 = r9;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r40, java.lang.Object r42) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableObjectLongMap.e(long, java.lang.Object):void");
    }
}
