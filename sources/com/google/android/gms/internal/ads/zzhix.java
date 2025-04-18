package com.google.android.gms.internal.ads;

/* loaded from: classes4.dex */
public final class zzhix implements zzhir {
    private static final Object zza = new Object();
    private volatile zzhir zzb;
    private volatile Object zzc = zza;

    private zzhix(zzhir zzhirVar) {
        this.zzb = zzhirVar;
    }

    public static zzhir zza(zzhir zzhirVar) {
        return ((zzhirVar instanceof zzhix) || (zzhirVar instanceof zzhih)) ? zzhirVar : new zzhix(zzhirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhja, com.google.android.gms.internal.ads.zzhiz
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhir zzhirVar = this.zzb;
        if (zzhirVar == null) {
            return this.zzc;
        }
        Object zzb = zzhirVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
