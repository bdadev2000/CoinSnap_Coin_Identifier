package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhe implements Thread.UncaughtExceptionHandler {
    private final String zza;
    private final /* synthetic */ zzhc zzb;

    public zzhe(zzhc zzhcVar, String str) {
        this.zzb = zzhcVar;
        Preconditions.checkNotNull(str);
        this.zza = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.zzb.zzj().zzg().zza(this.zza, th);
    }
}
