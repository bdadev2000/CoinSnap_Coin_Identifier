package com.applovin.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* loaded from: classes.dex */
public final class wq {

    /* renamed from: a */
    private final p8 f12039a = new p8();
    private final b b;

    /* renamed from: c */
    private final e f12040c;

    /* renamed from: d */
    private boolean f12041d;

    /* renamed from: e */
    private Surface f12042e;

    /* renamed from: f */
    private float f12043f;

    /* renamed from: g */
    private float f12044g;

    /* renamed from: h */
    private float f12045h;

    /* renamed from: i */
    private float f12046i;

    /* renamed from: j */
    private int f12047j;

    /* renamed from: k */
    private long f12048k;
    private long l;
    private long m;

    /* renamed from: n */
    private long f12049n;

    /* renamed from: o */
    private long f12050o;

    /* renamed from: p */
    private long f12051p;

    /* renamed from: q */
    private long f12052q;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f9) {
            int i9;
            if (f9 == 0.0f) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            try {
                surface.setFrameRate(f9, i9);
            } catch (IllegalStateException e4) {
                kc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e4);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {

        /* loaded from: classes.dex */
        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    /* loaded from: classes.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final WindowManager f12053a;

        private c(WindowManager windowManager) {
            this.f12053a = windowManager;
        }

        @Override // com.applovin.impl.wq.b
        public void a() {
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.impl.wq.b
        public void a(b.a aVar) {
            aVar.a(this.f12053a.getDefaultDisplay());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        private static final e f12055g = new e();

        /* renamed from: a */
        public volatile long f12056a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        private final Handler b;

        /* renamed from: c */
        private final HandlerThread f12057c;

        /* renamed from: d */
        private Choreographer f12058d;

        /* renamed from: f */
        private int f12059f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f12057c = handlerThread;
            handlerThread.start();
            Handler a6 = yp.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.b = a6;
            a6.sendEmptyMessage(0);
        }

        private void b() {
            int i9 = this.f12059f + 1;
            this.f12059f = i9;
            if (i9 == 1) {
                ((Choreographer) AbstractC0669a1.a(this.f12058d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f12058d = Choreographer.getInstance();
        }

        public static e d() {
            return f12055g;
        }

        private void f() {
            int i9 = this.f12059f - 1;
            this.f12059f = i9;
            if (i9 == 0) {
                ((Choreographer) AbstractC0669a1.a(this.f12058d)).removeFrameCallback(this);
                this.f12056a = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            }
        }

        public void a() {
            this.b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j7) {
            this.f12056a = j7;
            ((Choreographer) AbstractC0669a1.a(this.f12058d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        return false;
                    }
                    f();
                    return true;
                }
                b();
                return true;
            }
            c();
            return true;
        }
    }

    public wq(Context context) {
        e eVar;
        b a6 = a(context);
        this.b = a6;
        if (a6 != null) {
            eVar = e.d();
        } else {
            eVar = null;
        }
        this.f12040c = eVar;
        this.f12048k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        this.f12043f = -1.0f;
        this.f12046i = 1.0f;
        this.f12047j = 0;
    }

    public static /* synthetic */ void a(wq wqVar, Display display) {
        wqVar.a(display);
    }

    private void g() {
        this.m = 0L;
        this.f12051p = -1L;
        this.f12049n = -1L;
    }

    private void h() {
        float f9;
        float f10;
        if (yp.f12451a >= 30 && this.f12042e != null) {
            if (this.f12039a.e()) {
                f9 = this.f12039a.b();
            } else {
                f9 = this.f12043f;
            }
            float f11 = this.f12044g;
            if (f9 == f11) {
                return;
            }
            if (f9 != -1.0f && f11 != -1.0f) {
                if (this.f12039a.e() && this.f12039a.d() >= 5000000000L) {
                    f10 = 0.02f;
                } else {
                    f10 = 1.0f;
                }
                if (Math.abs(f9 - this.f12044g) < f10) {
                    return;
                }
            } else if (f9 == -1.0f && this.f12039a.c() < 30) {
                return;
            }
            this.f12044g = f9;
            a(false);
        }
    }

    public void b() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.a();
            ((e) AbstractC0669a1.a(this.f12040c)).e();
        }
    }

    public void c() {
        if (this.b != null) {
            ((e) AbstractC0669a1.a(this.f12040c)).a();
            this.b.a(new C(this, 14));
        }
    }

    public void d() {
        g();
    }

    public void e() {
        this.f12041d = true;
        g();
        a(false);
    }

    public void f() {
        this.f12041d = false;
        a();
    }

    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f12054a;
        private b.a b;

        private d(DisplayManager displayManager) {
            this.f12054a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f12054a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i9) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i9) {
            b.a aVar = this.b;
            if (aVar != null && i9 == 0) {
                aVar.a(b());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i9) {
        }

        @Override // com.applovin.impl.wq.b
        public void a(b.a aVar) {
            this.b = aVar;
            this.f12054a.registerDisplayListener(this, yp.a());
            aVar.a(b());
        }

        @Override // com.applovin.impl.wq.b
        public void a() {
            this.f12054a.unregisterDisplayListener(this);
            this.b = null;
        }
    }

    public long a(long j7) {
        long j9;
        e eVar;
        if (this.f12051p != -1 && this.f12039a.e()) {
            long a6 = this.f12052q + (((float) ((this.m - this.f12051p) * this.f12039a.a())) / this.f12046i);
            if (!a(j7, a6)) {
                g();
            } else {
                j9 = a6;
                this.f12049n = this.m;
                this.f12050o = j9;
                eVar = this.f12040c;
                if (eVar != null || this.f12048k == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    return j9;
                }
                long j10 = eVar.f12056a;
                return j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET ? j9 : a(j9, j10, this.f12048k) - this.l;
            }
        }
        j9 = j7;
        this.f12049n = this.m;
        this.f12050o = j9;
        eVar = this.f12040c;
        if (eVar != null) {
        }
        return j9;
    }

    public void b(long j7) {
        long j9 = this.f12049n;
        if (j9 != -1) {
            this.f12051p = j9;
            this.f12052q = this.f12050o;
        }
        this.m++;
        this.f12039a.a(j7 * 1000);
        h();
    }

    public void b(float f9) {
        this.f12046i = f9;
        g();
        a(false);
    }

    private static boolean a(long j7, long j9) {
        return Math.abs(j7 - j9) <= 20000000;
    }

    private static long a(long j7, long j9, long j10) {
        long j11;
        long j12 = (((j7 - j9) / j10) * j10) + j9;
        if (j7 <= j12) {
            j11 = j12 - j10;
        } else {
            j11 = j12;
            j12 = j10 + j12;
        }
        return j12 - j7 < j7 - j11 ? j12 : j11;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b a6 = yp.f12451a >= 17 ? d.a(applicationContext) : null;
        return a6 == null ? c.a(applicationContext) : a6;
    }

    public void a(float f9) {
        this.f12043f = f9;
        this.f12039a.f();
        h();
    }

    public void a(Surface surface) {
        if (surface instanceof f7) {
            surface = null;
        }
        if (this.f12042e == surface) {
            return;
        }
        a();
        this.f12042e = surface;
        a(true);
    }

    public void a(int i9) {
        if (this.f12047j == i9) {
            return;
        }
        this.f12047j = i9;
        a(true);
    }

    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f12048k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            kc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f12048k = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
            this.l = com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
    }

    private void a(boolean z8) {
        Surface surface;
        float f9;
        if (yp.f12451a < 30 || (surface = this.f12042e) == null || this.f12047j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f12041d) {
            float f10 = this.f12044g;
            if (f10 != -1.0f) {
                f9 = f10 * this.f12046i;
                if (z8 && this.f12045h == f9) {
                    return;
                }
                this.f12045h = f9;
                a.a(surface, f9);
            }
        }
        f9 = 0.0f;
        if (z8) {
        }
        this.f12045h = f9;
        a.a(surface, f9);
    }

    private void a() {
        Surface surface;
        if (yp.f12451a < 30 || (surface = this.f12042e) == null || this.f12047j == Integer.MIN_VALUE || this.f12045h == 0.0f) {
            return;
        }
        this.f12045h = 0.0f;
        a.a(surface, 0.0f);
    }
}
