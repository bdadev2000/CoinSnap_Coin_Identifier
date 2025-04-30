package p5;

/* renamed from: p5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2556g implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2556g f22329a = new Object();
    public static final G4.c b = G4.c.a("eventType");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f22330c = G4.c.a("sessionData");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f22331d = G4.c.a("applicationInfo");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        F f9 = (F) obj;
        G4.e eVar = (G4.e) obj2;
        f9.getClass();
        eVar.d(b, EnumC2560k.SESSION_START);
        eVar.d(f22330c, f9.f22261a);
        eVar.d(f22331d, f9.b);
    }
}
