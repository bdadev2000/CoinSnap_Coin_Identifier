package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzbbv {
    final long zza;
    final String zzb;
    final int zzc;

    public zzbbv(long j7, String str, int i9) {
        this.zza = j7;
        this.zzb = str;
        this.zzc = i9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzbbv)) {
            zzbbv zzbbvVar = (zzbbv) obj;
            if (zzbbvVar.zza == this.zza && zzbbvVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
