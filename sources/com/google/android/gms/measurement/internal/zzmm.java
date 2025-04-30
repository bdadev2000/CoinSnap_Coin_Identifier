package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzmm {
    final /* synthetic */ zzmh zza;
    private zzml zzb;

    public zzmm(zzmh zzmhVar) {
        this.zza = zzmhVar;
    }

    public final void zza(long j7) {
        Handler handler;
        this.zzb = new zzml(this, this.zza.zzb().currentTimeMillis(), j7);
        handler = this.zza.zzc;
        handler.postDelayed(this.zzb, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
    }

    public final void zza() {
        Handler handler;
        this.zza.zzt();
        if (this.zzb != null) {
            handler = this.zza.zzc;
            handler.removeCallbacks(this.zzb);
        }
        this.zza.zzk().zzn.zza(false);
        this.zza.zza(false);
    }
}
