package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import p0.a;

/* loaded from: classes4.dex */
public abstract class LongIntMap {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1450a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f1451b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f1452c;
    public int d;
    public int e;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r3 = java.lang.Long.hashCode(r18)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L17:
            long[] r7 = r0.f1450a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            int r8 = r8 + 1
            r12 = r7[r8]
            int r7 = 64 - r9
            long r7 = r12 << r7
            long r12 = (long) r9
            long r12 = -r12
            r9 = 63
            long r12 = r12 >> r9
            long r7 = r7 & r12
            long r7 = r7 | r10
            long r9 = (long) r4
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r7
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L43:
            r13 = 0
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 == 0) goto L60
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r13 + r3
            r13 = r13 & r5
            long[] r14 = r0.f1451b
            r15 = r14[r13]
            int r14 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r14 != 0) goto L5a
            goto L6a
        L5a:
            r13 = 1
            long r13 = r9 - r13
            long r9 = r9 & r13
            goto L43
        L60:
            long r9 = ~r7
            r15 = 6
            long r9 = r9 << r15
            long r7 = r7 & r9
            long r7 = r7 & r11
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L7d
            r13 = -1
        L6a:
            if (r13 < 0) goto L71
            int[] r1 = r0.f1452c
            r1 = r1[r13]
            return r1
        L71:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r4 = "Cannot find value for key "
            java.lang.String r1 = android.support.v4.media.d.m(r4, r1)
            r3.<init>(r1)
            throw r3
        L7d:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LongIntMap.a(long):int");
    }

    public final boolean equals(Object obj) {
        int i2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LongIntMap)) {
            return false;
        }
        LongIntMap longIntMap = (LongIntMap) obj;
        if (longIntMap.e != this.e) {
            return false;
        }
        long[] jArr = this.f1451b;
        int[] iArr = this.f1452c;
        long[] jArr2 = this.f1450a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8;
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    int i6 = 0;
                    while (i6 < i5) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            i2 = i6;
                            if (iArr[i7] != longIntMap.a(jArr[i7])) {
                                return false;
                            }
                            i4 = 8;
                        } else {
                            i2 = i6;
                        }
                        j2 >>= i4;
                        i6 = i2 + 1;
                    }
                    if (i5 != i4) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        return true;
    }

    public final int hashCode() {
        long[] jArr = this.f1451b;
        int[] iArr = this.f1452c;
        long[] jArr2 = this.f1450a;
        int length = jArr2.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr2[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            long j3 = jArr[i7];
                            i4 += Integer.hashCode(iArr[i7]) ^ Long.hashCode(j3);
                        }
                        j2 >>= 8;
                    }
                    if (i5 != 8) {
                        return i4;
                    }
                }
                if (i3 == length) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
        }
        return i2;
    }

    public final String toString() {
        int i2;
        int i3;
        if (this.e == 0) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f1451b;
        int[] iArr = this.f1452c;
        long[] jArr2 = this.f1450a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j2) < 128) {
                            int i8 = (i4 << 3) + i7;
                            i3 = i4;
                            long j3 = jArr[i8];
                            int i9 = iArr[i8];
                            sb.append(j3);
                            sb.append(ImpressionLog.R);
                            sb.append(i9);
                            i5++;
                            if (i5 < this.e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j2 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i10 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i10;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        a.r(sb2, "s.append('}').toString()");
        return sb2;
    }
}
