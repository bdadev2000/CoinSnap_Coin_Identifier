package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzlg {
    private static final zzur zzu = new zzur(new Object(), -1);
    public final zzbv zza;
    public final zzur zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzig zzf;
    public final boolean zzg;
    public final zzwr zzh;
    public final zzyk zzi;
    public final List zzj;
    public final zzur zzk;
    public final boolean zzl;
    public final int zzm;
    public final int zzn;
    public final zzbj zzo;
    public final boolean zzp = false;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;
    public volatile long zzt;

    public zzlg(zzbv zzbvVar, zzur zzurVar, long j3, long j10, int i10, @Nullable zzig zzigVar, boolean z10, zzwr zzwrVar, zzyk zzykVar, List list, zzur zzurVar2, boolean z11, int i11, int i12, zzbj zzbjVar, long j11, long j12, long j13, long j14, boolean z12) {
        this.zza = zzbvVar;
        this.zzb = zzurVar;
        this.zzc = j3;
        this.zzd = j10;
        this.zze = i10;
        this.zzf = zzigVar;
        this.zzg = z10;
        this.zzh = zzwrVar;
        this.zzi = zzykVar;
        this.zzj = list;
        this.zzk = zzurVar2;
        this.zzl = z11;
        this.zzm = i11;
        this.zzn = i12;
        this.zzo = zzbjVar;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
        this.zzt = j14;
    }

    public static zzlg zzg(zzyk zzykVar) {
        zzbv zzbvVar = zzbv.zza;
        zzur zzurVar = zzu;
        return new zzlg(zzbvVar, zzurVar, C.TIME_UNSET, 0L, 1, null, false, zzwr.zza, zzykVar, zzfzo.zzn(), zzurVar, false, 1, 0, zzbj.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzur zzh() {
        return zzu;
    }

    @CheckResult
    public final zzlg zza(zzur zzurVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzurVar, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlg zzb(zzur zzurVar, long j3, long j10, long j11, long j12, zzwr zzwrVar, zzyk zzykVar, List list) {
        zzur zzurVar2 = this.zzk;
        boolean z10 = this.zzl;
        int i10 = this.zzm;
        int i11 = this.zzn;
        zzbj zzbjVar = this.zzo;
        long j13 = this.zzq;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzlg(this.zza, zzurVar, j10, j11, this.zze, this.zzf, this.zzg, zzwrVar, zzykVar, list, zzurVar2, z10, i10, i11, zzbjVar, j13, j12, j3, elapsedRealtime, false);
    }

    @CheckResult
    public final zzlg zzc(boolean z10, int i10, int i11) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z10, i10, i11, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlg zzd(@Nullable zzig zzigVar) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzigVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlg zze(int i10) {
        return new zzlg(this.zza, this.zzb, this.zzc, this.zzd, i10, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    @CheckResult
    public final zzlg zzf(zzbv zzbvVar) {
        return new zzlg(zzbvVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzn == 0;
    }
}
