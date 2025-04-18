package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzae {
    public static int zza(int i10) {
        boolean z10;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 == 105) {
                i10 = 105;
            } else {
                z10 = false;
                Preconditions.checkArgument(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
                return i10;
            }
        }
        z10 = true;
        Preconditions.checkArgument(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String zzb(int i10) {
        if (i10 != 100) {
            if (i10 != 102) {
                if (i10 != 104) {
                    if (i10 == 105) {
                        return "PASSIVE";
                    }
                    throw new IllegalArgumentException();
                }
                return "LOW_POWER";
            }
            return "BALANCED_POWER_ACCURACY";
        }
        return "HIGH_ACCURACY";
    }
}
