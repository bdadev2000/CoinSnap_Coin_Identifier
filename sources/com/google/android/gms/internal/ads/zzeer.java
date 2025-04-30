package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzeer {
    private final zzeen zza;
    private final zzgge zzb;

    public zzeer(zzeen zzeenVar, zzgge zzggeVar) {
        this.zza = zzeenVar;
        this.zzb = zzggeVar;
    }

    public final void zza(zzfkw zzfkwVar) {
        final zzeen zzeenVar = this.zza;
        Objects.requireNonNull(zzeenVar);
        zzgft.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeep
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeen.this.getWritableDatabase();
            }
        }), new zzeeq(this, zzfkwVar), this.zzb);
    }
}
