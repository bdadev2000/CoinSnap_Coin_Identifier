package com.vungle.ads.internal.ui;

import android.view.MotionEvent;

/* loaded from: classes4.dex */
public final class g implements hh.d {
    final /* synthetic */ i this$0;

    public g(i iVar) {
        this.this$0 = iVar;
    }

    @Override // hh.d
    public boolean onTouch(MotionEvent motionEvent) {
        com.vungle.ads.internal.presenter.q mraidPresenter$vungle_ads_release = this.this$0.getMraidPresenter$vungle_ads_release();
        if (mraidPresenter$vungle_ads_release == null) {
            return false;
        }
        mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
        return false;
    }
}
