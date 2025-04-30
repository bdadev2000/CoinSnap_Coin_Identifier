package com.google.android.gms.internal.ads;

import Q7.n0;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaeu {
    public static final zzaeu zza = new zzaeu(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaeu(long j7, long j9) {
        this.zzb = j7;
        this.zzc = j9;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeu.class == obj.getClass()) {
            zzaeu zzaeuVar = (zzaeu) obj;
            if (this.zzb == zzaeuVar.zzb && this.zzc == zzaeuVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.zzb);
        sb.append(", position=");
        return n0.k(sb, this.zzc, "]");
    }
}
