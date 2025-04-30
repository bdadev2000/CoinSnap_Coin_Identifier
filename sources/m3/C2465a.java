package m3;

import s7.InterfaceC2701a;

/* renamed from: m3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2465a implements InterfaceC2701a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f21751c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile InterfaceC2701a f21752a;
    public volatile Object b;

    /* JADX WARN: Type inference failed for: r0v1, types: [s7.a, java.lang.Object, m3.a] */
    public static InterfaceC2701a a(InterfaceC2701a interfaceC2701a) {
        if (interfaceC2701a instanceof C2465a) {
            return interfaceC2701a;
        }
        ?? obj = new Object();
        obj.b = f21751c;
        obj.f21752a = interfaceC2701a;
        return obj;
    }

    @Override // s7.InterfaceC2701a
    public final Object get() {
        Object obj = this.b;
        Object obj2 = f21751c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.b;
                    if (obj == obj2) {
                        obj = this.f21752a.get();
                        Object obj3 = this.b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.b = obj;
                        this.f21752a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
