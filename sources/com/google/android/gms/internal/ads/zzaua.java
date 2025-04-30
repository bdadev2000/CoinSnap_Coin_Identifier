package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzaua implements zzhbs {
    FUNCTION_UNSPECIFIED(0),
    FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS(1),
    FUNCTION_METHOD_SETIMPLEMENTATIONS(2),
    FUNCTION_CLASS_ADDMETHOD(3),
    FUNCTION_CLASS_REPLACEMETHOD(4);

    private static final zzhbt zzf = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzaty
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            return zzaua.zzb(i9);
        }
    };
    private final int zzh;

    zzaua(int i9) {
        this.zzh = i9;
    }

    public static zzaua zzb(int i9) {
        if (i9 == 0) {
            return FUNCTION_UNSPECIFIED;
        }
        if (i9 == 1) {
            return FUNCTION_METHOD_EXCHANGEIMPLEMENTATIONS;
        }
        if (i9 == 2) {
            return FUNCTION_METHOD_SETIMPLEMENTATIONS;
        }
        if (i9 == 3) {
            return FUNCTION_CLASS_ADDMETHOD;
        }
        if (i9 != 4) {
            return null;
        }
        return FUNCTION_CLASS_REPLACEMETHOD;
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
