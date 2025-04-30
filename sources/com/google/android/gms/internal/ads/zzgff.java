package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class zzgff extends zzggc {
    private final Executor zza;
    final /* synthetic */ zzgfg zzb;

    public zzgff(zzgfg zzgfgVar, Executor executor) {
        this.zzb = zzgfgVar;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    @Override // com.google.android.gms.internal.ads.zzggc
    public final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zzd(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zzd(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e4) {
            this.zzb.zzd(e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzggc
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
