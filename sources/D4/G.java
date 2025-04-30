package d4;

import java.util.Map;

/* loaded from: classes2.dex */
public final class G extends u {

    /* renamed from: f, reason: collision with root package name */
    public final transient q f19829f;

    /* renamed from: g, reason: collision with root package name */
    public final transient Object[] f19830g;

    /* renamed from: h, reason: collision with root package name */
    public final transient int f19831h = 0;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f19832i;

    public G(q qVar, Object[] objArr, int i9) {
        this.f19829f = qVar;
        this.f19830g = objArr;
        this.f19832i = i9;
    }

    @Override // d4.AbstractC2180h
    public final int b(Object[] objArr) {
        AbstractC2186n abstractC2186n = this.f19884c;
        if (abstractC2186n == null) {
            abstractC2186n = k();
            this.f19884c = abstractC2186n;
        }
        return abstractC2186n.b(objArr);
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        if (value == null || !value.equals(this.f19829f.get(key))) {
            return false;
        }
        return true;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return true;
    }

    @Override // d4.AbstractC2180h
    /* renamed from: g */
    public final O iterator() {
        AbstractC2186n abstractC2186n = this.f19884c;
        if (abstractC2186n == null) {
            abstractC2186n = k();
            this.f19884c = abstractC2186n;
        }
        return abstractC2186n.listIterator(0);
    }

    public final AbstractC2186n k() {
        return new F(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19832i;
    }
}
