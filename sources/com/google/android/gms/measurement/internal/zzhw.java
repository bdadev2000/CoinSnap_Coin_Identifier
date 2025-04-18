package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhw<V> extends FutureTask<V> implements Comparable<zzhw<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzhv zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzhv zzhvVar, Runnable runnable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.zzdg.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.zzd = zzhvVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhv.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzhvVar.zzj().zzg().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        zzhw zzhwVar = (zzhw) obj;
        boolean z10 = this.zza;
        if (z10 != zzhwVar.zza) {
            if (!z10) {
                return 1;
            }
            return -1;
        }
        long j3 = this.zzb;
        long j10 = zzhwVar.zzb;
        if (j3 < j10) {
            return -1;
        }
        if (j3 > j10) {
            return 1;
        }
        this.zzd.zzj().zzn().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzd.zzj().zzg().zza(this.zzc, th2);
        if ((th2 instanceof zzhu) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhw(zzhv zzhvVar, Callable<V> callable, boolean z10, String str) {
        super(com.google.android.gms.internal.measurement.zzdg.zza().zza(callable));
        AtomicLong atomicLong;
        this.zzd = zzhvVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhv.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z10;
        if (andIncrement == Long.MAX_VALUE) {
            zzhvVar.zzj().zzg().zza("Tasks index overflow");
        }
    }
}
