package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzny implements zznv {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.collection.event_safelist", true);
        zza = zza2.zza("measurement.service.store_null_safelist", true);
        zzb = zza2.zza("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
