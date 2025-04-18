package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzhih implements zzhir, zzhic {
    private static final Object zza = new Object();
    private volatile zzhir zzb;
    private volatile Object zzc = zza;

    private zzhih(zzhir zzhirVar) {
        this.zzb = zzhirVar;
    }

    public static zzhic zza(zzhir zzhirVar) {
        return zzhirVar instanceof zzhic ? (zzhic) zzhirVar : new zzhih(zzhirVar);
    }

    public static zzhir zzc(zzhir zzhirVar) {
        return zzhirVar instanceof zzhih ? zzhirVar : new zzhih(zzhirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
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
