package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzhax {
    private final Object zza;
    private final int zzb;

    public zzhax(Object obj, int i9) {
        this.zza = obj;
        this.zzb = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhax)) {
            return false;
        }
        zzhax zzhaxVar = (zzhax) obj;
        if (this.zza != zzhaxVar.zza || this.zzb != zzhaxVar.zzb) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
