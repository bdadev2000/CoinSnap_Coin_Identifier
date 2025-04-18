package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzget implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgcy zzb;

    public zzget(Executor executor, zzgcy zzgcyVar) {
        this.zza = executor;
        this.zzb = zzgcyVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzd(e2);
        }
    }
}
