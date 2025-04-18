package com.google.android.gms.internal.play_billing;

import androidx.compose.foundation.text.input.a;
import com.applovin.impl.adview.t;
import com.google.android.gms.common.api.Api;
import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zzgf<T> implements zzgm<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhn.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgc zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfq zzl;
    private final zzhd zzm;
    private final zzek zzn;
    private final zzgh zzo;
    private final zzfx zzp;

    private zzgf(int[] iArr, Object[] objArr, int i2, int i3, zzgc zzgcVar, int i4, boolean z2, int[] iArr2, int i5, int i6, zzgh zzghVar, zzfq zzfqVar, zzhd zzhdVar, zzek zzekVar, zzfx zzfxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        boolean z3 = false;
        if (zzekVar != null && zzekVar.zzc(zzgcVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzi = iArr2;
        this.zzj = i5;
        this.zzk = i6;
        this.zzo = zzghVar;
        this.zzl = zzfqVar;
        this.zzm = zzhdVar;
        this.zzn = zzekVar;
        this.zzg = zzgcVar;
        this.zzp = zzfxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i2) {
        if (zzI(obj2, i2)) {
            int zzs = zzs(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzgm zzv = zzv(i2);
            if (!zzI(obj, i2)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzD(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzM(obj2, i3, i2)) {
            int zzs = zzs(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzs;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzgm zzv = zzv(i2);
            if (!zzM(obj, i3, i2)) {
                if (zzL(object)) {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzE(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i2) {
        int zzp = zzp(i2);
        long j2 = 1048575 & zzp;
        if (j2 == 1048575) {
            return;
        }
        zzhn.zzq(obj, j2, (1 << (zzp >>> 20)) | zzhn.zzc(obj, j2));
    }

    private final void zzE(Object obj, int i2, int i3) {
        zzhn.zzq(obj, zzp(i3) & 1048575, i2);
    }

    private final void zzF(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzs(i2) & 1048575, obj2);
        zzD(obj, i2);
    }

    private final void zzG(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzs(i3) & 1048575, obj2);
        zzE(obj, i2, i3);
    }

    private final boolean zzH(Object obj, Object obj2, int i2) {
        return zzI(obj, i2) == zzI(obj2, i2);
    }

    private final boolean zzI(Object obj, int i2) {
        int zzp = zzp(i2);
        long j2 = zzp & 1048575;
        if (j2 != 1048575) {
            return (zzhn.zzc(obj, j2) & (1 << (zzp >>> 20))) != 0;
        }
        int zzs = zzs(i2);
        long j3 = zzs & 1048575;
        switch (zzr(zzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzhn.zza(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhn.zzb(obj, j3)) != 0;
            case 2:
                return zzhn.zzd(obj, j3) != 0;
            case 3:
                return zzhn.zzd(obj, j3) != 0;
            case 4:
                return zzhn.zzc(obj, j3) != 0;
            case 5:
                return zzhn.zzd(obj, j3) != 0;
            case 6:
                return zzhn.zzc(obj, j3) != 0;
            case 7:
                return zzhn.zzw(obj, j3);
            case 8:
                Object zzf = zzhn.zzf(obj, j3);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                }
                if (zzf instanceof zzdw) {
                    return !zzdw.zzb.equals(zzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhn.zzf(obj, j3) != null;
            case 10:
                return !zzdw.zzb.equals(zzhn.zzf(obj, j3));
            case 11:
                return zzhn.zzc(obj, j3) != 0;
            case 12:
                return zzhn.zzc(obj, j3) != 0;
            case 13:
                return zzhn.zzc(obj, j3) != 0;
            case 14:
                return zzhn.zzd(obj, j3) != 0;
            case 15:
                return zzhn.zzc(obj, j3) != 0;
            case 16:
                return zzhn.zzd(obj, j3) != 0;
            case 17:
                return zzhn.zzf(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzI(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzK(Object obj, int i2, zzgm zzgmVar) {
        return zzgmVar.zzk(zzhn.zzf(obj, i2 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzex) {
            return ((zzex) obj).zzt();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i2, int i3) {
        return zzhn.zzc(obj, (long) (zzp(i3) & 1048575)) == i2;
    }

    private static boolean zzN(Object obj, long j2) {
        return ((Boolean) zzhn.zzf(obj, j2)).booleanValue();
    }

    private static final void zzO(int i2, Object obj, zzhv zzhvVar) throws IOException {
        if (obj instanceof String) {
            zzhvVar.zzF(i2, (String) obj);
        } else {
            zzhvVar.zzd(i2, (zzdw) obj);
        }
    }

    public static zzhe zzd(Object obj) {
        zzex zzexVar = (zzex) obj;
        zzhe zzheVar = zzexVar.zzc;
        if (zzheVar != zzhe.zzc()) {
            return zzheVar;
        }
        zzhe zzf = zzhe.zzf();
        zzexVar.zzc = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.zzgf zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzfz r34, com.google.android.gms.internal.play_billing.zzgh r35, com.google.android.gms.internal.play_billing.zzfq r36, com.google.android.gms.internal.play_billing.zzhd r37, com.google.android.gms.internal.play_billing.zzek r38, com.google.android.gms.internal.play_billing.zzfx r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgf.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzfz, com.google.android.gms.internal.play_billing.zzgh, com.google.android.gms.internal.play_billing.zzfq, com.google.android.gms.internal.play_billing.zzhd, com.google.android.gms.internal.play_billing.zzek, com.google.android.gms.internal.play_billing.zzfx):com.google.android.gms.internal.play_billing.zzgf");
    }

    private static double zzm(Object obj, long j2) {
        return ((Double) zzhn.zzf(obj, j2)).doubleValue();
    }

    private static float zzn(Object obj, long j2) {
        return ((Float) zzhn.zzf(obj, j2)).floatValue();
    }

    private static int zzo(Object obj, long j2) {
        return ((Integer) zzhn.zzf(obj, j2)).intValue();
    }

    private final int zzp(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzq(int i2, int i3) {
        int length = (this.zzc.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.zzc[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private static int zzr(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzt(Object obj, long j2) {
        return ((Long) zzhn.zzf(obj, j2)).longValue();
    }

    private final zzfb zzu(int i2) {
        int i3 = i2 / 3;
        return (zzfb) this.zzd[i3 + i3 + 1];
    }

    private final zzgm zzv(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzgm zzgmVar = (zzgm) objArr[i4];
        if (zzgmVar != null) {
            return zzgmVar;
        }
        zzgm zzb2 = zzgk.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    private final Object zzx(Object obj, int i2) {
        zzgm zzv = zzv(i2);
        int zzs = zzs(i2) & 1048575;
        if (!zzI(obj, i2)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private final Object zzy(Object obj, int i2, int i3) {
        zzgm zzv = zzv(i3);
        if (!zzM(obj, i2, i3)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i3) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object zze = zzv.zze();
        if (object != null) {
            zzv.zzg(zze, object);
        }
        return zze;
    }

    private static Field zzz(Class cls, String str) {
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
            StringBuilder t2 = a.t("Field ", str, " for ", name, " not found. Known fields are ");
            t2.append(arrays);
            throw new RuntimeException(t2.toString());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0056. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final int zza(Object obj) {
        int i2;
        int i3;
        int i4;
        int zzh;
        int zzx;
        int zzy;
        int zzt;
        boolean z2;
        int zzd;
        int zzx2;
        int size;
        int zzl;
        int zzx3;
        boolean z3;
        int zzb2;
        int zzx4;
        int zzx5;
        int size2;
        int zzk;
        int zzx6;
        int zzx7;
        int zzx8;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzs = zzs(i8);
            int zzr = zzr(zzs);
            int[] iArr = this.zzc;
            int i10 = iArr[i8];
            int i11 = iArr[i8 + 2];
            int i12 = i11 & i5;
            if (zzr <= 17) {
                if (i12 != i6) {
                    i7 = i12 == i5 ? 0 : unsafe.getInt(obj, i12);
                    i6 = i12;
                }
                i4 = 1 << (i11 >>> 20);
                i2 = i6;
                i3 = i7;
            } else {
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            int i13 = zzs & i5;
            if (zzr >= zzep.zzJ.zza()) {
                zzep.zzW.zza();
            }
            long j2 = i13;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 1:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 2:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, zzee.zzy(unsafe.getLong(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 3:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, zzee.zzy(unsafe.getLong(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 4:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, zzee.zzu(unsafe.getInt(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 5:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 6:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 7:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 1, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 8:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof zzdw) {
                            int i15 = zzee.zzb;
                            int zzd2 = ((zzdw) object).zzd();
                            i9 = t.z(i14, zzee.zzx(zzd2) + zzd2, i9);
                        } else {
                            i9 = t.z(i14, zzee.zzw((String) object), i9);
                        }
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 9:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzh = zzgo.zzh(i10, unsafe.getObject(obj, j2), zzv(i8));
                        i9 += zzh;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 10:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzdw zzdwVar = (zzdw) unsafe.getObject(obj, j2);
                        int i16 = zzee.zzb;
                        int zzd3 = zzdwVar.zzd();
                        i9 = t.z(i10 << 3, zzee.zzx(zzd3) + zzd3, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 11:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, zzee.zzx(unsafe.getInt(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 12:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, zzee.zzu(unsafe.getInt(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 13:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 14:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 15:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        int i17 = unsafe.getInt(obj, j2);
                        i9 = t.z((i17 >> 31) ^ (i17 + i17), zzee.zzx(i10 << 3), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 16:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        long j3 = unsafe.getLong(obj, j2);
                        zzx = zzee.zzx(i10 << 3);
                        zzy = zzee.zzy((j3 >> 63) ^ (j3 + j3));
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 17:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzt = zzee.zzt(i10, (zzgc) unsafe.getObject(obj, j2), zzv(i8));
                        i9 += zzt;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 18:
                    z2 = false;
                    zzd = zzgo.zzd(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzd;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 19:
                    z2 = false;
                    zzd = zzgo.zzb(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzd;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(obj, j2);
                    int i18 = zzgo.zza;
                    if (list.size() != 0) {
                        zzx2 = (zzee.zzx(i10 << 3) * list.size()) + zzgo.zzg(list);
                        i9 += zzx2;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx2 = 0;
                    i9 += zzx2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(obj, j2);
                    int i19 = zzgo.zza;
                    size = list2.size();
                    if (size != 0) {
                        zzl = zzgo.zzl(list2);
                        zzx3 = zzee.zzx(i10 << 3);
                        zzx2 = (zzx3 * size) + zzl;
                        i9 += zzx2;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx2 = 0;
                    i9 += zzx2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(obj, j2);
                    int i20 = zzgo.zza;
                    size = list3.size();
                    if (size != 0) {
                        zzl = zzgo.zzf(list3);
                        zzx3 = zzee.zzx(i10 << 3);
                        zzx2 = (zzx3 * size) + zzl;
                        i9 += zzx2;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx2 = 0;
                    i9 += zzx2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 23:
                    zzh = zzgo.zzd(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 24:
                    z3 = false;
                    zzb2 = zzgo.zzb(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzb2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(obj, j2);
                    int i21 = zzgo.zza;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        zzh = size3 * (zzee.zzx(i10 << 3) + 1);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(obj, j2);
                    int i22 = zzgo.zza;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        boolean z4 = list5 instanceof zzfk;
                        int zzx9 = zzee.zzx(i10 << 3) * size4;
                        if (z4) {
                            zzfk zzfkVar = (zzfk) list5;
                            zzx2 = zzx9;
                            for (int i23 = 0; i23 < size4; i23++) {
                                Object zzf = zzfkVar.zzf(i23);
                                if (zzf instanceof zzdw) {
                                    int zzd4 = ((zzdw) zzf).zzd();
                                    zzx2 = t.z(zzd4, zzd4, zzx2);
                                } else {
                                    zzx2 = zzee.zzw((String) zzf) + zzx2;
                                }
                            }
                        } else {
                            zzx2 = zzx9;
                            for (int i24 = 0; i24 < size4; i24++) {
                                Object obj2 = list5.get(i24);
                                if (obj2 instanceof zzdw) {
                                    int zzd5 = ((zzdw) obj2).zzd();
                                    zzx2 = t.z(zzd5, zzd5, zzx2);
                                } else {
                                    zzx2 = zzee.zzw((String) obj2) + zzx2;
                                }
                            }
                        }
                        i9 += zzx2;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx2 = 0;
                    i9 += zzx2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(obj, j2);
                    zzgm zzv = zzv(i8);
                    int i25 = zzgo.zza;
                    int size5 = list6.size();
                    if (size5 != 0) {
                        zzx4 = zzee.zzx(i10 << 3) * size5;
                        for (int i26 = 0; i26 < size5; i26++) {
                            Object obj3 = list6.get(i26);
                            if (obj3 instanceof zzfi) {
                                int zza2 = ((zzfi) obj3).zza();
                                zzx4 = t.z(zza2, zza2, zzx4);
                            } else {
                                zzx4 = zzee.zzv((zzgc) obj3, zzv) + zzx4;
                            }
                        }
                        i9 += zzx4;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx4 = 0;
                    i9 += zzx4;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(obj, j2);
                    int i27 = zzgo.zza;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        zzx5 = 0;
                    } else {
                        zzx5 = zzee.zzx(i10 << 3) * size6;
                        for (int i28 = 0; i28 < list7.size(); i28++) {
                            int zzd6 = ((zzdw) list7.get(i28)).zzd();
                            zzx5 = t.z(zzd6, zzd6, zzx5);
                        }
                    }
                    i9 += zzx5;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(obj, j2);
                    int i29 = zzgo.zza;
                    size2 = list8.size();
                    if (size2 != 0) {
                        zzk = zzgo.zzk(list8);
                        zzx6 = zzee.zzx(i10 << 3);
                        zzh = zzk + (zzx6 * size2);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(obj, j2);
                    int i30 = zzgo.zza;
                    size2 = list9.size();
                    if (size2 != 0) {
                        zzk = zzgo.zza(list9);
                        zzx6 = zzee.zzx(i10 << 3);
                        zzh = zzk + (zzx6 * size2);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 31:
                    zzh = zzgo.zzb(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 32:
                    z3 = false;
                    zzb2 = zzgo.zzd(i10, (List) unsafe.getObject(obj, j2), false);
                    i9 += zzb2;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    List list10 = (List) unsafe.getObject(obj, j2);
                    int i31 = zzgo.zza;
                    size2 = list10.size();
                    if (size2 != 0) {
                        zzk = zzgo.zzi(list10);
                        zzx6 = zzee.zzx(i10 << 3);
                        zzh = zzk + (zzx6 * size2);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(obj, j2);
                    int i32 = zzgo.zza;
                    size2 = list11.size();
                    if (size2 != 0) {
                        zzk = zzgo.zzj(list11);
                        zzx6 = zzee.zzx(i10 << 3);
                        zzh = zzk + (zzx6 * size2);
                        i9 += zzh;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzh = 0;
                    i9 += zzh;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 35:
                    zzx = zzgo.zze((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 36:
                    zzx = zzgo.zzc((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 37:
                    zzx = zzgo.zzg((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 38:
                    zzx = zzgo.zzl((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 39:
                    zzx = zzgo.zzf((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 40:
                    zzx = zzgo.zze((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 41:
                    zzx = zzgo.zzc((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 42:
                    List list12 = (List) unsafe.getObject(obj, j2);
                    int i33 = zzgo.zza;
                    zzx = list12.size();
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 43:
                    zzx = zzgo.zzk((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 44:
                    zzx = zzgo.zza((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 45:
                    zzx = zzgo.zzc((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 46:
                    zzx = zzgo.zze((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 47:
                    zzx = zzgo.zzi((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 48:
                    zzx = zzgo.zzj((List) unsafe.getObject(obj, j2));
                    if (zzx > 0) {
                        zzx7 = zzee.zzx(zzx);
                        zzx8 = zzee.zzx(i10 << 3);
                        zzy = zzx8 + zzx7;
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 49:
                    List list13 = (List) unsafe.getObject(obj, j2);
                    zzgm zzv2 = zzv(i8);
                    int i34 = zzgo.zza;
                    int size7 = list13.size();
                    if (size7 != 0) {
                        zzx4 = 0;
                        for (int i35 = 0; i35 < size7; i35++) {
                            zzx4 += zzee.zzt(i10, (zzgc) list13.get(i35), zzv2);
                        }
                        i9 += zzx4;
                        i8 += 3;
                        i6 = i2;
                        i7 = i3;
                        i5 = 1048575;
                    }
                    zzx4 = 0;
                    i9 += zzx4;
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 50:
                    zzfw zzfwVar = (zzfw) unsafe.getObject(obj, j2);
                    if (!zzfwVar.isEmpty()) {
                        Iterator it = zzfwVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 51:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 52:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 53:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, zzee.zzy(zzt(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 54:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, zzee.zzy(zzt(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 55:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, zzee.zzu(zzo(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 56:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 57:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 58:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 1, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case Opcodes.V15 /* 59 */:
                    if (zzM(obj, i10, i8)) {
                        int i36 = i10 << 3;
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof zzdw) {
                            int i37 = zzee.zzb;
                            int zzd7 = ((zzdw) object2).zzd();
                            i9 = t.z(i36, zzee.zzx(zzd7) + zzd7, i9);
                        } else {
                            i9 = t.z(i36, zzee.zzw((String) object2), i9);
                        }
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case Opcodes.V16 /* 60 */:
                    if (zzM(obj, i10, i8)) {
                        zzh = zzgo.zzh(i10, unsafe.getObject(obj, j2), zzv(i8));
                        i9 += zzh;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case Opcodes.V17 /* 61 */:
                    if (zzM(obj, i10, i8)) {
                        zzdw zzdwVar2 = (zzdw) unsafe.getObject(obj, j2);
                        int i38 = zzee.zzb;
                        int zzd8 = zzdwVar2.zzd();
                        i9 = t.z(i10 << 3, zzee.zzx(zzd8) + zzd8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case Opcodes.V18 /* 62 */:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, zzee.zzx(zzo(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 63:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, zzee.zzu(zzo(obj, j2)), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case 64:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 4, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzM(obj, i10, i8)) {
                        i9 = t.z(i10 << 3, 8, i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzM(obj, i10, i8)) {
                        int zzo = zzo(obj, j2);
                        i9 = t.z((zzo >> 31) ^ (zzo + zzo), zzee.zzx(i10 << 3), i9);
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzM(obj, i10, i8)) {
                        long zzt2 = zzt(obj, j2);
                        zzx = zzee.zzx(i10 << 3);
                        zzy = zzee.zzy((zzt2 >> 63) ^ (zzt2 + zzt2));
                        i9 += zzy + zzx;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                case TypeReference.NEW /* 68 */:
                    if (zzM(obj, i10, i8)) {
                        zzt = zzee.zzt(i10, (zzgc) unsafe.getObject(obj, j2), zzv(i8));
                        i9 += zzt;
                    }
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
                default:
                    i8 += 3;
                    i6 = i2;
                    i7 = i3;
                    i5 = 1048575;
            }
        }
        zzhd zzhdVar = this.zzm;
        int zza3 = i9 + zzhdVar.zza(zzhdVar.zzd(obj));
        if (!this.zzh) {
            return zza3;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final int zzb(Object obj) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int zzc;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzs = zzs(i6);
            int[] iArr = this.zzc;
            int i7 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i8 = iArr[i6];
            long j2 = i7;
            int i9 = 37;
            switch (zzr) {
                case 0:
                    i2 = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhn.zza(obj, j2));
                    byte[] bArr = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 1:
                    i3 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhn.zzb(obj, j2));
                    i5 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhn.zzd(obj, j2);
                    byte[] bArr2 = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 3:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhn.zzd(obj, j2);
                    byte[] bArr3 = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 4:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 5:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhn.zzd(obj, j2);
                    byte[] bArr4 = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 6:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 7:
                    i3 = i5 * 53;
                    floatToIntBits = zzfd.zza(zzhn.zzw(obj, j2));
                    i5 = floatToIntBits + i3;
                    break;
                case 8:
                    i3 = i5 * 53;
                    floatToIntBits = ((String) zzhn.zzf(obj, j2)).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 9:
                    i4 = i5 * 53;
                    Object zzf = zzhn.zzf(obj, j2);
                    if (zzf != null) {
                        i9 = zzf.hashCode();
                    }
                    i5 = i4 + i9;
                    break;
                case 10:
                    i3 = i5 * 53;
                    floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 11:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 12:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 13:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 14:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhn.zzd(obj, j2);
                    byte[] bArr5 = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 15:
                    i2 = i5 * 53;
                    zzc = zzhn.zzc(obj, j2);
                    i5 = i2 + zzc;
                    break;
                case 16:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhn.zzd(obj, j2);
                    byte[] bArr6 = zzfd.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzc;
                    break;
                case 17:
                    i4 = i5 * 53;
                    Object zzf2 = zzhn.zzf(obj, j2);
                    if (zzf2 != null) {
                        i9 = zzf2.hashCode();
                    }
                    i5 = i4 + i9;
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
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i5 * 53;
                    floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 51:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j2));
                        byte[] bArr7 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j2));
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr8 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr9 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr10 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzfd.zza(zzN(obj, j2));
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = ((String) zzhn.zzf(obj, j2)).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr11 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzc = zzo(obj, j2);
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzM(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzt(obj, j2);
                        byte[] bArr12 = zzfd.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzM(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhn.zzf(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i5 * 53);
        if (!this.zzh) {
            return hashCode;
        }
        this.zzn.zza(obj);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0df7, code lost:
    
        if (r13 == 1048575) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0df9, code lost:
    
        r35.putInt(r7, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0dff, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0e03, code lost:
    
        if (r2 >= r0.zzk) goto L689;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0e05, code lost:
    
        r3 = r0.zzi;
        r4 = r0.zzc;
        r3 = r3[r2];
        r4 = r4[r3];
        r4 = com.google.android.gms.internal.play_billing.zzhn.zzf(r7, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0e17, code lost:
    
        if (r4 != null) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0e1e, code lost:
    
        if (r0.zzu(r3) != null) goto L690;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0e23, code lost:
    
        r4 = (com.google.android.gms.internal.play_billing.zzfw) r4;
        r1 = (com.google.android.gms.internal.play_billing.zzfv) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0e2b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0e20, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0e2c, code lost:
    
        if (r9 != 0) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0e30, code lost:
    
        if (r8 != r36) goto L586;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0e37, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzff.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0e3e, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0e3a, code lost:
    
        if (r8 > r36) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0e3c, code lost:
    
        if (r11 != r9) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0e43, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzff.zze();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:179:0x0506. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0ac1. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:558:0x00b1. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0a4a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0a5d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0d7c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0d91 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0059 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.play_billing.zzdj r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgf.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzdj):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final Object zze() {
        return ((zzex) this.zzg).zzi();
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzex) {
                zzex zzexVar = (zzex) obj;
                zzexVar.zzq(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzexVar.zza = 0;
                zzexVar.zzo();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int zzs = zzs(i2);
                int i3 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j2 = i3;
                if (zzr != 9) {
                    if (zzr != 60 && zzr != 68) {
                        switch (zzr) {
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
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.zzl.zza(obj, j2);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzfw) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i2], i2)) {
                        zzv(i2).zzf(zzb.getObject(obj, j2));
                    }
                }
                if (zzI(obj, i2)) {
                    zzv(i2).zzf(zzb.getObject(obj, j2));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzb(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzs = zzs(i2);
            int i3 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i2)) {
                        zzhn.zzo(obj, j2, zzhn.zza(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i2)) {
                        zzhn.zzp(obj, j2, zzhn.zzb(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i2)) {
                        zzhn.zzr(obj, j2, zzhn.zzd(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i2)) {
                        zzhn.zzr(obj, j2, zzhn.zzd(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i2)) {
                        zzhn.zzr(obj, j2, zzhn.zzd(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i2)) {
                        zzhn.zzm(obj, j2, zzhn.zzw(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i2)) {
                        zzhn.zzs(obj, j2, zzhn.zzf(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i2);
                    break;
                case 10:
                    if (zzI(obj2, i2)) {
                        zzhn.zzs(obj, j2, zzhn.zzf(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i2)) {
                        zzhn.zzr(obj, j2, zzhn.zzd(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i2)) {
                        zzhn.zzq(obj, j2, zzhn.zzc(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i2)) {
                        zzhn.zzr(obj, j2, zzhn.zzd(obj2, j2));
                        zzD(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i2);
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
                case 29:
                case 30:
                case 31:
                case 32:
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j2);
                    break;
                case 50:
                    int i5 = zzgo.zza;
                    zzhn.zzs(obj, j2, zzfx.zza(zzhn.zzf(obj, j2), zzhn.zzf(obj2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case Opcodes.V15 /* 59 */:
                    if (zzM(obj2, i4, i2)) {
                        zzhn.zzs(obj, j2, zzhn.zzf(obj2, j2));
                        zzE(obj, i4, i2);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzC(obj, obj2, i2);
                    break;
                case Opcodes.V17 /* 61 */:
                case Opcodes.V18 /* 62 */:
                case 63:
                case 64:
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzM(obj2, i4, i2)) {
                        zzhn.zzs(obj, j2, zzhn.zzf(obj2, j2));
                        zzE(obj, i4, i2);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzC(obj, obj2, i2);
                    break;
            }
        }
        zzgo.zzp(this.zzm, obj, obj2);
        if (this.zzh) {
            this.zzn.zza(obj2);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final void zzh(Object obj, byte[] bArr, int i2, int i3, zzdj zzdjVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzdjVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final void zzi(Object obj, zzhv zzhvVar) throws IOException {
        int i2;
        int i3;
        int i4;
        if (this.zzh) {
            this.zzn.zza(obj);
            throw null;
        }
        int[] iArr = this.zzc;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < iArr.length) {
            int zzs = zzs(i8);
            int[] iArr2 = this.zzc;
            int zzr = zzr(zzs);
            int i9 = iArr2[i8];
            if (zzr <= 17) {
                int i10 = iArr2[i8 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i2 = i6;
                i3 = i7;
                i4 = 1 << (i10 >>> 20);
            } else {
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            long j2 = zzs & i5;
            switch (zzr) {
                case 0:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzf(i9, zzhn.zza(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzo(i9, zzhn.zzb(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzt(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzJ(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzr(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzm(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzk(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzb(i9, zzhn.zzw(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzO(i9, unsafe.getObject(obj, j2), zzhvVar);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzv(i9, unsafe.getObject(obj, j2), zzv(i8));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzd(i9, (zzdw) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzH(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzi(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzw(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzy(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzA(i9, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzC(i9, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzJ(obj, i8, i2, i3, i4)) {
                        zzhvVar.zzq(i9, unsafe.getObject(obj, j2), zzv(i8));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzgo.zzs(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 19:
                    zzgo.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 20:
                    zzgo.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 21:
                    zzgo.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 22:
                    zzgo.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 23:
                    zzgo.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 24:
                    zzgo.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 25:
                    zzgo.zzr(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 26:
                    int i12 = this.zzc[i8];
                    List list = (List) unsafe.getObject(obj, j2);
                    int i13 = zzgo.zza;
                    if (list != null && !list.isEmpty()) {
                        zzhvVar.zzG(i12, list);
                        break;
                    }
                    break;
                case 27:
                    int i14 = this.zzc[i8];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    zzgm zzv = zzv(i8);
                    int i15 = zzgo.zza;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            ((zzef) zzhvVar).zzv(i14, list2.get(i16), zzv);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i17 = this.zzc[i8];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    int i18 = zzgo.zza;
                    if (list3 != null && !list3.isEmpty()) {
                        zzhvVar.zze(i17, list3);
                        break;
                    }
                    break;
                case 29:
                    zzgo.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 30:
                    zzgo.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 31:
                    zzgo.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 32:
                    zzgo.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    zzgo.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 34:
                    zzgo.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, false);
                    break;
                case 35:
                    zzgo.zzs(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 36:
                    zzgo.zzw(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 37:
                    zzgo.zzy(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 38:
                    zzgo.zzE(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 39:
                    zzgo.zzx(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 40:
                    zzgo.zzv(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 41:
                    zzgo.zzu(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 42:
                    zzgo.zzr(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 43:
                    zzgo.zzD(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 44:
                    zzgo.zzt(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 45:
                    zzgo.zzz(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 46:
                    zzgo.zzA(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 47:
                    zzgo.zzB(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 48:
                    zzgo.zzC(this.zzc[i8], (List) unsafe.getObject(obj, j2), zzhvVar, true);
                    break;
                case 49:
                    int i19 = this.zzc[i8];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    zzgm zzv2 = zzv(i8);
                    int i20 = zzgo.zza;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            ((zzef) zzhvVar).zzq(i19, list4.get(i21), zzv2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        throw null;
                    }
                    break;
                case 51:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzf(i9, zzm(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzo(i9, zzn(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzt(i9, zzt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzJ(i9, zzt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzr(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzm(i9, zzt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzk(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzb(i9, zzN(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzM(obj, i9, i8)) {
                        zzO(i9, unsafe.getObject(obj, j2), zzhvVar);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzv(i9, unsafe.getObject(obj, j2), zzv(i8));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzd(i9, (zzdw) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzH(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzi(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzw(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzy(i9, zzt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzA(i9, zzo(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzC(i9, zzt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzM(obj, i9, i8)) {
                        zzhvVar.zzq(i9, unsafe.getObject(obj, j2), zzv(i8));
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = i2;
            i7 = i3;
            i5 = 1048575;
        }
        zzhd zzhdVar = this.zzm;
        zzhdVar.zzi(zzhdVar.zzd(obj), zzhvVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzgf.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.zzgm
    public final boolean zzk(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzs = zzs(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = zzb.getInt(obj, i10);
                }
                i3 = i4;
                i2 = i10;
            } else {
                i2 = i6;
                i3 = i4;
            }
            if ((268435456 & zzs) != 0 && !zzJ(obj, i7, i2, i3, i11)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr == 60 || zzr == 68) {
                        if (zzM(obj, i8, i7) && !zzK(obj, zzs, zzv(i7))) {
                            return false;
                        }
                    } else if (zzr != 49) {
                        if (zzr == 50 && !((zzfw) zzhn.zzf(obj, zzs & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhn.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgm zzv = zzv(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzv.zzk(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i7, i2, i3, i11) && !zzK(obj, zzs, zzv(i7))) {
                return false;
            }
            i5++;
            i6 = i2;
            i4 = i3;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzn.zza(obj);
        throw null;
    }
}
