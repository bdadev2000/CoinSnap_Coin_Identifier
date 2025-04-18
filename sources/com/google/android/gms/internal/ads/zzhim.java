package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzhim extends zzhie {
    static {
        zzhij.zza(Collections.emptyMap());
    }

    public /* synthetic */ zzhim(Map map, zzhik zzhikVar) {
        super(map);
    }

    public static zzhil zzc(int i2) {
        return new zzhil(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap zzb = zzhif.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            zzb.put(entry.getKey(), ((zzhir) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(zzb);
    }
}
