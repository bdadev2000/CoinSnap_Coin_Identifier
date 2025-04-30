package com.google.android.gms.internal.ads;

import com.applovin.impl.L;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class zzheb {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zzheq zzc;
    private static final zzheq zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zzheq zzheqVar = null;
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
                zzheqVar = (zzheq) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        zzc = zzheqVar;
        zzd = new zzhes();
    }

    public static void zzA(int i9, List list, zzhfi zzhfiVar, zzhdz zzhdzVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((zzhau) zzhfiVar).zzq(i9, list.get(i10), zzhdzVar);
            }
        }
    }

    public static void zzB(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzs(i9, list, z8);
        }
    }

    public static void zzC(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzu(i9, list, z8);
        }
    }

    public static void zzD(int i9, List list, zzhfi zzhfiVar, zzhdz zzhdzVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ((zzhau) zzhfiVar).zzv(i9, list.get(i10), zzhdzVar);
            }
        }
    }

    public static void zzE(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzy(i9, list, z8);
        }
    }

    public static void zzF(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzA(i9, list, z8);
        }
    }

    public static void zzG(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzC(i9, list, z8);
        }
    }

    public static void zzH(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzE(i9, list, z8);
        }
    }

    public static void zzI(int i9, List list, zzhfi zzhfiVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzH(i9, list);
        }
    }

    public static void zzJ(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzJ(i9, list, z8);
        }
    }

    public static void zzK(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzL(i9, list, z8);
        }
    }

    public static boolean zzL(Object obj, Object obj2) {
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
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(zzhbpVar.zzd(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(((Integer) list.get(i10)).intValue());
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
        return (zzhat.zzD(i9 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i9, List list, boolean z8) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzhat.zzD(i9 << 3) + 8) * size;
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
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(zzhbpVar.zzd(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(((Integer) list.get(i10)).intValue());
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
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(zzhctVar.zza(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static int zzh(int i9, Object obj, zzhdz zzhdzVar) {
        int i10 = i9 << 3;
        if (obj instanceof zzhck) {
            int zzD = zzhat.zzD(i10);
            int zza2 = ((zzhck) obj).zza();
            return L.b(zza2, zza2, zzD);
        }
        return zzhat.zzA((zzhde) obj, zzhdzVar) + zzhat.zzD(i10);
    }

    public static int zzi(List list) {
        int i9;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            i9 = 0;
            while (i10 < size) {
                int zzd2 = zzhbpVar.zzd(i10);
                i9 += zzhat.zzD((zzd2 >> 31) ^ (zzd2 + zzd2));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                int intValue = ((Integer) list.get(i10)).intValue();
                i9 += zzhat.zzD((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            i9 = 0;
            while (i10 < size) {
                long zza2 = zzhctVar.zza(i10);
                i9 += zzhat.zzE((zza2 >> 63) ^ (zza2 + zza2));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                long longValue = ((Long) list.get(i10)).longValue();
                i9 += zzhat.zzE((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzhbp) {
            zzhbp zzhbpVar = (zzhbp) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzD(zzhbpVar.zzd(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzD(((Integer) list.get(i10)).intValue());
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
        if (list instanceof zzhct) {
            zzhct zzhctVar = (zzhct) list;
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(zzhctVar.zza(i10));
                i10++;
            }
        } else {
            i9 = 0;
            while (i10 < size) {
                i9 += zzhat.zzE(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return i9;
    }

    public static zzheq zzm() {
        return zzc;
    }

    public static zzheq zzn() {
        return zzd;
    }

    public static Object zzo(Object obj, int i9, List list, zzhbu zzhbuVar, Object obj2, zzheq zzheqVar) {
        if (zzhbuVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) list.get(i11);
                int intValue = num.intValue();
                if (zzhbuVar.zza(intValue)) {
                    if (i11 != i10) {
                        list.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = zzp(obj, i9, intValue, obj2, zzheqVar);
                }
            }
            if (i10 != size) {
                list.subList(i10, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzhbuVar.zza(intValue2)) {
                    obj2 = zzp(obj, i9, intValue2, obj2, zzheqVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzp(Object obj, int i9, int i10, Object obj2, zzheq zzheqVar) {
        if (obj2 == null) {
            obj2 = zzheqVar.zzc(obj);
        }
        zzheqVar.zzl(obj2, i9, i10);
        return obj2;
    }

    public static void zzq(zzhaz zzhazVar, Object obj, Object obj2) {
        zzhbd zzb2 = zzhazVar.zzb(obj2);
        if (!zzb2.zza.isEmpty()) {
            zzhazVar.zzc(obj).zzj(zzb2);
        }
    }

    public static void zzr(zzheq zzheqVar, Object obj, Object obj2) {
        zzheqVar.zzo(obj, zzheqVar.zze(zzheqVar.zzd(obj), zzheqVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzhbo.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzc(i9, list, z8);
        }
    }

    public static void zzu(int i9, List list, zzhfi zzhfiVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zze(i9, list);
        }
    }

    public static void zzv(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzg(i9, list, z8);
        }
    }

    public static void zzw(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzj(i9, list, z8);
        }
    }

    public static void zzx(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzl(i9, list, z8);
        }
    }

    public static void zzy(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzn(i9, list, z8);
        }
    }

    public static void zzz(int i9, List list, zzhfi zzhfiVar, boolean z8) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzhfiVar.zzp(i9, list, z8);
        }
    }
}
