package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhh<V> extends FutureTask<V> implements Comparable<zzhh<V>> {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzhc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhh(zzhc zzhcVar, Runnable runnable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.zzcy.zza().zza(runnable), null);
        AtomicLong atomicLong;
        this.zzd = zzhcVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhc.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z8;
        if (andIncrement == Long.MAX_VALUE) {
            zzhcVar.zzj().zzg().zza("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(@NonNull Object obj) {
        zzhh zzhhVar = (zzhh) obj;
        boolean z8 = this.zza;
        if (z8 != zzhhVar.zza) {
            if (!z8) {
                return 1;
            }
            return -1;
        }
        long j7 = this.zzb;
        long j9 = zzhhVar.zzb;
        if (j7 < j9) {
            return -1;
        }
        if (j7 > j9) {
            return 1;
        }
        this.zzd.zzj().zzm().zza("Two tasks share the same index. index", Long.valueOf(this.zzb));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzd.zzj().zzg().zza(this.zzc, th);
        if ((th instanceof zzhf) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhh(zzhc zzhcVar, Callable<V> callable, boolean z8, String str) {
        super(com.google.android.gms.internal.measurement.zzcy.zza().zza(callable));
        AtomicLong atomicLong;
        this.zzd = zzhcVar;
        Preconditions.checkNotNull(str);
        atomicLong = zzhc.zza;
        long andIncrement = atomicLong.getAndIncrement();
        this.zzb = andIncrement;
        this.zzc = str;
        this.zza = z8;
        if (andIncrement == Long.MAX_VALUE) {
            zzhcVar.zzj().zzg().zza("Tasks index overflow");
        }
    }
}
