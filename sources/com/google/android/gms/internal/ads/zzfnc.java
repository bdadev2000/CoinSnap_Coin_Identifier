package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public enum zzfnc implements zzhbs {
    SCAR_REQUEST_TYPE_ADMOB(0),
    SCAR_REQUEST_TYPE_UNSPECIFIED(-1),
    SCAR_REQUEST_TYPE_INBOUND_MEDIATION(1),
    SCAR_REQUEST_TYPE_GBID(2),
    SCAR_REQUEST_TYPE_GOLDENEYE(3),
    SCAR_REQUEST_TYPE_YAVIN(4),
    SCAR_REQUEST_TYPE_UNITY(5),
    SCAR_REQUEST_TYPE_PAW(6),
    SCAR_REQUEST_TYPE_GUILDER(7),
    SCAR_REQUEST_TYPE_GAM_S2S(8),
    UNRECOGNIZED(-1);

    private static final zzhbt zzl = new zzhbt() { // from class: com.google.android.gms.internal.ads.zzfnb
        @Override // com.google.android.gms.internal.ads.zzhbt
        public final /* synthetic */ zzhbs zza(int i9) {
            zzfnc zzfncVar = zzfnc.SCAR_REQUEST_TYPE_ADMOB;
            switch (i9) {
                case -1:
                    return zzfnc.SCAR_REQUEST_TYPE_UNSPECIFIED;
                case 0:
                    return zzfnc.SCAR_REQUEST_TYPE_ADMOB;
                case 1:
                    return zzfnc.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
                case 2:
                    return zzfnc.SCAR_REQUEST_TYPE_GBID;
                case 3:
                    return zzfnc.SCAR_REQUEST_TYPE_GOLDENEYE;
                case 4:
                    return zzfnc.SCAR_REQUEST_TYPE_YAVIN;
                case 5:
                    return zzfnc.SCAR_REQUEST_TYPE_UNITY;
                case 6:
                    return zzfnc.SCAR_REQUEST_TYPE_PAW;
                case 7:
                    return zzfnc.SCAR_REQUEST_TYPE_GUILDER;
                case 8:
                    return zzfnc.SCAR_REQUEST_TYPE_GAM_S2S;
                default:
                    return null;
            }
        }
    };
    private final int zzn;

    zzfnc(int i9) {
        this.zzn = i9;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzn;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
