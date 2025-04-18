package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import e0.q;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p0.a;
import r0.f;

/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    public int e;

    /* loaded from: classes.dex */
    public final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, f {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            return MutableScatterSet.this.d(obj);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public final boolean addAll(Collection collection) {
            a.s(collection, "elements");
            MutableScatterSet mutableScatterSet = MutableScatterSet.this;
            mutableScatterSet.getClass();
            int i2 = mutableScatterSet.d;
            for (Object obj : collection) {
                mutableScatterSet.f1592b[mutableScatterSet.g(obj)] = obj;
            }
            return i2 != mutableScatterSet.d;
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public final void clear() {
            MutableScatterSet.this.f();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            return MutableScatterSet.this.k(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
        
            if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        
            r14 = -1;
         */
        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean removeAll(java.util.Collection r19) {
            /*
                r18 = this;
                java.lang.String r0 = "elements"
                r1 = r19
                p0.a.s(r1, r0)
                r0 = r18
                androidx.collection.MutableScatterSet r2 = androidx.collection.MutableScatterSet.this
                int r3 = r2.d
                java.util.Iterator r1 = r19.iterator()
            L11:
                boolean r4 = r1.hasNext()
                r5 = 1
                r6 = 0
                if (r4 == 0) goto La2
                java.lang.Object r4 = r1.next()
                if (r4 == 0) goto L27
                r2.getClass()
                int r7 = r4.hashCode()
                goto L28
            L27:
                r7 = r6
            L28:
                r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
                int r7 = r7 * r8
                int r8 = r7 << 16
                r7 = r7 ^ r8
                r8 = r7 & 127(0x7f, float:1.78E-43)
                int r9 = r2.f1593c
                int r7 = r7 >>> 7
                r7 = r7 & r9
            L36:
                long[] r10 = r2.f1591a
                int r11 = r7 >> 3
                r12 = r7 & 7
                int r12 = r12 << 3
                r13 = r10[r11]
                long r13 = r13 >>> r12
                int r11 = r11 + r5
                r15 = r10[r11]
                int r10 = 64 - r12
                long r10 = r15 << r10
                r15 = r6
                long r5 = (long) r12
                long r5 = -r5
                r12 = 63
                long r5 = r5 >> r12
                long r5 = r5 & r10
                long r5 = r5 | r13
                long r10 = (long) r8
                r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
                long r10 = r10 * r12
                long r10 = r10 ^ r5
                long r12 = r10 - r12
                long r10 = ~r10
                long r10 = r10 & r12
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
            L62:
                r16 = 0
                int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
                if (r14 == 0) goto L86
                int r14 = java.lang.Long.numberOfTrailingZeros(r10)
                int r14 = r14 >> 3
                int r14 = r14 + r7
                r14 = r14 & r9
                java.lang.Object[] r12 = r2.f1592b
                r12 = r12[r14]
                boolean r12 = p0.a.g(r12, r4)
                if (r12 == 0) goto L7b
                goto L95
            L7b:
                r12 = 1
                long r12 = r10 - r12
                long r10 = r10 & r12
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                goto L62
            L86:
                long r10 = ~r5
                r12 = 6
                long r10 = r10 << r12
                long r5 = r5 & r10
                r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r5 = r5 & r10
                int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
                if (r5 == 0) goto L9c
                r14 = -1
            L95:
                if (r14 < 0) goto L11
                r2.l(r14)
                goto L11
            L9c:
                int r6 = r15 + 8
                int r7 = r7 + r6
                r7 = r7 & r9
                r5 = 1
                goto L36
            La2:
                int r1 = r2.d
                if (r3 == r1) goto La8
                r5 = 1
                goto La9
            La8:
                r5 = r6
            La9:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.MutableSetWrapper.removeAll(java.util.Collection):boolean");
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public final boolean retainAll(Collection collection) {
            a.s(collection, "elements");
            MutableScatterSet mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.f1591a;
            int length = jArr.length - 2;
            boolean z2 = false;
            if (length >= 0) {
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i4 = 0; i4 < i3; i4++) {
                            if ((255 & j2) < 128) {
                                int i5 = (i2 << 3) + i4;
                                if (!collection.contains(mutableScatterSet.f1592b[i5])) {
                                    mutableScatterSet.l(i5);
                                    z3 = true;
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            return z3;
                        }
                    }
                    if (i2 == length) {
                        z2 = z3;
                        break;
                    }
                    i2++;
                }
            }
            return z2;
        }
    }

    public MutableScatterSet(int i2) {
        this.f1591a = ScatterMapKt.f1590a;
        this.f1592b = ContainerHelpersKt.f1619c;
        if (i2 >= 0) {
            i(ScatterMapKt.g(i2));
        } else {
            RuntimeHelpersKt.a("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean d(Object obj) {
        int i2 = this.d;
        this.f1592b[g(obj)] = obj;
        return this.d != i2;
    }

    public final Set e() {
        return new MutableSetWrapper();
    }

    public final void f() {
        this.d = 0;
        long[] jArr = this.f1591a;
        if (jArr != ScatterMapKt.f1590a) {
            q.Y(jArr);
            long[] jArr2 = this.f1591a;
            int i2 = this.f1593c;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        q.W(0, this.f1593c, this.f1592b);
        this.e = ScatterMapKt.c(this.f1593c) - this.d;
    }

    public final int g(Object obj) {
        long j2;
        int i2;
        long j3;
        int i3;
        int i4;
        int i5 = -862048943;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i6 = hashCode ^ (hashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & 127;
        int i9 = this.f1593c;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f1591a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j4 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j5 = i8;
            int i14 = i8;
            long j6 = j4 ^ (j5 * 72340172838076673L);
            for (long j7 = (~j6) & (j6 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                int numberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j7) >> 3)) & i9;
                if (a.g(this.f1592b[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            int i15 = 8;
            if ((((~j4) << 6) & j4 & (-9187201950435737472L)) != 0) {
                int h2 = h(i7);
                long j8 = 128;
                long j9 = 255;
                if (this.e != 0 || ((this.f1591a[h2 >> 3] >> ((h2 & 7) << 3)) & 255) == 254) {
                    j2 = j5;
                    i2 = 0;
                } else {
                    int i16 = this.f1593c;
                    if (i16 <= 8 || Long.compareUnsigned(this.d * 32, i16 * 25) > 0) {
                        j2 = j5;
                        i2 = 0;
                        int e = ScatterMapKt.e(this.f1593c);
                        long[] jArr2 = this.f1591a;
                        Object[] objArr = this.f1592b;
                        int i17 = this.f1593c;
                        i(e);
                        long[] jArr3 = this.f1591a;
                        Object[] objArr2 = this.f1592b;
                        int i18 = this.f1593c;
                        int i19 = 0;
                        while (i19 < i17) {
                            if (((jArr2[i19 >> 3] >> ((i19 & 7) << 3)) & j9) < 128) {
                                Object obj2 = objArr[i19];
                                int hashCode2 = (obj2 != null ? obj2.hashCode() : 0) * (-862048943);
                                int i20 = hashCode2 ^ (hashCode2 << 16);
                                int h3 = h(i20 >>> 7);
                                long j10 = i20 & 127;
                                int i21 = h3 >> 3;
                                int i22 = (h3 & 7) << 3;
                                long j11 = (j10 << i22) | (jArr3[i21] & (~(255 << i22)));
                                jArr3[i21] = j11;
                                jArr3[(((h3 - 7) & i18) + (i18 & 7)) >> 3] = j11;
                                objArr2[h3] = obj2;
                            }
                            i19++;
                            j9 = 255;
                        }
                    } else {
                        long[] jArr4 = this.f1591a;
                        int i23 = this.f1593c;
                        Object[] objArr3 = this.f1592b;
                        ScatterMapKt.a(jArr4, i23);
                        int i24 = 0;
                        int i25 = -1;
                        while (i24 != i23) {
                            int i26 = i24 >> 3;
                            int i27 = (i24 & 7) << 3;
                            long j12 = (jArr4[i26] >> i27) & 255;
                            if (j12 == j8) {
                                i25 = i24;
                                i24++;
                            } else if (j12 != 254) {
                                i24++;
                            } else {
                                Object obj3 = objArr3[i24];
                                int hashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i5;
                                int i28 = (hashCode3 ^ (hashCode3 << 16)) >>> 7;
                                int h4 = h(i28);
                                int i29 = i28 & i23;
                                if (((h4 - i29) & i23) / 8 == ((i24 - i29) & i23) / i15) {
                                    jArr4[i26] = ((r21 & 127) << i27) | (jArr4[i26] & (~(255 << i27)));
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i24++;
                                } else {
                                    int i30 = i25;
                                    int i31 = h4 >> 3;
                                    long j13 = jArr4[i31];
                                    int i32 = (h4 & 7) << 3;
                                    if (((j13 >> i32) & 255) == 128) {
                                        i4 = i24;
                                        j3 = j5;
                                        jArr4[i31] = (j13 & (~(255 << i32))) | ((r21 & 127) << i32);
                                        jArr4[i26] = (jArr4[i26] & (~(255 << i27))) | (128 << i27);
                                        objArr3[h4] = objArr3[i4];
                                        objArr3[i4] = null;
                                        i3 = i4;
                                    } else {
                                        j3 = j5;
                                        int i33 = i24;
                                        jArr4[i31] = (j13 & (~(255 << i32))) | ((r21 & 127) << i32);
                                        if (i30 == -1) {
                                            i30 = ScatterMapKt.b(jArr4, i33 + 1, i23);
                                        }
                                        objArr3[i30] = objArr3[h4];
                                        objArr3[h4] = objArr3[i33];
                                        objArr3[i33] = objArr3[i30];
                                        i3 = i33 - 1;
                                        i4 = i30;
                                    }
                                    jArr4[jArr4.length - 1] = (jArr4[0] & 72057594037927935L) | Long.MIN_VALUE;
                                    i24 = i3 + 1;
                                    i25 = i4;
                                    j5 = j3;
                                }
                                i15 = 8;
                                i5 = -862048943;
                                j8 = 128;
                            }
                        }
                        j2 = j5;
                        i2 = 0;
                        this.e = ScatterMapKt.c(this.f1593c) - this.d;
                    }
                    h2 = h(i7);
                }
                this.d++;
                int i34 = this.e;
                long[] jArr5 = this.f1591a;
                int i35 = h2 >> 3;
                long j14 = jArr5[i35];
                int i36 = (h2 & 7) << 3;
                this.e = i34 - (((j14 >> i36) & 255) != 128 ? i2 : 1);
                int i37 = this.f1593c;
                long j15 = (j14 & (~(255 << i36))) | (j2 << i36);
                jArr5[i35] = j15;
                jArr5[(((h2 - 7) & i37) + (i37 & 7)) >> 3] = j15;
                return h2;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
            i8 = i14;
            i5 = -862048943;
        }
    }

    public final int h(int i2) {
        int i3 = this.f1593c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f1591a;
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

    public final void i(int i2) {
        long[] jArr;
        int max = i2 > 0 ? Math.max(7, ScatterMapKt.f(i2)) : 0;
        this.f1593c = max;
        if (max == 0) {
            jArr = ScatterMapKt.f1590a;
        } else {
            jArr = new long[((max + 15) & (-8)) >> 3];
            q.Y(jArr);
        }
        this.f1591a = jArr;
        int i3 = max >> 3;
        long j2 = 255 << ((max & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.e = ScatterMapKt.c(this.f1593c) - this.d;
        this.f1592b = new Object[max];
    }

    public final void j(MutableScatterSet mutableScatterSet) {
        Object[] objArr = mutableScatterSet.f1592b;
        long[] jArr = mutableScatterSet.f1591a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        Object obj = objArr[(i2 << 3) + i4];
                        this.f1592b[g(obj)] = obj;
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f1593c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f1591a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f1592b
            r15 = r15[r11]
            boolean r15 = p0.a.g(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.l(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.k(java.lang.Object):boolean");
    }

    public final void l(int i2) {
        this.d--;
        long[] jArr = this.f1591a;
        int i3 = this.f1593c;
        int i4 = i2 >> 3;
        int i5 = (i2 & 7) << 3;
        long j2 = (jArr[i4] & (~(255 << i5))) | (254 << i5);
        jArr[i4] = j2;
        jArr[(((i2 - 7) & i3) + (i3 & 7)) >> 3] = j2;
        this.f1592b[i2] = null;
    }

    public /* synthetic */ MutableScatterSet() {
        this(6);
    }
}
