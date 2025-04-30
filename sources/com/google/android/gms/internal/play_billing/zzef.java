package com.google.android.gms.internal.play_billing;

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
public final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i9, int i10, zzec zzecVar, int i11, boolean z8, int[] iArr2, int i12, int i13, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        boolean z9 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z9 = true;
        }
        this.zzh = z9;
        this.zzi = iArr2;
        this.zzj = i12;
        this.zzk = i13;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (zzL(obj)) {
        } else {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i9) {
        if (!zzI(obj2, i9)) {
            return;
        }
        int zzs = zzs(i9) & 1048575;
        Unsafe unsafe = zzb;
        long j7 = zzs;
        Object object = unsafe.getObject(obj2, j7);
        if (object != null) {
            zzeo zzv = zzv(i9);
            if (!zzI(obj, i9)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, j7, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                }
                zzD(obj, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
    }

    private final void zzC(Object obj, Object obj2, int i9) {
        int i10 = this.zzc[i9];
        if (!zzM(obj2, i10, i9)) {
            return;
        }
        int zzs = zzs(i9) & 1048575;
        Unsafe unsafe = zzb;
        long j7 = zzs;
        Object object = unsafe.getObject(obj2, j7);
        if (object != null) {
            zzeo zzv = zzv(i9);
            if (!zzM(obj, i10, i9)) {
                if (!zzL(object)) {
                    unsafe.putObject(obj, j7, object);
                } else {
                    Object zze = zzv.zze();
                    zzv.zzg(zze, object);
                    unsafe.putObject(obj, j7, zze);
                }
                zzE(obj, i10, i9);
                return;
            }
            Object object2 = unsafe.getObject(obj, j7);
            if (!zzL(object2)) {
                Object zze2 = zzv.zze();
                zzv.zzg(zze2, object2);
                unsafe.putObject(obj, j7, zze2);
                object2 = zze2;
            }
            zzv.zzg(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + obj2.toString());
    }

    private final void zzD(Object obj, int i9) {
        int zzp = zzp(i9);
        long j7 = 1048575 & zzp;
        if (j7 == 1048575) {
            return;
        }
        zzfp.zzq(obj, j7, (1 << (zzp >>> 20)) | zzfp.zzc(obj, j7));
    }

    private final void zzE(Object obj, int i9, int i10) {
        zzfp.zzq(obj, zzp(i10) & 1048575, i9);
    }

    private final void zzF(Object obj, int i9, Object obj2) {
        zzb.putObject(obj, zzs(i9) & 1048575, obj2);
        zzD(obj, i9);
    }

    private final void zzG(Object obj, int i9, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzE(obj, i9, i10);
    }

    private final boolean zzH(Object obj, Object obj2, int i9) {
        if (zzI(obj, i9) == zzI(obj2, i9)) {
            return true;
        }
        return false;
    }

    private final boolean zzI(Object obj, int i9) {
        int zzp = zzp(i9);
        long j7 = zzp & 1048575;
        if (j7 == 1048575) {
            int zzs = zzs(i9);
            long j9 = zzs & 1048575;
            switch (zzr(zzs)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzfp.zza(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(zzfp.zzb(obj, j9)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zzfp.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zzfp.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zzfp.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zzfp.zzw(obj, j9);
                case 8:
                    Object zzf = zzfp.zzf(obj, j9);
                    if (zzf instanceof String) {
                        if (((String) zzf).isEmpty()) {
                            return false;
                        }
                        return true;
                    }
                    if (zzf instanceof zzbq) {
                        if (zzbq.zzb.equals(zzf)) {
                            return false;
                        }
                        return true;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (zzfp.zzf(obj, j9) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    if (zzbq.zzb.equals(zzfp.zzf(obj, j9))) {
                        return false;
                    }
                    return true;
                case 11:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zzfp.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zzfp.zzc(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zzfp.zzd(obj, j9) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zzfp.zzf(obj, j9) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        if ((zzfp.zzc(obj, j7) & (1 << (zzp >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private final boolean zzJ(Object obj, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzI(obj, i9);
        }
        if ((i11 & i12) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzK(Object obj, int i9, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i9 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i9, int i10) {
        if (zzfp.zzc(obj, zzp(i10) & 1048575) == i9) {
            return true;
        }
        return false;
    }

    private static boolean zzN(Object obj, long j7) {
        return ((Boolean) zzfp.zzf(obj, j7)).booleanValue();
    }

    private static final void zzO(int i9, Object obj, zzfx zzfxVar) throws IOException {
        if (obj instanceof String) {
            zzfxVar.zzG(i9, (String) obj);
        } else {
            zzfxVar.zzd(i9, (zzbq) obj);
        }
    }

    public static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar == zzfg.zzc()) {
            zzfg zzf = zzfg.zzf();
            zzcsVar.zzc = zzf;
            return zzf;
        }
        return zzfgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzdz r34, com.google.android.gms.internal.play_billing.zzei r35, com.google.android.gms.internal.play_billing.zzdq r36, com.google.android.gms.internal.play_billing.zzff r37, com.google.android.gms.internal.play_billing.zzce r38, com.google.android.gms.internal.play_billing.zzdx r39) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j7) {
        return ((Double) zzfp.zzf(obj, j7)).doubleValue();
    }

    private static float zzn(Object obj, long j7) {
        return ((Float) zzfp.zzf(obj, j7)).floatValue();
    }

    private static int zzo(Object obj, long j7) {
        return ((Integer) zzfp.zzf(obj, j7)).intValue();
    }

    private final int zzp(int i9) {
        return this.zzc[i9 + 2];
    }

    private final int zzq(int i9, int i10) {
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

    private static int zzr(int i9) {
        return (i9 >>> 20) & 255;
    }

    private final int zzs(int i9) {
        return this.zzc[i9 + 1];
    }

    private static long zzt(Object obj, long j7) {
        return ((Long) zzfp.zzf(obj, j7)).longValue();
    }

    private final zzcw zzu(int i9) {
        int i10 = i9 / 3;
        return (zzcw) this.zzd[i10 + i10 + 1];
    }

    private final zzeo zzv(int i9) {
        Object[] objArr = this.zzd;
        int i10 = i9 / 3;
        int i11 = i10 + i10;
        zzeo zzeoVar = (zzeo) objArr[i11];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzb2 = zzel.zza().zzb((Class) objArr[i11 + 1]);
        this.zzd[i11] = zzb2;
        return zzb2;
    }

    private final Object zzw(int i9) {
        int i10 = i9 / 3;
        return this.zzd[i10 + i10];
    }

    private final Object zzx(Object obj, int i9) {
        zzeo zzv = zzv(i9);
        int zzs = zzs(i9) & 1048575;
        if (!zzI(obj, i9)) {
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

    private final Object zzy(Object obj, int i9, int i10) {
        zzeo zzv = zzv(i10);
        if (!zzM(obj, i9, i10)) {
            return zzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i10) & 1048575);
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
            StringBuilder o3 = o.o("Field ", str, " for ", name, " not found. Known fields are ");
            o3.append(arrays);
            throw new RuntimeException(o3.toString());
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 2188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zza(java.lang.Object):int");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(Object obj) {
        int i9;
        long doubleToLongBits;
        int i10;
        int floatToIntBits;
        int zzc;
        int i11;
        int i12 = 0;
        for (int i13 = 0; i13 < this.zzc.length; i13 += 3) {
            int zzs = zzs(i13);
            int[] iArr = this.zzc;
            int i14 = 1048575 & zzs;
            int zzr = zzr(zzs);
            int i15 = iArr[i13];
            long j7 = i14;
            int i16 = 37;
            switch (zzr) {
                case 0:
                    i9 = i12 * 53;
                    doubleToLongBits = Double.doubleToLongBits(zzfp.zza(obj, j7));
                    byte[] bArr = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 1:
                    i10 = i12 * 53;
                    floatToIntBits = Float.floatToIntBits(zzfp.zzb(obj, j7));
                    i12 = floatToIntBits + i10;
                    break;
                case 2:
                    i9 = i12 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j7);
                    byte[] bArr2 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 3:
                    i9 = i12 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j7);
                    byte[] bArr3 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 4:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 5:
                    i9 = i12 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j7);
                    byte[] bArr4 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 6:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    floatToIntBits = zzda.zza(zzfp.zzw(obj, j7));
                    i12 = floatToIntBits + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    floatToIntBits = ((String) zzfp.zzf(obj, j7)).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 9:
                    i11 = i12 * 53;
                    Object zzf = zzfp.zzf(obj, j7);
                    if (zzf != null) {
                        i16 = zzf.hashCode();
                    }
                    i12 = i11 + i16;
                    break;
                case 10:
                    i10 = i12 * 53;
                    floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 11:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 12:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 13:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 14:
                    i9 = i12 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j7);
                    byte[] bArr5 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 15:
                    i9 = i12 * 53;
                    zzc = zzfp.zzc(obj, j7);
                    i12 = i9 + zzc;
                    break;
                case 16:
                    i9 = i12 * 53;
                    doubleToLongBits = zzfp.zzd(obj, j7);
                    byte[] bArr6 = zzda.zzd;
                    zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                    i12 = i9 + zzc;
                    break;
                case 17:
                    i11 = i12 * 53;
                    Object zzf2 = zzfp.zzf(obj, j7);
                    if (zzf2 != null) {
                        i16 = zzf2.hashCode();
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
                    floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i10 = i12 * 53;
                    floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                    i12 = floatToIntBits + i10;
                    break;
                case 51:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = Double.doubleToLongBits(zzm(obj, j7));
                        byte[] bArr7 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = Float.floatToIntBits(zzn(obj, j7));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr8 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr9 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr10 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzda.zza(zzN(obj, j7));
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = ((String) zzfp.zzf(obj, j7)).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr11 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        zzc = zzo(obj, j7);
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzM(obj, i15, i13)) {
                        i9 = i12 * 53;
                        doubleToLongBits = zzt(obj, j7);
                        byte[] bArr12 = zzda.zzd;
                        zzc = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
                        i12 = i9 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzM(obj, i15, i13)) {
                        i10 = i12 * 53;
                        floatToIntBits = zzfp.zzf(obj, j7).hashCode();
                        i12 = floatToIntBits + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzm.zzd(obj).hashCode() + (i12 * 53);
        if (this.zzh) {
            return (hashCode * 53) + this.zzn.zzb(obj).zza.hashCode();
        }
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0ecb, code lost:
    
        if (r0 == r11) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0ecd, code lost:
    
        r36.putInt(r7, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0ed3, code lost:
    
        r0 = r13.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0ed7, code lost:
    
        if (r0 >= r13.zzk) goto L683;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0ed9, code lost:
    
        r1 = r13.zzi;
        r3 = r13.zzc;
        r1 = r1[r0];
        r3 = r3[r1];
        r3 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r13.zzs(r1) & r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0eeb, code lost:
    
        if (r3 != null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0ef6, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0ef3, code lost:
    
        if (r13.zzu(r1) != null) goto L682;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0ef8, code lost:
    
        r3 = (com.google.android.gms.internal.play_billing.zzdw) r3;
        r0 = (com.google.android.gms.internal.play_billing.zzdv) r13.zzw(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0f00, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0f01, code lost:
    
        if (r9 != 0) goto L577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0f03, code lost:
    
        if (r8 != r14) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0f0a, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0f0f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0f0b, code lost:
    
        if (r8 > r14) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0f0d, code lost:
    
        if (r2 != r9) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0f14, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:167:0x0577. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:28:0x0bcc. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:547:0x00ba. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0b5d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0e3b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0e53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:619:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0055 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzc(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, com.google.android.gms.internal.play_billing.zzbc r44) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 4006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(Object obj) {
        if (zzL(obj)) {
            if (obj instanceof zzcs) {
                zzcs zzcsVar = (zzcs) obj;
                zzcsVar.zzu(Integer.MAX_VALUE);
                zzcsVar.zza = 0;
                zzcsVar.zzs();
            }
            int[] iArr = this.zzc;
            for (int i9 = 0; i9 < iArr.length; i9 += 3) {
                int zzs = zzs(i9);
                int i10 = 1048575 & zzs;
                int zzr = zzr(zzs);
                long j7 = i10;
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
                                this.zzl.zza(obj, j7);
                                break;
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(obj, j7);
                                if (object != null) {
                                    ((zzdw) object).zzc();
                                    unsafe.putObject(obj, j7, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzM(obj, this.zzc[i9], i9)) {
                        zzv(i9).zzf(zzb.getObject(obj, j7));
                    }
                }
                if (zzI(obj, i9)) {
                    zzv(i9).zzf(zzb.getObject(obj, j7));
                }
            }
            this.zzm.zzg(obj);
            if (this.zzh) {
                this.zzn.zzd(obj);
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(Object obj, Object obj2) {
        zzA(obj);
        obj2.getClass();
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzs = zzs(i9);
            int i10 = 1048575 & zzs;
            int[] iArr = this.zzc;
            int zzr = zzr(zzs);
            int i11 = iArr[i9];
            long j7 = i10;
            switch (zzr) {
                case 0:
                    if (zzI(obj2, i9)) {
                        zzfp.zzo(obj, j7, zzfp.zza(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzI(obj2, i9)) {
                        zzfp.zzp(obj, j7, zzfp.zzb(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzI(obj2, i9)) {
                        zzfp.zzr(obj, j7, zzfp.zzd(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzI(obj2, i9)) {
                        zzfp.zzr(obj, j7, zzfp.zzd(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzI(obj2, i9)) {
                        zzfp.zzr(obj, j7, zzfp.zzd(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzI(obj2, i9)) {
                        zzfp.zzm(obj, j7, zzfp.zzw(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzI(obj2, i9)) {
                        zzfp.zzs(obj, j7, zzfp.zzf(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i9);
                    break;
                case 10:
                    if (zzI(obj2, i9)) {
                        zzfp.zzs(obj, j7, zzfp.zzf(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzI(obj2, i9)) {
                        zzfp.zzr(obj, j7, zzfp.zzd(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzI(obj2, i9)) {
                        zzfp.zzq(obj, j7, zzfp.zzc(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzI(obj2, i9)) {
                        zzfp.zzr(obj, j7, zzfp.zzd(obj2, j7));
                        zzD(obj, i9);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i9);
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
                    this.zzl.zzb(obj, obj2, j7);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    int i12 = zzeq.zza;
                    zzfp.zzs(obj, j7, zzdx.zza(zzfp.zzf(obj, j7), zzfp.zzf(obj2, j7)));
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
                    if (zzM(obj2, i11, i9)) {
                        zzfp.zzs(obj, j7, zzfp.zzf(obj2, j7));
                        zzE(obj, i11, i9);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i9);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzM(obj2, i11, i9)) {
                        zzfp.zzs(obj, j7, zzfp.zzf(obj2, j7));
                        zzE(obj, i11, i9);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i9);
                    break;
            }
        }
        zzeq.zzq(this.zzm, obj, obj2);
        if (this.zzh) {
            zzeq.zzp(this.zzn, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i9, int i10, zzbc zzbcVar) throws IOException {
        zzc(obj, bArr, i9, i10, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r25, com.google.android.gms.internal.play_billing.zzfx r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2034
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0015. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzj(java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzj(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(Object obj) {
        int i9;
        int i10;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1048575;
        while (i12 < this.zzj) {
            int[] iArr = this.zzi;
            int[] iArr2 = this.zzc;
            int i14 = iArr[i12];
            int i15 = iArr2[i14];
            int zzs = zzs(i14);
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
            if ((268435456 & zzs) != 0 && !zzJ(obj, i14, i9, i10, i18)) {
                return false;
            }
            int zzr = zzr(zzs);
            if (zzr != 9 && zzr != 17) {
                if (zzr != 27) {
                    if (zzr != 60 && zzr != 68) {
                        if (zzr != 49) {
                            if (zzr == 50 && !((zzdw) zzfp.zzf(obj, zzs & 1048575)).isEmpty()) {
                                throw null;
                            }
                        }
                    } else if (zzM(obj, i15, i14) && !zzK(obj, zzs, zzv(i14))) {
                        return false;
                    }
                }
                List list = (List) zzfp.zzf(obj, zzs & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzeo zzv = zzv(i14);
                    for (int i19 = 0; i19 < list.size(); i19++) {
                        if (!zzv.zzk(list.get(i19))) {
                            return false;
                        }
                    }
                }
            } else if (zzJ(obj, i14, i9, i10, i18) && !zzK(obj, zzs, zzv(i14))) {
                return false;
            }
            i12++;
            i13 = i9;
            i11 = i10;
        }
        if (this.zzh && !this.zzn.zzb(obj).zzj()) {
            return false;
        }
        return true;
    }
}
