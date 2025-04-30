package com.applovin.impl;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class cr {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.t f7129a;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f7132e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7133f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f7134g;

    /* renamed from: h, reason: collision with root package name */
    private final long f7135h;

    /* renamed from: k, reason: collision with root package name */
    private int f7138k;
    private float l;
    private float m;

    /* renamed from: n, reason: collision with root package name */
    private long f7139n;
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f7130c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f7136i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f7137j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f7140o = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f7131d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public cr(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.f7129a = kVar.L();
        this.f7135h = ((Long) kVar.a(oj.f9670S1)).longValue();
        this.f7134g = new WeakReference(view);
        this.f7132e = new F(15, this, new WeakReference(aVar));
        this.f7133f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.C0
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a6;
                a6 = cr.this.a(view);
                return a6;
            }
        };
    }

    private void c(View view) {
        View b = ar.b((View) this.f7134g.get());
        if (b == null) {
            b = ar.b(view);
        }
        if (b == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f7129a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = b.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f7129a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.f7136i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f7133f);
        }
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f7140o == Long.MIN_VALUE) {
            this.f7140o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f7140o >= this.f7139n;
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f7130c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7130c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f7130c.width());
        if (pxToDp < this.f7138k) {
            return false;
        }
        if ((((float) pxToDp) / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.l) {
            return false;
        }
        return (((float) ((long) (this.f7130c.height() * this.f7130c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f7134g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f7137j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.f7129a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
            }
            b();
            a aVar = (a) weakReference.get();
            if (aVar != null) {
                aVar.onLogVisibilityImpression();
                return;
            }
            return;
        }
        a();
    }

    private void b(View view) {
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f7136i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f7133f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f7133f);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.f7129a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.t.a()) {
            this.f7129a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f7136i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private void a() {
        this.f7131d.postDelayed(this.f7132e, this.f7135h);
    }

    public void a(int i9, float f9, float f10, long j7, View view) {
        synchronized (this.b) {
            try {
                if (com.applovin.impl.sdk.t.a()) {
                    this.f7129a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f7137j = weakReference;
                this.f7138k = i9;
                this.l = f9;
                this.m = f10;
                this.f7139n = j7;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.b) {
            this.f7131d.removeMessages(0);
            b((View) this.f7134g.get());
            this.f7140o = Long.MIN_VALUE;
            this.f7137j.clear();
        }
    }

    public void a(ie ieVar) {
        View l02;
        if (ieVar instanceof ce) {
            l02 = ieVar.x();
        } else if (!(ieVar instanceof ee)) {
            return;
        } else {
            l02 = ((ee) ieVar).l0();
        }
        a(ieVar.d0(), ieVar.f0(), ieVar.g0(), ieVar.h0(), l02);
    }
}
