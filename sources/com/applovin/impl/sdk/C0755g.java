package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.o;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import x0.AbstractC2914a;

/* renamed from: com.applovin.impl.sdk.g */
/* loaded from: classes.dex */
public class C0755g {

    /* renamed from: a */
    private final k f10803a;
    private final t b;

    /* renamed from: c */
    private final long f10804c;

    /* renamed from: d */
    private final long f10805d;

    /* renamed from: e */
    private final int f10806e;

    /* renamed from: f */
    private final int f10807f;

    /* renamed from: g */
    private final int f10808g;

    /* renamed from: k */
    private Handler f10812k;
    private HandlerThread l;

    /* renamed from: n */
    private c f10813n;

    /* renamed from: h */
    private WeakReference f10809h = new WeakReference(null);

    /* renamed from: i */
    private int f10810i = 0;

    /* renamed from: j */
    private Integer f10811j = null;
    private final Runnable m = new A(this, 1);

    /* renamed from: com.applovin.impl.sdk.g$b */
    /* loaded from: classes.dex */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {

        /* renamed from: a */
        final /* synthetic */ d f10816a;
        final /* synthetic */ Bitmap b;

        public b(d dVar, Bitmap bitmap) {
            this.f10816a = dVar;
            this.b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i9) {
            if (i9 != 0) {
                t unused = C0755g.this.b;
                if (t.a()) {
                    C0755g.this.b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i9);
                }
                this.f10816a.a(true);
                return;
            }
            this.f10816a.a(this.b);
        }
    }

    /* renamed from: com.applovin.impl.sdk.g$c */
    /* loaded from: classes.dex */
    public interface c {
        void a(View view);
    }

    /* renamed from: com.applovin.impl.sdk.g$d */
    /* loaded from: classes.dex */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z8);
    }

    public C0755g(k kVar) {
        this.f10803a = kVar;
        this.b = kVar.L();
        this.f10804c = ((Long) kVar.a(oj.a6)).longValue();
        this.f10805d = ((Long) kVar.a(oj.f9720Z5)).longValue();
        this.f10806e = ((Integer) kVar.a(oj.f9733b6)).intValue();
        this.f10807f = ((Integer) kVar.a(oj.f9741c6)).intValue();
        this.f10808g = ((Integer) kVar.a(oj.f9748d6)).intValue();
    }

    public static /* synthetic */ int e(C0755g c0755g) {
        int i9 = c0755g.f10810i;
        c0755g.f10810i = i9 + 1;
        return i9;
    }

    public /* synthetic */ void c() {
        this.f10813n = null;
    }

    public void d() {
        long j7 = this.f10804c;
        if (j7 > 0) {
            if (this.f10810i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.f10812k;
            if (handler != null) {
                handler.postDelayed(this.m, j7);
                return;
            }
            if (t.a()) {
                this.b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
            return;
        }
        if (this.f10810i == 1) {
            e();
        }
        g();
    }

    private void e() {
        View view = (View) this.f10809h.get();
        if (t.a()) {
            this.b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new A4.d(13, this, view));
    }

    public void f() {
        this.f10810i = 0;
        this.f10811j = null;
    }

    public void g() {
        if (this.f10809h.get() != null) {
            if (t.a()) {
                this.b.a("BlackViewDetector", "Stopped monitoring view: " + this.f10809h.get());
            }
            this.f10809h.clear();
        }
        Handler handler = this.f10812k;
        if (handler != null) {
            handler.removeCallbacks(this.m);
            this.f10812k = null;
        }
        if (this.f10813n != null) {
            AppLovinSdkUtils.runOnUiThread(new A(this, 0));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.f10803a.a(oj.f9714Y5)).booleanValue()) {
            View view2 = (View) this.f10809h.get();
            if (view2 != null) {
                if (t.a()) {
                    this.b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (t.a()) {
                this.b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.l = handlerThread;
                    handlerThread.start();
                } else {
                    this.f10803a.B().a(o.b.BLACK_VIEW, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.f10813n = cVar;
                this.f10809h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.l.getLooper());
                this.f10812k = handler;
                handler.postDelayed(this.m, this.f10805d);
            } catch (Throwable th) {
                g();
                this.f10803a.B().a("BlackViewDetector", "maybeStartMonitoring", th);
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.g$a */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        final /* synthetic */ int f10814a;
        final /* synthetic */ int b;

        public a(int i9, int i10) {
            this.f10814a = i9;
            this.b = i10;
        }

        @Override // com.applovin.impl.sdk.C0755g.d
        public void a(Bitmap bitmap) {
            int i9 = this.f10814a / C0755g.this.f10806e;
            int i10 = this.b / C0755g.this.f10806e;
            int i11 = i9 / 2;
            for (int i12 = i10 / 2; i12 < this.b; i12 += i10) {
                for (int i13 = i11; i13 < this.f10814a; i13 += i9) {
                    int pixel = bitmap.getPixel(i13, i12);
                    if (!C0755g.this.a(pixel)) {
                        if (C0755g.this.f10811j == null) {
                            C0755g.this.f10811j = Integer.valueOf(pixel);
                        }
                    } else {
                        bitmap.recycle();
                        C0755g.this.f();
                        C0755g.this.d();
                        return;
                    }
                }
            }
            C0755g.e(C0755g.this);
            bitmap.recycle();
            C0755g.this.d();
        }

        @Override // com.applovin.impl.sdk.C0755g.d
        public void a(boolean z8) {
            if (z8) {
                C0755g.this.g();
            } else {
                C0755g.this.d();
            }
        }
    }

    public void a() {
        ActivityManager.MemoryInfo a6;
        View view = (View) this.f10809h.get();
        if (view == null) {
            if (t.a()) {
                this.b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l = (Long) this.f10803a.a(oj.h6);
        if (l.longValue() > 0 && (a6 = zp.a((ActivityManager) k.k().getSystemService("activity"))) != null && a6.availMem < l.longValue()) {
            if (t.a()) {
                this.b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (t.a()) {
            this.b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a(measuredWidth, measuredHeight));
            return;
        }
        if (t.a()) {
            this.b.k("BlackViewDetector", AbstractC2914a.c(measuredWidth, measuredHeight, "Monitored view is not visible due to dimensions (width = ", ", height = ", ")"));
        }
        f();
        d();
    }

    public /* synthetic */ void a(View view) {
        c cVar = this.f10813n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    public boolean a(int i9) {
        boolean z8;
        int red = Color.red(i9);
        int green = Color.green(i9);
        int blue = Color.blue(i9);
        Integer num = this.f10811j;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.f10811j.intValue());
            int blue2 = Color.blue(this.f10811j.intValue());
            if (Math.abs(red - red2) > this.f10808g || Math.abs(green - green2) > this.f10808g || Math.abs(blue - blue2) > this.f10808g) {
                z8 = true;
                int i10 = this.f10807f;
                return red <= i10 ? true : true;
            }
        }
        z8 = false;
        int i102 = this.f10807f;
        return red <= i102 ? true : true;
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity a6 = this.f10803a.e().a();
            if (a6 == null) {
                if (t.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i9 = iArr[0];
            int i10 = iArr[1];
            Rect rect = new Rect(i9, i10, i9 + measuredWidth, i10 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(a6.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
                return;
            } catch (Throwable th) {
                if (t.a()) {
                    this.b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th);
                }
                dVar.a(true);
                return;
            }
        }
        if (t.a()) {
            this.b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
