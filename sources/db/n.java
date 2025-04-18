package db;

/* loaded from: classes3.dex */
public final class n implements cc.c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f16961c = new Object();
    public volatile Object a = f16961c;

    /* renamed from: b, reason: collision with root package name */
    public volatile cc.c f16962b;

    public n(cc.c cVar) {
        this.f16962b = cVar;
    }

    @Override // cc.c
    public final Object get() {
        Object obj = this.a;
        Object obj2 = f16961c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.a;
                if (obj == obj2) {
                    obj = this.f16962b.get();
                    this.a = obj;
                    this.f16962b = null;
                }
            }
        }
        return obj;
    }
}
