package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes2.dex */
public final class zzapw extends Thread {
    private final BlockingQueue zza;
    private final zzapv zzb;
    private final zzapm zzc;
    private volatile boolean zzd = false;
    private final zzapt zze;

    public zzapw(BlockingQueue blockingQueue, zzapv zzapvVar, zzapm zzapmVar, zzapt zzaptVar) {
        this.zza = blockingQueue;
        this.zzb = zzapvVar;
        this.zzc = zzapmVar;
        this.zze = zzaptVar;
    }

    private void zzb() throws InterruptedException {
        zzaqc zzaqcVar = (zzaqc) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaqcVar.zzt(3);
        try {
            try {
                zzaqcVar.zzm("network-queue-take");
                zzaqcVar.zzw();
                TrafficStats.setThreadStatsTag(zzaqcVar.zzc());
                zzapy zza = this.zzb.zza(zzaqcVar);
                zzaqcVar.zzm("network-http-complete");
                if (zza.zze && zzaqcVar.zzv()) {
                    zzaqcVar.zzp("not-modified");
                    zzaqcVar.zzr();
                } else {
                    zzaqi zzh = zzaqcVar.zzh(zza);
                    zzaqcVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzaqcVar.zzj(), zzh.zzb);
                        zzaqcVar.zzm("network-cache-written");
                    }
                    zzaqcVar.zzq();
                    this.zze.zzb(zzaqcVar, zzh, null);
                    zzaqcVar.zzs(zzh);
                }
            } catch (zzaql e) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqcVar, e);
                zzaqcVar.zzr();
            } catch (Exception e2) {
                zzaqo.zzc(e2, "Unhandled exception %s", e2.toString());
                zzaql zzaqlVar = new zzaql(e2);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzaqcVar, zzaqlVar);
                zzaqcVar.zzr();
            }
            zzaqcVar.zzt(4);
        } catch (Throwable th) {
            zzaqcVar.zzt(4);
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
                zzaqo.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
