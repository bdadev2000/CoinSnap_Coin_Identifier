package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class zzgdu extends zzgeq {
    private final Executor zza;
    final /* synthetic */ zzgdv zzb;

    public zzgdu(zzgdv zzgdvVar, Executor executor) {
        this.zzb = zzgdvVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zzd(Throwable th2) {
        this.zzb.zza = null;
        if (th2 instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th2).getCause());
        } else if (th2 instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e2) {
            this.zzb.zzd(e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
