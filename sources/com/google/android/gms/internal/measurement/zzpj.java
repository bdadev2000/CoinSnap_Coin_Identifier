package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzpj implements zzpk {
    private static final zzgz<Boolean> zza;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.collection.enable_session_stitching_token.client.dev", true);
        zza2.zza("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        zza = zza2.zza("measurement.session_stitching_token_enabled", false);
        zza2.zza("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpk
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
