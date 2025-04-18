package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes3.dex */
public final class zzfjx implements zzddq, zzcxc, zzddu {
    private final zzfkl zza;
    private final zzfka zzb;

    public zzfjx(Context context, zzfkl zzfklVar) {
        this.zza = zzfklVar;
        this.zzb = zzfjz.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb() {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            zzfkl zzfklVar = this.zza;
            zzfka zzfkaVar = this.zzb;
            zzfkaVar.zzg(true);
            zzfklVar.zza(zzfkaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            zzfkl zzfklVar = this.zza;
            zzfka zzfkaVar = this.zzb;
            zzfkaVar.zzc(zzeVar.zza().toString());
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
        }
    }
}
