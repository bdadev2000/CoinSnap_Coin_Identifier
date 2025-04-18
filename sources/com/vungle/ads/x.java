package com.vungle.ads;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ String $placementId;
    final /* synthetic */ y this$0;

    public x(y yVar, String str) {
        this.this$0 = yVar;
        this.$placementId = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m122onAdClick$lambda3(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m123onAdEnd$lambda2(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m124onAdImpression$lambda1(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdLeftApplication$lambda-4, reason: not valid java name */
    public static final void m125onAdLeftApplication$lambda4(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m126onAdStart$lambda0(y this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(this$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFailure$lambda-5, reason: not valid java name */
    public static final void m127onFailure$lambda5(y this$0, n3 error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        p0 adListener = this$0.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(this$0, error);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new w(this.this$0, 0));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.$placementId, (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new w(this.this$0, 2));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new w(this.this$0, 3));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        s.logMetric$vungle_ads_release$default(s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.$placementId, this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new w(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new w(this.this$0, 4));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(n3 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        com.vungle.ads.internal.util.c0.INSTANCE.runOnUiThread(new v(this.this$0, error, 1));
    }
}
