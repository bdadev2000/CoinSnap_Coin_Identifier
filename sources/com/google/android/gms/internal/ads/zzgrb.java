package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes3.dex */
final class zzgrb {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgrb(Class cls, Class cls2, zzgra zzgraVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgrb)) {
            return false;
        }
        zzgrb zzgrbVar = (zzgrb) obj;
        return zzgrbVar.zza.equals(this.zza) && zzgrbVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return androidx.compose.foundation.text.input.a.k(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
