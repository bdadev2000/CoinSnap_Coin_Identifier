package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzfkq {
    public static final zzfkx zza(Callable callable, Object obj, zzfky zzfkyVar) {
        zzgfz zzgfzVar;
        zzgfzVar = zzfkyVar.zzb;
        return zzb(callable, zzgfzVar, obj, zzfkyVar);
    }

    public static final zzfkx zzb(Callable callable, zzgfz zzgfzVar, Object obj, zzfky zzfkyVar) {
        ListenableFuture listenableFuture;
        listenableFuture = zzfky.zza;
        return new zzfkx(zzfkyVar, obj, listenableFuture, Collections.emptyList(), zzgfzVar.zzb(callable));
    }

    public static final zzfkx zzc(ListenableFuture listenableFuture, Object obj, zzfky zzfkyVar) {
        ListenableFuture listenableFuture2;
        listenableFuture2 = zzfky.zza;
        return new zzfkx(zzfkyVar, obj, listenableFuture2, Collections.emptyList(), listenableFuture);
    }

    public static final zzfkx zzd(final zzfkk zzfkkVar, zzgfz zzgfzVar, Object obj, zzfky zzfkyVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfkp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfkk.this.zza();
                return null;
            }
        }, zzgfzVar, obj, zzfkyVar);
    }
}
