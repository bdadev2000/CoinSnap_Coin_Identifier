package com.google.android.gms.internal.ads;

import com.applovin.impl.mediation.ads.e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgfh extends zzgdy implements RunnableFuture {
    private volatile zzgeq zza;

    public zzgfh(zzgdo zzgdoVar) {
        this.zza = new zzgff(this, zzgdoVar);
    }

    public static zzgfh zze(Runnable runnable, Object obj) {
        return new zzgfh(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgeq zzgeqVar = this.zza;
        if (zzgeqVar != null) {
            zzgeqVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final String zza() {
        zzgeq zzgeqVar = this.zza;
        if (zzgeqVar != null) {
            return e.f("task=[", zzgeqVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzb() {
        zzgeq zzgeqVar;
        if (zzt() && (zzgeqVar = this.zza) != null) {
            zzgeqVar.zzh();
        }
        this.zza = null;
    }

    public zzgfh(Callable callable) {
        this.zza = new zzgfg(this, callable);
    }
}
