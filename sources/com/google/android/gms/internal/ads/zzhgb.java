package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzhgb extends zzhft {
    static {
        zzhfy.zza(Collections.emptyMap());
    }

    public /* synthetic */ zzhgb(Map map, zzhfz zzhfzVar) {
        super(map);
    }

    public static zzhga zzc(int i10) {
        return new zzhga(i10, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhfu.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhgg) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
