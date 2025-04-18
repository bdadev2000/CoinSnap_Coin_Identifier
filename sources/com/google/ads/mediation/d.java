package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbgt;
import net.premiumads.sdk.admob.PremiumNativeAd;

/* loaded from: classes3.dex */
public final class d extends AdListener implements zzi, zzg, zzf {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11476b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11477c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11478d;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f11477c = abstractAdViewAdapter;
        this.f11478d = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        switch (this.f11476b) {
            case 0:
                ((MediationNativeListener) this.f11478d).onAdClicked((AbstractAdViewAdapter) this.f11477c);
                return;
            default:
                super.onAdClicked();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        switch (this.f11476b) {
            case 0:
                ((MediationNativeListener) this.f11478d).onAdClosed((AbstractAdViewAdapter) this.f11477c);
                return;
            default:
                super.onAdClosed();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int i10 = this.f11476b;
        Object obj = this.f11477c;
        switch (i10) {
            case 0:
                ((MediationNativeListener) this.f11478d).onAdFailedToLoad((AbstractAdViewAdapter) obj, loadAdError);
                return;
            default:
                ((MediationAdLoadCallback) obj).onFailure(loadAdError);
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        switch (this.f11476b) {
            case 0:
                ((MediationNativeListener) this.f11478d).onAdImpression((AbstractAdViewAdapter) this.f11477c);
                return;
            default:
                super.onAdImpression();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.f11476b) {
            case 0:
                return;
            default:
                super.onAdLoaded();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        switch (this.f11476b) {
            case 0:
                ((MediationNativeListener) this.f11478d).onAdOpened((AbstractAdViewAdapter) this.f11477c);
                return;
            default:
                super.onAdOpened();
                return;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdSwipeGestureClicked() {
        switch (this.f11476b) {
            case 1:
                super.onAdSwipeGestureClicked();
                return;
            default:
                super.onAdSwipeGestureClicked();
                return;
        }
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        ((MediationNativeListener) this.f11478d).onAdLoaded((AbstractAdViewAdapter) this.f11477c, new a(unifiedNativeAd));
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbgt zzbgtVar, String str) {
        ((MediationNativeListener) this.f11478d).zze((AbstractAdViewAdapter) this.f11477c, zzbgtVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbgt zzbgtVar) {
        ((MediationNativeListener) this.f11478d).zzd((AbstractAdViewAdapter) this.f11477c, zzbgtVar);
    }

    public d(PremiumNativeAd premiumNativeAd, MediationAdLoadCallback mediationAdLoadCallback) {
        this.f11478d = premiumNativeAd;
        this.f11477c = mediationAdLoadCallback;
    }
}
