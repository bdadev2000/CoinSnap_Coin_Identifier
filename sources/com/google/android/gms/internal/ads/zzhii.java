package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzhii implements zzhbs {
    TYPE_UNKNOWN(0),
    TYPE_CREATIVE(1);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzhig
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzhii.zzb(i9);
        }
    };
    private final int zze;

    zzhii(int i9) {
        this.zze = i9;
    }

    public static zzhii zzb(int i9) {
        if (i9 == 0) {
            return TYPE_UNKNOWN;
        }
        if (i9 != 1) {
            return null;
        }
        return TYPE_CREATIVE;
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
