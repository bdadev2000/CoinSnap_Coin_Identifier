package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzady {
    public final zzaeb zza;
    public final zzaeb zzb;

    public zzady(zzaeb zzaebVar, zzaeb zzaebVar2) {
        this.zza = zzaebVar;
        this.zzb = zzaebVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzady.class == obj.getClass()) {
            zzady zzadyVar = (zzady) obj;
            if (this.zza.equals(zzadyVar.zza) && this.zzb.equals(zzadyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzaeb zzaebVar = this.zza;
        return androidx.compose.foundation.text.input.a.l("[", zzaebVar.toString(), zzaebVar.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString()), "]");
    }
}
