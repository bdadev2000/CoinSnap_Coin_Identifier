package d4;

/* loaded from: classes2.dex */
public final class K extends u {

    /* renamed from: k, reason: collision with root package name */
    public static final Object[] f19842k;
    public static final K l;

    /* renamed from: f, reason: collision with root package name */
    public final transient Object[] f19843f;

    /* renamed from: g, reason: collision with root package name */
    public final transient int f19844g;

    /* renamed from: h, reason: collision with root package name */
    public final transient Object[] f19845h;

    /* renamed from: i, reason: collision with root package name */
    public final transient int f19846i;

    /* renamed from: j, reason: collision with root package name */
    public final transient int f19847j;

    static {
        Object[] objArr = new Object[0];
        f19842k = objArr;
        l = new K(objArr, 0, objArr, 0, 0);
    }

    public K(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.f19843f = objArr;
        this.f19844g = i9;
        this.f19845h = objArr2;
        this.f19846i = i10;
        this.f19847j = i11;
    }

    @Override // d4.AbstractC2180h
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.f19843f;
        int i9 = this.f19847j;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    @Override // d4.AbstractC2180h
    public final Object[] c() {
        return this.f19843f;
    }

    @Override // d4.AbstractC2180h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f19845h;
            if (objArr.length != 0) {
                int U8 = F2.h.U(obj);
                while (true) {
                    int i9 = U8 & this.f19846i;
                    Object obj2 = objArr[i9];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    U8 = i9 + 1;
                }
            }
        }
        return false;
    }

    @Override // d4.AbstractC2180h
    public final int d() {
        return this.f19847j;
    }

    @Override // d4.AbstractC2180h
    public final int e() {
        return 0;
    }

    @Override // d4.AbstractC2180h
    public final boolean f() {
        return false;
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

    @Override // d4.u, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f19844g;
    }

    public final AbstractC2186n k() {
        return AbstractC2186n.h(this.f19847j, this.f19843f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f19847j;
    }
}
