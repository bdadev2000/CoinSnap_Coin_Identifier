package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Objects;

/* loaded from: classes2.dex */
final class zzgqt {
    private final Class zza;
    private final zzgze zzb;

    public /* synthetic */ zzgqt(Class cls, zzgze zzgzeVar, zzgqs zzgqsVar) {
        this.zza = cls;
        this.zzb = zzgzeVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgqt)) {
            return false;
        }
        zzgqt zzgqtVar = (zzgqt) obj;
        if (!zzgqtVar.zza.equals(this.zza) || !zzgqtVar.zzb.equals(this.zzb)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return o.k(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
