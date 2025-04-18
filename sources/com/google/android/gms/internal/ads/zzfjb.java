package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzfjb {
    public static final zzfjh zza(Callable callable, Object obj, zzfjj zzfjjVar) {
        zzges zzgesVar;
        zzgesVar = zzfjjVar.zzb;
        return zzb(callable, zzgesVar, obj, zzfjjVar);
    }

    public static final zzfjh zzb(Callable callable, zzges zzgesVar, Object obj, zzfjj zzfjjVar) {
        ua.b bVar;
        bVar = zzfjj.zza;
        return new zzfjh(zzfjjVar, obj, bVar, Collections.emptyList(), zzgesVar.zzb(callable));
    }

    public static final zzfjh zzc(ua.b bVar, Object obj, zzfjj zzfjjVar) {
        ua.b bVar2;
        bVar2 = zzfjj.zza;
        return new zzfjh(zzfjjVar, obj, bVar2, Collections.emptyList(), bVar);
    }

    public static final zzfjh zzd(final zzfiw zzfiwVar, zzges zzgesVar, Object obj, zzfjj zzfjjVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzfja
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfiw.this.zza();
                return null;
            }
        }, zzgesVar, obj, zzfjjVar);
    }
}
