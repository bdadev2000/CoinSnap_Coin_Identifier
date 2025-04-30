package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzow implements zzot {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.item_scoped_custom_parameters.client", true);
        zzb = zza2.zza("measurement.item_scoped_custom_parameters.service", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzot
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
