package mb;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes3.dex */
public final class t implements vb.d {
    public static final t a = new t();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f22096b = vb.c.a(CampaignEx.JSON_KEY_TIMESTAMP);

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f22097c = vb.c.a("type");

    /* renamed from: d, reason: collision with root package name */
    public static final vb.c f22098d = vb.c.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP);

    /* renamed from: e, reason: collision with root package name */
    public static final vb.c f22099e = vb.c.a("device");

    /* renamed from: f, reason: collision with root package name */
    public static final vb.c f22100f = vb.c.a("log");

    /* renamed from: g, reason: collision with root package name */
    public static final vb.c f22101g = vb.c.a("rollouts");

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        p0 p0Var = (p0) ((o2) obj);
        eVar.c(f22096b, p0Var.a);
        eVar.a(f22097c, p0Var.f22042b);
        eVar.a(f22098d, p0Var.f22043c);
        eVar.a(f22099e, p0Var.f22044d);
        eVar.a(f22100f, p0Var.f22045e);
        eVar.a(f22101g, p0Var.f22046f);
    }
}
