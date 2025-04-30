package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhju implements zzhbs {
    EVENT_URL(1),
    LANDING_PAGE(2),
    LANDING_REFERRER(3),
    CLIENT_REDIRECT(4),
    SERVER_REDIRECT(5),
    RECENT_NAVIGATION(6),
    REFERRER(7);

    private static final zzhbt zzh = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhjs
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhju.zzb(i9);
        }
    };
    private final int zzj;

    zzhju(int i9) {
        this.zzj = i9;
    }

    public static zzhju zzb(int i9) {
        switch (i9) {
            case 1:
                return EVENT_URL;
            case 2:
                return LANDING_PAGE;
            case 3:
                return LANDING_REFERRER;
            case 4:
                return CLIENT_REDIRECT;
            case 5:
                return SERVER_REDIRECT;
            case 6:
                return RECENT_NAVIGATION;
            case 7:
                return REFERRER;
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
