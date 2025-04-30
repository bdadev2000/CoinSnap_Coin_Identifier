package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes2.dex */
public final class zzdwh {
    private final zzbmo zza;

    public zzdwh(zzbmo zzbmoVar) {
        this.zza = zzbmoVar;
    }

    private final void zzs(zzdwg zzdwgVar) throws RemoteException {
        String zza = zzdwg.zza(zzdwgVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdwg("initialize", null));
    }

    public final void zzb(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdClicked";
        this.zza.zzb(zzdwg.zza(zzdwgVar));
    }

    public final void zzc(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdClosed";
        zzs(zzdwgVar);
    }

    public final void zzd(long j7, int i9) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdFailedToLoad";
        zzdwgVar.zzd = Integer.valueOf(i9);
        zzs(zzdwgVar);
    }

    public final void zze(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdLoaded";
        zzs(zzdwgVar);
    }

    public final void zzf(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdwgVar);
    }

    public final void zzg(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("interstitial", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdOpened";
        zzs(zzdwgVar);
    }

    public final void zzh(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("creation", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "nativeObjectCreated";
        zzs(zzdwgVar);
    }

    public final void zzi(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("creation", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "nativeObjectNotCreated";
        zzs(zzdwgVar);
    }

    public final void zzj(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdClicked";
        zzs(zzdwgVar);
    }

    public final void zzk(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onRewardedAdClosed";
        zzs(zzdwgVar);
    }

    public final void zzl(long j7, zzbyx zzbyxVar) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onUserEarnedReward";
        zzdwgVar.zze = zzbyxVar.zzf();
        zzdwgVar.zzf = Integer.valueOf(zzbyxVar.zze());
        zzs(zzdwgVar);
    }

    public final void zzm(long j7, int i9) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onRewardedAdFailedToLoad";
        zzdwgVar.zzd = Integer.valueOf(i9);
        zzs(zzdwgVar);
    }

    public final void zzn(long j7, int i9) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onRewardedAdFailedToShow";
        zzdwgVar.zzd = Integer.valueOf(i9);
        zzs(zzdwgVar);
    }

    public final void zzo(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onAdImpression";
        zzs(zzdwgVar);
    }

    public final void zzp(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onRewardedAdLoaded";
        zzs(zzdwgVar);
    }

    public final void zzq(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdwgVar);
    }

    public final void zzr(long j7) throws RemoteException {
        zzdwg zzdwgVar = new zzdwg("rewarded", null);
        zzdwgVar.zza = Long.valueOf(j7);
        zzdwgVar.zzc = "onRewardedAdOpened";
        zzs(zzdwgVar);
    }
}
