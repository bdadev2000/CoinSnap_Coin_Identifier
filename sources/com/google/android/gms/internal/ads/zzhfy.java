package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhfy implements zzhbs {
    SOURCE_UNSPECIFIED(0),
    CLIENT_GENERATION(1);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhfw
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhfy.zzb(i9);
        }
    };
    private final int zze;

    zzhfy(int i9) {
        this.zze = i9;
    }

    public static zzhfy zzb(int i9) {
        if (i9 == 0) {
            return SOURCE_UNSPECIFIED;
        }
        if (i9 != 1) {
            return null;
        }
        return CLIENT_GENERATION;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        return this.zze;
    }
}
