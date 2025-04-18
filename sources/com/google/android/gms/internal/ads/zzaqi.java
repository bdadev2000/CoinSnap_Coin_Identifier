package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaqi {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzapl zzb;

    @Nullable
    public final zzaql zzc;
    public boolean zzd;

    private zzaqi(zzaql zzaqlVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqlVar;
    }

    public static zzaqi zza(zzaql zzaqlVar) {
        return new zzaqi(zzaqlVar);
    }

    public static zzaqi zzb(@Nullable Object obj, @Nullable zzapl zzaplVar) {
        return new zzaqi(obj, zzaplVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaqi(@Nullable Object obj, @Nullable zzapl zzaplVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaplVar;
        this.zzc = null;
    }
}
