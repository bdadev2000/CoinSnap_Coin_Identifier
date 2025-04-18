package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class l0 extends c implements m0, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1422c;

    static {
        new l0(10).f1353b = false;
    }

    public l0(int i10) {
        this(new ArrayList(i10));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        a();
        this.f1422c.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f1422c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        String str;
        ArrayList arrayList = this.f1422c;
        Object obj = arrayList.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        boolean z10 = true;
        if (obj instanceof k) {
            k kVar = (k) obj;
            str = kVar.f();
            j jVar = (j) kVar;
            int g10 = jVar.g();
            if (e2.a.P(jVar.f1377f, g10, jVar.size() + g10) != 0) {
                z10 = false;
            }
            if (z10) {
                arrayList.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, h0.a);
            if (e2.a.P(bArr, 0, bArr.length) != 0) {
                z10 = false;
            }
            if (z10) {
                arrayList.set(i10, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final Object getRaw(int i10) {
        return this.f1422c.get(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f1422c);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final m0 getUnmodifiableView() {
        if (this.f1353b) {
            return new w1(this);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void k(k kVar) {
        a();
        this.f1422c.add(kVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.g0
    public final g0 mutableCopyWithCapacity(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f1422c);
            return new l0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        a();
        Object remove = this.f1422c.remove(i10);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof k) {
            return ((k) remove).f();
        }
        return new String((byte[]) remove, h0.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        a();
        Object obj2 = this.f1422c.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof k) {
            return ((k) obj2).f();
        }
        return new String((byte[]) obj2, h0.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1422c.size();
    }

    public l0(ArrayList arrayList) {
        this.f1422c = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof m0) {
            collection = ((m0) collection).getUnderlyingElements();
        }
        boolean addAll = this.f1422c.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
