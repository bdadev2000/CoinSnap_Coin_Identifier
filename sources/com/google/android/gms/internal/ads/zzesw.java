package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzesw implements zzexw {
    private final zzgge zza;

    public zzesw(zzgge zzggeVar) {
        this.zza = zzggeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 55;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesx(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis() - com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zza());
            }
        });
    }
}
