package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlq {
    public final zzvm zza;
    public final Object zzb;
    public final zzxf[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzlr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzmp[] zzi;
    private final zzzm zzj;
    private final zzmf zzk;

    @Nullable
    private zzlq zzl;
    private zzxr zzm;
    private zzzn zzn;
    private long zzo;

    public zzlq(zzmp[] zzmpVarArr, long j7, zzzm zzzmVar, zzzv zzzvVar, zzmf zzmfVar, zzlr zzlrVar, zzzn zzznVar) {
        this.zzi = zzmpVarArr;
        this.zzo = j7;
        this.zzj = zzzmVar;
        this.zzk = zzmfVar;
        zzvo zzvoVar = zzlrVar.zza;
        this.zzb = zzvoVar.zza;
        this.zzf = zzlrVar;
        this.zzm = zzxr.zza;
        this.zzn = zzznVar;
        this.zzc = new zzxf[2];
        this.zzh = new boolean[2];
        long j9 = zzlrVar.zzb;
        long j10 = zzlrVar.zzd;
        zzvm zzp = zzmfVar.zzp(zzvoVar, zzzvVar, j9);
        this.zza = j10 != C.TIME_UNSET ? new zzus(zzp, true, 0L, j10) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i9 = 0;
            while (true) {
                zzzn zzznVar = this.zzn;
                if (i9 < zzznVar.zza) {
                    zzznVar.zzb(i9);
                    zzzg zzzgVar = this.zzn.zzc[i9];
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i9 = 0;
            while (true) {
                zzzn zzznVar = this.zzn;
                if (i9 < zzznVar.zza) {
                    zzznVar.zzb(i9);
                    zzzg zzzgVar = this.zzn.zzc[i9];
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzzn zzznVar, long j7, boolean z8) {
        return zzb(zzznVar, j7, false, new boolean[2]);
    }

    public final long zzb(zzzn zzznVar, long j7, boolean z8, boolean[] zArr) {
        boolean z9;
        int i9 = 0;
        while (true) {
            boolean z10 = true;
            if (i9 >= zzznVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z8 || !zzznVar.zza(this.zzn, i9)) {
                z10 = false;
            }
            zArr2[i9] = z10;
            i9++;
        }
        int i10 = 0;
        while (true) {
            zzmp[] zzmpVarArr = this.zzi;
            if (i10 >= 2) {
                break;
            }
            zzmpVarArr[i10].zzb();
            i10++;
        }
        zzs();
        this.zzn = zzznVar;
        zzt();
        long zzf = this.zza.zzf(zzznVar.zzc, this.zzh, this.zzc, zArr, j7);
        int i11 = 0;
        while (true) {
            zzmp[] zzmpVarArr2 = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzmpVarArr2[i11].zzb();
            i11++;
        }
        this.zze = false;
        int i12 = 0;
        while (true) {
            zzxf[] zzxfVarArr = this.zzc;
            if (i12 < 2) {
                if (zzxfVarArr[i12] != null) {
                    zzeq.zzf(zzznVar.zzb(i12));
                    this.zzi[i12].zzb();
                    this.zze = true;
                } else {
                    if (zzznVar.zzc[i12] == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    zzeq.zzf(z9);
                }
                i12++;
            } else {
                return zzf;
            }
        }
    }

    public final long zzc() {
        long j7;
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        if (this.zze) {
            j7 = this.zza.zzb();
        } else {
            j7 = Long.MIN_VALUE;
        }
        if (j7 == Long.MIN_VALUE) {
            return this.zzf.zze;
        }
        return j7;
    }

    public final long zzd() {
        if (!this.zzd) {
            return 0L;
        }
        return this.zza.zzc();
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    @Nullable
    public final zzlq zzg() {
        return this.zzl;
    }

    public final zzxr zzh() {
        return this.zzm;
    }

    public final zzzn zzi() {
        return this.zzn;
    }

    public final zzzn zzj(float f9, zzdc zzdcVar) throws zzjh {
        zzzn zzp = this.zzj.zzp(this.zzi, this.zzm, this.zzf.zza, zzdcVar);
        for (zzzg zzzgVar : zzp.zzc) {
        }
        return zzp;
    }

    public final void zzk(long j7, float f9, long j9) {
        zzeq.zzf(zzu());
        long j10 = j7 - this.zzo;
        zzlm zzlmVar = new zzlm();
        zzlmVar.zze(j10);
        zzlmVar.zzf(f9);
        zzlmVar.zzd(j9);
        this.zza.zzo(new zzlo(zzlmVar, null));
    }

    public final void zzl(float f9, zzdc zzdcVar) throws zzjh {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzzn zzj = zzj(f9, zzdcVar);
        zzlr zzlrVar = this.zzf;
        long j7 = zzlrVar.zzb;
        long j9 = zzlrVar.zze;
        if (j9 != C.TIME_UNSET && j7 >= j9) {
            j7 = Math.max(0L, j9 - 1);
        }
        long zza = zza(zzj, j7, false);
        long j10 = this.zzo;
        zzlr zzlrVar2 = this.zzf;
        this.zzo = (zzlrVar2.zzb - zza) + j10;
        this.zzf = zzlrVar2.zzb(zza);
    }

    public final void zzm(long j7) {
        zzeq.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j7 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzvm zzvmVar = this.zza;
        try {
            boolean z8 = zzvmVar instanceof zzus;
            zzmf zzmfVar = this.zzk;
            if (z8) {
                zzmfVar.zzi(((zzus) zzvmVar).zza);
            } else {
                zzmfVar.zzi(zzvmVar);
            }
        } catch (RuntimeException e4) {
            zzfk.zzd("MediaPeriodHolder", "Period release failed.", e4);
        }
    }

    public final void zzo(@Nullable zzlq zzlqVar) {
        if (zzlqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzlqVar;
        zzt();
    }

    public final void zzp(long j7) {
        this.zzo = 1000000000000L;
    }

    public final void zzq() {
        zzvm zzvmVar = this.zza;
        if (zzvmVar instanceof zzus) {
            long j7 = this.zzf.zzd;
            if (j7 == C.TIME_UNSET) {
                j7 = Long.MIN_VALUE;
            }
            ((zzus) zzvmVar).zzn(0L, j7);
        }
    }

    public final boolean zzr() {
        if (!this.zzd) {
            return false;
        }
        if (this.zze && this.zza.zzb() != Long.MIN_VALUE) {
            return false;
        }
        return true;
    }
}
