package p5;

/* renamed from: p5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2553d implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2553d f22316a = new Object();
    public static final G4.c b = G4.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f22317c = G4.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f22318d = G4.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f22319e = G4.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final G4.c f22320f = G4.c.a("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f22321g = G4.c.a("androidAppInfo");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        C2551b c2551b = (C2551b) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.d(b, c2551b.f22307a);
        eVar.d(f22317c, c2551b.b);
        eVar.d(f22318d, "2.0.3");
        eVar.d(f22319e, c2551b.f22308c);
        eVar.d(f22320f, r.LOG_ENVIRONMENT_PROD);
        eVar.d(f22321g, c2551b.f22309d);
    }
}
