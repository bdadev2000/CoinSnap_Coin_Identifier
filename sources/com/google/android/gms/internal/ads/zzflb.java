package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzflb {
    final /* synthetic */ zzfll zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzflb(zzfll zzfllVar, Object obj, List list, zzfla zzflaVar) {
        this.zza = zzfllVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzflk zza(Callable callable) {
        zzgge zzggeVar;
        zzgfs zzb = zzgft.zzb(this.zzc);
        f4.c zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcci.zzf);
        zzggeVar = this.zza.zzb;
        f4.c zza2 = zzb.zza(callable, zzggeVar);
        return new zzflk(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
