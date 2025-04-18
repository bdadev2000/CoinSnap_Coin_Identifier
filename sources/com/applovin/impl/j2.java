package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class j2 {

    /* renamed from: a */
    private final com.applovin.impl.sdk.j f24570a;

    /* renamed from: b */
    private final com.applovin.impl.sdk.n f24571b;

    /* renamed from: c */
    private final long f24572c;
    private final long d;
    private final int e;

    /* renamed from: f */
    private final int f24573f;

    /* renamed from: g */
    private final int f24574g;

    /* renamed from: k */
    private Handler f24578k;

    /* renamed from: l */
    private HandlerThread f24579l;

    /* renamed from: n */
    private c f24581n;

    /* renamed from: h */
    private WeakReference f24575h = new WeakReference(null);

    /* renamed from: i */
    private int f24576i = 0;

    /* renamed from: j */
    private Integer f24577j = null;

    /* renamed from: m */
    private final Runnable f24580m = new bu(this, 0);

    /* loaded from: classes.dex */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        final /* synthetic */ d f24583a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f24584b;

        public b(d dVar, Bitmap bitmap) {
            this.f24583a = dVar;
            this.f24584b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i2) {
            if (i2 == 0) {
                this.f24583a.a(this.f24584b);
                return;
            }
            com.applovin.impl.sdk.n unused = j2.this.f24571b;
            if (com.applovin.impl.sdk.n.a()) {
                j2.this.f24571b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i2);
            }
            this.f24583a.a(true);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z2);
    }

    public j2(com.applovin.impl.sdk.j jVar) {
        this.f24570a = jVar;
        this.f24571b = jVar.J();
        this.f24572c = ((Long) jVar.a(sj.f6)).longValue();
        this.d = ((Long) jVar.a(sj.e6)).longValue();
        this.e = ((Integer) jVar.a(sj.g6)).intValue();
        this.f24573f = ((Integer) jVar.a(sj.h6)).intValue();
        this.f24574g = ((Integer) jVar.a(sj.i6)).intValue();
    }

    public /* synthetic */ void c() {
        this.f24581n = null;
    }

    public static /* synthetic */ int e(j2 j2Var) {
        int i2 = j2Var.f24576i;
        j2Var.f24576i = i2 + 1;
        return i2;
    }

    public void f() {
        this.f24576i = 0;
        this.f24577j = null;
    }

    public void d() {
        long j2 = this.f24572c;
        if (j2 <= 0) {
            if (this.f24576i == 1) {
                e();
            }
            g();
        } else {
            if (this.f24576i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.f24578k;
            if (handler != null) {
                handler.postDelayed(this.f24580m, j2);
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
        }
    }

    private void e() {
        View view = (View) this.f24575h.get();
        if (com.applovin.impl.sdk.n.a()) {
            this.f24571b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new ms(17, this, view));
    }

    public void g() {
        if (this.f24575h.get() != null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.a("BlackViewDetector", "Stopped monitoring view: " + this.f24575h.get());
            }
            this.f24575h.clear();
        }
        Handler handler = this.f24578k;
        if (handler != null) {
            handler.removeCallbacks(this.f24580m);
            this.f24578k = null;
        }
        if (this.f24581n != null) {
            AppLovinSdkUtils.runOnUiThread(new bu(this, 1));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.f24579l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f24579l = null;
        }
    }

    public void a() {
        ActivityManager.MemoryInfo a2;
        View view = (View) this.f24575h.get();
        if (view == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l2 = (Long) this.f24570a.a(sj.m6);
        if (l2.longValue() > 0 && (a2 = yp.a((ActivityManager) com.applovin.impl.sdk.j.l().getSystemService("activity"))) != null && a2.availMem < l2.longValue()) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f24571b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a());
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.f24571b.k("BlackViewDetector", android.support.v4.media.d.l("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        f();
        d();
    }

    /* loaded from: classes.dex */
    public class a implements d {
        public a() {
        }

        @Override // com.applovin.impl.j2.d
        public void a(Bitmap bitmap) {
            try {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i2 = width / j2.this.e;
                int i3 = height / j2.this.e;
                int i4 = i2 / 2;
                for (int i5 = i3 / 2; i5 < height; i5 += i3) {
                    for (int i6 = i4; i6 < width; i6 += i2) {
                        int pixel = bitmap.getPixel(i6, i5);
                        if (!j2.this.a(pixel)) {
                            if (j2.this.f24577j == null) {
                                j2.this.f24577j = Integer.valueOf(pixel);
                            }
                        } else {
                            bitmap.recycle();
                            j2.this.f();
                            j2.this.d();
                            return;
                        }
                    }
                }
                j2.e(j2.this);
                bitmap.recycle();
                j2.this.d();
            } catch (Exception e) {
                j2.this.f24570a.E().a("BlackViewDetector", "onScreenshotCaptured", e);
                j2.this.g();
            }
        }

        @Override // com.applovin.impl.j2.d
        public void a(boolean z2) {
            if (z2) {
                j2.this.g();
            } else {
                j2.this.d();
            }
        }
    }

    public boolean a(int i2) {
        boolean z2;
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        Integer num = this.f24577j;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.f24577j.intValue());
            int blue2 = Color.blue(this.f24577j.intValue());
            if (Math.abs(red - red2) > this.f24574g || Math.abs(green - green2) > this.f24574g || Math.abs(blue - blue2) > this.f24574g) {
                z2 = true;
                int i3 = this.f24573f;
                return red <= i3 ? true : true;
            }
        }
        z2 = false;
        int i32 = this.f24573f;
        return red <= i32 ? true : true;
    }

    public /* synthetic */ void a(View view) {
        c cVar = this.f24581n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f24570a.a(sj.d6)).booleanValue()) {
            View view2 = (View) this.f24575h.get();
            if (view2 != null) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f24571b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f24579l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f24579l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f24570a.E().a(la.F, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.f24581n = cVar;
                this.f24575h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.f24579l.getLooper());
                this.f24578k = handler;
                handler.postDelayed(this.f24580m, this.d);
            } catch (Throwable th) {
                g();
                this.f24570a.E().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    private void a(View view, d dVar) {
        Activity a2 = this.f24570a.e().a();
        if (a2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
            }
            dVar.a(false);
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        Rect rect = new Rect(i2, i3, i2 + measuredWidth, i3 + measuredHeight);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            PixelCopy.request(a2.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f24571b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
            }
            dVar.a(true);
        }
    }
}
