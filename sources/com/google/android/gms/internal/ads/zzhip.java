package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhip implements zzhbs {
    AD_RESOURCE_UNKNOWN(0),
    AD_RESOURCE_CREATIVE(1),
    AD_RESOURCE_POST_CLICK(2),
    AD_RESOURCE_AUTO_CLICK_DESTINATION(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhin
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhip.zzb(i9);
        }
    };
    private final int zzg;

    zzhip(int i9) {
        this.zzg = i9;
    }

    public static zzhip zzb(int i9) {
        if (i9 == 0) {
            return AD_RESOURCE_UNKNOWN;
        }
        if (i9 == 1) {
            return AD_RESOURCE_CREATIVE;
        }
        if (i9 == 2) {
            return AD_RESOURCE_POST_CLICK;
        }
        if (i9 != 3) {
            return null;
        }
        return AD_RESOURCE_AUTO_CLICK_DESTINATION;
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
