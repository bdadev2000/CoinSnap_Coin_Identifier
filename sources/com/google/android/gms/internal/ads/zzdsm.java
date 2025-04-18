package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdsm {
    private final zzdsr zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsm(zzdsr zzdsrVar, Executor executor) {
        this.zza = zzdsrVar;
        this.zzc = zzdsrVar.zza();
        this.zzb = executor;
    }

    public final zzdsl zza() {
        zzdsl zzdslVar = new zzdsl(this);
        zzdsl.zza(zzdslVar);
        return zzdslVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzln)).booleanValue()) {
            return;
        }
        zzdsl zza = zza();
        zza.zzb("action", "pecr");
        zza.zzf();
    }
}
