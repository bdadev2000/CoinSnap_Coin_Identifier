package com.google.android.gms.location;

/* loaded from: classes3.dex */
public final class zzai {
    public static String zza(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "THROTTLE_NEVER";
                }
                throw new IllegalArgumentException();
            }
            return "THROTTLE_ALWAYS";
        }
        return "THROTTLE_BACKGROUND";
    }
}
