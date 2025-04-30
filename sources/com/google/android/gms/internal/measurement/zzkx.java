package com.google.android.gms.internal.measurement;

import androidx.core.view.MotionEventCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.foundation.entity.o;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzkx<T> implements zzll<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmg.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzkt zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlb zzn;
    private final zzkd zzo;
    private final zzmf<?, ?> zzp;
    private final zziz<?> zzq;
    private final zzkm zzr;

    private zzkx(int[] iArr, Object[] objArr, int i9, int i10, zzkt zzktVar, zzle zzleVar, boolean z8, int[] iArr2, int i11, int i12, zzlb zzlbVar, zzkd zzkdVar, zzmf<?, ?> zzmfVar, zziz<?> zzizVar, zzkm zzkmVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i9;
        this.zzf = i10;
        this.zzi = zzktVar instanceof zzjk;
        this.zzh = zzizVar != null && zzizVar.zza(zzktVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i11;
        this.zzm = i12;
        this.zzn = zzlbVar;
        this.zzo = zzkdVar;
        this.zzp = zzmfVar;
        this.zzq = zzizVar;
        this.zzg = zzktVar;
        this.zzr = zzkmVar;
    }

    private static <T> double zza(T t9, long j7) {
        return ((Double) zzmg.zze(t9, j7)).doubleValue();
    }

    private static <T> float zzb(T t9, long j7) {
        return ((Float) zzmg.zze(t9, j7)).floatValue();
    }

    private static <T> int zzc(T t9, long j7) {
        return ((Integer) zzmg.zze(t9, j7)).intValue();
    }

    private static <T> long zzd(T t9, long j7) {
        return ((Long) zzmg.zze(t9, j7)).longValue();
    }

    private final zzll zze(int i9) {
        int i10 = (i9 / 3) << 1;
        zzll zzllVar = (zzll) this.zzd[i10];
        if (zzllVar != null) {
            return zzllVar;
        }
        zzll<T> zza2 = zzlh.zza().zza((Class) this.zzd[i10 + 1]);
        this.zzd[i10] = zza2;
        return zza2;
    }

    private final Object zzf(int i9) {
        return this.zzd[(i9 / 3) << 1];
    }

    private static boolean zzg(int i9) {
        return (i9 & 536870912) != 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i9, int i10, zzmn zzmnVar, Class<?> cls, zzhv zzhvVar) throws IOException {
        switch (zzkw.zza[zzmnVar.ordinal()]) {
            case 1:
                int zzd = zzhw.zzd(bArr, i9, zzhvVar);
                zzhvVar.zzc = Boolean.valueOf(zzhvVar.zzb != 0);
                return zzd;
            case 2:
                return zzhw.zza(bArr, i9, zzhvVar);
            case 3:
                zzhvVar.zzc = Double.valueOf(zzhw.zza(bArr, i9));
                return i9 + 8;
            case 4:
            case 5:
                zzhvVar.zzc = Integer.valueOf(zzhw.zzc(bArr, i9));
                return i9 + 4;
            case 6:
            case 7:
                zzhvVar.zzc = Long.valueOf(zzhw.zzd(bArr, i9));
                return i9 + 8;
            case 8:
                zzhvVar.zzc = Float.valueOf(zzhw.zzb(bArr, i9));
                return i9 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzhw.zzc(bArr, i9, zzhvVar);
                zzhvVar.zzc = Integer.valueOf(zzhvVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzhw.zzd(bArr, i9, zzhvVar);
                zzhvVar.zzc = Long.valueOf(zzhvVar.zzb);
                return zzd2;
            case 14:
                return zzhw.zza(zzlh.zza().zza((Class) cls), bArr, i9, i10, zzhvVar);
            case 15:
                int zzc2 = zzhw.zzc(bArr, i9, zzhvVar);
                zzhvVar.zzc = Integer.valueOf(zzio.zze(zzhvVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzhw.zzd(bArr, i9, zzhvVar);
                zzhvVar.zzc = Long.valueOf(zzio.zza(zzhvVar.zzb));
                return zzd3;
            case 17:
                return zzhw.zzb(bArr, i9, zzhvVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i9) {
        return this.zzc[i9 + 1];
    }

    private final zzjo zzd(int i9) {
        return (zzjo) this.zzd[((i9 / 3) << 1) + 1];
    }

    private static void zzf(Object obj) {
        if (!zzg(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzjk) {
            return ((zzjk) obj).zzcn();
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzb(T t9) {
        int i9;
        int zza2;
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzc2 = zzc(i12);
            int i13 = this.zzc[i12];
            long j7 = 1048575 & zzc2;
            int i14 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(Double.doubleToLongBits(zzmg.zza(t9, j7)));
                    i11 = zza2 + i9;
                    break;
                case 1:
                    i9 = i11 * 53;
                    zza2 = Float.floatToIntBits(zzmg.zzb(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 2:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 3:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzh(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 8:
                    i9 = i11 * 53;
                    zza2 = ((String) zzmg.zze(t9, j7)).hashCode();
                    i11 = zza2 + i9;
                    break;
                case 9:
                    Object zze = zzmg.zze(t9, j7);
                    if (zze != null) {
                        i14 = zze.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i9 = i11 * 53;
                    zza2 = zzmg.zze(t9, j7).hashCode();
                    i11 = zza2 + i9;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzmg.zzc(t9, j7);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i9 = i11 * 53;
                    zza2 = zzjm.zza(zzmg.zzd(t9, j7));
                    i11 = zza2 + i9;
                    break;
                case 17:
                    Object zze2 = zzmg.zze(t9, j7);
                    if (zze2 != null) {
                        i14 = zze2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
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
                    i9 = i11 * 53;
                    zza2 = zzmg.zze(t9, j7).hashCode();
                    i11 = zza2 + i9;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i9 = i11 * 53;
                    zza2 = zzmg.zze(t9, j7).hashCode();
                    i11 = zza2 + i9;
                    break;
                case 51:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(Double.doubleToLongBits(zza(t9, j7)));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = Float.floatToIntBits(zzb(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zzd(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zzd(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zzd(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zze(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = ((String) zzmg.zze(t9, j7)).hashCode();
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzmg.zze(t9, j7).hashCode();
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzmg.zze(t9, j7).hashCode();
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zzd(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzc(t9, j7);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzjm.zza(zzd(t9, j7));
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzkx<T>) t9, i13, i12)) {
                        i9 = i11 * 53;
                        zza2 = zzmg.zze(t9, j7).hashCode();
                        i11 = zza2 + i9;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t9).hashCode() + (i11 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t9).hashCode() : hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzc(T t9) {
        if (zzg(t9)) {
            if (t9 instanceof zzjk) {
                zzjk zzjkVar = (zzjk) t9;
                zzjkVar.zzc(Integer.MAX_VALUE);
                zzjkVar.zza = 0;
                zzjkVar.zzcl();
            }
            int length = this.zzc.length;
            for (int i9 = 0; i9 < length; i9 += 3) {
                int zzc = zzc(i9);
                long j7 = 1048575 & zzc;
                int i10 = (zzc & 267386880) >>> 20;
                if (i10 != 9) {
                    if (i10 != 60 && i10 != 68) {
                        switch (i10) {
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
                                this.zzo.zzb(t9, j7);
                                break;
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t9, j7);
                                if (object != null) {
                                    unsafe.putObject(t9, j7, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzkx<T>) t9, this.zzc[i9], i9)) {
                        zze(i9).zzc(zzb.getObject(t9, j7));
                    }
                }
                if (zzc((zzkx<T>) t9, i9)) {
                    zze(i9).zzc(zzb.getObject(t9, j7));
                }
            }
            this.zzp.zzf(t9);
            if (this.zzh) {
                this.zzq.zzc(t9);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzll] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzll] */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final boolean zzd(T t9) {
        int i9;
        int i10;
        int i11 = 1048575;
        int i12 = 0;
        int i13 = 0;
        while (i13 < this.zzl) {
            int i14 = this.zzk[i13];
            int i15 = this.zzc[i14];
            int zzc = zzc(i14);
            int i16 = this.zzc[i14 + 2];
            int i17 = i16 & 1048575;
            int i18 = 1 << (i16 >>> 20);
            if (i17 != i11) {
                if (i17 != 1048575) {
                    i12 = zzb.getInt(t9, i17);
                }
                i10 = i12;
                i9 = i17;
            } else {
                i9 = i11;
                i10 = i12;
            }
            if ((268435456 & zzc) != 0 && !zza((zzkx<T>) t9, i14, i9, i10, i18)) {
                return false;
            }
            int i19 = (267386880 & zzc) >>> 20;
            if (i19 != 9 && i19 != 17) {
                if (i19 != 27) {
                    if (i19 == 60 || i19 == 68) {
                        if (zzc((zzkx<T>) t9, i15, i14) && !zza((Object) t9, zzc, zze(i14))) {
                            return false;
                        }
                    } else if (i19 != 49) {
                        if (i19 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzmg.zze(t9, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i14)).zzc.zzb() == zzmx.MESSAGE) {
                                ?? r12 = 0;
                                for (Object obj : zzd.values()) {
                                    r12 = r12;
                                    if (r12 == 0) {
                                        r12 = zzlh.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r12.zzd(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzmg.zze(t9, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i14);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zze.zzd(list.get(i20))) {
                            return false;
                        }
                    }
                }
            } else if (zza((zzkx<T>) t9, i14, i9, i10, i18) && !zza((Object) t9, zzc, zze(i14))) {
                return false;
            }
            i13++;
            i11 = i9;
            i12 = i10;
        }
        return !this.zzh || this.zzq.zza(t9).zzg();
    }

    private static zzme zze(Object obj) {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVar = zzjkVar.zzb;
        if (zzmeVar != zzme.zzc()) {
            return zzmeVar;
        }
        zzme zzd = zzme.zzd();
        zzjkVar.zzb = zzd;
        return zzd;
    }

    private static <T> boolean zze(T t9, long j7) {
        return ((Boolean) zzmg.zze(t9, j7)).booleanValue();
    }

    private final boolean zzc(T t9, T t10, int i9) {
        return zzc((zzkx<T>) t9, i9) == zzc((zzkx<T>) t10, i9);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zza(T t9) {
        int i9;
        int i10;
        int i11;
        int zza2;
        int zzb2;
        int zza3;
        int zzh;
        boolean z8;
        int zzc;
        int zzd;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        int i12 = 1048575;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < this.zzc.length) {
            int zzc2 = zzc(i15);
            int i17 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i18 = iArr[i15];
            int i19 = iArr[i15 + 2];
            int i20 = i19 & i12;
            if (i17 <= 17) {
                if (i20 != i13) {
                    i14 = i20 == i12 ? 0 : unsafe.getInt(t9, i20);
                    i13 = i20;
                }
                i9 = i13;
                i10 = i14;
                i11 = 1 << (i19 >>> 20);
            } else {
                i9 = i13;
                i10 = i14;
                i11 = 0;
            }
            long j7 = zzc2 & i12;
            if (i17 >= zzje.zza.zza()) {
                zzje.zzb.zza();
            }
            switch (i17) {
                case 0:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zza(i18, 0.0d);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zza(i18, 0.0f);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zzd(i18, unsafe.getLong(t9, j7));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zzg(i18, unsafe.getLong(t9, j7));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zzg(i18, unsafe.getInt(t9, j7));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zzc(i18, 0L);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza2 = zzit.zzf(i18, 0);
                        i16 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzb(i18, true);
                        i16 += zzb2;
                    }
                    break;
                case 8:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        Object object = unsafe.getObject(t9, j7);
                        if (object instanceof zzia) {
                            zzb2 = zzit.zzc(i18, (zzia) object);
                        } else {
                            zzb2 = zzit.zzb(i18, (String) object);
                        }
                        i16 += zzb2;
                    }
                    break;
                case 9:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zza3 = zzln.zza(i18, unsafe.getObject(t9, j7), zze(i15));
                        i16 += zza3;
                    }
                    break;
                case 10:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzc(i18, (zzia) unsafe.getObject(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 11:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzj(i18, unsafe.getInt(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 12:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zze(i18, unsafe.getInt(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 13:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzh = zzit.zzh(i18, 0);
                        i16 += zzh;
                    }
                    break;
                case 14:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zze(i18, 0L);
                        i16 += zzb2;
                    }
                    break;
                case 15:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzi(i18, unsafe.getInt(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 16:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzf(i18, unsafe.getLong(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 17:
                    if (zza((zzkx<T>) t9, i15, i9, i10, i11)) {
                        zzb2 = zzit.zzb(i18, (zzkt) unsafe.getObject(t9, j7), zze(i15));
                        i16 += zzb2;
                    }
                    break;
                case 18:
                    zza3 = zzln.zzd(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zza3;
                    break;
                case 19:
                    z8 = false;
                    zzc = zzln.zzc(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 20:
                    z8 = false;
                    zzc = zzln.zzf(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 21:
                    z8 = false;
                    zzc = zzln.zzj(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 22:
                    z8 = false;
                    zzc = zzln.zze(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 23:
                    z8 = false;
                    zzc = zzln.zzd(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 24:
                    z8 = false;
                    zzc = zzln.zzc(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 25:
                    z8 = false;
                    zzc = zzln.zza(i18, (List<?>) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 26:
                    zza3 = zzln.zzb(i18, (List) unsafe.getObject(t9, j7));
                    i16 += zza3;
                    break;
                case 27:
                    zza3 = zzln.zzb(i18, (List<?>) unsafe.getObject(t9, j7), zze(i15));
                    i16 += zza3;
                    break;
                case 28:
                    zza3 = zzln.zza(i18, (List<zzia>) unsafe.getObject(t9, j7));
                    i16 += zza3;
                    break;
                case 29:
                    zza3 = zzln.zzi(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zza3;
                    break;
                case AD_PLAY_RESET_ON_DEINIT_VALUE:
                    z8 = false;
                    zzc = zzln.zzb(i18, (List<Integer>) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 31:
                    z8 = false;
                    zzc = zzln.zzc(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 32:
                    z8 = false;
                    zzc = zzln.zzd(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 33:
                    z8 = false;
                    zzc = zzln.zzg(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 34:
                    z8 = false;
                    zzc = zzln.zzh(i18, (List) unsafe.getObject(t9, j7), false);
                    i16 += zzc;
                    break;
                case 35:
                    zzd = zzln.zzd((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 36:
                    zzd = zzln.zzc((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 37:
                    zzd = zzln.zzf((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzd = zzln.zzj((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 39:
                    zzd = zzln.zze((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 40:
                    zzd = zzln.zzd((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 41:
                    zzd = zzln.zzc((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 42:
                    zzd = zzln.zza((List<?>) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzd = zzln.zzi((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 44:
                    zzd = zzln.zzb((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 45:
                    zzd = zzln.zzc((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzd = zzln.zzd((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzd = zzln.zzg((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 48:
                    zzd = zzln.zzh((List) unsafe.getObject(t9, j7));
                    if (zzd > 0) {
                        zzi = zzit.zzi(i18);
                        zzj = zzit.zzj(zzd);
                        i16 += zzj + zzi + zzd;
                    }
                    break;
                case 49:
                    zza3 = zzln.zza(i18, (List<zzkt>) unsafe.getObject(t9, j7), zze(i15));
                    i16 += zza3;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    zza3 = this.zzr.zza(i18, unsafe.getObject(t9, j7), zzf(i15));
                    i16 += zza3;
                    break;
                case 51:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zza(i18, 0.0d);
                        i16 += zzb2;
                    }
                    break;
                case 52:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zza(i18, 0.0f);
                        i16 += zzb2;
                    }
                    break;
                case 53:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzd(i18, zzd(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 54:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzg(i18, zzd(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 55:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzg(i18, zzc(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 56:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzc(i18, 0L);
                        i16 += zzb2;
                    }
                    break;
                case 57:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzh = zzit.zzf(i18, 0);
                        i16 += zzh;
                    }
                    break;
                case 58:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzb(i18, true);
                        i16 += zzb2;
                    }
                    break;
                case 59:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        Object object2 = unsafe.getObject(t9, j7);
                        if (object2 instanceof zzia) {
                            zzb2 = zzit.zzc(i18, (zzia) object2);
                        } else {
                            zzb2 = zzit.zzb(i18, (String) object2);
                        }
                        i16 += zzb2;
                    }
                    break;
                case 60:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zza3 = zzln.zza(i18, unsafe.getObject(t9, j7), zze(i15));
                        i16 += zza3;
                    }
                    break;
                case 61:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzc(i18, (zzia) unsafe.getObject(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 62:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzj(i18, zzc(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 63:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zze(i18, zzc(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 64:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzh = zzit.zzh(i18, 0);
                        i16 += zzh;
                    }
                    break;
                case 65:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zze(i18, 0L);
                        i16 += zzb2;
                    }
                    break;
                case 66:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzi(i18, zzc(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 67:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzf(i18, zzd(t9, j7));
                        i16 += zzb2;
                    }
                    break;
                case 68:
                    if (zzc((zzkx<T>) t9, i18, i15)) {
                        zzb2 = zzit.zzb(i18, (zzkt) unsafe.getObject(t9, j7), zze(i15));
                        i16 += zzb2;
                    }
                    break;
            }
            i15 += 3;
            i13 = i9;
            i14 = i10;
            i12 = 1048575;
        }
        int i21 = 0;
        zzmf<?, ?> zzmfVar = this.zzp;
        int zza4 = i16 + zzmfVar.zza((zzmf<?, ?>) zzmfVar.zzd(t9));
        if (!this.zzh) {
            return zza4;
        }
        zzjd<?> zza5 = this.zzq.zza(t9);
        for (int i22 = 0; i22 < zza5.zza.zza(); i22++) {
            Map.Entry<?, Object> zza6 = zza5.zza.zza(i22);
            i21 += zzjd.zza((zzjf<?>) zza6.getKey(), zza6.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i21 += zzjd.zza((zzjf<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i21;
    }

    private final boolean zzc(T t9, int i9) {
        int zzb2 = zzb(i9);
        long j7 = zzb2 & 1048575;
        if (j7 != 1048575) {
            return (zzmg.zzc(t9, j7) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i9);
        long j9 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzmg.zza(t9, j9)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmg.zzb(t9, j9)) != 0;
            case 2:
                return zzmg.zzd(t9, j9) != 0;
            case 3:
                return zzmg.zzd(t9, j9) != 0;
            case 4:
                return zzmg.zzc(t9, j9) != 0;
            case 5:
                return zzmg.zzd(t9, j9) != 0;
            case 6:
                return zzmg.zzc(t9, j9) != 0;
            case 7:
                return zzmg.zzh(t9, j9);
            case 8:
                Object zze = zzmg.zze(t9, j9);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzia) {
                    return !zzia.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzmg.zze(t9, j9) != null;
            case 10:
                return !zzia.zza.equals(zzmg.zze(t9, j9));
            case 11:
                return zzmg.zzc(t9, j9) != 0;
            case 12:
                return zzmg.zzc(t9, j9) != 0;
            case 13:
                return zzmg.zzc(t9, j9) != 0;
            case 14:
                return zzmg.zzd(t9, j9) != 0;
            case 15:
                return zzmg.zzc(t9, j9) != 0;
            case 16:
                return zzmg.zzd(t9, j9) != 0;
            case 17:
                return zzmg.zze(t9, j9) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t9, int i9, int i10) {
        return zzmg.zzc(t9, (long) (zzb(i10) & 1048575)) == i9;
    }

    private final int zzb(int i9) {
        return this.zzc[i9 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t9, T t10, int i9) {
        int i10 = this.zzc[i9];
        if (zzc((zzkx<T>) t10, i10, i9)) {
            long zzc = zzc(i9) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzll zze = zze(i9);
                if (!zzc((zzkx<T>) t9, i10, i9)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t9, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t9, zzc, zza2);
                    }
                    zzb((zzkx<T>) t9, i10, i9);
                    return;
                }
                Object object2 = unsafe.getObject(t9, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t9, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zzb(T t9, int i9) {
        int zzb2 = zzb(i9);
        long j7 = 1048575 & zzb2;
        if (j7 == 1048575) {
            return;
        }
        zzmg.zza((Object) t9, j7, (1 << (zzb2 >>> 20)) | zzmg.zzc(t9, j7));
    }

    private final void zzb(T t9, int i9, int i10) {
        zzmg.zza((Object) t9, zzb(i10) & 1048575, i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b3, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0102, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0118, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0150, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0162, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0176, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzmg.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzmg.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzmg.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzmg.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzln.zza(com.google.android.gms.internal.measurement.zzmg.zze(r10, r6), com.google.android.gms.internal.measurement.zzmg.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0017. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x09f2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjs.zzh();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0cfe, code lost:
    
        if (r14 == r0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0d00, code lost:
    
        r27.putInt(r7, r14, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0d06, code lost:
    
        r10 = r9.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0d0d, code lost:
    
        if (r10 >= r9.zzm) goto L635;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0d0f, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzme) zza((java.lang.Object) r31, r9.zzk[r10], (int) r3, (com.google.android.gms.internal.measurement.zzmf<UT, int>) r9.zzp, (java.lang.Object) r31);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0d25, code lost:
    
        if (r3 == null) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0d27, code lost:
    
        r9.zzp.zzb((java.lang.Object) r7, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0d2c, code lost:
    
        if (r6 != 0) goto L534;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0d30, code lost:
    
        if (r8 != r34) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0d37, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjs.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0d3e, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0d3a, code lost:
    
        if (r8 > r34) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0d3c, code lost:
    
        if (r11 != r6) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0d43, code lost:
    
        throw com.google.android.gms.internal.measurement.zzjs.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:121:0x0a18. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:206:0x0427. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:543:0x00b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0c76  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x08d2  */
    /* JADX WARN: Type inference failed for: r1v135, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.measurement.zzhv r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzhv):int");
    }

    private final int zza(int i9) {
        if (i9 < this.zze || i9 > this.zzf) {
            return -1;
        }
        return zza(i9, 0);
    }

    private final int zza(int i9, int i10) {
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

    /* JADX WARN: Removed duplicated region for block: B:65:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.measurement.zzkx<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.zzkr r34, com.google.android.gms.internal.measurement.zzlb r35, com.google.android.gms.internal.measurement.zzkd r36, com.google.android.gms.internal.measurement.zzmf<?, ?> r37, com.google.android.gms.internal.measurement.zziz<?> r38, com.google.android.gms.internal.measurement.zzkm r39) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzkr, com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzkd, com.google.android.gms.internal.measurement.zzmf, com.google.android.gms.internal.measurement.zziz, com.google.android.gms.internal.measurement.zzkm):com.google.android.gms.internal.measurement.zzkx");
    }

    private final <UT, UB> UB zza(Object obj, int i9, UB ub, zzmf<UT, UB> zzmfVar, Object obj2) {
        zzjo zzd;
        int i10 = this.zzc[i9];
        Object zze = zzmg.zze(obj, zzc(i9) & 1048575);
        return (zze == null || (zzd = zzd(i9)) == null) ? ub : (UB) zza(i9, i10, this.zzr.zze(zze), zzd, (zzjo) ub, (zzmf<UT, zzjo>) zzmfVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i9, int i10, Map<K, V> map, zzjo zzjoVar, UB ub, zzmf<UT, UB> zzmfVar, Object obj) {
        zzkk<?, ?> zza2 = this.zzr.zza(zzf(i9));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjoVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmfVar.zzc(obj);
                }
                zzif zzc = zzia.zzc(zzkl.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzkl.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmfVar.zza((zzmf<UT, UB>) ub, i10, zzc.zza());
                    it.remove();
                } catch (IOException e4) {
                    throw new RuntimeException(e4);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t9, int i9) {
        zzll zze = zze(i9);
        long zzc = zzc(i9) & 1048575;
        if (!zzc((zzkx<T>) t9, i9)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t9, zzc);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t9, int i9, int i10) {
        zzll zze = zze(i10);
        if (!zzc((zzkx<T>) t9, i9, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t9, zzc(i10) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    private static Field zza(Class<?> cls, String str) {
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

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t9, T t10) {
        zzf(t9);
        t10.getClass();
        for (int i9 = 0; i9 < this.zzc.length; i9 += 3) {
            int zzc = zzc(i9);
            long j7 = 1048575 & zzc;
            int i10 = this.zzc[i9];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza(t9, j7, zzmg.zza(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzb(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzd(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzd(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzd(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zzc(t9, j7, zzmg.zzh(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza(t9, j7, zzmg.zze(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t9, t10, i9);
                    break;
                case 10:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza(t9, j7, zzmg.zze(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzd(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzc(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzkx<T>) t10, i9)) {
                        zzmg.zza((Object) t9, j7, zzmg.zzd(t10, j7));
                        zzb((zzkx<T>) t9, i9);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t9, t10, i9);
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
                    this.zzo.zza(t9, t10, j7);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    zzln.zza(this.zzr, t9, t10, j7);
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
                    if (zzc((zzkx<T>) t10, i10, i9)) {
                        zzmg.zza(t9, j7, zzmg.zze(t10, j7));
                        zzb((zzkx<T>) t9, i10, i9);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzb(t9, t10, i9);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzkx<T>) t10, i10, i9)) {
                        zzmg.zza(t9, j7, zzmg.zze(t10, j7));
                        zzb((zzkx<T>) t9, i10, i9);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t9, t10, i9);
                    break;
            }
        }
        zzln.zza(this.zzp, t9, t10);
        if (this.zzh) {
            zzln.zza(this.zzq, t9, t10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x00bf. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x062e A[Catch: all -> 0x00ca, TryCatch #5 {all -> 0x00ca, blocks: (B:13:0x00c4, B:49:0x00d2, B:18:0x0629, B:20:0x062e, B:21:0x0633, B:64:0x00fe, B:67:0x0113, B:68:0x0124, B:69:0x0135, B:70:0x0146, B:71:0x0157, B:73:0x0161, B:76:0x0168, B:77:0x016d, B:78:0x017a, B:79:0x018b, B:80:0x0199, B:81:0x01ab, B:82:0x01b3, B:83:0x01c5, B:84:0x01d7, B:85:0x01e9, B:86:0x01fb, B:87:0x020d, B:88:0x021f, B:89:0x0231, B:90:0x0243, B:92:0x0253, B:93:0x0274, B:94:0x025d, B:96:0x0265, B:97:0x0285, B:98:0x0297, B:99:0x02a5, B:100:0x02b3, B:101:0x02c1), top: B:12:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0639 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0662 A[LOOP:2: B:41:0x065e->B:43:0x0662, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0676  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzli] */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzli r19, com.google.android.gms.internal.measurement.zzix r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzli, com.google.android.gms.internal.measurement.zzix):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zza(T t9, byte[] bArr, int i9, int i10, zzhv zzhvVar) throws IOException {
        zza((zzkx<T>) t9, bArr, i9, i10, 0, zzhvVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t9, T t10, int i9) {
        if (zzc((zzkx<T>) t10, i9)) {
            long zzc = zzc(i9) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzll zze = zze(i9);
                if (!zzc((zzkx<T>) t9, i9)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t9, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t9, zzc, zza2);
                    }
                    zzb((zzkx<T>) t9, i9);
                    return;
                }
                Object object2 = unsafe.getObject(t9, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t9, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i9] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zza(Object obj, int i9, zzli zzliVar) throws IOException {
        if (zzg(i9)) {
            zzmg.zza(obj, i9 & 1048575, zzliVar.zzr());
        } else if (this.zzi) {
            zzmg.zza(obj, i9 & 1048575, zzliVar.zzq());
        } else {
            zzmg.zza(obj, i9 & 1048575, zzliVar.zzp());
        }
    }

    private final void zza(T t9, int i9, Object obj) {
        zzb.putObject(t9, zzc(i9) & 1048575, obj);
        zzb((zzkx<T>) t9, i9);
    }

    private final void zza(T t9, int i9, int i10, Object obj) {
        zzb.putObject(t9, zzc(i10) & 1048575, obj);
        zzb((zzkx<T>) t9, i9, i10);
    }

    private final <K, V> void zza(zzna zznaVar, int i9, Object obj, int i10) throws IOException {
        if (obj != null) {
            zznaVar.zza(i9, this.zzr.zza(zzf(i10)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i9, Object obj, zzna zznaVar) throws IOException {
        if (obj instanceof String) {
            zznaVar.zza(i9, (String) obj);
        } else {
            zznaVar.zza(i9, (zzia) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:320:0x05b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b90  */
    @Override // com.google.android.gms.internal.measurement.zzll
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zzna r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzkx.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzna):void");
    }

    private static <UT, UB> void zza(zzmf<UT, UB> zzmfVar, T t9, zzna zznaVar) throws IOException {
        zzmfVar.zzb((zzmf<UT, UB>) zzmfVar.zzd(t9), zznaVar);
    }

    private final boolean zza(T t9, int i9, int i10, int i11, int i12) {
        if (i10 == 1048575) {
            return zzc((zzkx<T>) t9, i9);
        }
        return (i11 & i12) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i9, zzll zzllVar) {
        return zzllVar.zzd(zzmg.zze(obj, i9 & 1048575));
    }
}
