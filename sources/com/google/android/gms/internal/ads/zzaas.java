package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
final class zzaas implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzaas zzb = new zzaas();
    public volatile long zza = C.TIME_UNSET;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzaas() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzaas zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.zza = j3;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                Choreographer choreographer = this.zze;
                if (choreographer != null) {
                    int i11 = this.zzf - 1;
                    this.zzf = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.zza = C.TIME_UNSET;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.zze;
            if (choreographer2 != null) {
                int i12 = this.zzf + 1;
                this.zzf = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.zze = Choreographer.getInstance();
        } catch (RuntimeException e2) {
            zzdt.zzg("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
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
