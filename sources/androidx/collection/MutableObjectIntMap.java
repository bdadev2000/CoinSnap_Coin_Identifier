package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;
import p0.a;

/* loaded from: classes4.dex */
public final class MutableObjectIntMap<K> extends ObjectIntMap<K> {

    /* renamed from: f, reason: collision with root package name */
    public int f1480f;

    public MutableObjectIntMap(int i2) {
        this.f1545a = ScatterMapKt.f1590a;
        this.f1546b = ContainerHelpersKt.f1619c;
        this.f1547c = IntSetKt.f1446a;
        if (i2 >= 0) {
            e(ScatterMapKt.g(i2));
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
            long[] jArr = this.f1545a;
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

    public final int d(Object obj) {
        long j2;
        int i2;
        long[] jArr;
        Object[] objArr;
        long j3;
        int i3 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr2 = this.f1545a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j4 = ((jArr2[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr2[i10] >>> i11);
            long j5 = i6;
            int i12 = i6;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j7) >> 3)) & i7;
                if (a.g(this.f1546b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i13 = 8;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int c2 = c(i5);
                long j8 = 128;
                long j9 = 255;
                if (this.f1480f != 0 || ((this.f1545a[c2 >> 3] >> ((c2 & 7) << 3)) & 255) == 254) {
                    j2 = j5;
                    i2 = 0;
                } else {
                    int i14 = this.d;
                    if (i14 <= 8 || Long.compareUnsigned(this.e * 32, i14 * 25) > 0) {
                        j2 = j5;
                        i2 = 0;
                        int e = ScatterMapKt.e(this.d);
                        long[] jArr3 = this.f1545a;
                        Object[] objArr2 = this.f1546b;
                        int[] iArr = this.f1547c;
                        int i15 = this.d;
                        e(e);
                        long[] jArr4 = this.f1545a;
                        Object[] objArr3 = this.f1546b;
                        int[] iArr2 = this.f1547c;
                        int i16 = this.d;
                        int i17 = 0;
                        while (i17 < i15) {
                            if (((jArr3[i17 >> 3] >> ((i17 & 7) << 3)) & j9) < 128) {
                                Object obj2 = objArr2[i17];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i18 = hashCode2 ^ (hashCode2 << 16);
                                int c3 = c(i18 >>> 7);
                                long j10 = i18 & 127;
                                int i19 = c3 >> 3;
                                int i20 = (c3 & 7) << 3;
                                jArr = jArr3;
                                objArr = objArr2;
                                long j11 = (jArr4[i19] & (~(255 << i20))) | (j10 << i20);
                                jArr4[i19] = j11;
                                jArr4[(((c3 - 7) & i16) + (i16 & 7)) >> 3] = j11;
                                objArr3[c3] = obj2;
                                iArr2[c3] = iArr[i17];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i17++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                            j9 = 255;
                        }
                    } else {
                        long[] jArr5 = this.f1545a;
                        int i21 = this.d;
                        Object[] objArr4 = this.f1546b;
                        int[] iArr3 = this.f1547c;
                        ScatterMapKt.a(jArr5, i21);
                        int i22 = 0;
                        int i23 = -1;
                        while (i22 != i21) {
                            int i24 = i22 >> 3;
                            int i25 = (i22 & 7) << 3;
                            long j12 = (jArr5[i24] >> i25) & 255;
                            if (j12 == j8) {
                                i23 = i22;
                                i22++;
                            } else if (j12 != 254) {
                                i22++;
                            } else {
                                Object obj3 = objArr4[i22];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i3;
                                int i26 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int c4 = c(i26);
                                int i27 = i26 & i21;
                                if (((c4 - i27) & i21) / 8 == ((i22 - i27) & i21) / i13) {
                                    jArr5[i24] = ((r21 & 127) << i25) | (jArr5[i24] & (~(255 << i25)));
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i22++;
                                    i13 = 8;
                                    i3 = -862048943;
                                } else {
                                    int i28 = i22;
                                    int i29 = c4 >> 3;
                                    long j13 = jArr5[i29];
                                    int i30 = (c4 & 7) << 3;
                                    if (((j13 >> i30) & 255) == j8) {
                                        j3 = j5;
                                        jArr5[i29] = ((r21 & 127) << i30) | (j13 & (~(255 << i30)));
                                        jArr5[i24] = (jArr5[i24] & (~(255 << i25))) | (128 << i25);
                                        objArr4[c4] = objArr4[i28];
                                        objArr4[i28] = null;
                                        iArr3[c4] = iArr3[i28];
                                        iArr3[i28] = 0;
                                        i23 = i28;
                                    } else {
                                        j3 = j5;
                                        jArr5[i29] = ((r21 & 127) << i30) | (j13 & (~(255 << i30)));
                                        int i31 = i23;
                                        i23 = i31 == -1 ? ScatterMapKt.b(jArr5, i28 + 1, i21) : i31;
                                        objArr4[i23] = objArr4[c4];
                                        objArr4[c4] = objArr4[i28];
                                        objArr4[i28] = objArr4[i23];
                                        iArr3[i23] = iArr3[c4];
                                        iArr3[c4] = iArr3[i28];
                                        iArr3[i28] = iArr3[i23];
                                        i28--;
                                    }
                                    jArr5[jArr5.length - 1] = (jArr5[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i22 = i28 + 1;
                                    j5 = j3;
                                    i13 = 8;
                                    i3 = -862048943;
                                    j8 = 128;
                                }
                            }
                        }
                        j2 = j5;
                        i2 = 0;
                        this.f1480f = ScatterMapKt.c(this.d) - this.e;
                    }
                    c2 = c(i5);
                }
                this.e++;
                int i32 = this.f1480f;
                long[] jArr6 = this.f1545a;
                int i33 = c2 >> 3;
                long j14 = jArr6[i33];
                int i34 = (c2 & 7) << 3;
                this.f1480f = i32 - (((j14 >> i34) & 255) != 128 ? i2 : 1);
                int i35 = this.d;
                long j15 = (j14 & (~(255 << i34))) | (j2 << i34);
                jArr6[i33] = j15;
                jArr6[(((c2 - 7) & i35) + (i35 & 7)) >> 3] = j15;
                return ~c2;
            }
            i9 += 8;
            i8 = (i8 + i9) & i7;
            i6 = i12;
            i3 = -862048943;
        }
    }

    public final void e(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1545a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1480f = ScatterMapKt.c(this.d) - this.e;
        this.f1546b = new Object[max];
        this.f1547c = new int[max];
    }

    public final void f(int i2) {
        this.e--;
        long[] jArr = this.f1545a;
        int i3 = this.d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1546b[i2] = null;
    }

    public final void g(Object obj, int i2) {
        int d = d(obj);
        if (d < 0) {
            d = ~d;
        }
        this.f1546b[d] = obj;
        this.f1547c[d] = i2;
    }

    public /* synthetic */ MutableObjectIntMap() {
        this(6);
    }
}
