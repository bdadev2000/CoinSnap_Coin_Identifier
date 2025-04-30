package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes2.dex */
final class zzemn extends zzbyr {
    final /* synthetic */ zzdbr zza;
    final /* synthetic */ zzczj zzb;
    final /* synthetic */ zzdas zzc;
    final /* synthetic */ zzdhr zzd;

    public zzemn(zzemo zzemoVar, zzdbr zzdbrVar, zzczj zzczjVar, zzdas zzdasVar, zzdhr zzdhrVar) {
        this.zza = zzdbrVar;
        this.zzb = zzczjVar;
        this.zzc = zzdasVar;
        this.zzd = zzdhrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzg(IObjectWrapper iObjectWrapper, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdr();
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzk(IObjectWrapper iObjectWrapper, int i9) {
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzm(IObjectWrapper iObjectWrapper, zzbyt zzbytVar) {
        this.zzd.zza(zzbytVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbys
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
