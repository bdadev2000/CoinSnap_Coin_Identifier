package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zznz implements zzoa {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;
    private static final zzgz<Boolean> zzc;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.client.ad_id_consent_fix", true);
        zza2.zza("measurement.service.consent.aiid_reset_fix", false);
        zza2.zza("measurement.service.consent.aiid_reset_fix2", true);
        zza = zza2.zza("measurement.service.consent.app_start_fix", true);
        zzb = zza2.zza("measurement.service.consent.params_on_fx", true);
        zzc = zza2.zza("measurement.service.consent.pfo_on_fx", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final boolean zzc() {
        return zzc.zza().booleanValue();
    }
}
