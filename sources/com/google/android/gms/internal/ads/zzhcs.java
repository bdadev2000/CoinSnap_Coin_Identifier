package com.google.android.gms.internal.ads;

import com.google.zxing.aztec.encoder.Encoder;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.TypeReference;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhcs<T> implements zzhdk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhef.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhcp zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhdy zzm;
    private final zzhap zzn;

    private zzhcs(int[] iArr, Object[] objArr, int i2, int i3, zzhcp zzhcpVar, boolean z2, int[] iArr2, int i4, int i5, zzhcv zzhcvVar, zzhcc zzhccVar, zzhdy zzhdyVar, zzhap zzhapVar, zzhck zzhckVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzhcpVar instanceof zzhbe;
        boolean z3 = false;
        if (zzhapVar != null && (zzhcpVar instanceof zzhba)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i4;
        this.zzl = i5;
        this.zzm = zzhdyVar;
        this.zzn = zzhapVar;
        this.zzg = zzhcpVar;
    }

    private final Object zzA(Object obj, int i2) {
        zzhdk zzx = zzx(i2);
        int zzu = zzu(i2) & 1048575;
        if (!zzN(obj, i2)) {
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

    private final Object zzB(Object obj, int i2, int i3) {
        zzhdk zzx = zzx(i3);
        if (!zzR(obj, i2, i3)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i3) & 1048575);
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
            StringBuilder t2 = androidx.compose.foundation.text.input.a.t("Field ", str, " for ", name, " not found. Known fields are ");
            t2.append(arrays);
            throw new RuntimeException(t2.toString());
        }
    }

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i2) {
        if (zzN(obj2, i2)) {
            int zzu = zzu(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzu;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzhdk zzx = zzx(i2);
            if (!zzN(obj, i2)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzH(obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i2) {
        int i3 = this.zzc[i2];
        if (zzR(obj2, i3, i2)) {
            int zzu = zzu(i2) & 1048575;
            Unsafe unsafe = zzb;
            long j2 = zzu;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + obj2.toString());
            }
            zzhdk zzx = zzx(i2);
            if (!zzR(obj, i3, i2)) {
                if (zzQ(object)) {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j2, zze);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                zzI(obj, i3, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j2, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i2, zzhdc zzhdcVar) throws IOException {
        long j2 = i2 & 1048575;
        if (zzM(i2)) {
            zzhef.zzv(obj, j2, zzhdcVar.zzs());
        } else if (this.zzi) {
            zzhef.zzv(obj, j2, zzhdcVar.zzr());
        } else {
            zzhef.zzv(obj, j2, zzhdcVar.zzp());
        }
    }

    private final void zzH(Object obj, int i2) {
        int zzr = zzr(i2);
        long j2 = 1048575 & zzr;
        if (j2 == 1048575) {
            return;
        }
        zzhef.zzt(obj, j2, (1 << (zzr >>> 20)) | zzhef.zzd(obj, j2));
    }

    private final void zzI(Object obj, int i2, int i3) {
        zzhef.zzt(obj, zzr(i3) & 1048575, i2);
    }

    private final void zzJ(Object obj, int i2, Object obj2) {
        zzb.putObject(obj, zzu(i2) & 1048575, obj2);
        zzH(obj, i2);
    }

    private final void zzK(Object obj, int i2, int i3, Object obj2) {
        zzb.putObject(obj, zzu(i3) & 1048575, obj2);
        zzI(obj, i2, i3);
    }

    private final boolean zzL(Object obj, Object obj2, int i2) {
        return zzN(obj, i2) == zzN(obj2, i2);
    }

    private static boolean zzM(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i2) {
        int zzr = zzr(i2);
        long j2 = zzr & 1048575;
        if (j2 != 1048575) {
            return (zzhef.zzd(obj, j2) & (1 << (zzr >>> 20))) != 0;
        }
        int zzu = zzu(i2);
        long j3 = zzu & 1048575;
        switch (zzt(zzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzhef.zzb(obj, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhef.zzc(obj, j3)) != 0;
            case 2:
                return zzhef.zzf(obj, j3) != 0;
            case 3:
                return zzhef.zzf(obj, j3) != 0;
            case 4:
                return zzhef.zzd(obj, j3) != 0;
            case 5:
                return zzhef.zzf(obj, j3) != 0;
            case 6:
                return zzhef.zzd(obj, j3) != 0;
            case 7:
                return zzhef.zzz(obj, j3);
            case 8:
                Object zzh = zzhef.zzh(obj, j3);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                }
                if (zzh instanceof zzgzs) {
                    return !zzgzs.zzb.equals(zzh);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhef.zzh(obj, j3) != null;
            case 10:
                return !zzgzs.zzb.equals(zzhef.zzh(obj, j3));
            case 11:
                return zzhef.zzd(obj, j3) != 0;
            case 12:
                return zzhef.zzd(obj, j3) != 0;
            case 13:
                return zzhef.zzd(obj, j3) != 0;
            case 14:
                return zzhef.zzf(obj, j3) != 0;
            case 15:
                return zzhef.zzd(obj, j3) != 0;
            case 16:
                return zzhef.zzf(obj, j3) != 0;
            case 17:
                return zzhef.zzh(obj, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i2, int i3, int i4, int i5) {
        return i3 == 1048575 ? zzN(obj, i2) : (i4 & i5) != 0;
    }

    private static boolean zzP(Object obj, int i2, zzhdk zzhdkVar) {
        return zzhdkVar.zzl(zzhef.zzh(obj, i2 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhbe) {
            return ((zzhbe) obj).zzcf();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i2, int i3) {
        return zzhef.zzd(obj, (long) (zzr(i3) & 1048575)) == i2;
    }

    private static boolean zzS(Object obj, long j2) {
        return ((Boolean) zzhef.zzh(obj, j2)).booleanValue();
    }

    private static final void zzT(int i2, Object obj, zzhen zzhenVar) throws IOException {
        if (obj instanceof String) {
            zzhenVar.zzG(i2, (String) obj);
        } else {
            zzhenVar.zzd(i2, (zzgzs) obj);
        }
    }

    public static zzhdz zzd(Object obj) {
        zzhbe zzhbeVar = (zzhbe) obj;
        zzhdz zzhdzVar = zzhbeVar.zzt;
        if (zzhdzVar != zzhdz.zzc()) {
            return zzhdzVar;
        }
        zzhdz zzf = zzhdz.zzf();
        zzhbeVar.zzt = zzf;
        return zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhcs zzm(java.lang.Class r32, com.google.android.gms.internal.ads.zzhcm r33, com.google.android.gms.internal.ads.zzhcv r34, com.google.android.gms.internal.ads.zzhcc r35, com.google.android.gms.internal.ads.zzhdy r36, com.google.android.gms.internal.ads.zzhap r37, com.google.android.gms.internal.ads.zzhck r38) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhcm, com.google.android.gms.internal.ads.zzhcv, com.google.android.gms.internal.ads.zzhcc, com.google.android.gms.internal.ads.zzhdy, com.google.android.gms.internal.ads.zzhap, com.google.android.gms.internal.ads.zzhck):com.google.android.gms.internal.ads.zzhcs");
    }

    private static double zzn(Object obj, long j2) {
        return ((Double) zzhef.zzh(obj, j2)).doubleValue();
    }

    private static float zzo(Object obj, long j2) {
        return ((Float) zzhef.zzh(obj, j2)).floatValue();
    }

    private static int zzp(Object obj, long j2) {
        return ((Integer) zzhef.zzh(obj, j2)).intValue();
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzs(i2, 0);
    }

    private final int zzr(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzs(int i2, int i3) {
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

    private static int zzt(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzu(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzv(Object obj, long j2) {
        return ((Long) zzhef.zzh(obj, j2)).longValue();
    }

    private final zzhbk zzw(int i2) {
        int i3 = i2 / 3;
        return (zzhbk) this.zzd[i3 + i3 + 1];
    }

    private final zzhdk zzx(int i2) {
        Object[] objArr = this.zzd;
        int i3 = i2 / 3;
        int i4 = i3 + i3;
        zzhdk zzhdkVar = (zzhdk) objArr[i4];
        if (zzhdkVar != null) {
            return zzhdkVar;
        }
        zzhdk zzb2 = zzhcz.zza().zzb((Class) objArr[i4 + 1]);
        this.zzd[i4] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i2, Object obj2, zzhdy zzhdyVar, Object obj3) {
        int i3 = this.zzc[i2];
        Object zzh = zzhef.zzh(obj, zzu(i2) & 1048575);
        if (zzh == null || zzw(i2) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i2) {
        int i3 = i2 / 3;
        return this.zzd[i3 + i3];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zza(java.lang.Object):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhdk
    public final int zzb(Object obj) {
        int i2;
        long doubleToLongBits;
        int i3;
        int floatToIntBits;
        int zzd;
        int i4;
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzc.length; i6 += 3) {
            int zzu = zzu(i6);
            int[] iArr = this.zzc;
            int i7 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i8 = iArr[i6];
            long j2 = i7;
            int i9 = 37;
            switch (zzt) {
                case 0:
                    i2 = i5 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhef.zzb(obj, j2));
                    byte[] bArr = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 1:
                    i3 = i5 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhef.zzc(obj, j2));
                    i5 = floatToIntBits + i3;
                    break;
                case 2:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhef.zzf(obj, j2);
                    byte[] bArr2 = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 3:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhef.zzf(obj, j2);
                    byte[] bArr3 = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 4:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 5:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhef.zzf(obj, j2);
                    byte[] bArr4 = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 6:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 7:
                    i3 = i5 * 53;
                    floatToIntBits = zzhbr.zza(zzhef.zzz(obj, j2));
                    i5 = floatToIntBits + i3;
                    break;
                case 8:
                    i3 = i5 * 53;
                    floatToIntBits = ((String) zzhef.zzh(obj, j2)).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 9:
                    i4 = i5 * 53;
                    Object zzh = zzhef.zzh(obj, j2);
                    if (zzh != null) {
                        i9 = zzh.hashCode();
                    }
                    i5 = i4 + i9;
                    break;
                case 10:
                    i3 = i5 * 53;
                    floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 11:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 12:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 13:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 14:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhef.zzf(obj, j2);
                    byte[] bArr5 = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 15:
                    i2 = i5 * 53;
                    zzd = zzhef.zzd(obj, j2);
                    i5 = i2 + zzd;
                    break;
                case 16:
                    i2 = i5 * 53;
                    doubleToLongBits = zzhef.zzf(obj, j2);
                    byte[] bArr6 = zzhbr.zzb;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i5 = i2 + zzd;
                    break;
                case 17:
                    i4 = i5 * 53;
                    Object zzh2 = zzhef.zzh(obj, j2);
                    if (zzh2 != null) {
                        i9 = zzh2.hashCode();
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
                    floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 50:
                    i3 = i5 * 53;
                    floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                    i5 = floatToIntBits + i3;
                    break;
                case 51:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j2));
                        byte[] bArr7 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j2));
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzv(obj, j2);
                        byte[] bArr8 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzv(obj, j2);
                        byte[] bArr9 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzv(obj, j2);
                        byte[] bArr10 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhbr.zza(zzS(obj, j2));
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = ((String) zzhef.zzh(obj, j2)).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzv(obj, j2);
                        byte[] bArr11 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        zzd = zzp(obj, j2);
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzR(obj, i8, i6)) {
                        i2 = i5 * 53;
                        doubleToLongBits = zzv(obj, j2);
                        byte[] bArr12 = zzhbr.zzb;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i5 = i2 + zzd;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzR(obj, i8, i6)) {
                        i3 = i5 * 53;
                        floatToIntBits = zzhef.zzh(obj, j2).hashCode();
                        i5 = floatToIntBits + i3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = ((zzhbe) obj).zzt.hashCode() + (i5 * 53);
        return this.zzh ? (hashCode * 53) + ((zzhba) obj).zza.zza.hashCode() : hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0c91, code lost:
    
        if (r14 == 1048575) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0c93, code lost:
    
        r12.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0c97, code lost:
    
        r12 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0c9d, code lost:
    
        if (r12 >= r6.zzl) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0c9f, code lost:
    
        zzy(r37, r6.zzj[r12], null, r6.zzm, r37);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0cb4, code lost:
    
        if (r9 != 0) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0cb8, code lost:
    
        if (r8 != r40) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cc0, code lost:
    
        throw new com.google.android.gms.internal.ads.zzhbt("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0cc7, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cc3, code lost:
    
        if (r8 > r40) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0cc5, code lost:
    
        if (r11 != r9) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0ccd, code lost:
    
        throw new com.google.android.gms.internal.ads.zzhbt("Failed to parse the message.");
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:180:0x0485. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:508:0x00ae. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x09dc. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0c18 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0c2a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.ads.zzgzg r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgzg):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final Object zze() {
        return ((zzhbe) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzhbe) {
                zzhbe zzhbeVar = (zzhbe) obj;
                zzhbeVar.zzbV();
                zzhbeVar.zzbU();
                zzhbeVar.zzbX();
            }
            int[] iArr = this.zzc;
            for (int i2 = 0; i2 < iArr.length; i2 += 3) {
                int zzu = zzu(i2);
                int i3 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j2 = i3;
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
                                ((zzhbq) zzhef.zzh(obj, j2)).zzb();
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j2);
                                if (object != null) {
                                    ((zzhcj) object).zzc();
                                    unsafe.putObject(obj, j2, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i2], i2)) {
                        zzx(i2).zzf(zzb.getObject(obj, j2));
                    }
                }
                if (zzN(obj, i2)) {
                    zzx(i2).zzf(zzb.getObject(obj, j2));
                }
            }
            this.zzm.zzi(obj);
            if (this.zzh) {
                this.zzn.zza(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzu = zzu(i2);
            int i3 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i4 = iArr[i2];
            long j2 = i3;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i2)) {
                        zzhef.zzr(obj, j2, zzhef.zzb(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i2)) {
                        zzhef.zzs(obj, j2, zzhef.zzc(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i2)) {
                        zzhef.zzu(obj, j2, zzhef.zzf(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i2)) {
                        zzhef.zzu(obj, j2, zzhef.zzf(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i2)) {
                        zzhef.zzu(obj, j2, zzhef.zzf(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i2)) {
                        zzhef.zzp(obj, j2, zzhef.zzz(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i2)) {
                        zzhef.zzv(obj, j2, zzhef.zzh(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i2);
                    break;
                case 10:
                    if (zzN(obj2, i2)) {
                        zzhef.zzv(obj, j2, zzhef.zzh(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i2)) {
                        zzhef.zzu(obj, j2, zzhef.zzf(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i2)) {
                        zzhef.zzt(obj, j2, zzhef.zzd(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i2)) {
                        zzhef.zzu(obj, j2, zzhef.zzf(obj2, j2));
                        zzH(obj, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i2);
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
                    zzhbq zzhbqVar = (zzhbq) zzhef.zzh(obj, j2);
                    zzhbq zzhbqVar2 = (zzhbq) zzhef.zzh(obj2, j2);
                    int size = zzhbqVar.size();
                    int size2 = zzhbqVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!zzhbqVar.zzc()) {
                            zzhbqVar = zzhbqVar.zzf(size2 + size);
                        }
                        zzhbqVar.addAll(zzhbqVar2);
                    }
                    if (size > 0) {
                        zzhbqVar2 = zzhbqVar;
                    }
                    zzhef.zzv(obj, j2, zzhbqVar2);
                    break;
                case 50:
                    int i5 = zzhdm.zza;
                    zzhef.zzv(obj, j2, zzhck.zzb(zzhef.zzh(obj, j2), zzhef.zzh(obj2, j2)));
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
                    if (zzR(obj2, i4, i2)) {
                        zzhef.zzv(obj, j2, zzhef.zzh(obj2, j2));
                        zzI(obj, i4, i2);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzF(obj, obj2, i2);
                    break;
                case Opcodes.V17 /* 61 */:
                case Opcodes.V18 /* 62 */:
                case 63:
                case 64:
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzR(obj2, i4, i2)) {
                        zzhef.zzv(obj, j2, zzhef.zzh(obj2, j2));
                        zzI(obj, i4, i2);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzF(obj, obj2, i2);
                    break;
            }
        }
        zzhdm.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzhdm.zzp(this.zzn, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0071. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0518 A[LOOP:5: B:312:0x0514->B:314:0x0518, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0529  */
    @Override // com.google.android.gms.internal.ads.zzhdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r11, com.google.android.gms.internal.ads.zzhdc r12, com.google.android.gms.internal.ads.zzhao r13) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhdc, com.google.android.gms.internal.ads.zzhao):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final void zzi(Object obj, byte[] bArr, int i2, int i3, zzgzg zzgzgVar) throws IOException {
        zzc(obj, bArr, i2, i3, 0, zzgzgVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0095. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:231:0x067e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzhdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzhen r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhen):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhcs.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhdk
    public final boolean zzl(Object obj) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i7 = iArr[i5];
            int i8 = iArr2[i7];
            int zzu = zzu(i7);
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
            if ((268435456 & zzu) != 0 && !zzO(obj, i7, i2, i3, i11)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt == 60 || zzt == 68) {
                        if (zzR(obj, i8, i7) && !zzP(obj, zzu, zzx(i7))) {
                            return false;
                        }
                    } else if (zzt != 49) {
                        if (zzt == 50 && !((zzhcj) zzhef.zzh(obj, zzu & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) zzhef.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhdk zzx = zzx(i7);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        if (!zzx.zzl(list.get(i12))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i7, i2, i3, i11) && !zzP(obj, zzu, zzx(i7))) {
                return false;
            }
            i5++;
            i6 = i2;
            i4 = i3;
        }
        return !this.zzh || ((zzhba) obj).zza.zzi();
    }
}
