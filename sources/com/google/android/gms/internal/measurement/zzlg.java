package com.google.android.gms.internal.measurement;

import androidx.compose.foundation.text.input.a;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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

    private zzlg(int[] iArr, Object[] objArr, int i2, int i3, zzlc zzlcVar, boolean z2, int[] iArr2, int i4, int i5, zzlk zzlkVar, zzkm zzkmVar, zzmk<?, ?> zzmkVar, zzji<?> zzjiVar, zzkv zzkvVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i3;
        this.zzi = zzlcVar instanceof zzjt;
        this.zzh = zzjiVar != null && zzjiVar.zza(zzlcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i4;
        this.zzm = i5;
        this.zzn = zzlkVar;
        this.zzo = zzkmVar;
        this.zzp = zzmkVar;
        this.zzq = zzjiVar;
        this.zzg = zzlcVar;
        this.zzr = zzkvVar;
    }

    private static <T> double zza(T t2, long j2) {
        return ((Double) zzml.zze(t2, j2)).doubleValue();
    }

    private static <T> float zzb(T t2, long j2) {
        return ((Float) zzml.zze(t2, j2)).floatValue();
    }

    private static <T> int zzc(T t2, long j2) {
        return ((Integer) zzml.zze(t2, j2)).intValue();
    }

    private static <T> long zzd(T t2, long j2) {
        return ((Long) zzml.zze(t2, j2)).longValue();
    }

    private final zzlu zze(int i2) {
        int i3 = (i2 / 3) << 1;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu<T> zza2 = zzlq.zza().zza((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zza2;
        return zza2;
    }

    private final Object zzf(int i2) {
        return this.zzd[(i2 / 3) << 1];
    }

    private static boolean zzg(int i2) {
        return (i2 & 536870912) != 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    private static int zza(byte[] bArr, int i2, int i3, zzms zzmsVar, Class<?> cls, zzij zzijVar) throws IOException {
        switch (zzlf.zza[zzmsVar.ordinal()]) {
            case 1:
                int zzd = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Boolean.valueOf(zzijVar.zzb != 0);
                return zzd;
            case 2:
                return zzig.zza(bArr, i2, zzijVar);
            case 3:
                zzijVar.zzc = Double.valueOf(zzig.zza(bArr, i2));
                return i2 + 8;
            case 4:
            case 5:
                zzijVar.zzc = Integer.valueOf(zzig.zzc(bArr, i2));
                return i2 + 4;
            case 6:
            case 7:
                zzijVar.zzc = Long.valueOf(zzig.zzd(bArr, i2));
                return i2 + 8;
            case 8:
                zzijVar.zzc = Float.valueOf(zzig.zzb(bArr, i2));
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                int zzc = zzig.zzc(bArr, i2, zzijVar);
                zzijVar.zzc = Integer.valueOf(zzijVar.zza);
                return zzc;
            case 12:
            case 13:
                int zzd2 = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Long.valueOf(zzijVar.zzb);
                return zzd2;
            case 14:
                return zzig.zza(zzlq.zza().zza((Class) cls), bArr, i2, i3, zzijVar);
            case 15:
                int zzc2 = zzig.zzc(bArr, i2, zzijVar);
                zzijVar.zzc = Integer.valueOf(zziw.zza(zzijVar.zza));
                return zzc2;
            case 16:
                int zzd3 = zzig.zzd(bArr, i2, zzijVar);
                zzijVar.zzc = Long.valueOf(zziw.zza(zzijVar.zzb));
                return zzd3;
            case 17:
                return zzig.zzb(bArr, i2, zzijVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private final int zzc(int i2) {
        return this.zzc[i2 + 1];
    }

    private final zzjx zzd(int i2) {
        return (zzjx) this.zzd[((i2 / 3) << 1) + 1];
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
    public final int zzb(T t2) {
        int i2;
        int zza2;
        int i3;
        int zzc;
        int length = this.zzc.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int zzc2 = zzc(i5);
            int i6 = this.zzc[i5];
            long j2 = 1048575 & zzc2;
            int i7 = 37;
            switch ((zzc2 & 267386880) >>> 20) {
                case 0:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(Double.doubleToLongBits(zzml.zza(t2, j2)));
                    i4 = zza2 + i2;
                    break;
                case 1:
                    i2 = i4 * 53;
                    zza2 = Float.floatToIntBits(zzml.zzb(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 2:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 3:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 4:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 5:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 6:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 7:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzh(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 8:
                    i2 = i4 * 53;
                    zza2 = ((String) zzml.zze(t2, j2)).hashCode();
                    i4 = zza2 + i2;
                    break;
                case 9:
                    Object zze = zzml.zze(t2, j2);
                    if (zze != null) {
                        i7 = zze.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
                    break;
                case 10:
                    i2 = i4 * 53;
                    zza2 = zzml.zze(t2, j2).hashCode();
                    i4 = zza2 + i2;
                    break;
                case 11:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 12:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 13:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 14:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 15:
                    i3 = i4 * 53;
                    zzc = zzml.zzc(t2, j2);
                    i4 = i3 + zzc;
                    break;
                case 16:
                    i2 = i4 * 53;
                    zza2 = zzjv.zza(zzml.zzd(t2, j2));
                    i4 = zza2 + i2;
                    break;
                case 17:
                    Object zze2 = zzml.zze(t2, j2);
                    if (zze2 != null) {
                        i7 = zze2.hashCode();
                    }
                    i4 = (i4 * 53) + i7;
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
                    i2 = i4 * 53;
                    zza2 = zzml.zze(t2, j2).hashCode();
                    i4 = zza2 + i2;
                    break;
                case 50:
                    i2 = i4 * 53;
                    zza2 = zzml.zze(t2, j2).hashCode();
                    i4 = zza2 + i2;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(Double.doubleToLongBits(zza(t2, j2)));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = Float.floatToIntBits(zzb(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zzd(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zzd(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zzd(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zze(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V15 /* 59 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = ((String) zzml.zze(t2, j2)).hashCode();
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzml.zze(t2, j2).hashCode();
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V17 /* 61 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzml.zze(t2, j2).hashCode();
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V18 /* 62 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zzd(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i3 = i4 * 53;
                        zzc = zzc(t2, j2);
                        i4 = i3 + zzc;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzjv.zza(zzd(t2, j2));
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    if (zzc((zzlg<T>) t2, i6, i5)) {
                        i2 = i4 * 53;
                        zza2 = zzml.zze(t2, j2).hashCode();
                        i4 = zza2 + i2;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzp.zzd(t2).hashCode() + (i4 * 53);
        return this.zzh ? (hashCode * 53) + this.zzq.zza(t2).hashCode() : hashCode;
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
    public final void zzd(T t2) {
        if (zzg(t2)) {
            if (t2 instanceof zzjt) {
                zzjt zzjtVar = (zzjt) t2;
                zzjtVar.zzc(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                zzjtVar.zza = 0;
                zzjtVar.zzcm();
            }
            int length = this.zzc.length;
            for (int i2 = 0; i2 < length; i2 += 3) {
                int zzc = zzc(i2);
                long j2 = 1048575 & zzc;
                int i3 = (zzc & 267386880) >>> 20;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
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
                                this.zzo.zzb(t2, j2);
                                break;
                            case 50:
                                Unsafe unsafe = zzb;
                                Object object = unsafe.getObject(t2, j2);
                                if (object != null) {
                                    unsafe.putObject(t2, j2, this.zzr.zzc(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (zzc((zzlg<T>) t2, this.zzc[i2], i2)) {
                        zze(i2).zzd(zzb.getObject(t2, j2));
                    }
                }
                if (zzc((zzlg<T>) t2, i2)) {
                    zze(i2).zzd(zzb.getObject(t2, j2));
                }
            }
            this.zzp.zzf(t2);
            if (this.zzh) {
                this.zzq.zzc(t2);
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
    public final boolean zze(T t2) {
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.zzl) {
            int i7 = this.zzk[i6];
            int i8 = this.zzc[i7];
            int zzc = zzc(i7);
            int i9 = this.zzc[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = zzb.getInt(t2, i10);
                }
                i3 = i5;
                i2 = i10;
            } else {
                i2 = i4;
                i3 = i5;
            }
            if ((268435456 & zzc) != 0 && !zza((zzlg<T>) t2, i7, i2, i3, i11)) {
                return false;
            }
            int i12 = (267386880 & zzc) >>> 20;
            if (i12 != 9 && i12 != 17) {
                if (i12 != 27) {
                    if (i12 == 60 || i12 == 68) {
                        if (zzc((zzlg<T>) t2, i8, i7) && !zza((Object) t2, zzc, zze(i7))) {
                            return false;
                        }
                    } else if (i12 != 49) {
                        if (i12 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzd = this.zzr.zzd(zzml.zze(t2, zzc & 1048575));
                            if (zzd.isEmpty()) {
                                continue;
                            } else if (this.zzr.zza(zzf(i7)).zzc.zzb() == zzmz.MESSAGE) {
                                ?? r1 = 0;
                                for (Object obj : zzd.values()) {
                                    r1 = r1;
                                    if (r1 == 0) {
                                        r1 = zzlq.zza().zza((Class) obj.getClass());
                                    }
                                    if (!r1.zze(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zzml.zze(t2, zzc & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zze = zze(i7);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!zze.zze(list.get(i13))) {
                            return false;
                        }
                    }
                }
            } else if (zza((zzlg<T>) t2, i7, i2, i3, i11) && !zza((Object) t2, zzc, zze(i7))) {
                return false;
            }
            i6++;
            i4 = i2;
            i5 = i3;
        }
        return !this.zzh || this.zzq.zza(t2).zzg();
    }

    private final boolean zzc(T t2, T t3, int i2) {
        return zzc((zzlg<T>) t2, i2) == zzc((zzlg<T>) t3, i2);
    }

    private final boolean zzc(T t2, int i2) {
        int zzb2 = zzb(i2);
        long j2 = zzb2 & 1048575;
        if (j2 != 1048575) {
            return (zzml.zzc(t2, j2) & (1 << (zzb2 >>> 20))) != 0;
        }
        int zzc = zzc(i2);
        long j3 = zzc & 1048575;
        switch ((zzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzml.zza(t2, j3)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzml.zzb(t2, j3)) != 0;
            case 2:
                return zzml.zzd(t2, j3) != 0;
            case 3:
                return zzml.zzd(t2, j3) != 0;
            case 4:
                return zzml.zzc(t2, j3) != 0;
            case 5:
                return zzml.zzd(t2, j3) != 0;
            case 6:
                return zzml.zzc(t2, j3) != 0;
            case 7:
                return zzml.zzh(t2, j3);
            case 8:
                Object zze = zzml.zze(t2, j3);
                if (zze instanceof String) {
                    return !((String) zze).isEmpty();
                }
                if (zze instanceof zzik) {
                    return !zzik.zza.equals(zze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzml.zze(t2, j3) != null;
            case 10:
                return !zzik.zza.equals(zzml.zze(t2, j3));
            case 11:
                return zzml.zzc(t2, j3) != 0;
            case 12:
                return zzml.zzc(t2, j3) != 0;
            case 13:
                return zzml.zzc(t2, j3) != 0;
            case 14:
                return zzml.zzd(t2, j3) != 0;
            case 15:
                return zzml.zzc(t2, j3) != 0;
            case 16:
                return zzml.zzd(t2, j3) != 0;
            case 17:
                return zzml.zze(t2, j3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0058. Please report as an issue. */
    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(T t2) {
        int i2;
        int i3;
        int i4;
        int zza2;
        int zzb2;
        int zza3;
        int zzh;
        boolean z2;
        int zzc;
        int zzd;
        int zzi;
        int zzj;
        Unsafe unsafe = zzb;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.zzc.length) {
            int zzc2 = zzc(i8);
            int i10 = (267386880 & zzc2) >>> 20;
            int[] iArr = this.zzc;
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i5;
            if (i10 <= 17) {
                if (i13 != i6) {
                    i7 = i13 == i5 ? 0 : unsafe.getInt(t2, i13);
                    i6 = i13;
                }
                i2 = i6;
                i3 = i7;
                i4 = 1 << (i12 >>> 20);
            } else {
                i2 = i6;
                i3 = i7;
                i4 = 0;
            }
            long j2 = zzc2 & i5;
            if (i10 >= zzjn.zza.zza()) {
                zzjn.zzb.zza();
            }
            switch (i10) {
                case 0:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zza(i11, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zza(i11, 0.0f);
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zzd(i11, unsafe.getLong(t2, j2));
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zzg(i11, unsafe.getLong(t2, j2));
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zzg(i11, unsafe.getInt(t2, j2));
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zzc(i11, 0L);
                        i9 += zza2;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza2 = zzjc.zzf(i11, 0);
                        i9 += zza2;
                        break;
                    }
                    break;
                case 7:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzb(i11, true);
                        i9 += zzb2;
                    }
                    break;
                case 8:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        Object object = unsafe.getObject(t2, j2);
                        if (object instanceof zzik) {
                            zzb2 = zzjc.zzc(i11, (zzik) object);
                        } else {
                            zzb2 = zzjc.zzb(i11, (String) object);
                        }
                        i9 += zzb2;
                    }
                    break;
                case 9:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zza3 = zzlw.zza(i11, unsafe.getObject(t2, j2), (zzlu<?>) zze(i8));
                        i9 += zza3;
                    }
                    break;
                case 10:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzc(i11, (zzik) unsafe.getObject(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 11:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzj(i11, unsafe.getInt(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 12:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zze(i11, unsafe.getInt(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 13:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzh = zzjc.zzh(i11, 0);
                        i9 += zzh;
                    }
                    break;
                case 14:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zze(i11, 0L);
                        i9 += zzb2;
                    }
                    break;
                case 15:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzi(i11, unsafe.getInt(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 16:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzf(i11, unsafe.getLong(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 17:
                    if (zza((zzlg<T>) t2, i8, i2, i3, i4)) {
                        zzb2 = zzjc.zzb(i11, (zzlc) unsafe.getObject(t2, j2), zze(i8));
                        i9 += zzb2;
                    }
                    break;
                case 18:
                    zza3 = zzlw.zzd(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zza3;
                    break;
                case 19:
                    z2 = false;
                    zzc = zzlw.zzc(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 20:
                    z2 = false;
                    zzc = zzlw.zzf(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 21:
                    z2 = false;
                    zzc = zzlw.zzj(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 22:
                    z2 = false;
                    zzc = zzlw.zze(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 23:
                    z2 = false;
                    zzc = zzlw.zzd(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 24:
                    z2 = false;
                    zzc = zzlw.zzc(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 25:
                    z2 = false;
                    zzc = zzlw.zza(i11, (List<?>) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 26:
                    zza3 = zzlw.zzb(i11, (List) unsafe.getObject(t2, j2));
                    i9 += zza3;
                    break;
                case 27:
                    zza3 = zzlw.zzb(i11, (List<?>) unsafe.getObject(t2, j2), (zzlu<?>) zze(i8));
                    i9 += zza3;
                    break;
                case 28:
                    zza3 = zzlw.zza(i11, (List<zzik>) unsafe.getObject(t2, j2));
                    i9 += zza3;
                    break;
                case 29:
                    zza3 = zzlw.zzi(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zza3;
                    break;
                case 30:
                    z2 = false;
                    zzc = zzlw.zzb(i11, (List<Integer>) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 31:
                    z2 = false;
                    zzc = zzlw.zzc(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 32:
                    z2 = false;
                    zzc = zzlw.zzd(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    z2 = false;
                    zzc = zzlw.zzg(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 34:
                    z2 = false;
                    zzc = zzlw.zzh(i11, (List) unsafe.getObject(t2, j2), false);
                    i9 += zzc;
                    break;
                case 35:
                    zzd = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 36:
                    zzd = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 37:
                    zzd = zzlw.zzf((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 38:
                    zzd = zzlw.zzj((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 39:
                    zzd = zzlw.zze((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 40:
                    zzd = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 41:
                    zzd = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 42:
                    zzd = zzlw.zza((List<?>) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 43:
                    zzd = zzlw.zzi((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 44:
                    zzd = zzlw.zzb((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 45:
                    zzd = zzlw.zzc((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 46:
                    zzd = zzlw.zzd((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 47:
                    zzd = zzlw.zzg((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 48:
                    zzd = zzlw.zzh((List) unsafe.getObject(t2, j2));
                    if (zzd > 0) {
                        zzi = zzjc.zzi(i11);
                        zzj = zzjc.zzj(zzd);
                        i9 += zzj + zzi + zzd;
                    }
                    break;
                case 49:
                    zza3 = zzlw.zza(i11, (List<zzlc>) unsafe.getObject(t2, j2), (zzlu<?>) zze(i8));
                    i9 += zza3;
                    break;
                case 50:
                    zza3 = this.zzr.zza(i11, unsafe.getObject(t2, j2), zzf(i8));
                    i9 += zza3;
                    break;
                case 51:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zza(i11, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        i9 += zzb2;
                    }
                    break;
                case 52:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zza(i11, 0.0f);
                        i9 += zzb2;
                    }
                    break;
                case 53:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzd(i11, zzd(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 54:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzg(i11, zzd(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 55:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzg(i11, zzc(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 56:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzc(i11, 0L);
                        i9 += zzb2;
                    }
                    break;
                case 57:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzh = zzjc.zzf(i11, 0);
                        i9 += zzh;
                    }
                    break;
                case 58:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzb(i11, true);
                        i9 += zzb2;
                    }
                    break;
                case Opcodes.V15 /* 59 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        Object object2 = unsafe.getObject(t2, j2);
                        if (object2 instanceof zzik) {
                            zzb2 = zzjc.zzc(i11, (zzik) object2);
                        } else {
                            zzb2 = zzjc.zzb(i11, (String) object2);
                        }
                        i9 += zzb2;
                    }
                    break;
                case Opcodes.V16 /* 60 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zza3 = zzlw.zza(i11, unsafe.getObject(t2, j2), (zzlu<?>) zze(i8));
                        i9 += zza3;
                    }
                    break;
                case Opcodes.V17 /* 61 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzc(i11, (zzik) unsafe.getObject(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case Opcodes.V18 /* 62 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzj(i11, zzc(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 63:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zze(i11, zzc(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case 64:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzh = zzjc.zzh(i11, 0);
                        i9 += zzh;
                    }
                    break;
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zze(i11, 0L);
                        i9 += zzb2;
                    }
                    break;
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzi(i11, zzc(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzf(i11, zzd(t2, j2));
                        i9 += zzb2;
                    }
                    break;
                case TypeReference.NEW /* 68 */:
                    if (zzc((zzlg<T>) t2, i11, i8)) {
                        zzb2 = zzjc.zzb(i11, (zzlc) unsafe.getObject(t2, j2), zze(i8));
                        i9 += zzb2;
                    }
                    break;
            }
            i8 += 3;
            i6 = i2;
            i7 = i3;
            i5 = 1048575;
        }
        int i14 = 0;
        zzmk<?, ?> zzmkVar = this.zzp;
        int zza4 = i9 + zzmkVar.zza((zzmk<?, ?>) zzmkVar.zzd(t2));
        if (!this.zzh) {
            return zza4;
        }
        zzjm<?> zza5 = this.zzq.zza(t2);
        int zza6 = zza5.zza.zza();
        for (int i15 = 0; i15 < zza6; i15++) {
            Map.Entry<?, Object> zza7 = zza5.zza.zza(i15);
            i14 += zzjm.zza((zzjo<?>) zza7.getKey(), zza7.getValue());
        }
        for (Map.Entry<?, Object> entry : zza5.zza.zzb()) {
            i14 += zzjm.zza((zzjo<?>) entry.getKey(), entry.getValue());
        }
        return zza4 + i14;
    }

    private static <T> boolean zze(T t2, long j2) {
        return ((Boolean) zzml.zze(t2, j2)).booleanValue();
    }

    private final boolean zzc(T t2, int i2, int i3) {
        return zzml.zzc(t2, (long) (zzb(i3) & 1048575)) == i2;
    }

    private final int zzb(int i2) {
        return this.zzc[i2 + 2];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t2, T t3, int i2) {
        int i3 = this.zzc[i2];
        if (zzc((zzlg<T>) t3, i3, i2)) {
            long zzc = zzc(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, zzc);
            if (object != null) {
                zzlu zze = zze(i2);
                if (!zzc((zzlg<T>) t2, i3, i2)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t2, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t2, zzc, zza2);
                    }
                    zzb((zzlg<T>) t2, i3, i2);
                    return;
                }
                Object object2 = unsafe.getObject(t2, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t2, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t3));
        }
    }

    private final void zzb(T t2, int i2) {
        int zzb2 = zzb(i2);
        long j2 = 1048575 & zzb2;
        if (j2 == 1048575) {
            return;
        }
        zzml.zza((Object) t2, j2, (1 << (zzb2 >>> 20)) | zzml.zzc(t2, j2));
    }

    private final void zzb(T t2, int i2, int i3) {
        zzml.zza((Object) t2, zzb(i3) & 1048575, i2);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0016. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01c3 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r9, T r10) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0d79, code lost:
    
        if (r13 == r8) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0d7b, code lost:
    
        r28.putInt(r15, r13, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d81, code lost:
    
        r6 = r11.zzl;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0a7c, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d88, code lost:
    
        if (r6 >= r11.zzm) goto L655;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0d8a, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzmj) zza((java.lang.Object) r33, r11.zzk[r6], (int) r3, (com.google.android.gms.internal.measurement.zzmk<UT, int>) r11.zzp, (java.lang.Object) r33);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0da0, code lost:
    
        if (r3 == null) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0da2, code lost:
    
        r11.zzp.zzb((java.lang.Object) r15, (T) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0da7, code lost:
    
        if (r9 != 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0dab, code lost:
    
        if (r7 != r36) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0db2, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0db9, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0db5, code lost:
    
        if (r7 > r36) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0db7, code lost:
    
        if (r10 != r9) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0dbe, code lost:
    
        throw com.google.android.gms.internal.measurement.zzkb.zzg();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x041f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:461:0x0a9c. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:566:0x00ae. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x094c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x093d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0d53 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0cd6 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r33, byte[] r34, int r35, int r36, int r37, com.google.android.gms.internal.measurement.zzij r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3668
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.measurement.zzij):int");
    }

    private final int zza(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zza(i2, 0);
    }

    private final int zza(int i2, int i3) {
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

    /* JADX WARN: Removed duplicated region for block: B:113:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0269  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> com.google.android.gms.internal.measurement.zzlg<T> zza(java.lang.Class<T> r32, com.google.android.gms.internal.measurement.zzla r33, com.google.android.gms.internal.measurement.zzlk r34, com.google.android.gms.internal.measurement.zzkm r35, com.google.android.gms.internal.measurement.zzmk<?, ?> r36, com.google.android.gms.internal.measurement.zzji<?> r37, com.google.android.gms.internal.measurement.zzkv r38) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Class, com.google.android.gms.internal.measurement.zzla, com.google.android.gms.internal.measurement.zzlk, com.google.android.gms.internal.measurement.zzkm, com.google.android.gms.internal.measurement.zzmk, com.google.android.gms.internal.measurement.zzji, com.google.android.gms.internal.measurement.zzkv):com.google.android.gms.internal.measurement.zzlg");
    }

    private final <UT, UB> UB zza(Object obj, int i2, UB ub, zzmk<UT, UB> zzmkVar, Object obj2) {
        zzjx zzd;
        int i3 = this.zzc[i2];
        Object zze = zzml.zze(obj, zzc(i2) & 1048575);
        return (zze == null || (zzd = zzd(i2)) == null) ? ub : (UB) zza(i2, i3, this.zzr.zze(zze), zzd, (zzjx) ub, (zzmk<UT, zzjx>) zzmkVar, obj2);
    }

    private final <K, V, UT, UB> UB zza(int i2, int i3, Map<K, V> map, zzjx zzjxVar, UB ub, zzmk<UT, UB> zzmkVar, Object obj) {
        zzkt<?, ?> zza2 = this.zzr.zza(zzf(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzjxVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmkVar.zzc(obj);
                }
                zzit zzc = zzik.zzc(zzku.zza(zza2, next.getKey(), next.getValue()));
                try {
                    zzku.zza(zzc.zzb(), zza2, next.getKey(), next.getValue());
                    zzmkVar.zza((zzmk<UT, UB>) ub, i3, zzc.zza());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t2, int i2) {
        zzlu zze = zze(i2);
        long zzc = zzc(i2) & 1048575;
        if (!zzc((zzlg<T>) t2, i2)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t2, zzc);
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
    private final Object zza(T t2, int i2, int i3) {
        zzlu zze = zze(i3);
        if (!zzc((zzlg<T>) t2, i2, i3)) {
            return zze.zza();
        }
        Object object = zzb.getObject(t2, zzc(i3) & 1048575);
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
            StringBuilder t2 = a.t("Field ", str, " for ", name, " not found. Known fields are ");
            t2.append(arrays);
            throw new RuntimeException(t2.toString());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, T t3) {
        zzf(t2);
        t3.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzc = zzc(i2);
            long j2 = 1048575 & zzc;
            int i3 = this.zzc[i2];
            switch ((zzc & 267386880) >>> 20) {
                case 0:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zza(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzb(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zzc(t2, j2, zzml.zzh(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t2, t3, i2);
                    break;
                case 10:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzc(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzc((zzlg<T>) t3, i2)) {
                        zzml.zza((Object) t2, j2, zzml.zzd(t3, j2));
                        zzb((zzlg<T>) t2, i2);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t2, t3, i2);
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
                    this.zzo.zza(t2, t3, j2);
                    break;
                case 50:
                    zzlw.zza(this.zzr, t2, t3, j2);
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
                    if (zzc((zzlg<T>) t3, i3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((zzlg<T>) t2, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case Opcodes.V16 /* 60 */:
                    zzb(t2, t3, i2);
                    break;
                case Opcodes.V17 /* 61 */:
                case Opcodes.V18 /* 62 */:
                case 63:
                case 64:
                case TypeReference.RESOURCE_VARIABLE /* 65 */:
                case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                case TypeReference.INSTANCEOF /* 67 */:
                    if (zzc((zzlg<T>) t3, i3, i2)) {
                        zzml.zza(t2, j2, zzml.zze(t3, j2));
                        zzb((zzlg<T>) t2, i3, i2);
                        break;
                    } else {
                        break;
                    }
                case TypeReference.NEW /* 68 */:
                    zzb(t2, t3, i2);
                    break;
            }
        }
        zzlw.zza(this.zzp, t2, t3);
        if (this.zzh) {
            zzlw.zza(this.zzq, t2, t3);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x00c0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0630 A[Catch: all -> 0x00cb, TryCatch #7 {all -> 0x00cb, blocks: (B:51:0x00c5, B:14:0x00d3, B:33:0x062b, B:35:0x0630, B:36:0x0635, B:88:0x00ff, B:91:0x0114, B:93:0x0125, B:95:0x0136, B:97:0x0147, B:99:0x0158, B:101:0x0162, B:104:0x0169, B:105:0x016e, B:107:0x017b, B:109:0x018c, B:111:0x019a, B:113:0x01ac, B:115:0x01b4, B:117:0x01c6, B:119:0x01d8, B:121:0x01ea, B:123:0x01fc, B:125:0x020e, B:127:0x0220, B:129:0x0232, B:131:0x0244, B:133:0x0254, B:134:0x0275, B:135:0x025e, B:137:0x0266, B:139:0x0286, B:141:0x0298, B:143:0x02a6, B:145:0x02b4, B:147:0x02c2), top: B:50:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x063b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0665 A[LOOP:3: B:58:0x0661->B:60:0x0665, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0679  */
    /* JADX WARN: Type inference failed for: r19v0, types: [com.google.android.gms.internal.measurement.zzlr] */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.measurement.zzlr r19, com.google.android.gms.internal.measurement.zzjg r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zzlr, com.google.android.gms.internal.measurement.zzjg):void");
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zza(T t2, byte[] bArr, int i2, int i3, zzij zzijVar) throws IOException {
        zza((zzlg<T>) t2, bArr, i2, i3, 0, zzijVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t2, T t3, int i2) {
        if (zzc((zzlg<T>) t3, i2)) {
            long zzc = zzc(i2) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t3, zzc);
            if (object != null) {
                zzlu zze = zze(i2);
                if (!zzc((zzlg<T>) t2, i2)) {
                    if (!zzg(object)) {
                        unsafe.putObject(t2, zzc, object);
                    } else {
                        Object zza2 = zze.zza();
                        zze.zza(zza2, object);
                        unsafe.putObject(t2, zzc, zza2);
                    }
                    zzb((zzlg<T>) t2, i2);
                    return;
                }
                Object object2 = unsafe.getObject(t2, zzc);
                if (!zzg(object2)) {
                    Object zza3 = zze.zza();
                    zze.zza(zza3, object2);
                    unsafe.putObject(t2, zzc, zza3);
                    object2 = zza3;
                }
                zze.zza(object2, object);
                return;
            }
            throw new IllegalStateException("Source subfield " + this.zzc[i2] + " is present but null: " + String.valueOf(t3));
        }
    }

    private final void zza(Object obj, int i2, zzlr zzlrVar) throws IOException {
        if (zzg(i2)) {
            zzml.zza(obj, i2 & 1048575, zzlrVar.zzr());
        } else if (this.zzi) {
            zzml.zza(obj, i2 & 1048575, zzlrVar.zzq());
        } else {
            zzml.zza(obj, i2 & 1048575, zzlrVar.zzp());
        }
    }

    private final void zza(T t2, int i2, Object obj) {
        zzb.putObject(t2, zzc(i2) & 1048575, obj);
        zzb((zzlg<T>) t2, i2);
    }

    private final void zza(T t2, int i2, int i3, Object obj) {
        zzb.putObject(t2, zzc(i3) & 1048575, obj);
        zzb((zzlg<T>) t2, i2, i3);
    }

    private final <K, V> void zza(zznb zznbVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            zznbVar.zza(i2, this.zzr.zza(zzf(i3)), this.zzr.zzd(obj));
        }
    }

    private static void zza(int i2, Object obj, zznb zznbVar) throws IOException {
        if (obj instanceof String) {
            zznbVar.zza(i2, (String) obj);
        } else {
            zznbVar.zza(i2, (zzik) obj);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:320:0x05b5. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0b90  */
    @Override // com.google.android.gms.internal.measurement.zzlu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.measurement.zznb r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlg.zza(java.lang.Object, com.google.android.gms.internal.measurement.zznb):void");
    }

    private static <UT, UB> void zza(zzmk<UT, UB> zzmkVar, T t2, zznb zznbVar) throws IOException {
        zzmkVar.zzb((zzmk<UT, UB>) zzmkVar.zzd(t2), zznbVar);
    }

    private final boolean zza(T t2, int i2, int i3, int i4, int i5) {
        if (i3 == 1048575) {
            return zzc((zzlg<T>) t2, i2);
        }
        return (i4 & i5) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i2, zzlu zzluVar) {
        return zzluVar.zze(zzml.zze(obj, i2 & 1048575));
    }
}
