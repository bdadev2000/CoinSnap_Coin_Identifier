package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
public final class zzeje {

    @Nullable
    private zzeiv zza;

    public zzeje() {
    }

    private zzeje(zzeiv zzeivVar) {
        this.zza = zzeivVar;
    }

    public static zzeje zzb(zzeiv zzeivVar) {
        return new zzeje(zzeivVar);
    }

    public final zzeiv zza(Clock clock, zzeix zzeixVar, zzefg zzefgVar, zzflr zzflrVar) {
        zzeiv zzeivVar = this.zza;
        return zzeivVar != null ? zzeivVar : new zzeiv(clock, zzeixVar, zzefgVar, zzflrVar);
    }
}
