package a2;

import P1.l;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.m;
import f2.AbstractC2263a;
import f2.C2267e;
import i2.C2341d;
import j2.n;
import java.util.ArrayList;

/* renamed from: a2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0337f {

    /* renamed from: a, reason: collision with root package name */
    public final M1.d f3936a;
    public final Handler b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3937c;

    /* renamed from: d, reason: collision with root package name */
    public final m f3938d;

    /* renamed from: e, reason: collision with root package name */
    public final Q1.a f3939e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3940f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3941g;

    /* renamed from: h, reason: collision with root package name */
    public k f3942h;

    /* renamed from: i, reason: collision with root package name */
    public C0335d f3943i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3944j;

    /* renamed from: k, reason: collision with root package name */
    public C0335d f3945k;
    public Bitmap l;
    public C0335d m;

    /* renamed from: n, reason: collision with root package name */
    public int f3946n;

    /* renamed from: o, reason: collision with root package name */
    public int f3947o;

    /* renamed from: p, reason: collision with root package name */
    public int f3948p;

    public C0337f(com.bumptech.glide.b bVar, M1.d dVar, int i9, int i10, Bitmap bitmap) {
        V1.e eVar = V1.e.b;
        Q1.a aVar = bVar.b;
        com.bumptech.glide.e eVar2 = bVar.f12792d;
        Context baseContext = eVar2.getBaseContext();
        j2.g.c(baseContext, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m c9 = com.bumptech.glide.b.a(baseContext).f12794g.c(baseContext);
        Context baseContext2 = eVar2.getBaseContext();
        j2.g.c(baseContext2, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        m c10 = com.bumptech.glide.b.a(baseContext2).f12794g.c(baseContext2);
        c10.getClass();
        k a6 = new k(c10.b, c10, Bitmap.class, c10.f12867c).a(m.m).a(((C2267e) ((C2267e) ((C2267e) new AbstractC2263a().d(l.b)).r()).n()).h(i9, i10));
        this.f3937c = new ArrayList();
        this.f3938d = c9;
        Handler handler = new Handler(Looper.getMainLooper(), new T3.c(this, 1));
        this.f3939e = aVar;
        this.b = handler;
        this.f3942h = a6;
        this.f3936a = dVar;
        c(eVar, bitmap);
    }

    public final void a() {
        int i9;
        int i10;
        if (this.f3940f && !this.f3941g) {
            C0335d c0335d = this.m;
            if (c0335d != null) {
                this.m = null;
                b(c0335d);
                return;
            }
            this.f3941g = true;
            M1.d dVar = this.f3936a;
            M1.b bVar = dVar.l;
            int i11 = bVar.f1953c;
            if (i11 > 0 && (i10 = dVar.f1974k) >= 0) {
                if (i10 >= 0 && i10 < i11) {
                    i9 = ((M1.a) bVar.f1955e.get(i10)).f1949i;
                } else {
                    i9 = -1;
                }
            } else {
                i9 = 0;
            }
            long uptimeMillis = SystemClock.uptimeMillis() + i9;
            int i12 = (dVar.f1974k + 1) % dVar.l.f1953c;
            dVar.f1974k = i12;
            this.f3945k = new C0335d(this.b, i12, uptimeMillis);
            k y4 = this.f3942h.a((C2267e) new AbstractC2263a().m(new C2341d(Double.valueOf(Math.random())))).y(dVar);
            y4.x(this.f3945k, y4);
        }
    }

    public final void b(C0335d c0335d) {
        int i9;
        this.f3941g = false;
        boolean z8 = this.f3944j;
        Handler handler = this.b;
        if (z8) {
            handler.obtainMessage(2, c0335d).sendToTarget();
            return;
        }
        if (!this.f3940f) {
            this.m = c0335d;
            return;
        }
        if (c0335d.f3935i != null) {
            Bitmap bitmap = this.l;
            if (bitmap != null) {
                this.f3939e.d(bitmap);
                this.l = null;
            }
            C0335d c0335d2 = this.f3943i;
            this.f3943i = c0335d;
            ArrayList arrayList = this.f3937c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C0333b c0333b = (C0333b) ((InterfaceC0336e) arrayList.get(size));
                Object callback = c0333b.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c0333b.stop();
                    c0333b.invalidateSelf();
                } else {
                    c0333b.invalidateSelf();
                    C0335d c0335d3 = ((C0337f) c0333b.b.b).f3943i;
                    if (c0335d3 != null) {
                        i9 = c0335d3.f3933g;
                    } else {
                        i9 = -1;
                    }
                    if (i9 == r5.f3936a.l.f1953c - 1) {
                        c0333b.f3926h++;
                    }
                    int i10 = c0333b.f3927i;
                    if (i10 != -1 && c0333b.f3926h >= i10) {
                        c0333b.stop();
                    }
                }
            }
            if (c0335d2 != null) {
                handler.obtainMessage(2, c0335d2).sendToTarget();
            }
        }
        a();
    }

    public final void c(N1.m mVar, Bitmap bitmap) {
        j2.g.c(mVar, "Argument must not be null");
        j2.g.c(bitmap, "Argument must not be null");
        this.l = bitmap;
        this.f3942h = this.f3942h.a(new AbstractC2263a().p(mVar, true));
        this.f3946n = n.c(bitmap);
        this.f3947o = bitmap.getWidth();
        this.f3948p = bitmap.getHeight();
    }
}
