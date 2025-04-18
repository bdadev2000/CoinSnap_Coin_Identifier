package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgga implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzgec zzb;

    public zzgga(Executor executor, zzgec zzgecVar) {
        this.zza = executor;
        this.zzb = zzgecVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zzd(e);
        }
    }
}
