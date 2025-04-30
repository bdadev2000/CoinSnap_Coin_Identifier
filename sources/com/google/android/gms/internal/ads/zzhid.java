package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhid implements zzhbs {
    UNSPECIFIED(0),
    PHISHY_CLICK_EVENT(1),
    PHISHY_KEY_EVENT(2),
    PHISHY_PASTE_EVENT(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhib
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhid.zzb(i9);
        }
    };
    private final int zzg;

    zzhid(int i9) {
        this.zzg = i9;
    }

    public static zzhid zzb(int i9) {
        if (i9 == 0) {
            return UNSPECIFIED;
        }
        if (i9 == 1) {
            return PHISHY_CLICK_EVENT;
        }
        if (i9 == 2) {
            return PHISHY_KEY_EVENT;
        }
        if (i9 != 3) {
            return null;
        }
        return PHISHY_PASTE_EVENT;
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
