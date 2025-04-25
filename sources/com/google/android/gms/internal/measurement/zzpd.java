package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes12.dex */
public final class zzpd implements zzpa {
    private static final zzhj<Boolean> zza;

    static {
        zzhr zza2 = new zzhr(zzhk.zza("com.google.android.gms.measurement")).zzb().zza();
        zza = zza2.zza("measurement.gmscore_network_migration", false);
        zza2.zza("measurement.id.gmscore_network_migration", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpa
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
