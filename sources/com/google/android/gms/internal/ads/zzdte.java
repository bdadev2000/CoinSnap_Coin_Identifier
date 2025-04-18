package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdte implements zzhfx {
    private final zzdta zza;
    private final zzhgp zzb;

    public zzdte(zzdta zzdtaVar, zzhgp zzhgpVar, zzhgp zzhgpVar2) {
        this.zza = zzdtaVar;
        this.zzb = zzhgpVar;
    }

    public static Set zza(zzdta zzdtaVar, zzdtk zzdtkVar, Executor executor) {
        Set zzd = zzdta.zzd(zzdtkVar, executor);
        zzhgf.zzb(zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (zzdtk) this.zzb.zzb(), zzfin.zzc());
    }
}
