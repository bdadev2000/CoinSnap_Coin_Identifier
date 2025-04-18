package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzpd {
    public static final zzpd zza = new zzpb().zzd();
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;

    public /* synthetic */ zzpd(zzpb zzpbVar, zzpc zzpcVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        z2 = zzpbVar.zza;
        this.zzb = z2;
        z3 = zzpbVar.zzb;
        this.zzc = z3;
        z4 = zzpbVar.zzc;
        this.zzd = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzpd.class == obj.getClass()) {
            zzpd zzpdVar = (zzpd) obj;
            if (this.zzb == zzpdVar.zzb && this.zzc == zzpdVar.zzc && this.zzd == zzpdVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z2 = this.zzb;
        boolean z3 = this.zzc;
        return (z3 ? 1 : 0) + (z3 ? 1 : 0) + ((z2 ? 1 : 0) << 2) + (this.zzd ? 1 : 0);
    }
}
