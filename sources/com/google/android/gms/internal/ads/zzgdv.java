package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgdv extends zzgdi {
    private zzgdu zza;

    public zzgdv(zzfzj zzfzjVar, boolean z10, Executor executor, Callable callable) {
        super(zzfzjVar, z10, false);
        this.zza = new zzgdt(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzf(int i10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgcy
    public final void zzq() {
        zzgdu zzgduVar = this.zza;
        if (zzgduVar != null) {
            zzgduVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzu() {
        zzgdu zzgduVar = this.zza;
        if (zzgduVar != null) {
            zzgduVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdi
    public final void zzy(int i10) {
        super.zzy(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
