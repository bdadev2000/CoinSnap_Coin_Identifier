package com.google.android.gms.internal.measurement;

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
public final class zzlg<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzml.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzlk zzn;
    private final zzkm zzo;
    private final zzmk<?, ?> zzp;
    private final zzji<?> zzq;
    private final zzkv zzr;

    private zzlg(int[] iArr, Object[] objArr, int i10, int i11, zzlc zzlcVar, boolean z10, int[] iArr2, int i12, int i13, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        boolean z11;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzlcVar instanceof zzjt;
        if (zzjiVar != null && zzjiVar.zza(zzlcVar)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.zzh = z11;
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static <T> double zza(T t5, long j3) {
        return ((Double) zzml.zze(t5, j3)).doubleValue();
    }

    private static <T> float zzb(T t5, long j3) {
        return ((Float) zzml.zze(t5, j3)).floatValue();
    }

    private static <T> int zzc(T t5, long j3) {
        return ((Integer) zzml.zze(t5, j3)).intValue();
    }

    private static <T> long zzd(T t5, long j3) {
        return ((Long) zzml.zze(t5, j3)).longValue();
    }

    private final zzlu zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i11];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zza2 = zzlq.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zza2;
        return zza2;
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i10, int i11, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int zzd = zzig.zzd(bArr, i10, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return zzd;
            case 2:
                return zzig.zza(bArr, i10, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i10));
                return i10 + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i10));
                return i10 + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i10));
                return i10 + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i10));
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzig.zzc(bArr, i10, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzig.zzd(bArr, i10, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return zzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i10, i11, zzijVar);
            case 15:
                int zzc2 = zzig.zzc(bArr, i10, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzig.zzd(bArr, i10, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return zzd3;
            case 17:
                return zzig.zzb(bArr, i10, zzijVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private final zzjx zzd(int i10) {
        return (zzjx) this.zzd[((i10 / 3) << 1) + 1];
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
        if (obj instanceof zzjt) {
            return ((zzjt) obj).zzco();
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(T t5) {
        int i10;
        int zza2;
        int i11;
        int zzc;
        int length = this.zzc.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13 += 3) {
            int zzc2 = zzc(i13);
            int i14 = this.zzc[i13];
            long j3 = 1048575 & zzc2;
            int i15 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(Double.doubleToLongBits(zzml.zza(t5, j3)));
                    i12 = zza2 + i10;
                    break;
                case 1:
                    i10 = i12 * 53;
                    zza2 = Float.floatToIntBits(zzml.zzb(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 2:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 3:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 4:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 5:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 6:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 7:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzh(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 8:
                    i10 = i12 * 53;
                    zza2 = ((String) zzml.zze(t5, j3)).hashCode();
                    i12 = zza2 + i10;
                    break;
                case 9:
                    Object zze = zzml.zze(t5, j3);
                    if (zze != null) {
                        i15 = zze.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
                    break;
                case 10:
                    i10 = i12 * 53;
                    zza2 = zzml.zze(t5, j3).hashCode();
                    i12 = zza2 + i10;
                    break;
                case 11:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 12:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 13:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 14:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 15:
                    i11 = i12 * 53;
                    zzc = zzml.zzc(t5, j3);
                    i12 = i11 + zzc;
                    break;
                case 16:
                    i10 = i12 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t5, j3));
                    i12 = zza2 + i10;
                    break;
                case 17:
                    Object zze2 = zzml.zze(t5, j3);
                    if (zze2 != null) {
                        i15 = zze2.hashCode();
                    }
                    i12 = (i12 * 53) + i15;
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
                    i10 = i12 * 53;
                    zza2 = zzml.zze(t5, j3).hashCode();
                    i12 = zza2 + i10;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    i10 = i12 * 53;
                    zza2 = zzml.zze(t5, j3).hashCode();
                    i12 = zza2 + i10;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(Double.doubleToLongBits(zza(t5, j3)));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = Float.floatToIntBits(zzb(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zzd(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zzd(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zzd(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zze(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = ((String) zzml.zze(t5, j3)).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzml.zze(t5, j3).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzml.zze(t5, j3).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zzd(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i11 = i12 * 53;
                        zzc = zzc(t5, j3);
                        i12 = i11 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzjv.zza(zzd(t5, j3));
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzc((zzlg<T>) t5, i14, i13)) {
                        i10 = i12 * 53;
                        zza2 = zzml.zze(t5, j3).hashCode();
                        i12 = zza2 + i10;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t5).hashCode() + (i12 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t5).hashCode() : hashCode;
    }

    public static zzmj zzc(Object obj) {
        zzjt zzjtVar = (zzjt) obj;
        zzmj zzmjVar = zzjtVar.zzb;
        if (zzmjVar != zzmj.zzc()) {
            return zzmjVar;
        }
        zzmj zzd = zzmj.zzd();
        zzjtVar.zzb = zzd;
        return zzd;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzd(T t5) {
        if (zzg(t5)) {
            if (t5 instanceof zzjt) {
                zzjt zzjtVar = (zzjt) t5;
                zzjtVar.zzc(Integer.MAX_VALUE);
                zzjtVar.zza = 0;
                zzjtVar.zzcm();
            }
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzc = zzc(i10);
                long j3 = 1048575 & zzc;
                int i11 = (zzc & 267386880) >>> 20;
                if (i11 != 9) {
                    if (i11 != 60 && i11 != 68) {
                        switch (i11) {
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
                                this.zzo.zzb(t5, j3);
                                break;
                            case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t5, j3);
                                if (object != null) {
                                    unsafe.putObject(t5, j3, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzlg<T>) t5, this.zzc[i10], i10)) {
                        zze(i10).zzd(zzb.getObject(t5, j3));
                    }
                }
                if (zzc((zzlg<T>) t5, i10)) {
                    zze(i10).zzd(zzb.getObject(t5, j3));
                }
            }
            this.zzp.zzf(t5);
            if (this.zzh) {
                this.zzq.zzc(t5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.measurement.zzlu] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.zzlu] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zze(T t5) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.zzl) {
                return !this.zzh || this.zzq.zza(t5).zzg();
            }
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzc = zzc(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t5, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if (((268435456 & zzc) != 0) && !zza((zzlg<T>) t5, i15, i10, i11, i19)) {
                return false;
            }
            int i20 = (267386880 & zzc) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (zzc((zzlg<T>) t5, i16, i15) && !zza((Object) t5, zzc, zze(i15))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzml.zze(t5, zzc & 1048575));
                            if (!zzd.isEmpty()) {
                                if (this.zzr.zza(zzf(i15)).zzc.zzb() == zzmz.MESSAGE) {
                                    Iterator<?> it = zzd.values().iterator();
                                    ?? r12 = 0;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        r12 = r12;
                                        if (r12 == 0) {
                                            r12 = zzlq.zza().zza((Class) next.getClass());
                                        }
                                        if (!r12.zze(next)) {
                                            z10 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z10) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) zzml.zze(t5, zzc & 1048575);
                if (!list.isEmpty()) {
                    ?? zze = zze(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        }
                        if (!zze.zze(list.get(i21))) {
                            z10 = false;
                            break;
                        }
                        i21++;
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (zza((zzlg<T>) t5, i15, i10, i11, i19) && !zza((Object) t5, zzc, zze(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
    }

    private final boolean zzc(T t5, T t10, int i10) {
        return zzc((zzlg<T>) t5, i10) == zzc((zzlg<T>) t10, i10);
    }

    private final boolean zzc(T t5, int i10) {
        int zzb2 = zzb(i10);
        long j3 = zzb2 & 1048575;
        if (j3 != 1048575) {
            return (zzml.zzc(t5, j3) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i10);
        long j10 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t5, j10)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t5, j10)) != 0;
            case 2:
                return zzml.zzd(t5, j10) != 0;
            case 3:
                return zzml.zzd(t5, j10) != 0;
            case 4:
                return zzml.zzc(t5, j10) != 0;
            case 5:
                return zzml.zzd(t5, j10) != 0;
            case 6:
                return zzml.zzc(t5, j10) != 0;
            case 7:
                return zzml.zzh(t5, j10);
            case 8:
                Object zze = zzml.zze(t5, j10);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzik) {
                    return !zzik.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t5, j10) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t5, j10));
            case 11:
                return zzml.zzc(t5, j10) != 0;
            case 12:
                return zzml.zzc(t5, j10) != 0;
            case 13:
                return zzml.zzc(t5, j10) != 0;
            case 14:
                return zzml.zzd(t5, j10) != 0;
            case 15:
                return zzml.zzc(t5, j10) != 0;
            case 16:
                return zzml.zzd(t5, j10) != 0;
            case 17:
                return zzml.zze(t5, j10) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x005a. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v19 */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t5) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        int zza2;
        int zzb2;
        int zzd;
        int zzd2;
        int zzi;
        int zzj;
        int zza3;
        Unsafe unsafe = zzb;
        ?? r92 = 0;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i15 < this.zzc.length) {
            int zzc = zzc(i15);
            int i18 = (267386880 & zzc) >>> 20;
            int[] iArr = this.zzc;
            int i19 = iArr[i15];
            int i20 = iArr[i15 + 2];
            int i21 = i20 & i13;
            if (i18 <= 17) {
                if (i21 != i17) {
                    i14 = i21 == i13 ? r92 : unsafe.getInt(t5, i21);
                    i17 = i21;
                }
                i10 = i17;
                i11 = i14;
                i12 = 1 << (i20 >>> 20);
            } else {
                i10 = i17;
                i11 = i14;
                i12 = r92;
            }
            long j3 = zzc & i13;
            if (i18 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            int i22 = i12;
            switch (i18) {
                case 0:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zza(i19, 0.0d);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zza(i19, 0.0f);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zzd(i19, unsafe.getLong(t5, j3));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zzg(i19, unsafe.getLong(t5, j3));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zzg(i19, unsafe.getInt(t5, j3));
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    z10 = r92;
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zza2 = zzjc.zzc(i19, 0L);
                        i16 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        z10 = false;
                        zza2 = zzjc.zzf(i19, 0);
                        i16 += zza2;
                        break;
                    }
                    z10 = false;
                    break;
                case 7:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzb(i19, true);
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 8:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        Object object = unsafe.getObject(t5, j3);
                        if (object instanceof zzik) {
                            zzb2 = zzjc.zzc(i19, (zzik) object);
                        } else {
                            zzb2 = zzjc.zzb(i19, (String) object);
                        }
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 9:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        i16 += zzlw.zza(i19, unsafe.getObject(t5, j3), (zzlu<?>) zze(i15));
                    }
                    z10 = false;
                    break;
                case 10:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzc(i19, (zzik) unsafe.getObject(t5, j3));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 11:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzj(i19, unsafe.getInt(t5, j3));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 12:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zze(i19, unsafe.getInt(t5, j3));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 13:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        i16 += zzjc.zzh(i19, 0);
                    }
                    z10 = false;
                    break;
                case 14:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zze(i19, 0L);
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 15:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzi(i19, unsafe.getInt(t5, j3));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 16:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzf(i19, unsafe.getLong(t5, j3));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 17:
                    if (zza((zzlg<T>) t5, i15, i10, i11, i22)) {
                        zzb2 = zzjc.zzb(i19, (zzlc) unsafe.getObject(t5, j3), zze(i15));
                        i16 += zzb2;
                    }
                    z10 = false;
                    break;
                case 18:
                    zzd = zzlw.zzd(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 19:
                    zzd = zzlw.zzc(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 20:
                    zzd = zzlw.zzf(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 21:
                    zzd = zzlw.zzj(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 22:
                    zzd = zzlw.zze(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 23:
                    zzd = zzlw.zzd(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 24:
                    zzd = zzlw.zzc(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 25:
                    zzd = zzlw.zza(i19, (List<?>) unsafe.getObject(t5, j3), (boolean) r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 26:
                    zzd = zzlw.zzb(i19, (List) unsafe.getObject(t5, j3));
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 27:
                    zzd = zzlw.zzb(i19, (List<?>) unsafe.getObject(t5, j3), (zzlu<?>) zze(i15));
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 28:
                    zzd = zzlw.zza(i19, (List<zzik>) unsafe.getObject(t5, j3));
                    i16 += zzd;
                    z10 = r92;
                    break;
                case NOTIFICATION_REDIRECT_VALUE:
                    zzd = zzlw.zzi(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 30:
                    zzd = zzlw.zzb(i19, (List<Integer>) unsafe.getObject(t5, j3), (boolean) r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case TEMPLATE_HTML_SIZE_VALUE:
                    zzd = zzlw.zzc(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 32:
                    zzd = zzlw.zzd(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 33:
                    zzd = zzlw.zzg(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_3 /* 34 */:
                    zzd = zzlw.zzh(i19, (List) unsafe.getObject(t5, j3), r92);
                    i16 += zzd;
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_4 /* 35 */:
                    zzd2 = zzlw.zzd((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case 36:
                    zzd2 = zzlw.zzc((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_6 /* 37 */:
                    zzd2 = zzlw.zzf((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_7 /* 38 */:
                    zzd2 = zzlw.zzj((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_8 /* 39 */:
                    zzd2 = zzlw.zze((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_9 /* 40 */:
                    zzd2 = zzlw.zzd((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_10 /* 41 */:
                    zzd2 = zzlw.zzc((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_11 /* 42 */:
                    zzd2 = zzlw.zza((List<?>) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_12 /* 43 */:
                    zzd2 = zzlw.zzi((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_13 /* 44 */:
                    zzd2 = zzlw.zzb((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_14 /* 45 */:
                    zzd2 = zzlw.zzc((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_15 /* 46 */:
                    zzd2 = zzlw.zzd((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case MotionEventCompat.AXIS_GENERIC_16 /* 47 */:
                    zzd2 = zzlw.zzg((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case 48:
                    zzd2 = zzlw.zzh((List) unsafe.getObject(t5, j3));
                    if (zzd2 > 0) {
                        zzi = zzjc.zzi(i19);
                        zzj = zzjc.zzj(zzd2);
                        i16 += zzj + zzi + zzd2;
                    }
                    z10 = r92;
                    break;
                case 49:
                    zzd = zzlw.zza(i19, (List<zzlc>) unsafe.getObject(t5, j3), (zzlu<?>) zze(i15));
                    i16 += zzd;
                    z10 = r92;
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    zzd = this.zzr.zza(i19, unsafe.getObject(t5, j3), zzf(i15));
                    i16 += zzd;
                    z10 = r92;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zza(i19, 0.0d);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 52:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zza(i19, 0.0f);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 53:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzd(i19, zzd(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 54:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzg(i19, zzd(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 55:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzg(i19, zzc(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 56:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzc(i19, 0L);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 57:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzf(i19, (int) r92);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 58:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzb(i19, true);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 59:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        Object object2 = unsafe.getObject(t5, j3);
                        if (object2 instanceof zzik) {
                            zza3 = zzjc.zzc(i19, (zzik) object2);
                        } else {
                            zza3 = zzjc.zzb(i19, (String) object2);
                        }
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zzd = zzlw.zza(i19, unsafe.getObject(t5, j3), (zzlu<?>) zze(i15));
                        i16 += zzd;
                    }
                    z10 = r92;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzc(i19, (zzik) unsafe.getObject(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 62:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzj(i19, zzc(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 63:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zze(i19, zzc(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 64:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzh(i19, (int) r92);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 65:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zze(i19, 0L);
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 66:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzi(i19, zzc(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 67:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzf(i19, zzd(t5, j3));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                case 68:
                    if (zzc((zzlg<T>) t5, i19, i15)) {
                        zza3 = zzjc.zzb(i19, (zzlc) unsafe.getObject(t5, j3), zze(i15));
                        i16 += zza3;
                    }
                    z10 = r92;
                    break;
                default:
                    z10 = r92;
                    break;
            }
            i15 += 3;
            i17 = i10;
            r92 = z10;
            i14 = i11;
            i13 = 1048575;
        }
        int i23 = r92;
        zzmk<?, ?> zzmkVar = this.zzp;
        int zza4 = i16 + zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t5));
        if (!this.zzh) {
            return zza4;
        }
        zzjm<?> zza5 = this.zzq.zza(t5);
        int zza6 = zza5.zza.zza();
        for (int i24 = i23; i24 < zza6; i24++) {
            Map.Entry<?, Object> zza7 = zza5.zza.zza(i24);
            i23 += zzjm.zza((zzjo<?>) zza7.getKey(), zza7.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i23 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i23;
    }

    private static <T> boolean zze(T t5, long j3) {
        return ((Boolean) zzml.zze(t5, j3)).booleanValue();
    }

    private final boolean zzc(T t5, int i10, int i11) {
        return zzml.zzc(t5, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t5, T t10, int i10) {
        int i11 = this.zzc[i10];
        if (zzc((zzlg<T>) t10, i11, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzlu zze = zze(i10);
                if (!zzc((zzlg<T>) t5, i11, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t5, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t5, zzc, zza2);
                    }
                    zzb((zzlg<T>) t5, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t5, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t5, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zzb(T t5, int i10) {
        int zzb2 = zzb(i10);
        long j3 = 1048575 & zzb2;
        if (j3 == 1048575) {
            return;
        }
        zzml.zza((Object) t5, j3, (1 << (zzb2 >>> 20)) | zzml.zzc(t5, j3));
    }

    private final void zzb(T t5, int i10, int i11) {
        zzml.zza((Object) t5, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzh(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzh(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzc(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzc(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.measurement.zzml.zzd(r10, r6) == com.google.android.gms.internal.measurement.zzml.zzd(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzml.zzb(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.zzml.zzb(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzml.zza(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.zzml.zza(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.measurement.zzlw.zza(com.google.android.gms.internal.measurement.zzml.zze(r10, r6), com.google.android.gms.internal.measurement.zzml.zze(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c5 A[LOOP:0: B:2:0x0005->B:86:0x01c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d4a, code lost:
    
        if (r13 == 1048575) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d4c, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d52, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a7d, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d59, code lost:
    
        if (r6 >= r11.zzm) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d5b, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmj) zza((java.lang.Object) r32, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.measurement.zzmk<UT, int>) r11.zzp, (java.lang.Object) r32);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d71, code lost:
    
        if (r3 == null) goto L538;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d73, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0d78, code lost:
    
        if (r8 != 0) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0d7c, code lost:
    
        if (r7 != r35) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d83, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0d8a, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0d86, code lost:
    
        if (r7 > r35) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0d88, code lost:
    
        if (r10 != r8) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d8f, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0426. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:458:0x0aa5. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:557:0x00af. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0952 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0943 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0d29 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0cbe A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v59, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.measurement.zzij r37) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzij):int");
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
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

    /* JADX WARN: Removed duplicated region for block: B:110:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0267  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.measurement.zzlg<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.measurement.zzla r34, com.google.android.gms.internal.measurement.zzlk r35, com.google.android.gms.internal.measurement.zzkm r36, com.google.android.gms.internal.measurement.zzmk<?, ?> r37, com.google.android.gms.internal.measurement.zzji<?> r38, com.google.android.gms.internal.measurement.zzkv r39) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzmk, com.google.android.gms.internal.measurement.zzji, com.google.android.gms.internal.measurement.zzkv):com.google.android.gms.internal.measurement.zzlg");
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzd;
        int i11 = this.zzc[i10];
        Object zze = zzml.zze(obj, zzc(i10) & 1048575);
        return (zze == null || (zzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzr.zze(zze), zzd, (zzjx) ub2, (zzmk<UT, zzjx>) zzmkVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzjx zzjxVar, UB ub2, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zza2 = this.zzr.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzmkVar.zzc(obj);
                }
                zzit zzc = zzik.zzc(zzku.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmkVar.zza((zzmk<UT, UB>) ub2, i11, zzc.zza());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t5, int i10) {
        zzlu zze = zze(i10);
        long zzc = zzc(i10) & 1048575;
        if (!zzc((zzlg<T>) t5, i10)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t5, zzc);
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
    private final Object zza(T t5, int i10, int i11) {
        zzlu zze = zze(i11);
        if (!zzc((zzlg<T>) t5, i10, i11)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t5, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object zza2 = zze.zza();
        if (object != null) {
            zze.zza(zza2, object);
        }
        return zza2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
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
            StringBuilder p10 = j.p("Field ", str, " for ", name, " not found. Known fields are ");
            p10.append(arrays);
            throw new RuntimeException(p10.toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t5, T t10) {
        zzf(t5);
        t10.getClass();
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzc = zzc(i10);
            long j3 = 1048575 & zzc;
            int i11 = this.zzc[i10];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza(t5, j3, zzml.zza(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzb(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzd(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzd(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzd(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zzc(t5, j3, zzml.zzh(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza(t5, j3, zzml.zze(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t5, t10, i10);
                    break;
                case 10:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza(t5, j3, zzml.zze(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzd(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzc(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlg<T>) t10, i10)) {
                        zzml.zza((Object) t5, j3, zzml.zzd(t10, j3));
                        zzb((zzlg<T>) t5, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t5, t10, i10);
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
                    this.zzo.zza(t5, t10, j3);
                    break;
                case TTAdConstant.IMAGE_MODE_VIDEO_SQUARE /* 50 */:
                    zzlw.zza(this.zzr, t5, t10, j3);
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
                    if (zzc((zzlg<T>) t10, i11, i10)) {
                        zzml.zza(t5, j3, zzml.zze(t10, j3));
                        zzb((zzlg<T>) t5, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzb(t5, t10, i10);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzc((zzlg<T>) t10, i11, i10)) {
                        zzml.zza(t5, j3, zzml.zze(t10, j3));
                        zzb((zzlg<T>) t5, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t5, t10, i10);
                    break;
            }
        }
        zzlw.zza(this.zzp, t5, t10);
        if (this.zzh) {
            zzlw.zza(this.zzq, t5, t10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:218:0x065f A[LOOP:3: B:216:0x065b->B:218:0x065f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0629 A[Catch: all -> 0x0299, TryCatch #5 {all -> 0x0299, blocks: (B:201:0x05fa, B:35:0x0624, B:37:0x0629, B:38:0x062e, B:29:0x00ce, B:52:0x00e0, B:54:0x00f2, B:56:0x0104, B:58:0x0115, B:60:0x0126, B:62:0x0130, B:65:0x0137, B:66:0x013d, B:68:0x014a, B:70:0x015b, B:72:0x0168, B:74:0x0179, B:76:0x0184, B:78:0x0195, B:80:0x01a6, B:82:0x01b7, B:84:0x01c8, B:86:0x01d9, B:88:0x01ea, B:90:0x01fb, B:92:0x020d, B:94:0x021d, B:95:0x023e, B:96:0x0227, B:98:0x022f, B:100:0x024f, B:102:0x0261, B:104:0x026f, B:106:0x027d, B:108:0x028b), top: B:200:0x05fa }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0634 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlr] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzlr r19, com.google.android.gms.internal.measurement.zzjg r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t5, byte[] bArr, int i10, int i11, zzij zzijVar) throws IOException {
        zza((zzlg<T>) t5, bArr, i10, i11, 0, zzijVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t5, T t10, int i10) {
        if (zzc((zzlg<T>) t10, i10)) {
            long zzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t10, zzc);
            if (object != null) {
                zzlu zze = zze(i10);
                if (!zzc((zzlg<T>) t5, i10)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t5, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t5, zzc, zza2);
                    }
                    zzb((zzlg<T>) t5, i10);
                    return;
                }
                Object object2 = unsafe.getObject(t5, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t5, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t10));
        }
    }

    private final void zza(Object obj, int i10, zzlr zzlrVar) throws IOException {
        if (zzg(i10)) {
            zzml.zza(obj, i10 & 1048575, zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, i10 & 1048575, zzlrVar.zzq());
        } else {
            zzml.zza(obj, i10 & 1048575, zzlrVar.zzp());
        }
    }

    private final void zza(T t5, int i10, Object obj) {
        zzb.putObject(t5, zzc(i10) & 1048575, obj);
        zzb((zzlg<T>) t5, i10);
    }

    private final void zza(T t5, int i10, int i11, Object obj) {
        zzb.putObject(t5, zzc(i11) & 1048575, obj);
        zzb((zzlg<T>) t5, i10, i11);
    }

    private final <K, V> void zza(zznb zznbVar, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            zznbVar.zza(i10, this.zzr.zza(zzf(i11)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i10, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i10, (String) obj);
        } else {
            zznbVar.zza(i10, (zzik) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:320:0x05b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b8e  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznb):void");
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t5, zznb zznbVar) throws IOException {
        zzmkVar.zzb((zzmk<UT, UB>) zzmkVar.zzd(t5), zznbVar);
    }

    private final boolean zza(T t5, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzc((zzlg<T>) t5, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i10 & 1048575));
    }
}
