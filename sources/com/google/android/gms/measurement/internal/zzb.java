package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;
import x.l;

/* loaded from: classes2.dex */
public final class zzb extends zzf {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    /* JADX WARN: Type inference failed for: r1v1, types: [x.l, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Long>, x.l] */
    public zzb(zzhj zzhjVar) {
        super(zzhjVar);
        this.zzb = new l();
        this.zza = new l();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzax zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfq zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzfp zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzfr zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzfw zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zzgh zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ zzhc zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zziv zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzks zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzkx zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final /* bridge */ /* synthetic */ zzmh zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ zznp zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzf, com.google.android.gms.measurement.internal.zzij
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public static /* synthetic */ void zzb(zzb zzbVar, String str, long j7) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        Integer num = zzbVar.zzb.get(str);
        if (num != null) {
            zzkp zza = zzbVar.zzn().zza(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzbVar.zzb.remove(str);
                Long l = zzbVar.zza.get(str);
                if (l == null) {
                    zzbVar.zzj().zzg().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = j7 - l.longValue();
                    zzbVar.zza.remove(str);
                    zzbVar.zza(str, longValue, zza);
                }
                if (zzbVar.zzb.isEmpty()) {
                    long j9 = zzbVar.zzc;
                    if (j9 == 0) {
                        zzbVar.zzj().zzg().zza("First ad exposure time was never set");
                        return;
                    } else {
                        zzbVar.zza(j7 - j9, zza);
                        zzbVar.zzc = 0L;
                        return;
                    }
                }
                return;
            }
            zzbVar.zzb.put(str, Integer.valueOf(intValue));
            return;
        }
        zzbVar.zzj().zzg().zza("Call to endAdUnitExposure for unknown ad unit id", str);
    }

    @Override // com.google.android.gms.measurement.internal.zzij, com.google.android.gms.measurement.internal.zzil
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ void zza(zzb zzbVar, String str, long j7) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        if (zzbVar.zzb.isEmpty()) {
            zzbVar.zzc = j7;
        }
        Integer num = zzbVar.zzb.get(str);
        if (num != null) {
            zzbVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzbVar.zzb.size() >= 100) {
            zzbVar.zzj().zzu().zza("Too many ads visible");
        } else {
            zzbVar.zzb.put(str, 1);
            zzbVar.zza.put(str, Long.valueOf(j7));
        }
    }

    public final void zza(String str, long j7) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zza(this, str, j7));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    private final void zza(long j7, zzkp zzkpVar) {
        if (zzkpVar == null) {
            zzj().zzp().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            zzj().zzp().zza("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j7);
        zznp.zza(zzkpVar, bundle, true);
        zzm().zzc("am", "_xa", bundle);
    }

    public final void zzb(String str, long j7) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zzd(this, str, j7));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    private final void zza(String str, long j7, zzkp zzkpVar) {
        if (zzkpVar == null) {
            zzj().zzp().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j7 < 1000) {
            zzj().zzp().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j7));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j7);
        zznp.zza(zzkpVar, bundle, true);
        zzm().zzc("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j7) {
        Iterator<String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put(it.next(), Long.valueOf(j7));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j7;
    }

    public final void zza(long j7) {
        zzkp zza = zzn().zza(false);
        for (String str : this.zza.keySet()) {
            zza(str, j7 - this.zza.get(str).longValue(), zza);
        }
        if (!this.zza.isEmpty()) {
            zza(j7 - this.zzc, zza);
        }
        zzb(j7);
    }
}
