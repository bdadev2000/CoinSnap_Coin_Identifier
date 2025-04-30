package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzpp implements zzpq {
    private static final zzgz<Boolean> zza;
    private static final zzgz<Boolean> zzb;
    private static final zzgz<Boolean> zzc;
    private static final zzgz<Boolean> zzd;

    static {
        zzhh zza2 = new zzhh(zzgw.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.sgtm.google_signal.enable", false);
        zzb = zza2.zza("measurement.sgtm.preview_mode_enabled", true);
        zzc = zza2.zza("measurement.sgtm.service", true);
        zzd = zza2.zza("measurement.sgtm.upload_queue", false);
        zza2.zza("measurement.id.sgtm", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpq
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }
}
