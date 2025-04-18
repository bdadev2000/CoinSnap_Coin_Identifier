package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzur {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzur(Object obj, int i10, int i11, long j3, int i12) {
        this.zza = obj;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j3;
        this.zze = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzur)) {
            return false;
        }
        zzur zzurVar = (zzur) obj;
        if (this.zza.equals(zzurVar.zza) && this.zzb == zzurVar.zzb && this.zzc == zzurVar.zzc && this.zzd == zzurVar.zzd && this.zze == zzurVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzur zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzur(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzur(Object obj, int i10, int i11, long j3) {
        this(obj, i10, i11, j3, -1);
    }

    public zzur(Object obj, long j3) {
        this(obj, -1, -1, j3, -1);
    }

    public zzur(Object obj, long j3, int i10) {
        this(obj, -1, -1, j3, i10);
    }
}
