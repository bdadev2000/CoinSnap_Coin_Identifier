package r;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k.d f23943c;

    public /* synthetic */ h(k.d dVar, int i10) {
        this.f23942b = i10;
        this.f23943c = dVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f23942b) {
            case 0:
                k.d dVar = this.f23943c;
                int f10 = dVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    dVar.i(entry.getKey(), entry.getValue());
                }
                if (f10 != dVar.f()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i10 = this.f23942b;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                dVar.c();
                return;
            default:
                dVar.c();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f23942b;
        boolean z10 = true;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int g10 = dVar.g(entry.getKey());
                if (g10 < 0) {
                    return false;
                }
                Object d10 = dVar.d(g10, 1);
                Object value = entry.getValue();
                if (d10 != value && (d10 == null || !d10.equals(value))) {
                    z10 = false;
                }
                return z10;
            default:
                if (dVar.g(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f23942b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                b e2 = this.f23943c.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!e2.containsKey(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f23942b) {
            case 0:
                return k.d.n(this, obj);
            default:
                return k.d.n(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i10 = this.f23942b;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                int i11 = 0;
                for (int f10 = dVar.f() - 1; f10 >= 0; f10--) {
                    Object d10 = dVar.d(f10, 0);
                    Object d11 = dVar.d(f10, 1);
                    if (d10 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = d10.hashCode();
                    }
                    if (d11 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = d11.hashCode();
                    }
                    i11 += hashCode2 ^ hashCode3;
                }
                return i11;
            default:
                int i12 = 0;
                for (int f11 = dVar.f() - 1; f11 >= 0; f11--) {
                    Object d12 = dVar.d(f11, 0);
                    if (d12 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = d12.hashCode();
                    }
                    i12 += hashCode;
                }
                return i12;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i10 = this.f23942b;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                if (dVar.f() == 0) {
                    return true;
                }
                return false;
            default:
                if (dVar.f() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f23942b;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                return new i(dVar);
            default:
                return new g(dVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                k.d dVar = this.f23943c;
                int g10 = dVar.g(obj);
                if (g10 >= 0) {
                    dVar.j(g10);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                b e2 = this.f23943c.e();
                int i10 = e2.f23955d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    e2.remove(it.next());
                }
                if (i10 != e2.f23955d) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return k.d.p(this.f23943c.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i10 = this.f23942b;
        k.d dVar = this.f23943c;
        switch (i10) {
            case 0:
                return dVar.f();
            default:
                return dVar.f();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                k.d dVar = this.f23943c;
                int f10 = dVar.f();
                Object[] objArr = new Object[f10];
                for (int i10 = 0; i10 < f10; i10++) {
                    objArr[i10] = dVar.d(i10, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f23942b) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f23943c.r(0, objArr);
        }
    }
}
