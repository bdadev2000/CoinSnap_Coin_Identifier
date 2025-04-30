package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzaez {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaez(int i9, byte[] bArr, int i10, int i11) {
        this.zza = i9;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaez.class == obj.getClass()) {
            zzaez zzaezVar = (zzaez) obj;
            if (this.zza == zzaezVar.zza && this.zzc == zzaezVar.zzc && this.zzd == zzaezVar.zzd && Arrays.equals(this.zzb, zzaezVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i9 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
