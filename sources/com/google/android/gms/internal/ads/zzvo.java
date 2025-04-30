package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzvo {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    private zzvo(Object obj, int i9, int i10, long j7, int i11) {
        this.zza = obj;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = j7;
        this.zze = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzvo)) {
            return false;
        }
        zzvo zzvoVar = (zzvo) obj;
        if (this.zza.equals(zzvoVar.zza) && this.zzb == zzvoVar.zzb && this.zzc == zzvoVar.zzc && this.zzd == zzvoVar.zzd && this.zze == zzvoVar.zze) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzvo zza(Object obj) {
        if (this.zza.equals(obj)) {
            return this;
        }
        return new zzvo(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzvo(Object obj, int i9, int i10, long j7) {
        this(obj, i9, i10, j7, -1);
    }

    public zzvo(Object obj, long j7) {
        this(obj, -1, -1, j7, -1);
    }

    public zzvo(Object obj, long j7, int i9) {
        this(obj, -1, -1, j7, i9);
    }
}
