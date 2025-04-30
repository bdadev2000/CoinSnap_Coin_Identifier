package com.google.android.gms.internal.play_billing;

import com.applovin.impl.L;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeq {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzff zzc;
    private static final zzff zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzff zzffVar = null;
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
                zzffVar = (zzff) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzffVar;
        zzd = new zzfh();
    }

    public static void zzA(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzy(i9, list, z8);
        }
    }

    public static void zzB(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzA(i9, list, z8);
        }
    }

    public static void zzC(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzC(i9, list, z8);
        }
    }

    public static void zzD(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzE(i9, list, z8);
        }
    }

    public static void zzE(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzJ(i9, list, z8);
        }
    }

    public static void zzF(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzL(i9, list, z8);
        }
    }

    public static boolean zzG(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(zzctVar.zze(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzb(int i9, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzby.zzw(i9 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i9, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzby.zzw(i9 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(zzctVar.zze(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzg(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(zzdrVar.zze(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzh(int i9, Object obj, zzeo zzeoVar) {
        int i10 = i9 << 3;
        if (obj instanceof zzdi) {
            int zzw = zzby.zzw(i10);
            int zza2 = ((zzdi) obj).zza();
            return L.y(zza2, zza2, zzw);
        }
        return zzby.zzu((zzec) obj, zzeoVar) + zzby.zzw(i10);
    }

    public static int zzi(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            i9 = 0;
            while (i10 < size) {
                int zze = zzctVar.zze(i10);
                i9 += zzby.zzw((zze >> 31) ^ (zze + zze));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i9 += zzby.zzw((intValue >> 31) ^ (intValue + intValue));
                i10++;
            }
        }
        return i9;
    }

    public static int zzj(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            i9 = 0;
            while (i10 < size) {
                long zze = zzdrVar.zze(i10);
                i9 += zzby.zzx((zze >> 63) ^ (zze + zze));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i9 += zzby.zzx((longValue >> 63) ^ (longValue + longValue));
                i10++;
            }
        }
        return i9;
    }

    public static int zzk(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzct) {
            zzct zzctVar = (zzct) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzw(zzctVar.zze(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzw(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzl(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzdr) {
            zzdr zzdrVar = (zzdr) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(zzdrVar.zze(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzby.zzx(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static zzff zzm() {
        return zzc;
    }

    public static zzff zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i9, int i10, Object obj2, zzff zzffVar) {
        if (obj2 == null) {
            obj2 = zzffVar.zzc(obj);
        }
        zzffVar.zzf(obj2, i9, i10);
        return obj2;
    }

    public static void zzp(zzce zzceVar, Object obj, Object obj2) {
        zzci zzb2 = zzceVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzceVar.zzc(obj).zzh(zzb2);
        }
    }

    public static void zzq(zzff zzffVar, Object obj, Object obj2) {
        zzffVar.zzh(obj, zzffVar.zze(zzffVar.zzd(obj), zzffVar.zzd(obj2)));
    }

    public static void zzr(Class cls) {
        Class cls2;
        if (!zzcs.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzs(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzc(i9, list, z8);
        }
    }

    public static void zzt(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzg(i9, list, z8);
        }
    }

    public static void zzu(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzj(i9, list, z8);
        }
    }

    public static void zzv(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzl(i9, list, z8);
        }
    }

    public static void zzw(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzn(i9, list, z8);
        }
    }

    public static void zzx(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzp(i9, list, z8);
        }
    }

    public static void zzy(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzs(i9, list, z8);
        }
    }

    public static void zzz(int i9, List list, zzfx zzfxVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzfxVar.zzu(i9, list, z8);
        }
    }
}
