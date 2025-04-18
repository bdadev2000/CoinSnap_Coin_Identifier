package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Preconditions;
import com.google.common.primitives.Ints;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class ib extends cb implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient eb f24459b;

    private static boolean a(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    public static ib h() {
        return oi.f25884i;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ib) && g() && ((ib) obj).g() && hashCode() != obj.hashCode()) {
            return false;
        }
        return rj.a(this, obj);
    }

    public eb f() {
        return eb.a(toArray());
    }

    public boolean g() {
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return rj.a(this);
    }

    @Override // com.applovin.impl.cb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract pp iterator();

    @Override // com.applovin.impl.cb
    public eb a() {
        eb ebVar = this.f24459b;
        if (ebVar != null) {
            return ebVar;
        }
        eb f2 = f();
        this.f24459b = f2;
        return f2;
    }

    public static int a(int i2) {
        int max = Math.max(i2, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        Preconditions.checkArgument(max < 1073741824, "collection too large");
        return Ints.MAX_POWER_OF_TWO;
    }

    private static ib a(int i2, Object... objArr) {
        if (i2 == 0) {
            return h();
        }
        if (i2 != 1) {
            int a2 = a(i2);
            Object[] objArr2 = new Object[a2];
            int i3 = a2 - 1;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                Object a3 = gg.a(objArr[i6], i6);
                int hashCode = a3.hashCode();
                int a4 = ka.a(hashCode);
                while (true) {
                    int i7 = a4 & i3;
                    Object obj = objArr2[i7];
                    if (obj == null) {
                        objArr[i5] = a3;
                        objArr2[i7] = a3;
                        i4 += hashCode;
                        i5++;
                        break;
                    }
                    if (obj.equals(a3)) {
                        break;
                    }
                    a4++;
                }
            }
            Arrays.fill(objArr, i5, i2, (Object) null);
            if (i5 == 1) {
                return new hk(objArr[0], i4);
            }
            if (a(i5) < a2 / 2) {
                return a(i5, objArr);
            }
            if (a(i5, objArr.length)) {
                objArr = Arrays.copyOf(objArr, i5);
            }
            return new oi(objArr, i4, objArr2, i3, i5);
        }
        return a(objArr[0]);
    }

    public static ib a(Collection collection) {
        if ((collection instanceof ib) && !(collection instanceof SortedSet)) {
            ib ibVar = (ib) collection;
            if (!ibVar.e()) {
                return ibVar;
            }
        }
        Object[] array = collection.toArray();
        return a(array.length, array);
    }

    public static ib a(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return h();
        }
        if (length != 1) {
            return a(objArr.length, (Object[]) objArr.clone());
        }
        return a(objArr[0]);
    }

    public static ib a(Object obj, Object obj2) {
        return a(2, obj, obj2);
    }

    public static ib a(Object obj, Object obj2, Object obj3) {
        return a(3, obj, obj2, obj3);
    }

    public static ib a(Object obj) {
        return new hk(obj);
    }
}
