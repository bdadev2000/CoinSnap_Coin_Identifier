package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhgi implements zzhbs {
    UNKNOWN_USER_POPULATION(0),
    SAFE_BROWSING(1),
    EXTENDED_REPORTING(2),
    ENHANCED_PROTECTION(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhgg
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhgi.zzb(i9);
        }
    };
    private final int zzg;

    zzhgi(int i9) {
        this.zzg = i9;
    }

    public static zzhgi zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_USER_POPULATION;
        }
        if (i9 == 1) {
            return SAFE_BROWSING;
        }
        if (i9 == 2) {
            return EXTENDED_REPORTING;
        }
        if (i9 != 3) {
            return null;
        }
        return ENHANCED_PROTECTION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzg;
    }
}
