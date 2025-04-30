package w4;

/* renamed from: w4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2899s implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2899s f23955a = new Object();
    public static final G4.c b = G4.c.a("batteryLevel");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23956c = G4.c.a("batteryVelocity");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f23957d = G4.c.a("proximityOn");

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f23958e = G4.c.a("orientation");

    /* renamed from: f, reason: collision with root package name */
    public static final G4.c f23959f = G4.c.a("ramUsed");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f23960g = G4.c.a("diskUsed");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        C2873d0 c2873d0 = (C2873d0) ((G0) obj);
        eVar.d(b, c2873d0.f23848a);
        eVar.a(f23956c, c2873d0.b);
        eVar.e(f23957d, c2873d0.f23849c);
        eVar.a(f23958e, c2873d0.f23850d);
        eVar.b(f23959f, c2873d0.f23851e);
        eVar.b(f23960g, c2873d0.f23852f);
    }
}
