package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgo {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzhd zzc;
    private static final zzhd zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzhd zzhdVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zzhdVar = (zzhd) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzhdVar;
        zzd = new zzhf();
    }

    public static void zzA(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzz(i2, list, z2);
    }

    public static void zzB(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzB(i2, list, z2);
    }

    public static void zzC(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzD(i2, list, z2);
    }

    public static void zzD(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzI(i2, list, z2);
    }

    public static void zzE(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzK(i2, list, z2);
    }

    public static boolean zzF(Object obj, Object obj2) {
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
        if (list instanceof zzey) {
            zzey zzeyVar = (zzey) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzu(zzeyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzu(((Integer) list.get(i3)).intValue());
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
        return (zzee.zzx(i2 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i2, List list, boolean z2) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzee.zzx(i2 << 3) + 8) * size;
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
        if (list instanceof zzey) {
            zzey zzeyVar = (zzey) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzu(zzeyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzu(((Integer) list.get(i3)).intValue());
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
        if (list instanceof zzfr) {
            zzfr zzfrVar = (zzfr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzy(zzfrVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzy(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static int zzh(int i2, Object obj, zzgm zzgmVar) {
        int i3 = i2 << 3;
        if (!(obj instanceof zzfi)) {
            return zzee.zzx(i3) + zzee.zzv((zzgc) obj, zzgmVar);
        }
        int i4 = zzee.zzb;
        int zza2 = ((zzfi) obj).zza();
        return zzee.zzx(i3) + zzee.zzx(zza2) + zza2;
    }

    public static int zzi(List list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzey) {
            zzey zzeyVar = (zzey) list;
            i2 = 0;
            while (i3 < size) {
                int zze = zzeyVar.zze(i3);
                i2 += zzee.zzx((zze >> 31) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                int intValue = ((Integer) list.get(i3)).intValue();
                i2 += zzee.zzx((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzfr) {
            zzfr zzfrVar = (zzfr) list;
            i2 = 0;
            while (i3 < size) {
                long zze = zzfrVar.zze(i3);
                i2 += zzee.zzy((zze >> 63) ^ (zze + zze));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                long longValue = ((Long) list.get(i3)).longValue();
                i2 += zzee.zzy((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzey) {
            zzey zzeyVar = (zzey) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzx(zzeyVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzx(((Integer) list.get(i3)).intValue());
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
        if (list instanceof zzfr) {
            zzfr zzfrVar = (zzfr) list;
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzy(zzfrVar.zze(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += zzee.zzy(((Long) list.get(i3)).longValue());
                i3++;
            }
        }
        return i2;
    }

    public static zzhd zzm() {
        return zzc;
    }

    public static zzhd zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i2, int i3, Object obj2, zzhd zzhdVar) {
        if (obj2 == null) {
            obj2 = zzhdVar.zzc(obj);
        }
        zzhdVar.zzf(obj2, i2, i3);
        return obj2;
    }

    public static void zzp(zzhd zzhdVar, Object obj, Object obj2) {
        zzhdVar.zzh(obj, zzhdVar.zze(zzhdVar.zzd(obj), zzhdVar.zzd(obj2)));
    }

    public static void zzq(Class cls) {
        Class cls2;
        if (!zzex.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzr(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzc(i2, list, z2);
    }

    public static void zzs(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzg(i2, list, z2);
    }

    public static void zzt(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzj(i2, list, z2);
    }

    public static void zzu(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzl(i2, list, z2);
    }

    public static void zzv(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzn(i2, list, z2);
    }

    public static void zzw(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzp(i2, list, z2);
    }

    public static void zzx(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzs(i2, list, z2);
    }

    public static void zzy(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzu(i2, list, z2);
    }

    public static void zzz(int i2, List list, zzhv zzhvVar, boolean z2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzhvVar.zzx(i2, list, z2);
    }
}
