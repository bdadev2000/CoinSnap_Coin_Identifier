package s7;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes3.dex */
public final class m implements u0 {
    public final m9.q a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24568b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24569c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24570d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24571e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24572f;

    /* renamed from: g, reason: collision with root package name */
    public final long f24573g;

    /* renamed from: h, reason: collision with root package name */
    public int f24574h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f24575i;

    public m() {
        m9.q qVar = new m9.q();
        a(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS, "minBufferMs", "bufferForPlaybackMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, DefaultLoadControl.DEFAULT_MAX_BUFFER_MS, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = qVar;
        long j3 = DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
        this.f24568b = n9.h0.H(j3);
        this.f24569c = n9.h0.H(j3);
        this.f24570d = n9.h0.H(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
        this.f24571e = n9.h0.H(5000);
        this.f24572f = -1;
        this.f24574h = C.DEFAULT_VIDEO_BUFFER_SIZE;
        this.f24573g = n9.h0.H(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        v8.u0.e(i10 >= i11, str + " cannot be less than " + str2);
    }

    public final void b(boolean z10) {
        boolean z11;
        int i10 = this.f24572f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f24574h = i10;
        this.f24575i = false;
        if (z10) {
            m9.q qVar = this.a;
            synchronized (qVar) {
                if (qVar.a) {
                    synchronized (qVar) {
                        if (qVar.f21716c > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        qVar.f21716c = 0;
                        if (z11) {
                            qVar.a();
                        }
                    }
                }
            }
        }
    }

    public final boolean c(long j3, float f10) {
        int i10;
        boolean z10;
        m9.q qVar = this.a;
        synchronized (qVar) {
            i10 = qVar.f21717d * qVar.f21715b;
        }
        boolean z11 = true;
        if (i10 >= this.f24574h) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j10 = this.f24569c;
        long j11 = this.f24568b;
        if (f10 > 1.0f) {
            j11 = Math.min(n9.h0.q(j11, f10), j10);
        }
        if (j3 < Math.max(j11, 500000L)) {
            if (z10) {
                z11 = false;
            }
            this.f24575i = z11;
            if (!z11 && j3 < 500000) {
                n9.o.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j3 >= j10 || z10) {
            this.f24575i = false;
        }
        return this.f24575i;
    }
}
