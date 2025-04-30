package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhg extends Thread {
    private final Object zza;
    private final BlockingQueue<zzhh<?>> zzb;
    private boolean zzc = false;
    private final /* synthetic */ zzhc zzd;

    public zzhg(zzhc zzhcVar, String str, BlockingQueue<zzhh<?>> blockingQueue) {
        this.zzd = zzhcVar;
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
        zzhg zzhgVar;
        zzhg zzhgVar2;
        obj = this.zzd.zzh;
        synchronized (obj) {
            try {
                if (!this.zzc) {
                    semaphore = this.zzd.zzi;
                    semaphore.release();
                    obj2 = this.zzd.zzh;
                    obj2.notifyAll();
                    zzhgVar = this.zzd.zzb;
                    if (this != zzhgVar) {
                        zzhgVar2 = this.zzd.zzc;
                        if (this == zzhgVar2) {
                            this.zzd.zzc = null;
                        } else {
                            this.zzd.zzj().zzg().zza("Current scheduler thread is neither worker nor network");
                        }
                    } else {
                        this.zzd.zzb = null;
                    }
                    this.zzc = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Semaphore semaphore;
        int i9;
        Object obj;
        boolean z8;
        boolean z9 = false;
        while (!z9) {
            try {
                semaphore = this.zzd.zzi;
                semaphore.acquire();
                z9 = true;
            } catch (InterruptedException e4) {
                zza(e4);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                zzhh<?> poll = this.zzb.poll();
                if (poll != null) {
                    if (poll.zza) {
                        i9 = threadPriority;
                    } else {
                        i9 = 10;
                    }
                    Process.setThreadPriority(i9);
                    poll.run();
                } else {
                    synchronized (this.zza) {
                        if (this.zzb.peek() == null) {
                            z8 = this.zzd.zzj;
                            if (!z8) {
                                try {
                                    this.zza.wait(30000L);
                                } catch (InterruptedException e9) {
                                    zza(e9);
                                }
                            }
                        }
                    }
                    obj = this.zzd.zzh;
                    synchronized (obj) {
                        if (this.zzb.peek() == null) {
                            zzb();
                            zzb();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            zzb();
            throw th;
        }
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.notifyAll();
        }
    }
}
