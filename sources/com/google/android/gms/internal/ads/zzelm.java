package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes3.dex */
final class zzelm extends zzbww {
    final /* synthetic */ zzdag zza;
    final /* synthetic */ zzcxy zzb;
    final /* synthetic */ zzczh zzc;
    final /* synthetic */ zzdgj zzd;

    public zzelm(zzeln zzelnVar, zzdag zzdagVar, zzcxy zzcxyVar, zzczh zzczhVar, zzdgj zzdgjVar) {
        this.zza = zzdagVar;
        this.zzb = zzcxyVar;
        this.zzc = zzczhVar;
        this.zzd = zzdgjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzg(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdr();
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzk(IObjectWrapper iObjectWrapper, int i2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzm(IObjectWrapper iObjectWrapper, zzbwy zzbwyVar) {
        this.zzd.zza(zzbwyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
