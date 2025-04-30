package w4;

import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: w4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2868b implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2868b f23818a = new Object();
    public static final G4.c b = G4.c.a("pid");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23819c = G4.c.a("processName");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f23820d = G4.c.a("reasonCode");

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f23821e = G4.c.a("importance");

    /* renamed from: f, reason: collision with root package name */
    public static final G4.c f23822f = G4.c.a("pss");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f23823g = G4.c.a("rss");

    /* renamed from: h, reason: collision with root package name */
    public static final G4.c f23824h = G4.c.a(CampaignEx.JSON_KEY_TIMESTAMP);

    /* renamed from: i, reason: collision with root package name */
    public static final G4.c f23825i = G4.c.a("traceFile");

    /* renamed from: j, reason: collision with root package name */
    public static final G4.c f23826j = G4.c.a("buildIdMappingForArch");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        E e4 = (E) ((r0) obj);
        eVar.a(b, e4.f23714a);
        eVar.d(f23819c, e4.b);
        eVar.a(f23820d, e4.f23715c);
        eVar.a(f23821e, e4.f23716d);
        eVar.b(f23822f, e4.f23717e);
        eVar.b(f23823g, e4.f23718f);
        eVar.b(f23824h, e4.f23719g);
        eVar.d(f23825i, e4.f23720h);
        eVar.d(f23826j, e4.f23721i);
    }
}
