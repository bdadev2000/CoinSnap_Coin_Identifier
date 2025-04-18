package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfy;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r.b;

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
            contentValues.put(MBridgeConstans.APP_ID, str);
            contentValues.put("audience_id", Integer.valueOf(intValue));
            contentValues.put("current_results", zzca);
            try {
                if (zzh.e_().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    zzh.zzj().zzg().zza("Failed to insert filter results (got -1). appId", zzgo.zza(str));
                }
            } catch (SQLiteException e2) {
                zzh.zzj().zzg().zza("Error storing filter results. appId", zzgo.zza(str), e2);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final boolean zzc() {
        return false;
    }

    public final List<zzfy.zzd> zza(String str, List<zzfy.zzf> list, List<zzfy.zzo> list2, Long l10, Long l11) {
        return zza(str, list, list2, l10, l11, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0316 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<com.google.android.gms.internal.measurement.zzfy.zzd> zza(java.lang.String r24, java.util.List<com.google.android.gms.internal.measurement.zzfy.zzf> r25, java.util.List<com.google.android.gms.internal.measurement.zzfy.zzo> r26, java.lang.Long r27, java.lang.Long r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 1017
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.List");
    }

    private final void zza(List<zzfy.zzf> list, boolean z10) {
        zzbb zzbbVar;
        int i10;
        Map<Integer, List<zzfo.zzb>> map;
        long j3;
        if (list.isEmpty()) {
            return;
        }
        String str = null;
        zzy zzyVar = new zzy(this);
        b bVar = new b();
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
                if (!com.google.android.gms.internal.measurement.zznm.zza() || !zze().zzf(str, zzbh.zzcy) || !z10) {
                    long j10 = zzbbVar2.zzc;
                    String zzg2 = zza.zzg();
                    Map<Integer, List<zzfo.zzb>> map2 = (Map) bVar.getOrDefault(zzg2, str);
                    if (map2 == null) {
                        map2 = zzh().zzf(this.zza, zzg2);
                        bVar.put(zzg2, map2);
                    }
                    Map<Integer, List<zzfo.zzb>> map3 = map2;
                    Iterator<Integer> it = map3.keySet().iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        if (this.zzb.contains(Integer.valueOf(intValue))) {
                            zzj().zzp().zza("Skipping failed audience ID", Integer.valueOf(intValue));
                        } else {
                            Iterator<zzfo.zzb> it2 = map3.get(Integer.valueOf(intValue)).iterator();
                            boolean z11 = true;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i10 = intValue;
                                    map = map3;
                                    j3 = j10;
                                    break;
                                }
                                zzfo.zzb next = it2.next();
                                zzx zzxVar = new zzx(this, this.zza, intValue, next);
                                i10 = intValue;
                                map = map3;
                                j3 = j10;
                                z11 = zzxVar.zza(this.zzd, this.zze, zza, j10, zzbbVar2, zza(intValue, next.zzb()));
                                if (z11) {
                                    zza(Integer.valueOf(i10)).zza(zzxVar);
                                    intValue = i10;
                                    map3 = map;
                                    j10 = j3;
                                } else {
                                    this.zzb.add(Integer.valueOf(i10));
                                    break;
                                }
                            }
                            if (!z11) {
                                this.zzb.add(Integer.valueOf(i10));
                            }
                            map3 = map;
                            j10 = j3;
                            str = null;
                        }
                    }
                }
            }
            str = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0113, code lost:
    
        r6 = zzj().zzu();
        r8 = com.google.android.gms.measurement.internal.zzgo.zza(r13.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0125, code lost:
    
        if (r7.zzi() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0131, code lost:
    
        r6.zza("Invalid property filter ID. appId, id", r8, java.lang.String.valueOf(r7));
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0130, code lost:
    
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zza(java.util.List<com.google.android.gms.internal.measurement.zzfy.zzo> r14) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzt.zza(java.util.List):void");
    }

    private final boolean zza(int i10, int i11) {
        zzv zzvVar = this.zzc.get(Integer.valueOf(i10));
        if (zzvVar == null) {
            return false;
        }
        return zzv.zza(zzvVar).get(i11);
    }
}
