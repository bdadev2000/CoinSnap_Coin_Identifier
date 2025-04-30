package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzabt implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzabt zzb = new zzabt();
    public volatile long zza = C.TIME_UNSET;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzabt() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(0);
    }

    public static zzabt zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j7) {
        this.zza = j7;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return false;
                }
                Choreographer choreographer = this.zze;
                if (choreographer != null) {
                    int i10 = this.zzf - 1;
                    this.zzf = i10;
                    if (i10 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.zza = C.TIME_UNSET;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i11 = this.zzf + 1;
                this.zzf = i11;
                if (i11 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.zze = Choreographer.getInstance();
        } catch (RuntimeException e4) {
            zzfk.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e4);
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(1);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(2);
    }
}
