package I4;

import G4.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements H4.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f1457f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f1458g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1460a;
    public final HashMap b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1461c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1462d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f1456e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f1459h = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [I4.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [I4.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [I4.c, java.lang.Object] */
    static {
        final int i9 = 0;
        f1457f = new G4.f() { // from class: I4.b
            @Override // G4.a
            public final void a(Object obj, Object obj2) {
                switch (i9) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        return;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
        final int i10 = 1;
        f1458g = new G4.f() { // from class: I4.b
            @Override // G4.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).f((String) obj);
                        return;
                    default:
                        ((g) obj2).g(((Boolean) obj).booleanValue());
                        return;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f1460a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.f1461c = f1456e;
        this.f1462d = false;
        hashMap2.put(String.class, f1457f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f1458g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f1459h);
        hashMap.remove(Date.class);
    }

    public final H4.a a(Class cls, G4.d dVar) {
        this.f1460a.put(cls, dVar);
        this.b.remove(cls);
        return this;
    }
}
