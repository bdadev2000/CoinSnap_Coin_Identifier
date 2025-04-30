package com.vungle.ads;

/* renamed from: com.vungle.ads.x */
/* loaded from: classes3.dex */
public final class C2147x implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ String $placementId;
    final /* synthetic */ C2149y this$0;

    public C2147x(C2149y c2149y, String str) {
        this.this$0 = c2149y;
        this.$placementId = str;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m114onAdClick$lambda3(C2149y c2149y) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(c2149y);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m115onAdEnd$lambda2(C2149y c2149y) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(c2149y);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m116onAdImpression$lambda1(C2149y c2149y) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(c2149y);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-4 */
    public static final void m117onAdLeftApplication$lambda4(C2149y c2149y) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(c2149y);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m118onAdStart$lambda0(C2149y c2149y) {
        G7.j.e(c2149y, "this$0");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(c2149y);
        }
    }

    /* renamed from: onFailure$lambda-5 */
    public static final void m119onFailure$lambda5(C2149y c2149y, o1 o1Var) {
        G7.j.e(c2149y, "this$0");
        G7.j.e(o1Var, "$error");
        Q adListener = c2149y.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(c2149y, o1Var);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2145w(this.this$0, 2));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2137s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2145w(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2145w(this.this$0, 4));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2145w(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2145w(this.this$0, 0));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new RunnableC2143v(this.this$0, o1Var, 1));
    }
}
