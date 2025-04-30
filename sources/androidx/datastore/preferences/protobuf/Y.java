package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Y extends AbstractC0427b implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    public static final Y f4539f;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f4540c;

    /* renamed from: d, reason: collision with root package name */
    public int f4541d;

    static {
        Y y4 = new Y(new Object[0], 0);
        f4539f = y4;
        y4.b = false;
    }

    public Y(Object[] objArr, int i9) {
        this.f4540c = objArr;
        this.f4541d = i9;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0427b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i9 = this.f4541d;
        Object[] objArr = this.f4540c;
        if (i9 == objArr.length) {
            this.f4540c = Arrays.copyOf(objArr, ((i9 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4540c;
        int i10 = this.f4541d;
        this.f4541d = i10 + 1;
        objArr2[i10] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i9) {
        if (i9 >= 0 && i9 < this.f4541d) {
            return;
        }
        StringBuilder p2 = Q7.n0.p(i9, "Index:", ", Size:");
        p2.append(this.f4541d);
        throw new IndexOutOfBoundsException(p2.toString());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        c(i9);
        return this.f4540c[i9];
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0448x
    public final InterfaceC0448x mutableCopyWithCapacity(int i9) {
        if (i9 >= this.f4541d) {
            return new Y(Arrays.copyOf(this.f4540c, i9), this.f4541d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        c(i9);
        Object[] objArr = this.f4540c;
        Object obj = objArr[i9];
        if (i9 < this.f4541d - 1) {
            System.arraycopy(objArr, i9 + 1, objArr, i9, (r2 - i9) - 1);
        }
        this.f4541d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        c(i9);
        Object[] objArr = this.f4540c;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4541d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        b();
        if (i9 >= 0 && i9 <= (i10 = this.f4541d)) {
            Object[] objArr = this.f4540c;
            if (i10 < objArr.length) {
                System.arraycopy(objArr, i9, objArr, i9 + 1, i10 - i9);
            } else {
                Object[] objArr2 = new Object[Q7.n0.v(i10, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i9);
                System.arraycopy(this.f4540c, i9, objArr2, i9 + 1, this.f4541d - i9);
                this.f4540c = objArr2;
            }
            this.f4540c[i9] = obj;
            this.f4541d++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder p2 = Q7.n0.p(i9, "Index:", ", Size:");
        p2.append(this.f4541d);
        throw new IndexOutOfBoundsException(p2.toString());
    }
}
