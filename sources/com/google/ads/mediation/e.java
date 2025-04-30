package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.internal.ads.zzbiq;

/* loaded from: classes.dex */
public final class e extends AdListener implements zzi, zzg, zzf {
    public final AbstractAdViewAdapter b;

    /* renamed from: c, reason: collision with root package name */
    public final MediationNativeListener f13876c;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.b = abstractAdViewAdapter;
        this.f13876c = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.f13876c.onAdClicked(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.f13876c.onAdClosed(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f13876c.onAdFailedToLoad(this.b, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.f13876c.onAdImpression(this.b);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.f13876c.onAdOpened(this.b);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        UnifiedNativeAdMapper unifiedNativeAdMapper = new UnifiedNativeAdMapper();
        unifiedNativeAdMapper.setHeadline(unifiedNativeAd.zzh());
        unifiedNativeAdMapper.setImages(unifiedNativeAd.zzk());
        unifiedNativeAdMapper.setBody(unifiedNativeAd.zzf());
        unifiedNativeAdMapper.setIcon(unifiedNativeAd.zzb());
        unifiedNativeAdMapper.setCallToAction(unifiedNativeAd.zzg());
        unifiedNativeAdMapper.setAdvertiser(unifiedNativeAd.zze());
        unifiedNativeAdMapper.setStarRating(unifiedNativeAd.zzc());
        unifiedNativeAdMapper.setStore(unifiedNativeAd.zzj());
        unifiedNativeAdMapper.setPrice(unifiedNativeAd.zzi());
        unifiedNativeAdMapper.zzd(unifiedNativeAd.zzd());
        unifiedNativeAdMapper.setOverrideImpressionRecording(true);
        unifiedNativeAdMapper.setOverrideClickHandling(true);
        unifiedNativeAdMapper.zze(unifiedNativeAd.zza());
        this.f13876c.onAdLoaded(this.b, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbiq zzbiqVar, String str) {
        this.f13876c.zze(this.b, zzbiqVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbiq zzbiqVar) {
        this.f13876c.zzd(this.b, zzbiqVar);
    }
}
