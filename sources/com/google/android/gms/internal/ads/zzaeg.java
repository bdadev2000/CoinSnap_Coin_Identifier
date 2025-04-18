package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaeg {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaeg(int i2, byte[] bArr, int i3, int i4) {
        this.zza = i2;
        this.zzb = bArr;
        this.zzc = i3;
        this.zzd = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaeg.class == obj.getClass()) {
            zzaeg zzaegVar = (zzaeg) obj;
            if (this.zza == zzaegVar.zza && this.zzc == zzaegVar.zzc && this.zzd == zzaegVar.zzd && Arrays.equals(this.zzb, zzaegVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i2 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
