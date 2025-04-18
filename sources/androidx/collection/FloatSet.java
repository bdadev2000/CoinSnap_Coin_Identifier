package androidx.collection;

import p0.a;

/* loaded from: classes4.dex */
public abstract class FloatSet {

    /* renamed from: a, reason: collision with root package name */
    public long[] f1419a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f1420b;

    /* renamed from: c, reason: collision with root package name */
    public int f1421c;

    public final boolean equals(Object obj) {
        float[] fArr;
        int i2;
        float[] fArr2;
        int i3;
        int i4;
        long j2;
        if (obj == this) {
            return true;
        }
        int i5 = 0;
        if (!(obj instanceof FloatSet)) {
            return false;
        }
        FloatSet floatSet = (FloatSet) obj;
        floatSet.getClass();
        float[] fArr3 = this.f1420b;
        long[] jArr = this.f1419a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j3 = jArr[i6];
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8;
                int i8 = 8 - ((~(i6 - length)) >>> 31);
                int i9 = i5;
                while (i9 < i8) {
                    if ((j3 & 255) < 128) {
                        float f2 = fArr3[(i6 << 3) + i9];
                        floatSet.getClass();
                        int hashCode = Float.hashCode(f2) * (-862048943);
                        int i10 = hashCode ^ (hashCode << 16);
                        int i11 = i10 & 127;
                        int i12 = floatSet.f1421c;
                        int i13 = (i10 >>> 7) & i12;
                        int i14 = 0;
                        while (true) {
                            long[] jArr2 = floatSet.f1419a;
                            int i15 = i13 >> 3;
                            int i16 = (i13 & 7) << 3;
                            long j5 = (jArr2[i15] >>> i16) | ((jArr2[i15 + 1] << (64 - i16)) & ((-i16) >> 63));
                            fArr2 = fArr3;
                            long j6 = (i11 * 72340172838076673L) ^ j5;
                            for (long j7 = (j6 - 72340172838076673L) & (~j6) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                                int numberOfTrailingZeros = (i13 + (Long.numberOfTrailingZeros(j7) >> 3)) & i12;
                                if (floatSet.f1420b[numberOfTrailingZeros] == f2) {
                                    if (numberOfTrailingZeros < 0) {
                                        return false;
                                    }
                                    i3 = 0;
                                    i4 = 8;
                                    j2 = -9187201950435737472L;
                                }
                            }
                            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                                return false;
                            }
                            i14 += 8;
                            i13 = (i13 + i14) & i12;
                            fArr3 = fArr2;
                        }
                    } else {
                        fArr2 = fArr3;
                        i3 = i5;
                        i4 = i7;
                        j2 = j4;
                    }
                    j3 >>= i4;
                    i9++;
                    i5 = i3;
                    i7 = i4;
                    j4 = j2;
                    fArr3 = fArr2;
                }
                fArr = fArr3;
                i2 = i5;
                if (i8 != i7) {
                    return true;
                }
            } else {
                fArr = fArr3;
                i2 = i5;
            }
            if (i6 == length) {
                return true;
            }
            i6++;
            i5 = i2;
            fArr3 = fArr;
        }
    }

    public final int hashCode() {
        float[] fArr = this.f1420b;
        long[] jArr = this.f1419a;
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
                            i4 = Float.hashCode(fArr[(i3 << 3) + i6]) + i4;
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
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.f1420b;
        long[] jArr = this.f1419a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            int i3 = 0;
            loop0: while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j2) < 128) {
                            float f2 = fArr[(i2 << 3) + i5];
                            if (i3 == -1) {
                                sb.append((CharSequence) "...");
                                break loop0;
                            }
                            if (i3 != 0) {
                                sb.append((CharSequence) ", ");
                            }
                            sb.append(f2);
                            i3++;
                        }
                        j2 >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        sb.append((CharSequence) "]");
        String sb2 = sb.toString();
        a.r(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
