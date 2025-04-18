package xb;

import java.util.Date;
import java.util.HashMap;
import vb.g;

/* loaded from: classes3.dex */
public final class d implements wb.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f27617f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f27618g;
    public final HashMap a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f27620b;

    /* renamed from: c, reason: collision with root package name */
    public final a f27621c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27622d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f27616e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f27619h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [xb.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [xb.b] */
    static {
        final int i10 = 0;
        f27617f = new vb.f() { // from class: xb.b
            @Override // vb.a
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
        final int i11 = 1;
        f27618g = new vb.f() { // from class: xb.b
            @Override // vb.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
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
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f27620b = hashMap2;
        this.f27621c = f27616e;
        this.f27622d = false;
        hashMap2.put(String.class, f27617f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f27618g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f27619h);
        hashMap.remove(Date.class);
    }

    public final wb.a a(Class cls, vb.d dVar) {
        this.a.put(cls, dVar);
        this.f27620b.remove(cls);
        return this;
    }
}
