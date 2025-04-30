package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzwp {
    public final int zza;
    public final boolean zzb;

    public zzwp(int i9, boolean z8) {
        this.zza = i9;
        this.zzb = z8;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzwp.class == obj.getClass()) {
            zzwp zzwpVar = (zzwp) obj;
            if (this.zza == zzwpVar.zza && this.zzb == zzwpVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
