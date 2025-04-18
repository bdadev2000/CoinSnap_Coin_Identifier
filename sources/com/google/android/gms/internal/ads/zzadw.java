package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzadw {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzadw(int i10, byte[] bArr, int i11, int i12) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = i11;
        this.zzd = i12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zza == zzadwVar.zza && this.zzc == zzadwVar.zzc && this.zzd == zzadwVar.zzd && Arrays.equals(this.zzb, zzadwVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zza;
        return ((((Arrays.hashCode(this.zzb) + (i10 * 31)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
