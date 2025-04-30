package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfmw implements zzhbs {
    FORMAT_UNKNOWN(0),
    FORMAT_BANNER(1),
    FORMAT_INTERSTITIAL(2),
    FORMAT_REWARDED(3),
    FORMAT_REWARDED_INTERSTITIAL(4),
    FORMAT_APP_OPEN(5),
    FORMAT_NATIVE(6),
    UNRECOGNIZED(-1);

    private static final zzhbt zzi = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfmv
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzfmw zzfmwVar = zzfmw.FORMAT_UNKNOWN;
            switch (i9) {
                case 0:
                    return zzfmw.FORMAT_UNKNOWN;
                case 1:
                    return zzfmw.FORMAT_BANNER;
                case 2:
                    return zzfmw.FORMAT_INTERSTITIAL;
                case 3:
                    return zzfmw.FORMAT_REWARDED;
                case 4:
                    return zzfmw.FORMAT_REWARDED_INTERSTITIAL;
                case 5:
                    return zzfmw.FORMAT_APP_OPEN;
                case 6:
                    return zzfmw.FORMAT_NATIVE;
                default:
                    return null;
            }
        }
    };
    private final int zzk;

    zzfmw(int i9) {
        this.zzk = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzk;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
