package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeym implements zzevz {
    final zzges zza;
    final List zzb;

    public zzeym(zzbbw zzbbwVar, zzges zzgesVar, List list) {
        this.zza = zzgesVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyn(zzeym.this.zzb);
            }
        });
    }
}
