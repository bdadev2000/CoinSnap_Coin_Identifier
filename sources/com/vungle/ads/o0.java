package com.vungle.ads;

import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class o0 implements a {
    private final d adConfig;
    private final Lazy adInternal$delegate;
    private p0 adListener;
    private final Context context;
    private String creativeId;
    private final c2 displayToClickMetric;
    private String eventId;
    private final String placementId;
    private final g3 requestToResponseMetric;
    private final g3 responseToShowMetric;
    private final g3 showToDisplayMetric;
    private final Lazy signalManager$delegate;
    private com.vungle.ads.internal.signals.m signaledAd;

    public o0(Context context, String placementId, d adConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        this.context = context;
        this.placementId = placementId;
        this.adConfig = adConfig;
        this.adInternal$delegate = LazyKt.lazy(new l0(this));
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        this.signalManager$delegate = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new n0(context));
        this.requestToResponseMetric = new g3(com.vungle.ads.internal.protos.n.AD_REQUEST_TO_RESPONSE_DURATION_MS);
        this.responseToShowMetric = new g3(com.vungle.ads.internal.protos.n.AD_RESPONSE_TO_SHOW_DURATION_MS);
        this.showToDisplayMetric = new g3(com.vungle.ads.internal.protos.n.AD_SHOW_TO_DISPLAY_DURATION_MS);
        this.displayToClickMetric = new c2(com.vungle.ads.internal.protos.n.AD_DISPLAY_TO_CLICK_DURATION_MS);
    }

    public static /* synthetic */ void a(o0 o0Var, n3 n3Var) {
        m104onLoadFailure$lambda1(o0Var, n3Var);
    }

    public static /* synthetic */ void b(o0 o0Var) {
        m105onLoadSuccess$lambda0(o0Var);
    }

    public static /* synthetic */ void getRequestToResponseMetric$vungle_ads_release$annotations() {
    }

    private final void onLoadEnd() {
        this.requestToResponseMetric.markEnd();
        s.logMetric$vungle_ads_release$default(s.INSTANCE, this.requestToResponseMetric, this.placementId, this.creativeId, this.eventId, (String) null, 16, (Object) null);
        this.responseToShowMetric.markStart();
    }

    /* renamed from: onLoadFailure$lambda-1 */
    public static final void m104onLoadFailure$lambda1(o0 this$0, n3 vungleError) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(vungleError, "$vungleError");
        p0 p0Var = this$0.adListener;
        if (p0Var != null) {
            p0Var.onAdFailedToLoad(this$0, vungleError);
        }
    }

    /* renamed from: onLoadSuccess$lambda-0 */
    public static final void m105onLoadSuccess$lambda0(o0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 p0Var = this$0.adListener;
        if (p0Var != null) {
            p0Var.onAdLoaded(this$0);
        }
    }

    @Override // com.vungle.ads.a
    public Boolean canPlayAd() {
        return Boolean.valueOf(com.vungle.ads.internal.v.canPlayAd$default(getAdInternal(), false, 1, null) == null);
    }

    public abstract com.vungle.ads.internal.v constructAdInternal$vungle_ads_release(Context context);

    public final d getAdConfig() {
        return this.adConfig;
    }

    public final com.vungle.ads.internal.v getAdInternal() {
        return (com.vungle.ads.internal.v) this.adInternal$delegate.getValue();
    }

    public final p0 getAdListener() {
        return this.adListener;
    }

    public final Context getContext() {
        return this.context;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final c2 getDisplayToClickMetric$vungle_ads_release() {
        return this.displayToClickMetric;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final g3 getRequestToResponseMetric$vungle_ads_release() {
        return this.requestToResponseMetric;
    }

    public final g3 getResponseToShowMetric$vungle_ads_release() {
        return this.responseToShowMetric;
    }

    public final g3 getShowToDisplayMetric$vungle_ads_release() {
        return this.showToDisplayMetric;
    }

    public final com.vungle.ads.internal.signals.j getSignalManager() {
        return (com.vungle.ads.internal.signals.j) this.signalManager$delegate.getValue();
    }

    public final com.vungle.ads.internal.signals.m getSignaledAd$vungle_ads_release() {
        return this.signaledAd;
    }

    @Override // com.vungle.ads.a
    public void load(String str) {
        this.requestToResponseMetric.markStart();
        getAdInternal().loadAd(this.placementId, str, new m0(this, str));
    }

    public void onAdLoaded$vungle_ads_release(bh.z advertisement) {
        Intrinsics.checkNotNullParameter(advertisement, "advertisement");
        advertisement.setAdConfig(this.adConfig);
        this.creativeId = advertisement.getCreativeId();
        String eventId = advertisement.eventId();
        this.eventId = eventId;
        com.vungle.ads.internal.signals.m mVar = this.signaledAd;
        if (mVar != null) {
            mVar.setEventId(eventId);
        }
    }

    public void onLoadFailure$vungle_ads_release(o0 baseAd, n3 vungleError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(vungleError, "vungleError");
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new jb.j(7, this, vungleError));
        onLoadEnd();
    }

    public void onLoadSuccess$vungle_ads_release(o0 baseAd, String str) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new k8.f(this, 17));
        onLoadEnd();
    }

    public final void setAdListener(p0 p0Var) {
        this.adListener = p0Var;
    }

    public final void setSignaledAd$vungle_ads_release(com.vungle.ads.internal.signals.m mVar) {
        this.signaledAd = mVar;
    }
}
