package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes.dex */
public final class b extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationBannerListener f13872c;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.b = abstractAdViewAdapter;
        this.f13872c = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f13872c.onAdClicked(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f13872c.onAdClosed(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f13872c.onAdFailedToLoad(this.b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f13872c.onAdLoaded(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f13872c.onAdOpened(this.b);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f13872c.zzb(this.b, str, str2);
    }
}
