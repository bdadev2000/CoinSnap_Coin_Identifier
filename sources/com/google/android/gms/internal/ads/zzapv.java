package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzapv {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzaoy zzb;

    @Nullable
    public final zzapy zzc;
    public boolean zzd;

    private zzapv(zzapy zzapyVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapyVar;
    }

    public static zzapv zza(zzapy zzapyVar) {
        return new zzapv(zzapyVar);
    }

    public static zzapv zzb(@Nullable Object obj, @Nullable zzaoy zzaoyVar) {
        return new zzapv(obj, zzaoyVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzapv(@Nullable Object obj, @Nullable zzaoy zzaoyVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaoyVar;
        this.zzc = null;
    }
}
