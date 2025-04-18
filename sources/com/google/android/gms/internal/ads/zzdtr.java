package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes3.dex */
public final class zzdtr {
    private final zzbkq zza;

    public zzdtr(zzbkq zzbkqVar) {
        this.zza = zzbkqVar;
    }

    private final void zzs(zzdtp zzdtpVar) throws RemoteException {
        String zza = zzdtp.zza(zzdtpVar);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdtp("initialize", null));
    }

    public final void zzb(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdClicked";
        this.zza.zzb(zzdtp.zza(zzdtpVar));
    }

    public final void zzc(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdClosed";
        zzs(zzdtpVar);
    }

    public final void zzd(long j3, int i10) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdFailedToLoad";
        zzdtpVar.zzd = Integer.valueOf(i10);
        zzs(zzdtpVar);
    }

    public final void zze(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdLoaded";
        zzs(zzdtpVar);
    }

    public final void zzf(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtpVar);
    }

    public final void zzg(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("interstitial", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdOpened";
        zzs(zzdtpVar);
    }

    public final void zzh(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("creation", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "nativeObjectCreated";
        zzs(zzdtpVar);
    }

    public final void zzi(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("creation", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "nativeObjectNotCreated";
        zzs(zzdtpVar);
    }

    public final void zzj(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdClicked";
        zzs(zzdtpVar);
    }

    public final void zzk(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onRewardedAdClosed";
        zzs(zzdtpVar);
    }

    public final void zzl(long j3, zzbwz zzbwzVar) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onUserEarnedReward";
        zzdtpVar.zze = zzbwzVar.zzf();
        zzdtpVar.zzf = Integer.valueOf(zzbwzVar.zze());
        zzs(zzdtpVar);
    }

    public final void zzm(long j3, int i10) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onRewardedAdFailedToLoad";
        zzdtpVar.zzd = Integer.valueOf(i10);
        zzs(zzdtpVar);
    }

    public final void zzn(long j3, int i10) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onRewardedAdFailedToShow";
        zzdtpVar.zzd = Integer.valueOf(i10);
        zzs(zzdtpVar);
    }

    public final void zzo(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onAdImpression";
        zzs(zzdtpVar);
    }

    public final void zzp(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onRewardedAdLoaded";
        zzs(zzdtpVar);
    }

    public final void zzq(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdtpVar);
    }

    public final void zzr(long j3) throws RemoteException {
        zzdtp zzdtpVar = new zzdtp("rewarded", null);
        zzdtpVar.zza = Long.valueOf(j3);
        zzdtpVar.zzc = "onRewardedAdOpened";
        zzs(zzdtpVar);
    }
}
