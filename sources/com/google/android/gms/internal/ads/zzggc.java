package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzggc extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzggb(null);
    private static final Runnable zzb = new zzggb(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgfz zzgfzVar = null;
        boolean z8 = false;
        int i9 = 0;
        while (true) {
            if (!(runnable instanceof zzgfz)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgfzVar = (zzgfz) runnable;
            }
            i9++;
            if (i9 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (Thread.interrupted() || z8) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    LockSupport.park(zzgfzVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z8) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z8 = !zzg();
            if (z8) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    try {
                        zzggl.zza(th);
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zzd(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, zza)) {
                            zzc(currentThread);
                        }
                        zze(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (z8) {
                zze(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzgfz) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = AbstractC2914a.e("running=[RUNNING ON ", ((Thread) runnable).getName(), "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return o.k(str, ", ", zzb());
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgfz zzgfzVar = new zzgfz(this, null);
            zzgfzVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzgfzVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
