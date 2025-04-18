package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class zzeqp implements zzevz {
    private final AtomicReference zza = new AtomicReference();
    private final AtomicReference zzb = new AtomicReference(Boolean.FALSE);
    private final Clock zzc;
    private final Executor zzd;
    private final zzevz zze;
    private final long zzf;
    private final zzdsm zzg;

    public zzeqp(zzevz zzevzVar, long j3, Clock clock, Executor executor, zzdsm zzdsmVar) {
        this.zzc = clock;
        this.zze = zzevzVar;
        this.zzf = j3;
        this.zzd = executor;
        this.zzg = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        zzeqo zzeqoVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlw)).booleanValue()) {
            zzeqoVar = (zzeqo) this.zza.get();
            if (zzeqoVar == null || zzeqoVar.zza()) {
                zzevz zzevzVar = this.zze;
                zzeqo zzeqoVar2 = new zzeqo(zzevzVar.zzb(), this.zzf, this.zzc);
                this.zza.set(zzeqoVar2);
                zzeqoVar = zzeqoVar2;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlv)).booleanValue() && !((Boolean) this.zzb.getAndSet(Boolean.TRUE)).booleanValue()) {
                ScheduledExecutorService scheduledExecutorService = zzcaj.zzd;
                Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        r0.zzd.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeqn
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzeqp.this.zzd();
                            }
                        });
                    }
                };
                long j3 = this.zzf;
                scheduledExecutorService.scheduleWithFixedDelay(runnable, j3, j3, TimeUnit.MILLISECONDS);
            }
            synchronized (this) {
                zzeqoVar = (zzeqo) this.zza.get();
                if (zzeqoVar == null) {
                    zzeqo zzeqoVar3 = new zzeqo(this.zze.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeqoVar3);
                    return zzeqoVar3.zza;
                }
                if (!((Boolean) this.zzb.get()).booleanValue() && zzeqoVar.zza()) {
                    ua.b bVar = zzeqoVar.zza;
                    zzevz zzevzVar2 = this.zze;
                    zzeqo zzeqoVar4 = new zzeqo(zzevzVar2.zzb(), this.zzf, this.zzc);
                    this.zza.set(zzeqoVar4);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzlx)).booleanValue()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzly)).booleanValue()) {
                            zzdsl zza = this.zzg.zza();
                            zza.zzb("action", "scs");
                            zza.zzb("sid", String.valueOf(this.zze.zza()));
                            zza.zzf();
                        }
                        return bVar;
                    }
                    zzeqoVar = zzeqoVar4;
                }
            }
        }
        return zzeqoVar.zza;
    }

    public final /* synthetic */ void zzd() {
        this.zza.set(new zzeqo(this.zze.zzb(), this.zzf, this.zzc));
    }
}
