package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfiz {
    final /* synthetic */ zzfjj zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfiz(zzfjj zzfjjVar, Object obj, List list, zzfji zzfjiVar) {
        this.zza = zzfjjVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfjh zza(Callable callable) {
        zzges zzgesVar;
        zzgeg zzb = zzgei.zzb(this.zzc);
        ua.b zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcaj.zzf);
        zzgesVar = this.zza.zzb;
        ua.b zza2 = zzb.zza(callable, zzgesVar);
        return new zzfjh(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
