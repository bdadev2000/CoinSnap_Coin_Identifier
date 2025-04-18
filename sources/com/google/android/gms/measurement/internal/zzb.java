package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.Iterator;
import java.util.Map;
import r.b;

/* loaded from: classes3.dex */
public final class zzb extends zze {
    private final Map<String, Long> zza;
    private final Map<String, Integer> zzb;
    private long zzc;

    public zzb(zzhy zzhyVar) {
        super(zzhyVar);
        this.zzb = new b();
        this.zza = new b();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzb zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzab zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzag zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzaz zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzgf zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzgh zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzjq zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzlj zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zze
    public final /* bridge */ /* synthetic */ zznb zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ zzos zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zze, com.google.android.gms.measurement.internal.zzja
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public static /* synthetic */ void zzb(zzb zzbVar, String str, long j3) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        Integer num = zzbVar.zzb.get(str);
        if (num != null) {
            zzlk zza = zzbVar.zzn().zza(false);
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zzbVar.zzb.remove(str);
                Long l10 = zzbVar.zza.get(str);
                if (l10 == null) {
                    zzbVar.zzj().zzg().zza("First ad unit exposure time was never set");
                } else {
                    long longValue = j3 - l10.longValue();
                    zzbVar.zza.remove(str);
                    zzbVar.zza(str, longValue, zza);
                }
                if (zzbVar.zzb.isEmpty()) {
                    long j10 = zzbVar.zzc;
                    if (j10 == 0) {
                        zzbVar.zzj().zzg().zza("First ad exposure time was never set");
                        return;
                    } else {
                        zzbVar.zza(j3 - j10, zza);
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

    @Override // com.google.android.gms.measurement.internal.zzja, com.google.android.gms.measurement.internal.zzjc
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ void zza(zzb zzbVar, String str, long j3) {
        zzbVar.zzt();
        Preconditions.checkNotEmpty(str);
        if (zzbVar.zzb.isEmpty()) {
            zzbVar.zzc = j3;
        }
        Integer num = zzbVar.zzb.get(str);
        if (num != null) {
            zzbVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzbVar.zzb.size() >= 100) {
            zzbVar.zzj().zzu().zza("Too many ads visible");
        } else {
            zzbVar.zzb.put(str, 1);
            zzbVar.zza.put(str, Long.valueOf(j3));
        }
    }

    public final void zza(String str, long j3) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zza(this, str, j3));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    private final void zza(long j3, zzlk zzlkVar) {
        if (zzlkVar == null) {
            zzj().zzp().zza("Not logging ad exposure. No active activity");
            return;
        }
        if (j3 < 1000) {
            zzj().zzp().zza("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j3));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j3);
        zzos.zza(zzlkVar, bundle, true);
        zzm().zzc("am", "_xa", bundle);
    }

    public final void zzb(String str, long j3) {
        if (str != null && str.length() != 0) {
            zzl().zzb(new zzd(this, str, j3));
        } else {
            zzj().zzg().zza("Ad unit id must be a non-empty string");
        }
    }

    private final void zza(String str, long j3, zzlk zzlkVar) {
        if (zzlkVar == null) {
            zzj().zzp().zza("Not logging ad unit exposure. No active activity");
            return;
        }
        if (j3 < 1000) {
            zzj().zzp().zza("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j3));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j3);
        zzos.zza(zzlkVar, bundle, true);
        zzm().zzc("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(long j3) {
        Iterator<String> it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put(it.next(), Long.valueOf(j3));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j3;
    }

    public final void zza(long j3) {
        zzlk zza = zzn().zza(false);
        for (String str : this.zza.keySet()) {
            zza(str, j3 - this.zza.get(str).longValue(), zza);
        }
        if (!this.zza.isEmpty()) {
            zza(j3 - this.zzc, zza);
        }
        zzb(j3);
    }
}
