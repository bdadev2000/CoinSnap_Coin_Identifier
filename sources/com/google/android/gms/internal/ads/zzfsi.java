package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfsi implements zzhbs {
    EVENT_TYPE_UNKNOWN(0),
    BLOCKED_IMPRESSION(1);

    private static final zzhbt zzc = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfsg
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzfsi.zzb(i9);
        }
    };
    private final int zze;

    zzfsi(int i9) {
        this.zze = i9;
    }

    public static zzfsi zzb(int i9) {
        if (i9 == 0) {
            return EVENT_TYPE_UNKNOWN;
        }
        if (i9 != 1) {
            return null;
        }
        return BLOCKED_IMPRESSION;
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
