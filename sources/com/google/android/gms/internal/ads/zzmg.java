package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmg {
    private static final zzvo zzt = new zzvo(new Object(), -1);
    public final zzdc zza;
    public final zzvo zzb;
    public final long zzc;
    public final long zzd;
    public final int zze;

    @Nullable
    public final zzjh zzf;
    public final boolean zzg;
    public final zzxr zzh;
    public final zzzn zzi;
    public final List zzj;
    public final zzvo zzk;
    public final boolean zzl;
    public final int zzm;
    public final zzcl zzn;
    public final boolean zzo = false;
    public volatile long zzp;
    public volatile long zzq;
    public volatile long zzr;
    public volatile long zzs;

    public zzmg(zzdc zzdcVar, zzvo zzvoVar, long j7, long j9, int i9, @Nullable zzjh zzjhVar, boolean z8, zzxr zzxrVar, zzzn zzznVar, List list, zzvo zzvoVar2, boolean z9, int i10, zzcl zzclVar, long j10, long j11, long j12, long j13, boolean z10) {
        this.zza = zzdcVar;
        this.zzb = zzvoVar;
        this.zzc = j7;
        this.zzd = j9;
        this.zze = i9;
        this.zzf = zzjhVar;
        this.zzg = z8;
        this.zzh = zzxrVar;
        this.zzi = zzznVar;
        this.zzj = list;
        this.zzk = zzvoVar2;
        this.zzl = z9;
        this.zzm = i10;
        this.zzn = zzclVar;
        this.zzp = j10;
        this.zzq = j11;
        this.zzr = j12;
        this.zzs = j13;
    }

    public static zzmg zzg(zzzn zzznVar) {
        zzdc zzdcVar = zzdc.zza;
        zzvo zzvoVar = zzt;
        return new zzmg(zzdcVar, zzvoVar, C.TIME_UNSET, 0L, 1, null, false, zzxr.zza, zzznVar, zzgbc.zzm(), zzvoVar, false, 0, zzcl.zza, 0L, 0L, 0L, 0L, false);
    }

    public static zzvo zzh() {
        return zzt;
    }

    @CheckResult
    public final zzmg zza(zzvo zzvoVar) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, zzvoVar, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    @CheckResult
    public final zzmg zzb(zzvo zzvoVar, long j7, long j9, long j10, long j11, zzxr zzxrVar, zzzn zzznVar, List list) {
        zzvo zzvoVar2 = this.zzk;
        boolean z8 = this.zzl;
        int i9 = this.zzm;
        zzcl zzclVar = this.zzn;
        long j12 = this.zzp;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        return new zzmg(this.zza, zzvoVar, j9, j10, this.zze, this.zzf, this.zzg, zzxrVar, zzznVar, list, zzvoVar2, z8, i9, zzclVar, j12, j11, j7, elapsedRealtime, false);
    }

    @CheckResult
    public final zzmg zzc(boolean z8, int i9) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, z8, i9, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    @CheckResult
    public final zzmg zzd(@Nullable zzjh zzjhVar) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, this.zze, zzjhVar, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    @CheckResult
    public final zzmg zze(int i9) {
        return new zzmg(this.zza, this.zzb, this.zzc, this.zzd, i9, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    @CheckResult
    public final zzmg zzf(zzdc zzdcVar) {
        return new zzmg(zzdcVar, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzq, this.zzr, this.zzs, false);
    }

    public final boolean zzi() {
        return this.zze == 3 && this.zzl && this.zzm == 0;
    }
}
