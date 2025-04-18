package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdud {
    private final zzdui zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdud(zzdui zzduiVar, Executor executor) {
        this.zza = zzduiVar;
        this.zzc = zzduiVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdui zzb(zzdud zzdudVar) {
        return zzdudVar.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzc(zzdud zzdudVar) {
        return zzdudVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdud zzdudVar) {
        return zzdudVar.zzb;
    }

    public final zzduc zza() {
        zzduc zzducVar = new zzduc(this);
        zzduc.zza(zzducVar);
        return zzducVar;
    }

    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzlm)).booleanValue()) {
            zzduc zza = zza();
            zza.zzb("action", "pecr");
            zza.zzf();
        }
    }
}
