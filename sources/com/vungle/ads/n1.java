package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n1 implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ String $placementId;
    final /* synthetic */ t1 this$0;

    public n1(t1 t1Var, String str) {
        this.this$0 = t1Var;
        this.$placementId = str;
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m98onAdClick$lambda3(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this$0);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m99onAdEnd$lambda2(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(this$0);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m100onAdImpression$lambda1(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this$0);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-4 */
    public static final void m101onAdLeftApplication$lambda4(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(this$0);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m102onAdStart$lambda0(t1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(this$0);
        }
    }

    /* renamed from: onFailure$lambda-5 */
    public static final void m103onFailure$lambda5(t1 this$0, n3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, error);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new m1(this.this$0, 0));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        this.this$0.getAdInternal().setAdState(com.vungle.ads.internal.g.FINISHED);
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new m1(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new m1(this.this$0, 4));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        s.logMetric$vungle_ads_release$default(s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new m1(this.this$0, 2));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getAdInternal().setAdState(com.vungle.ads.internal.g.PLAYING);
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new m1(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.this$0.getAdInternal().setAdState(com.vungle.ads.internal.g.ERROR);
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new jb.j(9, this.this$0, error));
    }
}
