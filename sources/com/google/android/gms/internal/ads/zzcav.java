package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes3.dex */
public class zzcav {
    private final zzcao zza;
    private final AtomicInteger zzb;

    public zzcav() {
        zzcao zzcaoVar = new zzcao();
        this.zza = zzcaoVar;
        this.zzb = new AtomicInteger(0);
        zzgei.zzr(zzcaoVar, new zzcat(this), zzcaj.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Throwable th2, String str) {
        this.zza.zzd(th2);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhq)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzcas zzcasVar, zzcaq zzcaqVar) {
        zzgei.zzr(this.zza, new zzcau(this, zzcasVar, zzcaqVar), zzcaj.zzf);
    }
}
