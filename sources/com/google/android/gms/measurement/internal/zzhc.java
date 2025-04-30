package com.google.android.gms.measurement.internal;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class zzhc extends zzii {
    private static final AtomicLong zza = new AtomicLong(Long.MIN_VALUE);

    @Nullable
    private zzhg zzb;

    @Nullable
    private zzhg zzc;
    private final PriorityBlockingQueue<zzhh<?>> zzd;
    private final BlockingQueue<zzhh<?>> zze;
    private final Thread.UncaughtExceptionHandler zzf;
    private final Thread.UncaughtExceptionHandler zzg;
    private final Object zzh;
    private final Semaphore zzi;
    private volatile boolean zzj;

    public zzhc(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzh = new Object();
        this.zzi = new Semaphore(2);
        this.zzd = new PriorityBlockingQueue<>();
        this.zze = new LinkedBlockingQueue();
        this.zzf = new zzhe(this, "Thread death: Uncaught exception on worker thread");
        this.zzg = new zzhe(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    public final boolean zzg() {
        if (Thread.currentThread() == this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzii
    public final boolean zzo() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzr() {
        if (Thread.currentThread() == this.zzc) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final void zzt() {
        if (Thread.currentThread() == this.zzb) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final void zzc(Runnable runnable) throws IllegalStateException {
        zzac();
        Preconditions.checkNotNull(runnable);
        zza(new zzhh<>(this, runnable, true, "Task exception on worker thread"));
    }

    @Nullable
    public final <T> T zza(AtomicReference<T> atomicReference, long j7, String str, Runnable runnable) {
        synchronized (atomicReference) {
            zzl().zzb(runnable);
            try {
                atomicReference.wait(j7);
            } catch (InterruptedException unused) {
                zzj().zzu().zza("Interrupted waiting for " + str);
                return null;
            }
        }
        T t9 = atomicReference.get();
        if (t9 == null) {
            zzj().zzu().zza("Timed out waiting for " + str);
        }
        return t9;
    }

    public final <V> Future<V> zzb(Callable<V> callable) throws IllegalStateException {
        zzac();
        Preconditions.checkNotNull(callable);
        zzhh<?> zzhhVar = new zzhh<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            zzhhVar.run();
        } else {
            zza(zzhhVar);
        }
        return zzhhVar;
    }

    public final void zzb(Runnable runnable) throws IllegalStateException {
        zzac();
        Preconditions.checkNotNull(runnable);
        zza(new zzhh<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <V> Future<V> zza(Callable<V> callable) throws IllegalStateException {
        zzac();
        Preconditions.checkNotNull(callable);
        zzhh<?> zzhhVar = new zzhh<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.zzb) {
            if (!this.zzd.isEmpty()) {
                zzj().zzu().zza("Callable skipped the worker queue.");
            }
            zzhhVar.run();
        } else {
            zza(zzhhVar);
        }
        return zzhhVar;
    }

    private final void zza(zzhh<?> zzhhVar) {
        synchronized (this.zzh) {
            try {
                this.zzd.add(zzhhVar);
                zzhg zzhgVar = this.zzb;
                if (zzhgVar == null) {
                    zzhg zzhgVar2 = new zzhg(this, "Measurement Worker", this.zzd);
                    this.zzb = zzhgVar2;
                    zzhgVar2.setUncaughtExceptionHandler(this.zzf);
                    this.zzb.start();
                } else {
                    zzhgVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zza(Runnable runnable) throws IllegalStateException {
        zzac();
        Preconditions.checkNotNull(runnable);
        zzhh<?> zzhhVar = new zzhh<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.zzh) {
            try {
                this.zze.add(zzhhVar);
                zzhg zzhgVar = this.zzc;
                if (zzhgVar == null) {
                    zzhg zzhgVar2 = new zzhg(this, "Measurement Network", this.zze);
                    this.zzc = zzhgVar2;
                    zzhgVar2.setUncaughtExceptionHandler(this.zzg);
                    this.zzc.start();
                } else {
                    zzhgVar.zza();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
