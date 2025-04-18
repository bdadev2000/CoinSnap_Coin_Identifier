package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class hl {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f24328a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f24329b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f24330c = new Handler();
    private boolean d = false;
    private final WeakReference e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f24331f;

    /* renamed from: g, reason: collision with root package name */
    private a f24332g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i2, int i3);
    }

    public hl(View view) {
        this.e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            this.f24331f = null;
            return;
        }
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.au
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                boolean b2;
                b2 = hl.this.b();
                return b2;
            }
        };
        this.f24331f = onPreDrawListener;
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f24329b) {
            try {
                this.d = false;
                int i2 = -1;
                int i3 = -1;
                for (Map.Entry entry : this.f24328a.entrySet()) {
                    if (a((View) entry.getKey())) {
                        Integer num = (Integer) entry.getValue();
                        if (i2 == -1 && i3 == -1) {
                            i2 = num.intValue();
                            i3 = num.intValue();
                        } else {
                            i2 = Math.min(i2, ((Integer) entry.getValue()).intValue());
                            i3 = Math.max(i3, ((Integer) entry.getValue()).intValue());
                        }
                    }
                }
                a aVar = this.f24332g;
                if (aVar != null) {
                    aVar.a(i2, i3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void d() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.f24330c.postDelayed(new mt(this, 11), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a(a aVar) {
        this.f24332g = aVar;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f24332g = null;
        View view = (View) this.e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f24331f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f24329b) {
            this.f24328a.remove(view);
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(View view, int i2) {
        synchronized (this.f24329b) {
            this.f24328a.put(view, Integer.valueOf(i2));
            d();
        }
    }
}
