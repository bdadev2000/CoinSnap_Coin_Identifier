package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzgfs {
    private final boolean zza;
    private final zzgbc zzb;

    public /* synthetic */ zzgfs(boolean z8, zzgbc zzgbcVar, zzgfr zzgfrVar) {
        this.zza = z8;
        this.zzb = zzgbcVar;
    }

    public final f4.c zza(Callable callable, Executor executor) {
        return new zzgfg(this.zzb, this.zza, executor, callable);
    }
}
