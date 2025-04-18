package com.google.android.gms.internal.ads;

import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public final class zzadu {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (!zzm(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = i5 - 1;
        int i8 = zzb[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? zzc[i7] : zzd[i7]) * 12) / i8) + i9) * 4;
        }
        int i10 = i3 == 3 ? i4 == 2 ? zze[i7] : zzf[i7] : zzg[i7];
        int i11 = Opcodes.D2F;
        if (i3 == 3) {
            return androidx.compose.foundation.text.input.a.z(i10, Opcodes.D2F, i8, i9);
        }
        if (i4 == 1) {
            i11 = 72;
        }
        return androidx.compose.foundation.text.input.a.z(i11, i10, i8, i9);
    }

    public static int zzc(int i2) {
        int i3;
        int i4;
        if (!zzm(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = i2 >>> 12;
        int i6 = (i2 >>> 10) & 3;
        int i7 = i5 & 15;
        if (i7 == 0 || i7 == 15 || i6 == 3) {
            return -1;
        }
        return zzl(i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i2, int i3) {
        return i3 != 1 ? i3 != 2 ? 384 : 1152 : i2 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }
}
