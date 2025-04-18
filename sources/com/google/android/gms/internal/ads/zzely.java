package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
public class zzely extends zzbpq {
    private final zzcxy zza;
    private final zzdfy zzb;
    private final zzcys zzc;
    private final zzczh zzd;
    private final zzczm zze;
    private final zzdcx zzf;
    private final zzdag zzg;
    private final zzdgv zzh;
    private final zzdct zzi;
    private final zzcyn zzj;

    public zzely(zzcxy zzcxyVar, zzdfy zzdfyVar, zzcys zzcysVar, zzczh zzczhVar, zzczm zzczmVar, zzdcx zzdcxVar, zzdag zzdagVar, zzdgv zzdgvVar, zzdct zzdctVar, zzcyn zzcynVar) {
        this.zza = zzcxyVar;
        this.zzb = zzdfyVar;
        this.zzc = zzcysVar;
        this.zzd = zzczhVar;
        this.zze = zzczmVar;
        this.zzf = zzdcxVar;
        this.zzg = zzdagVar;
        this.zzh = zzdgvVar;
        this.zzi = zzdctVar;
        this.zzj = zzcynVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzf() {
        this.zzg.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzg(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzi(int i2, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    @Deprecated
    public final void zzj(int i2) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i2, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfie.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzp() {
        this.zzg.zzdr();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzr(zzbgw zzbgwVar, String str) {
    }

    public void zzs(zzbwy zzbwyVar) {
    }

    public void zzt(zzbxc zzbxcVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpr
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
