package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzpu implements zzpr {
    private static final zzgz<Boolean> zza = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza().zza("measurement.integration.disable_firebase_instance_id", false);

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
