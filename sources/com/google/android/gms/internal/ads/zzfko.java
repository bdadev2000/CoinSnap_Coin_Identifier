package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzfko {
    final /* synthetic */ zzfky zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfko(zzfky zzfkyVar, Object obj, List list, zzfkn zzfknVar) {
        this.zza = zzfkyVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfkx zza(Callable callable) {
        zzgfz zzgfzVar;
        zzgfn zzb = zzgfo.zzb(this.zzc);
        ListenableFuture zza = zzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcan.zzf);
        zzgfzVar = this.zza.zzb;
        ListenableFuture zza2 = zzb.zza(callable, zzgfzVar);
        return new zzfkx(this.zza, this.zzb, zza, this.zzc, zza2);
    }
}
