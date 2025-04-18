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
    private final com.applovin.impl.sdk.t a;

    /* renamed from: e */
    private final Runnable f4142e;

    /* renamed from: f */
    private final ViewTreeObserver.OnPreDrawListener f4143f;

    /* renamed from: g */
    private final WeakReference f4144g;

    /* renamed from: h */
    private final long f4145h;

    /* renamed from: k */
    private int f4148k;

    /* renamed from: l */
    private float f4149l;

    /* renamed from: m */
    private float f4150m;

    /* renamed from: n */
    private long f4151n;

    /* renamed from: b */
    private final Object f4139b = new Object();

    /* renamed from: c */
    private final Rect f4140c = new Rect();

    /* renamed from: i */
    private WeakReference f4146i = new WeakReference(null);

    /* renamed from: j */
    private WeakReference f4147j = new WeakReference(null);

    /* renamed from: o */
    private long f4152o = Long.MIN_VALUE;

    /* renamed from: d */
    private final Handler f4141d = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public cr(final View view, com.applovin.impl.sdk.k kVar, a aVar) {
        this.a = kVar.L();
        this.f4145h = ((Long) kVar.a(oj.S1)).longValue();
        this.f4144g = new WeakReference(view);
        this.f4142e = new rs(15, this, new WeakReference(aVar));
        this.f4143f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.kt
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a10;
                a10 = cr.this.a(view);
                return a10;
            }
        };
    }

    private void c(View view) {
        View b3 = ar.b((View) this.f4144g.get());
        if (b3 == null) {
            b3 = ar.b(view);
        }
        if (b3 == null) {
            if (com.applovin.impl.sdk.t.a()) {
                this.a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = b3.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            if (com.applovin.impl.sdk.t.a()) {
                this.a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
            }
        } else {
            this.f4146i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f4143f);
        }
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f4152o == Long.MIN_VALUE) {
            this.f4152o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f4152o >= this.f4151n;
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f4140c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f4140c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f4140c.width());
        if (pxToDp < this.f4148k) {
            return false;
        }
        if ((((float) pxToDp) / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f4149l) {
            return false;
        }
        return (((float) ((long) (this.f4140c.height() * this.f4140c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f4150m;
    }

    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f4144g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f4147j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.t.a()) {
                this.a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
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
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f4146i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f4143f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f4143f);
            } else if (com.applovin.impl.sdk.t.a()) {
                this.a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.t.a()) {
            this.a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f4146i.clear();
    }

    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private void a() {
        this.f4141d.postDelayed(this.f4142e, this.f4145h);
    }

    public void a(int i10, float f10, float f11, long j3, View view) {
        synchronized (this.f4139b) {
            if (com.applovin.impl.sdk.t.a()) {
                this.a.a("VisibilityTracker", "Tracking visibility for " + view);
            }
            b();
            WeakReference weakReference = new WeakReference(view);
            this.f4147j = weakReference;
            this.f4148k = i10;
            this.f4149l = f10;
            this.f4150m = f11;
            this.f4151n = j3;
            c((View) weakReference.get());
        }
    }

    public void b() {
        synchronized (this.f4139b) {
            this.f4141d.removeMessages(0);
            b((View) this.f4144g.get());
            this.f4152o = Long.MIN_VALUE;
            this.f4147j.clear();
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
