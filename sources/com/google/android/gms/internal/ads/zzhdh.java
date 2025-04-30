package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhdh<T> implements zzhdz<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhfa.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzhde zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzhcs zzm;
    private final zzheq zzn;
    private final zzhaz zzo;
    private final zzhdk zzp;
    private final zzhcz zzq;

    private zzhdh(int[] iArr, Object[] objArr, int i9, int i10, zzhde zzhdeVar, int i11, boolean z8, int[] iArr2, int i12, int i13, zzhdk zzhdkVar, zzhcs zzhcsVar, zzheq zzheqVar, zzhaz zzhazVar, zzhcz zzhczVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        this.zzi = zzhdeVar instanceof zzhbo;
        boolean z9 = false;
        if (zzhazVar != null && zzhazVar.zzj(zzhdeVar)) {
            z9 = true;
        }
        this.zzh = z9;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzhdkVar;
        this.zzm = zzhcsVar;
        this.zzn = zzheqVar;
        this.zzo = zzhazVar;
        this.zzg = zzhdeVar;
        this.zzq = zzhczVar;
    }

    private final Object zzA(Object obj, int i9) {
        zzhdz zzx = zzx(i9);
        int zzu = zzu(i9) & 1048575;
        if (!zzN(obj, i9)) {
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

    private final Object zzB(Object obj, int i9, int i10) {
        zzhdz zzx = zzx(i10);
        if (!zzR(obj, i9, i10)) {
            return zzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i10) & 1048575);
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
            StringBuilder o3 = o.o("Field ", str, " for ", name, " not found. Known fields are ");
            o3.append(arrays);
            throw new RuntimeException(o3.toString());
        }
    }

    private static void zzD(Object obj) {
        if (zzQ(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i9) {
        if (!zzN(obj2, i9)) {
            return;
        }
        int zzu = zzu(i9) & 1048575;
        Unsafe unsafe = zzb;
        long j7 = zzu;
        Object object = unsafe.getObject(obj2, j7);
        if (object != null) {
            zzhdz zzx = zzx(i9);
            if (!zzN(obj, i9)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j7, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                }
                zzH(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
    }

    private final void zzF(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (!zzR(obj2, i10, i9)) {
            return;
        }
        int zzu = zzu(i9) & 1048575;
        Unsafe unsafe = zzb;
        long j7 = zzu;
        Object object = unsafe.getObject(obj2, j7);
        if (object != null) {
            zzhdz zzx = zzx(i9);
            if (!zzR(obj, i10, i9)) {
                if (!zzQ(object)) {
                    unsafe.putObject(obj, j7, object);
                } else {
                    Object zze = zzx.zze();
                    zzx.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                }
                zzI(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzQ(object2)) {
                Object zze2 = zzx.zze();
                zzx.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzx.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
    }

    private final void zzG(Object obj, int i9, zzhdr zzhdrVar) throws IOException {
        long j7 = i9 & 1048575;
        if (zzM(i9)) {
            zzhfa.zzv(obj, j7, zzhdrVar.zzu());
        } else if (this.zzi) {
            zzhfa.zzv(obj, j7, zzhdrVar.zzt());
        } else {
            zzhfa.zzv(obj, j7, zzhdrVar.zzp());
        }
    }

    private final void zzH(Object obj, int i9) {
        int zzr = zzr(i9);
        long j7 = 1048575 & zzr;
        if (j7 == 1048575) {
            return;
        }
        zzhfa.zzt(obj, j7, (1 << (zzr >>> 20)) | zzhfa.zzd(obj, j7));
    }

    private final void zzI(Object obj, int i9, int i10) {
        zzhfa.zzt(obj, zzr(i10) & 1048575, i9);
    }

    private final void zzJ(Object obj, int i9, Object obj2) {
        zzb.putObject(obj, zzu(i9) & 1048575, obj2);
        zzH(obj, i9);
    }

    private final void zzK(Object obj, int i9, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzI(obj, i9, i10);
    }

    private final boolean zzL(Object obj, Object obj2, int i9) {
        if (zzN(obj, i9) == zzN(obj2, i9)) {
            return true;
        }
        return false;
    }

    private static boolean zzM(int i9) {
        return (i9 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i9) {
        int zzr = zzr(i9);
        long j7 = zzr & 1048575;
        if (j7 == 1048575) {
            int zzu = zzu(i9);
            long j9 = zzu & 1048575;
            switch (zzt(zzu)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhfa.zzb(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzhfa.zzc(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzhfa.zzf(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzhfa.zzf(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzhfa.zzf(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzhfa.zzz(obj, j9);
                case 8:
                    Object zzh = zzhfa.zzh(obj, j9);
                    if (zzh instanceof String) {
                        if (((String) zzh).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzh instanceof zzhac) {
                        if (zzhac.zzb.equals(zzh)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzhfa.zzh(obj, j9) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzhac.zzb.equals(zzhfa.zzh(obj, j9))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzhfa.zzf(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzhfa.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzhfa.zzf(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzhfa.zzh(obj, j9) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzhfa.zzd(obj, j7) & (1 << (zzr >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzO(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzN(obj, i9);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzP(Object obj, int i9, zzhdz zzhdzVar) {
        return zzhdzVar.zzl(zzhfa.zzh(obj, i9 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzhbo) {
            return ((zzhbo) obj).zzce();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i9, int i10) {
        if (zzhfa.zzd(obj, zzr(i10) & 1048575) == i9) {
            return true;
        }
        return false;
    }

    private static boolean zzS(Object obj, long j7) {
        return ((Boolean) zzhfa.zzh(obj, j7)).booleanValue();
    }

    private static final void zzT(int i9, Object obj, zzhfi zzhfiVar) throws IOException {
        if (obj instanceof String) {
            zzhfiVar.zzG(i9, (String) obj);
        } else {
            zzhfiVar.zzd(i9, (zzhac) obj);
        }
    }

    public static zzher zzd(Object obj) {
        zzhbo zzhboVar = (zzhbo) obj;
        zzher zzherVar = zzhboVar.zzt;
        if (zzherVar == zzher.zzc()) {
            zzher zzf = zzher.zzf();
            zzhboVar.zzt = zzf;
            return zzf;
        }
        return zzherVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzhdh zzm(java.lang.Class r33, com.google.android.gms.internal.ads.zzhdb r34, com.google.android.gms.internal.ads.zzhdk r35, com.google.android.gms.internal.ads.zzhcs r36, com.google.android.gms.internal.ads.zzheq r37, com.google.android.gms.internal.ads.zzhaz r38, com.google.android.gms.internal.ads.zzhcz r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zzm(java.lang.Class, com.google.android.gms.internal.ads.zzhdb, com.google.android.gms.internal.ads.zzhdk, com.google.android.gms.internal.ads.zzhcs, com.google.android.gms.internal.ads.zzheq, com.google.android.gms.internal.ads.zzhaz, com.google.android.gms.internal.ads.zzhcz):com.google.android.gms.internal.ads.zzhdh");
    }

    private static double zzn(Object obj, long j7) {
        return ((Double) zzhfa.zzh(obj, j7)).doubleValue();
    }

    private static float zzo(Object obj, long j7) {
        return ((Float) zzhfa.zzh(obj, j7)).floatValue();
    }

    private static int zzp(Object obj, long j7) {
        return ((Integer) zzhfa.zzh(obj, j7)).intValue();
    }

    private final int zzq(int i9) {
        if (i9 >= this.zze && i9 <= this.zzf) {
            return zzs(i9, 0);
        }
        return -1;
    }

    private final int zzr(int i9) {
        return this.zzc[i9 + 2];
    }

    private final int zzs(int i9, int i10) {
        int length = (this.zzc.length / 3) - 1;
        while (i10 <= length) {
            int i11 = (length + i10) >>> 1;
            int i12 = i11 * 3;
            int i13 = this.zzc[i12];
            if (i9 == i13) {
                return i12;
            }
            if (i9 < i13) {
                length = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
        }
        return -1;
    }

    private static int zzt(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzu(int i9) {
        return this.zzc[i9 + 1];
    }

    private static long zzv(Object obj, long j7) {
        return ((Long) zzhfa.zzh(obj, j7)).longValue();
    }

    private final zzhbu zzw(int i9) {
        int i10 = i9 / 3;
        return (zzhbu) this.zzd[i10 + i10 + 1];
    }

    private final zzhdz zzx(int i9) {
        Object[] objArr = this.zzd;
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzhdz zzhdzVar = (zzhdz) objArr[i11];
        if (zzhdzVar != null) {
            return zzhdzVar;
        }
        zzhdz zzb2 = zzhdo.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzy(Object obj, int i9, Object obj2, zzheq zzheqVar, Object obj3) {
        int i10 = this.zzc[i9];
        Object zzh = zzhfa.zzh(obj, zzu(i9) & 1048575);
        if (zzh == null || zzw(i9) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zza(java.lang.Object):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzhdz
    public final int zzb(Object obj) {
        int i9;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzd;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzu = zzu(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & zzu;
            int zzt = zzt(zzu);
            int i15 = iArr[i13];
            long j7 = i14;
            int i16 = 37;
            switch (zzt) {
                case 0:
                    i9 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzhfa.zzb(obj, j7));
                    byte[] bArr = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzhfa.zzc(obj, j7));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                    i9 = i12 * 53;
                    doubleToLongBits = zzhfa.zzf(obj, j7);
                    byte[] bArr2 = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 3:
                    i9 = i12 * 53;
                    doubleToLongBits = zzhfa.zzf(obj, j7);
                    byte[] bArr3 = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 4:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 5:
                    i9 = i12 * 53;
                    doubleToLongBits = zzhfa.zzf(obj, j7);
                    byte[] bArr4 = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 6:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 7:
                    i10 = i12 * 53;
                    floatToIntBits = zzhcb.zza(zzhfa.zzz(obj, j7));
                    i12 = floatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) zzhfa.zzh(obj, j7)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object zzh = zzhfa.zzh(obj, j7);
                    if (zzh != null) {
                        i16 = zzh.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 11:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 12:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 13:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 14:
                    i9 = i12 * 53;
                    doubleToLongBits = zzhfa.zzf(obj, j7);
                    byte[] bArr5 = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 15:
                    i9 = i12 * 53;
                    zzd = zzhfa.zzd(obj, j7);
                    i12 = i9 + zzd;
                    break;
                case 16:
                    i9 = i12 * 53;
                    doubleToLongBits = zzhfa.zzf(obj, j7);
                    byte[] bArr6 = zzhcb.zzd;
                    zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzd;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object zzh2 = zzhfa.zzh(obj, j7);
                    if (zzh2 != null) {
                        i16 = zzh2.hashCode();
                    }
                    i12 = i11 + i16;
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
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    i10 = i12 * 53;
                    floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i10 = i12 * 53;
                    floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzn(obj, j7));
                        byte[] bArr7 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzo(obj, j7));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr8 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr9 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr10 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzhcb.zza(zzS(obj, j7));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) zzhfa.zzh(obj, j7)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr11 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzd = zzp(obj, j7);
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzv(obj, j7);
                        byte[] bArr12 = zzhcb.zzd;
                        zzd = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzd;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzhfa.zzh(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzd(obj).hashCode() + (i12 * 53);
        if (this.zzh) {
            return (hashCode * 53) + this.zzo.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0cba, code lost:
    
        if (r14 == 1048575) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0cbc, code lost:
    
        r29.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0cc2, code lost:
    
        r10 = r6.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0cc7, code lost:
    
        if (r10 >= r6.zzl) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0cc9, code lost:
    
        zzy(r34, r6.zzj[r10], null, r6.zzn, r34);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0cdc, code lost:
    
        if (r9 != 0) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0cde, code lost:
    
        if (r8 != r12) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0ce5, code lost:
    
        throw com.google.android.gms.internal.ads.zzhcd.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0cea, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0ce6, code lost:
    
        if (r8 > r12) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0ce8, code lost:
    
        if (r11 != r9) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0cef, code lost:
    
        throw com.google.android.gms.internal.ads.zzhcd.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:410:0x09e2. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:505:0x00aa. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:84:0x046b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:100:0x097d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0c3f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0c50 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0968 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r34, byte[] r35, int r36, int r37, int r38, com.google.android.gms.internal.ads.zzgzn r39) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.ads.zzgzn):int");
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final Object zze() {
        return ((zzhbo) this.zzg).zzbj();
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzf(Object obj) {
        if (zzQ(obj)) {
            if (obj instanceof zzhbo) {
                zzhbo zzhboVar = (zzhbo) obj;
                zzhboVar.zzbU();
                zzhboVar.zzbT();
                zzhboVar.zzbW();
            }
            int[] iArr = this.zzc;
            for (int i9 = 0; i9 < iArr.length; i9 += 3) {
                int zzu = zzu(i9);
                int i10 = 1048575 & zzu;
                int zzt = zzt(zzu);
                long j7 = i10;
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
                            case AD_PLAY_RESET_ON_DEINIT_VALUE:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                            case 44:
                            case 45:
                            case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                            case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                            case 48:
                            case 49:
                                this.zzm.zzb(obj, j7);
                                break;
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzhcy) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzR(obj, this.zzc[i9], i9)) {
                        zzx(i9).zzf(zzb.getObject(obj, j7));
                    }
                }
                if (zzN(obj, i9)) {
                    zzx(i9).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzn.zzm(obj);
            if (this.zzh) {
                this.zzo.zzf(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzg(Object obj, Object obj2) {
        zzD(obj);
        obj2.getClass();
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzu = zzu(i9);
            int i10 = 1048575 & zzu;
            int[] iArr = this.zzc;
            int zzt = zzt(zzu);
            int i11 = iArr[i9];
            long j7 = i10;
            switch (zzt) {
                case 0:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzr(obj, j7, zzhfa.zzb(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzs(obj, j7, zzhfa.zzc(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzu(obj, j7, zzhfa.zzf(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzu(obj, j7, zzhfa.zzf(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzu(obj, j7, zzhfa.zzf(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzp(obj, j7, zzhfa.zzz(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzv(obj, j7, zzhfa.zzh(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzE(obj, obj2, i9);
                    break;
                case 10:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzv(obj, j7, zzhfa.zzh(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzu(obj, j7, zzhfa.zzf(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzt(obj, j7, zzhfa.zzd(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzN(obj2, i9)) {
                        zzhfa.zzu(obj, j7, zzhfa.zzf(obj2, j7));
                        zzH(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzE(obj, obj2, i9);
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
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                case 39:
                case 40:
                case 41:
                case 42:
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                case 44:
                case 45:
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                case 48:
                case 49:
                    this.zzm.zzc(obj, obj2, j7);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    int i12 = zzheb.zza;
                    zzhfa.zzv(obj, j7, zzhcz.zzb(zzhfa.zzh(obj, j7), zzhfa.zzh(obj2, j7)));
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
                    if (zzR(obj2, i11, i9)) {
                        zzhfa.zzv(obj, j7, zzhfa.zzh(obj2, j7));
                        zzI(obj, i11, i9);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzF(obj, obj2, i9);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i9)) {
                        zzhfa.zzv(obj, j7, zzhfa.zzh(obj2, j7));
                        zzI(obj, i11, i9);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzF(obj, obj2, i9);
                    break;
            }
        }
        zzheb.zzr(this.zzn, obj, obj2);
        if (this.zzh) {
            zzheb.zzq(this.zzo, obj, obj2);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x064d A[LOOP:2: B:36:0x0649->B:38:0x064d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x061d A[Catch: all -> 0x00f8, TryCatch #5 {all -> 0x00f8, blocks: (B:16:0x00d6, B:45:0x0618, B:47:0x061d, B:48:0x0622, B:101:0x02db, B:104:0x02e4, B:105:0x02f4, B:106:0x0304, B:107:0x0314, B:108:0x0324, B:109:0x0334, B:110:0x0344, B:111:0x0354, B:112:0x0365, B:113:0x0376, B:114:0x0387, B:115:0x0398, B:116:0x03a9, B:117:0x03ba, B:118:0x03d6, B:119:0x03e7, B:120:0x03f8, B:121:0x040d, B:123:0x0416, B:124:0x0428, B:125:0x043a, B:126:0x044b, B:127:0x045c, B:128:0x046d, B:129:0x047e, B:130:0x048f, B:131:0x04a0, B:132:0x04b1, B:133:0x04c2, B:134:0x04d7, B:135:0x04e9, B:136:0x04fb, B:137:0x050d, B:138:0x051f, B:140:0x052c, B:143:0x0533, B:144:0x0539, B:145:0x0544, B:146:0x0556, B:147:0x0568, B:148:0x057d, B:149:0x0588, B:150:0x059a, B:151:0x05ac, B:152:0x05be, B:153:0x05d0, B:154:0x05e2, B:155:0x05f4, B:156:0x0606), top: B:15:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0628 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.gms.internal.ads.zzhdr r19, com.google.android.gms.internal.ads.zzhay r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zzh(java.lang.Object, com.google.android.gms.internal.ads.zzhdr, com.google.android.gms.internal.ads.zzhay):void");
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final void zzi(Object obj, byte[] bArr, int i9, int i10, zzgzn zzgznVar) throws IOException {
        zzc(obj, bArr, i9, i10, 0, zzgznVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:231:0x067d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.gms.internal.ads.zzhfi r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zzj(java.lang.Object, com.google.android.gms.internal.ads.zzhfi):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhdh.zzk(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzhdz
    public final boolean zzl(Object obj) {
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzk) {
            int[] iArr = this.zzj;
            int[] iArr2 = this.zzc;
            int i14 = iArr[i12];
            int i15 = iArr2[i14];
            int zzu = zzu(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i13) {
                if (i17 != 1048575) {
                    i11 = zzb.getInt(obj, i17);
                }
                i10 = i11;
                i9 = i17;
            } else {
                i9 = i13;
                i10 = i11;
            }
            if ((268435456 & zzu) != 0 && !zzO(obj, i14, i9, i10, i18)) {
                return false;
            }
            int zzt = zzt(zzu);
            if (zzt != 9 && zzt != 17) {
                if (zzt != 27) {
                    if (zzt != 60 && zzt != 68) {
                        if (zzt != 49) {
                            if (zzt == 50 && !((zzhcy) zzhfa.zzh(obj, zzu & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzR(obj, i15, i14) && !zzP(obj, zzu, zzx(i14))) {
                        return false;
                    }
                }
                List list = (List) zzhfa.zzh(obj, zzu & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzhdz zzx = zzx(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzx.zzl(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzO(obj, i14, i9, i10, i18) && !zzP(obj, zzu, zzx(i14))) {
                return false;
            }
            i12++;
            i13 = i9;
            i11 = i10;
        }
        if (this.zzh && !this.zzo.zzb(obj).zzl()) {
            return false;
        }
        return true;
    }
}
