package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class eb extends ya implements Set {
    private transient ab b;

    private static boolean a(int i9, int i10) {
        return i9 < (i10 >> 1) + (i10 >> 2);
    }

    public static eb h() {
        return ki.f8693i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof eb) && g() && ((eb) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return nj.a(this, obj);
    }

    public ab f() {
        return ab.a(toArray());
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return nj.a(this);
    }

    @Override // com.applovin.impl.ya, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public abstract qp iterator();

    @Override // com.applovin.impl.ya
    public ab a() {
        ab abVar = this.b;
        if (abVar != null) {
            return abVar;
        }
        ab f9 = f();
        this.b = f9;
        return f9;
    }

    public static int a(int i9) {
        int max = Math.max(i9, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return 1073741824;
    }

    private static eb a(int i9, Object... objArr) {
        if (i9 == 0) {
            return h();
        }
        if (i9 != 1) {
            int a6 = a(i9);
            Object[] objArr2 = new Object[a6];
            int i10 = a6 - 1;
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                Object a9 = cg.a(objArr[i13], i13);
                int hashCode = a9.hashCode();
                int a10 = ia.a(hashCode);
                while (true) {
                    int i14 = a10 & i10;
                    Object obj = objArr2[i14];
                    if (obj == null) {
                        objArr[i12] = a9;
                        objArr2[i14] = a9;
                        i11 += hashCode;
                        i12++;
                        break;
                    }
                    if (obj.equals(a9)) {
                        break;
                    }
                    a10++;
                }
            }
            Arrays.fill(objArr, i12, i9, (Object) null);
            if (i12 == 1) {
                return new ek(objArr[0], i11);
            }
            if (a(i12) < a6 / 2) {
                return a(i12, objArr);
            }
            if (a(i12, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i12);
            }
            return new ki(objArr, i11, objArr2, i10, i12);
        }
        return a(objArr[0]);
    }

    public static eb a(Collection collection) {
        if ((collection instanceof eb) && !(collection instanceof SortedSet)) {
            eb ebVar = (eb) collection;
            if (!ebVar.e()) {
                return ebVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static eb a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return h();
        }
        if (length != 1) {
            return a(objArr.length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public static eb a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static eb a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static eb a(Object obj) {
        return new ek(obj);
    }
}
