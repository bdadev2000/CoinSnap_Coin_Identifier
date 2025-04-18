package com.applovin.mediation.hybridAds;

import android.os.Bundle;
import com.applovin.impl.kn;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sm;
import com.applovin.impl.wc;
import com.applovin.impl.xc;
import com.applovin.impl.xl;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class MaxHybridNativeAdActivity extends wc {

    /* renamed from: f, reason: collision with root package name */
    private MaxNativeAdView f9525f;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        final /* synthetic */ MaxNativeAd a;

        public a(MaxNativeAd maxNativeAd) {
            this.a = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.a.prepareForInteraction(MaxHybridNativeAdActivity.this.f9525f.getClickableViews(), MaxHybridNativeAdActivity.this.f9525f)) {
                this.a.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f9525f);
            }
        }
    }

    public void a(xc xcVar, MaxNativeAd maxNativeAd, k kVar, MaxAdapterListener maxAdapterListener) {
        super.a(xcVar, kVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), this);
        this.f9525f = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        a aVar = new a(maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(aVar);
        } else {
            kVar.l0().a((xl) new kn(kVar, "MaxHybridNativeAdPrepareForInteraction", aVar), sm.b.MEDIATION);
        }
    }

    @Override // com.applovin.impl.wc, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a(this.f9525f, "MaxHybridNativeAdActivity");
    }
}
