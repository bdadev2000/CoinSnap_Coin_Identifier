package com.applovin.impl;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class el {
    private final WeakHashMap a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Object f4477b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Handler f4478c = new Handler();

    /* renamed from: d, reason: collision with root package name */
    private boolean f4479d = false;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f4480e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f4481f;

    /* renamed from: g, reason: collision with root package name */
    private a f4482g;

    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, int i11);
    }

    public el(View view) {
        this.f4480e = new WeakReference(view);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.impl.mt
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    boolean b3;
                    b3 = el.this.b();
                    return b3;
                }
            };
            this.f4481f = onPreDrawListener;
            viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
            return;
        }
        this.f4481f = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        synchronized (this.f4477b) {
            this.f4479d = false;
            int i10 = -1;
            int i11 = -1;
            for (Map.Entry entry : this.a.entrySet()) {
                if (a((View) entry.getKey())) {
                    Integer num = (Integer) entry.getValue();
                    if (i10 == -1 && i11 == -1) {
                        i10 = num.intValue();
                        i11 = num.intValue();
                    } else {
                        i10 = Math.min(i10, ((Integer) entry.getValue()).intValue());
                        i11 = Math.max(i11, ((Integer) entry.getValue()).intValue());
                    }
                }
            }
            a aVar = this.f4482g;
            if (aVar != null) {
                aVar.a(i10, i11);
            }
        }
    }

    private void d() {
        if (this.f4479d) {
            return;
        }
        this.f4479d = true;
        this.f4478c.postDelayed(new nt(this, 9), 100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b() {
        d();
        return true;
    }

    public void a() {
        ViewTreeObserver.OnPreDrawListener onPreDrawListener;
        this.f4482g = null;
        View view = (View) this.f4480e.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive() && (onPreDrawListener = this.f4481f) != null) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            }
            this.f4480e.clear();
        }
    }

    public void b(View view) {
        synchronized (this.f4477b) {
            this.a.remove(view);
        }
    }

    private boolean a(View view) {
        return (view == null || view.getVisibility() != 0 || view.getParent() == null) ? false : true;
    }

    public void a(a aVar) {
        this.f4482g = aVar;
    }

    public void a(View view, int i10) {
        synchronized (this.f4477b) {
            this.a.put(view, Integer.valueOf(i10));
            d();
        }
    }
}
