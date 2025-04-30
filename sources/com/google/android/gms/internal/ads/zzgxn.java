package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgxn implements zzhbs {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzgxm
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzgxn.zzb(i9);
        }
    };
    private final int zzi;

    zzgxn(int i9) {
        this.zzi = i9;
    }

    public static zzgxn zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i9 == 1) {
            return TINK;
        }
        if (i9 == 2) {
            return LEGACY;
        }
        if (i9 == 3) {
            return RAW;
        }
        if (i9 != 4) {
            return null;
        }
        return CRUNCHY;
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
