package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes.dex */
public final class MutableLongIntMap extends LongIntMap {

    /* renamed from: f, reason: collision with root package name */
    public int f1474f;

    public MutableLongIntMap(int i2) {
        this.f1450a = ScatterMapKt.f1590a;
        this.f1451b = LongSetKt.f1465a;
        this.f1452c = IntSetKt.f1446a;
        if (i2 >= 0) {
            c(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int b(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1450a;
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

    public final void c(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1450a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1474f = ScatterMapKt.c(this.d) - this.e;
        this.f1451b = new long[max];
        this.f1452c = new int[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
    
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        r1 = b(r3);
        r5 = 128;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r37.f1474f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0090, code lost:
    
        if (((r37.f1450a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        r1 = r37.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (r1 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
    
        if (java.lang.Long.compareUnsigned(r37.e * 32, r1 * 25) > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
    
        r1 = r37.f1450a;
        r2 = r37.d;
        r3 = r37.f1451b;
        r4 = r37.f1452c;
        androidx.collection.ScatterMapKt.a(r1, r2);
        r12 = -1;
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
    
        if (r15 == r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        r18 = r15 >> 3;
        r26 = (r15 & 7) << 3;
        r24 = (r1[r18] >> r26) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r24 != r5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r24 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00de, code lost:
    
        r24 = java.lang.Long.hashCode(r3[r15]) * (-862048943);
        r14 = (r24 ^ (r24 << 16)) >>> 7;
        r27 = b(r14);
        r14 = r14 & r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0105, code lost:
    
        if ((((r27 - r14) & r2) / 8) != (((r15 - r14) & r2) / r7)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0129, code lost:
    
        r6 = r12;
        r5 = r27 >> 3;
        r13 = r1[r5];
        r19 = (r27 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
    
        if (((r13 >> r19) & 255) != 128) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013c, code lost:
    
        r1[r5] = (r13 & (~(255 << r19))) | ((r24 & 127) << r19);
        r1[r18] = (r1[r18] & (~(255 << r26))) | (128 << r26);
        r3[r27] = r3[r15];
        r3[r15] = 0;
        r4[r27] = r4[r15];
        r4[r15] = 0;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x019e, code lost:
    
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r5 = 128;
        r7 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0169, code lost:
    
        r7 = r15;
        r1[r5] = ((r24 & 127) << r19) | (r13 & (~(255 << r19)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x017a, code lost:
    
        if (r6 != (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x017c, code lost:
    
        r12 = androidx.collection.ScatterMapKt.b(r1, r7 + 1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0184, code lost:
    
        r3[r12] = r3[r27];
        r3[r27] = r3[r7];
        r3[r7] = r3[r12];
        r4[r12] = r4[r27];
        r4[r27] = r4[r7];
        r4[r7] = r4[r12];
        r15 = r7 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0183, code lost:
    
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0107, code lost:
    
        r1[r18] = ((r24 & 127) << r26) | (r1[r18] & (~(255 << r26)));
        r1[r1.length - 1] = (r1[0] & 72057594037927935L) | Long.MIN_VALUE;
        r15 = r15 + 1;
        r5 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        r36 = r15;
        r15 = r15 + 1;
        r12 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01b3, code lost:
    
        r19 = 0;
        r37.f1474f = androidx.collection.ScatterMapKt.c(r37.d) - r37.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01c0, code lost:
    
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0251, code lost:
    
        r1 = b(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0255, code lost:
    
        r3 = 1;
        r37.e++;
        r2 = r37.f1474f;
        r4 = r37.f1450a;
        r5 = r1 >> 3;
        r6 = r4[r5];
        r8 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0270, code lost:
    
        if (((r6 >> r8) & 255) != 128) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0273, code lost:
    
        r3 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0275, code lost:
    
        r37.f1474f = r2 - r3;
        r2 = r37.d;
        r6 = (r6 & (~(255 << r8))) | (r26 << r8);
        r4[r5] = r6;
        r4[(((r1 - 7) & r2) + (r2 & 7)) >> 3] = r6;
        r1 = ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c6, code lost:
    
        r19 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cc, code lost:
    
        r1 = androidx.collection.ScatterMapKt.e(r37.d);
        r2 = r37.f1450a;
        r3 = r37.f1451b;
        r4 = r37.f1452c;
        r5 = r37.d;
        c(r1);
        r1 = r37.f1450a;
        r6 = r37.f1451b;
        r7 = r37.f1452c;
        r12 = r37.d;
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e7, code lost:
    
        if (r13 >= r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f8, code lost:
    
        if (((r2[r13 >> 3] >> ((r13 & 7) << 3)) & r8) >= 128) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fa, code lost:
    
        r14 = r3[r13];
        r16 = java.lang.Long.hashCode(r14) * (-862048943);
        r16 = r16 ^ (r16 << 16);
        r8 = b(r16 >>> 7);
        r9 = r16 & 127;
        r16 = r2;
        r18 = r3;
        r2 = r9;
        r9 = r8 >> 3;
        r22 = (r8 & 7) << 3;
        r26 = r10;
        r2 = (r2 << r22) | (r1[r9] & (~(255 << r22)));
        r1[r9] = r2;
        r1[(((r8 - 7) & r12) + (r12 & 7)) >> 3] = r2;
        r6[r8] = r14;
        r7[r8] = r4[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0246, code lost:
    
        r13 = r13 + 1;
        r2 = r16;
        r3 = r18;
        r10 = r26;
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023d, code lost:
    
        r16 = r2;
        r18 = r3;
        r26 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c9, code lost:
    
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0092, code lost:
    
        r26 = r10;
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r38, long r39) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongIntMap.d(int, long):void");
    }
}
