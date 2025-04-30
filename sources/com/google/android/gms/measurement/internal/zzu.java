package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzoc;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzu extends zzmx {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzw> zzc;
    private Long zzd;
    private Long zze;

    public zzu(zznc zzncVar) {
        super(zzncVar);
    }

    private final zzw zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzw zzwVar = new zzw(this, this.zza);
        this.zzc.put(num, zzwVar);
        return zzwVar;
    }

    @NonNull
    private final List<zzfn.zzd> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        for (Integer num : keySet) {
            int intValue = num.intValue();
            zzw zzwVar = this.zzc.get(num);
            Preconditions.checkNotNull(zzwVar);
            zzfn.zzd zza = zzwVar.zza(intValue);
            arrayList.add(zza);
            zzal zzh = zzh();
            String str = this.zza;
            zzfn.zzm zzd = zza.zzd();
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzbz = zzd.zzbz();
            ContentValues contentValues = new ContentValues();
            contentValues.put(MBridgeConstans.APP_ID, str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", zzbz);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzfw.zza(str));
                }
            } catch (SQLiteException e4) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzfw.zza(str), e4);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zzmx
    public final boolean zzc() {
        return false;
    }

    public final List<zzfn.zzd> zza(String str, List<zzfn.zzf> list, List<zzfn.zzo> list2, Long l, Long l2) {
        return zza(str, list, list2, l, l2, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [x.l, java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzw>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [x.l, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [x.l, java.util.Map] */
    public final List<zzfn.zzd> zza(String str, List<zzfn.zzf> list, List<zzfn.zzo> list2, Long l, Long l2, boolean z8) {
        boolean z9;
        Map<Integer, zzfn.zzm> map;
        List<zzff.zzb> list3;
        Iterator it;
        Iterator<zzfn.zzn> it2;
        Map<Integer, zzfn.zzm> map2;
        Map<Integer, List<Integer>> map3;
        Iterator<Integer> it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new l();
        this.zzd = l;
        this.zze = l2;
        Iterator<zzfn.zzf> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z9 = false;
                break;
            }
            if ("_s".equals(it4.next().zzg())) {
                z9 = true;
                break;
            }
        }
        boolean z10 = zzoc.zza() && zze().zzf(this.zza, zzbf.zzbk);
        boolean z11 = zzoc.zza() && zze().zzf(this.zza, zzbf.zzbj);
        if (z9) {
            zzal zzh = zzh();
            String str2 = this.zza;
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzh.e_().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e4) {
                zzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzfw.zza(str2), e4);
            }
        }
        Map<Integer, List<zzff.zzb>> emptyMap = Collections.emptyMap();
        if (z11 && z10) {
            emptyMap = zzh().zzm(this.zza);
        }
        Map<Integer, zzfn.zzm> zzl = zzh().zzl(this.zza);
        if (!zzl.isEmpty()) {
            HashSet hashSet = new HashSet(zzl.keySet());
            if (z9) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzn = zzh().zzn(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzl);
                l lVar = new l();
                if (!zzl.isEmpty()) {
                    Iterator<Integer> it5 = zzl.keySet().iterator();
                    while (it5.hasNext()) {
                        Integer next = it5.next();
                        next.intValue();
                        zzfn.zzm zzmVar = zzl.get(next);
                        List<Integer> list4 = zzn.get(next);
                        if (list4 != null && !list4.isEmpty()) {
                            List<Long> zza = g_().zza(zzmVar.zzi(), list4);
                            if (!zza.isEmpty()) {
                                zzfn.zzm.zza zzb = zzmVar.zzcc().zzb().zzb(zza);
                                zzb.zzd().zzd(g_().zza(zzmVar.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfn.zze zzeVar : zzmVar.zzh()) {
                                    Map<Integer, List<Integer>> map4 = zzn;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    zzn = map4;
                                    it5 = it6;
                                }
                                map3 = zzn;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfn.zzn zznVar : zzmVar.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                lVar.put(next, (zzfn.zzm) ((com.google.android.gms.internal.measurement.zzjk) zzb.zzai()));
                            }
                        } else {
                            map3 = zzn;
                            it3 = it5;
                            lVar.put(next, zzmVar);
                        }
                        zzn = map3;
                        it5 = it3;
                    }
                }
                map = lVar;
            } else {
                map = zzl;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                Integer num = (Integer) it7.next();
                num.intValue();
                zzfn.zzm zzmVar2 = map.get(num);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ?? lVar2 = new l();
                if (zzmVar2 != null && zzmVar2.zza() != 0) {
                    for (zzfn.zze zzeVar2 : zzmVar2.zzh()) {
                        if (zzeVar2.zzf()) {
                            lVar2.put(Integer.valueOf(zzeVar2.zza()), zzeVar2.zze() ? Long.valueOf(zzeVar2.zzb()) : null);
                        }
                    }
                }
                ?? lVar3 = new l();
                if (zzmVar2 != null && zzmVar2.zzc() != 0) {
                    Iterator<zzfn.zzn> it8 = zzmVar2.zzj().iterator();
                    while (it8.hasNext()) {
                        zzfn.zzn next2 = it8.next();
                        if (!next2.zzf() || next2.zza() <= 0) {
                            it2 = it8;
                            map2 = map;
                        } else {
                            it2 = it8;
                            map2 = map;
                            lVar3.put(Integer.valueOf(next2.zzb()), Long.valueOf(next2.zza(next2.zza() - 1)));
                        }
                        it8 = it2;
                        map = map2;
                    }
                }
                Map<Integer, zzfn.zzm> map5 = map;
                if (zzmVar2 != null) {
                    int i9 = 0;
                    while (i9 < (zzmVar2.zzd() << 6)) {
                        if (zznl.zza(zzmVar2.zzk(), i9)) {
                            it = it7;
                            zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", num, Integer.valueOf(i9));
                            bitSet2.set(i9);
                            if (zznl.zza(zzmVar2.zzi(), i9)) {
                                bitSet.set(i9);
                                i9++;
                                it7 = it;
                            }
                        } else {
                            it = it7;
                        }
                        lVar2.remove(Integer.valueOf(i9));
                        i9++;
                        it7 = it;
                    }
                }
                Iterator it9 = it7;
                zzfn.zzm zzmVar3 = zzl.get(num);
                if (z11 && z10 && (list3 = emptyMap.get(num)) != null && this.zze != null && this.zzd != null) {
                    for (zzff.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (lVar2.containsKey(Integer.valueOf(zzb2))) {
                            lVar2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        if (lVar3.containsKey(Integer.valueOf(zzb2))) {
                            lVar3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                    }
                }
                this.zzc.put(num, new zzw(this, this.zza, zzmVar3, bitSet, bitSet2, lVar2, lVar3));
                it7 = it9;
                zzl = zzl;
                map = map5;
            }
        }
        if (com.google.android.gms.internal.measurement.zznk.zza() && zze().zzf(null, zzbf.zzcv)) {
            zza(list, z8);
            if (z8) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, true);
        zza(list2);
        return zzu();
    }

    private final void zza(List<zzfn.zzf> list, boolean z8) {
        zzaz zzazVar;
        zzy zzyVar;
        Integer num;
        Map<Integer, List<zzff.zzb>> map;
        long j7;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar2 = new zzy(this);
        l lVar = new l();
        for (zzfn.zzf zzfVar : list) {
            zzfn.zzf zza = zzyVar2.zza(this.zza, zzfVar);
            if (zza != null) {
                zzal zzh = zzh();
                String str2 = this.zza;
                String zzg = zza.zzg();
                zzaz zzd = zzh.zzd(str2, zzfVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzfw.zza(str2), zzh.zzi().zza(zzg));
                    zzazVar = new zzaz(str2, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzazVar = new zzaz(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzaz zzazVar2 = zzazVar;
                zzh().zza(zzazVar2);
                if (!com.google.android.gms.internal.measurement.zznk.zza() || !zze().zzf(str, zzbf.zzcv) || !z8) {
                    long j9 = zzazVar2.zzc;
                    String zzg2 = zza.zzg();
                    Map<Integer, List<zzff.zzb>> map2 = (Map) lVar.get(zzg2);
                    if (map2 == null) {
                        map2 = zzh().zzf(this.zza, zzg2);
                        lVar.put(zzg2, map2);
                    }
                    Map<Integer, List<zzff.zzb>> map3 = map2;
                    Iterator<Integer> it = map3.keySet().iterator();
                    while (it.hasNext()) {
                        Integer next = it.next();
                        int intValue = next.intValue();
                        if (this.zzb.contains(next)) {
                            zzj().zzp().zza("Skipping failed audience ID", next);
                        } else {
                            Iterator<zzff.zzb> it2 = map3.get(next).iterator();
                            boolean z9 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    zzyVar = zzyVar2;
                                    num = next;
                                    map = map3;
                                    j7 = j9;
                                    break;
                                }
                                zzff.zzb next2 = it2.next();
                                zzaa zzaaVar = new zzaa(this, this.zza, intValue, next2);
                                zzyVar = zzyVar2;
                                num = next;
                                int i9 = intValue;
                                map = map3;
                                j7 = j9;
                                z9 = zzaaVar.zza(this.zzd, this.zze, zza, j9, zzazVar2, zza(intValue, next2.zzb()));
                                if (z9) {
                                    zza(num).zza(zzaaVar);
                                    next = num;
                                    zzyVar2 = zzyVar;
                                    intValue = i9;
                                    map3 = map;
                                    j9 = j7;
                                } else {
                                    this.zzb.add(num);
                                    break;
                                }
                            }
                            if (!z9) {
                                this.zzb.add(num);
                            }
                            zzyVar2 = zzyVar;
                            map3 = map;
                            j9 = j7;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        r5 = zzj().zzu();
        r6 = com.google.android.gms.measurement.internal.zzfw.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010d, code lost:
    
        if (r7.zzi() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010f, code lost:
    
        r9 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0117, code lost:
    
        r5.zza("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r9));
        r7 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(java.util.List<com.google.android.gms.internal.measurement.zzfn.zzo> r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzu.zza(java.util.List):void");
    }

    private final boolean zza(int i9, int i10) {
        zzw zzwVar = this.zzc.get(Integer.valueOf(i9));
        if (zzwVar == null) {
            return false;
        }
        return zzw.zza(zzwVar).get(i10);
    }
}
