package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzoz {
    public static final zzoz zza = new zzox().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzoz(zzox zzoxVar, zzoy zzoyVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        z10 = zzoxVar.zza;
        this.zzb = z10;
        z11 = zzoxVar.zzb;
        this.zzc = z11;
        z12 = zzoxVar.zzc;
        this.zzd = z12;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzoz.class == obj.getClass()) {
            zzoz zzozVar = (zzoz) obj;
            if (this.zzb == zzozVar.zzb && this.zzc == zzozVar.zzc && this.zzd == zzozVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return (z11 ? 1 : 0) + (z11 ? 1 : 0) + ((z10 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
