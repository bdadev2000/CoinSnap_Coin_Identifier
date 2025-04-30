package w4;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* renamed from: w4.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2900t implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2900t f23961a = new Object();
    public static final G4.c b = G4.c.a(CampaignEx.JSON_KEY_TIMESTAMP);

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23962c = G4.c.a("type");

    /* renamed from: d, reason: collision with root package name */
    public static final G4.c f23963d = G4.c.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: e, reason: collision with root package name */
    public static final G4.c f23964e = G4.c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final G4.c f23965f = G4.c.a("log");

    /* renamed from: g, reason: collision with root package name */
    public static final G4.c f23966g = G4.c.a("rollouts");

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        Q q9 = (Q) ((L0) obj);
        eVar.b(b, q9.f23776a);
        eVar.d(f23962c, q9.b);
        eVar.d(f23963d, q9.f23777c);
        eVar.d(f23964e, q9.f23778d);
        eVar.d(f23965f, q9.f23779e);
        eVar.d(f23966g, q9.f23780f);
    }
}
