package com.applovin.impl;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity;
import com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;

/* loaded from: classes.dex */
public class dd {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.j f23475a;

    /* loaded from: classes.dex */
    public static class a extends p {

        /* renamed from: a, reason: collision with root package name */
        private final ie f23476a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f23477b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f23478c;

        public a(ie ieVar, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
            this.f23476a = ieVar;
            this.f23477b = jVar;
            this.f23478c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f23476a.H(), this.f23476a.y(), this.f23477b, this.f23478c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f23476a.w().get()) {
                this.f23477b.e().b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends p {

        /* renamed from: a, reason: collision with root package name */
        private final ie f23479a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.j f23480b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f23481c;

        public b(ie ieVar, com.applovin.impl.sdk.j jVar, MaxAdapterListener maxAdapterListener) {
            this.f23479a = ieVar;
            this.f23480b = jVar;
            this.f23481c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f23479a.H(), this.f23479a.getNativeAd(), this.f23480b, this.f23481c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f23479a.w().get()) {
                this.f23480b.e().b(this);
            }
        }
    }

    public dd(com.applovin.impl.sdk.j jVar) {
        this.f23475a = jVar;
    }

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p02, Intent p12) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p12 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p12, com.safedk.android.utils.g.f30048a);
        p02.startActivity(p12);
    }

    public void a(ie ieVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        yp.b();
        if (activity == null) {
            activity = this.f23475a.e().b();
        }
        if (ieVar.getNativeAd() != null) {
            this.f23475a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23475a.J().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f23475a.e().a(new b(ieVar, this.f23475a, maxAdapterListener));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (ieVar.y() != null) {
            this.f23475a.J();
            if (com.applovin.impl.sdk.n.a()) {
                this.f23475a.J().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f23475a.e().a(new a(ieVar, this.f23475a, maxAdapterListener));
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (!(maxAdapterListener instanceof MaxAppOpenAdapterListener)) {
                throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
            }
            ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        }
    }
}
