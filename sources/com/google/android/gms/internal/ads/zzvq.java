package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzvq {
    public final int zza;
    public final boolean zzb;

    public zzvq(int i10, boolean z10) {
        this.zza = i10;
        this.zzb = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvq.class == obj.getClass()) {
            zzvq zzvqVar = (zzvq) obj;
            if (this.zza == zzvqVar.zza && this.zzb == zzvqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
