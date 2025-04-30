package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes2.dex */
public class zzccu {
    private final zzccn zza;
    private final AtomicInteger zzb;

    public zzccu() {
        zzccn zzccnVar = new zzccn();
        this.zza = zzccnVar;
        this.zzb = new AtomicInteger(0);
        zzgft.zzr(zzccnVar, new zzccs(this), zzcci.zzf);
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
    public final void zzh(Throwable th, String str) {
        this.zza.zzd(th);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhO)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, str);
        }
    }

    @Deprecated
    public final void zzi(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzj(zzccr zzccrVar, zzccp zzccpVar) {
        zzgft.zzr(this.zza, new zzcct(this, zzccrVar, zzccpVar), zzcci.zzf);
    }
}
