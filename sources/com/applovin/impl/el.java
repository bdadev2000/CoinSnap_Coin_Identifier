package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class el {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f7447a = new WeakHashMap();
    private final Object b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f7448c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f7449d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f7450e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f7451f;

    /* renamed from: g, reason: collision with root package name */
    private a f7452g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i9, int i10);
    }

    public el(View view) {
        this.f7450e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.E0
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean b;
                    b = el.this.b();
                    return b;
                }
            };
            this.f7451f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f7451f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.b) {
            try {
                this.f7449d = false;
                int i9 = -1;
                int i10 = -1;
                for (Map.Entry entry : this.f7447a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (i9 == -1 && i10 == -1) {
                            i9 = num.intValue();
                            i10 = num.intValue();
                        } else {
                            i9 = Math.min(i9, ((Integer) entry.getValue()).intValue());
                            i10 = Math.max(i10, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f7452g;
                if (aVar != null) {
                    aVar.a(i9, i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.f7449d) {
            return;
        }
        this.f7449d = true;
        this.f7448c.postDelayed(new F0(this, 9), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f7452g = null;
        View view = (View) this.f7450e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f7451f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f7450e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.b) {
            this.f7447a.remove(view);
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(a aVar) {
        this.f7452g = aVar;
    }

    public void a(View view, int i9) {
        synchronized (this.b) {
            this.f7447a.put(view, Integer.valueOf(i9));
            d();
        }
    }
}
