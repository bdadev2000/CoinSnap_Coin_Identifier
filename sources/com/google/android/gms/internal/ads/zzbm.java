package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import com.google.common.primitives.Ints;

@VisibleForTesting
/* loaded from: classes4.dex */
final class zzbm {
    public final int zza;

    public zzbm(int i2, int i3) {
        this.zza = i3;
    }

    public final int zza() {
        int i2 = this.zza;
        if (i2 == 2) {
            return 10;
        }
        if (i2 == 5) {
            return 11;
        }
        if (i2 == 29) {
            return 12;
        }
        if (i2 != 42) {
            return i2 != 22 ? i2 != 23 ? 0 : 15 : Ints.MAX_POWER_OF_TWO;
        }
        return 16;
    }
}
