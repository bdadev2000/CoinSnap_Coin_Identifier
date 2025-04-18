package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzre implements zzqn {
    public zzre(zzrd zzrdVar) {
    }

    public static int zza(int i2, int i3, int i4) {
        return zzgdu.zzb(((i2 * i3) * i4) / 1000000);
    }

    public static int zzb(int i2) {
        if (i2 == 20) {
            return 63750;
        }
        if (i2 == 30) {
            return 2250000;
        }
        switch (i2) {
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
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i2) {
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
