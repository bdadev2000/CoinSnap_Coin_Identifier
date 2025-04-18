package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzhf extends zzhd {
    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* synthetic */ int zza(Object obj) {
        return ((zzhe) obj).zza();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzhe) obj).zzb();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzex zzexVar = (zzex) obj;
        zzhe zzheVar = zzexVar.zzc;
        if (zzheVar != zzhe.zzc()) {
            return zzheVar;
        }
        zzhe zzf = zzhe.zzf();
        zzexVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzex) obj).zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzhe.zzc().equals(obj2)) {
            return obj;
        }
        if (zzhe.zzc().equals(obj)) {
            return zzhe.zze((zzhe) obj, (zzhe) obj2);
        }
        ((zzhe) obj).zzd((zzhe) obj2);
        return obj;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i2, long j2) {
        ((zzhe) obj).zzj(i2 << 3, Long.valueOf(j2));
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final void zzg(Object obj) {
        ((zzex) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* synthetic */ void zzh(Object obj, Object obj2) {
        ((zzex) obj).zzc = (zzhe) obj2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzhd
    public final /* synthetic */ void zzi(Object obj, zzhv zzhvVar) throws IOException {
        ((zzhe) obj).zzk(zzhvVar);
    }
}
