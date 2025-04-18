package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzduv implements zzhii {
    private final zzdur zza;
    private final zzhja zzb;

    public zzduv(zzdur zzdurVar, zzhja zzhjaVar, zzhja zzhjaVar2) {
        this.zza = zzdurVar;
        this.zzb = zzhjaVar;
    }

    public static Set zza(zzdur zzdurVar, zzdvb zzdvbVar, Executor executor) {
        Set zzd = zzdur.zzd(zzdvbVar, executor);
        zzhiq.zzb(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdvb) this.zzb.zzb(), zzfkb.zzc());
    }
}
