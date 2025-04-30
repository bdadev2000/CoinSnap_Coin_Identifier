package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzln {
    private static final zzmf<?, ?> zza = new zzmh();

    public static int zza(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzit.zzb(i9, true) * size;
    }

    public static int zzb(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zzb(list);
    }

    public static int zzc(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzit.zzf(i9, 0) * size;
    }

    public static int zzd(int i9, List<?> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzit.zzc(i9, 0L) * size;
    }

    public static int zze(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zze(list);
    }

    public static int zzf(int i9, List<Long> list, boolean z8) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * list.size()) + zzf(list);
    }

    public static int zzg(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zzg(list);
    }

    public static int zzh(int i9, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zzh(list);
    }

    public static int zzi(int i9, List<Integer> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zzi(list);
    }

    public static int zzj(int i9, List<Long> list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzit.zzi(i9) * size) + zzj(list);
    }

    public static void zzk(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznaVar.zzk(i9, list, z8);
        }
    }

    public static void zzl(int i9, List<Long> list, zzna zznaVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznaVar.zzl(i9, list, z8);
        }
    }

    public static void zzm(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznaVar.zzm(i9, list, z8);
        }
    }

    public static void zzn(int i9, List<Long> list, zzna zznaVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zznaVar.zzn(i9, list, z8);
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

    public static int zza(int i9, List<zzia> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i9) * size;
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzi += zzit.zzb(list.get(i10));
        }
        return zzi;
    }

    public static int zzb(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzd(zzjnVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzd(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static void zzc(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzc(i9, list, z8);
    }

    public static void zzd(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzd(i9, list, z8);
    }

    public static int zze(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzf(zzjnVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzf(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzf(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzd(zzkeVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzd(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzg(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzh(zzjnVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzh(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzh(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzf(zzkeVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzf(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzi(List<Integer> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzjn) {
            zzjn zzjnVar = (zzjn) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzj(zzjnVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzj(list.get(i10).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzj(List<Long> list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzke) {
            zzke zzkeVar = (zzke) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzg(zzkeVar.zzb(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzit.zzg(list.get(i10).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zza(int i9, List<zzkt> list, zzll zzllVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += zzit.zzb(i9, list.get(i11), zzllVar);
        }
        return i10;
    }

    public static int zzb(int i9, List<?> list, zzll zzllVar) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i9) * size;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            if (obj instanceof zzkb) {
                zza2 = zzit.zza((zzkb) obj);
            } else {
                zza2 = zzit.zza((zzkt) obj, zzllVar);
            }
            zzi = zza2 + zzi;
        }
        return zzi;
    }

    public static void zze(int i9, List<Long> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zze(i9, list, z8);
    }

    public static void zzf(int i9, List<Float> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzf(i9, list, z8);
    }

    public static void zzg(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzg(i9, list, z8);
    }

    public static void zzh(int i9, List<Long> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzh(i9, list, z8);
    }

    public static void zzi(int i9, List<Integer> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzi(i9, list, z8);
    }

    public static void zzj(int i9, List<Long> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzj(i9, list, z8);
    }

    public static int zza(int i9, Object obj, zzll zzllVar) {
        if (obj instanceof zzkb) {
            return zzit.zzb(i9, (zzkb) obj);
        }
        return zzit.zzc(i9, (zzkt) obj, zzllVar);
    }

    public static zzmf<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i9, List<Integer> list, zzjo zzjoVar, UB ub, zzmf<UT, UB> zzmfVar) {
        if (zzjoVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = list.get(i11);
                int intValue = num.intValue();
                if (zzjoVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    ub = (UB) zza(obj, i9, intValue, ub, zzmfVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!zzjoVar.zza(intValue2)) {
                    ub = (UB) zza(obj, i9, intValue2, ub, zzmfVar);
                    it.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i9, List<?> list) {
        int zzb;
        int zzb2;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzit.zzi(i9) * size;
        if (list instanceof zzka) {
            zzka zzkaVar = (zzka) list;
            while (i10 < size) {
                Object zza2 = zzkaVar.zza(i10);
                if (zza2 instanceof zzia) {
                    zzb2 = zzit.zzb((zzia) zza2);
                } else {
                    zzb2 = zzit.zzb((String) zza2);
                }
                zzi = zzb2 + zzi;
                i10++;
            }
        } else {
            while (i10 < size) {
                Object obj = list.get(i10);
                if (obj instanceof zzia) {
                    zzb = zzit.zzb((zzia) obj);
                } else {
                    zzb = zzit.zzb((String) obj);
                }
                zzi = zzb + zzi;
                i10++;
            }
        }
        return zzi;
    }

    public static <UT, UB> UB zza(Object obj, int i9, int i10, UB ub, zzmf<UT, UB> zzmfVar) {
        if (ub == null) {
            ub = zzmfVar.zzc(obj);
        }
        zzmfVar.zzb(ub, i9, i10);
        return ub;
    }

    public static void zzb(int i9, List<Double> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i9, list, z8);
    }

    public static <T, FT extends zzjf<FT>> void zza(zziz<FT> zzizVar, T t9, T t10) {
        zzjd<FT> zza2 = zzizVar.zza(t10);
        if (zza2.zza.isEmpty()) {
            return;
        }
        zzizVar.zzb(t9).zza(zza2);
    }

    public static void zzb(int i9, List<?> list, zzna zznaVar, zzll zzllVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i9, list, zzllVar);
    }

    public static void zzb(int i9, List<String> list, zzna zznaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zzb(i9, list);
    }

    public static <T> void zza(zzkm zzkmVar, T t9, T t10, long j7) {
        zzmg.zza(t9, j7, zzkmVar.zza(zzmg.zze(t9, j7), zzmg.zze(t10, j7)));
    }

    public static <T, UT, UB> void zza(zzmf<UT, UB> zzmfVar, T t9, T t10) {
        zzmfVar.zzc(t9, zzmfVar.zza(zzmfVar.zzd(t9), zzmfVar.zzd(t10)));
    }

    public static void zza(Class<?> cls) {
        zzjk.class.isAssignableFrom(cls);
    }

    public static void zza(int i9, List<Boolean> list, zzna zznaVar, boolean z8) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i9, list, z8);
    }

    public static void zza(int i9, List<zzia> list, zzna zznaVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i9, list);
    }

    public static void zza(int i9, List<?> list, zzna zznaVar, zzll zzllVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznaVar.zza(i9, list, zzllVar);
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
