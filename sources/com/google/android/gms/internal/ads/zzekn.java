package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzekn {

    @Nullable
    private zzeke zza;

    public zzekn() {
    }

    private zzekn(zzeke zzekeVar) {
        this.zza = zzekeVar;
    }

    public static zzekn zzb(zzeke zzekeVar) {
        return new zzekn(zzekeVar);
    }

    public final zzeke zza(Clock clock, zzekg zzekgVar, zzegp zzegpVar, zzfng zzfngVar) {
        zzeke zzekeVar = this.zza;
        return zzekeVar != null ? zzekeVar : new zzeke(clock, zzekgVar, zzegpVar, zzfngVar);
    }
}
