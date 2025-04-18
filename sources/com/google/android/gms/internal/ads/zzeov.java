package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class zzeov {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzeou zzb;

    @Nullable
    public final zzeou zza() {
        return this.zzb;
    }

    public final void zzb(zzeou zzeouVar) {
        this.zzb = zzeouVar;
    }

    public final void zzc(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
