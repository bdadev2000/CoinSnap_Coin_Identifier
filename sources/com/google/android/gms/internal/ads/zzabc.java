package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes3.dex */
final class zzabc implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzabc zzb = new zzabc();
    public volatile long zza = -9223372036854775807L;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzabc() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzabc zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.zza = j2;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e) {
                zzea.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
            return true;
        }
        if (i2 == 2) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i3 = this.zzf + 1;
                this.zzf = i3;
                if (i3 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i2 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.zze;
        if (choreographer2 != null) {
            int i4 = this.zzf - 1;
            this.zzf = i4;
            if (i4 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = -9223372036854775807L;
            }
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}
