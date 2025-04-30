package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggt extends zzgfj implements RunnableFuture {
    private volatile zzggc zza;

    public zzggt(zzgez zzgezVar) {
        this.zza = new zzggr(this, zzgezVar);
    }

    public static zzggt zze(Runnable runnable, Object obj) {
        return new zzggt(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzggc zzggcVar = this.zza;
        if (zzggcVar != null) {
            zzggcVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final String zza() {
        zzggc zzggcVar = this.zza;
        if (zzggcVar != null) {
            return AbstractC2914a.e("task=[", zzggcVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzb() {
        zzggc zzggcVar;
        if (zzt() && (zzggcVar = this.zza) != null) {
            zzggcVar.zzh();
        }
        this.zza = null;
    }

    public zzggt(Callable callable) {
        this.zza = new zzggs(this, callable);
    }
}
