package com.google.android.gms.internal.ads;

import com.applovin.impl.adview.t;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzhdm {
    public static final /* synthetic */ int zza = 0;
    private static final zzhdy zzb;

    static {
        int i2 = zzhcz.zza;
        zzb = new zzhea();
    }

    public static void zzA(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzu(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzhen zzhenVar, zzhdk zzhdkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzhak) zzhenVar).zzv(i2, list.get(i3), zzhdkVar);
        }
    }

    public static void zzC(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzy(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzA(i2, list, z2);
    }

    public static void zzE(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzC(i2, list, z2);
    }

    public static void zzF(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzE(i2, list, z2);
    }

    public static void zzG(int i2, List list, zzhen zzhenVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzH(i2, list);
    }

    public static void zzH(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzJ(i2, list, z2);
    }

    public static void zzI(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzL(i2, list, z2);
    }

    public static boolean zzJ(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int zza(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(zzhbfVar.zzd(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzb(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhaj.zzD(i2 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhaj.zzD(i2 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(zzhbfVar.zzd(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzg(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(zzhceVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzh(int i2, Object obj, zzhdk zzhdkVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzhca)) {
            return zzhaj.zzA((zzhcp) obj, zzhdkVar) + zzhaj.zzD(i3);
        }
        int zzD = zzhaj.zzD(i3);
        int zza2 = ((zzhca) obj).zza();
        return t.a(zza2, zza2, zzD);
    }

    public static int zzi(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            i2 = 0;
            while (i3 < size) {
                int zzd = zzhbfVar.zzd(i3);
                i2 += zzhaj.zzD((zzd >> 31) ^ (zzd + zzd));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzhaj.zzD((intValue >> 31) ^ (intValue + intValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzj(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            i2 = 0;
            while (i3 < size) {
                long zza2 = zzhceVar.zza(i3);
                i2 += zzhaj.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzhaj.zzE((longValue >> 63) ^ (longValue + longValue));
                i3++;
            }
        }
        return i2;
    }

    public static int zzk(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbf) {
            zzhbf zzhbfVar = (zzhbf) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzD(zzhbfVar.zzd(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzD(((Integer) list.get(i3)).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzl(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhce) {
            zzhce zzhceVar = (zzhce) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(zzhceVar.zza(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzhaj.zzE(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zzhdy zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i2, List list, zzhbk zzhbkVar, Object obj2, zzhdy zzhdyVar) {
        if (zzhbkVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                if (zzhbkVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    obj2 = zzo(obj, i2, intValue, obj2, zzhdyVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzhbkVar.zza(intValue2)) {
                    obj2 = zzo(obj, i2, intValue2, obj2, zzhdyVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i2, int i3, Object obj2, zzhdy zzhdyVar) {
        if (obj2 == null) {
            obj2 = zzhdyVar.zza(obj);
        }
        zzhdyVar.zzh(obj2, i2, i3);
        return obj2;
    }

    public static void zzp(zzhap zzhapVar, Object obj, Object obj2) {
        if (((zzhba) obj2).zza.zza.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void zzq(zzhdy zzhdyVar, Object obj, Object obj2) {
        zzhbe zzhbeVar = (zzhbe) obj;
        zzhdz zzhdzVar = zzhbeVar.zzt;
        zzhdz zzhdzVar2 = ((zzhbe) obj2).zzt;
        if (!zzhdz.zzc().equals(zzhdzVar2)) {
            if (zzhdz.zzc().equals(zzhdzVar)) {
                zzhdzVar = zzhdz.zze(zzhdzVar, zzhdzVar2);
            } else {
                zzhdzVar.zzd(zzhdzVar2);
            }
        }
        zzhbeVar.zzt = zzhdzVar;
    }

    public static void zzr(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzc(i2, list, z2);
    }

    public static void zzs(int i2, List list, zzhen zzhenVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zze(i2, list);
    }

    public static void zzt(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzg(i2, list, z2);
    }

    public static void zzu(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzj(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzl(i2, list, z2);
    }

    public static void zzw(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzn(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzp(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzhen zzhenVar, zzhdk zzhdkVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((zzhak) zzhenVar).zzq(i2, list.get(i3), zzhdkVar);
        }
    }

    public static void zzz(int i2, List list, zzhen zzhenVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhenVar.zzs(i2, list, z2);
    }
}
