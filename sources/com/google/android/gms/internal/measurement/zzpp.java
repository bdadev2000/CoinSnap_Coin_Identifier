package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzpp implements zzpm {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;
    private static final zzhj<Boolean> zzc;
    private static final zzhj<Boolean> zzd;
    private static final zzhj<Boolean> zze;
    private static final zzhj<Boolean> zzf;
    private static final zzhj<Boolean> zzg;
    private static final zzhj<Boolean> zzh;
    private static final zzhj<Boolean> zzi;
    private static final zzhj<Boolean> zzj;
    private static final zzhj<Boolean> zzk;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.rb.attribution.ad_campaign_info", false);
        zzb = zza2.zza("measurement.rb.attribution.client.bundle_on_backgrounded", true);
        zzc = zza2.zza("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        zzd = zza2.zza("measurement.rb.attribution.client2", true);
        zza2.zza("measurement.rb.attribution.dma_fix", true);
        zze = zza2.zza("measurement.rb.attribution.followup1.service", false);
        zza2.zza("measurement.rb.attribution.index_out_of_bounds_fix", true);
        zzf = zza2.zza("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        zzg = zza2.zza("measurement.rb.attribution.retry_disposition", false);
        zzh = zza2.zza("measurement.rb.attribution.service", true);
        zzi = zza2.zza("measurement.rb.attribution.enable_trigger_redaction", true);
        zzj = zza2.zza("measurement.rb.attribution.uuid_generation", true);
        zza2.zza("measurement.id.rb.attribution.retry_disposition", 0L);
        zzk = zza2.zza("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzg() {
        return zzf.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzh() {
        return zzg.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzi() {
        return zzh.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzj() {
        return zzi.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzk() {
        return zzj.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpm
    public final boolean zzl() {
        return zzk.zza().booleanValue();
    }
}
