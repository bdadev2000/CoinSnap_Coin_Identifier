package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzcnf implements zzcwp {
    private final zzfew zza;
    private final zzfff zzb;
    private final zzfln zzc;
    private final zzflr zzd;

    public zzcnf(zzfff zzfffVar, zzflr zzflrVar, zzfln zzflnVar) {
        this.zzb = zzfffVar;
        this.zzd = zzflrVar;
        this.zzc = zzflnVar;
        this.zza = zzfffVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
