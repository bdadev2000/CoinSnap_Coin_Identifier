package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r0 implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ s0 this$0;

    public r0(s0 s0Var) {
        this.this$0 = s0Var;
    }

    public static /* synthetic */ void f(s0 s0Var, n3 n3Var) {
        m113onFailure$lambda6(s0Var, n3Var);
    }

    /* renamed from: onAdClick$lambda-3 */
    public static final void m107onAdClick$lambda3(s0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this$0);
        }
    }

    /* renamed from: onAdEnd$lambda-2 */
    public static final void m108onAdEnd$lambda2(s0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(this$0);
        }
    }

    /* renamed from: onAdImpression$lambda-1 */
    public static final void m109onAdImpression$lambda1(s0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this$0);
        }
    }

    /* renamed from: onAdLeftApplication$lambda-5 */
    public static final void m110onAdLeftApplication$lambda5(s0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(this$0);
        }
    }

    /* renamed from: onAdRewarded$lambda-4 */
    public static final void m111onAdRewarded$lambda4(s0 this$0) {
        j2 j2Var;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener instanceof j2) {
            j2Var = (j2) adListener;
        } else {
            j2Var = null;
        }
        if (j2Var != null) {
            j2Var.onAdRewarded(this$0);
        }
    }

    /* renamed from: onAdStart$lambda-0 */
    public static final void m112onAdStart$lambda0(s0 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(this$0);
        }
    }

    /* renamed from: onFailure$lambda-6 */
    public static final void m113onFailure$lambda6(s0 this$0, n3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, error);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 2));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.this$0.getPlacementId(), (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 1));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        s.logMetric$vungle_ads_release$default(s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.this$0.getPlacementId(), this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 5));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 0));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new q0(this.this$0, 4));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new jb.j(8, this.this$0, error));
    }
}
