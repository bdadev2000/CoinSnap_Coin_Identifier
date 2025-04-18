package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public abstract class b1 extends k0 implements Set {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11907d = 0;

    /* renamed from: c, reason: collision with root package name */
    public transient r0 f11908c;

    public static int h(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static b1 i(int i10, Object... objArr) {
        if (i10 != 0) {
            boolean z10 = false;
            if (i10 != 1) {
                int h10 = h(i10);
                Object[] objArr2 = new Object[h10];
                int i11 = h10 - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int K = a6.k.K(hashCode);
                        while (true) {
                            int i15 = K & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            }
                            if (obj2.equals(obj)) {
                                break;
                            }
                            K++;
                        }
                    } else {
                        throw new NullPointerException(a4.j.c(20, "at index ", i14));
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new d1(obj3);
                }
                if (h(i13) < h10 / 2) {
                    return i(i13, objArr);
                }
                int length = objArr.length;
                if (i13 < (length >> 1) + (length >> 2)) {
                    z10 = true;
                }
                if (z10) {
                    objArr = Arrays.copyOf(objArr, i13);
                }
                return new f2(objArr, i12, objArr2, i11, i13);
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new d1(obj4);
        }
        return f2.f11947l;
    }

    public static b1 l(Collection collection) {
        if ((collection instanceof b1) && !(collection instanceof SortedSet)) {
            b1 b1Var = (b1) collection;
            if (!b1Var.f()) {
                return b1Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    public static b1 m(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            if (length != 1) {
                return i(objArr.length, (Object[]) objArr.clone());
            }
            return new d1(objArr[0]);
        }
        return f2.f11947l;
    }

    public static b1 o(String str, String str2, String str3) {
        return i(3, str, str2, str3);
    }

    public static b1 p(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        boolean z10;
        if (objArr.length <= 2147483641) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int length = objArr.length + 6;
            Object[] objArr2 = new Object[length];
            objArr2[0] = str;
            objArr2[1] = str2;
            objArr2[2] = str3;
            objArr2[3] = str4;
            objArr2[4] = str5;
            objArr2[5] = str6;
            System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
            return i(length, objArr2);
        }
        throw new IllegalArgumentException("the total number of elements must fit in an int");
    }

    @Override // com.google.common.collect.k0
    public r0 a() {
        r0 r0Var = this.f11908c;
        if (r0Var == null) {
            r0 n10 = n();
            this.f11908c = n10;
            return n10;
        }
        return r0Var;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof b1) && (this instanceof f2)) {
            b1 b1Var = (b1) obj;
            b1Var.getClass();
            if ((b1Var instanceof f2) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return c6.c.k(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return c6.c.r(this);
    }

    public r0 n() {
        Object[] array = toArray();
        n0 n0Var = r0.f12026c;
        return r0.h(array.length, array);
    }

    @Override // com.google.common.collect.k0
    Object writeReplace() {
        return new a1(toArray());
    }
}
