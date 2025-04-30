package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzdx {
    public static final zzdx zza = new zzdx(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdx(int i9, int i10, int i11) {
        int i12;
        this.zzb = i9;
        this.zzc = i10;
        this.zzd = i11;
        if (zzgd.zzK(i11)) {
            i12 = zzgd.zzm(i11, i10);
        } else {
            i12 = -1;
        }
        this.zze = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdx)) {
            return false;
        }
        zzdx zzdxVar = (zzdx) obj;
        if (this.zzb == zzdxVar.zzb && this.zzc == zzdxVar.zzc && this.zzd == zzdxVar.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.zzb);
        sb.append(", channelCount=");
        sb.append(this.zzc);
        sb.append(", encoding=");
        return AbstractC2914a.g(sb, this.zzd, "]");
    }
}
