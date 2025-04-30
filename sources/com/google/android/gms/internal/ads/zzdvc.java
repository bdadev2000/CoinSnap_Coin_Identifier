package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzdvc {
    private final zzdvh zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdvc(zzdvh zzdvhVar, Executor executor) {
        this.zza = zzdvhVar;
        this.zzc = zzdvhVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdvh zzb(zzdvc zzdvcVar) {
        return zzdvcVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdvc zzdvcVar) {
        return zzdvcVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdvc zzdvcVar) {
        return zzdvcVar.zzb;
    }

    public final zzdvb zza() {
        zzdvb zzdvbVar = new zzdvb(this);
        zzdvb.zza(zzdvbVar);
        return zzdvbVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzlG)).booleanValue()) {
            return;
        }
        zzdvb zza = zza();
        zza.zzb("action", "pecr");
        zza.zzf();
    }
}
