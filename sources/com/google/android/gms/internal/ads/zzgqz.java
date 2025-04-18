package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgqz {
    private final Class zza;
    private final zzgyx zzb;

    public /* synthetic */ zzgqz(Class cls, zzgyx zzgyxVar, zzgqy zzgqyVar) {
        this.zza = cls;
        this.zzb = zzgyxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqz)) {
            return false;
        }
        zzgqz zzgqzVar = (zzgqz) obj;
        return zzgqzVar.zza.equals(this.zza) && zzgqzVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.k(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
