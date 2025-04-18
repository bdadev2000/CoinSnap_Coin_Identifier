package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;

/* loaded from: classes3.dex */
public final class zzqy implements zzqj {
    public zzqy(zzqx zzqxVar) {
    }

    public static int zza(int i10, int i11, int i12) {
        return zzgcr.zzb(((i10 * i11) * i12) / 1000000);
    }

    public static int zzb(int i10) {
        if (i10 == 20) {
            return 63750;
        }
        if (i10 == 30) {
            return 2250000;
        }
        switch (i10) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return DefaultOggSeeker.MATCH_BYTE_RANGE;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i10) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }
}
