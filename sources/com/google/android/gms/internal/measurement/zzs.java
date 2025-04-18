package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    zzs(int i10) {
    }

    public static zzs zza(int i10) {
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 5) {
                    if (i10 != 6) {
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
