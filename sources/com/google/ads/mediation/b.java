package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes3.dex */
public final class b extends AdListener implements AppEventListener, zza {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractAdViewAdapter f11473b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationBannerListener f11474c;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f11473b = abstractAdViewAdapter;
        this.f11474c = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.f11474c.onAdClicked(this.f11473b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f11474c.onAdClosed(this.f11473b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f11474c.onAdFailedToLoad(this.f11473b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f11474c.onAdLoaded(this.f11473b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f11474c.onAdOpened(this.f11473b);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.f11474c.zzb(this.f11473b, str, str2);
    }
}
