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
import com.facebook.internal.ServerProtocol;

/* loaded from: classes2.dex */
public final class vq {

    /* renamed from: a */
    private final r8 f27602a = new r8();

    /* renamed from: b */
    private final b f27603b;

    /* renamed from: c */
    private final e f27604c;
    private boolean d;
    private Surface e;

    /* renamed from: f */
    private float f27605f;

    /* renamed from: g */
    private float f27606g;

    /* renamed from: h */
    private float f27607h;

    /* renamed from: i */
    private float f27608i;

    /* renamed from: j */
    private int f27609j;

    /* renamed from: k */
    private long f27610k;

    /* renamed from: l */
    private long f27611l;

    /* renamed from: m */
    private long f27612m;

    /* renamed from: n */
    private long f27613n;

    /* renamed from: o */
    private long f27614o;

    /* renamed from: p */
    private long f27615p;

    /* renamed from: q */
    private long f27616q;

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(Surface surface, float f2) {
            try {
                surface.setFrameRate(f2, f2 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                pc.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface b {

        /* loaded from: classes2.dex */
        public interface a {
            void a(Display display);
        }

        void a();

        void a(a aVar);
    }

    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a */
        private final WindowManager f27617a;

        private c(WindowManager windowManager) {
            this.f27617a = windowManager;
        }

        @Override // com.applovin.impl.vq.b
        public void a() {
        }

        public static b a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.applovin.impl.vq.b
        public void a(b.a aVar) {
            aVar.a(this.f27617a.getDefaultDisplay());
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: g */
        private static final e f27620g = new e();

        /* renamed from: a */
        public volatile long f27621a = -9223372036854775807L;

        /* renamed from: b */
        private final Handler f27622b;

        /* renamed from: c */
        private final HandlerThread f27623c;
        private Choreographer d;

        /* renamed from: f */
        private int f27624f;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f27623c = handlerThread;
            handlerThread.start();
            Handler a2 = xp.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f27622b = a2;
            a2.sendEmptyMessage(0);
        }

        private void b() {
            int i2 = this.f27624f + 1;
            this.f27624f = i2;
            if (i2 == 1) {
                ((Choreographer) b1.a(this.d)).postFrameCallback(this);
            }
        }

        private void c() {
            this.d = Choreographer.getInstance();
        }

        public static e d() {
            return f27620g;
        }

        private void f() {
            int i2 = this.f27624f - 1;
            this.f27624f = i2;
            if (i2 == 0) {
                ((Choreographer) b1.a(this.d)).removeFrameCallback(this);
                this.f27621a = -9223372036854775807L;
            }
        }

        public void a() {
            this.f27622b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f27621a = j2;
            ((Choreographer) b1.a(this.d)).postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f27622b.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                c();
                return true;
            }
            if (i2 == 1) {
                b();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            f();
            return true;
        }
    }

    public vq(Context context) {
        b a2 = a(context);
        this.f27603b = a2;
        this.f27604c = a2 != null ? e.d() : null;
        this.f27610k = -9223372036854775807L;
        this.f27611l = -9223372036854775807L;
        this.f27605f = -1.0f;
        this.f27608i = 1.0f;
        this.f27609j = 0;
    }

    public static /* synthetic */ void a(vq vqVar, Display display) {
        vqVar.a(display);
    }

    private void g() {
        this.f27612m = 0L;
        this.f27615p = -1L;
        this.f27613n = -1L;
    }

    private void h() {
        if (xp.f27962a < 30 || this.e == null) {
            return;
        }
        float b2 = this.f27602a.e() ? this.f27602a.b() : this.f27605f;
        float f2 = this.f27606g;
        if (b2 == f2) {
            return;
        }
        if (b2 != -1.0f && f2 != -1.0f) {
            if (Math.abs(b2 - this.f27606g) < ((!this.f27602a.e() || this.f27602a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (b2 == -1.0f && this.f27602a.c() < 30) {
            return;
        }
        this.f27606g = b2;
        a(false);
    }

    public void b() {
        b bVar = this.f27603b;
        if (bVar != null) {
            bVar.a();
            ((e) b1.a(this.f27604c)).e();
        }
    }

    public void c() {
        if (this.f27603b != null) {
            ((e) b1.a(this.f27604c)).a();
            this.f27603b.a(new is(this, 14));
        }
    }

    public void d() {
        g();
    }

    public void e() {
        this.d = true;
        g();
        a(false);
    }

    public void f() {
        this.d = false;
        a();
    }

    /* loaded from: classes2.dex */
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a */
        private final DisplayManager f27618a;

        /* renamed from: b */
        private b.a f27619b;

        private d(DisplayManager displayManager) {
            this.f27618a = displayManager;
        }

        public static b a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService(ServerProtocol.DIALOG_PARAM_DISPLAY);
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        private Display b() {
            return this.f27618a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            b.a aVar = this.f27619b;
            if (aVar == null || i2 != 0) {
                return;
            }
            aVar.a(b());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        @Override // com.applovin.impl.vq.b
        public void a(b.a aVar) {
            this.f27619b = aVar;
            this.f27618a.registerDisplayListener(this, xp.a());
            aVar.a(b());
        }

        @Override // com.applovin.impl.vq.b
        public void a() {
            this.f27618a.unregisterDisplayListener(this);
            this.f27619b = null;
        }
    }

    public long a(long j2) {
        long j3;
        e eVar;
        if (this.f27615p != -1 && this.f27602a.e()) {
            long a2 = this.f27616q + (((float) ((this.f27612m - this.f27615p) * this.f27602a.a())) / this.f27608i);
            if (a(j2, a2)) {
                j3 = a2;
                this.f27613n = this.f27612m;
                this.f27614o = j3;
                eVar = this.f27604c;
                if (eVar != null || this.f27610k == -9223372036854775807L) {
                    return j3;
                }
                long j4 = eVar.f27621a;
                return j4 == -9223372036854775807L ? j3 : a(j3, j4, this.f27610k) - this.f27611l;
            }
            g();
        }
        j3 = j2;
        this.f27613n = this.f27612m;
        this.f27614o = j3;
        eVar = this.f27604c;
        if (eVar != null) {
        }
        return j3;
    }

    public void b(long j2) {
        long j3 = this.f27613n;
        if (j3 != -1) {
            this.f27615p = j3;
            this.f27616q = this.f27614o;
        }
        this.f27612m++;
        this.f27602a.a(j2 * 1000);
        h();
    }

    public void b(float f2) {
        this.f27608i = f2;
        g();
        a(false);
    }

    private static boolean a(long j2, long j3) {
        return Math.abs(j2 - j3) <= 20000000;
    }

    private static long a(long j2, long j3, long j4) {
        long j5;
        long j6 = (((j2 - j3) / j4) * j4) + j3;
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            j5 = j6;
            j6 = j4 + j6;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private static b a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        b a2 = xp.f27962a >= 17 ? d.a(applicationContext) : null;
        return a2 == null ? c.a(applicationContext) : a2;
    }

    public void a(float f2) {
        this.f27605f = f2;
        this.f27602a.f();
        h();
    }

    public void a(Surface surface) {
        if (surface instanceof h7) {
            surface = null;
        }
        if (this.e == surface) {
            return;
        }
        a();
        this.e = surface;
        a(true);
    }

    public void a(int i2) {
        if (this.f27609j == i2) {
            return;
        }
        this.f27609j = i2;
        a(true);
    }

    public void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f27610k = refreshRate;
            this.f27611l = (refreshRate * 80) / 100;
        } else {
            pc.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f27610k = -9223372036854775807L;
            this.f27611l = -9223372036854775807L;
        }
    }

    private void a(boolean z2) {
        Surface surface;
        float f2;
        if (xp.f27962a < 30 || (surface = this.e) == null || this.f27609j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f3 = this.f27606g;
            if (f3 != -1.0f) {
                f2 = f3 * this.f27608i;
                if (z2 && this.f27607h == f2) {
                    return;
                }
                this.f27607h = f2;
                a.a(surface, f2);
            }
        }
        f2 = 0.0f;
        if (z2) {
        }
        this.f27607h = f2;
        a.a(surface, f2);
    }

    private void a() {
        Surface surface;
        if (xp.f27962a < 30 || (surface = this.e) == null || this.f27609j == Integer.MIN_VALUE || this.f27607h == 0.0f) {
            return;
        }
        this.f27607h = 0.0f;
        a.a(surface, 0.0f);
    }
}
