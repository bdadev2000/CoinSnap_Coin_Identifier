package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
final class zzekd extends zzbwt {
    final /* synthetic */ zzcys zza;
    final /* synthetic */ zzcwk zzb;
    final /* synthetic */ zzcxt zzc;
    final /* synthetic */ zzdeu zzd;

    public zzekd(zzeke zzekeVar, zzcys zzcysVar, zzcwk zzcwkVar, zzcxt zzcxtVar, zzdeu zzdeuVar) {
        this.zza = zzcysVar;
        this.zzb = zzcwkVar;
        this.zzc = zzcxtVar;
        this.zzd = zzdeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdr();
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwv zzbwvVar) {
        this.zzd.zza(zzbwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
