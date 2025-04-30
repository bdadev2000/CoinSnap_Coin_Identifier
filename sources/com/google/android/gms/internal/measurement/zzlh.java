package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlh {
    private static final zzlh zza = new zzlh();
    private final ConcurrentMap<Class<?>, zzll<?>> zzc = new ConcurrentHashMap();
    private final zzlk zzb = new zzkh();

    private zzlh() {
    }

    public static zzlh zza() {
        return zza;
    }

    public final <T> zzll<T> zza(Class<T> cls) {
        zzjm.zza(cls, "messageType");
        zzll<T> zzllVar = (zzll) this.zzc.get(cls);
        if (zzllVar != null) {
            return zzllVar;
        }
        zzll<T> zza2 = this.zzb.zza(cls);
        zzjm.zza(cls, "messageType");
        zzjm.zza(zza2, "schema");
        zzll<T> zzllVar2 = (zzll) this.zzc.putIfAbsent(cls, zza2);
        return zzllVar2 != null ? zzllVar2 : zza2;
    }

    public final <T> zzll<T> zza(T t9) {
        return zza((Class) t9.getClass());
    }
}
