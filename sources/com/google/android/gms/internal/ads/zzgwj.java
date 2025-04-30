package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzgwj implements zzhbs {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzgwi
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzgwj.zzb(i9);
        }
    };
    private final int zzh;

    zzgwj(int i9) {
        this.zzh = i9;
    }

    public static zzgwj zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i9 == 1) {
            return ENABLED;
        }
        if (i9 == 2) {
            return DISABLED;
        }
        if (i9 != 3) {
            return null;
        }
        return DESTROYED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
