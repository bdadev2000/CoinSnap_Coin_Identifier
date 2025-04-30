package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import x.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzw {
    private String zza;
    private boolean zzb;
    private zzfn.zzm zzc;
    private BitSet zzd;
    private BitSet zze;
    private Map<Integer, Long> zzf;
    private Map<Integer, List<Long>> zzg;
    private final /* synthetic */ zzu zzh;

    public static /* bridge */ /* synthetic */ BitSet zza(zzw zzwVar) {
        return zzwVar.zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.measurement.zzjk$zzb, com.google.android.gms.internal.measurement.zzfn$zzd$zza] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.google.android.gms.internal.measurement.zzfn$zzm$zza] */
    @NonNull
    public final zzfn.zzd zza(int i9) {
        ArrayList arrayList;
        ?? arrayList2;
        ?? zzb = zzfn.zzd.zzb();
        zzb.zza(i9);
        zzb.zza(this.zzb);
        zzfn.zzm zzmVar = this.zzc;
        if (zzmVar != null) {
            zzb.zza(zzmVar);
        }
        ?? zzd = zzfn.zzm.zze().zzb(zznl.zza(this.zzd)).zzd(zznl.zza(this.zze));
        if (this.zzf == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.zzf.size());
            for (Integer num : this.zzf.keySet()) {
                int intValue = num.intValue();
                Long l = this.zzf.get(num);
                if (l != null) {
                    arrayList.add((zzfn.zze) ((com.google.android.gms.internal.measurement.zzjk) zzfn.zze.zzc().zza(intValue).zza(l.longValue()).zzai()));
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
            for (Integer num2 : this.zzg.keySet()) {
                zzfn.zzn.zza zza = zzfn.zzn.zzc().zza(num2.intValue());
                List<Long> list = this.zzg.get(num2);
                if (list != null) {
                    Collections.sort(list);
                    zza.zza(list);
                }
                arrayList2.add((zzfn.zzn) ((com.google.android.gms.internal.measurement.zzjk) zza.zzai()));
            }
        }
        zzd.zzc(arrayList2);
        zzb.zza(zzd);
        return (zzfn.zzd) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzai());
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [x.l, java.util.Map<java.lang.Integer, java.lang.Long>] */
    /* JADX WARN: Type inference failed for: r1v5, types: [x.l, java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>] */
    private zzw(zzu zzuVar, String str) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzb = true;
        this.zzd = new BitSet();
        this.zze = new BitSet();
        this.zzf = new l();
        this.zzg = new l();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [x.l, java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>>] */
    private zzw(zzu zzuVar, String str, zzfn.zzm zzmVar, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.zzh = zzuVar;
        this.zza = str;
        this.zzd = bitSet;
        this.zze = bitSet2;
        this.zzf = map;
        this.zzg = new l();
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

    public final void zza(@NonNull zzz zzzVar) {
        int zza = zzzVar.zza();
        Boolean bool = zzzVar.zzc;
        if (bool != null) {
            this.zze.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzzVar.zzd;
        if (bool2 != null) {
            this.zzd.set(zza, bool2.booleanValue());
        }
        if (zzzVar.zze != null) {
            Long l = this.zzf.get(Integer.valueOf(zza));
            long longValue = zzzVar.zze.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.zzf.put(Integer.valueOf(zza), Long.valueOf(longValue));
            }
        }
        if (zzzVar.zzf != null) {
            List<Long> list = this.zzg.get(Integer.valueOf(zza));
            if (list == null) {
                list = new ArrayList<>();
                this.zzg.put(Integer.valueOf(zza), list);
            }
            if (zzzVar.zzc()) {
                list.clear();
            }
            if (zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbk) && zzzVar.zzb()) {
                list.clear();
            }
            if (zzoc.zza() && this.zzh.zze().zzf(this.zza, zzbf.zzbk)) {
                long longValue2 = zzzVar.zzf.longValue() / 1000;
                if (list.contains(Long.valueOf(longValue2))) {
                    return;
                }
                list.add(Long.valueOf(longValue2));
                return;
            }
            list.add(Long.valueOf(zzzVar.zzf.longValue() / 1000));
        }
    }
}
