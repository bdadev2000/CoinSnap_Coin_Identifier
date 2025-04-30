package com.google.android.gms.internal.ads;

import Q7.n0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzaeo {
    private static final String[] zza = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!zzm(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = i12 - 1;
        int i17 = zzb[i13];
        if (i10 == 2) {
            i17 /= 2;
        } else if (i10 == 0) {
            i17 /= 4;
        }
        int i18 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            if (i10 == 3) {
                i15 = zzc[i16];
            } else {
                i15 = zzd[i16];
            }
            return (((i15 * 12) / i17) + i18) * 4;
        }
        if (i10 == 3) {
            if (i11 == 2) {
                i14 = zze[i16];
            } else {
                i14 = zzf[i16];
            }
        } else {
            i14 = zzg[i16];
        }
        int i19 = 144;
        if (i10 == 3) {
            return n0.v(i14, 144, i17, i18);
        }
        if (i11 == 1) {
            i19 = 72;
        }
        return n0.v(i19, i14, i17, i18);
    }

    public static int zzc(int i9) {
        int i10;
        int i11;
        if (!zzm(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = i9 >>> 12;
        int i13 = (i9 >>> 10) & 3;
        int i14 = i12 & 15;
        if (i14 == 0 || i14 == 15 || i13 == 3) {
            return -1;
        }
        return zzl(i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i9, int i10) {
        return i10 != 1 ? i10 != 2 ? 384 : 1152 : i9 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i9) {
        return (i9 & (-2097152)) == -2097152;
    }
}
