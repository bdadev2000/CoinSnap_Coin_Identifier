package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {
    private WeakReference<ViewTreeObserver> a;

    /* renamed from: b, reason: collision with root package name */
    private List<View> f14000b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f14001c;

    /* renamed from: d, reason: collision with root package name */
    private a f14002d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f14003e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14004f;

    /* renamed from: g, reason: collision with root package name */
    private int f14005g;

    /* loaded from: classes4.dex */
    public interface a {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, a aVar, Handler handler, int i10) {
        ArrayList arrayList = new ArrayList();
        this.f14000b = arrayList;
        this.f14001c = null;
        this.f14002d = aVar;
        this.f14003e = handler;
        this.f14005g = i10;
        if (list != null) {
            this.f14000b = list;
        } else {
            arrayList.clear();
        }
        try {
            b();
        } catch (Throwable th2) {
            ad.b("ImpressionTracker", th2.getMessage(), th2);
        }
        try {
            this.f14001c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mbridge.msdk.mbnative.controller.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
        } catch (Throwable th3) {
            ad.b("ImpressionTracker", th3.getMessage(), th3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f14004f) {
            return;
        }
        Handler handler = this.f14003e;
        if (handler != null) {
            if (this.f14005g == 1) {
                c();
            } else {
                handler.postDelayed(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.this.c();
                    }
                }, 100L);
            }
        }
        this.f14004f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            this.f14004f = false;
            List<View> list = this.f14000b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i10 = 0; i10 < this.f14000b.size(); i10++) {
                View view = this.f14000b.get(i10);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            a aVar = this.f14002d;
            if (aVar != null) {
                aVar.a(arrayList, arrayList2);
            }
            if (arrayList.size() > 0) {
                a();
            }
            arrayList.clear();
            arrayList2.clear();
        } catch (Exception unused) {
        }
    }

    public final void a(View view) {
        final View view2;
        View view3;
        if (view != null) {
            view2 = f.a(view.getContext(), view);
            this.f14000b.add(view);
        } else {
            List<View> list = this.f14000b;
            view2 = null;
            if (list != null && list.size() > 0) {
                for (int i10 = 0; i10 < this.f14000b.size() && ((view3 = this.f14000b.get(i10)) == null || (view2 = f.a(view3.getContext(), view3)) == null); i10++) {
                }
            }
        }
        if (view2 == null) {
            return;
        }
        view2.post(new Runnable() { // from class: com.mbridge.msdk.mbnative.controller.c.3
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                if (viewTreeObserver != null && !viewTreeObserver.isAlive()) {
                    return;
                }
                c.this.a = new WeakReference(viewTreeObserver);
                if (c.this.f14001c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f14001c);
                }
            }
        });
    }

    private boolean b(View view) {
        return !aq.a(view, this.f14005g);
    }

    public final void a() {
        try {
            this.f14004f = false;
            WeakReference<ViewTreeObserver> weakReference = this.a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f14001c);
                }
                this.a.clear();
            }
            this.f14002d = null;
            this.f14001c = null;
            List<View> list = this.f14000b;
            if (list != null) {
                list.clear();
            }
            this.f14000b = null;
        } catch (Throwable unused) {
        }
    }
}
