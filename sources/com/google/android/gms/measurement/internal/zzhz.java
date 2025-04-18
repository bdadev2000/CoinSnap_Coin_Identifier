package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhz extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhw<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzhv zzd;

    public zzhz(zzhv zzhvVar, String str, BlockingQueue<zzhw<?>> blockingQueue) {
        this.zzd = zzhvVar;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.zza = new Object();
        this.zzb = blockingQueue;
        setName(str);
    }

    private final void zza(InterruptedException interruptedException) {
        this.zzd.zzj().zzu().zza(getName() + " was interrupted", interruptedException);
    }

    private final void zzb() {
        Object obj;
        Semaphore semaphore;
        Object obj2;
        zzhz zzhzVar;
        zzhz zzhzVar2;
        obj = this.zzd.zzh;
        synchronized (obj) {
            if (!this.zzc) {
                semaphore = this.zzd.zzi;
                semaphore.release();
                obj2 = this.zzd.zzh;
                obj2.notifyAll();
                zzhzVar = this.zzd.zzb;
                if (this != zzhzVar) {
                    zzhzVar2 = this.zzd.zzc;
                    if (this == zzhzVar2) {
                        this.zzd.zzc = null;
                    } else {
                        this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                    }
                } else {
                    this.zzd.zzb = null;
                }
                this.zzc = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i10;
        Object obj;
        boolean z10;
        boolean z11 = false;
        while (!z11) {
            try {
                semaphore = this.zzd.zzi;
                semaphore.acquire();
                z11 = true;
            } catch (InterruptedException e2) {
                zza(e2);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhw<?> poll = this.zzb.poll();
                if (poll != null) {
                    if (poll.zza) {
                        i10 = threadPriority;
                    } else {
                        i10 = 10;
                    }
                    Process.setThreadPriority(i10);
                    poll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null) {
                            z10 = this.zzd.zzj;
                            if (!z10) {
                                try {
                                    this.zza.wait(30000L);
                                } catch (InterruptedException e10) {
                                    zza(e10);
                                }
                            }
                        }
                    }
                    obj = this.zzd.zzh;
                    synchronized (obj) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            return;
                        }
                    }
                }
            }
        } finally {
            zzb();
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }
}
