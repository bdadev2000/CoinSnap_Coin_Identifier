package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class eb extends ya implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient ab f4437b;

    private static boolean a(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    public static eb h() {
        return ki.f5711i;
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
        ab abVar = this.f4437b;
        if (abVar != null) {
            return abVar;
        }
        ab f10 = f();
        this.f4437b = f10;
        return f10;
    }

    public static int a(int i10) {
        int max = Math.max(i10, 2);
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

    private static eb a(int i10, Object... objArr) {
        if (i10 == 0) {
            return h();
        }
        if (i10 != 1) {
            int a = a(i10);
            Object[] objArr2 = new Object[a];
            int i11 = a - 1;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                Object a10 = cg.a(objArr[i14], i14);
                int hashCode = a10.hashCode();
                int a11 = ia.a(hashCode);
                while (true) {
                    int i15 = a11 & i11;
                    Object obj = objArr2[i15];
                    if (obj == null) {
                        objArr[i13] = a10;
                        objArr2[i15] = a10;
                        i12 += hashCode;
                        i13++;
                        break;
                    }
                    if (obj.equals(a10)) {
                        break;
                    }
                    a11++;
                }
            }
            Arrays.fill(objArr, i13, i10, (Object) null);
            if (i13 == 1) {
                return new ek(objArr[0], i12);
            }
            if (a(i13) < a / 2) {
                return a(i13, objArr);
            }
            if (a(i13, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i13);
            }
            return new ki(objArr, i12, objArr2, i11, i13);
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
