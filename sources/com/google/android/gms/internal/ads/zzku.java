package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzku {
    public final zzuw zza;
    public final Object zzb;
    public final zzwn[] zzc;
    public boolean zzd;
    public boolean zze;
    public zzkv zzf;
    public boolean zzg;
    private final boolean[] zzh;
    private final zzlu[] zzi;
    private final zzyr zzj;
    private final zzlj zzk;

    @Nullable
    private zzku zzl;
    private zzwy zzm;
    private zzys zzn;
    private long zzo;

    public zzku(zzlu[] zzluVarArr, long j2, zzyr zzyrVar, zzza zzzaVar, zzlj zzljVar, zzkv zzkvVar, zzys zzysVar) {
        this.zzi = zzluVarArr;
        this.zzo = j2;
        this.zzj = zzyrVar;
        this.zzk = zzljVar;
        zzuy zzuyVar = zzkvVar.zza;
        this.zzb = zzuyVar.zza;
        this.zzf = zzkvVar;
        this.zzm = zzwy.zza;
        this.zzn = zzysVar;
        this.zzc = new zzwn[2];
        this.zzh = new boolean[2];
        long j3 = zzkvVar.zzb;
        long j4 = zzkvVar.zzd;
        zzuw zzp = zzljVar.zzp(zzuyVar, zzzaVar, j3);
        this.zza = j4 != -9223372036854775807L ? new zzuc(zzp, true, 0L, j4) : zzp;
    }

    private final void zzs() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzys zzysVar = this.zzn;
            if (i2 >= zzysVar.zza) {
                return;
            }
            zzysVar.zzb(i2);
            zzyl zzylVar = this.zzn.zzc[i2];
            i2++;
        }
    }

    private final void zzt() {
        if (!zzu()) {
            return;
        }
        int i2 = 0;
        while (true) {
            zzys zzysVar = this.zzn;
            if (i2 >= zzysVar.zza) {
                return;
            }
            zzysVar.zzb(i2);
            zzyl zzylVar = this.zzn.zzc[i2];
            i2++;
        }
    }

    private final boolean zzu() {
        return this.zzl == null;
    }

    public final long zza(zzys zzysVar, long j2, boolean z2) {
        return zzb(zzysVar, j2, false, new boolean[2]);
    }

    public final long zzb(zzys zzysVar, long j2, boolean z2, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z3 = true;
            if (i2 >= zzysVar.zza) {
                break;
            }
            boolean[] zArr2 = this.zzh;
            if (z2 || !zzysVar.zza(this.zzn, i2)) {
                z3 = false;
            }
            zArr2[i2] = z3;
            i2++;
        }
        int i3 = 0;
        while (true) {
            zzlu[] zzluVarArr = this.zzi;
            if (i3 >= 2) {
                break;
            }
            zzluVarArr[i3].zzb();
            i3++;
        }
        zzs();
        this.zzn = zzysVar;
        zzt();
        long zzg = this.zza.zzg(zzysVar.zzc, this.zzh, this.zzc, zArr, j2);
        int i4 = 0;
        while (true) {
            zzlu[] zzluVarArr2 = this.zzi;
            if (i4 >= 2) {
                break;
            }
            zzluVarArr2[i4].zzb();
            i4++;
        }
        this.zze = false;
        int i5 = 0;
        while (true) {
            zzwn[] zzwnVarArr = this.zzc;
            if (i5 >= 2) {
                return zzg;
            }
            if (zzwnVarArr[i5] != null) {
                zzdi.zzf(zzysVar.zzb(i5));
                this.zzi[i5].zzb();
                this.zze = true;
            } else {
                zzdi.zzf(zzysVar.zzc[i5] == null);
            }
            i5++;
        }
    }

    public final long zzc() {
        if (!this.zzd) {
            return this.zzf.zzb;
        }
        long zzb = this.zze ? this.zza.zzb() : Long.MIN_VALUE;
        return zzb == Long.MIN_VALUE ? this.zzf.zze : zzb;
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
    public final zzku zzg() {
        return this.zzl;
    }

    public final zzwy zzh() {
        return this.zzm;
    }

    public final zzys zzi() {
        return this.zzn;
    }

    public final zzys zzj(float f2, zzcc zzccVar) throws zzij {
        zzys zzo = this.zzj.zzo(this.zzi, this.zzm, this.zzf.zza, zzccVar);
        for (int i2 = 0; i2 < zzo.zza; i2++) {
            if (zzo.zzb(i2)) {
                if (zzo.zzc[i2] == null) {
                    this.zzi[i2].zzb();
                    r2 = false;
                }
                zzdi.zzf(r2);
            } else {
                zzdi.zzf(zzo.zzc[i2] == null);
            }
        }
        for (zzyl zzylVar : zzo.zzc) {
        }
        return zzo;
    }

    public final void zzk(long j2, float f2, long j3) {
        zzdi.zzf(zzu());
        long j4 = j2 - this.zzo;
        zzkq zzkqVar = new zzkq();
        zzkqVar.zze(j4);
        zzkqVar.zzf(f2);
        zzkqVar.zzd(j3);
        this.zza.zzo(new zzks(zzkqVar, null));
    }

    public final void zzl(float f2, zzcc zzccVar) throws zzij {
        this.zzd = true;
        this.zzm = this.zza.zzi();
        zzys zzj = zzj(f2, zzccVar);
        zzkv zzkvVar = this.zzf;
        long j2 = zzkvVar.zzb;
        long j3 = zzkvVar.zze;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        long zza = zza(zzj, j2, false);
        long j4 = this.zzo;
        zzkv zzkvVar2 = this.zzf;
        this.zzo = (zzkvVar2.zzb - zza) + j4;
        this.zzf = zzkvVar2.zzb(zza);
    }

    public final void zzm(long j2) {
        zzdi.zzf(zzu());
        if (this.zzd) {
            this.zza.zzm(j2 - this.zzo);
        }
    }

    public final void zzn() {
        zzs();
        zzuw zzuwVar = this.zza;
        try {
            boolean z2 = zzuwVar instanceof zzuc;
            zzlj zzljVar = this.zzk;
            if (z2) {
                zzljVar.zzi(((zzuc) zzuwVar).zza);
            } else {
                zzljVar.zzi(zzuwVar);
            }
        } catch (RuntimeException e) {
            zzea.zzd("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void zzo(@Nullable zzku zzkuVar) {
        if (zzkuVar == this.zzl) {
            return;
        }
        zzs();
        this.zzl = zzkuVar;
        zzt();
    }

    public final void zzp(long j2) {
        this.zzo = j2;
    }

    public final void zzq() {
        zzuw zzuwVar = this.zza;
        if (zzuwVar instanceof zzuc) {
            long j2 = this.zzf.zzd;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((zzuc) zzuwVar).zzn(0L, j2);
        }
    }

    public final boolean zzr() {
        if (this.zzd) {
            return !this.zze || this.zza.zzb() == Long.MIN_VALUE;
        }
        return false;
    }
}
