package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhas {
    public static final /* synthetic */ int zza = 0;
    private static final zzhas zzb = new zzhas();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzhbc zzc = new zzhaa();

    private zzhas() {
    }

    public static zzhas zza() {
        return zzb;
    }

    public final zzhbb zzb(Class cls) {
        zzgzk.zzc(cls, "messageType");
        zzhbb zzhbbVar = (zzhbb) this.zzd.get(cls);
        if (zzhbbVar == null) {
            zzhbbVar = this.zzc.zza(cls);
            zzgzk.zzc(cls, "messageType");
            zzhbb zzhbbVar2 = (zzhbb) this.zzd.putIfAbsent(cls, zzhbbVar);
            if (zzhbbVar2 != null) {
                return zzhbbVar2;
            }
        }
        return zzhbbVar;
    }
}
