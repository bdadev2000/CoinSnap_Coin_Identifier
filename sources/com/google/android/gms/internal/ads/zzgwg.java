package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgwg implements zzhbs {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzgwf
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzgwg.zzb(i9);
        }
    };
    private final int zzi;

    zzgwg(int i9) {
        this.zzi = i9;
    }

    public static zzgwg zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i9 == 1) {
            return SYMMETRIC;
        }
        if (i9 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i9 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i9 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
