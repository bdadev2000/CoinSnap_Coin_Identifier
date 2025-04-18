package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zznj {
    final /* synthetic */ zznb zza;

    public zznj(zznb zznbVar) {
        this.zza = zznbVar;
    }

    private final void zzb(long j3, boolean z10) {
        this.zza.zzt();
        if (!this.zza.zzu.zzac()) {
            return;
        }
        this.zza.zzk().zzk.zza(j3);
        this.zza.zzj().zzp().zza("Session started, time", Long.valueOf(this.zza.zzb().elapsedRealtime()));
        Long valueOf = Long.valueOf(j3 / 1000);
        this.zza.zzm().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_sid", valueOf, j3);
        this.zza.zzk().zzl.zza(valueOf.longValue());
        this.zza.zzk().zzg.zza(false);
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", valueOf.longValue());
        this.zza.zzm().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_s", j3, bundle);
        String zza = this.zza.zzk().zzq.zza();
        if (!TextUtils.isEmpty(zza)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", zza);
            this.zza.zzm().zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ssr", j3, bundle2);
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

    public final void zza(long j3, boolean z10) {
        this.zza.zzt();
        this.zza.zzab();
        if (this.zza.zzk().zza(j3)) {
            this.zza.zzk().zzg.zza(true);
            this.zza.zzg().zzag();
        }
        this.zza.zzk().zzk.zza(j3);
        if (this.zza.zzk().zzg.zza()) {
            zzb(j3, z10);
        }
    }
}
