package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzabw {
    private final zzabv zza;
    private final zzabq zzb;

    @Nullable
    private zzdv zzg;
    private long zzi;
    private final zzabo zzc = new zzabo();
    private final zzga zzd = new zzga(10);
    private final zzga zze = new zzga(10);
    private final zzfm zzf = new zzfm(16);
    private zzdv zzh = zzdv.zza;
    private long zzj = C.TIME_UNSET;

    public zzabw(zzabv zzabvVar, zzabq zzabqVar) {
        this.zza = zzabvVar;
        this.zzb = zzabqVar;
    }

    private static Object zzf(zzga zzgaVar) {
        boolean z8;
        if (zzgaVar.zza() > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        while (zzgaVar.zza() > 1) {
            zzgaVar.zzb();
        }
        Object zzb = zzgaVar.zzb();
        zzb.getClass();
        return zzb;
    }

    public final void zza() {
        this.zzf.zzc();
        this.zzj = C.TIME_UNSET;
        zzga zzgaVar = this.zze;
        if (zzgaVar.zza() > 0) {
            Long l = (Long) zzf(zzgaVar);
            l.longValue();
            this.zze.zzd(0L, l);
        }
        if (this.zzg == null) {
            zzga zzgaVar2 = this.zzd;
            if (zzgaVar2.zza() > 0) {
                this.zzg = (zzdv) zzf(zzgaVar2);
                return;
            }
            return;
        }
        this.zzd.zze();
    }

    public final void zzb(long j7, long j9) {
        this.zze.zzd(j7, Long.valueOf(j9));
    }

    public final void zzc(long j7, long j9) throws zzjh {
        long zzd;
        while (true) {
            zzfm zzfmVar = this.zzf;
            if (!zzfmVar.zzd()) {
                zzga zzgaVar = this.zze;
                long zza = zzfmVar.zza();
                Long l = (Long) zzgaVar.zzc(zza);
                if (l != null && l.longValue() != this.zzi) {
                    this.zzi = l.longValue();
                    this.zzb.zzf();
                }
                int zza2 = this.zzb.zza(zza, j7, j9, this.zzi, false, this.zzc);
                if (zza2 != 0 && zza2 != 1) {
                    if (zza2 == 2 || zza2 == 3 || zza2 == 4) {
                        this.zzj = zza;
                        this.zzf.zzb();
                        this.zza.zzl();
                    } else {
                        return;
                    }
                } else {
                    this.zzj = zza;
                    long zzb = this.zzf.zzb();
                    zzdv zzdvVar = (zzdv) this.zzd.zzc(zzb);
                    if (zzdvVar != null && !zzdvVar.equals(zzdv.zza) && !zzdvVar.equals(this.zzh)) {
                        this.zzh = zzdvVar;
                        this.zza.zzm(zzdvVar);
                    }
                    if (zza2 == 0) {
                        zzd = -1;
                    } else {
                        zzd = this.zzc.zzd();
                    }
                    this.zza.zzp(zzd, zzb, this.zzi, this.zzb.zzp());
                }
            } else {
                return;
            }
        }
    }

    public final void zzd(float f9) {
        boolean z8;
        if (f9 > 0.0f) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zzd(z8);
        this.zzb.zzn(f9);
    }

    public final boolean zze(long j7) {
        long j9 = this.zzj;
        return j9 != C.TIME_UNSET && j9 >= j7;
    }
}
