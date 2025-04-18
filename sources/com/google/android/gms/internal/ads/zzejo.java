package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzejo {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcth zzc;
    private final zzeke zzd;
    private final zzfnc zze;
    private final zzggh zzf = zzggh.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzejp zzh;
    private zzfgt zzi;

    public zzejo(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcth zzcthVar, zzeke zzekeVar, zzfnc zzfncVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcthVar;
        this.zzd = zzekeVar;
        this.zze = zzfncVar;
    }

    private final synchronized ListenableFuture zzd(zzfgh zzfghVar) {
        Iterator it = zzfghVar.zza.iterator();
        while (it.hasNext()) {
            zzegk zza = this.zzc.zza(zzfghVar.zzb, (String) it.next());
            if (zza != null && zza.zzb(this.zzi, zzfghVar)) {
                return zzgfo.zzo(zza.zza(this.zzi, zzfghVar), zzfghVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgfo.zzg(new zzdye(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(@Nullable zzfgh zzfghVar) {
        ListenableFuture zzd = zzd(zzfghVar);
        this.zzd.zzf(this.zzi, zzfghVar, zzd, this.zze);
        zzgfo.zzr(zzd, new zzejn(this, zzfghVar), this.zza);
    }

    public final synchronized ListenableFuture zzb(zzfgt zzfgtVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                if (zzfgtVar.zzb.zza.isEmpty()) {
                    this.zzf.zzd(new zzeki(3, zzekl.zzc(zzfgtVar)));
                } else {
                    this.zzi = zzfgtVar;
                    this.zzh = new zzejp(zzfgtVar, this.zzd, this.zzf);
                    this.zzd.zzk(zzfgtVar.zzb.zza);
                    zzfgh zza = this.zzh.zza();
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
