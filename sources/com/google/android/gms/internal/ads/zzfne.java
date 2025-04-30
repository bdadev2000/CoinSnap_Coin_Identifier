package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfne implements zzhbs {
    TAG_UNKNOWN(0),
    UNRECOGNIZED(-1);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfnd
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzfne.zzb(i9);
        }
    };
    private final int zze;

    zzfne(int i9) {
        this.zze = i9;
    }

    public static zzfne zzb(int i9) {
        if (i9 != 0) {
            return null;
        }
        return TAG_UNKNOWN;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zze;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
