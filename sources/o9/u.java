package o9;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;

/* loaded from: classes3.dex */
public final class u implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static final u f23247g = new u();

    /* renamed from: b, reason: collision with root package name */
    public volatile long f23248b = C.TIME_UNSET;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f23249c;

    /* renamed from: d, reason: collision with root package name */
    public Choreographer f23250d;

    /* renamed from: f, reason: collision with root package name */
    public int f23251f;

    public u() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = h0.a;
        Handler handler = new Handler(looper, this);
        this.f23249c = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        this.f23248b = j3;
        Choreographer choreographer = this.f23250d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f23250d;
                if (choreographer != null) {
                    int i11 = this.f23251f - 1;
                    this.f23251f = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f23248b = C.TIME_UNSET;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f23250d;
            if (choreographer2 != null) {
                int i12 = this.f23251f + 1;
                this.f23251f = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f23250d = Choreographer.getInstance();
        } catch (RuntimeException e2) {
            n9.o.g("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e2);
        }
        return true;
    }
}
