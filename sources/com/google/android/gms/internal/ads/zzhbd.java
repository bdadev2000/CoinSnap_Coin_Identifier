package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhbd {
    public static final /* synthetic */ int zza = 0;
    private static final zzhbn zzb;

    static {
        int i10 = zzhas.zza;
        zzb = new zzhbp();
    }

    public static void zzA(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzu(i10, list, z10);
        }
    }

    public static void zzB(int i10, List list, zzhcc zzhccVar, zzhbb zzhbbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzgyd) zzhccVar).zzv(i10, list.get(i11), zzhbbVar);
            }
        }
    }

    public static void zzC(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzy(i10, list, z10);
        }
    }

    public static void zzD(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzA(i10, list, z10);
        }
    }

    public static void zzE(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzC(i10, list, z10);
        }
    }

    public static void zzF(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzE(i10, list, z10);
        }
    }

    public static void zzG(int i10, List list, zzhcc zzhccVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzH(i10, list);
        }
    }

    public static void zzH(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzJ(i10, list, z10);
        }
    }

    public static void zzI(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzL(i10, list, z10);
        }
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(zzgyyVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgyc.zzD(i10 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgyc.zzD(i10 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(zzgyyVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(zzgzxVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(int i10, Object obj, zzhbb zzhbbVar) {
        int i11 = i10 << 3;
        if (obj instanceof zzgzt) {
            int zzD = zzgyc.zzD(i11);
            int zza2 = ((zzgzt) obj).zza();
            return zzgyc.zzD(zza2) + zza2 + zzD;
        }
        return zzgyc.zzA((zzhai) obj, zzhbbVar) + zzgyc.zzD(i11);
    }

    public static int zzi(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                int zzd = zzgyyVar.zzd(i11);
                i10 += zzgyc.zzD((zzd >> 31) ^ (zzd + zzd));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgyc.zzD((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzgzxVar.zza(i11);
                i10 += zzgyc.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgyc.zzE((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    public static int zzk(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgyy) {
            zzgyy zzgyyVar = (zzgyy) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzD(zzgyyVar.zzd(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzD(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgzx) {
            zzgzx zzgzxVar = (zzgzx) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(zzgzxVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgyc.zzE(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzhbn zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i10, List list, zzgzd zzgzdVar, Object obj2, zzhbn zzhbnVar) {
        if (zzgzdVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgzdVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj2 = zzo(obj, i10, intValue, obj2, zzhbnVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgzdVar.zza(intValue2)) {
                    obj2 = zzo(obj, i10, intValue2, obj2, zzhbnVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i10, int i11, Object obj2, zzhbn zzhbnVar) {
        if (obj2 == null) {
            obj2 = zzhbnVar.zza(obj);
        }
        zzhbnVar.zzh(obj2, i10, i11);
        return obj2;
    }

    public static void zzp(zzgyi zzgyiVar, Object obj, Object obj2) {
        if (((zzgyt) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhbn zzhbnVar, Object obj, Object obj2) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVar = zzgyxVar.zzt;
        zzhbo zzhboVar2 = ((zzgyx) obj2).zzt;
        if (!zzhbo.zzc().equals(zzhboVar2)) {
            if (zzhbo.zzc().equals(zzhboVar)) {
                zzhboVar = zzhbo.zze(zzhboVar, zzhboVar2);
            } else {
                zzhboVar.zzd(zzhboVar2);
            }
        }
        zzgyxVar.zzt = zzhboVar;
    }

    public static void zzr(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzc(i10, list, z10);
        }
    }

    public static void zzs(int i10, List list, zzhcc zzhccVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zze(i10, list);
        }
    }

    public static void zzt(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzg(i10, list, z10);
        }
    }

    public static void zzu(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzj(i10, list, z10);
        }
    }

    public static void zzv(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzl(i10, list, z10);
        }
    }

    public static void zzw(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzn(i10, list, z10);
        }
    }

    public static void zzx(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzp(i10, list, z10);
        }
    }

    public static void zzy(int i10, List list, zzhcc zzhccVar, zzhbb zzhbbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                ((zzgyd) zzhccVar).zzq(i10, list.get(i11), zzhbbVar);
            }
        }
    }

    public static void zzz(int i10, List list, zzhcc zzhccVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhccVar.zzs(i10, list, z10);
        }
    }
}
