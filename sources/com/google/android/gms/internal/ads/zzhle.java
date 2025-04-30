package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzhle implements zzhky {
    private static final Object zza = new Object();
    private volatile zzhky zzb;
    private volatile Object zzc = zza;

    private zzhle(zzhky zzhkyVar) {
        this.zzb = zzhkyVar;
    }

    public static zzhky zza(zzhky zzhkyVar) {
        return ((zzhkyVar instanceof zzhle) || (zzhkyVar instanceof zzhko)) ? zzhkyVar : new zzhle(zzhkyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzhky zzhkyVar = this.zzb;
            if (zzhkyVar == null) {
                return this.zzc;
            }
            Object zzb = zzhkyVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
