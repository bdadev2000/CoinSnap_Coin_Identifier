package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzt extends zznr {
    private String zza;
    private Set<Integer> zzb;
    private Map<Integer, zzv> zzc;
    private Long zzd;
    private Long zze;

    public zzt(zznv zznvVar) {
        super(zznvVar);
    }

    private final zzv zza(Integer num) {
        if (this.zzc.containsKey(num)) {
            return this.zzc.get(num);
        }
        zzv zzvVar = new zzv(this, this.zza);
        this.zzc.put(num, zzvVar);
        return zzvVar;
    }

    @NonNull
    private final List<zzfy.zzd> zzu() {
        ArrayList arrayList = new ArrayList();
        Set<Integer> keySet = this.zzc.keySet();
        keySet.removeAll(this.zzb);
        Iterator<Integer> it = keySet.iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            zzv zzvVar = this.zzc.get(Integer.valueOf(intValue));
            Preconditions.checkNotNull(zzvVar);
            zzfy.zzd zza = zzvVar.zza(intValue);
            arrayList.add(zza);
            zzal zzh = zzh();
            String str = this.zza;
            zzfy.zzm zzd = zza.zzd();
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str);
            Preconditions.checkNotNull(zzd);
            byte[] zzca = zzd.zzca();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", Integer.valueOf(intValue));
            contentValues.put("current_results", zzca);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(str));
                }
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(str), e);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    @WorkerThread
    public final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l2, Long l3) {
        return zza(str, list, list2, l2, l3, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map<java.lang.Integer, com.google.android.gms.measurement.internal.zzv>, androidx.collection.SimpleArrayMap] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    @WorkerThread
    public final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l2, Long l3, boolean z2) {
        boolean z3;
        Map<Integer, zzfy.zzm> map;
        List<zzfo.zzb> list3;
        Map<Integer, List<zzfo.zzb>> map2;
        Map<Integer, zzfy.zzm> map3;
        Iterator it;
        Iterator<zzfy.zzn> it2;
        Map<Integer, List<Integer>> map4;
        Iterator<Integer> it3;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new SimpleArrayMap(0);
        this.zzd = l2;
        this.zze = l3;
        Iterator<zzfy.zzf> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z3 = false;
                break;
            }
            if ("_s".equals(it4.next().zzg())) {
                z3 = true;
                break;
            }
        }
        boolean z4 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbp);
        boolean z5 = com.google.android.gms.internal.measurement.zzoe.zza() && zze().zzf(this.zza, zzbh.zzbo);
        if (z3) {
            zzal zzh = zzh();
            String str2 = this.zza;
            zzh.zzal();
            zzh.zzt();
            Preconditions.checkNotEmpty(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzh.e_().update(CrashEvent.f29806f, contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e) {
                zzh.zzj().zzg().zza("Error resetting session-scoped event counts. appId", zzgo.zza(str2), e);
            }
        }
        Map<Integer, List<zzfo.zzb>> emptyMap = Collections.emptyMap();
        if (z5 && z4) {
            emptyMap = zzh().zzn(this.zza);
        }
        Map<Integer, zzfy.zzm> zzm = zzh().zzm(this.zza);
        if (!zzm.isEmpty()) {
            HashSet hashSet = new HashSet(zzm.keySet());
            if (z3) {
                String str3 = this.zza;
                Map<Integer, List<Integer>> zzo = zzh().zzo(this.zza);
                Preconditions.checkNotEmpty(str3);
                Preconditions.checkNotNull(zzm);
                SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
                if (!zzm.isEmpty()) {
                    Iterator<Integer> it5 = zzm.keySet().iterator();
                    while (it5.hasNext()) {
                        int intValue = it5.next().intValue();
                        zzfy.zzm zzmVar = zzm.get(Integer.valueOf(intValue));
                        List<Integer> list4 = zzo.get(Integer.valueOf(intValue));
                        if (list4 != null && !list4.isEmpty()) {
                            List<Long> zza = g_().zza(zzmVar.zzi(), list4);
                            if (!zza.isEmpty()) {
                                zzfy.zzm.zza zzb = zzmVar.zzcd().zzb().zzb(zza);
                                zzb.zzd().zzd(g_().zza(zzmVar.zzk(), list4));
                                ArrayList arrayList = new ArrayList();
                                for (zzfy.zze zzeVar : zzmVar.zzh()) {
                                    Map<Integer, List<Integer>> map5 = zzo;
                                    Iterator<Integer> it6 = it5;
                                    if (!list4.contains(Integer.valueOf(zzeVar.zza()))) {
                                        arrayList.add(zzeVar);
                                    }
                                    zzo = map5;
                                    it5 = it6;
                                }
                                map4 = zzo;
                                it3 = it5;
                                zzb.zza().zza(arrayList);
                                ArrayList arrayList2 = new ArrayList();
                                for (zzfy.zzn zznVar : zzmVar.zzj()) {
                                    if (!list4.contains(Integer.valueOf(zznVar.zzb()))) {
                                        arrayList2.add(zznVar);
                                    }
                                }
                                zzb.zzc().zzc(arrayList2);
                                simpleArrayMap.put(Integer.valueOf(intValue), (zzfy.zzm) ((com.google.android.gms.internal.measurement.zzjt) zzb.zzai()));
                            }
                        } else {
                            map4 = zzo;
                            it3 = it5;
                            simpleArrayMap.put(Integer.valueOf(intValue), zzmVar);
                        }
                        zzo = map4;
                        it5 = it3;
                    }
                }
                map = simpleArrayMap;
            } else {
                map = zzm;
            }
            Iterator it7 = hashSet.iterator();
            while (it7.hasNext()) {
                int intValue2 = ((Integer) it7.next()).intValue();
                zzfy.zzm zzmVar2 = map.get(Integer.valueOf(intValue2));
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                ?? simpleArrayMap2 = new SimpleArrayMap(0);
                if (zzmVar2 != null && zzmVar2.zza() != 0) {
                    for (zzfy.zze zzeVar2 : zzmVar2.zzh()) {
                        if (zzeVar2.zzf()) {
                            simpleArrayMap2.put(Integer.valueOf(zzeVar2.zza()), zzeVar2.zze() ? Long.valueOf(zzeVar2.zzb()) : null);
                        }
                    }
                }
                ?? simpleArrayMap3 = new SimpleArrayMap(0);
                if (zzmVar2 != null && zzmVar2.zzc() != 0) {
                    Iterator<zzfy.zzn> it8 = zzmVar2.zzj().iterator();
                    while (it8.hasNext()) {
                        zzfy.zzn next = it8.next();
                        if (!next.zzf() || next.zza() <= 0) {
                            it2 = it8;
                        } else {
                            it2 = it8;
                            simpleArrayMap3.put(Integer.valueOf(next.zzb()), Long.valueOf(next.zza(next.zza() - 1)));
                        }
                        it8 = it2;
                    }
                }
                if (zzmVar2 != null) {
                    int i2 = 0;
                    while (i2 < (zzmVar2.zzd() << 6)) {
                        if (zzoo.zza(zzmVar2.zzk(), i2)) {
                            map3 = map;
                            it = it7;
                            zzj().zzp().zza("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i2));
                            bitSet2.set(i2);
                            if (zzoo.zza(zzmVar2.zzi(), i2)) {
                                bitSet.set(i2);
                                i2++;
                                it7 = it;
                                map = map3;
                            }
                        } else {
                            map3 = map;
                            it = it7;
                        }
                        simpleArrayMap2.remove(Integer.valueOf(i2));
                        i2++;
                        it7 = it;
                        map = map3;
                    }
                }
                Map<Integer, zzfy.zzm> map6 = map;
                Iterator it9 = it7;
                zzfy.zzm zzmVar3 = zzm.get(Integer.valueOf(intValue2));
                if (z5 && z4 && (list3 = emptyMap.get(Integer.valueOf(intValue2))) != null && this.zze != null && this.zzd != null) {
                    for (zzfo.zzb zzbVar : list3) {
                        int zzb2 = zzbVar.zzb();
                        long longValue = this.zze.longValue() / 1000;
                        if (zzbVar.zzi()) {
                            longValue = this.zzd.longValue() / 1000;
                        }
                        if (simpleArrayMap2.containsKey(Integer.valueOf(zzb2))) {
                            map2 = emptyMap;
                            simpleArrayMap2.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        } else {
                            map2 = emptyMap;
                        }
                        if (simpleArrayMap3.containsKey(Integer.valueOf(zzb2))) {
                            simpleArrayMap3.put(Integer.valueOf(zzb2), Long.valueOf(longValue));
                        }
                        emptyMap = map2;
                    }
                }
                this.zzc.put(Integer.valueOf(intValue2), new zzv(this, this.zza, zzmVar3, bitSet, bitSet2, simpleArrayMap2, simpleArrayMap3));
                it7 = it9;
                map = map6;
                emptyMap = emptyMap;
                zzm = zzm;
            }
        }
        if (com.google.android.gms.internal.measurement.zznm.zza() && zze().zzf(null, zzbh.zzcy)) {
            zza(list, z2);
            if (z2) {
                return new ArrayList();
            }
            zza(list2);
            return zzu();
        }
        zza(list, true);
        zza(list2);
        return zzu();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    private final void zza(List<zzfy.zzf> list, boolean z2) {
        zzbb zzbbVar;
        int i2;
        Map<Integer, List<zzfo.zzb>> map;
        long j2;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar = new zzy(this);
        ?? simpleArrayMap = new SimpleArrayMap(0);
        for (zzfy.zzf zzfVar : list) {
            zzfy.zzf zza = zzyVar.zza(this.zza, zzfVar);
            if (zza != null) {
                zzal zzh = zzh();
                String str2 = this.zza;
                String zzg = zza.zzg();
                zzbb zzd = zzh.zzd(str2, zzfVar.zzg());
                if (zzd == null) {
                    zzh.zzj().zzu().zza("Event aggregate wasn't created during raw event logging. appId, event", zzgo.zza(str2), zzh.zzi().zza(zzg));
                    zzbbVar = new zzbb(str2, zzfVar.zzg(), 1L, 1L, 1L, zzfVar.zzd(), 0L, null, null, null, null);
                } else {
                    zzbbVar = new zzbb(zzd.zza, zzd.zzb, zzd.zzc + 1, zzd.zzd + 1, zzd.zze + 1, zzd.zzf, zzd.zzg, zzd.zzh, zzd.zzi, zzd.zzj, zzd.zzk);
                }
                zzbb zzbbVar2 = zzbbVar;
                zzh().zza(zzbbVar2);
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zzf(str, zzbh.zzcy) || !z2) {
                    long j3 = zzbbVar2.zzc;
                    String zzg2 = zza.zzg();
                    Map<Integer, List<zzfo.zzb>> map2 = (Map) simpleArrayMap.get(zzg2);
                    if (map2 == null) {
                        map2 = zzh().zzf(this.zza, zzg2);
                        simpleArrayMap.put(zzg2, map2);
                    }
                    Map<Integer, List<zzfo.zzb>> map3 = map2;
                    Iterator<Integer> it = map3.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        if (this.zzb.contains(Integer.valueOf(intValue))) {
                            zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(intValue));
                        } else {
                            Iterator<zzfo.zzb> it2 = map3.get(Integer.valueOf(intValue)).iterator();
                            boolean z3 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = intValue;
                                    map = map3;
                                    j2 = j3;
                                    break;
                                }
                                zzfo.zzb next = it2.next();
                                zzx zzxVar = new zzx(this, this.zza, intValue, next);
                                i2 = intValue;
                                map = map3;
                                j2 = j3;
                                z3 = zzxVar.zza(this.zzd, this.zze, zza, j3, zzbbVar2, zza(intValue, next.zzb()));
                                if (z3) {
                                    zza(Integer.valueOf(i2)).zza(zzxVar);
                                    intValue = i2;
                                    map3 = map;
                                    j3 = j2;
                                } else {
                                    this.zzb.add(Integer.valueOf(i2));
                                    break;
                                }
                            }
                            if (!z3) {
                                this.zzb.add(Integer.valueOf(i2));
                            }
                            map3 = map;
                            j3 = j2;
                            str = null;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        r5 = zzj().zzu();
        r7 = com.google.android.gms.measurement.internal.zzgo.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0126, code lost:
    
        if (r6.zzi() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
    
        r8 = java.lang.Integer.valueOf(r6.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0130, code lost:
    
        r5.zza("Invalid property filter ID. appId, id", r7, java.lang.String.valueOf(r8));
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(java.util.List<com.google.android.gms.internal.measurement.zzfy.zzo> r14) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.util.List):void");
    }

    private final boolean zza(int i2, int i3) {
        zzv zzvVar = this.zzc.get(Integer.valueOf(i2));
        if (zzvVar == null) {
            return false;
        }
        return zzv.zza(zzvVar).get(i3);
    }
}
