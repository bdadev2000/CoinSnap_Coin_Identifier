package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class zzzg {
    public static final zzyz zza = new zzyz(2, C.TIME_UNSET, null);
    public static final zzyz zzb = new zzyz(3, C.TIME_UNSET, null);
    private final Executor zzc;
    private final Runnable zzd;

    @Nullable
    private zzza zze;

    @Nullable
    private IOException zzf;

    public zzzg(String str) {
        final String str2 = "ExoPlayer:Loader:ProgressiveMediaPeriod";
        final ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactory(str2) { // from class: com.google.android.gms.internal.ads.zzel
            public final /* synthetic */ String zza = "ExoPlayer:Loader:ProgressiveMediaPeriod";

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, this.zza);
            }
        });
        this.zzc = newSingleThreadExecutor;
        Objects.requireNonNull(newSingleThreadExecutor);
        this.zzd = new Runnable() { // from class: com.google.android.gms.internal.ads.zzyx
            @Override // java.lang.Runnable
            public final void run() {
                newSingleThreadExecutor.shutdown();
            }
        };
    }

    public static zzyz zzb(boolean z10, long j3) {
        return new zzyz(z10 ? 1 : 0, j3, null);
    }

    public final long zza(zzzb zzzbVar, zzyy zzyyVar, int i10) {
        Looper myLooper = Looper.myLooper();
        zzdb.zzb(myLooper);
        this.zzf = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzza(this, myLooper, zzzbVar, zzyyVar, i10, elapsedRealtime).zzc(0L);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzza zzzaVar = this.zze;
        zzdb.zzb(zzzaVar);
        zzzaVar.zza(false);
    }

    public final void zzh() {
        this.zzf = null;
    }

    public final void zzi(int i10) throws IOException {
        IOException iOException = this.zzf;
        if (iOException == null) {
            zzza zzzaVar = this.zze;
            if (zzzaVar != null) {
                zzzaVar.zzb(i10);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(@Nullable zzzc zzzcVar) {
        zzza zzzaVar = this.zze;
        if (zzzaVar != null) {
            zzzaVar.zza(true);
        }
        this.zzc.execute(new zzzd(zzzcVar));
        this.zzd.run();
    }

    public final boolean zzk() {
        return this.zzf != null;
    }

    public final boolean zzl() {
        return this.zze != null;
    }
}
