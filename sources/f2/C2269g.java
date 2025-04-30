package f2;

import P1.B;
import P1.n;
import P1.r;
import P1.x;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.appevents.i;
import com.mbridge.msdk.foundation.entity.o;
import g2.InterfaceC2288b;
import g2.InterfaceC2289c;
import h2.C2316a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* renamed from: f2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2269g implements InterfaceC2265c, InterfaceC2288b, InterfaceC2268f {

    /* renamed from: C, reason: collision with root package name */
    public static final boolean f20295C = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    public final RuntimeException f20296A;

    /* renamed from: B, reason: collision with root package name */
    public int f20297B;

    /* renamed from: a, reason: collision with root package name */
    public final String f20298a;
    public final k2.e b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20299c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2266d f20300d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f20301e;

    /* renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.e f20302f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f20303g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f20304h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC2263a f20305i;

    /* renamed from: j, reason: collision with root package name */
    public final int f20306j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20307k;
    public final com.bumptech.glide.g l;
    public final InterfaceC2289c m;

    /* renamed from: n, reason: collision with root package name */
    public final List f20308n;

    /* renamed from: o, reason: collision with root package name */
    public final C2316a f20309o;

    /* renamed from: p, reason: collision with root package name */
    public final Executor f20310p;

    /* renamed from: q, reason: collision with root package name */
    public B f20311q;

    /* renamed from: r, reason: collision with root package name */
    public C.c f20312r;

    /* renamed from: s, reason: collision with root package name */
    public long f20313s;

    /* renamed from: t, reason: collision with root package name */
    public volatile n f20314t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f20315u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f20316v;

    /* renamed from: w, reason: collision with root package name */
    public Drawable f20317w;

    /* renamed from: x, reason: collision with root package name */
    public int f20318x;

    /* renamed from: y, reason: collision with root package name */
    public int f20319y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f20320z;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, k2.e] */
    public C2269g(Context context, com.bumptech.glide.e eVar, Object obj, Object obj2, Class cls, AbstractC2263a abstractC2263a, int i9, int i10, com.bumptech.glide.g gVar, InterfaceC2289c interfaceC2289c, List list, InterfaceC2266d interfaceC2266d, n nVar, C2316a c2316a) {
        j2.f fVar = j2.g.f21019a;
        this.f20298a = f20295C ? String.valueOf(hashCode()) : null;
        this.b = new Object();
        this.f20299c = obj;
        this.f20301e = context;
        this.f20302f = eVar;
        this.f20303g = obj2;
        this.f20304h = cls;
        this.f20305i = abstractC2263a;
        this.f20306j = i9;
        this.f20307k = i10;
        this.l = gVar;
        this.m = interfaceC2289c;
        this.f20308n = list;
        this.f20300d = interfaceC2266d;
        this.f20314t = nVar;
        this.f20309o = c2316a;
        this.f20310p = fVar;
        this.f20297B = 1;
        if (this.f20296A == null && ((Map) eVar.f12816h.f12819c).containsKey(com.bumptech.glide.d.class)) {
            this.f20296A = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean a() {
        boolean z8;
        synchronized (this.f20299c) {
            if (this.f20297B == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    public final void b() {
        if (!this.f20320z) {
            this.b.a();
            this.m.f(this);
            C.c cVar = this.f20312r;
            if (cVar != null) {
                synchronized (((n) cVar.f349f)) {
                    ((r) cVar.f347c).h((InterfaceC2268f) cVar.f348d);
                }
                this.f20312r = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    public final Drawable c() {
        int i9;
        if (this.f20316v == null) {
            AbstractC2263a abstractC2263a = this.f20305i;
            Drawable drawable = abstractC2263a.f20274i;
            this.f20316v = drawable;
            if (drawable == null && (i9 = abstractC2263a.f20275j) > 0) {
                Resources.Theme theme = abstractC2263a.f20286w;
                Context context = this.f20301e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f20316v = i.g(context, context, i9, theme);
            }
        }
        return this.f20316v;
    }

    @Override // f2.InterfaceC2265c
    public final void clear() {
        synchronized (this.f20299c) {
            try {
                if (!this.f20320z) {
                    this.b.a();
                    if (this.f20297B == 6) {
                        return;
                    }
                    b();
                    B b = this.f20311q;
                    if (b != null) {
                        this.f20311q = null;
                    } else {
                        b = null;
                    }
                    InterfaceC2266d interfaceC2266d = this.f20300d;
                    if (interfaceC2266d == null || interfaceC2266d.j(this)) {
                        this.m.h(c());
                    }
                    this.f20297B = 6;
                    if (b != null) {
                        this.f20314t.getClass();
                        n.f(b);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(String str) {
        StringBuilder c9 = AbstractC2965e.c(str, " this: ");
        c9.append(this.f20298a);
        Log.v("GlideRequest", c9.toString());
    }

    public final void e(x xVar, int i9) {
        int i10;
        int i11;
        this.b.a();
        synchronized (this.f20299c) {
            try {
                xVar.getClass();
                int i12 = this.f20302f.f12817i;
                if (i12 <= i9) {
                    Log.w("Glide", "Load failed for [" + this.f20303g + "] with dimensions [" + this.f20318x + "x" + this.f20319y + "]", xVar);
                    if (i12 <= 4) {
                        xVar.d();
                    }
                }
                Drawable drawable = null;
                this.f20312r = null;
                this.f20297B = 5;
                InterfaceC2266d interfaceC2266d = this.f20300d;
                if (interfaceC2266d != null) {
                    interfaceC2266d.d(this);
                }
                this.f20320z = true;
                try {
                    List list = this.f20308n;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            o.v(it.next());
                            InterfaceC2266d interfaceC2266d2 = this.f20300d;
                            if (interfaceC2266d2 != null) {
                                interfaceC2266d2.getRoot().a();
                                throw null;
                            }
                            throw null;
                        }
                    }
                    InterfaceC2266d interfaceC2266d3 = this.f20300d;
                    if (interfaceC2266d3 == null || interfaceC2266d3.c(this)) {
                        if (this.f20303g == null) {
                            if (this.f20317w == null) {
                                AbstractC2263a abstractC2263a = this.f20305i;
                                Drawable drawable2 = abstractC2263a.f20280q;
                                this.f20317w = drawable2;
                                if (drawable2 == null && (i11 = abstractC2263a.f20281r) > 0) {
                                    Resources.Theme theme = abstractC2263a.f20286w;
                                    Context context = this.f20301e;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.f20317w = i.g(context, context, i11, theme);
                                }
                            }
                            drawable = this.f20317w;
                        }
                        if (drawable == null) {
                            if (this.f20315u == null) {
                                AbstractC2263a abstractC2263a2 = this.f20305i;
                                Drawable drawable3 = abstractC2263a2.f20272g;
                                this.f20315u = drawable3;
                                if (drawable3 == null && (i10 = abstractC2263a2.f20273h) > 0) {
                                    Resources.Theme theme2 = abstractC2263a2.f20286w;
                                    Context context2 = this.f20301e;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.f20315u = i.g(context2, context2, i10, theme2);
                                }
                            }
                            drawable = this.f20315u;
                        }
                        if (drawable == null) {
                            drawable = c();
                        }
                        this.m.d(drawable);
                    }
                    this.f20320z = false;
                } catch (Throwable th) {
                    this.f20320z = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean f(InterfaceC2265c interfaceC2265c) {
        int i9;
        int i10;
        Object obj;
        Class cls;
        AbstractC2263a abstractC2263a;
        com.bumptech.glide.g gVar;
        int i11;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        AbstractC2263a abstractC2263a2;
        com.bumptech.glide.g gVar2;
        int i14;
        boolean equals;
        boolean e4;
        if (!(interfaceC2265c instanceof C2269g)) {
            return false;
        }
        synchronized (this.f20299c) {
            try {
                i9 = this.f20306j;
                i10 = this.f20307k;
                obj = this.f20303g;
                cls = this.f20304h;
                abstractC2263a = this.f20305i;
                gVar = this.l;
                List list = this.f20308n;
                if (list != null) {
                    i11 = list.size();
                } else {
                    i11 = 0;
                }
            } finally {
            }
        }
        C2269g c2269g = (C2269g) interfaceC2265c;
        synchronized (c2269g.f20299c) {
            try {
                i12 = c2269g.f20306j;
                i13 = c2269g.f20307k;
                obj2 = c2269g.f20303g;
                cls2 = c2269g.f20304h;
                abstractC2263a2 = c2269g.f20305i;
                gVar2 = c2269g.l;
                List list2 = c2269g.f20308n;
                if (list2 != null) {
                    i14 = list2.size();
                } else {
                    i14 = 0;
                }
            } finally {
            }
        }
        if (i9 == i12 && i10 == i13) {
            char[] cArr = j2.n.f21025a;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (abstractC2263a == null) {
                    if (abstractC2263a2 == null) {
                        e4 = true;
                    } else {
                        e4 = false;
                    }
                } else {
                    e4 = abstractC2263a.e(abstractC2263a2);
                }
                if (e4 && gVar == gVar2 && i11 == i14) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // f2.InterfaceC2265c
    public final boolean g() {
        boolean z8;
        synchronized (this.f20299c) {
            if (this.f20297B == 6) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final void h() {
        InterfaceC2266d interfaceC2266d;
        int i9;
        synchronized (this.f20299c) {
            try {
                if (!this.f20320z) {
                    this.b.a();
                    int i10 = j2.i.b;
                    this.f20313s = SystemClock.elapsedRealtimeNanos();
                    int i11 = 3;
                    if (this.f20303g == null) {
                        if (j2.n.i(this.f20306j, this.f20307k)) {
                            this.f20318x = this.f20306j;
                            this.f20319y = this.f20307k;
                        }
                        if (this.f20317w == null) {
                            AbstractC2263a abstractC2263a = this.f20305i;
                            Drawable drawable = abstractC2263a.f20280q;
                            this.f20317w = drawable;
                            if (drawable == null && (i9 = abstractC2263a.f20281r) > 0) {
                                Resources.Theme theme = abstractC2263a.f20286w;
                                Context context = this.f20301e;
                                if (theme == null) {
                                    theme = context.getTheme();
                                }
                                this.f20317w = i.g(context, context, i9, theme);
                            }
                        }
                        if (this.f20317w == null) {
                            i11 = 5;
                        }
                        e(new x("Received null model"), i11);
                        return;
                    }
                    int i12 = this.f20297B;
                    if (i12 != 2) {
                        if (i12 == 4) {
                            j(this.f20311q, 5, false);
                            return;
                        }
                        List list = this.f20308n;
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                o.v(it.next());
                            }
                        }
                        this.f20297B = 3;
                        if (j2.n.i(this.f20306j, this.f20307k)) {
                            l(this.f20306j, this.f20307k);
                        } else {
                            this.m.b(this);
                        }
                        int i13 = this.f20297B;
                        if ((i13 == 2 || i13 == 3) && ((interfaceC2266d = this.f20300d) == null || interfaceC2266d.c(this))) {
                            this.m.e(c());
                        }
                        if (f20295C) {
                            d("finished run method in " + j2.i.a(this.f20313s));
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final boolean i() {
        boolean z8;
        synchronized (this.f20299c) {
            if (this.f20297B == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }

    @Override // f2.InterfaceC2265c
    public final boolean isRunning() {
        boolean z8;
        synchronized (this.f20299c) {
            int i9 = this.f20297B;
            if (i9 != 2 && i9 != 3) {
                z8 = false;
            }
            z8 = true;
        }
        return z8;
    }

    public final void j(B b, int i9, boolean z8) {
        Object obj;
        String str;
        this.b.a();
        B b8 = null;
        try {
            synchronized (this.f20299c) {
                try {
                    this.f20312r = null;
                    if (b == null) {
                        e(new x("Expected to receive a Resource<R> with an object of " + this.f20304h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = b.get();
                    try {
                        if (obj2 != null && this.f20304h.isAssignableFrom(obj2.getClass())) {
                            InterfaceC2266d interfaceC2266d = this.f20300d;
                            if (interfaceC2266d != null && !interfaceC2266d.b(this)) {
                                this.f20311q = null;
                                this.f20297B = 4;
                                this.f20314t.getClass();
                                n.f(b);
                                return;
                            }
                            k(b, obj2, i9);
                            return;
                        }
                        this.f20311q = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.f20304h);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(b);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        e(new x(sb.toString()), 5);
                        this.f20314t.getClass();
                        n.f(b);
                    } catch (Throwable th) {
                        b8 = b;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (b8 != null) {
                this.f20314t.getClass();
                n.f(b8);
            }
            throw th3;
        }
    }

    public final void k(B b, Object obj, int i9) {
        InterfaceC2266d interfaceC2266d = this.f20300d;
        if (interfaceC2266d != null) {
            interfaceC2266d.getRoot().a();
        }
        this.f20297B = 4;
        this.f20311q = b;
        if (this.f20302f.f12817i <= 3) {
            Log.d("Glide", "Finished loading " + obj.getClass().getSimpleName() + " from " + AbstractC2914a.o(i9) + " for " + this.f20303g + " with size [" + this.f20318x + "x" + this.f20319y + "] in " + j2.i.a(this.f20313s) + " ms");
        }
        if (interfaceC2266d != null) {
            interfaceC2266d.e(this);
        }
        this.f20320z = true;
        try {
            List list = this.f20308n;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    o.v(it.next());
                    throw null;
                }
            }
            this.f20309o.getClass();
            this.m.c(obj);
            this.f20320z = false;
        } catch (Throwable th) {
            this.f20320z = false;
            throw th;
        }
    }

    public final void l(int i9, int i10) {
        Object obj;
        int round;
        int i11 = i9;
        this.b.a();
        Object obj2 = this.f20299c;
        synchronized (obj2) {
            try {
                try {
                    boolean z8 = f20295C;
                    if (z8) {
                        d("Got onSizeReady in " + j2.i.a(this.f20313s));
                    }
                    if (this.f20297B == 3) {
                        this.f20297B = 2;
                        float f9 = this.f20305i.f20269c;
                        if (i11 != Integer.MIN_VALUE) {
                            i11 = Math.round(i11 * f9);
                        }
                        this.f20318x = i11;
                        if (i10 == Integer.MIN_VALUE) {
                            round = i10;
                        } else {
                            round = Math.round(f9 * i10);
                        }
                        this.f20319y = round;
                        if (z8) {
                            d("finished setup for calling load in " + j2.i.a(this.f20313s));
                        }
                        n nVar = this.f20314t;
                        com.bumptech.glide.e eVar = this.f20302f;
                        Object obj3 = this.f20303g;
                        AbstractC2263a abstractC2263a = this.f20305i;
                        try {
                            obj = obj2;
                            try {
                                this.f20312r = nVar.a(eVar, obj3, abstractC2263a.f20277n, this.f20318x, this.f20319y, abstractC2263a.f20284u, this.f20304h, this.l, abstractC2263a.f20270d, abstractC2263a.f20283t, abstractC2263a.f20278o, abstractC2263a.f20267A, abstractC2263a.f20282s, abstractC2263a.f20276k, abstractC2263a.f20288y, abstractC2263a.f20268B, abstractC2263a.f20289z, this, this.f20310p);
                                if (this.f20297B != 2) {
                                    this.f20312r = null;
                                }
                                if (z8) {
                                    d("finished onSizeReady in " + j2.i.a(this.f20313s));
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // f2.InterfaceC2265c
    public final void pause() {
        synchronized (this.f20299c) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f20299c) {
            obj = this.f20303g;
            cls = this.f20304h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
