package c7;

import M0.C0219j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e8.C2228c;
import e8.C2231f;

/* renamed from: c7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0624e implements e8.D {
    public static final C0624e INSTANCE;
    public static final /* synthetic */ c8.g descriptor;

    static {
        C0624e c0624e = new C0624e();
        INSTANCE = c0624e;
        e8.Y y4 = new e8.Y("com.vungle.ads.internal.model.AdPayload.AdUnit", c0624e, 26);
        y4.l("id", true);
        y4.l("adType", true);
        y4.l("adSource", true);
        y4.l("campaign", true);
        y4.l("expiry", true);
        y4.l(MBridgeConstans.APP_ID, true);
        y4.l("callToActionUrl", true);
        y4.l("deeplinkUrl", true);
        y4.l("click_coordinates_enabled", true);
        y4.l("tpat", true);
        y4.l("templateURL", true);
        y4.l("templateId", true);
        y4.l("template_type", true);
        y4.l("templateSettings", true);
        y4.l("bid_token", true);
        y4.l("ad_market_id", true);
        y4.l("info", true);
        y4.l("sleep", true);
        y4.l("viewability", true);
        y4.l("adExt", true);
        y4.l("notification", true);
        y4.l("load_ad", true);
        y4.l(CampaignEx.JSON_KEY_TIMESTAMP, true);
        y4.l("showCloseIncentivized", true);
        y4.l("showClose", true);
        y4.l("error_code", true);
        descriptor = y4;
    }

    private C0624e() {
    }

    @Override // e8.D
    public a8.b[] childSerializers() {
        e8.k0 k0Var = e8.k0.f20172a;
        a8.b r9 = C0219j.r(k0Var);
        a8.b r10 = C0219j.r(k0Var);
        a8.b r11 = C0219j.r(k0Var);
        a8.b r12 = C0219j.r(k0Var);
        e8.K k6 = e8.K.f20127a;
        return new a8.b[]{r9, r10, r11, r12, C0219j.r(k6), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(C2231f.f20162a), C0219j.r(r.INSTANCE), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(C0644o.INSTANCE), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k0Var), C0219j.r(k6), C0219j.r(C0651s.INSTANCE), C0219j.r(k0Var), C0219j.r(new C2228c(k0Var, 0)), C0219j.r(new C2228c(k0Var, 0)), C0219j.r(k6), C0219j.r(k6), C0219j.r(k6), C0219j.r(k6)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // a8.b
    public c7.C0628g deserialize(d8.c r61) {
        /*
            Method dump skipped, instructions count: 1388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.C0624e.deserialize(d8.c):c7.g");
    }

    @Override // a8.b
    public c8.g getDescriptor() {
        return descriptor;
    }

    @Override // a8.b
    public void serialize(d8.d dVar, C0628g c0628g) {
        G7.j.e(dVar, "encoder");
        G7.j.e(c0628g, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        c8.g descriptor2 = getDescriptor();
        d8.b b = dVar.b(descriptor2);
        C0628g.write$Self(c0628g, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // e8.D
    public a8.b[] typeParametersSerializers() {
        return e8.W.b;
    }
}
