package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzetx implements zzexh {
    private final zzgfz zza;

    public zzetx(zzgfz zzgfzVar) {
        this.zza = zzgfzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final int zza() {
        return 20;
    }

    @Override // com.google.android.gms.internal.ads.zzexh
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzetw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzety(com.google.android.gms.ads.internal.zzu.zzs().zzb(), com.google.android.gms.ads.internal.zzu.zzs().zzm());
            }
        });
    }
}
