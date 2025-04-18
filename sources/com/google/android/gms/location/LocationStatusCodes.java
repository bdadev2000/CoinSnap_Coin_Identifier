package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

@Deprecated
/* loaded from: classes3.dex */
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zza(int i2) {
        if ((i2 < 0 || i2 > 1) && (i2 < 1000 || i2 >= 1006)) {
            return 1;
        }
        return i2;
    }

    @NonNull
    public static Status zzb(int i2) {
        if (i2 == 1) {
            i2 = 13;
        }
        return new Status(i2);
    }
}
