package com.google.android.gms.internal.ads;

import a4.j;
import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhal<T> implements zzhbb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhbu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhai zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhbn zzm;
    private final zzgyi zzn;

    private zzhal(int[] iArr, Object[] objArr, int i10, int i11, zzhai zzhaiVar, boolean z10, int[] iArr2, int i12, int i13, zzhao zzhaoVar, zzgzv zzgzvVar, zzhbn zzhbnVar, zzgyi zzgyiVar, zzhad zzhadVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzhaiVar instanceof zzgyx;
        boolean z11 = false;
        if (zzgyiVar != null && (zzhaiVar instanceof zzgyt)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzm = zzhbnVar;
        this.zzn = zzgyiVar;
        this.zzg = zzhaiVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzhbb zzx = zzx(i10);
        int zzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzhbb zzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object zze = zzx.zze();
        if (object != null) {
            zzx.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder p10 = j.p("Field ", str, " for ", name, " not found. Known fields are ");
            p10.append(arrays);
            throw new RuntimeException(p10.toString());
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (!zzN(obj2, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j3 = zzu;
        Object object = unsafe.getObject(obj2, j3);
        if (object != null) {
            zzhbb zzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j3, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (!zzR(obj2, i11, i10)) {
            return;
        }
        int zzu = zzu(i10) & 1048575;
        Unsafe unsafe = zzb;
        long j3 = zzu;
        Object object = unsafe.getObject(obj2, j3);
        if (object != null) {
            zzhbb zzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j3, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j3, zze);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j3, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i10, zzhav zzhavVar) throws IOException {
        long j3 = i10 & 1048575;
        if (zzM(i10)) {
            zzhbu.zzv(obj, j3, zzhavVar.zzs());
        } else if (this.zzi) {
            zzhbu.zzv(obj, j3, zzhavVar.zzr());
        } else {
            zzhbu.zzv(obj, j3, zzhavVar.zzp());
        }
    }

    private final void zzH(Object obj, int i10) {
        int zzr = zzr(i10);
        long j3 = 1048575 & zzr;
        if (j3 == 1048575) {
            return;
        }
        zzhbu.zzt(obj, j3, (1 << (zzr >>> 20)) | zzhbu.zzd(obj, j3));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzhbu.zzt(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int zzr = zzr(i10);
        long j3 = zzr & 1048575;
        if (j3 == 1048575) {
            int zzu = zzu(i10);
            long j10 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhbu.zzb(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhbu.zzc(obj, j10)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhbu.zzf(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhbu.zzf(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhbu.zzf(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhbu.zzz(obj, j10);
                case 8:
                    Object zzh = zzhbu.zzh(obj, j10);
                    if (zzh instanceof String) {
                        if (((String) zzh).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzh instanceof zzgxp) {
                        if (zzgxp.zzb.equals(zzh)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzhbu.zzh(obj, j10) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzgxp.zzb.equals(zzhbu.zzh(obj, j10))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhbu.zzf(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhbu.zzd(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhbu.zzf(obj, j10) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhbu.zzh(obj, j10) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhbu.zzd(obj, j3) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzhbb zzhbbVar) {
        return zzhbbVar.zzl(zzhbu.zzh(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzgyx) {
            return ((zzgyx) obj).zzcf();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        if (zzhbu.zzd(obj, zzr(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j3) {
        return ((Boolean) zzhbu.zzh(obj, j3)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzhcc zzhccVar) throws IOException {
        if (obj instanceof String) {
            zzhccVar.zzG(i10, (String) obj);
        } else {
            zzhccVar.zzd(i10, (zzgxp) obj);
        }
    }

    public static zzhbo zzd(Object obj) {
        zzgyx zzgyxVar = (zzgyx) obj;
        zzhbo zzhboVar = zzgyxVar.zzt;
        if (zzhboVar == zzhbo.zzc()) {
            zzhbo zzf = zzhbo.zzf();
            zzgyxVar.zzt = zzf;
            return zzf;
        }
        return zzhboVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhal zzm(java.lang.Class r33, com.google.android.gms.internal.ads.zzhaf r34, com.google.android.gms.internal.ads.zzhao r35, com.google.android.gms.internal.ads.zzgzv r36, com.google.android.gms.internal.ads.zzhbn r37, com.google.android.gms.internal.ads.zzgyi r38, com.google.android.gms.internal.ads.zzhad r39) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhaf, com.google.android.gms.internal.ads.zzhao, com.google.android.gms.internal.ads.zzgzv, com.google.android.gms.internal.ads.zzhbn, com.google.android.gms.internal.ads.zzgyi, com.google.android.gms.internal.ads.zzhad):com.google.android.gms.internal.ads.zzhal");
    }

    private static double zzn(Object obj, long j3) {
        return ((Double) zzhbu.zzh(obj, j3)).doubleValue();
    }

    private static float zzo(Object obj, long j3) {
        return ((Float) zzhbu.zzh(obj, j3)).floatValue();
    }

    private static int zzp(Object obj, long j3) {
        return ((Integer) zzhbu.zzh(obj, j3)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j3) {
        return ((Long) zzhbu.zzh(obj, j3)).longValue();
    }

    private final zzgzd zzw(int i10) {
        int i11 = i10 / 3;
        return (zzgzd) this.zzd[i11 + i11 + 1];
    }

    private final zzhbb zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzhbb zzhbbVar = (zzhbb) objArr[i12];
        if (zzhbbVar != null) {
            return zzhbbVar;
        }
        zzhbb zzb2 = zzhas.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zzhbn zzhbnVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object zzh = zzhbu.zzh(obj, zzu(i10) & 1048575);
        if (zzh == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x005b. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zza(Object obj) {
        int i10;
        int i11;
        int i12;
        int i13;
        int zzD;
        int zzD2;
        int zzD3;
        int zzE;
        int zzD4;
        int zzD5;
        int zzd;
        int zzD6;
        int zzh;
        int i14;
        int size;
        int zzl;
        int zzD7;
        int zzD8;
        int i15;
        int i16;
        Unsafe unsafe = zzb;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 1048575;
        int i21 = 1048575;
        int i22 = 0;
        while (i18 < this.zzc.length) {
            int zzu = zzu(i18);
            int zzt = zzt(zzu);
            int[] iArr = this.zzc;
            int i23 = iArr[i18];
            int i24 = iArr[i18 + 2];
            int i25 = i24 & i20;
            if (zzt <= 17) {
                if (i25 != i21) {
                    if (i25 == i20) {
                        i17 = i22;
                        i10 = i17;
                    } else {
                        i10 = i22;
                        i17 = unsafe.getInt(obj, i25);
                    }
                    i21 = i25;
                } else {
                    i10 = i22;
                }
                int i26 = 1 << (i24 >>> 20);
                i11 = i17;
                i13 = i26;
                i12 = i21;
            } else {
                i10 = i22;
                i11 = i17;
                i12 = i21;
                i13 = i10;
            }
            int i27 = zzu & i20;
            if (zzt >= zzgyn.zzJ.zza()) {
                zzgyn.zzW.zza();
            }
            long j3 = i27;
            switch (zzt) {
                case 0:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 1:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 2:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j10 = unsafe.getLong(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(j10);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 3:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j11 = unsafe.getLong(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(j11);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 4:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j12 = unsafe.getInt(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(j12);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 5:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 6:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 7:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD4 = zzgyc.zzD(i23 << 3);
                        zzh = zzD4 + 1;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 8:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i28 = i23 << 3;
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof zzgxp) {
                            zzD5 = zzgyc.zzD(i28);
                            zzd = ((zzgxp) object).zzd();
                            zzD6 = zzgyc.zzD(zzd);
                            i19 = j.a(zzD6, zzd, zzD5, i19);
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        } else {
                            zzD3 = zzgyc.zzD(i28);
                            zzE = zzgyc.zzC((String) object);
                            i19 = zzE + zzD3 + i19;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        }
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 9:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzhbd.zzh(i23, unsafe.getObject(obj, j3), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 10:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzgxp zzgxpVar = (zzgxp) unsafe.getObject(obj, j3);
                        zzD5 = zzgyc.zzD(i23 << 3);
                        zzd = zzgxpVar.zzd();
                        zzD6 = zzgyc.zzD(zzd);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 11:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i29 = unsafe.getInt(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzD(i29);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 12:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j13 = unsafe.getInt(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(j13);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 13:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 14:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 15:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        int i30 = unsafe.getInt(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzD((i30 >> 31) ^ (i30 + i30));
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 16:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        long j14 = unsafe.getLong(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE((j14 >> 63) ^ (j14 + j14));
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 17:
                    if (zzO(obj, i18, i12, i11, i13)) {
                        zzh = zzgyc.zzy(i23, (zzhai) unsafe.getObject(obj, j3), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 18:
                    zzh = zzhbd.zzd(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 19:
                    zzh = zzhbd.zzb(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 20:
                    i14 = i10;
                    List list = (List) unsafe.getObject(obj, j3);
                    int i31 = zzhbd.zza;
                    if (list.size() != 0) {
                        i14 = (zzgyc.zzD(i23 << 3) * list.size()) + zzhbd.zzg(list);
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 21:
                    i14 = i10;
                    List list2 = (List) unsafe.getObject(obj, j3);
                    int i32 = zzhbd.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzhbd.zzl(list2);
                        zzD7 = zzgyc.zzD(i23 << 3);
                        int i33 = size;
                        i15 = zzD7;
                        i16 = i33;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 22:
                    i14 = i10;
                    List list3 = (List) unsafe.getObject(obj, j3);
                    int i34 = zzhbd.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzhbd.zzf(list3);
                        zzD7 = zzgyc.zzD(i23 << 3);
                        int i332 = size;
                        i15 = zzD7;
                        i16 = i332;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 23:
                    zzh = zzhbd.zzd(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 24:
                    zzh = zzhbd.zzb(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 25:
                    i14 = i10;
                    List list4 = (List) unsafe.getObject(obj, j3);
                    int i35 = zzhbd.zza;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        i14 = (zzgyc.zzD(i23 << 3) + 1) * size2;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 26:
                    i14 = i10;
                    List list5 = (List) unsafe.getObject(obj, j3);
                    int i36 = zzhbd.zza;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        zzD8 = zzgyc.zzD(i23 << 3) * size3;
                        if (list5 instanceof zzgzu) {
                            zzgzu zzgzuVar = (zzgzu) list5;
                            while (i14 < size3) {
                                Object zzc = zzgzuVar.zzc();
                                if (zzc instanceof zzgxp) {
                                    int zzd2 = ((zzgxp) zzc).zzd();
                                    zzD8 = zzgyc.zzD(zzd2) + zzd2 + zzD8;
                                } else {
                                    zzD8 = zzgyc.zzC((String) zzc) + zzD8;
                                }
                                i14++;
                            }
                        } else {
                            while (i14 < size3) {
                                Object obj2 = list5.get(i14);
                                if (obj2 instanceof zzgxp) {
                                    int zzd3 = ((zzgxp) obj2).zzd();
                                    zzD8 = zzgyc.zzD(zzd3) + zzd3 + zzD8;
                                } else {
                                    zzD8 = zzgyc.zzC((String) obj2) + zzD8;
                                }
                                i14++;
                            }
                        }
                        i14 = zzD8;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 27:
                    i14 = i10;
                    List list6 = (List) unsafe.getObject(obj, j3);
                    zzhbb zzx = zzx(i18);
                    int i37 = zzhbd.zza;
                    int size4 = list6.size();
                    if (size4 != 0) {
                        int zzD9 = zzgyc.zzD(i23 << 3) * size4;
                        while (i14 < size4) {
                            Object obj3 = list6.get(i14);
                            if (obj3 instanceof zzgzt) {
                                int zza2 = ((zzgzt) obj3).zza();
                                zzD9 = zzgyc.zzD(zza2) + zza2 + zzD9;
                            } else {
                                zzD9 = zzgyc.zzA((zzhai) obj3, zzx) + zzD9;
                            }
                            i14++;
                        }
                        i14 = zzD9;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 28:
                    i14 = i10;
                    List list7 = (List) unsafe.getObject(obj, j3);
                    int i38 = zzhbd.zza;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        zzD8 = zzgyc.zzD(i23 << 3) * size5;
                        while (i14 < list7.size()) {
                            int zzd4 = ((zzgxp) list7.get(i14)).zzd();
                            zzD8 += zzgyc.zzD(zzd4) + zzd4;
                            i14++;
                        }
                        i14 = zzD8;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case NOTIFICATION_REDIRECT_VALUE:
                    i14 = i10;
                    List list8 = (List) unsafe.getObject(obj, j3);
                    int i39 = zzhbd.zza;
                    size = list8.size();
                    if (size != 0) {
                        zzl = zzhbd.zzk(list8);
                        zzD7 = zzgyc.zzD(i23 << 3);
                        int i3322 = size;
                        i15 = zzD7;
                        i16 = i3322;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 30:
                    i14 = i10;
                    List list9 = (List) unsafe.getObject(obj, j3);
                    int i40 = zzhbd.zza;
                    size = list9.size();
                    if (size != 0) {
                        zzl = zzhbd.zza(list9);
                        zzD7 = zzgyc.zzD(i23 << 3);
                        int i33222 = size;
                        i15 = zzD7;
                        i16 = i33222;
                        i14 = (i15 * i16) + zzl;
                    }
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case TEMPLATE_HTML_SIZE_VALUE:
                    zzh = zzhbd.zzb(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 32:
                    zzh = zzhbd.zzd(i23, (List) unsafe.getObject(obj, j3), i10);
                    i19 += zzh;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 33:
                    List list10 = (List) unsafe.getObject(obj, j3);
                    int i41 = zzhbd.zza;
                    i16 = list10.size();
                    if (i16 != 0) {
                        zzl = zzhbd.zzi(list10);
                        i15 = zzgyc.zzD(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    List list11 = (List) unsafe.getObject(obj, j3);
                    int i42 = zzhbd.zza;
                    i16 = list11.size();
                    if (i16 != 0) {
                        zzl = zzhbd.zzj(list11);
                        i15 = zzgyc.zzD(i23 << 3);
                        i14 = (i15 * i16) + zzl;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    zzD5 = zzhbd.zze((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 36:
                    zzD5 = zzhbd.zzc((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    zzD5 = zzhbd.zzg((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzD5 = zzhbd.zzl((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    zzD5 = zzhbd.zzf((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    zzD5 = zzhbd.zze((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    zzD5 = zzhbd.zzc((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    List list12 = (List) unsafe.getObject(obj, j3);
                    int i43 = zzhbd.zza;
                    zzD5 = list12.size();
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzD5 = zzhbd.zzk((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    zzD5 = zzhbd.zza((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    zzD5 = zzhbd.zzc((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzD5 = zzhbd.zze((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzD5 = zzhbd.zzi((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 48:
                    zzD5 = zzhbd.zzj((List) unsafe.getObject(obj, j3));
                    if (zzD5 > 0) {
                        zzd = zzgyc.zzD(i23 << 3);
                        zzD6 = zzgyc.zzD(zzD5);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j3);
                    zzhbb zzx2 = zzx(i18);
                    int i44 = zzhbd.zza;
                    int size6 = list13.size();
                    if (size6 != 0) {
                        zzD8 = i10;
                        while (i10 < size6) {
                            zzD8 += zzgyc.zzy(i23, (zzhai) list13.get(i10), zzx2);
                            i10++;
                        }
                        i14 = zzD8;
                        i19 += i14;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                    i14 = i10;
                    i19 += i14;
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    zzhac zzhacVar = (zzhac) unsafe.getObject(obj, j3);
                    if (zzhacVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzhacVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
                case 51:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 52:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 53:
                    if (zzR(obj, i23, i18)) {
                        long zzv = zzv(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(zzv);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 54:
                    if (zzR(obj, i23, i18)) {
                        long zzv2 = zzv(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(zzv2);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 55:
                    if (zzR(obj, i23, i18)) {
                        long zzp = zzp(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(zzp);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 56:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 57:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 58:
                    if (zzR(obj, i23, i18)) {
                        zzD4 = zzgyc.zzD(i23 << 3);
                        zzh = zzD4 + 1;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 59:
                    if (zzR(obj, i23, i18)) {
                        int i45 = i23 << 3;
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof zzgxp) {
                            zzD5 = zzgyc.zzD(i45);
                            zzd = ((zzgxp) object2).zzd();
                            zzD6 = zzgyc.zzD(zzd);
                            i19 = j.a(zzD6, zzd, zzD5, i19);
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        } else {
                            zzD3 = zzgyc.zzD(i45);
                            zzE = zzgyc.zzC((String) object2);
                            i19 = zzE + zzD3 + i19;
                            i18 += 3;
                            i22 = 0;
                            i20 = 1048575;
                            i17 = i11;
                            i21 = i12;
                        }
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzhbd.zzh(i23, unsafe.getObject(obj, j3), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i23, i18)) {
                        zzgxp zzgxpVar2 = (zzgxp) unsafe.getObject(obj, j3);
                        zzD5 = zzgyc.zzD(i23 << 3);
                        zzd = zzgxpVar2.zzd();
                        zzD6 = zzgyc.zzD(zzd);
                        i19 = j.a(zzD6, zzd, zzD5, i19);
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 62:
                    if (zzR(obj, i23, i18)) {
                        int zzp2 = zzp(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzD(zzp2);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 63:
                    if (zzR(obj, i23, i18)) {
                        long zzp3 = zzp(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE(zzp3);
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 64:
                    if (zzR(obj, i23, i18)) {
                        zzD2 = zzgyc.zzD(i23 << 3);
                        zzh = zzD2 + 4;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 65:
                    if (zzR(obj, i23, i18)) {
                        zzD = zzgyc.zzD(i23 << 3);
                        zzh = zzD + 8;
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 66:
                    if (zzR(obj, i23, i18)) {
                        int zzp4 = zzp(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzD((zzp4 >> 31) ^ (zzp4 + zzp4));
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 67:
                    if (zzR(obj, i23, i18)) {
                        long zzv3 = zzv(obj, j3);
                        zzD3 = zzgyc.zzD(i23 << 3);
                        zzE = zzgyc.zzE((zzv3 >> 63) ^ (zzv3 + zzv3));
                        i19 = zzE + zzD3 + i19;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                case 68:
                    if (zzR(obj, i23, i18)) {
                        zzh = zzgyc.zzy(i23, (zzhai) unsafe.getObject(obj, j3), zzx(i18));
                        i19 += zzh;
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    } else {
                        i18 += 3;
                        i22 = 0;
                        i20 = 1048575;
                        i17 = i11;
                        i21 = i12;
                    }
                default:
                    i18 += 3;
                    i22 = 0;
                    i20 = 1048575;
                    i17 = i11;
                    i21 = i12;
            }
        }
        int zza3 = ((zzgyx) obj).zzt.zza() + i19;
        if (this.zzh) {
            zzgym zzgymVar = ((zzgyt) obj).zza;
            int zzc2 = zzgymVar.zza.zzc();
            int i46 = 0;
            for (int i47 = 0; i47 < zzc2; i47++) {
                Map.Entry zzg = zzgymVar.zza.zzg(i47);
                i46 += zzgym.zzc((zzgyl) ((zzhbf) zzg).zza(), zzg.getValue());
            }
            for (Map.Entry entry2 : zzgymVar.zza.zzd()) {
                i46 += zzgym.zzc((zzgyl) entry2.getKey(), entry2.getValue());
            }
            return zza3 + i46;
        }
        return zza3;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhbb
    public final int zzb(Object obj) {
        int i10;
        long doubleToLongBits;
        int i11;
        int floatToIntBits;
        int zzd;
        int i12;
        int i13 = 0;
        for (int i14 = 0; i14 < this.zzc.length; i14 += 3) {
            int zzu = zzu(i14);
            int[] iArr = this.zzc;
            int i15 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i16 = iArr[i14];
            long j3 = i15;
            int i17 = 37;
            switch (zzt) {
                case 0:
                    i10 = i13 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhbu.zzb(obj, j3));
                    byte[] bArr = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 1:
                    i11 = i13 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhbu.zzc(obj, j3));
                    i13 = floatToIntBits + i11;
                    break;
                case 2:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhbu.zzf(obj, j3);
                    byte[] bArr2 = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 3:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhbu.zzf(obj, j3);
                    byte[] bArr3 = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 4:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 5:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhbu.zzf(obj, j3);
                    byte[] bArr4 = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 6:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 7:
                    i11 = i13 * 53;
                    floatToIntBits = zzgzk.zza(zzhbu.zzz(obj, j3));
                    i13 = floatToIntBits + i11;
                    break;
                case 8:
                    i11 = i13 * 53;
                    floatToIntBits = ((String) zzhbu.zzh(obj, j3)).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 9:
                    i12 = i13 * 53;
                    Object zzh = zzhbu.zzh(obj, j3);
                    if (zzh != null) {
                        i17 = zzh.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 10:
                    i11 = i13 * 53;
                    floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 11:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 12:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 13:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 14:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhbu.zzf(obj, j3);
                    byte[] bArr5 = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 15:
                    i10 = i13 * 53;
                    zzd = zzhbu.zzd(obj, j3);
                    i13 = i10 + zzd;
                    break;
                case 16:
                    i10 = i13 * 53;
                    doubleToLongBits = zzhbu.zzf(obj, j3);
                    byte[] bArr6 = zzgzk.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i13 = i10 + zzd;
                    break;
                case 17:
                    i12 = i13 * 53;
                    Object zzh2 = zzhbu.zzh(obj, j3);
                    if (zzh2 != null) {
                        i17 = zzh2.hashCode();
                    }
                    i13 = i12 + i17;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case NOTIFICATION_REDIRECT_VALUE:
                case 30:
                case TEMPLATE_HTML_SIZE_VALUE:
                case 32:
                case 33:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case 36:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i11 = i13 * 53;
                    floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i11 = i13 * 53;
                    floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                    i13 = floatToIntBits + i11;
                    break;
                case 51:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j3));
                        byte[] bArr7 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j3));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr8 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr9 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr10 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzgzk.zza(zzS(obj, j3));
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = ((String) zzhbu.zzh(obj, j3)).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr11 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        zzd = zzp(obj, j3);
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i16, i14)) {
                        i10 = i13 * 53;
                        doubleToLongBits = zzv(obj, j3);
                        byte[] bArr12 = zzgzk.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i13 = i10 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i16, i14)) {
                        i11 = i13 * 53;
                        floatToIntBits = zzhbu.zzh(obj, j3).hashCode();
                        i13 = floatToIntBits + i11;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzgyx) obj).zzt.hashCode() + (i13 * 53);
        if (this.zzh) {
            return (hashCode * 53) + ((zzgyt) obj).zza.zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0b87, code lost:
    
        if (r5 == 1048575) goto L491;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0b89, code lost:
    
        r13.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0b8d, code lost:
    
        r10 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0b92, code lost:
    
        if (r10 >= r6.zzl) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0b94, code lost:
    
        zzy(r34, r6.zzj[r10], null, r6.zzm, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0ba9, code lost:
    
        if (r9 != 0) goto L501;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0bab, code lost:
    
        if (r8 != r14) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0bb3, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgzm("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0bb8, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0bb4, code lost:
    
        if (r8 > r14) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0bb6, code lost:
    
        if (r11 != r9) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0bbe, code lost:
    
        throw new com.google.android.gms.internal.ads.zzgzm("Failed to parse the message.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:158:0x039d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x08c6. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:502:0x00af. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:168:0x085c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x086d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0b00 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0b15 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgxd r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3152
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgxd):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final Object zze() {
        return ((zzgyx) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzgyx) {
                zzgyx zzgyxVar = (zzgyx) obj;
                zzgyxVar.zzbV();
                zzgyxVar.zzbU();
                zzgyxVar.zzbX();
            }
            int[] iArr = this.zzc;
            for (int i10 = 0; i10 < iArr.length; i10 += 3) {
                int zzu = zzu(i10);
                int i11 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j3 = i11;
                if (zzt != 9) {
                    if (zzt != 60 && zzt != 68) {
                        switch (zzt) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case NOTIFICATION_REDIRECT_VALUE:
                            case 30:
                            case TEMPLATE_HTML_SIZE_VALUE:
                            case 32:
                            case 33:
                            case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                            case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                            case 36:
                            case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                            case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                            case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                            case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                            case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
                                ((zzgzj) zzhbu.zzh(obj, j3)).zzb();
                                break;
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j3);
                                if (object != null) {
                                    ((zzhac) object).zzc();
                                    unsafe.putObject(obj, j3, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i10], i10)) {
                        zzx(i10).zzf(zzb.getObject(obj, j3));
                    }
                }
                if (zzN(obj, i10)) {
                    zzx(i10).zzf(zzb.getObject(obj, j3));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzu = zzu(i10);
            int i11 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i12 = iArr[i10];
            long j3 = i11;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzr(obj, j3, zzhbu.zzb(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzs(obj, j3, zzhbu.zzc(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzu(obj, j3, zzhbu.zzf(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzu(obj, j3, zzhbu.zzf(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzu(obj, j3, zzhbu.zzf(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzp(obj, j3, zzhbu.zzz(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzv(obj, j3, zzhbu.zzh(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i10);
                    break;
                case 10:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzv(obj, j3, zzhbu.zzh(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzu(obj, j3, zzhbu.zzf(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzt(obj, j3, zzhbu.zzd(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i10)) {
                        zzhbu.zzu(obj, j3, zzhbu.zzf(obj2, j3));
                        zzH(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case NOTIFICATION_REDIRECT_VALUE:
                case 30:
                case TEMPLATE_HTML_SIZE_VALUE:
                case 32:
                case 33:
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                case 36:
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    zzgzj zzgzjVar = (zzgzj) zzhbu.zzh(obj, j3);
                    zzgzj zzgzjVar2 = (zzgzj) zzhbu.zzh(obj2, j3);
                    int size = zzgzjVar.size();
                    int size2 = zzgzjVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzgzjVar.zzc()) {
                            zzgzjVar = zzgzjVar.zzf(size2 + size);
                        }
                        zzgzjVar.addAll(zzgzjVar2);
                    }
                    if (size > 0) {
                        zzgzjVar2 = zzgzjVar;
                    }
                    zzhbu.zzv(obj, j3, zzgzjVar2);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    int i13 = zzhbd.zza;
                    zzhbu.zzv(obj, j3, zzhad.zzb(zzhbu.zzh(obj, j3), zzhbu.zzh(obj2, j3)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzR(obj2, i12, i10)) {
                        zzhbu.zzv(obj, j3, zzhbu.zzh(obj2, j3));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzF(obj, obj2, i10);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i12, i10)) {
                        zzhbu.zzv(obj, j3, zzhbu.zzh(obj2, j3));
                        zzI(obj, i12, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i10);
                    break;
            }
        }
        zzhbd.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzhbd.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0071. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:315:0x051a A[LOOP:5: B:313:0x0516->B:315:0x051a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x052b  */
    @Override // com.google.android.gms.internal.ads.zzhbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r11, com.google.android.gms.internal.ads.zzhav r12, com.google.android.gms.internal.ads.zzgyh r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhav, com.google.android.gms.internal.ads.zzgyh):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        zzc(obj, bArr, i10, i11, 0, zzgxdVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzhbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzhcc r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhcc):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhal.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhbb
    public final boolean zzl(Object obj) {
        int i10;
        int i11;
        int i12 = 0;
        int i13 = 0;
        int i14 = 1048575;
        while (i13 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i15 = iArr[i13];
            int i16 = iArr2[i15];
            int zzu = zzu(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i14) {
                if (i18 != 1048575) {
                    i12 = zzb.getInt(obj, i18);
                }
                i11 = i12;
                i10 = i18;
            } else {
                i10 = i14;
                i11 = i12;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzhac) zzhbu.zzh(obj, zzu & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i16, i15) && !zzP(obj, zzu, zzx(i15))) {
                        return false;
                    }
                }
                List list = (List) zzhbu.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhbb zzx = zzx(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzx.zzl(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i15, i10, i11, i19) && !zzP(obj, zzu, zzx(i15))) {
                return false;
            }
            i13++;
            i14 = i10;
            i12 = i11;
        }
        if (this.zzh && !((zzgyt) obj).zza.zzi()) {
            return false;
        }
        return true;
    }
}
