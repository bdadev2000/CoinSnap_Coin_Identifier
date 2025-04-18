package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzggo extends zzgfe implements RunnableFuture {
    private volatile zzgfx zza;

    public zzggo(zzgeu zzgeuVar) {
        this.zza = new zzggm(this, zzgeuVar);
    }

    public static zzggo zze(Runnable runnable, Object obj) {
        return new zzggo(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzgfx zzgfxVar = this.zza;
        if (zzgfxVar != null) {
            zzgfxVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final String zza() {
        zzgfx zzgfxVar = this.zza;
        return zzgfxVar != null ? androidx.compose.foundation.text.input.a.A("task=[", zzgfxVar.toString(), "]") : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final void zzb() {
        zzgfx zzgfxVar;
        if (zzt() && (zzgfxVar = this.zza) != null) {
            zzgfxVar.zzh();
        }
        this.zza = null;
    }

    public zzggo(Callable callable) {
        this.zza = new zzggn(this, callable);
    }
}
