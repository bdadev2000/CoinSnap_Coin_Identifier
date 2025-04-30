package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzxw {
    public final long zza;
    public final long zzb;

    public zzxw(long j7, long j9) {
        this.zza = j7;
        this.zzb = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxw)) {
            return false;
        }
        zzxw zzxwVar = (zzxw) obj;
        if (this.zza == zzxwVar.zza && this.zzb == zzxwVar.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
