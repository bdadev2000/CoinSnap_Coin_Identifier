package i0;

import M0.t;
import M0.w;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import d0.ChoreographerFrameCallbackC2156c;
import java.util.ArrayList;
import n1.C2475f;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2333c {

    /* renamed from: d, reason: collision with root package name */
    public final C2475f f20620d;

    /* renamed from: a, reason: collision with root package name */
    public float f20618a = 0.0f;
    public float b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f20619c = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20621e = false;

    /* renamed from: f, reason: collision with root package name */
    public float f20622f = Float.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f20623g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f20624h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f20626j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f20627k = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public float f20625i = 1.0f;
    public C2334d l = null;
    public float m = Float.MAX_VALUE;

    public C2333c(C2332b c2332b) {
        this.f20620d = new C2475f(c2332b, 28);
    }

    public final void a(float f9) {
        if (this.f20621e) {
            this.m = f9;
            return;
        }
        if (this.l == null) {
            this.l = new C2334d(f9);
        }
        C2334d c2334d = this.l;
        double d2 = f9;
        c2334d.f20635i = d2;
        double d9 = (float) d2;
        if (d9 <= this.f20622f) {
            if (d9 >= this.f20623g) {
                double abs = Math.abs(this.f20625i * 0.75f);
                c2334d.f20630d = abs;
                c2334d.f20631e = abs * 62.5d;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    boolean z8 = this.f20621e;
                    if (!z8 && !z8) {
                        this.f20621e = true;
                        if (!this.f20619c) {
                            this.b = ((C2332b) this.f20620d.f21833c).f20617a;
                        }
                        float f10 = this.b;
                        if (f10 <= this.f20622f && f10 >= this.f20623g) {
                            ThreadLocal threadLocal = C2331a.f20612f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C2331a());
                            }
                            C2331a c2331a = (C2331a) threadLocal.get();
                            ArrayList arrayList = c2331a.b;
                            if (arrayList.size() == 0) {
                                if (c2331a.f20615d == null) {
                                    c2331a.f20615d = new C.c(c2331a.f20614c);
                                }
                                C.c cVar = c2331a.f20615d;
                                ((Choreographer) cVar.f348d).postFrameCallback((ChoreographerFrameCallbackC2156c) cVar.f349f);
                            }
                            if (!arrayList.contains(this)) {
                                arrayList.add(this);
                                return;
                            }
                            return;
                        }
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    return;
                }
                throw new AndroidRuntimeException("Animations may only be started on the main thread");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
    }

    public final void b(float f9) {
        ArrayList arrayList;
        ((C2332b) this.f20620d.f21833c).f20617a = f9;
        int i9 = 0;
        while (true) {
            arrayList = this.f20627k;
            if (i9 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i9) != null) {
                t tVar = (t) arrayList.get(i9);
                float f10 = this.b;
                w wVar = tVar.f1907g;
                long max = Math.max(-1L, Math.min(wVar.f1939z + 1, Math.round(f10)));
                wVar.E(max, tVar.f1902a);
                tVar.f1902a = max;
            }
            i9++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
