package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfna implements zzhbs {
    OS_UNKNOWN(0),
    OS_ANDROID(1),
    OS_IOS(2),
    UNRECOGNIZED(-1);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfmz
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzfna zzfnaVar = zzfna.OS_UNKNOWN;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        return null;
                    }
                    return zzfna.OS_IOS;
                }
                return zzfna.OS_ANDROID;
            }
            return zzfna.OS_UNKNOWN;
        }
    };
    private final int zzg;

    zzfna(int i9) {
        this.zzg = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzg;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
