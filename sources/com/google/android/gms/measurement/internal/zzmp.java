package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmp {
    final /* synthetic */ zzmh zza;

    public zzmp(zzmh zzmhVar) {
        this.zza = zzmhVar;
    }

    private final void zzb(long j7, boolean z8) {
        this.zza.zzt();
        if (!this.zza.zzu.zzac()) {
            return;
        }
        this.zza.zzk().zzk.zza(j7);
        this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
        long j9 = j7 / 1000;
        this.zza.zzm().zza("auto", "_sid", Long.valueOf(j9), j7);
        this.zza.zzk().zzl.zza(j9);
        this.zza.zzk().zzg.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", j9);
        this.zza.zzm().zza("auto", "_s", j7, bundle);
        String zza = this.zza.zzk().zzq.zza();
        if (!TextUtils.isEmpty(zza)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", zza);
            this.zza.zzm().zza("auto", "_ssr", j7, bundle2);
        }
    }

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

    public final void zza(long j7, boolean z8) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j7)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(j7);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j7, z8);
        }
    }
}
