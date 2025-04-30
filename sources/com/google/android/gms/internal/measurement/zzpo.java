package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzpo implements zzpl {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza2.zza("measurement.client.sessions.background_sessions_enabled", true);
        zza = zza2.zza("measurement.client.sessions.enable_fix_background_engagement", false);
        zza2.zza("measurement.client.sessions.immediate_start_enabled_foreground", true);
        zzb = zza2.zza("measurement.client.sessions.enable_pause_engagement_in_background", true);
        zza2.zza("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        zza2.zza("measurement.client.sessions.session_id_enabled", true);
        zza2.zza("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpl
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
