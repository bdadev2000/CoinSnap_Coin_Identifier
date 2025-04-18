package com.google.android.gms.internal.ads;

import a4.j;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzadr {
    public static final zzadr zza = new zzadr(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadr(long j3, long j10) {
        this.zzb = j3;
        this.zzc = j10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadr.class == obj.getClass()) {
            zzadr zzadrVar = (zzadr) obj;
            if (this.zzb == zzadrVar.zzb && this.zzc == zzadrVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[timeUs=");
        sb2.append(this.zzb);
        sb2.append(", position=");
        return j.j(sb2, this.zzc, "]");
    }
}
