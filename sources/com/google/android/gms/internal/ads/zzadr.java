package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzadr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, PsExtractor.AUDIO_STREAM, 224, NotificationCompat.FLAG_LOCAL_ONLY, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        int i9;
        zzft zzg2 = zzg(bArr);
        zzg2.zzm(42);
        if (true != zzg2.zzo()) {
            i9 = 8;
        } else {
            i9 = 12;
        }
        return zzg2.zzd(i9) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzft zzg2 = zzg(bArr);
        zzg2.zzm(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzan zzc(byte[] bArr, @Nullable String str, @Nullable String str2, int i9, @Nullable zzae zzaeVar) {
        int i10;
        int i11;
        zzft zzg2 = zzg(bArr);
        zzg2.zzm(60);
        int i12 = zzb[zzg2.zzd(6)];
        int i13 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        if (zzd2 >= 29) {
            i10 = -1;
        } else {
            i10 = (zzd[zzd2] * 1000) / 2;
        }
        zzg2.zzm(10);
        if (zzg2.zzd(2) > 0) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        int i14 = i12 + i11;
        zzal zzalVar = new zzal();
        zzalVar.zzK(str);
        zzalVar.zzX(MimeTypes.AUDIO_DTS);
        zzalVar.zzx(i10);
        zzalVar.zzy(i14);
        zzalVar.zzY(i13);
        zzalVar.zzE(null);
        zzalVar.zzO(str2);
        zzalVar.zzV(i9);
        return zzalVar.zzad();
    }

    public static zzadq zzd(byte[] bArr) throws zzch {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        long j7;
        int i14;
        zzft zzg2 = zzg(bArr);
        zzg2.zzm(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzo = zzg2.zzo();
        if (true != zzo) {
            i9 = 16;
        } else {
            i9 = 20;
        }
        if (true != zzo) {
            i10 = 8;
        } else {
            i10 = 12;
        }
        zzg2.zzm(i10);
        int zzd3 = zzg2.zzd(i9) + 1;
        boolean zzo2 = zzg2.zzo();
        int i15 = 0;
        if (zzo2) {
            i11 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzo()) {
                zzg2.zzm(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 == 1 && zzd6 == 1) {
                int i16 = zzd2 + 1;
                int zzd7 = zzg2.zzd(i16);
                for (int i17 = 0; i17 < i16; i17++) {
                    if (((zzd7 >> i17) & 1) == 1) {
                        zzg2.zzm(8);
                    }
                }
                int i18 = zzd4 * 512;
                if (zzg2.zzo()) {
                    zzg2.zzm(2);
                    int zzd8 = (zzg2.zzd(2) + 1) << 2;
                    int zzd9 = zzg2.zzd(2) + 1;
                    while (i15 < zzd9) {
                        zzg2.zzm(zzd8);
                        i15++;
                    }
                }
                i15 = i18;
            } else {
                throw zzch.zzc("Multiple audio presentations or assets not supported");
            }
        } else {
            i11 = -1;
        }
        zzg2.zzm(i9);
        zzg2.zzm(12);
        if (zzo2) {
            if (zzg2.zzo()) {
                zzg2.zzm(4);
            }
            if (zzg2.zzo()) {
                zzg2.zzm(24);
            }
            if (zzg2.zzo()) {
                zzg2.zzn(zzg2.zzd(10) + 1);
            }
            zzg2.zzm(5);
            int i19 = zze[zzg2.zzd(4)];
            i13 = zzg2.zzd(8) + 1;
            i12 = i19;
        } else {
            i12 = -2147483647;
            i13 = -1;
        }
        if (zzo2) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        i14 = 48000;
                    } else {
                        throw zzch.zza("Unsupported reference clock code in DTS HD header: " + i11, null);
                    }
                } else {
                    i14 = 44100;
                }
            } else {
                i14 = 32000;
            }
            j7 = zzgd.zzt(i15, 1000000L, i14, RoundingMode.FLOOR);
        } else {
            j7 = C.TIME_UNSET;
        }
        return new zzadq(MimeTypes.AUDIO_DTS_EXPRESS, i13, i12, zzd3, j7, 0, null);
    }

    public static zzadq zze(byte[] bArr, AtomicInteger atomicInteger) throws zzch {
        char c9;
        long j7;
        int i9;
        int i10;
        int i11;
        int i12;
        zzft zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true);
        int i13 = zzf2 + 1;
        if (zzd2 == 1078008818) {
            c9 = 1;
        } else {
            c9 = 0;
        }
        if (c9 != 0) {
            if (zzg2.zzo()) {
                int i14 = zzf2 - 1;
                if (((bArr[zzf2] & 255) | ((char) (bArr[i14] << 8))) == zzgd.zzd(bArr, 0, i14, 65535)) {
                    int zzd3 = zzg2.zzd(2);
                    if (zzd3 != 0) {
                        if (zzd3 != 1) {
                            if (zzd3 == 2) {
                                i11 = 384;
                            } else {
                                throw zzch.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                            }
                        } else {
                            i11 = 480;
                        }
                    } else {
                        i11 = 512;
                    }
                    int zzd4 = zzg2.zzd(3) + 1;
                    int zzd5 = zzg2.zzd(2);
                    if (zzd5 != 0) {
                        if (zzd5 != 1) {
                            if (zzd5 == 2) {
                                i12 = 48000;
                            } else {
                                throw zzch.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                            }
                        } else {
                            i12 = 44100;
                        }
                    } else {
                        i12 = 32000;
                    }
                    if (zzg2.zzo()) {
                        zzg2.zzm(36);
                    }
                    i9 = (1 << zzg2.zzd(2)) * i12;
                    j7 = zzgd.zzt(i11 * zzd4, 1000000L, i12, RoundingMode.FLOOR);
                } else {
                    throw zzch.zza("CRC check failed", null);
                }
            } else {
                throw zzch.zzc("Only supports full channel mask-based audio presentation");
            }
        } else {
            j7 = C.TIME_UNSET;
            i9 = -2147483647;
        }
        int i15 = i9;
        long j9 = j7;
        int i16 = 0;
        for (char c10 = 0; c10 < c9; c10 = 1) {
            i16 += zzf(zzg2, zzg, true);
        }
        for (int i17 = 0; i17 <= 0; i17++) {
            if (c9 != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            if (atomicInteger.get() != 0) {
                i10 = zzf(zzg2, zzi, true);
            } else {
                i10 = 0;
            }
            i16 += i10;
        }
        return new zzadq("audio/vnd.dts.uhd;profile=p2", 2, i15, i13 + i16, j9, 0, null);
    }

    private static int zzf(zzft zzftVar, int[] iArr, boolean z8) {
        int i9 = 0;
        for (int i10 = 0; i10 < 3 && zzftVar.zzo(); i10++) {
            i9++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            i11 += 1 << iArr[i12];
        }
        return zzftVar.zzd(iArr[i9]) + i11;
    }

    private static zzft zzg(byte[] bArr) {
        byte b = bArr[0];
        if (b != Byte.MAX_VALUE && b != 100 && b != 64 && b != 113) {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b8 = copyOf[0];
            if (b8 == -2 || b8 == -1 || b8 == 37 || b8 == -14 || b8 == -24) {
                for (int i9 = 0; i9 < copyOf.length - 1; i9 += 2) {
                    byte b9 = copyOf[i9];
                    int i10 = i9 + 1;
                    copyOf[i9] = copyOf[i10];
                    copyOf[i10] = b9;
                }
            }
            int length = copyOf.length;
            zzft zzftVar = new zzft(copyOf, length);
            if (copyOf[0] == 31) {
                zzft zzftVar2 = new zzft(copyOf, length);
                while (zzftVar2.zza() >= 16) {
                    zzftVar2.zzm(2);
                    zzftVar.zzf(zzftVar2.zzd(14), 14);
                }
            }
            zzftVar.zzj(copyOf, copyOf.length);
            return zzftVar;
        }
        return new zzft(bArr, bArr.length);
    }
}
