package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzaqq extends Thread {
    private static final boolean zza = zzarq.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaqo zzd;
    private volatile boolean zze = false;
    private final zzarr zzf;
    private final zzaqv zzg;

    public zzaqq(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaqo zzaqoVar, zzaqv zzaqvVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaqoVar;
        this.zzg = zzaqvVar;
        this.zzf = new zzarr(this, blockingQueue2, zzaqvVar);
    }

    private void zzc() throws InterruptedException {
        zzare zzareVar = (zzare) this.zzb.take();
        zzareVar.zzm("cache-queue-take");
        zzareVar.zzt(1);
        try {
            zzareVar.zzw();
            zzaqn zza2 = this.zzd.zza(zzareVar.zzj());
            if (zza2 == null) {
                zzareVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzareVar)) {
                    this.zzc.put(zzareVar);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                if (zza2.zza(currentTimeMillis)) {
                    zzareVar.zzm("cache-hit-expired");
                    zzareVar.zze(zza2);
                    if (!this.zzf.zzc(zzareVar)) {
                        this.zzc.put(zzareVar);
                    }
                } else {
                    zzareVar.zzm("cache-hit");
                    zzark zzh = zzareVar.zzh(new zzara(zza2.zza, zza2.zzg));
                    zzareVar.zzm("cache-hit-parsed");
                    if (!zzh.zzc()) {
                        zzareVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzareVar.zzj(), true);
                        zzareVar.zze(null);
                        if (!this.zzf.zzc(zzareVar)) {
                            this.zzc.put(zzareVar);
                        }
                    } else if (zza2.zzf < currentTimeMillis) {
                        zzareVar.zzm("cache-hit-refresh-needed");
                        zzareVar.zze(zza2);
                        zzh.zzd = true;
                        if (!this.zzf.zzc(zzareVar)) {
                            this.zzg.zzb(zzareVar, zzh, new zzaqp(this, zzareVar));
                        } else {
                            this.zzg.zzb(zzareVar, zzh, null);
                        }
                    } else {
                        this.zzg.zzb(zzareVar, zzh, null);
                    }
                }
            }
            zzareVar.zzt(2);
        } catch (Throwable th) {
            zzareVar.zzt(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzarq.zzd("start new dispatcher", new Object[0]);
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
                zzarq.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
