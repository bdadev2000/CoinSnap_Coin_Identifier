package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggf implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgeh zzb;

    public zzggf(Executor executor, zzgeh zzgehVar) {
        this.zza = executor;
        this.zzb = zzgehVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e4) {
            this.zzb.zzd(e4);
        }
    }
}
