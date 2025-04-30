package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfg extends zzges {
    private zzgff zza;

    public zzgfg(zzgax zzgaxVar, boolean z8, Executor executor, Callable callable) {
        super(zzgaxVar, z8, false);
        this.zza = new zzgfe(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzf(int i9, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgeh
    public final void zzq() {
        zzgff zzgffVar = this.zza;
        if (zzgffVar != null) {
            zzgffVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzu() {
        zzgff zzgffVar = this.zza;
        if (zzgffVar != null) {
            zzgffVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzges
    public final void zzy(int i9) {
        super.zzy(i9);
        if (i9 == 1) {
            this.zza = null;
        }
    }
}
