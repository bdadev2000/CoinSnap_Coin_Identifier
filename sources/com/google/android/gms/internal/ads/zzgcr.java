package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes4.dex */
final class zzgcr extends zzgci implements Serializable {
    final zzgci zza;

    public zzgcr(zzgci zzgciVar) {
        this.zza = zzgciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgci, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgcr) {
            return this.zza.equals(((zzgcr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }
}
