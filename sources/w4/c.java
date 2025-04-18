package w4;

/* loaded from: classes.dex */
public final class c extends r.b {

    /* renamed from: k, reason: collision with root package name */
    public int f26726k;

    @Override // r.k, java.util.Map
    public final void clear() {
        this.f26726k = 0;
        super.clear();
    }

    @Override // r.k, java.util.Map
    public final int hashCode() {
        if (this.f26726k == 0) {
            this.f26726k = super.hashCode();
        }
        return this.f26726k;
    }

    @Override // r.k
    public final void i(r.k kVar) {
        this.f26726k = 0;
        super.i(kVar);
    }

    @Override // r.k
    public final Object j(int i10) {
        this.f26726k = 0;
        return super.j(i10);
    }

    @Override // r.k
    public final Object k(int i10, Object obj) {
        this.f26726k = 0;
        return super.k(i10, obj);
    }

    @Override // r.k, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f26726k = 0;
        return super.put(obj, obj2);
    }
}
