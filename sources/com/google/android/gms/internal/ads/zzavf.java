package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzavf implements zzhbs {
    UNKNOWN_PROTO(0),
    AFMA_SIGNALS(1),
    UNITY_SIGNALS(2),
    PARTNER_SIGNALS(3);

    private static final zzhbt zze = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzavd
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzavf.zzb(i9);
        }
    };
    private final int zzg;

    zzavf(int i9) {
        this.zzg = i9;
    }

    public static zzavf zzb(int i9) {
        if (i9 == 0) {
            return UNKNOWN_PROTO;
        }
        if (i9 == 1) {
            return AFMA_SIGNALS;
        }
        if (i9 == 2) {
            return UNITY_SIGNALS;
        }
        if (i9 != 3) {
            return null;
        }
        return PARTNER_SIGNALS;
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
