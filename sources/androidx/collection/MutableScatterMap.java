package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p0.a;
import r0.e;

/* loaded from: classes3.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {

    /* renamed from: f, reason: collision with root package name */
    public int f1487f;

    /* loaded from: classes3.dex */
    public final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, e {
        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Set b() {
            return new MutableScatterMap$MutableMapWrapper$entries$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Set c() {
            return new MutableScatterMap$MutableMapWrapper$keys$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        public final Collection d() {
            return new MutableScatterMap$MutableMapWrapper$values$1();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final void putAll(Map map) {
            a.s(map, "from");
            for (Map.Entry<K, V> entry : map.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }
    }

    public MutableScatterMap(int i2) {
        this.f1557a = ScatterMapKt.f1590a;
        Object[] objArr = ContainerHelpersKt.f1619c;
        this.f1558b = objArr;
        this.f1559c = objArr;
        if (i2 >= 0) {
            h(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void e() {
        this.e = 0;
        long[] jArr = this.f1557a;
        if (jArr != ScatterMapKt.f1590a) {
            q.Y(jArr);
            long[] jArr2 = this.f1557a;
            int i2 = this.d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        q.W(0, this.d, this.f1559c);
        q.W(0, this.d, this.f1558b);
        this.f1487f = ScatterMapKt.c(this.d) - this.e;
    }

    public final int f(int i2) {
        int i3 = this.d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1557a;
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

    public final int g(Object obj) {
        long j2;
        int i2;
        long[] jArr;
        Object[] objArr;
        long j3;
        int i3;
        int i4 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i5 = hashCode ^ (hashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & 127;
        int i8 = this.d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr2 = this.f1557a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            long j4 = ((jArr2[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr2[i11] >>> i12);
            long j5 = i7;
            int i13 = i7;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j7) >> 3)) & i8;
                if (a.g(this.f1558b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i14 = 8;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int f2 = f(i6);
                long j8 = 128;
                long j9 = 255;
                if (this.f1487f != 0 || ((this.f1557a[f2 >> 3] >> ((f2 & 7) << 3)) & 255) == 254) {
                    j2 = j5;
                    i2 = 0;
                } else {
                    int i15 = this.d;
                    if (i15 <= 8 || Long.compareUnsigned(this.e * 32, i15 * 25) > 0) {
                        j2 = j5;
                        i2 = 0;
                        int e = ScatterMapKt.e(this.d);
                        long[] jArr3 = this.f1557a;
                        Object[] objArr2 = this.f1558b;
                        Object[] objArr3 = this.f1559c;
                        int i16 = this.d;
                        h(e);
                        long[] jArr4 = this.f1557a;
                        Object[] objArr4 = this.f1558b;
                        Object[] objArr5 = this.f1559c;
                        int i17 = this.d;
                        int i18 = 0;
                        while (i18 < i16) {
                            if (((jArr3[i18 >> 3] >> ((i18 & 7) << 3)) & j9) < 128) {
                                Object obj2 = objArr2[i18];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i19 = hashCode2 ^ (hashCode2 << 16);
                                int f3 = f(i19 >>> 7);
                                long j10 = i19 & 127;
                                int i20 = f3 >> 3;
                                int i21 = (f3 & 7) << 3;
                                jArr = jArr3;
                                objArr = objArr2;
                                long j11 = (jArr4[i20] & (~(255 << i21))) | (j10 << i21);
                                jArr4[i20] = j11;
                                jArr4[(((f3 - 7) & i17) + (i17 & 7)) >> 3] = j11;
                                objArr4[f3] = obj2;
                                objArr5[f3] = objArr3[i18];
                            } else {
                                jArr = jArr3;
                                objArr = objArr2;
                            }
                            i18++;
                            jArr3 = jArr;
                            objArr2 = objArr;
                            j9 = 255;
                        }
                    } else {
                        long[] jArr5 = this.f1557a;
                        int i22 = this.d;
                        Object[] objArr6 = this.f1558b;
                        Object[] objArr7 = this.f1559c;
                        ScatterMapKt.a(jArr5, i22);
                        int i23 = 0;
                        int i24 = -1;
                        while (i23 != i22) {
                            int i25 = i23 >> 3;
                            int i26 = (i23 & 7) << 3;
                            long j12 = (jArr5[i25] >> i26) & 255;
                            if (j12 == j8) {
                                i24 = i23;
                                i23++;
                            } else if (j12 != 254) {
                                i23++;
                            } else {
                                Object obj3 = objArr6[i23];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i4;
                                int i27 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int f4 = f(i27);
                                int i28 = i27 & i22;
                                if (((f4 - i28) & i22) / 8 == ((i23 - i28) & i22) / i14) {
                                    jArr5[i25] = ((r21 & 127) << i26) | (jArr5[i25] & (~(255 << i26)));
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i23++;
                                    i14 = 8;
                                    i4 = -862048943;
                                } else {
                                    int i29 = i23;
                                    int i30 = f4 >> 3;
                                    long j13 = jArr5[i30];
                                    int i31 = (f4 & 7) << 3;
                                    if (((j13 >> i31) & 255) == j8) {
                                        j3 = j5;
                                        jArr5[i30] = ((r21 & 127) << i31) | (j13 & (~(255 << i31)));
                                        jArr5[i25] = (jArr5[i25] & (~(255 << i26))) | (128 << i26);
                                        objArr6[f4] = objArr6[i29];
                                        objArr6[i29] = null;
                                        objArr7[f4] = objArr7[i29];
                                        objArr7[i29] = null;
                                        i3 = i29;
                                        i24 = i3;
                                    } else {
                                        j3 = j5;
                                        jArr5[i30] = ((r21 & 127) << i31) | (j13 & (~(255 << i31)));
                                        int i32 = i24;
                                        i24 = i32 == -1 ? ScatterMapKt.b(jArr5, i29 + 1, i22) : i32;
                                        objArr6[i24] = objArr6[f4];
                                        objArr6[f4] = objArr6[i29];
                                        objArr6[i29] = objArr6[i24];
                                        objArr7[i24] = objArr7[f4];
                                        objArr7[f4] = objArr7[i29];
                                        objArr7[i29] = objArr7[i24];
                                        i3 = i29 - 1;
                                    }
                                    jArr5[jArr5.length - 1] = jArr5[0];
                                    i23 = i3 + 1;
                                    j5 = j3;
                                    i14 = 8;
                                    i4 = -862048943;
                                    j8 = 128;
                                }
                            }
                        }
                        j2 = j5;
                        i2 = 0;
                        this.f1487f = ScatterMapKt.c(this.d) - this.e;
                    }
                    f2 = f(i6);
                }
                this.e++;
                int i33 = this.f1487f;
                long[] jArr6 = this.f1557a;
                int i34 = f2 >> 3;
                long j14 = jArr6[i34];
                int i35 = (f2 & 7) << 3;
                this.f1487f = i33 - (((j14 >> i35) & 255) != 128 ? i2 : 1);
                int i36 = this.d;
                long j15 = (j14 & (~(255 << i35))) | (j2 << i35);
                jArr6[i34] = j15;
                jArr6[(((f2 - 7) & i36) + (i36 & 7)) >> 3] = j15;
                return ~f2;
            }
            i10 += 8;
            i9 = (i9 + i10) & i8;
            i7 = i13;
            i4 = -862048943;
        }
    }

    public final void h(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.d = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1557a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f1487f = ScatterMapKt.c(this.d) - this.e;
        this.f1558b = new Object[max];
        this.f1559c = new Object[max];
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f1557a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f1558b
            r11 = r11[r10]
            boolean r11 = p0.a.g(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.j(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.i(java.lang.Object):java.lang.Object");
    }

    public final Object j(int i2) {
        this.e--;
        long[] jArr = this.f1557a;
        int i3 = this.d;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1558b[i2] = null;
        Object[] objArr = this.f1559c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void k(Object obj, Object obj2) {
        int g2 = g(obj);
        if (g2 < 0) {
            g2 = ~g2;
        }
        this.f1558b[g2] = obj;
        this.f1559c[g2] = obj2;
    }

    public /* synthetic */ MutableScatterMap() {
        this(6);
    }
}
