package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class zzerg {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzerf zzb;

    @Nullable
    public final zzerf zza() {
        return this.zzb;
    }

    public final void zzb(zzerf zzerfVar) {
        this.zzb = zzerfVar;
    }

    public final void zzc(boolean z8) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
