package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzapo extends Thread {
    private static final boolean zza = zzaqo.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzapm zzd;
    private volatile boolean zze = false;
    private final zzaqp zzf;
    private final zzapt zzg;

    public zzapo(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzapm zzapmVar, zzapt zzaptVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzapmVar;
        this.zzg = zzaptVar;
        this.zzf = new zzaqp(this, blockingQueue2, zzaptVar);
    }

    private void zzc() throws InterruptedException {
        zzaqc zzaqcVar = (zzaqc) this.zzb.take();
        zzaqcVar.zzm("cache-queue-take");
        zzaqcVar.zzt(1);
        try {
            zzaqcVar.zzw();
            zzapl zza2 = this.zzd.zza(zzaqcVar.zzj());
            if (zza2 == null) {
                zzaqcVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaqcVar)) {
                    this.zzc.put(zzaqcVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzaqcVar.zzm("cache-hit-expired");
                    zzaqcVar.zze(zza2);
                    if (!this.zzf.zzc(zzaqcVar)) {
                        this.zzc.put(zzaqcVar);
                    }
                } else {
                    zzaqcVar.zzm("cache-hit");
                    zzaqi zzh = zzaqcVar.zzh(new zzapy(zza2.zza, zza2.zzg));
                    zzaqcVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzaqcVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzaqcVar.zzj(), true);
                        zzaqcVar.zze(null);
                        if (!this.zzf.zzc(zzaqcVar)) {
                            this.zzc.put(zzaqcVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzaqcVar.zzm("cache-hit-refresh-needed");
                        zzaqcVar.zze(zza2);
                        zzh.zzd = true;
                        if (this.zzf.zzc(zzaqcVar)) {
                            this.zzg.zzb(zzaqcVar, zzh, null);
                        } else {
                            this.zzg.zzb(zzaqcVar, zzh, new zzapn(this, zzaqcVar));
                        }
                    } else {
                        this.zzg.zzb(zzaqcVar, zzh, null);
                    }
                }
            }
            zzaqcVar.zzt(2);
        } catch (Throwable th) {
            zzaqcVar.zzt(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzaqo.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzaqo.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
