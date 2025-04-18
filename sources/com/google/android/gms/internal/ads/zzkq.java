package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkq {
    public final zzup zza;
    public final Object zzb;
    public final zzwg[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkr zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlq[] zzi;
    private final zzyj zzj;
    private final zzlf zzk;

    @Nullable
    private zzkq zzl;
    private zzwr zzm;
    private zzyk zzn;
    private long zzo;

    public zzkq(zzlq[] zzlqVarArr, long j3, zzyj zzyjVar, zzys zzysVar, zzlf zzlfVar, zzkr zzkrVar, zzyk zzykVar) {
        this.zzi = zzlqVarArr;
        this.zzo = j3;
        this.zzj = zzyjVar;
        this.zzk = zzlfVar;
        zzur zzurVar = zzkrVar.zza;
        this.zzb = zzurVar.zza;
        this.zzf = zzkrVar;
        this.zzm = zzwr.zza;
        this.zzn = zzykVar;
        this.zzc = new zzwg[2];
        this.zzh = new boolean[2];
        long j10 = zzkrVar.zzb;
        long j11 = zzkrVar.zzd;
        zzup zzp = zzlfVar.zzp(zzurVar, zzysVar, j10);
        this.zza = j11 != C.TIME_UNSET ? new zztv(zzp, true, 0L, j11) : zzp;
    }

    private final void zzs() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzyk zzykVar = this.zzn;
                if (i10 < zzykVar.zza) {
                    zzykVar.zzb(i10);
                    zzyd zzydVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final void zzt() {
        if (zzu()) {
            int i10 = 0;
            while (true) {
                zzyk zzykVar = this.zzn;
                if (i10 < zzykVar.zza) {
                    zzykVar.zzb(i10);
                    zzyd zzydVar = this.zzn.zzc[i10];
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzyk zzykVar, long j3, boolean z10) {
        return zzb(zzykVar, j3, false, new boolean[2]);
    }

    public final long zzb(zzyk zzykVar, long j3, boolean z10, boolean[] zArr) {
        boolean z11;
        int i10 = 0;
        while (true) {
            boolean z12 = true;
            if (i10 >= zzykVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z10 || !zzykVar.zza(this.zzn, i10)) {
                z12 = false;
            }
            zArr2[i10] = z12;
            i10++;
        }
        int i11 = 0;
        while (true) {
            zzlq[] zzlqVarArr = this.zzi;
            if (i11 >= 2) {
                break;
            }
            zzlqVarArr[i11].zzb();
            i11++;
        }
        zzs();
        this.zzn = zzykVar;
        zzt();
        long zzf = this.zza.zzf(zzykVar.zzc, this.zzh, this.zzc, zArr, j3);
        int i12 = 0;
        while (true) {
            zzlq[] zzlqVarArr2 = this.zzi;
            if (i12 >= 2) {
                break;
            }
            zzlqVarArr2[i12].zzb();
            i12++;
        }
        this.zze = false;
        int i13 = 0;
        while (true) {
            zzwg[] zzwgVarArr = this.zzc;
            if (i13 < 2) {
                if (zzwgVarArr[i13] != null) {
                    zzdb.zzf(zzykVar.zzb(i13));
                    this.zzi[i13].zzb();
                    this.zze = true;
                } else {
                    if (zzykVar.zzc[i13] == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzdb.zzf(z11);
                }
                i13++;
            } else {
                return zzf;
            }
        }
    }

    public final long zzc() {
        long j3;
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        if (this.zze) {
            j3 = this.zza.zzb();
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == Long.MIN_VALUE) {
            return this.zzf.zze;
        }
        return j3;
    }

    public final long zzd() {
        if (this.zzd) {
            return this.zza.zzc();
        }
        return 0L;
    }

    public final long zze() {
        return this.zzo;
    }

    public final long zzf() {
        return this.zzf.zzb + this.zzo;
    }

    @Nullable
    public final zzkq zzg() {
        return this.zzl;
    }

    public final zzwr zzh() {
        return this.zzm;
    }

    public final zzyk zzi() {
        return this.zzn;
    }

    public final zzyk zzj(float f10, zzbv zzbvVar) throws zzig {
        zzyk zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzbvVar);
        for (int i10 = 0; i10 < zzo.zza; i10++) {
            boolean z10 = true;
            if (zzo.zzb(i10)) {
                if (zzo.zzc[i10] == null) {
                    this.zzi[i10].zzb();
                    z10 = false;
                }
                zzdb.zzf(z10);
            } else {
                if (zzo.zzc[i10] != null) {
                    z10 = false;
                }
                zzdb.zzf(z10);
            }
        }
        for (zzyd zzydVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j3, float f10, long j10) {
        zzdb.zzf(zzu());
        long j11 = j3 - this.zzo;
        zzkm zzkmVar = new zzkm();
        zzkmVar.zze(j11);
        zzkmVar.zzf(f10);
        zzkmVar.zzd(j10);
        this.zza.zzo(new zzko(zzkmVar, null));
    }

    public final void zzl(float f10, zzbv zzbvVar) throws zzig {
        this.zzd = true;
        this.zzm = this.zza.zzh();
        zzyk zzj = zzj(f10, zzbvVar);
        zzkr zzkrVar = this.zzf;
        long j3 = zzkrVar.zzb;
        long j10 = zzkrVar.zze;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            j3 = Math.max(0L, j10 - 1);
        }
        long zza = zza(zzj, j3, false);
        long j11 = this.zzo;
        zzkr zzkrVar2 = this.zzf;
        this.zzo = (zzkrVar2.zzb - zza) + j11;
        this.zzf = zzkrVar2.zzb(zza);
    }

    public final void zzm(long j3) {
        zzdb.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j3 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzup zzupVar = this.zza;
        try {
            boolean z10 = zzupVar instanceof zztv;
            zzlf zzlfVar = this.zzk;
            if (z10) {
                zzlfVar.zzi(((zztv) zzupVar).zza);
            } else {
                zzlfVar.zzi(zzupVar);
            }
        } catch (RuntimeException e2) {
            zzdt.zzd("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public final void zzo(@Nullable zzkq zzkqVar) {
        if (zzkqVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkqVar;
        zzt();
    }

    public final void zzp(long j3) {
        this.zzo = j3;
    }

    public final void zzq() {
        zzup zzupVar = this.zza;
        if (zzupVar instanceof zztv) {
            long j3 = this.zzf.zzd;
            if (j3 == C.TIME_UNSET) {
                j3 = Long.MIN_VALUE;
            }
            ((zztv) zzupVar).zzn(0L, j3);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
