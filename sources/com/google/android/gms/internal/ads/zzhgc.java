package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhgc implements zzhbs {
    UNKNOWN(0),
    UNAVAILABLE(1),
    NOT_MANAGED(2),
    ENTERPRISE_MANAGED(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhga
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhgc.zzb(i9);
        }
    };
    private final int zzg;

    zzhgc(int i9) {
        this.zzg = i9;
    }

    public static zzhgc zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN;
        }
        if (i9 == 1) {
            return UNAVAILABLE;
        }
        if (i9 == 2) {
            return NOT_MANAGED;
        }
        if (i9 != 3) {
            return null;
        }
        return ENTERPRISE_MANAGED;
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
