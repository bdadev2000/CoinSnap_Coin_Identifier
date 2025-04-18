package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzeqr implements zzevz {
    private final zzges zza;

    public zzeqr(zzges zzgesVar) {
        this.zza = zzgesVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzeqq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeqs(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zza()).longValue());
            }
        });
    }
}
