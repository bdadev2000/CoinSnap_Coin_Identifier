package com.google.android.gms.internal.ads;

import android.support.v4.media.d;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaeb {
    public static final zzaeb zza = new zzaeb(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaeb(long j2, long j3) {
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeb.class == obj.getClass()) {
            zzaeb zzaebVar = (zzaeb) obj;
            if (this.zzb == zzaebVar.zzb && this.zzc == zzaebVar.zzc) {
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
        return d.p(sb, this.zzc, "]");
    }
}
