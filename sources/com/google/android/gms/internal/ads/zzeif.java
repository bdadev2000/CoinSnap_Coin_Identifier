package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzeif {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcrt zzc;
    private final zzeiv zzd;
    private final zzfln zze;
    private final zzgfa zzf = zzgfa.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzeig zzh;
    private zzfff zzi;

    public zzeif(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcrt zzcrtVar, zzeiv zzeivVar, zzfln zzflnVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcrtVar;
        this.zzd = zzeivVar;
        this.zze = zzflnVar;
    }

    private final synchronized ua.b zzd(zzfet zzfetVar) {
        Iterator it = zzfetVar.zza.iterator();
        while (it.hasNext()) {
            zzefb zza = this.zzc.zza(zzfetVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfetVar)) {
                return zzgei.zzo(zza.zza(this.zzi, zzfetVar), zzfetVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgei.zzg(new zzdwn(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(@Nullable zzfet zzfetVar) {
        ua.b zzd = zzd(zzfetVar);
        this.zzd.zzf(this.zzi, zzfetVar, zzd, this.zze);
        zzgei.zzr(zzd, new zzeie(this, zzfetVar), this.zza);
    }

    public final synchronized ua.b zzb(zzfff zzfffVar) {
        if (!this.zzg.getAndSet(true)) {
            if (zzfffVar.zzb.zza.isEmpty()) {
                this.zzf.zzd(new zzeiz(3, zzejc.zzc(zzfffVar)));
            } else {
                this.zzi = zzfffVar;
                this.zzh = new zzeig(zzfffVar, this.zzd, this.zzf);
                this.zzd.zzk(zzfffVar.zzb.zza);
                zzfet zza = this.zzh.zza();
                while (zza != null) {
                    zze(zza);
                    zza = this.zzh.zza();
                }
            }
        }
        return this.zzf;
    }
}
