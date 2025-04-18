package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzxd {
    public final long zza;
    public final long zzb;

    public zzxd(long j2, long j3) {
        this.zza = j2;
        this.zzb = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzxd)) {
            return false;
        }
        zzxd zzxdVar = (zzxd) obj;
        return this.zza == zzxdVar.zza && this.zzb == zzxdVar.zzb;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
