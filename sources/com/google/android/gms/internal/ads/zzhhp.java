package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhhp implements zzhbs {
    SAFE_OR_OTHER(0),
    MALWARE(1),
    PHISHING(2),
    UNWANTED(3),
    BILLING(4);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhhn
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhhp.zzb(i9);
        }
    };
    private final int zzh;

    zzhhp(int i9) {
        this.zzh = i9;
    }

    public static zzhhp zzb(int i9) {
        if (i9 == 0) {
            return SAFE_OR_OTHER;
        }
        if (i9 == 1) {
            return MALWARE;
        }
        if (i9 == 2) {
            return PHISHING;
        }
        if (i9 == 3) {
            return UNWANTED;
        }
        if (i9 != 4) {
            return null;
        }
        return BILLING;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzh;
    }
}
