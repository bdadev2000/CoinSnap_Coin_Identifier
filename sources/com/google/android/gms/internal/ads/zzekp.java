package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* loaded from: classes3.dex */
public class zzekp extends zzbpl {
    private final zzcwk zza;
    private final zzdej zzb;
    private final zzcxe zzc;
    private final zzcxt zzd;
    private final zzcxy zze;
    private final zzdbi zzf;
    private final zzcys zzg;
    private final zzdfg zzh;
    private final zzdbe zzi;
    private final zzcwz zzj;

    public zzekp(zzcwk zzcwkVar, zzdej zzdejVar, zzcxe zzcxeVar, zzcxt zzcxtVar, zzcxy zzcxyVar, zzdbi zzdbiVar, zzcys zzcysVar, zzdfg zzdfgVar, zzdbe zzdbeVar, zzcwz zzcwzVar) {
        this.zza = zzcwkVar;
        this.zzb = zzdejVar;
        this.zzc = zzcxeVar;
        this.zzd = zzcxtVar;
        this.zze = zzcxyVar;
        this.zzf = zzdbiVar;
        this.zzg = zzcysVar;
        this.zzh = zzdfgVar;
        this.zzi = zzdbeVar;
        this.zzj = zzcwzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzf() {
        this.zzg.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzg(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzi(int i10, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    @Deprecated
    public final void zzj(int i10) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfgq.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzp() {
        this.zzg.zzdr();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzr(zzbgs zzbgsVar, String str) {
    }

    public void zzs(zzbwv zzbwvVar) {
    }

    public void zzt(zzbwz zzbwzVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
