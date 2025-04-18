package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.material.internal.ViewUtils;
import com.google.common.primitives.UnsignedBytes;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.http2.Settings;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzada {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, Opcodes.CHECKCAST, 224, 256, 384, 448, 512, 640, ViewUtils.EDGE_TO_EDGE_FLAGS, 896, 1024, 1152, 1280, 1536, 1920, Opcodes.ACC_STRICT, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzej zzg2 = zzg(bArr);
        zzg2.zzn(42);
        return zzg2.zzd(true != zzg2.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzej zzg2 = zzg(bArr);
        zzg2.zzn(32);
        return zzf(zzg2, zzj, true) + 1;
    }

    public static zzaf zzc(byte[] bArr, @Nullable String str, @Nullable String str2, int i2, @Nullable zzy zzyVar) {
        zzej zzg2 = zzg(bArr);
        zzg2.zzn(60);
        int i3 = zzb[zzg2.zzd(6)];
        int i4 = zzc[zzg2.zzd(4)];
        int zzd2 = zzg2.zzd(5);
        int i5 = zzd2 >= 29 ? -1 : (zzd[zzd2] * 1000) / 2;
        zzg2.zzn(10);
        int i6 = i3 + (zzg2.zzd(2) > 0 ? 1 : 0);
        zzad zzadVar = new zzad();
        zzadVar.zzL(str);
        zzadVar.zzZ("audio/vnd.dts");
        zzadVar.zzy(i5);
        zzadVar.zzz(i6);
        zzadVar.zzaa(i4);
        zzadVar.zzF(null);
        zzadVar.zzP(str2);
        zzadVar.zzX(i2);
        return zzadVar.zzaf();
    }

    public static zzacz zzd(byte[] bArr) throws zzbo {
        int i2;
        int i3;
        int i4;
        long j2;
        int i5;
        zzej zzg2 = zzg(bArr);
        zzg2.zzn(40);
        int zzd2 = zzg2.zzd(2);
        boolean zzp = zzg2.zzp();
        int i6 = true != zzp ? 16 : 20;
        zzg2.zzn(true != zzp ? 8 : 12);
        int zzd3 = zzg2.zzd(i6) + 1;
        boolean zzp2 = zzg2.zzp();
        int i7 = 0;
        if (zzp2) {
            i2 = zzg2.zzd(2);
            int zzd4 = zzg2.zzd(3) + 1;
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            int zzd5 = zzg2.zzd(3) + 1;
            int zzd6 = zzg2.zzd(3) + 1;
            if (zzd5 != 1 || zzd6 != 1) {
                throw zzbo.zzc("Multiple audio presentations or assets not supported");
            }
            int i8 = zzd2 + 1;
            int zzd7 = zzg2.zzd(i8);
            for (int i9 = 0; i9 < i8; i9++) {
                if (((zzd7 >> i9) & 1) == 1) {
                    zzg2.zzn(8);
                }
            }
            int i10 = zzd4 * 512;
            if (zzg2.zzp()) {
                zzg2.zzn(2);
                int zzd8 = (zzg2.zzd(2) + 1) << 2;
                int zzd9 = zzg2.zzd(2) + 1;
                while (i7 < zzd9) {
                    zzg2.zzn(zzd8);
                    i7++;
                }
            }
            i7 = i10;
        } else {
            i2 = -1;
        }
        zzg2.zzn(i6);
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
            int i11 = zze[zzg2.zzd(4)];
            i4 = zzg2.zzd(8) + 1;
            i3 = i11;
        } else {
            i3 = -2147483647;
            i4 = -1;
        }
        if (zzp2) {
            if (i2 == 0) {
                i5 = 32000;
            } else if (i2 == 1) {
                i5 = 44100;
            } else {
                if (i2 != 2) {
                    throw zzbo.zza("Unsupported reference clock code in DTS HD header: " + i2, null);
                }
                i5 = 48000;
            }
            j2 = zzeu.zzt(i7, 1000000L, i5, RoundingMode.FLOOR);
        } else {
            j2 = -9223372036854775807L;
        }
        return new zzacz("audio/vnd.dts.hd;profile=lbr", i4, i3, zzd3, j2, 0, null);
    }

    public static zzacz zze(byte[] bArr, AtomicInteger atomicInteger) throws zzbo {
        long j2;
        int i2;
        int i3;
        int i4;
        zzej zzg2 = zzg(bArr);
        int zzd2 = zzg2.zzd(32);
        int zzf2 = zzf(zzg2, zzf, true);
        int i5 = zzf2 + 1;
        char c2 = zzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c2 == 0) {
            j2 = -9223372036854775807L;
            i2 = -2147483647;
        } else {
            if (!zzg2.zzp()) {
                throw zzbo.zzc("Only supports full channel mask-based audio presentation");
            }
            int i6 = zzf2 - 1;
            if (((bArr[zzf2] & UnsignedBytes.MAX_VALUE) | ((char) (bArr[i6] << 8))) != zzeu.zzd(bArr, 0, i6, Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
                throw zzbo.zza("CRC check failed", null);
            }
            int zzd3 = zzg2.zzd(2);
            if (zzd3 == 0) {
                i3 = 512;
            } else if (zzd3 == 1) {
                i3 = 480;
            } else {
                if (zzd3 != 2) {
                    throw zzbo.zza("Unsupported base duration index in DTS UHD header: " + zzd3, null);
                }
                i3 = 384;
            }
            int zzd4 = zzg2.zzd(3) + 1;
            int zzd5 = zzg2.zzd(2);
            if (zzd5 == 0) {
                i4 = 32000;
            } else if (zzd5 == 1) {
                i4 = 44100;
            } else {
                if (zzd5 != 2) {
                    throw zzbo.zza("Unsupported clock rate index in DTS UHD header: " + zzd5, null);
                }
                i4 = 48000;
            }
            if (zzg2.zzp()) {
                zzg2.zzn(36);
            }
            i2 = (1 << zzg2.zzd(2)) * i4;
            j2 = zzeu.zzt(i3 * zzd4, 1000000L, i4, RoundingMode.FLOOR);
        }
        int i7 = i2;
        long j3 = j2;
        int i8 = 0;
        for (char c3 = 0; c3 < c2; c3 = 1) {
            i8 += zzf(zzg2, zzg, true);
        }
        for (int i9 = 0; i9 <= 0; i9++) {
            if (c2 != 0) {
                atomicInteger.set(zzf(zzg2, zzh, true));
            }
            i8 += atomicInteger.get() != 0 ? zzf(zzg2, zzi, true) : 0;
        }
        return new zzacz("audio/vnd.dts.uhd;profile=p2", 2, i7, i5 + i8, j3, 0, null);
    }

    private static int zzf(zzej zzejVar, int[] iArr, boolean z2) {
        int i2 = 0;
        for (int i3 = 0; i3 < 3 && zzejVar.zzp(); i3++) {
            i2++;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 += 1 << iArr[i5];
        }
        return zzejVar.zzd(iArr[i2]) + i4;
    }

    private static zzej zzg(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == Byte.MAX_VALUE || b2 == 100 || b2 == 64 || b2 == 113) {
            return new zzej(bArr, bArr.length);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b3 = copyOf[0];
        if (b3 == -2 || b3 == -1 || b3 == 37 || b3 == -14 || b3 == -24) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b4 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b4;
            }
        }
        int length = copyOf.length;
        zzej zzejVar = new zzej(copyOf, length);
        if (copyOf[0] == 31) {
            zzej zzejVar2 = new zzej(copyOf, length);
            while (zzejVar2.zza() >= 16) {
                zzejVar2.zzn(2);
                zzejVar.zzg(zzejVar2.zzd(14), 14);
            }
        }
        zzejVar.zzk(copyOf, copyOf.length);
        return zzejVar;
    }
}
