package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzww {
    public final long zza;
    public final long zzb;

    public zzww(long j3, long j10) {
        this.zza = j3;
        this.zzb = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzww)) {
            return false;
        }
        zzww zzwwVar = (zzww) obj;
        if (this.zza == zzwwVar.zza && this.zzb == zzwwVar.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
