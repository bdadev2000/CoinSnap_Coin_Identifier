package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzatx implements zzhbs {
    DEVICE_IDENTIFIER_NO_ID(0),
    DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
    DEVICE_IDENTIFIER_GLOBAL_ID(2),
    DEVICE_IDENTIFIER_ADVERTISER_ID(3),
    DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
    DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
    DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6),
    DEVICE_IDENTIFIER_PER_APP_ID(7),
    DEVICE_IDENTIFIER_PER_APP_ID_V2(8),
    DEVICE_IDENTIFIER_CONNECTED_TV_IFA(9);

    private static final zzhbt zzk = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzatv
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzatx.zzb(i9);
        }
    };
    private final int zzm;

    zzatx(int i9) {
        this.zzm = i9;
    }

    public static zzatx zzb(int i9) {
        switch (i9) {
            case 0:
                return DEVICE_IDENTIFIER_NO_ID;
            case 1:
                return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
            case 2:
                return DEVICE_IDENTIFIER_GLOBAL_ID;
            case 3:
                return DEVICE_IDENTIFIER_ADVERTISER_ID;
            case 4:
                return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
            case 5:
                return DEVICE_IDENTIFIER_ANDROID_AD_ID;
            case 6:
                return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
            case 7:
                return DEVICE_IDENTIFIER_PER_APP_ID;
            case 8:
                return DEVICE_IDENTIFIER_PER_APP_ID_V2;
            case 9:
                return DEVICE_IDENTIFIER_CONNECTED_TV_IFA;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzm;
    }
}
