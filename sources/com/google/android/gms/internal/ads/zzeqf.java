package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzeqf {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzeqe zzb;

    @Nullable
    public final zzeqe zza() {
        return this.zzb;
    }

    public final void zzb(zzeqe zzeqeVar) {
        this.zzb = zzeqeVar;
    }

    public final void zzc(boolean z2) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
