package r7;

/* renamed from: r7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2681a implements InterfaceC2683c {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f22926c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2683c f22927a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, r7.a, r7.c] */
    public static InterfaceC2683c a(InterfaceC2683c interfaceC2683c) {
        if (interfaceC2683c instanceof C2681a) {
            return interfaceC2683c;
        }
        ?? obj = new Object();
        obj.b = f22926c;
        obj.f22927a = interfaceC2683c;
        return obj;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        Object obj = this.b;
        Object obj2 = f22926c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.f22927a.get();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.f22927a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
