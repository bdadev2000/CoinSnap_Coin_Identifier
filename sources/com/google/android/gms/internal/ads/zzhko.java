package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhko implements zzhky, zzhkj {
    private static final Object zza = new Object();
    private volatile zzhky zzb;
    private volatile Object zzc = zza;

    private zzhko(zzhky zzhkyVar) {
        this.zzb = zzhkyVar;
    }

    public static zzhkj zza(zzhky zzhkyVar) {
        if (zzhkyVar instanceof zzhkj) {
            return (zzhkj) zzhkyVar;
        }
        return new zzhko(zzhkyVar);
    }

    public static zzhky zzc(zzhky zzhkyVar) {
        return zzhkyVar instanceof zzhko ? zzhkyVar : new zzhko(zzhkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.zzc;
                    if (obj == obj2) {
                        obj = this.zzb.zzb();
                        Object obj3 = this.zzc;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.zzc = obj;
                        this.zzb = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
