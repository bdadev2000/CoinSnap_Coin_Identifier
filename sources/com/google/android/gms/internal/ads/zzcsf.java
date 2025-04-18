package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzcsf {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final ua.b zzc;
    private volatile boolean zzd = true;

    public zzcsf(Executor executor, ScheduledExecutorService scheduledExecutorService, ua.b bVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = bVar;
    }

    public static /* bridge */ /* synthetic */ void zzb(final zzcsf zzcsfVar, List list, final zzgee zzgeeVar) {
        if (list != null && !list.isEmpty()) {
            ua.b zzh = zzgei.zzh(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final ua.b bVar = (ua.b) it.next();
                zzh = zzgei.zzn(zzgei.zzf(zzh, Throwable.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsb
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        zzgee.this.zza((Throwable) obj);
                        return zzgei.zzh(null);
                    }
                }, zzcsfVar.zza), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzcsc
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final ua.b zza(Object obj) {
                        return zzcsf.this.zza(zzgeeVar, bVar, (zzcrq) obj);
                    }
                }, zzcsfVar.zza);
            }
            zzgei.zzr(zzh, new zzcse(zzcsfVar, zzgeeVar), zzcsfVar.zza);
            return;
        }
        zzcsfVar.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsa
            @Override // java.lang.Runnable
            public final void run() {
                zzgee.this.zza(new zzdwn(3));
            }
        });
    }

    public final /* synthetic */ ua.b zza(zzgee zzgeeVar, ua.b bVar, zzcrq zzcrqVar) throws Exception {
        if (zzcrqVar != null) {
            zzgeeVar.zzb(zzcrqVar);
        }
        return zzgei.zzo(bVar, ((Long) zzbfa.zza.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
    }

    public final /* synthetic */ void zzd() {
        this.zzd = false;
    }

    public final void zze(zzgee zzgeeVar) {
        zzgei.zzr(this.zzc, new zzcsd(this, zzgeeVar), this.zza);
    }

    public final boolean zzf() {
        return this.zzd;
    }
}
