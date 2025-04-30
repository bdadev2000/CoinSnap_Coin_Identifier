package j2;

/* loaded from: classes.dex */
public final class c extends x.b {

    /* renamed from: k, reason: collision with root package name */
    public int f21015k;

    @Override // x.l, java.util.Map
    public final void clear() {
        this.f21015k = 0;
        super.clear();
    }

    @Override // x.l, java.util.Map
    public final int hashCode() {
        if (this.f21015k == 0) {
            this.f21015k = super.hashCode();
        }
        return this.f21015k;
    }

    @Override // x.l
    public final void i(x.l lVar) {
        this.f21015k = 0;
        super.i(lVar);
    }

    @Override // x.l
    public final Object k(int i9) {
        this.f21015k = 0;
        return super.k(i9);
    }

    @Override // x.l
    public final Object l(int i9, Object obj) {
        this.f21015k = 0;
        return super.l(i9, obj);
    }

    @Override // x.l, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f21015k = 0;
        return super.put(obj, obj2);
    }
}
