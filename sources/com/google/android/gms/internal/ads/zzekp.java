package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzekp {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcus zzc;
    private final zzelf zzd;
    private final zzfoa zze;
    private final zzggm zzf = zzggm.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzekq zzh;
    private zzfhf zzi;

    public zzekp(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcus zzcusVar, zzelf zzelfVar, zzfoa zzfoaVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcusVar;
        this.zzd = zzelfVar;
        this.zze = zzfoaVar;
    }

    private final synchronized f4.c zzd(zzfgt zzfgtVar) {
        Iterator it = zzfgtVar.zza.iterator();
        while (it.hasNext()) {
            zzehl zza = this.zzc.zza(zzfgtVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfgtVar)) {
                return zzgft.zzo(zza.zza(this.zzi, zzfgtVar), zzfgtVar.zzS, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgft.zzg(new zzdzd(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(@Nullable zzfgt zzfgtVar) {
        f4.c zzd = zzd(zzfgtVar);
        this.zzd.zzf(this.zzi, zzfgtVar, zzd, this.zze);
        zzgft.zzr(zzd, new zzeko(this, zzfgtVar), this.zza);
    }

    public final synchronized f4.c zzb(zzfhf zzfhfVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (zzfhfVar.zzb.zza.isEmpty()) {
                    this.zzf.zzd(new zzelj(3, zzelm.zzc(zzfhfVar)));
                } else {
                    this.zzi = zzfhfVar;
                    this.zzh = new zzekq(zzfhfVar, this.zzd, this.zzf);
                    this.zzd.zzk(zzfhfVar.zzb.zza);
                    zzfgt zza = this.zzh.zza();
                    while (zza != null) {
                        zze(zza);
                        zza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzf;
    }
}
