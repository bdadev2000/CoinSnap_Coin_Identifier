package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class zzgyg {
    private final Object zza;
    private final int zzb;

    public zzgyg(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgyg)) {
            return false;
        }
        zzgyg zzgygVar = (zzgyg) obj;
        if (this.zza != zzgygVar.zza || this.zzb != zzgygVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
