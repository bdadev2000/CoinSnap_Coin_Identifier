package w4;

/* renamed from: w4.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2888l implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2888l f23908a = new Object();
    public static final G4.c b = G4.c.a("baseAddress");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23909c = G4.c.a("size");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f23910d = G4.c.a("name");

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f23911e = G4.c.a("uuid");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        G4.e eVar = (G4.e) obj2;
        U u8 = (U) ((y0) obj);
        eVar.b(b, u8.f23791a);
        eVar.b(f23909c, u8.b);
        eVar.d(f23910d, u8.f23792c);
        String str = u8.f23793d;
        if (str != null) {
            bArr = str.getBytes(P0.f23775a);
        } else {
            bArr = null;
        }
        eVar.d(f23911e, bArr);
    }
}
