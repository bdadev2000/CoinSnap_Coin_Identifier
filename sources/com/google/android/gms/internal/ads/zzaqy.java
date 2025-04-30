package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzaqy extends Thread {
    private final BlockingQueue zza;
    private final zzaqx zzb;
    private final zzaqo zzc;
    private volatile boolean zzd = false;
    private final zzaqv zze;

    public zzaqy(BlockingQueue blockingQueue, zzaqx zzaqxVar, zzaqo zzaqoVar, zzaqv zzaqvVar) {
        this.zza = blockingQueue;
        this.zzb = zzaqxVar;
        this.zzc = zzaqoVar;
        this.zze = zzaqvVar;
    }

    private void zzb() throws InterruptedException {
        zzare zzareVar = (zzare) this.zza.take();
        SystemClock.elapsedRealtime();
        zzareVar.zzt(3);
        try {
            try {
                zzareVar.zzm("network-queue-take");
                zzareVar.zzw();
                TrafficStats.setThreadStatsTag(zzareVar.zzc());
                zzara zza = this.zzb.zza(zzareVar);
                zzareVar.zzm("network-http-complete");
                if (zza.zze && zzareVar.zzv()) {
                    zzareVar.zzp("not-modified");
                    zzareVar.zzr();
                } else {
                    zzark zzh = zzareVar.zzh(zza);
                    zzareVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzareVar.zzj(), zzh.zzb);
                        zzareVar.zzm("network-cache-written");
                    }
                    zzareVar.zzq();
                    this.zze.zzb(zzareVar, zzh, null);
                    zzareVar.zzs(zzh);
                }
            } catch (zzarn e4) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzareVar, e4);
                zzareVar.zzr();
            } catch (Exception e9) {
                zzarq.zzc(e9, "Unhandled exception %s", e9.toString());
                zzarn zzarnVar = new zzarn(e9);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzareVar, zzarnVar);
                zzareVar.zzr();
            }
            zzareVar.zzt(4);
        } catch (Throwable th) {
            zzareVar.zzt(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzarq.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
