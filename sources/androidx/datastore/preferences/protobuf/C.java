package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class C extends AbstractC0427b implements D, RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4511c;

    static {
        new C(10).b = false;
    }

    public C(int i9) {
        this(new ArrayList(i9));
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final void a(C0432g c0432g) {
        b();
        this.f4511c.add(c0432g);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        b();
        this.f4511c.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0427b, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f4511c.size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0427b, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        b();
        this.f4511c.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        String str;
        ArrayList arrayList = this.f4511c;
        Object obj = arrayList.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C0432g) {
            C0432g c0432g = (C0432g) obj;
            c0432g.getClass();
            Charset charset = AbstractC0449y.f4610a;
            if (c0432g.size() == 0) {
                str = "";
            } else {
                str = new String(c0432g.f4562c, c0432g.d(), c0432g.size(), charset);
            }
            int d2 = c0432g.d();
            if (u0.f4609a.j(c0432g.f4562c, d2, c0432g.size() + d2) == 0) {
                arrayList.set(i9, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, AbstractC0449y.f4610a);
            P p2 = u0.f4609a;
            if (u0.f4609a.j(bArr, 0, bArr.length) == 0) {
                arrayList.set(i9, str);
            }
        }
        return str;
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final Object getRaw(int i9) {
        return this.f4511c.get(i9);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.f4511c);
    }

    @Override // androidx.datastore.preferences.protobuf.D
    public final D getUnmodifiableView() {
        if (this.b) {
            return new m0(this);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0448x
    public final InterfaceC0448x mutableCopyWithCapacity(int i9) {
        ArrayList arrayList = this.f4511c;
        if (i9 >= arrayList.size()) {
            ArrayList arrayList2 = new ArrayList(i9);
            arrayList2.addAll(arrayList);
            return new C(arrayList2);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i9) {
        b();
        Object remove = this.f4511c.remove(i9);
        ((AbstractList) this).modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (remove instanceof C0432g) {
            C0432g c0432g = (C0432g) remove;
            c0432g.getClass();
            Charset charset = AbstractC0449y.f4610a;
            if (c0432g.size() == 0) {
                return "";
            }
            return new String(c0432g.f4562c, c0432g.d(), c0432g.size(), charset);
        }
        return new String((byte[]) remove, AbstractC0449y.f4610a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        b();
        Object obj2 = this.f4511c.set(i9, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (obj2 instanceof C0432g) {
            C0432g c0432g = (C0432g) obj2;
            c0432g.getClass();
            Charset charset = AbstractC0449y.f4610a;
            if (c0432g.size() == 0) {
                return "";
            }
            return new String(c0432g.f4562c, c0432g.d(), c0432g.size(), charset);
        }
        return new String((byte[]) obj2, AbstractC0449y.f4610a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4511c.size();
    }

    public C(ArrayList arrayList) {
        this.f4511c = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0427b, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        b();
        if (collection instanceof D) {
            collection = ((D) collection).getUnderlyingElements();
        }
        boolean addAll = this.f4511c.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }
}
