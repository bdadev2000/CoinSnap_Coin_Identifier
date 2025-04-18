package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import vd.e;

/* loaded from: classes3.dex */
public final class zzck {
    public static final zzck zza = new zzck(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzck(int i10, int i11, int i12) {
        int i13;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        if (zzen.zzJ(i12)) {
            i13 = zzen.zzk(i12) * i11;
        } else {
            i13 = -1;
        }
        this.zze = i13;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzck)) {
            return false;
        }
        zzck zzckVar = (zzck) obj;
        if (this.zzb == zzckVar.zzb && this.zzc == zzckVar.zzc && this.zzd == zzckVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
        sb2.append(this.zzb);
        sb2.append(", channelCount=");
        sb2.append(this.zzc);
        sb2.append(", encoding=");
        return e.g(sb2, this.zzd, "]");
    }
}
