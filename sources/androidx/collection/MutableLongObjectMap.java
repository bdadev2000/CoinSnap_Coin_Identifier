package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;

/* loaded from: classes4.dex */
public final class MutableLongObjectMap<V> extends LongObjectMap<V> {

    /* renamed from: f, reason: collision with root package name */
    public int f1475f;

    public MutableLongObjectMap(int i2) {
        this.f1458a = ScatterMapKt.f1590a;
        this.f1459b = LongSetKt.f1465a;
        this.f1460c = ContainerHelpersKt.f1619c;
        if (i2 >= 0) {
            f(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int d(long j2) {
        long j3;
        int i2;
        int i3;
        long[] jArr;
        long[] jArr2;
        long j4;
        char c2 = 11601;
        int hashCode = Long.hashCode(j2) * (-862048943);
        int i4 = hashCode ^ (hashCode << 16);
        int i5 = i4 >>> 7;
        int i6 = i4 & 127;
        int i7 = this.d;
        int i8 = i5 & i7;
        int i9 = 0;
        while (true) {
            long[] jArr3 = this.f1458a;
            int i10 = i8 >> 3;
            int i11 = (i8 & 7) << 3;
            long j5 = ((jArr3[i10 + 1] << (64 - i11)) & ((-i11) >> 63)) | (jArr3[i10] >>> i11);
            long j6 = i6;
            int i12 = i9;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            for (long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j8 != 0; j8 &= j8 - 1) {
                int numberOfTrailingZeros = (i8 + (Long.numberOfTrailingZeros(j8) >> 3)) & i7;
                if (this.f1459b[numberOfTrailingZeros] == j2) {
                    return numberOfTrailingZeros;
                }
            }
            int i13 = 8;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int e = e(i5);
                long j9 = 128;
                long j10 = 255;
                if (this.f1475f != 0 || ((this.f1458a[e >> 3] >> ((e & 7) << 3)) & 255) == 254) {
                    j3 = j6;
                    i2 = 0;
                } else {
                    int i14 = this.d;
                    if (i14 > 8) {
                        i3 = i5;
                        if (Long.compareUnsigned(this.e * 32, i14 * 25) <= 0) {
                            long[] jArr4 = this.f1458a;
                            int i15 = this.d;
                            long[] jArr5 = this.f1459b;
                            Object[] objArr = this.f1460c;
                            ScatterMapKt.a(jArr4, i15);
                            int i16 = -1;
                            int i17 = 0;
                            while (i17 != i15) {
                                int i18 = i17 >> 3;
                                int i19 = (i17 & 7) << 3;
                                long j11 = (jArr4[i18] >> i19) & 255;
                                if (j11 == j9) {
                                    int i20 = i17;
                                    i17++;
                                    i16 = i20;
                                } else if (j11 != 254) {
                                    i17++;
                                } else {
                                    int hashCode2 = Long.hashCode(jArr5[i17]) * (-862048943);
                                    int i21 = (hashCode2 ^ (hashCode2 << 16)) >>> 7;
                                    int e2 = e(i21);
                                    int i22 = i21 & i15;
                                    if (((e2 - i22) & i15) / 8 == ((i17 - i22) & i15) / i13) {
                                        jArr4[i18] = ((r24 & 127) << i19) | (jArr4[i18] & (~(255 << i19)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i17++;
                                        j9 = 128;
                                    } else {
                                        int i23 = i16;
                                        int i24 = e2 >> 3;
                                        long j12 = jArr4[i24];
                                        int i25 = (e2 & 7) << 3;
                                        if (((j12 >> i25) & 255) == 128) {
                                            jArr4[i24] = (j12 & (~(255 << i25))) | ((r24 & 127) << i25);
                                            jArr4[i18] = (jArr4[i18] & (~(255 << i19))) | (128 << i19);
                                            jArr5[e2] = jArr5[i17];
                                            jArr5[i17] = 0;
                                            objArr[e2] = objArr[i17];
                                            objArr[i17] = null;
                                            i16 = i17;
                                        } else {
                                            int i26 = i17;
                                            jArr4[i24] = ((r24 & 127) << i25) | (j12 & (~(255 << i25)));
                                            i16 = i23 == -1 ? ScatterMapKt.b(jArr4, i26 + 1, i15) : i23;
                                            jArr5[i16] = jArr5[e2];
                                            jArr5[e2] = jArr5[i26];
                                            jArr5[i26] = jArr5[i16];
                                            objArr[i16] = objArr[e2];
                                            objArr[e2] = objArr[i26];
                                            objArr[i26] = objArr[i16];
                                            i17 = i26 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i17++;
                                        j9 = 128;
                                        i13 = 8;
                                    }
                                }
                            }
                            i2 = 0;
                            this.f1475f = ScatterMapKt.c(this.d) - this.e;
                            j3 = j6;
                            e = e(i3);
                        }
                    } else {
                        i3 = i5;
                    }
                    i2 = 0;
                    int e3 = ScatterMapKt.e(this.d);
                    long[] jArr6 = this.f1458a;
                    long[] jArr7 = this.f1459b;
                    Object[] objArr2 = this.f1460c;
                    int i27 = this.d;
                    f(e3);
                    long[] jArr8 = this.f1458a;
                    long[] jArr9 = this.f1459b;
                    Object[] objArr3 = this.f1460c;
                    int i28 = this.d;
                    int i29 = 0;
                    while (i29 < i27) {
                        if (((jArr6[i29 >> 3] >> ((i29 & 7) << 3)) & j10) < 128) {
                            long j13 = jArr7[i29];
                            int hashCode3 = Long.hashCode(j13) * (-862048943);
                            int i30 = hashCode3 ^ (hashCode3 << 16);
                            int e4 = e(i30 >>> 7);
                            int i31 = i30 & 127;
                            jArr = jArr6;
                            jArr2 = jArr7;
                            long j14 = i31;
                            int i32 = e4 >> 3;
                            int i33 = (e4 & 7) << 3;
                            j4 = j6;
                            long j15 = (j14 << i33) | (jArr8[i32] & (~(255 << i33)));
                            jArr8[i32] = j15;
                            jArr8[(((e4 - 7) & i28) + (i28 & 7)) >> 3] = j15;
                            jArr9[e4] = j13;
                            objArr3[e4] = objArr2[i29];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr7;
                            j4 = j6;
                        }
                        i29++;
                        jArr6 = jArr;
                        jArr7 = jArr2;
                        j6 = j4;
                        j10 = 255;
                    }
                    j3 = j6;
                    e = e(i3);
                }
                this.e++;
                int i34 = this.f1475f;
                long[] jArr10 = this.f1458a;
                int i35 = e >> 3;
                long j16 = jArr10[i35];
                int i36 = (e & 7) << 3;
                this.f1475f = i34 - (((j16 >> i36) & 255) != 128 ? i2 : 1);
                int i37 = this.d;
                long j17 = (j16 & (~(255 << i36))) | (j3 << i36);
                jArr10[i35] = j17;
                jArr10[(((e - 7) & i37) + (i37 & 7)) >> 3] = j17;
                return e;
            }
            i9 = i12 + 8;
            i8 = (i8 + i9) & i7;
            i5 = i5;
            c2 = c2;
        }
    }

    public final int e(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1458a;
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
        this.f1458a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1475f = ScatterMapKt.c(this.d) - this.e;
        this.f1459b = new long[max];
        this.f1460c = new Object[max];
    }

    public final void g(long j2, Object obj) {
        int d = d(j2);
        this.f1459b[d] = j2;
        this.f1460c[d] = obj;
    }

    public /* synthetic */ MutableLongObjectMap() {
        this(6);
    }
}
