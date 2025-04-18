package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzoy implements zzoz {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.gmscore_feature_tracking", true);
        zzb = zza2.zza("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
