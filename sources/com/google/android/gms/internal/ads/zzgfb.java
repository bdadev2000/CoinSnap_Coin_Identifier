package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfb extends zzgen {
    private zzgfa zza;

    public zzgfb(zzgas zzgasVar, boolean z2, Executor executor, Callable callable) {
        super(zzgasVar, z2, false);
        this.zza = new zzgez(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzf(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgec
    public final void zzq() {
        zzgfa zzgfaVar = this.zza;
        if (zzgfaVar != null) {
            zzgfaVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzu() {
        zzgfa zzgfaVar = this.zza;
        if (zzgfaVar != null) {
            zzgfaVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final void zzy(int i2) {
        super.zzy(i2);
        if (i2 == 1) {
            this.zza = null;
        }
    }
}
