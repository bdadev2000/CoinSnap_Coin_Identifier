package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzesv implements zzevz {
    private final zzges zza;

    public zzesv(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesw(com.google.android.gms.ads.internal.zzv.zzt().zzb(), com.google.android.gms.ads.internal.zzv.zzt().zzm());
            }
        });
    }
}
