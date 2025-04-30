package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgqc {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgqc(Class cls, Class cls2, zzgqb zzgqbVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqc)) {
            return false;
        }
        zzgqc zzgqcVar = (zzgqc) obj;
        if (!zzgqcVar.zza.equals(this.zza) || !zzgqcVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return o.k(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
