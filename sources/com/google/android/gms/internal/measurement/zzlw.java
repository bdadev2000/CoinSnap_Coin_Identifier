package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlw {
    private static final zzmk<?, ?> zza = new zzmm();

    public static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzb(i10, true) * size;
    }

    public static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zzb(list);
    }

    public static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzf(i10, 0) * size;
    }

    public static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzjc.zzc(i10, 0L) * size;
    }

    public static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zze(list);
    }

    public static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * list.size()) + zzf(list);
    }

    public static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zzg(list);
    }

    public static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zzh(list);
    }

    public static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zzi(list);
    }

    public static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjc.zzi(i10) * size) + zzj(list);
    }

    public static void zzk(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznbVar.zzk(i10, list, z10);
        }
    }

    public static void zzl(int i10, List<Long> list, zznb zznbVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznbVar.zzl(i10, list, z10);
        }
    }

    public static void zzm(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznbVar.zzm(i10, list, z10);
        }
    }

    public static void zzn(int i10, List<Long> list, zznb zznbVar, boolean z10) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznbVar.zzn(i10, list, z10);
        }
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i10, List<zzik> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i10) * size;
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzi += zzjc.zzb(list.get(i11));
        }
        return zzi;
    }

    public static int zzb(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzd(zzjwVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzd(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static void zzc(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzc(i10, list, z10);
    }

    public static void zzd(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzd(i10, list, z10);
    }

    public static int zze(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzf(zzjwVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzf(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzf(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzd(zzknVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzd(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzg(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzh(zzjwVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzh(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzh(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzf(zzknVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzf(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzi(List<Integer> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjw) {
            zzjw zzjwVar = (zzjw) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzj(zzjwVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzj(list.get(i11).intValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zzj(List<Long> list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkn) {
            zzkn zzknVar = (zzkn) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzg(zzknVar.zzb(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjc.zzg(list.get(i11).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static int zza(int i10, List<zzlc> list, zzlu<?> zzluVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += zzjc.zzb(i10, list.get(i12), zzluVar);
        }
        return i11;
    }

    public static int zzb(int i10, List<?> list, zzlu<?> zzluVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzkk) {
                zza2 = zzjc.zza((zzkk) obj);
            } else {
                zza2 = zzjc.zza((zzlc) obj, zzluVar);
            }
            zzi = zza2 + zzi;
        }
        return zzi;
    }

    public static void zze(int i10, List<Long> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zze(i10, list, z10);
    }

    public static void zzf(int i10, List<Float> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzf(i10, list, z10);
    }

    public static void zzg(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzg(i10, list, z10);
    }

    public static void zzh(int i10, List<Long> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzh(i10, list, z10);
    }

    public static void zzi(int i10, List<Integer> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzi(i10, list, z10);
    }

    public static void zzj(int i10, List<Long> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzj(i10, list, z10);
    }

    public static int zza(int i10, Object obj, zzlu<?> zzluVar) {
        if (obj instanceof zzkk) {
            return zzjc.zzb(i10, (zzkk) obj);
        }
        return zzjc.zzc(i10, (zzlc) obj, zzluVar);
    }

    public static zzmk<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzjx zzjxVar, UB ub2, zzmk<UT, UB> zzmkVar) {
        if (zzjxVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = list.get(i12).intValue();
                if (zzjxVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, intValue, ub2, zzmkVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjxVar.zza(intValue2)) {
                    ub2 = (UB) zza(obj, i10, intValue2, ub2, zzmkVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static int zzb(int i10, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzjc.zzi(i10) * size;
        if (list instanceof zzkj) {
            zzkj zzkjVar = (zzkj) list;
            while (i11 < size) {
                Object zza2 = zzkjVar.zza(i11);
                if (zza2 instanceof zzik) {
                    zzb2 = zzjc.zzb((zzik) zza2);
                } else {
                    zzb2 = zzjc.zzb((String) zza2);
                }
                zzi = zzb2 + zzi;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzik) {
                    zzb = zzjc.zzb((zzik) obj);
                } else {
                    zzb = zzjc.zzb((String) obj);
                }
                zzi = zzb + zzi;
                i11++;
            }
        }
        return zzi;
    }

    public static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzmk<UT, UB> zzmkVar) {
        if (ub2 == null) {
            ub2 = zzmkVar.zzc(obj);
        }
        zzmkVar.zzb(ub2, i10, i11);
        return ub2;
    }

    public static void zzb(int i10, List<Double> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i10, list, z10);
    }

    public static <T, FT extends zzjo<FT>> void zza(zzji<FT> zzjiVar, T t5, T t10) {
        zzjm<FT> zza2 = zzjiVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzjiVar.zzb(t5).zza(zza2);
    }

    public static void zzb(int i10, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i10, list, (zzlu) zzluVar);
    }

    public static void zzb(int i10, List<String> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zzb(i10, list);
    }

    public static <T> void zza(zzkv zzkvVar, T t5, T t10, long j3) {
        zzml.zza(t5, j3, zzkvVar.zza(zzml.zze(t5, j3), zzml.zze(t10, j3)));
    }

    public static <T, UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t5, T t10) {
        zzmkVar.zzc(t5, zzmkVar.zza(zzmkVar.zzd(t5), zzmkVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzjt.class.isAssignableFrom(cls);
    }

    public static void zza(int i10, List<Boolean> list, zznb zznbVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i10, list, z10);
    }

    public static void zza(int i10, List<zzik> list, zznb zznbVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zznb zznbVar, zzlu<?> zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznbVar.zza(i10, list, (zzlu) zzluVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
