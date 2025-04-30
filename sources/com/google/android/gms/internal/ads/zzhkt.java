package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzhkt extends zzhkl {
    private static final zzhky zza = zzhkq.zza(Collections.emptyMap());

    public /* synthetic */ zzhkt(Map map, zzhkr zzhkrVar) {
        super(map);
    }

    public static zzhks zzc(int i9) {
        return new zzhks(i9, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhkm.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhky) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
