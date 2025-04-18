package androidx.collection;

import com.applovin.impl.sdk.utils.JsonUtils;
import p0.a;

/* loaded from: classes4.dex */
public abstract class FloatObjectMap<V> {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1416a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f1417b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1418c;
    public int d;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(float r14) {
        /*
            r13 = this;
            int r0 = java.lang.Float.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f1416a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5c
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            float[] r11 = r13.f1417b
            r11 = r11[r10]
            int r11 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r11 != 0) goto L56
            goto L66
        L56:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5c:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = -1
        L66:
            if (r10 < 0) goto L6d
            java.lang.Object[] r14 = r13.f1418c
            r14 = r14[r10]
            goto L6e
        L6d:
            r14 = 0
        L6e:
            return r14
        L6f:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.FloatObjectMap.a(float):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        float[] fArr;
        int i2;
        Object[] objArr;
        long[] jArr;
        int i3;
        int i4;
        float[] fArr2;
        Object[] objArr2;
        long[] jArr2;
        int i5;
        int i6;
        long j2;
        int i7;
        if (obj == this) {
            return true;
        }
        int i8 = 0;
        if (!(obj instanceof FloatObjectMap)) {
            return false;
        }
        FloatObjectMap floatObjectMap = (FloatObjectMap) obj;
        floatObjectMap.getClass();
        float[] fArr3 = this.f1417b;
        Object[] objArr3 = this.f1418c;
        long[] jArr3 = this.f1416a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i9 = 0;
        while (true) {
            long j3 = jArr3[i9];
            int i10 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i9 - length)) >>> 31);
                while (i8 < i12) {
                    if ((j3 & 255) < 128) {
                        int i13 = (i9 << 3) + i8;
                        float f2 = fArr3[i13];
                        Object obj2 = objArr3[i13];
                        if (obj2 != null) {
                            fArr2 = fArr3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i5 = length;
                            i6 = i9;
                            j2 = -9187201950435737472L;
                            if (!a.g(obj2, floatObjectMap.a(f2))) {
                                return false;
                            }
                        } else {
                            if (floatObjectMap.a(f2) != null) {
                                return false;
                            }
                            floatObjectMap.getClass();
                            int hashCode = Float.hashCode(f2) * (-862048943);
                            int i14 = hashCode ^ (hashCode << 16);
                            int i15 = i14 & 127;
                            int i16 = floatObjectMap.d;
                            int i17 = (i14 >>> i10) & i16;
                            int i18 = 0;
                            while (true) {
                                long[] jArr4 = floatObjectMap.f1416a;
                                int i19 = i17 >> 3;
                                int i20 = (i17 & 7) << 3;
                                long j5 = jArr4[i19] >>> i20;
                                long j6 = jArr4[i19 + 1] << (64 - i20);
                                objArr2 = objArr3;
                                jArr2 = jArr3;
                                long j7 = j5 | (j6 & ((-i20) >> 63));
                                i5 = length;
                                i6 = i9;
                                long j8 = (i15 * 72340172838076673L) ^ j7;
                                long j9 = (j8 - 72340172838076673L) & (~j8) & (-9187201950435737472L);
                                while (j9 != 0) {
                                    int numberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j9) >> 3)) & i16;
                                    fArr2 = fArr3;
                                    if (floatObjectMap.f1417b[numberOfTrailingZeros] != f2) {
                                        j9 &= j9 - 1;
                                        fArr3 = fArr2;
                                    } else {
                                        if (numberOfTrailingZeros < 0) {
                                            return false;
                                        }
                                        j2 = -9187201950435737472L;
                                    }
                                }
                                float[] fArr4 = fArr3;
                                if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != 0) {
                                    return false;
                                }
                                i18 += 8;
                                i17 = (i17 + i18) & i16;
                                length = i5;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                                i9 = i6;
                                fArr3 = fArr4;
                            }
                        }
                        i7 = 8;
                    } else {
                        fArr2 = fArr3;
                        objArr2 = objArr3;
                        jArr2 = jArr3;
                        i5 = length;
                        i6 = i9;
                        j2 = j4;
                        i7 = i11;
                    }
                    j3 >>= i7;
                    i8++;
                    i11 = i7;
                    j4 = j2;
                    objArr3 = objArr2;
                    jArr3 = jArr2;
                    i9 = i6;
                    fArr3 = fArr2;
                    i10 = 7;
                    length = i5;
                }
                fArr = fArr3;
                objArr = objArr3;
                jArr = jArr3;
                i3 = length;
                int i21 = i9;
                i2 = 0;
                if (i12 != i11) {
                    return true;
                }
                i4 = i21;
            } else {
                fArr = fArr3;
                i2 = i8;
                objArr = objArr3;
                jArr = jArr3;
                i3 = length;
                i4 = i9;
            }
            if (i4 == i3) {
                return true;
            }
            i9 = i4 + 1;
            length = i3;
            i8 = i2;
            objArr3 = objArr;
            jArr3 = jArr;
            fArr3 = fArr;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f1417b;
        Object[] objArr = this.f1418c;
        long[] jArr = this.f1416a;
        int length = jArr.length - 2;
        int i2 = 0;
        if (length >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                long j2 = jArr[i3];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i6 = 0; i6 < i5; i6++) {
                        if ((255 & j2) < 128) {
                            int i7 = (i3 << 3) + i6;
                            float f2 = fArr[i7];
                            Object obj = objArr[i7];
                            i4 += (obj != null ? obj.hashCode() : 0) ^ Float.hashCode(f2);
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
        return JsonUtils.EMPTY_JSON;
    }
}
