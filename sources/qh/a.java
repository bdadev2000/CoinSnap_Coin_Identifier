package qh;

/* loaded from: classes4.dex */
public final class a implements rh.a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f23914c = new Object();
    public volatile rh.a a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f23915b = f23914c;

    public a(rh.a aVar) {
        this.a = aVar;
    }

    public static rh.a a(rh.a aVar) {
        if (aVar instanceof a) {
            return aVar;
        }
        return new a(aVar);
    }

    @Override // rh.a
    public final Object get() {
        boolean z10;
        Object obj = this.f23915b;
        Object obj2 = f23914c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f23915b;
                if (obj == obj2) {
                    obj = this.a.get();
                    Object obj3 = this.f23915b;
                    if (obj3 != obj2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f23915b = obj;
                    this.a = null;
                }
            }
        }
        return obj;
    }
}
