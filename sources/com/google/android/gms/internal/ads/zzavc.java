package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzavc implements zzhbs {
    ENUM_FALSE(0),
    ENUM_TRUE(1),
    ENUM_FAILURE(2),
    ENUM_UNKNOWN(1000);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzava
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzavc.zzb(i9);
        }
    };
    private final int zzg;

    zzavc(int i9) {
        this.zzg = i9;
    }

    public static zzavc zzb(int i9) {
        if (i9 == 0) {
            return ENUM_FALSE;
        }
        if (i9 == 1) {
            return ENUM_TRUE;
        }
        if (i9 == 2) {
            return ENUM_FAILURE;
        }
        if (i9 != 1000) {
            return null;
        }
        return ENUM_UNKNOWN;
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
