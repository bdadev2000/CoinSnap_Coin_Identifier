package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final /* synthetic */ class zzan {
    public static zzaq zza(zzak zzakVar, zzaq zzaqVar, zzh zzhVar, List<zzaq> list) {
        if (zzakVar.zzc(zzaqVar.zzf())) {
            zzaq zza = zzakVar.zza(zzaqVar.zzf());
            if (zza instanceof zzal) {
                return ((zzal) zza).zza(zzhVar, list);
            }
            throw new IllegalArgumentException(o.j(zzaqVar.zzf(), " is not a function"));
        }
        if ("hasOwnProperty".equals(zzaqVar.zzf())) {
            zzg.zza("hasOwnProperty", 1, list);
            if (zzakVar.zzc(zzhVar.zza(list.get(0)).zzf())) {
                return zzaq.zzh;
            }
            return zzaq.zzi;
        }
        throw new IllegalArgumentException(AbstractC2914a.d("Object has no function ", zzaqVar.zzf()));
    }

    public static Iterator<zzaq> zza(Map<String, zzaq> map) {
        return new zzam(map.keySet().iterator());
    }
}
