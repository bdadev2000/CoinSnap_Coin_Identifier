package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzfld {
    public static final zzflk zza(Callable callable, Object obj, zzfll zzfllVar) {
        zzgge zzggeVar;
        zzggeVar = zzfllVar.zzb;
        return zzb(callable, zzggeVar, obj, zzfllVar);
    }

    public static final zzflk zzb(Callable callable, zzgge zzggeVar, Object obj, zzfll zzfllVar) {
        f4.c cVar;
        cVar = zzfll.zza;
        return new zzflk(zzfllVar, obj, cVar, Collections.emptyList(), zzggeVar.zzb(callable));
    }

    public static final zzflk zzc(f4.c cVar, Object obj, zzfll zzfllVar) {
        f4.c cVar2;
        cVar2 = zzfll.zza;
        return new zzflk(zzfllVar, obj, cVar2, Collections.emptyList(), cVar);
    }

    public static final zzflk zzd(final zzfkx zzfkxVar, zzgge zzggeVar, Object obj, zzfll zzfllVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzflc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfkx.this.zza();
                return null;
            }
        }, zzggeVar, obj, zzfllVar);
    }
}
