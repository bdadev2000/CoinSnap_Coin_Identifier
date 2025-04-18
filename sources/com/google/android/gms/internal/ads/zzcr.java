package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcr {
    public static final zzcr zza = new zzcr(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcr(int i2, int i3, int i4) {
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = zzeu.zzI(i4) ? zzeu.zzj(i4) * i3 : -1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcr)) {
            return false;
        }
        zzcr zzcrVar = (zzcr) obj;
        return this.zzb == zzcrVar.zzb && this.zzc == zzcrVar.zzc && this.zzd == zzcrVar.zzd;
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
        return androidx.compose.foundation.text.input.a.n(sb, this.zzd, "]");
    }
}
