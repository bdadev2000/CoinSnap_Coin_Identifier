package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class zzflz implements zzdgn, zzdab, zzdgr {
    private final zzfmn zza;
    private final zzfmc zzb;

    public zzflz(Context context, zzfmn zzfmnVar) {
        this.zza = zzfmnVar;
        this.zzb = zzfmb.zza(context, zzfmu.CUI_NAME_ADSHOW);
    }

    @Override // com.google.android.gms.internal.ads.zzdgr
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgr
    public final void zzb() {
        if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
            zzfmn zzfmnVar = this.zza;
            zzfmc zzfmcVar = this.zzb;
            zzfmcVar.zzh(true);
            zzfmnVar.zza(zzfmcVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzdgn
    public final void zzl() {
        if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
            this.zzb.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdab
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbgd.zzd.zze()).booleanValue()) {
            zzfmn zzfmnVar = this.zza;
            zzfmc zzfmcVar = this.zzb;
            zzfmcVar.zzc(zzeVar.zza().toString());
            zzfmcVar.zzh(false);
            zzfmnVar.zza(zzfmcVar);
        }
    }
}
