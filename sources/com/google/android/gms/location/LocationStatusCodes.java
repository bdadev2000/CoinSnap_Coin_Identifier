package com.google.android.gms.location;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;

@Deprecated
/* loaded from: classes2.dex */
public final class LocationStatusCodes {
    public static final int ERROR = 1;
    public static final int GEOFENCE_NOT_AVAILABLE = 1000;
    public static final int GEOFENCE_TOO_MANY_GEOFENCES = 1001;
    public static final int GEOFENCE_TOO_MANY_PENDING_INTENTS = 1002;
    public static final int SUCCESS = 0;

    private LocationStatusCodes() {
    }

    public static int zza(int i9) {
        if ((i9 < 0 || i9 > 1) && (i9 < 1000 || i9 >= 1006)) {
            return 1;
        }
        return i9;
    }

    @NonNull
    public static Status zzb(int i9) {
        if (i9 == 1) {
            i9 = 13;
        }
        return new Status(i9);
    }
}
