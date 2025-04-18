package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import eb.j;

/* loaded from: classes3.dex */
public final class zzado {
    public final zzadr zza;
    public final zzadr zzb;

    public zzado(zzadr zzadrVar, zzadr zzadrVar2) {
        this.zza = zzadrVar;
        this.zzb = zzadrVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzado.class == obj.getClass()) {
            zzado zzadoVar = (zzado) obj;
            if (this.zza.equals(zzadoVar.zza) && this.zzb.equals(zzadoVar.zzb)) {
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
        zzadr zzadrVar = this.zza;
        zzadr zzadrVar2 = this.zzb;
        String zzadrVar3 = zzadrVar.toString();
        if (zzadrVar.equals(zzadrVar2)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return j.l("[", zzadrVar3, concat, "]");
    }
}
