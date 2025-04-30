package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes2.dex */
final class zzgcw extends zzgcn implements Serializable {
    final zzgcn zza;

    public zzgcw(zzgcn zzgcnVar) {
        this.zza = zzgcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcn, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgcw) {
            return this.zza.equals(((zzgcw) obj).zza);
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
