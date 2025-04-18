package k7;

/* loaded from: classes3.dex */
public final class a implements rh.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f20280c = new Object();
    public volatile rh.a a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f20281b = f20280c;

    public a(b bVar) {
        this.a = bVar;
    }

    public static rh.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        return new a(bVar);
    }

    @Override // rh.a
    public final Object get() {
        boolean z10;
        Object obj = this.f20281b;
        Object obj2 = f20280c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f20281b;
                if (obj == obj2) {
                    obj = this.a.get();
                    Object obj3 = this.f20281b;
                    if (obj3 != obj2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f20281b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}
