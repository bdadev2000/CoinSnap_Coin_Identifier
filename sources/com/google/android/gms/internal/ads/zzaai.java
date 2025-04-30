package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class zzaai {
    public static final zzaac zza = new zzaac(0, C.TIME_UNSET, null);
    public static final zzaac zzb = new zzaac(1, C.TIME_UNSET, null);
    public static final zzaac zzc = new zzaac(2, C.TIME_UNSET, null);
    public static final zzaac zzd = new zzaac(3, C.TIME_UNSET, null);
    private final ExecutorService zze = zzgd.zzE("ExoPlayer:Loader:ProgressiveMediaPeriod");

    @Nullable
    private zzaad zzf;

    @Nullable
    private IOException zzg;

    public zzaai(String str) {
    }

    public static zzaac zzb(boolean z8, long j7) {
        return new zzaac(z8 ? 1 : 0, j7, null);
    }

    public final long zza(zzaae zzaaeVar, zzaaa zzaaaVar, int i9) {
        Looper myLooper = Looper.myLooper();
        zzeq.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzaad(this, myLooper, zzaaeVar, zzaaaVar, i9, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzaad zzaadVar = this.zzf;
        zzeq.zzb(zzaadVar);
        zzaadVar.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i9) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzaad zzaadVar = this.zzf;
            if (zzaadVar != null) {
                zzaadVar.zzb(i9);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(@Nullable zzaaf zzaafVar) {
        zzaad zzaadVar = this.zzf;
        if (zzaadVar != null) {
            zzaadVar.zza(true);
        }
        this.zze.execute(new zzaag(zzaafVar));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
