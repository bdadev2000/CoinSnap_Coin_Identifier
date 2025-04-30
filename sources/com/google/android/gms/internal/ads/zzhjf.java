package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhjf implements zzhbs {
    UNKNOWN(0),
    PHISHING_INTERSTITIAL(1),
    CLIENT_SIDE_PHISHING_INTERSTITIAL(2),
    MALWARE_INTERSTITIAL(3),
    UWS_INTERSTITIAL(4),
    BILLING_INTERSTITIAL(5),
    BINARY_MALWARE_DOWNLOAD_WARNING(6);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhjd
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhjf.zzb(i9);
        }
    };
    private final int zzj;

    zzhjf(int i9) {
        this.zzj = i9;
    }

    public static zzhjf zzb(int i9) {
        switch (i9) {
            case 0:
                return UNKNOWN;
            case 1:
                return PHISHING_INTERSTITIAL;
            case 2:
                return CLIENT_SIDE_PHISHING_INTERSTITIAL;
            case 3:
                return MALWARE_INTERSTITIAL;
            case 4:
                return UWS_INTERSTITIAL;
            case 5:
                return BILLING_INTERSTITIAL;
            case 6:
                return BINARY_MALWARE_DOWNLOAD_WARNING;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzj;
    }
}
