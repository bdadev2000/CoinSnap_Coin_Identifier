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
import h.o0;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class g {
    private final k a;

    /* renamed from: b */
    private final t f7669b;

    /* renamed from: c */
    private final long f7670c;

    /* renamed from: d */
    private final long f7671d;

    /* renamed from: e */
    private final int f7672e;

    /* renamed from: f */
    private final int f7673f;

    /* renamed from: g */
    private final int f7674g;

    /* renamed from: k */
    private Handler f7678k;

    /* renamed from: l */
    private HandlerThread f7679l;

    /* renamed from: n */
    private c f7681n;

    /* renamed from: h */
    private WeakReference f7675h = new WeakReference(null);

    /* renamed from: i */
    private int f7676i = 0;

    /* renamed from: j */
    private Integer f7677j = null;

    /* renamed from: m */
    private final Runnable f7680m = new a0(this, 0);

    /* loaded from: classes.dex */
    public class b implements PixelCopy.OnPixelCopyFinishedListener {
        final /* synthetic */ d a;

        /* renamed from: b */
        final /* synthetic */ Bitmap f7684b;

        public b(d dVar, Bitmap bitmap) {
            this.a = dVar;
            this.f7684b = bitmap;
        }

        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
        public void onPixelCopyFinished(int i10) {
            if (i10 != 0) {
                t unused = g.this.f7669b;
                if (t.a()) {
                    g.this.f7669b.b("BlackViewDetector", "Failed to capture screenshot with error code: " + i10);
                }
                this.a.a(true);
                return;
            }
            this.a.a(this.f7684b);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(View view);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(Bitmap bitmap);

        void a(boolean z10);
    }

    public g(k kVar) {
        this.a = kVar;
        this.f7669b = kVar.L();
        this.f7670c = ((Long) kVar.a(oj.f6619a6)).longValue();
        this.f7671d = ((Long) kVar.a(oj.Z5)).longValue();
        this.f7672e = ((Integer) kVar.a(oj.f6625b6)).intValue();
        this.f7673f = ((Integer) kVar.a(oj.f6633c6)).intValue();
        this.f7674g = ((Integer) kVar.a(oj.f6641d6)).intValue();
    }

    public static /* synthetic */ int e(g gVar) {
        int i10 = gVar.f7676i;
        gVar.f7676i = i10 + 1;
        return i10;
    }

    public /* synthetic */ void c() {
        this.f7681n = null;
    }

    public void d() {
        long j3 = this.f7670c;
        if (j3 > 0) {
            if (this.f7676i > 1) {
                e();
                g();
                return;
            }
            Handler handler = this.f7678k;
            if (handler != null) {
                handler.postDelayed(this.f7680m, j3);
                return;
            }
            if (t.a()) {
                this.f7669b.k("BlackViewDetector", "Monitoring handler was unexpectedly null");
            }
            g();
            return;
        }
        if (this.f7676i == 1) {
            e();
        }
        g();
    }

    private void e() {
        View view = (View) this.f7675h.get();
        if (t.a()) {
            this.f7669b.k("BlackViewDetector", "Detected black view: " + view);
        }
        AppLovinSdkUtils.runOnUiThread(new o0(14, this, view));
    }

    public void f() {
        this.f7676i = 0;
        this.f7677j = null;
    }

    public void g() {
        if (this.f7675h.get() != null) {
            if (t.a()) {
                this.f7669b.a("BlackViewDetector", "Stopped monitoring view: " + this.f7675h.get());
            }
            this.f7675h.clear();
        }
        Handler handler = this.f7678k;
        if (handler != null) {
            handler.removeCallbacks(this.f7680m);
            this.f7678k = null;
        }
        if (this.f7681n != null) {
            AppLovinSdkUtils.runOnUiThread(new a0(this, 1));
        }
    }

    public void b() {
        g();
        HandlerThread handlerThread = this.f7679l;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f7679l = null;
        }
    }

    public void a(View view, c cVar) {
        if (((Boolean) this.a.a(oj.Y5)).booleanValue()) {
            View view2 = (View) this.f7675h.get();
            if (view2 != null) {
                if (t.a()) {
                    this.f7669b.k("BlackViewDetector", "Monitoring is already in progress for a view: " + view2);
                    return;
                }
                return;
            }
            if (t.a()) {
                this.f7669b.a("BlackViewDetector", "Started monitoring view: " + view);
            }
            try {
                if (this.f7679l == null) {
                    HandlerThread handlerThread = new HandlerThread("AppLovinSdk:black_view_detector");
                    this.f7679l = handlerThread;
                    handlerThread.start();
                } else {
                    this.a.B().a(o.b.BLACK_VIEW, "BlackViewDetector:maybeStartMonitoring() unexpectedly called multiple times");
                    g();
                }
                this.f7681n = cVar;
                this.f7675h = new WeakReference(view);
                f();
                Handler handler = new Handler(this.f7679l.getLooper());
                this.f7678k = handler;
                handler.postDelayed(this.f7680m, this.f7671d);
            } catch (Throwable th2) {
                g();
                this.a.B().a("BlackViewDetector", "maybeStartMonitoring", th2);
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements d {
        final /* synthetic */ int a;

        /* renamed from: b */
        final /* synthetic */ int f7682b;

        public a(int i10, int i11) {
            this.a = i10;
            this.f7682b = i11;
        }

        @Override // com.applovin.impl.sdk.g.d
        public void a(Bitmap bitmap) {
            int i10 = this.a / g.this.f7672e;
            int i11 = this.f7682b / g.this.f7672e;
            int i12 = i10 / 2;
            for (int i13 = i11 / 2; i13 < this.f7682b; i13 += i11) {
                for (int i14 = i12; i14 < this.a; i14 += i10) {
                    int pixel = bitmap.getPixel(i14, i13);
                    if (!g.this.a(pixel)) {
                        if (g.this.f7677j == null) {
                            g.this.f7677j = Integer.valueOf(pixel);
                        }
                    } else {
                        bitmap.recycle();
                        g.this.f();
                        g.this.d();
                        return;
                    }
                }
            }
            g.e(g.this);
            bitmap.recycle();
            g.this.d();
        }

        @Override // com.applovin.impl.sdk.g.d
        public void a(boolean z10) {
            if (z10) {
                g.this.g();
            } else {
                g.this.d();
            }
        }
    }

    public void a() {
        ActivityManager.MemoryInfo a10;
        View view = (View) this.f7675h.get();
        if (view == null) {
            if (t.a()) {
                this.f7669b.k("BlackViewDetector", "Monitored view no longer exists.");
            }
            g();
            return;
        }
        Long l10 = (Long) this.a.a(oj.f6671h6);
        if (l10.longValue() > 0 && (a10 = zp.a((ActivityManager) k.k().getSystemService("activity"))) != null && a10.availMem < l10.longValue()) {
            if (t.a()) {
                this.f7669b.k("BlackViewDetector", "Cancelling black view detection due to low memory");
                return;
            }
            return;
        }
        if (t.a()) {
            this.f7669b.a("BlackViewDetector", "Checking for black view: " + view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth != 0 && measuredHeight != 0) {
            a(view, new a(measuredWidth, measuredHeight));
            return;
        }
        if (t.a()) {
            this.f7669b.k("BlackViewDetector", kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.j("Monitored view is not visible due to dimensions (width = ", measuredWidth, ", height = ", measuredHeight, ")"));
        }
        f();
        d();
    }

    public /* synthetic */ void a(View view) {
        c cVar = this.f7681n;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    public boolean a(int i10) {
        boolean z10;
        int red = Color.red(i10);
        int green = Color.green(i10);
        int blue = Color.blue(i10);
        Integer num = this.f7677j;
        if (num != null) {
            int red2 = Color.red(num.intValue());
            int green2 = Color.green(this.f7677j.intValue());
            int blue2 = Color.blue(this.f7677j.intValue());
            if (Math.abs(red - red2) > this.f7674g || Math.abs(green - green2) > this.f7674g || Math.abs(blue - blue2) > this.f7674g) {
                z10 = true;
                int i11 = this.f7673f;
                return red <= i11 ? true : true;
            }
        }
        z10 = false;
        int i112 = this.f7673f;
        return red <= i112 ? true : true;
    }

    private void a(View view, d dVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            Activity a10 = this.a.e().a();
            if (a10 == null) {
                if (t.a()) {
                    this.f7669b.b("BlackViewDetector", "Failed to capture screenshot due to no active activity");
                }
                dVar.a(false);
                return;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            int i10 = iArr[0];
            int i11 = iArr[1];
            Rect rect = new Rect(i10, i11, i10 + measuredWidth, i11 + measuredHeight);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                PixelCopy.request(a10.getWindow(), rect, createBitmap, new b(dVar, createBitmap), new Handler());
                return;
            } catch (Throwable th2) {
                if (t.a()) {
                    this.f7669b.b("BlackViewDetector", "Failed to capture screenshot due to exception: " + th2);
                }
                dVar.a(true);
                return;
            }
        }
        if (t.a()) {
            this.f7669b.k("BlackViewDetector", "Unable to capture screenshots on views below API 26");
        }
        dVar.a(true);
    }
}
