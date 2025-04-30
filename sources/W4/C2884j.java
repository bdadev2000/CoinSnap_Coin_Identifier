package w4;

import com.mbridge.msdk.MBridgeConstans;

/* renamed from: w4.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2884j implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2884j f23884a = new Object();
    public static final G4.c b = G4.c.a("generator");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23885c = G4.c.a("identifier");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f23886d = G4.c.a("appQualitySessionId");

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f23887e = G4.c.a("startedAt");

    /* renamed from: f, reason: collision with root package name */
    public static final G4.c f23888f = G4.c.a("endedAt");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f23889g = G4.c.a("crashed");

    /* renamed from: h, reason: collision with root package name */
    public static final G4.c f23890h = G4.c.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: i, reason: collision with root package name */
    public static final G4.c f23891i = G4.c.a("user");

    /* renamed from: j, reason: collision with root package name */
    public static final G4.c f23892j = G4.c.a("os");

    /* renamed from: k, reason: collision with root package name */
    public static final G4.c f23893k = G4.c.a("device");
    public static final G4.c l = G4.c.a("events");
    public static final G4.c m = G4.c.a("generatorType");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        K k6 = (K) ((O0) obj);
        eVar.d(b, k6.f23737a);
        eVar.d(f23885c, k6.b.getBytes(P0.f23775a));
        eVar.d(f23886d, k6.f23738c);
        eVar.b(f23887e, k6.f23739d);
        eVar.d(f23888f, k6.f23740e);
        eVar.e(f23889g, k6.f23741f);
        eVar.d(f23890h, k6.f23742g);
        eVar.d(f23891i, k6.f23743h);
        eVar.d(f23892j, k6.f23744i);
        eVar.d(f23893k, k6.f23745j);
        eVar.d(l, k6.f23746k);
        eVar.a(m, k6.l);
    }
}
