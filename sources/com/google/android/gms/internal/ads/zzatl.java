package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzatl implements zzhbs {
    ENUM_SIGNAL_SOURCE_UNKNOWN(0),
    ENUM_SIGNAL_SOURCE_DISABLE(1),
    ENUM_SIGNAL_SOURCE_ADSHIELD(2),
    ENUM_SIGNAL_SOURCE_GASS(3),
    ENUM_SIGNAL_SOURCE_CALLER_PROVIDED(4);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzatj
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzatl.zzb(i9);
        }
    };
    private final int zzh;

    zzatl(int i9) {
        this.zzh = i9;
    }

    public static zzatl zzb(int i9) {
        if (i9 == 0) {
            return ENUM_SIGNAL_SOURCE_UNKNOWN;
        }
        if (i9 == 1) {
            return ENUM_SIGNAL_SOURCE_DISABLE;
        }
        if (i9 == 2) {
            return ENUM_SIGNAL_SOURCE_ADSHIELD;
        }
        if (i9 == 3) {
            return ENUM_SIGNAL_SOURCE_GASS;
        }
        if (i9 != 4) {
            return null;
        }
        return ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
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
