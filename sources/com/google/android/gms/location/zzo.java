package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public final class zzo {
    public static int zza(int i10) {
        boolean z10;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
                Preconditions.checkArgument(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
                return i10;
            }
        }
        z10 = true;
        Preconditions.checkArgument(z10, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String zzb(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return "GRANULARITY_FINE";
                }
                throw new IllegalArgumentException();
            }
            return "GRANULARITY_COARSE";
        }
        return "GRANULARITY_PERMISSION_LEVEL";
    }
}
