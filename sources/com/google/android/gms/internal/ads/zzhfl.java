package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes2.dex */
public enum zzhfl implements zzhbs {
    USER_POPULATION_UNSPECIFIED(0),
    CARTER_SB_CHROME_INTERSTITIAL(1),
    GMAIL_PHISHY_JOURNEY(2),
    DOWNLOAD_RELATED_POPULATION_MIN(1000),
    RISKY_DOWNLOADER(1001),
    INFREQUENT_DOWNLOADER(1002),
    REGULAR_DOWNLOADER(1003),
    BOTLIKE_DOWNLOADER(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION),
    DOCUMENT_DOWNLOADER(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT),
    HIGHLY_TECHNICAL_DOWNLOADER(1006),
    LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(1007),
    HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE(1008),
    SPAM_PING_SENDER(1009),
    RFA_TRUSTED(1010),
    DOWNLOAD_RELATED_POPULATION_MAX(1999);

    private static final zzhbt zzp = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhfj
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhfl.zzc(i9);
        }
    };
    private final int zzr;

    zzhfl(int i9) {
        this.zzr = i9;
    }

    public static zzhbu zzb() {
        return zzhfk.zza;
    }

    public static zzhfl zzc(int i9) {
        if (i9 == 0) {
            return USER_POPULATION_UNSPECIFIED;
        }
        if (i9 == 1) {
            return CARTER_SB_CHROME_INTERSTITIAL;
        }
        if (i9 == 2) {
            return GMAIL_PHISHY_JOURNEY;
        }
        if (i9 == 1999) {
            return DOWNLOAD_RELATED_POPULATION_MAX;
        }
        switch (i9) {
            case 1000:
                return DOWNLOAD_RELATED_POPULATION_MIN;
            case 1001:
                return RISKY_DOWNLOADER;
            case 1002:
                return INFREQUENT_DOWNLOADER;
            case 1003:
                return REGULAR_DOWNLOADER;
            case GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION /* 1004 */:
                return BOTLIKE_DOWNLOADER;
            case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                return DOCUMENT_DOWNLOADER;
            case 1006:
                return HIGHLY_TECHNICAL_DOWNLOADER;
            case 1007:
                return LOW_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case 1008:
                return HIGH_DOWNLOAD_WARNING_CLICK_THROUGH_RATE;
            case 1009:
                return SPAM_PING_SENDER;
            case 1010:
                return RFA_TRUSTED;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzr);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzr;
    }
}
