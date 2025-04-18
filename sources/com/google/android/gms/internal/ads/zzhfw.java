package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhfw implements zzhgg, zzhfr {
    private static final Object zza = new Object();
    private volatile zzhgg zzb;
    private volatile Object zzc = zza;

    private zzhfw(zzhgg zzhggVar) {
        this.zzb = zzhggVar;
    }

    public static zzhfr zza(zzhgg zzhggVar) {
        if (zzhggVar instanceof zzhfr) {
            return (zzhfr) zzhggVar;
        }
        return new zzhfw(zzhggVar);
    }

    public static zzhgg zzc(zzhgg zzhggVar) {
        return zzhggVar instanceof zzhfw ? zzhggVar : new zzhfw(zzhggVar);
    }

    private final synchronized Object zzd() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            Object zzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != zzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + zzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
