package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzgeg {
    private final boolean zza;
    private final zzfzo zzb;

    public /* synthetic */ zzgeg(boolean z10, zzfzo zzfzoVar, zzgeh zzgehVar) {
        this.zza = z10;
        this.zzb = zzfzoVar;
    }

    public final ua.b zza(Callable callable, Executor executor) {
        return new zzgdv(this.zzb, this.zza, executor, callable);
    }
}
