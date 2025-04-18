package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfy;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzv {
    private String zza;
    private boolean zzb;
    private zzfy.zzm zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzt zzh;

    public static /* bridge */ /* synthetic */ BitSet zza(zzv zzvVar) {
        return zzvVar.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzjt$zzb, com.google.android.gms.internal.measurement.zzfy$zzd$zza] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.google.android.gms.internal.measurement.zzfy$zzm$zza] */
    @NonNull
    public final zzfy.zzd zza(int i10) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfy.zzd.zzb();
        zzb.zza(i10);
        zzb.zza(this.zzb);
        zzfy.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzb.zza(zzmVar);
        }
        ?? zzd = zzfy.zzm.zze().zzb(zzoo.zza(this.zzd)).zzd(zzoo.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            Iterator<Integer> it = this.zzf.keySet().iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                Long l10 = this.zzf.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    arrayList.add((zzfy.zze) ((com.google.android.gms.internal.measurement.zzjt) zzfy.zze.zzc().zza(intValue).zza(l10.longValue()).zzai()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.zzg == null) {
            arrayList2 = Collections.emptyList();
        } else {
            arrayList2 = new ArrayList(this.zzg.size());
            for (Integer num : this.zzg.keySet()) {
                zzfy.zzn.zza zza = zzfy.zzn.zzc().zza(num.intValue());
                List<Long> list = this.zzg.get(num);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfy.zzn) ((com.google.android.gms.internal.measurement.zzjt) zza.zzai()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfy.zzd) ((com.google.android.gms.internal.measurement.zzjt) zzb.zzai());
    }

    private zzv(zzt zztVar, String str) {
        this.zzh = zztVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new b();
        this.zzg = new b();
    }

    private zzv(zzt zztVar, String str, zzfy.zzm zzmVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zztVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new b();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(num));
                this.zzg.put(num, arrayList);
            }
        }
        this.zzb = false;
        this.zzc = zzmVar;
    }

    public final void zza(@NonNull zzaa zzaaVar) {
        int zza = zzaaVar.zza();
        Boolean bool = zzaaVar.zzc;
        if (bool != null) {
            this.zze.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzaaVar.zzd;
        if (bool2 != null) {
            this.zzd.set(zza, bool2.booleanValue());
        }
        if (zzaaVar.zze != null) {
            Long l10 = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzaaVar.zze.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzaaVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzaaVar.zzc()) {
                list.clear();
            }
            if (com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp) && zzaaVar.zzb()) {
                list.clear();
            }
            if (com.google.android.gms.internal.measurement.zzoe.zza() && this.zzh.zze().zzf(this.zza, zzbh.zzbp)) {
                long longValue2 = zzaaVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzaaVar.zzf.longValue() / 1000));
        }
    }
}
