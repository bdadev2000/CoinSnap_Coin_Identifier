package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes3.dex */
public final class zzapj extends Thread {
    private final BlockingQueue zza;
    private final zzapi zzb;
    private final zzaoz zzc;
    private volatile boolean zzd = false;
    private final zzapg zze;

    public zzapj(BlockingQueue blockingQueue, zzapi zzapiVar, zzaoz zzaozVar, zzapg zzapgVar) {
        this.zza = blockingQueue;
        this.zzb = zzapiVar;
        this.zzc = zzaozVar;
        this.zze = zzapgVar;
    }

    private void zzb() throws InterruptedException {
        zzapp zzappVar = (zzapp) this.zza.take();
        SystemClock.elapsedRealtime();
        zzappVar.zzt(3);
        try {
            try {
                zzappVar.zzm("network-queue-take");
                zzappVar.zzw();
                TrafficStats.setThreadStatsTag(zzappVar.zzc());
                zzapl zza = this.zzb.zza(zzappVar);
                zzappVar.zzm("network-http-complete");
                if (zza.zze && zzappVar.zzv()) {
                    zzappVar.zzp("not-modified");
                    zzappVar.zzr();
                } else {
                    zzapv zzh = zzappVar.zzh(zza);
                    zzappVar.zzm("network-parse-complete");
                    if (zzh.zzb != null) {
                        this.zzc.zzd(zzappVar.zzj(), zzh.zzb);
                        zzappVar.zzm("network-cache-written");
                    }
                    zzappVar.zzq();
                    this.zze.zzb(zzappVar, zzh, null);
                    zzappVar.zzs(zzh);
                }
            } catch (zzapy e2) {
                SystemClock.elapsedRealtime();
                this.zze.zza(zzappVar, e2);
                zzappVar.zzr();
            } catch (Exception e10) {
                zzaqb.zzc(e10, "Unhandled exception %s", e10.toString());
                zzapy zzapyVar = new zzapy(e10);
                SystemClock.elapsedRealtime();
                this.zze.zza(zzappVar, zzapyVar);
                zzappVar.zzr();
            }
        } finally {
            zzappVar.zzt(4);
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
                zzaqb.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
