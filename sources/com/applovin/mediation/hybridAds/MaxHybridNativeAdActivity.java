package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import android.view.MotionEvent;
import com.applovin.impl.bd;
import com.applovin.impl.cd;
import com.applovin.impl.jn;
import com.applovin.impl.sdk.j;
import com.applovin.impl.tm;
import com.applovin.impl.yl;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;

/* loaded from: classes3.dex */
public class MaxHybridNativeAdActivity extends bd {

    /* renamed from: f, reason: collision with root package name */
    private MaxNativeAdView f28416f;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAd f28417a;

        public a(MaxNativeAd maxNativeAd) {
            this.f28417a = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f28417a.prepareForInteraction(MaxHybridNativeAdActivity.this.f28416f.getClickableViews(), MaxHybridNativeAdActivity.this.f28416f)) {
                return;
            }
            this.f28417a.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f28416f);
        }
    }

    public void a(cd cdVar, MaxNativeAd maxNativeAd, j jVar, MaxAdapterListener maxAdapterListener) {
        super.a(cdVar, jVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), this);
        this.f28416f = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        a aVar = new a(maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(aVar);
        } else {
            jVar.j0().a((yl) new jn(jVar, "MaxHybridNativeAdPrepareForInteraction", aVar), tm.b.MEDIATION);
        }
    }

    @Override // com.applovin.impl.bd, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(g.f30048a, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.applovin.impl.bd, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f28416f, "MaxHybridNativeAdActivity");
    }
}
