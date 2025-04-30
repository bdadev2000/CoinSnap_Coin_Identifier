package com.vungle.ads;

import android.content.Context;
import c7.C0665z;
import com.vungle.ads.internal.AbstractC2115v;
import t7.AbstractC2712a;
import t7.EnumC2718g;
import t7.InterfaceC2717f;

/* loaded from: classes3.dex */
public abstract class P implements InterfaceC2067a {
    private final C2073d adConfig;
    private final InterfaceC2717f adInternal$delegate;
    private Q adListener;
    private final Context context;
    private String creativeId;
    private final E0 displayToClickMetric;
    private String eventId;
    private final String placementId;
    private final h1 requestToResponseMetric;
    private final h1 responseToShowMetric;
    private final h1 showToDisplayMetric;
    private final InterfaceC2717f signalManager$delegate;
    private com.vungle.ads.internal.signals.m signaledAd;

    public P(Context context, String str, C2073d c2073d) {
        G7.j.e(context, "context");
        G7.j.e(str, "placementId");
        G7.j.e(c2073d, "adConfig");
        this.context = context;
        this.placementId = str;
        this.adConfig = c2073d;
        this.adInternal$delegate = AbstractC2712a.d(new M(this));
        ServiceLocator$Companion serviceLocator$Companion = f1.Companion;
        this.signalManager$delegate = AbstractC2712a.c(EnumC2718g.b, new O(context));
        this.requestToResponseMetric = new h1(com.vungle.ads.internal.protos.n.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new h1(com.vungle.ads.internal.protos.n.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.showToDisplayMetric = new h1(com.vungle.ads.internal.protos.n.AD_SHOW_TO_DISPLAY_DURATION_MS);
        this.displayToClickMetric = new E0(com.vungle.ads.internal.protos.n.AD_DISPLAY_TO_CLICK_DURATION_MS);
    }

    public static /* synthetic */ void b(P p2) {
        m10onLoadSuccess$lambda0(p2);
    }

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* renamed from: onLoadFailure$lambda-1 */
    public static final void m9onLoadFailure$lambda1(P p2, o1 o1Var) {
        G7.j.e(p2, "this$0");
        G7.j.e(o1Var, "$vungleError");
        Q q9 = p2.adListener;
        if (q9 != null) {
            q9.onAdFailedToLoad(p2, o1Var);
        }
    }

    /* renamed from: onLoadSuccess$lambda-0 */
    public static final void m10onLoadSuccess$lambda0(P p2) {
        G7.j.e(p2, "this$0");
        Q q9 = p2.adListener;
        if (q9 != null) {
            q9.onAdLoaded(p2);
        }
    }

    @Override // com.vungle.ads.InterfaceC2067a
    public Boolean canPlayAd() {
        boolean z8 = false;
        if (AbstractC2115v.canPlayAd$default(getAdInternal(), false, 1, null) == null) {
            z8 = true;
        }
        return Boolean.valueOf(z8);
    }

    public abstract AbstractC2115v constructAdInternal$vungle_ads_release(Context context);

    public final C2073d getAdConfig() {
        return this.adConfig;
    }

    public final AbstractC2115v getAdInternal() {
        return (AbstractC2115v) this.adInternal$delegate.getValue();
    }

    public final Q getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final E0 getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final h1 getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    public final h1 getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final h1 getShowToDisplayMetric$vungle_ads_release() {
        return this.showToDisplayMetric;
    }

    public final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    public final com.vungle.ads.internal.signals.m getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.InterfaceC2067a
    public void load(String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal().loadAd(this.placementId, str, new N(this, str));
    }

    public void onAdLoaded$vungle_ads_release(C0665z c0665z) {
        G7.j.e(c0665z, "advertisement");
        c0665z.setAdConfig(this.adConfig);
        this.creativeId = c0665z.getCreativeId();
        String eventId = c0665z.eventId();
        this.eventId = eventId;
        com.vungle.ads.internal.signals.m mVar = this.signaledAd;
        if (mVar != null) {
            mVar.setEventId(eventId);
        }
    }

    public void onLoadFailure$vungle_ads_release(P p2, o1 o1Var) {
        G7.j.e(p2, "baseAd");
        G7.j.e(o1Var, "vungleError");
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.facebook.appevents.k(1, this, o1Var));
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(P p2, String str) {
        G7.j.e(p2, "baseAd");
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new L(this, 0));
        onLoadEnd();
    }

    public final void setAdListener(Q q9) {
        this.adListener = q9;
    }

    public final void setSignaledAd$vungle_ads_release(com.vungle.ads.internal.signals.m mVar) {
        this.signaledAd = mVar;
    }
}
