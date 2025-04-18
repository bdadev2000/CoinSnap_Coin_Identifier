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
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public final class wq {
    private final p8 a = new p8();

    /* renamed from: b */
    private final b f8829b;

    /* renamed from: c */
    private final e f8830c;

    /* renamed from: d */
    private boolean f8831d;

    /* renamed from: e */
    private Surface f8832e;

    /* renamed from: f */
    private float f8833f;

    /* renamed from: g */
    private float f8834g;

    /* renamed from: h */
    private float f8835h;

    /* renamed from: i */
    private float f8836i;

    /* renamed from: j */
    private int f8837j;

    /* renamed from: k */
    private long f8838k;

    /* renamed from: l */
    private long f8839l;

    /* renamed from: m */
    private long f8840m;

    /* renamed from: n */
    private long f8841n;

    /* renamed from: o */
    private long f8842o;

    /* renamed from: p */
    private long f8843p;

    /* renamed from: q */
    private long f8844q;

    /* loaded from: classes.dex */
    public static final class a {
        public static void a(Surface surface, float f10) {
            int i10;
            if (f10 == 0.0f) {
                i10 = 0;
            } else {
                i10 = 1;
            }
            try {
                surface.setFrameRate(f10, i10);
            } catch (IllegalStateException e2) {
                kc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e2);
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
        private final WindowManager a;

        private c(WindowManager windowManager) {
            this.a = windowManager;
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
            aVar.a(this.a.getDefaultDisplay());
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        private static final e f8846g = new e();
        public volatile long a = C.TIME_UNSET;

        /* renamed from: b */
        private final Handler f8847b;

        /* renamed from: c */
        private final HandlerThread f8848c;

        /* renamed from: d */
        private Choreographer f8849d;

        /* renamed from: f */
        private int f8850f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f8848c = handlerThread;
            handlerThread.start();
            Handler a = yp.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f8847b = a;
            a.sendEmptyMessage(0);
        }

        private void b() {
            int i10 = this.f8850f + 1;
            this.f8850f = i10;
            if (i10 == 1) {
                ((Choreographer) a1.a(this.f8849d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.f8849d = Choreographer.getInstance();
        }

        public static e d() {
            return f8846g;
        }

        private void f() {
            int i10 = this.f8850f - 1;
            this.f8850f = i10;
            if (i10 == 0) {
                ((Choreographer) a1.a(this.f8849d)).removeFrameCallback(this);
                this.a = C.TIME_UNSET;
            }
        }

        public void a() {
            this.f8847b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j3) {
            this.a = j3;
            ((Choreographer) a1.a(this.f8849d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f8847b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
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
        b a10 = a(context);
        this.f8829b = a10;
        if (a10 != null) {
            eVar = e.d();
        } else {
            eVar = null;
        }
        this.f8830c = eVar;
        this.f8838k = C.TIME_UNSET;
        this.f8839l = C.TIME_UNSET;
        this.f8833f = -1.0f;
        this.f8836i = 1.0f;
        this.f8837j = 0;
    }

    public static /* synthetic */ void a(wq wqVar, Display display) {
        wqVar.a(display);
    }

    private void g() {
        this.f8840m = 0L;
        this.f8843p = -1L;
        this.f8841n = -1L;
    }

    private void h() {
        float f10;
        float f11;
        if (yp.a >= 30 && this.f8832e != null) {
            if (this.a.e()) {
                f10 = this.a.b();
            } else {
                f10 = this.f8833f;
            }
            float f12 = this.f8834g;
            if (f10 == f12) {
                return;
            }
            if (f10 != -1.0f && f12 != -1.0f) {
                if (this.a.e() && this.a.d() >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
                if (Math.abs(f10 - this.f8834g) < f11) {
                    return;
                }
            } else if (f10 == -1.0f && this.a.c() < 30) {
                return;
            }
            this.f8834g = f10;
            a(false);
        }
    }

    public void b() {
        b bVar = this.f8829b;
        if (bVar != null) {
            bVar.a();
            ((e) a1.a(this.f8830c)).e();
        }
    }

    public void c() {
        if (this.f8829b != null) {
            ((e) a1.a(this.f8830c)).a();
            this.f8829b.a(new js(this, 14));
        }
    }

    public void d() {
        g();
    }

    public void e() {
        this.f8831d = true;
        g();
        a(false);
    }

    public void f() {
        this.f8831d = false;
        a();
    }

    /* loaded from: classes.dex */
    public static final class d implements b, DisplayManager.DisplayListener {
        private final DisplayManager a;

        /* renamed from: b */
        private b.a f8845b;

        private d(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            b.a aVar = this.f8845b;
            if (aVar != null && i10 == 0) {
                aVar.a(b());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        @Override // com.applovin.impl.wq.b
        public void a(b.a aVar) {
            this.f8845b = aVar;
            this.a.registerDisplayListener(this, yp.a());
            aVar.a(b());
        }

        @Override // com.applovin.impl.wq.b
        public void a() {
            this.a.unregisterDisplayListener(this);
            this.f8845b = null;
        }
    }

    public long a(long j3) {
        long j10;
        e eVar;
        if (this.f8843p != -1 && this.a.e()) {
            long a10 = this.f8844q + (((float) ((this.f8840m - this.f8843p) * this.a.a())) / this.f8836i);
            if (!a(j3, a10)) {
                g();
            } else {
                j10 = a10;
                this.f8841n = this.f8840m;
                this.f8842o = j10;
                eVar = this.f8830c;
                if (eVar != null || this.f8838k == C.TIME_UNSET) {
                    return j10;
                }
                long j11 = eVar.a;
                return j11 == C.TIME_UNSET ? j10 : a(j10, j11, this.f8838k) - this.f8839l;
            }
        }
        j10 = j3;
        this.f8841n = this.f8840m;
        this.f8842o = j10;
        eVar = this.f8830c;
        if (eVar != null) {
        }
        return j10;
    }

    public void b(long j3) {
        long j10 = this.f8841n;
        if (j10 != -1) {
            this.f8843p = j10;
            this.f8844q = this.f8842o;
        }
        this.f8840m++;
        this.a.a(j3 * 1000);
        h();
    }

    public void b(float f10) {
        this.f8836i = f10;
        g();
        a(false);
    }

    private static boolean a(long j3, long j10) {
        return Math.abs(j3 - j10) <= 20000000;
    }

    private static long a(long j3, long j10, long j11) {
        long j12;
        long j13 = (((j3 - j10) / j11) * j11) + j10;
        if (j3 <= j13) {
            j12 = j13 - j11;
        } else {
            j12 = j13;
            j13 = j11 + j13;
        }
        return j13 - j3 < j3 - j12 ? j13 : j12;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b a10 = yp.a >= 17 ? d.a(applicationContext) : null;
        return a10 == null ? c.a(applicationContext) : a10;
    }

    public void a(float f10) {
        this.f8833f = f10;
        this.a.f();
        h();
    }

    public void a(Surface surface) {
        if (surface instanceof f7) {
            surface = null;
        }
        if (this.f8832e == surface) {
            return;
        }
        a();
        this.f8832e = surface;
        a(true);
    }

    public void a(int i10) {
        if (this.f8837j == i10) {
            return;
        }
        this.f8837j = i10;
        a(true);
    }

    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f8838k = refreshRate;
            this.f8839l = (refreshRate * 80) / 100;
        } else {
            kc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f8838k = C.TIME_UNSET;
            this.f8839l = C.TIME_UNSET;
        }
    }

    private void a(boolean z10) {
        Surface surface;
        float f10;
        if (yp.a < 30 || (surface = this.f8832e) == null || this.f8837j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f8831d) {
            float f11 = this.f8834g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f8836i;
                if (z10 && this.f8835h == f10) {
                    return;
                }
                this.f8835h = f10;
                a.a(surface, f10);
            }
        }
        f10 = 0.0f;
        if (z10) {
        }
        this.f8835h = f10;
        a.a(surface, f10);
    }

    private void a() {
        Surface surface;
        if (yp.a < 30 || (surface = this.f8832e) == null || this.f8837j == Integer.MIN_VALUE || this.f8835h == 0.0f) {
            return;
        }
        this.f8835h = 0.0f;
        a.a(surface, 0.0f);
    }
}
