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

/* loaded from: classes2.dex */
public class br {

    /* renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.n f23163a;
    private final Runnable e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f23166f;

    /* renamed from: g, reason: collision with root package name */
    private final WeakReference f23167g;

    /* renamed from: h, reason: collision with root package name */
    private final long f23168h;

    /* renamed from: k, reason: collision with root package name */
    private int f23171k;

    /* renamed from: l, reason: collision with root package name */
    private float f23172l;

    /* renamed from: m, reason: collision with root package name */
    private float f23173m;

    /* renamed from: n, reason: collision with root package name */
    private long f23174n;

    /* renamed from: b, reason: collision with root package name */
    private final Object f23164b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Rect f23165c = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private WeakReference f23169i = new WeakReference(null);

    /* renamed from: j, reason: collision with root package name */
    private WeakReference f23170j = new WeakReference(null);

    /* renamed from: o, reason: collision with root package name */
    private long f23175o = Long.MIN_VALUE;
    private final Handler d = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public interface a {
        void onLogVisibilityImpression();
    }

    public br(final View view, com.applovin.impl.sdk.j jVar, a aVar) {
        this.f23163a = jVar.J();
        this.f23168h = ((Long) jVar.a(sj.U1)).longValue();
        this.f23167g = new WeakReference(view);
        this.e = new ms(8, this, new WeakReference(aVar));
        this.f23166f = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.ss
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean a2;
                a2 = br.this.a(view);
                return a2;
            }
        };
    }

    private void c(View view) {
        View b2 = zq.b((View) this.f23167g.get());
        if (b2 == null) {
            b2 = zq.b(view);
        }
        if (b2 == null) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23163a.a("VisibilityTracker", "Unable to set view tree observer due to no root view.");
                return;
            }
            return;
        }
        ViewTreeObserver viewTreeObserver = b2.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f23169i = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(this.f23166f);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f23163a.k("VisibilityTracker", "Unable to set view tree observer since the view tree observer is not alive.");
        }
    }

    private boolean a(View view, View view2) {
        if (!b(view, view2)) {
            return false;
        }
        if (this.f23175o == Long.MIN_VALUE) {
            this.f23175o = SystemClock.uptimeMillis();
        }
        return SystemClock.uptimeMillis() - this.f23175o >= this.f23174n;
    }

    private boolean b(View view, View view2) {
        if (view2 == null || view2.getVisibility() != 0 || view.getParent() == null || view2.getWidth() <= 0 || view2.getHeight() <= 0 || !view2.getGlobalVisibleRect(this.f23165c)) {
            return false;
        }
        long pxToDp = AppLovinSdkUtils.pxToDp(view2.getContext(), this.f23165c.height()) * AppLovinSdkUtils.pxToDp(view2.getContext(), this.f23165c.width());
        if (pxToDp < this.f23171k) {
            return false;
        }
        if ((((float) pxToDp) / (AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getHeight()) * AppLovinSdkUtils.pxToDp(view2.getContext(), view2.getWidth()))) * 100.0f < this.f23172l) {
            return false;
        }
        return (((float) ((long) (this.f23165c.height() * this.f23165c.width()))) / ((float) ((long) (view2.getHeight() * view2.getWidth())))) * 100.0f >= this.f23173m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(WeakReference weakReference) {
        View view = (View) this.f23167g.get();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        View view2 = (View) this.f23170j.get();
        if (viewGroup == null || view2 == null) {
            return;
        }
        if (a(viewGroup, view2)) {
            if (com.applovin.impl.sdk.n.a()) {
                this.f23163a.a("VisibilityTracker", "View met visibility requirements. Logging visibility impression..");
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
        ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f23169i.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f23166f);
        } else if (view != null) {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnPreDrawListener(this.f23166f);
            } else if (com.applovin.impl.sdk.n.a()) {
                this.f23163a.a("VisibilityTracker", "Could not remove on pre-draw listener. View tree observer is not alive.");
            }
        } else if (com.applovin.impl.sdk.n.a()) {
            this.f23163a.a("VisibilityTracker", "Could not remove on pre-draw listener. Root view is null.");
        }
        this.f23169i.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        a();
        b(view);
        return true;
    }

    private void a() {
        this.d.postDelayed(this.e, this.f23168h);
    }

    public void a(int i2, float f2, float f3, long j2, View view) {
        synchronized (this.f23164b) {
            try {
                if (com.applovin.impl.sdk.n.a()) {
                    this.f23163a.a("VisibilityTracker", "Tracking visibility for " + view);
                }
                b();
                WeakReference weakReference = new WeakReference(view);
                this.f23170j = weakReference;
                this.f23171k = i2;
                this.f23172l = f2;
                this.f23173m = f3;
                this.f23174n = j2;
                c((View) weakReference.get());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        synchronized (this.f23164b) {
            this.d.removeMessages(0);
            b((View) this.f23167g.get());
            this.f23175o = Long.MIN_VALUE;
            this.f23170j.clear();
        }
    }

    public void a(ne neVar) {
        View q02;
        if (neVar instanceof he) {
            q02 = neVar.y();
        } else if (!(neVar instanceof je)) {
            return;
        } else {
            q02 = ((je) neVar).q0();
        }
        a(neVar.i0(), neVar.k0(), neVar.l0(), neVar.m0(), q02);
    }
}
