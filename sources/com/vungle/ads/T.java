package com.vungle.ads;

/* loaded from: classes3.dex */
public final class T implements com.vungle.ads.internal.presenter.c {
    final /* synthetic */ U this$0;

    public T(U u8) {
        this.this$0 = u8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdClick$lambda-3, reason: not valid java name */
    public static final void m11onAdClick$lambda3(U u8) {
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdClicked(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdEnd$lambda-2, reason: not valid java name */
    public static final void m12onAdEnd$lambda2(U u8) {
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdEnd(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdImpression$lambda-1, reason: not valid java name */
    public static final void m13onAdImpression$lambda1(U u8) {
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdLeftApplication$lambda-5, reason: not valid java name */
    public static final void m14onAdLeftApplication$lambda5(U u8) {
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdLeftApplication(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdRewarded$lambda-4, reason: not valid java name */
    public static final void m15onAdRewarded$lambda4(U u8) {
        L0 l02;
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener instanceof L0) {
            l02 = (L0) adListener;
        } else {
            l02 = null;
        }
        if (l02 != null) {
            l02.onAdRewarded(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onAdStart$lambda-0, reason: not valid java name */
    public static final void m16onAdStart$lambda0(U u8) {
        G7.j.e(u8, "this$0");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdStart(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: onFailure$lambda-6, reason: not valid java name */
    public static final void m17onFailure$lambda6(U u8, o1 o1Var) {
        G7.j.e(u8, "this$0");
        G7.j.e(o1Var, "$error");
        Q adListener = u8.getAdListener();
        if (adListener != null) {
            adListener.onAdFailedToPlay(u8, o1Var);
        }
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdClick(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 2));
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markEnd();
        C2137s.INSTANCE.logMetric$vungle_ads_release(this.this$0.getDisplayToClickMetric$vungle_ads_release(), (r13 & 2) != 0 ? null : this.this$0.getPlacementId(), (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdEnd(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 3));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdImpression(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 5));
        this.this$0.getShowToDisplayMetric$vungle_ads_release().markEnd();
        C2137s.logMetric$vungle_ads_release$default(C2137s.INSTANCE, this.this$0.getShowToDisplayMetric$vungle_ads_release(), this.this$0.getPlacementId(), this.this$0.getCreativeId(), this.this$0.getEventId(), (String) null, 16, (Object) null);
        this.this$0.getDisplayToClickMetric$vungle_ads_release().markStart();
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdLeftApplication(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 1));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdRewarded(String str) {
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 4));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onAdStart(String str) {
        this.this$0.getSignalManager().increaseSessionDepthCounter();
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new S(this.this$0, 0));
    }

    @Override // com.vungle.ads.internal.presenter.c
    public void onFailure(o1 o1Var) {
        G7.j.e(o1Var, "error");
        com.vungle.ads.internal.util.C.INSTANCE.runOnUiThread(new com.facebook.appevents.k(2, this.this$0, o1Var));
    }
}
