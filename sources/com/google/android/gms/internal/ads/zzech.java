package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzech {
    private final zzecd zza;
    private final zzges zzb;

    public zzech(zzecd zzecdVar, zzges zzgesVar) {
        this.zza = zzecdVar;
        this.zzb = zzgesVar;
    }

    public final void zza(zzfiv zzfivVar) {
        final zzecd zzecdVar = this.zza;
        Objects.requireNonNull(zzecdVar);
        zzgei.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzecd.this.getWritableDatabase();
            }
        }), new zzecg(this, zzfivVar), this.zzb);
    }
}
