package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzkp implements zzkm {
    @Override // com.google.android.gms.internal.measurement.zzkm
    public final int zza(int i9, Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        if (zzknVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzknVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzb(Object obj) {
        return zzkn.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zzc(Object obj) {
        ((zzkn) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Map<?, ?> zzd(Object obj) {
        return (zzkn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Map<?, ?> zze(Object obj) {
        return (zzkn) obj;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final boolean zzf(Object obj) {
        if (!((zzkn) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final zzkk<?, ?> zza(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    public final Object zza(Object obj, Object obj2) {
        zzkn zzknVar = (zzkn) obj;
        zzkn zzknVar2 = (zzkn) obj2;
        if (!zzknVar2.isEmpty()) {
            if (!zzknVar.zzd()) {
                zzknVar = zzknVar.zzb();
            }
            zzknVar.zza(zzknVar2);
        }
        return zzknVar;
    }
}
