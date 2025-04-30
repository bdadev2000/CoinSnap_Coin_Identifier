package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfsb implements zzhbs {
    BLOCKED_REASON_UNKNOWN(1),
    BLOCKED_REASON_BACKGROUND(2);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfrz
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzfsb.zzb(i9);
        }
    };
    private final int zze;

    zzfsb(int i9) {
        this.zze = i9;
    }

    public static zzfsb zzb(int i9) {
        if (i9 == 1) {
            return BLOCKED_REASON_UNKNOWN;
        }
        if (i9 != 2) {
            return null;
        }
        return BLOCKED_REASON_BACKGROUND;
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
