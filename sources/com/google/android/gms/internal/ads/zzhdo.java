package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdo {
    private static final zzhdo zza = new zzhdo();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzhea zzb = new zzhcw();

    private zzhdo() {
    }

    public static zzhdo zza() {
        return zza;
    }

    public final zzhdz zzb(Class cls) {
        zzhcb.zzc(cls, "messageType");
        zzhdz zzhdzVar = (zzhdz) this.zzc.get(cls);
        if (zzhdzVar == null) {
            zzhdzVar = this.zzb.zza(cls);
            zzhcb.zzc(cls, "messageType");
            zzhdz zzhdzVar2 = (zzhdz) this.zzc.putIfAbsent(cls, zzhdzVar);
            if (zzhdzVar2 != null) {
                return zzhdzVar2;
            }
        }
        return zzhdzVar;
    }
}
