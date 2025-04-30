package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzqa {
    public static final zzqa zza = new zzpy().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzqa(zzpy zzpyVar, zzpz zzpzVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        z8 = zzpyVar.zza;
        this.zzb = z8;
        z9 = zzpyVar.zzb;
        this.zzc = z9;
        z10 = zzpyVar.zzc;
        this.zzd = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzqa.class == obj.getClass()) {
            zzqa zzqaVar = (zzqa) obj;
            if (this.zzb == zzqaVar.zzb && this.zzc == zzqaVar.zzc && this.zzd == zzqaVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z8 = this.zzb;
        boolean z9 = this.zzc;
        return (z9 ? 1 : 0) + (z9 ? 1 : 0) + ((z8 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
