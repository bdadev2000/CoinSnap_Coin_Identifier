package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class i1 extends c implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final i1 f1374f;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f1375c;

    /* renamed from: d, reason: collision with root package name */
    public int f1376d;

    static {
        i1 i1Var = new i1(new Object[0], 0);
        f1374f = i1Var;
        i1Var.f1353b = false;
    }

    public i1(Object[] objArr, int i10) {
        this.f1375c = objArr;
        this.f1376d = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i10 = this.f1376d;
        Object[] objArr = this.f1375c;
        if (i10 == objArr.length) {
            this.f1375c = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1375c;
        int i11 = this.f1376d;
        this.f1376d = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void b(int i10) {
        if (i10 >= 0 && i10 < this.f1376d) {
            return;
        }
        StringBuilder m10 = a4.j.m("Index:", i10, ", Size:");
        m10.append(this.f1376d);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        b(i10);
        return this.f1375c[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final g0 mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f1376d) {
            return new i1(Arrays.copyOf(this.f1375c, i10), this.f1376d);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        b(i10);
        Object[] objArr = this.f1375c;
        Object obj = objArr[i10];
        if (i10 < this.f1376d - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f1376d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        b(i10);
        Object[] objArr = this.f1375c;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1376d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        a();
        if (i10 >= 0 && i10 <= (i11 = this.f1376d)) {
            Object[] objArr = this.f1375c;
            if (i11 < objArr.length) {
                System.arraycopy(objArr, i10, objArr, i10 + 1, i11 - i10);
            } else {
                Object[] objArr2 = new Object[a4.j.z(i11, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i10);
                System.arraycopy(this.f1375c, i10, objArr2, i10 + 1, this.f1376d - i10);
                this.f1375c = objArr2;
            }
            this.f1375c[i10] = obj;
            this.f1376d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder m10 = a4.j.m("Index:", i10, ", Size:");
        m10.append(this.f1376d);
        throw new IndexOutOfBoundsException(m10.toString());
    }
}
