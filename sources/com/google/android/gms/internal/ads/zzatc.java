package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzatc implements zzhbs {
    UNKNOWN(0),
    ENABLED(1),
    DISABLED(2);

    private static final zzhbt zzd = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzata
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzatc.zzb(i9);
        }
    };
    private final int zzf;

    zzatc(int i9) {
        this.zzf = i9;
    }

    public static zzatc zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN;
        }
        if (i9 == 1) {
            return ENABLED;
        }
        if (i9 != 2) {
            return null;
        }
        return DISABLED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zzf;
    }
}
