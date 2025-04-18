package com.google.android.gms.internal.ads;

import com.google.android.gms.location.GeofenceStatusCodes;

/* loaded from: classes3.dex */
final class zzhcd implements zzgzd {
    static final zzgzd zza = new zzhcd();

    private zzhcd() {
    }

    @Override // com.google.android.gms.internal.ads.zzgzd
    public final boolean zza(int i10) {
        if (i10 != 0 && i10 != 1 && i10 != 2 && i10 != 1999) {
            switch (i10) {
                case 1000:
                case 1001:
                case 1002:
                case 1003:
                case 1004:
                case GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT /* 1005 */:
                case 1006:
                case 1007:
                case 1008:
                case 1009:
                case 1010:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
