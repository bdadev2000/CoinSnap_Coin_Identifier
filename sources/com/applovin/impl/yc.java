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
    private final com.applovin.impl.sdk.k a;

    /* loaded from: classes.dex */
    public static class a extends p {
        private final de a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9198b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f9199c;

        public a(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.a = deVar;
            this.f9198b = kVar;
            this.f9199c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridMRecAdActivity) {
                ((MaxHybridMRecAdActivity) activity).a(this.a.G(), this.a.x(), this.f9198b, this.f9199c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridMRecAdActivity) && !activity.isChangingConfigurations() && this.a.v().get()) {
                this.f9198b.e().b(this);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends p {
        private final de a;

        /* renamed from: b, reason: collision with root package name */
        private final com.applovin.impl.sdk.k f9200b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdapterListener f9201c;

        public b(de deVar, com.applovin.impl.sdk.k kVar, MaxAdapterListener maxAdapterListener) {
            this.a = deVar;
            this.f9200b = kVar;
            this.f9201c = maxAdapterListener;
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxHybridNativeAdActivity) {
                ((MaxHybridNativeAdActivity) activity).a(this.a.G(), this.a.getNativeAd(), this.f9200b, this.f9201c);
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if ((activity instanceof MaxHybridNativeAdActivity) && !activity.isChangingConfigurations() && this.a.v().get()) {
                this.f9200b.e().b(this);
            }
        }
    }

    public yc(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
    }

    public void a(de deVar, Activity activity, MaxAdapterListener maxAdapterListener) {
        zp.b();
        if (activity == null) {
            activity = this.a.e().b();
        }
        if (deVar.getNativeAd() != null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("MaxHybridAdService", "Showing fullscreen native ad...");
            }
            this.a.e().a(new b(deVar, this.a, maxAdapterListener));
            activity.startActivity(new Intent(activity, (Class<?>) MaxHybridNativeAdActivity.class));
            return;
        }
        if (deVar.x() != null) {
            this.a.L();
            if (com.applovin.impl.sdk.t.a()) {
                this.a.L().a("MaxHybridAdService", "Showing fullscreen MREC ad...");
            }
            this.a.e().a(new a(deVar, this.a, maxAdapterListener));
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
