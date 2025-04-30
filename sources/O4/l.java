package o4;

/* loaded from: classes2.dex */
public final class l implements N4.b {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21964c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f21965a = f21964c;
    public volatile N4.b b;

    public l(N4.b bVar) {
        this.b = bVar;
    }

    @Override // N4.b
    public final Object get() {
        Object obj = this.f21965a;
        Object obj2 = f21964c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f21965a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.f21965a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
