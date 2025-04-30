package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzaer {
    public final zzaeu zza;
    public final zzaeu zzb;

    public zzaer(zzaeu zzaeuVar, zzaeu zzaeuVar2) {
        this.zza = zzaeuVar;
        this.zzb = zzaeuVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaer.class == obj.getClass()) {
            zzaer zzaerVar = (zzaer) obj;
            if (this.zza.equals(zzaerVar.zza) && this.zzb.equals(zzaerVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        zzaeu zzaeuVar = this.zza;
        zzaeu zzaeuVar2 = this.zzb;
        String zzaeuVar3 = zzaeuVar.toString();
        if (zzaeuVar.equals(zzaeuVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return AbstractC2914a.k("[", zzaeuVar3, concat, "]");
    }
}
