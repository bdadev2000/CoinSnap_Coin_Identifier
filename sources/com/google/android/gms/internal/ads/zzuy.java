package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzuy {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzuy(Object obj, int i2, int i3, long j2, int i4) {
        this.zza = obj;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = j2;
        this.zze = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuy)) {
            return false;
        }
        zzuy zzuyVar = (zzuy) obj;
        return this.zza.equals(zzuyVar.zza) && this.zzb == zzuyVar.zzb && this.zzc == zzuyVar.zzc && this.zzd == zzuyVar.zzd && this.zze == zzuyVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzuy zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzuy(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzuy(Object obj, int i2, int i3, long j2) {
        this(obj, i2, i3, j2, -1);
    }

    public zzuy(Object obj, long j2) {
        this(obj, -1, -1, j2, -1);
    }

    public zzuy(Object obj, long j2, int i2) {
        this(obj, -1, -1, j2, i2);
    }
}
