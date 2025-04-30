package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgqv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgqv(Class cls, Class cls2, zzgqu zzgquVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqv)) {
            return false;
        }
        zzgqv zzgqvVar = (zzgqv) obj;
        if (!zzgqvVar.zza.equals(this.zza) || !zzgqvVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return o.k(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
