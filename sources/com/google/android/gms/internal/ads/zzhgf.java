package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhgf implements zzhbs {
    UNSPECIFIED(0),
    TAILORED_WARNING_CT_BASE(1),
    TAILORED_WARNING_CT(2),
    TAILORED_WARNING_CT_ACCOUNT_INFO(3),
    TAILORED_WARNING_SUSPICIOUS_BASE(4),
    TAILORED_WARNING_SUSPICIOUS(5);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhgd
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhgf.zzb(i9);
        }
    };
    private final int zzi;

    zzhgf(int i9) {
        this.zzi = i9;
    }

    public static zzhgf zzb(int i9) {
        if (i9 == 0) {
            return UNSPECIFIED;
        }
        if (i9 == 1) {
            return TAILORED_WARNING_CT_BASE;
        }
        if (i9 == 2) {
            return TAILORED_WARNING_CT;
        }
        if (i9 == 3) {
            return TAILORED_WARNING_CT_ACCOUNT_INFO;
        }
        if (i9 == 4) {
            return TAILORED_WARNING_SUSPICIOUS_BASE;
        }
        if (i9 != 5) {
            return null;
        }
        return TAILORED_WARNING_SUSPICIOUS;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzi;
    }
}
