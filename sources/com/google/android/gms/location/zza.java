package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes3.dex */
public final class zza {
    private long zza = Long.MIN_VALUE;

    public final zza zza(long j3) {
        boolean z10;
        if (j3 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkArgument(z10, "intervalMillis can't be negative.");
        this.zza = j3;
        return this;
    }

    public final zzb zzb() {
        boolean z10;
        if (this.zza != Long.MIN_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10, "Must set intervalMillis.");
        return new zzb(this.zza, true, null, null, null, false, null, 0L, null);
    }
}
