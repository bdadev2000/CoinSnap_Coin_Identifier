package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* loaded from: classes2.dex */
public class zzemz extends zzbrk {
    private final zzczj zza;
    private final zzdhg zzb;
    private final zzdad zzc;
    private final zzdas zzd;
    private final zzdax zze;
    private final zzdef zzf;
    private final zzdbr zzg;
    private final zzdid zzh;
    private final zzdeb zzi;
    private final zzczy zzj;

    public zzemz(zzczj zzczjVar, zzdhg zzdhgVar, zzdad zzdadVar, zzdas zzdasVar, zzdax zzdaxVar, zzdef zzdefVar, zzdbr zzdbrVar, zzdid zzdidVar, zzdeb zzdebVar, zzczy zzczyVar) {
        this.zza = zzczjVar;
        this.zzb = zzdhgVar;
        this.zzc = zzdadVar;
        this.zzd = zzdasVar;
        this.zze = zzdaxVar;
        this.zzf = zzdefVar;
        this.zzg = zzdbrVar;
        this.zzh = zzdidVar;
        this.zzi = zzdebVar;
        this.zzj = zzczyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzf() {
        this.zzg.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzg(int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzi(int i9, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    @Deprecated
    public final void zzj(int i9) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i9, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfiq.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzp() {
        this.zzg.zzdr();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzr(zzbip zzbipVar, String str) {
    }

    public void zzs(zzbyt zzbytVar) {
    }

    public void zzt(zzbyx zzbyxVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbrl
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
