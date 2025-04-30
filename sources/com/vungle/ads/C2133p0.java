package com.vungle.ads;

import com.vungle.ads.internal.EnumC2091g;

/* renamed from: com.vungle.ads.p0 */
/* loaded from: classes3.dex */
public final class C2133p0 implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ String $placementId;
    final /* synthetic */ C2144v0 this$0;

    public C2133p0(C2144v0 c2144v0, String str) {
        this.this$0 = c2144v0;
        this.$placementId = str;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m99onAdClick$lambda3(C2144v0 c2144v0) {
        G7.j.e(c2144v0, "this$0");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(c2144v0);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m100onAdEnd$lambda2(C2144v0 c2144v0) {
        G7.j.e(c2144v0, "this$0");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(c2144v0);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m101onAdImpression$lambda1(C2144v0 c2144v0) {
        G7.j.e(c2144v0, "this$0");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(c2144v0);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-4 */
    public static final void m102onAdLeftApplication$lambda4(C2144v0 c2144v0) {
        G7.j.e(c2144v0, "this$0");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(c2144v0);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m103onAdStart$lambda0(C2144v0 c2144v0) {
        G7.j.e(c2144v0, "this$0");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(c2144v0);
        }
    }

    /* renamed from: onFailure$lambda-5 */
    public static final void m104onFailure$lambda5(C2144v0 c2144v0, o1 o1Var) {
        G7.j.e(c2144v0, "this$0");
        G7.j.e(o1Var, "$error");
        Q adListener = c2144v0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(c2144v0, o1Var);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2131o0(this.this$0, 4));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2137s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.this$0.getAdInternal().setAdState(EnumC2091g.FINISHED);
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2131o0(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2131o0(this.this$0, 0));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2131o0(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getAdInternal().setAdState(EnumC2091g.PLAYING);
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2131o0(this.this$0, 2));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        this.this$0.getAdInternal().setAdState(EnumC2091g.ERROR);
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.facebook.appevents.k(3, this.this$0, o1Var));
    }
}
