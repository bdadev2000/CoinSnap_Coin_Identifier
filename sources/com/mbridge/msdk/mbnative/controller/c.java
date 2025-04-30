package com.mbridge.msdk.mbnative.controller;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aq;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f16503a;
    private List<View> b;

    /* renamed from: c, reason: collision with root package name */
    private ViewTreeObserver.OnPreDrawListener f16504c;

    /* renamed from: d, reason: collision with root package name */
    private a f16505d;

    /* renamed from: e, reason: collision with root package name */
    private Handler f16506e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f16507f;

    /* renamed from: g, reason: collision with root package name */
    private int f16508g;

    /* loaded from: classes3.dex */
    public interface a {
        void a(ArrayList<View> arrayList, ArrayList<View> arrayList2);
    }

    public c(List<View> list, a aVar, Handler handler, int i9) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f16504c = null;
        this.f16505d = aVar;
        this.f16506e = handler;
        this.f16508g = i9;
        if (list != null) {
            this.b = list;
        } else {
            arrayList.clear();
        }
        try {
            b();
        } catch (Throwable th) {
            ad.b("ImpressionTracker", th.getMessage(), th);
        }
        try {
            this.f16504c = new ViewTreeObserver.OnPreDrawListener() { // from class: com.mbridge.msdk.mbnative.controller.c.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    c.this.b();
                    return true;
                }
            };
        } catch (Throwable th2) {
            ad.b("ImpressionTracker", th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f16507f) {
            return;
        }
        Handler handler = this.f16506e;
        if (handler != null) {
            if (this.f16508g == 1) {
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
        this.f16507f = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            this.f16507f = false;
            List<View> list = this.b;
            if (list == null || list.size() <= 0) {
                return;
            }
            ArrayList<View> arrayList = new ArrayList<>();
            ArrayList<View> arrayList2 = new ArrayList<>();
            for (int i9 = 0; i9 < this.b.size(); i9++) {
                View view = this.b.get(i9);
                if (b(view)) {
                    arrayList.add(view);
                } else {
                    arrayList2.add(view);
                }
            }
            a aVar = this.f16505d;
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
            this.b.add(view);
        } else {
            List<View> list = this.b;
            view2 = null;
            if (list != null && list.size() > 0) {
                for (int i9 = 0; i9 < this.b.size() && ((view3 = this.b.get(i9)) == null || (view2 = f.a(view3.getContext(), view3)) == null); i9++) {
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
                c.this.f16503a = new WeakReference(viewTreeObserver);
                if (c.this.f16504c != null) {
                    viewTreeObserver.addOnPreDrawListener(c.this.f16504c);
                }
            }
        });
    }

    private boolean b(View view) {
        return !aq.a(view, this.f16508g);
    }

    public final void a() {
        try {
            this.f16507f = false;
            WeakReference<ViewTreeObserver> weakReference = this.f16503a;
            if (weakReference != null && weakReference.get() != null) {
                ViewTreeObserver viewTreeObserver = this.f16503a.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(this.f16504c);
                }
                this.f16503a.clear();
            }
            this.f16505d = null;
            this.f16504c = null;
            List<View> list = this.b;
            if (list != null) {
                list.clear();
            }
            this.b = null;
        } catch (Throwable unused) {
        }
    }
}
