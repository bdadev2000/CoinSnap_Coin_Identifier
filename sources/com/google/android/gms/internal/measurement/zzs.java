package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    zzs(int i9) {
    }

    public static zzs zza(int i9) {
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 5) {
                    if (i9 != 6) {
                        return INFO;
                    }
                    return ERROR;
                }
                return WARN;
            }
            return DEBUG;
        }
        return VERBOSE;
    }
}
