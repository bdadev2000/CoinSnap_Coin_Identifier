package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzauz implements zzhbs {
    UNKNOWN_ENCRYPTION_METHOD(0),
    BITSLICER(1),
    TINK_HYBRID(2),
    UNENCRYPTED(3),
    DG(4),
    DG_XTEA(5);

    private static final zzhbt zzg = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzaux
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzauz.zzb(i9);
        }
    };
    private final int zzi;

    zzauz(int i9) {
        this.zzi = i9;
    }

    public static zzauz zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_ENCRYPTION_METHOD;
        }
        if (i9 == 1) {
            return BITSLICER;
        }
        if (i9 == 2) {
            return TINK_HYBRID;
        }
        if (i9 == 3) {
            return UNENCRYPTED;
        }
        if (i9 == 4) {
            return DG;
        }
        if (i9 != 5) {
            return null;
        }
        return DG_XTEA;
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
