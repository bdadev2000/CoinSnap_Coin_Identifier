package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzhgm implements zzhgg {
    private static final Object zza = new Object();
    private volatile zzhgg zzb;
    private volatile Object zzc = zza;

    private zzhgm(zzhgg zzhggVar) {
        this.zzb = zzhggVar;
    }

    public static zzhgg zza(zzhgg zzhggVar) {
        return ((zzhggVar instanceof zzhgm) || (zzhggVar instanceof zzhfw)) ? zzhggVar : new zzhgm(zzhggVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhgg zzhggVar = this.zzb;
        if (zzhggVar == null) {
            return this.zzc;
        }
        Object zzb = zzhggVar.zzb();
        this.zzc = zzb;
        this.zzb = null;
        return zzb;
    }
}
