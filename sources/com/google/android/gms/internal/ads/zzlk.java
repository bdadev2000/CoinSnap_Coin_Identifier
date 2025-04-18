package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlk {
    private static final zzuy zzu = new zzuy(new Object(), -1);
    public final zzcc zza;
    public final zzuy zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzij zzf;
    public final boolean zzg;
    public final zzwy zzh;
    public final zzys zzi;
    public final List zzj;
    public final zzuy zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbq zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlk(zzcc zzccVar, zzuy zzuyVar, long j2, long j3, int i2, @Nullable zzij zzijVar, boolean z2, zzwy zzwyVar, zzys zzysVar, List list, zzuy zzuyVar2, boolean z3, int i3, int i4, zzbq zzbqVar, long j4, long j5, long j6, long j7, boolean z4) {
        this.zza = zzccVar;
        this.zzb = zzuyVar;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = i2;
        this.zzf = zzijVar;
        this.zzg = z2;
        this.zzh = zzwyVar;
        this.zzi = zzysVar;
        this.zzj = list;
        this.zzk = zzuyVar2;
        this.zzl = z3;
        this.zzm = i3;
        this.zzn = i4;
        this.zzo = zzbqVar;
        this.zzq = j4;
        this.zzr = j5;
        this.zzs = j6;
        this.zzt = j7;
    }

    public static zzlk zzg(zzys zzysVar) {
        zzcc zzccVar = zzcc.zza;
        zzuy zzuyVar = zzu;
        return new zzlk(zzccVar, zzuyVar, -9223372036854775807L, 0L, 1, null, false, zzwy.zza, zzysVar, zzgax.zzn(), zzuyVar, false, 1, 0, zzbq.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzuy zzh() {
        return zzu;
    }

    @CheckResult
    public final zzlk zza(zzuy zzuyVar) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzuyVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlk zzb(zzuy zzuyVar, long j2, long j3, long j4, long j5, zzwy zzwyVar, zzys zzysVar, List list) {
        zzuy zzuyVar2 = this.zzk;
        boolean z2 = this.zzl;
        int i2 = this.zzm;
        int i3 = this.zzn;
        zzbq zzbqVar = this.zzo;
        long j6 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzlk(this.zza, zzuyVar, j3, j4, this.zze, this.zzf, this.zzg, zzwyVar, zzysVar, list, zzuyVar2, z2, i2, i3, zzbqVar, j6, j5, j2, elapsedRealtime, false);
    }

    @CheckResult
    public final zzlk zzc(boolean z2, int i2, int i3) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z2, i2, i3, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlk zzd(@Nullable zzij zzijVar) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzijVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlk zze(int i2) {
        return new zzlk(this.zza, this.zzb, this.zzc, this.zzd, i2, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlk zzf(zzcc zzccVar) {
        return new zzlk(zzccVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
