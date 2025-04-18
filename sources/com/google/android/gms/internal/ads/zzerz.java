package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzerz implements zzexh {
    private final zzgfz zza;

    public zzerz(zzgfz zzgfzVar) {
        this.zza = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesa(Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zza()).longValue());
            }
        });
    }
}
