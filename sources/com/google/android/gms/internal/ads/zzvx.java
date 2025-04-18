package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
final class zzvx {
    public final int zza;
    public final boolean zzb;

    public zzvx(int i2, boolean z2) {
        this.zza = i2;
        this.zzb = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvx.class == obj.getClass()) {
            zzvx zzvxVar = (zzvx) obj;
            if (this.zza == zzvxVar.zza && this.zzb == zzvxVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
