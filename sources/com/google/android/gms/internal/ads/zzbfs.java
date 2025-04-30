package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class zzbfs {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfmn zze;
    private final zzbfu zzf;

    public zzbfs(Context context, ScheduledExecutorService scheduledExecutorService, zzbfu zzbfuVar, zzfmn zzfmnVar) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbfuVar;
        this.zze = zzfmnVar;
    }

    public final f4.c zza() {
        return (zzgfk) zzgft.zzo(zzgfk.zzu(zzgft.zzh(null)), ((Long) zzbgj.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > this.zzb.getEventTime()) {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
