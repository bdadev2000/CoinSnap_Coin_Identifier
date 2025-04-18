package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes3.dex */
public final class zzacq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        int i10;
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(42);
        if (true != zzg2.zzp()) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        return zzg2.zzd(i10) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzad zzc(byte[] bArr, @Nullable String str, @Nullable String str2, int i10, @Nullable zzw zzwVar) {
        int i11;
        int i12;
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(60);
        int i13 = zzb[zzg2.zzd(6)];
        int i14 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        if (zzd2 >= 29) {
            i11 = -1;
        } else {
            i11 = (zzd[zzd2] * 1000) / 2;
        }
        zzg2.zzn(10);
        if (zzg2.zzd(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        int i15 = i13 + i12;
        zzab zzabVar = new zzab();
        zzabVar.zzL(str);
        zzabVar.zzZ(MimeTypes.AUDIO_DTS);
        zzabVar.zzy(i11);
        zzabVar.zzz(i15);
        zzabVar.zzaa(i14);
        zzabVar.zzF(null);
        zzabVar.zzP(str2);
        zzabVar.zzX(i10);
        return zzabVar.zzaf();
    }

    public static zzaco zzd(byte[] bArr) throws zzbh {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j3;
        int i15;
        zzec zzg2 = zzg(bArr);
        zzg2.zzn(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzp = zzg2.zzp();
        if (true != zzp) {
            i10 = 16;
        } else {
            i10 = 20;
        }
        if (true != zzp) {
            i11 = 8;
        } else {
            i11 = 12;
        }
        zzg2.zzn(i11);
        int zzd3 = zzg2.zzd(i10) + 1;
        boolean zzp2 = zzg2.zzp();
        int i16 = 0;
        if (zzp2) {
            i12 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 == 1 && zzd6 == 1) {
                int i17 = zzd2 + 1;
                int zzd7 = zzg2.zzd(i17);
                for (int i18 = 0; i18 < i17; i18++) {
                    if (((zzd7 >> i18) & 1) == 1) {
                        zzg2.zzn(8);
                    }
                }
                int i19 = zzd4 * 512;
                if (zzg2.zzp()) {
                    zzg2.zzn(2);
                    int zzd8 = (zzg2.zzd(2) + 1) << 2;
                    int zzd9 = zzg2.zzd(2) + 1;
                    while (i16 < zzd9) {
                        zzg2.zzn(zzd8);
                        i16++;
                    }
                }
                i16 = i19;
            } else {
                throw zzbh.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            i12 = -1;
        }
        zzg2.zzn(i10);
        zzg2.zzn(12);
        if (zzp2) {
            if (zzg2.zzp()) {
                zzg2.zzn(4);
            }
            if (zzg2.zzp()) {
                zzg2.zzn(24);
            }
            if (zzg2.zzp()) {
                zzg2.zzo(zzg2.zzd(10) + 1);
            }
            zzg2.zzn(5);
            int i20 = zze[zzg2.zzd(4)];
            i14 = zzg2.zzd(8) + 1;
            i13 = i20;
        } else {
            i13 = -2147483647;
            i14 = -1;
        }
        if (zzp2) {
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        i15 = 48000;
                    } else {
                        throw zzbh.zza("Unsupported reference clock code in DTS HD header: " + i12, null);
                    }
                } else {
                    i15 = 44100;
                }
            } else {
                i15 = 32000;
            }
            j3 = zzen.zzu(i16, 1000000L, i15, RoundingMode.FLOOR);
        } else {
            j3 = C.TIME_UNSET;
        }
        return new zzaco(MimeTypes.AUDIO_DTS_EXPRESS, i14, i13, zzd3, j3, 0, null);
    }

    public static zzaco zze(byte[] bArr, AtomicInteger atomicInteger) throws zzbh {
        char c10;
        long j3;
        int i10;
        int i11;
        int i12;
        int i13;
        zzec zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true) + 1;
        if (zzd2 == 1078008818) {
            c10 = 1;
        } else {
            c10 = 0;
        }
        if (c10 != 0) {
            if (zzg2.zzp()) {
                int i14 = zzf2 - 2;
                int i15 = bArr[i14] << 8;
                if ((((char) i15) | (bArr[zzf2 - 1] & UByte.MAX_VALUE)) == zzen.zze(bArr, 0, i14, 65535)) {
                    int zzd3 = zzg2.zzd(2);
                    if (zzd3 != 0) {
                        if (zzd3 != 1) {
                            if (zzd3 == 2) {
                                i12 = 384;
                            } else {
                                throw zzbh.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                            }
                        } else {
                            i12 = 480;
                        }
                    } else {
                        i12 = 512;
                    }
                    int zzd4 = zzg2.zzd(3) + 1;
                    int zzd5 = zzg2.zzd(2);
                    if (zzd5 != 0) {
                        if (zzd5 != 1) {
                            if (zzd5 == 2) {
                                i13 = 48000;
                            } else {
                                throw zzbh.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                            }
                        } else {
                            i13 = 44100;
                        }
                    } else {
                        i13 = 32000;
                    }
                    if (zzg2.zzp()) {
                        zzg2.zzn(36);
                    }
                    i10 = (1 << zzg2.zzd(2)) * i13;
                    j3 = zzen.zzu(i12 * zzd4, 1000000L, i13, RoundingMode.FLOOR);
                } else {
                    throw zzbh.zza("CRC check failed", null);
                }
            } else {
                throw zzbh.zzc("Only supports full channel mask-based audio presentation");
            }
        } else {
            j3 = C.TIME_UNSET;
            i10 = -2147483647;
        }
        int i16 = i10;
        long j10 = j3;
        int i17 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            i17 += zzf(zzg2, zzg, true);
        }
        for (int i18 = 0; i18 <= 0; i18++) {
            if (c10 != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            if (atomicInteger.get() != 0) {
                i11 = zzf(zzg2, zzi, true);
            } else {
                i11 = 0;
            }
            i17 += i11;
        }
        return new zzaco("audio/vnd.dts.uhd;profile=p2", 2, i16, zzf2 + i17, j10, 0, null);
    }

    private static int zzf(zzec zzecVar, int[] iArr, boolean z10) {
        int i10 = 0;
        for (int i11 = 0; i11 < 3 && zzecVar.zzp(); i11++) {
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 += 1 << iArr[i13];
        }
        return zzecVar.zzd(iArr[i10]) + i12;
    }

    private static zzec zzg(byte[] bArr) {
        byte b3 = bArr[0];
        if (b3 != Byte.MAX_VALUE && b3 != 100 && b3 != 64 && b3 != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b10 = copyOf[0];
            if (b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24) {
                for (int i10 = 0; i10 < copyOf.length - 1; i10 += 2) {
                    byte b11 = copyOf[i10];
                    int i11 = i10 + 1;
                    copyOf[i10] = copyOf[i11];
                    copyOf[i11] = b11;
                }
            }
            int length = copyOf.length;
            zzec zzecVar = new zzec(copyOf, length);
            if (copyOf[0] == 31) {
                zzec zzecVar2 = new zzec(copyOf, length);
                while (zzecVar2.zza() >= 16) {
                    zzecVar2.zzn(2);
                    zzecVar.zzg(zzecVar2.zzd(14), 14);
                }
            }
            zzecVar.zzk(copyOf, copyOf.length);
            return zzecVar;
        }
        return new zzec(bArr, bArr.length);
    }
}
