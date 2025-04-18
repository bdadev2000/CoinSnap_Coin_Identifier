package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzgfn {
    private final boolean zza;
    private final zzgax zzb;

    public /* synthetic */ zzgfn(boolean z2, zzgax zzgaxVar, zzgfm zzgfmVar) {
        this.zza = z2;
        this.zzb = zzgaxVar;
    }

    public final ListenableFuture zza(Callable callable, Executor executor) {
        return new zzgfb(this.zzb, this.zza, executor, callable);
    }
}
