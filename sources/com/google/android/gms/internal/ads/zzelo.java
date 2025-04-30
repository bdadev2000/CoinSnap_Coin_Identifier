package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes2.dex */
public final class zzelo {

    @Nullable
    private zzelf zza;

    public zzelo() {
    }

    public static zzelo zzb(zzelf zzelfVar) {
        return new zzelo(zzelfVar);
    }

    public final zzelf zza(Clock clock, zzelh zzelhVar, zzehq zzehqVar, zzfoe zzfoeVar) {
        zzelf zzelfVar = this.zza;
        if (zzelfVar != null) {
            return zzelfVar;
        }
        return new zzelf(clock, zzelhVar, zzehqVar, zzfoeVar);
    }

    private zzelo(zzelf zzelfVar) {
        this.zza = zzelfVar;
    }
}
