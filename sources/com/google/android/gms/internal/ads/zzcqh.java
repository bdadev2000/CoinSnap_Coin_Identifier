package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
public final class zzcqh implements zzczo {
    private final zzfgw zza;
    private final zzfhf zzb;
    private final zzfoa zzc;
    private final zzfoe zzd;

    public zzcqh(zzfhf zzfhfVar, zzfoe zzfoeVar, zzfoa zzfoaVar) {
        this.zzb = zzfhfVar;
        this.zzd = zzfoeVar;
        this.zzc = zzfoaVar;
        this.zza = zzfhfVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        List list = this.zza.zza;
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, list));
    }
}
