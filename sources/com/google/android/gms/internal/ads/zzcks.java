package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcks implements zzdvn {
    private final Context zza;
    private final zzbkv zzb;
    private final zzcjk zzc;
    private final zzcks zzd = this;
    private final zzhir zze;
    private final zzhir zzf;
    private final zzhir zzg;
    private final zzhir zzh;

    public /* synthetic */ zzcks(zzcjk zzcjkVar, Context context, zzbkv zzbkvVar, zzckr zzckrVar) {
        this.zzc = zzcjkVar;
        this.zza = context;
        this.zzb = zzbkvVar;
        zzhii zza = zzhij.zza(this);
        this.zze = zza;
        zzhii zza2 = zzhij.zza(zzbkvVar);
        this.zzf = zza2;
        zzdvj zzdvjVar = new zzdvj(zza2);
        this.zzg = zzdvjVar;
        this.zzh = zzhih.zzc(new zzdvl(zza, zzdvjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final zzdve zzb() {
        return new zzckm(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdvn
    public final zzdvk zzd() {
        return (zzdvk) this.zzh.zzb();
    }
}
