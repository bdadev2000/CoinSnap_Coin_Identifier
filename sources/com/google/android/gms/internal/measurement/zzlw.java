package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    public static zzmk<?, ?> zza() {
        return zza;
    }

    public static int zzb(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zzb(list);
    }

    public static int zzc(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzf(i2, 0) * size;
    }

    public static int zzd(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzc(i2, 0L) * size;
    }

    public static int zze(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zze(list);
    }

    public static int zzf(int i2, List<Long> list, boolean z2) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * list.size()) + zzf(list);
    }

    public static int zzg(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zzg(list);
    }

    public static int zzh(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zzh(list);
    }

    public static int zzi(int i2, List<Integer> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zzi(list);
    }

    public static int zzj(int i2, List<Long> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i2) * size) + zzj(list);
    }

    public static void zzk(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzk(i2, list, z2);
    }

    public static void zzl(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzl(i2, list, z2);
    }

    public static void zzm(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzm(i2, list, z2);
    }

    public static void zzn(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzn(i2, list, z2);
    }

    public static int zza(int i2, List<?> list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzb(i2, true) * size;
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzb(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzd(zzjwVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzd(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void zzc(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i2, list, z2);
    }

    public static void zzd(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i2, list, z2);
    }

    public static int zze(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzf(zzjwVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzf(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzf(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzd(zzknVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzd(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzg(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzh(zzjwVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzh(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzh(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzf(zzknVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzf(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzi(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzj(zzjwVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzj(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzj(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzg(zzknVar.zzb(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzjc.zzg(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zza(int i2, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i2) * size;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zzi += zzjc.zzb(list.get(i3));
        }
        return zzi;
    }

    public static int zza(int i2, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += zzjc.zzb(i2, list.get(i4), zzluVar);
        }
        return i3;
    }

    public static int zzb(int i2, List<?> list, zzlu<?> zzluVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzkk) {
                zza2 = zzjc.zza((zzkk) obj);
            } else {
                zza2 = zzjc.zza((zzlc) obj, zzluVar);
            }
            zzi = zza2 + zzi;
        }
        return zzi;
    }

    public static void zze(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i2, list, z2);
    }

    public static void zzf(int i2, List<Float> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i2, list, z2);
    }

    public static void zzg(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i2, list, z2);
    }

    public static void zzh(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i2, list, z2);
    }

    public static void zzi(int i2, List<Integer> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i2, list, z2);
    }

    public static void zzj(int i2, List<Long> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i2, list, z2);
    }

    public static int zza(int i2, Object obj, zzlu<?> zzluVar) {
        if (obj instanceof zzkk) {
            return zzjc.zzb(i2, (zzkk) obj);
        }
        return zzjc.zzc(i2, (zzlc) obj, zzluVar);
    }

    public static <UT, UB> UB zza(Object obj, int i2, List<Integer> list, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (zzjxVar.zza(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) zza(obj, i2, intValue, ub, zzmkVar);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjxVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i2, intValue2, ub, zzmkVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i2, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i2) * size;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i3 < size) {
                Object zza2 = zzkjVar.zza(i3);
                if (zza2 instanceof zzik) {
                    zzb2 = zzjc.zzb((zzik) zza2);
                } else {
                    zzb2 = zzjc.zzb((String) zza2);
                }
                zzi = zzb2 + zzi;
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                if (obj instanceof zzik) {
                    zzb = zzjc.zzb((zzik) obj);
                } else {
                    zzb = zzjc.zzb((String) obj);
                }
                zzi = zzb + zzi;
                i3++;
            }
        }
        return zzi;
    }

    public static <UT, UB> UB zza(Object obj, int i2, int i3, UB ub, zzmk<UT, UB> zzmkVar) {
        if (ub == null) {
            ub = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub, i2, i3);
        return ub;
    }

    public static void zzb(int i2, List<Double> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list, z2);
    }

    public static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t2, T t3) {
        zzjm<FT> zza2 = zzjiVar.zza(t3);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t2).zza(zza2);
    }

    public static void zzb(int i2, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list, (zzlu) zzluVar);
    }

    public static void zzb(int i2, List<String> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i2, list);
    }

    public static <T> void zza(zzkv zzkvVar, T t2, T t3, long j2) {
        zzml.zza(t2, j2, zzkvVar.zza(zzml.zze(t2, j2), zzml.zze(t3, j2)));
    }

    public static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t2, T t3) {
        zzmkVar.zzc(t2, zzmkVar.zza(zzmkVar.zzd(t2), zzmkVar.zzd(t3)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    public static void zza(int i2, List<Boolean> list, zznb zznbVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list, z2);
    }

    public static void zza(int i2, List<zzik> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list);
    }

    public static void zza(int i2, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i2, list, (zzlu) zzluVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
