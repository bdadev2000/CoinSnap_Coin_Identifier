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

/* loaded from: classes.dex */
public class yc {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f12396a;

    /* loaded from: classes.dex */
    public static class a extends AbstractC0734p {

        /* renamed from: a, reason: collision with root package name */
        private final de f12397a;
        private final com.applovin.impl.sdk.k b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f12398c;

        public a(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.f12397a = deVar;
            this.b = kVar;
            this.f12398c = maxAdapterListener;
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.f12397a.G(), this.f12397a.x(), this.b, this.f12398c);
            }
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.f12397a.v().get()) {
                this.b.e().b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AbstractC0734p {

        /* renamed from: a, reason: collision with root package name */
        private final de f12399a;
        private final com.applovin.impl.sdk.k b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f12400c;

        public b(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.f12399a = deVar;
            this.b = kVar;
            this.f12400c = maxAdapterListener;
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.f12399a.G(), this.f12399a.getNativeAd(), this.b, this.f12400c);
            }
        }

        @Override // com.applovin.impl.AbstractC0734p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.f12399a.v().get()) {
                this.b.e().b(this);
            }
        }
    }

    public yc(com.applovin.impl.sdk.k kVar) {
        this.f12396a = kVar;
    }

    public void a(de deVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        zp.b();
        if (activity == null) {
            activity = this.f12396a.e().b();
        }
        if (deVar.getNativeAd() != null) {
            this.f12396a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f12396a.L().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.f12396a.e().a(new b(deVar, this.f12396a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (deVar.x() != null) {
            this.f12396a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.f12396a.L().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.f12396a.e().a(new a(deVar, this.f12396a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridMRecAdActivity.class));
            return;
        }
        if (maxAdapterListener instanceof MaxInterstitialAdapterListener) {
            ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
        } else {
            if (maxAdapterListener instanceof MaxAppOpenAdapterListener) {
                ((MaxAppOpenAdapterListener) maxAdapterListener).onAppOpenAdDisplayFailed(MaxAdapterError.AD_DISPLAY_FAILED);
                return;
            }
            throw new IllegalStateException("Failed to display hybrid ad: neither native nor adview ad");
        }
    }
}
