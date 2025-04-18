package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzdvi {
    private final zzbkv zza;

    public zzdvi(zzbkv zzbkvVar) {
        this.zza = zzbkvVar;
    }

    private final void zzs(zzdvh zzdvhVar) throws RemoteException {
        String zza = zzdvh.zza(zzdvhVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdvh("initialize", null));
    }

    public final void zzb(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdClicked";
        this.zza.zzb(zzdvh.zza(zzdvhVar));
    }

    public final void zzc(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdClosed";
        zzs(zzdvhVar);
    }

    public final void zzd(long j2, int i2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdFailedToLoad";
        zzdvhVar.zzd = Integer.valueOf(i2);
        zzs(zzdvhVar);
    }

    public final void zze(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdLoaded";
        zzs(zzdvhVar);
    }

    public final void zzf(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvhVar);
    }

    public final void zzg(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("interstitial", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdOpened";
        zzs(zzdvhVar);
    }

    public final void zzh(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("creation", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "nativeObjectCreated";
        zzs(zzdvhVar);
    }

    public final void zzi(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("creation", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "nativeObjectNotCreated";
        zzs(zzdvhVar);
    }

    public final void zzj(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdClicked";
        zzs(zzdvhVar);
    }

    public final void zzk(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onRewardedAdClosed";
        zzs(zzdvhVar);
    }

    public final void zzl(long j2, zzbxc zzbxcVar) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onUserEarnedReward";
        zzdvhVar.zze = zzbxcVar.zzf();
        zzdvhVar.zzf = Integer.valueOf(zzbxcVar.zze());
        zzs(zzdvhVar);
    }

    public final void zzm(long j2, int i2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onRewardedAdFailedToLoad";
        zzdvhVar.zzd = Integer.valueOf(i2);
        zzs(zzdvhVar);
    }

    public final void zzn(long j2, int i2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onRewardedAdFailedToShow";
        zzdvhVar.zzd = Integer.valueOf(i2);
        zzs(zzdvhVar);
    }

    public final void zzo(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onAdImpression";
        zzs(zzdvhVar);
    }

    public final void zzp(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onRewardedAdLoaded";
        zzs(zzdvhVar);
    }

    public final void zzq(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdvhVar);
    }

    public final void zzr(long j2) throws RemoteException {
        zzdvh zzdvhVar = new zzdvh("rewarded", null);
        zzdvhVar.zza = Long.valueOf(j2);
        zzdvhVar.zzc = "onRewardedAdOpened";
        zzs(zzdvhVar);
    }
}
