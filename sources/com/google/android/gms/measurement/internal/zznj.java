package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.compose.foundation.text.input.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zznj {
    final /* synthetic */ zznb zza;

    public zznj(zznb zznbVar) {
        this.zza = zznbVar;
    }

    @VisibleForTesting
    @WorkerThread
    private final void zzb(long j2, boolean z2) {
        this.zza.zzt();
        if (this.zza.zzu.zzac()) {
            this.zza.zzk().zzk.zza(j2);
            this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
            Long valueOf = Long.valueOf(j2 / 1000);
            this.zza.zzm().zza("auto", "_sid", valueOf, j2);
            this.zza.zzk().zzl.zza(valueOf.longValue());
            this.zza.zzk().zzg.zza(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", valueOf.longValue());
            this.zza.zzm().zza("auto", "_s", j2, bundle);
            String zza = this.zza.zzk().zzq.zza();
            if (TextUtils.isEmpty(zza)) {
                return;
            }
            this.zza.zzm().zza("auto", "_ssr", j2, a.c("_ffr", zza));
        }
    }

    @WorkerThread
    public final void zza() {
        this.zza.zzt();
        if (this.zza.zzk().zza(this.zza.zzb().currentTimeMillis())) {
            this.zza.zzk().zzg.zza(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                this.zza.zzj().zzp().zza("Detected application was in foreground");
                zzb(this.zza.zzb().currentTimeMillis(), false);
            }
        }
    }

    @WorkerThread
    public final void zza(long j2, boolean z2) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j2)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(j2);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j2, z2);
        }
    }
}
