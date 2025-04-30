package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzark {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzaqn zzb;

    @Nullable
    public final zzarn zzc;
    public boolean zzd;

    private zzark(zzarn zzarnVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzarnVar;
    }

    public static zzark zza(zzarn zzarnVar) {
        return new zzark(zzarnVar);
    }

    public static zzark zzb(@Nullable Object obj, @Nullable zzaqn zzaqnVar) {
        return new zzark(obj, zzaqnVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzark(@Nullable Object obj, @Nullable zzaqn zzaqnVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaqnVar;
        this.zzc = null;
    }
}
