package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import c2.p;
import com.mbridge.msdk.foundation.entity.o;
import f2.AbstractC2263a;
import f2.C2264b;
import f2.C2267e;
import f2.C2269g;
import f2.C2270h;
import f2.InterfaceC2265c;
import f2.InterfaceC2266d;
import g2.InterfaceC2289c;
import j2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class k extends AbstractC2263a {

    /* renamed from: C, reason: collision with root package name */
    public final Context f12834C;

    /* renamed from: D, reason: collision with root package name */
    public final m f12835D;

    /* renamed from: E, reason: collision with root package name */
    public final Class f12836E;

    /* renamed from: F, reason: collision with root package name */
    public final e f12837F;

    /* renamed from: G, reason: collision with root package name */
    public a f12838G;

    /* renamed from: H, reason: collision with root package name */
    public Object f12839H;

    /* renamed from: I, reason: collision with root package name */
    public ArrayList f12840I;

    /* renamed from: J, reason: collision with root package name */
    public k f12841J;

    /* renamed from: K, reason: collision with root package name */
    public k f12842K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f12843L = true;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12844M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f12845N;

    static {
    }

    public k(b bVar, m mVar, Class cls, Context context) {
        C2267e c2267e;
        this.f12835D = mVar;
        this.f12836E = cls;
        this.f12834C = context;
        Map map = mVar.b.f12792d.f12814f;
        a aVar = (a) map.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.f12838G = aVar == null ? e.f12809k : aVar;
        this.f12837F = bVar.f12792d;
        Iterator it = mVar.f12874k.iterator();
        while (it.hasNext()) {
            o.v(it.next());
            s();
        }
        synchronized (mVar) {
            c2267e = mVar.l;
        }
        a(c2267e);
    }

    @Override // f2.AbstractC2263a
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!super.equals(kVar)) {
            return false;
        }
        if (!Objects.equals(this.f12836E, kVar.f12836E) || !this.f12838G.equals(kVar.f12838G) || !Objects.equals(this.f12839H, kVar.f12839H) || !Objects.equals(this.f12840I, kVar.f12840I) || !Objects.equals(this.f12841J, kVar.f12841J) || !Objects.equals(this.f12842K, kVar.f12842K) || this.f12843L != kVar.f12843L || this.f12844M != kVar.f12844M) {
            return false;
        }
        return true;
    }

    @Override // f2.AbstractC2263a
    public final int hashCode() {
        return n.g(this.f12844M ? 1 : 0, n.g(this.f12843L ? 1 : 0, n.h(n.h(n.h(n.h(n.h(n.h(n.h(super.hashCode(), this.f12836E), this.f12838G), this.f12839H), this.f12840I), this.f12841J), this.f12842K), null)));
    }

    public final k s() {
        if (this.f20287x) {
            return clone().s();
        }
        k();
        return this;
    }

    @Override // f2.AbstractC2263a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final k a(AbstractC2263a abstractC2263a) {
        j2.g.b(abstractC2263a);
        return (k) super.a(abstractC2263a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC2265c u(Object obj, InterfaceC2289c interfaceC2289c, InterfaceC2266d interfaceC2266d, a aVar, g gVar, int i9, int i10, AbstractC2263a abstractC2263a) {
        InterfaceC2266d interfaceC2266d2;
        InterfaceC2266d interfaceC2266d3;
        InterfaceC2266d interfaceC2266d4;
        C2269g c2269g;
        int i11;
        int i12;
        a aVar2;
        g gVar2;
        int i13;
        int i14;
        if (this.f12842K != null) {
            interfaceC2266d3 = new C2264b(obj, interfaceC2266d);
            interfaceC2266d2 = interfaceC2266d3;
        } else {
            interfaceC2266d2 = null;
            interfaceC2266d3 = interfaceC2266d;
        }
        k kVar = this.f12841J;
        if (kVar != null) {
            if (!this.f12845N) {
                a aVar3 = kVar.f12838G;
                if (kVar.f12843L) {
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar3;
                }
                if (AbstractC2263a.f(kVar.b, 8)) {
                    gVar2 = this.f12841J.f20271f;
                } else {
                    int ordinal = gVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                gVar2 = g.f12821d;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f20271f);
                            }
                        } else {
                            gVar2 = g.f12820c;
                        }
                    } else {
                        gVar2 = g.b;
                    }
                }
                g gVar3 = gVar2;
                k kVar2 = this.f12841J;
                int i15 = kVar2.m;
                int i16 = kVar2.l;
                if (n.i(i9, i10)) {
                    k kVar3 = this.f12841J;
                    if (!n.i(kVar3.m, kVar3.l)) {
                        i14 = abstractC2263a.m;
                        i13 = abstractC2263a.l;
                        C2270h c2270h = new C2270h(obj, interfaceC2266d3);
                        Object obj2 = this.f12839H;
                        ArrayList arrayList = this.f12840I;
                        e eVar = this.f12837F;
                        interfaceC2266d4 = interfaceC2266d2;
                        C2269g c2269g2 = new C2269g(this.f12834C, eVar, obj, obj2, this.f12836E, abstractC2263a, i9, i10, gVar, interfaceC2289c, arrayList, c2270h, eVar.f12815g, aVar.b);
                        this.f12845N = true;
                        k kVar4 = this.f12841J;
                        InterfaceC2265c u8 = kVar4.u(obj, interfaceC2289c, c2270h, aVar2, gVar3, i14, i13, kVar4);
                        this.f12845N = false;
                        c2270h.f20322c = c2269g2;
                        c2270h.f20323d = u8;
                        c2269g = c2270h;
                    }
                }
                i13 = i16;
                i14 = i15;
                C2270h c2270h2 = new C2270h(obj, interfaceC2266d3);
                Object obj22 = this.f12839H;
                ArrayList arrayList2 = this.f12840I;
                e eVar2 = this.f12837F;
                interfaceC2266d4 = interfaceC2266d2;
                C2269g c2269g22 = new C2269g(this.f12834C, eVar2, obj, obj22, this.f12836E, abstractC2263a, i9, i10, gVar, interfaceC2289c, arrayList2, c2270h2, eVar2.f12815g, aVar.b);
                this.f12845N = true;
                k kVar42 = this.f12841J;
                InterfaceC2265c u82 = kVar42.u(obj, interfaceC2289c, c2270h2, aVar2, gVar3, i14, i13, kVar42);
                this.f12845N = false;
                c2270h2.f20322c = c2269g22;
                c2270h2.f20323d = u82;
                c2269g = c2270h2;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            interfaceC2266d4 = interfaceC2266d2;
            Object obj3 = this.f12839H;
            ArrayList arrayList3 = this.f12840I;
            e eVar3 = this.f12837F;
            c2269g = new C2269g(this.f12834C, eVar3, obj, obj3, this.f12836E, abstractC2263a, i9, i10, gVar, interfaceC2289c, arrayList3, interfaceC2266d3, eVar3.f12815g, aVar.b);
        }
        C2264b c2264b = interfaceC2266d4;
        if (c2264b == 0) {
            return c2269g;
        }
        k kVar5 = this.f12842K;
        int i17 = kVar5.m;
        int i18 = kVar5.l;
        if (n.i(i9, i10)) {
            k kVar6 = this.f12842K;
            if (!n.i(kVar6.m, kVar6.l)) {
                i12 = abstractC2263a.m;
                i11 = abstractC2263a.l;
                k kVar7 = this.f12842K;
                InterfaceC2265c u9 = kVar7.u(obj, interfaceC2289c, c2264b, kVar7.f12838G, kVar7.f20271f, i12, i11, kVar7);
                c2264b.f20291c = c2269g;
                c2264b.f20292d = u9;
                return c2264b;
            }
        }
        i11 = i18;
        i12 = i17;
        k kVar72 = this.f12842K;
        InterfaceC2265c u92 = kVar72.u(obj, interfaceC2289c, c2264b, kVar72.f12838G, kVar72.f20271f, i12, i11, kVar72);
        c2264b.f20291c = c2269g;
        c2264b.f20292d = u92;
        return c2264b;
    }

    @Override // f2.AbstractC2263a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final k clone() {
        k kVar = (k) super.clone();
        kVar.f12838G = kVar.f12838G.clone();
        if (kVar.f12840I != null) {
            kVar.f12840I = new ArrayList(kVar.f12840I);
        }
        k kVar2 = kVar.f12841J;
        if (kVar2 != null) {
            kVar.f12841J = kVar2.clone();
        }
        k kVar3 = kVar.f12842K;
        if (kVar3 != null) {
            kVar.f12842K = kVar3.clone();
        }
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Type inference failed for: r2v3, types: [W1.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [W1.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [W1.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [W1.e, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(android.widget.ImageView r5) {
        /*
            r4 = this;
            j2.n.a()
            j2.g.b(r5)
            int r0 = r4.b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = f2.AbstractC2263a.f(r0, r1)
            if (r0 != 0) goto L71
            boolean r0 = r4.f20279p
            if (r0 == 0) goto L71
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L71
            int[] r0 = com.bumptech.glide.j.f12833a
            android.widget.ImageView$ScaleType r1 = r5.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            switch(r0) {
                case 1: goto L61;
                case 2: goto L4f;
                case 3: goto L3d;
                case 4: goto L3d;
                case 5: goto L3d;
                case 6: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L71
        L2b:
            com.bumptech.glide.k r0 = r4.clone()
            W1.o r2 = W1.o.f3579c
            W1.i r3 = new W1.i
            r3.<init>()
            f2.a r0 = r0.g(r2, r3)
            r0.f20267A = r1
            goto L72
        L3d:
            com.bumptech.glide.k r0 = r4.clone()
            W1.o r2 = W1.o.b
            W1.v r3 = new W1.v
            r3.<init>()
            f2.a r0 = r0.g(r2, r3)
            r0.f20267A = r1
            goto L72
        L4f:
            com.bumptech.glide.k r0 = r4.clone()
            W1.o r2 = W1.o.f3579c
            W1.i r3 = new W1.i
            r3.<init>()
            f2.a r0 = r0.g(r2, r3)
            r0.f20267A = r1
            goto L72
        L61:
            com.bumptech.glide.k r0 = r4.clone()
            W1.o r1 = W1.o.f3580d
            W1.h r2 = new W1.h
            r2.<init>()
            f2.a r0 = r0.g(r1, r2)
            goto L72
        L71:
            r0 = r4
        L72:
            com.bumptech.glide.e r1 = r4.f12837F
            L4.f r1 = r1.f12811c
            r1.getClass()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            java.lang.Class r2 = r4.f12836E
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L8a
            g2.a r1 = new g2.a
            r2 = 0
            r1.<init>(r5, r2)
            goto L98
        L8a:
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L9c
            g2.a r1 = new g2.a
            r2 = 1
            r1.<init>(r5, r2)
        L98:
            r4.x(r1, r0)
            return
        L9c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.k.w(android.widget.ImageView):void");
    }

    public final void x(InterfaceC2289c interfaceC2289c, AbstractC2263a abstractC2263a) {
        j2.g.b(interfaceC2289c);
        if (this.f12844M) {
            InterfaceC2265c u8 = u(new Object(), interfaceC2289c, null, this.f12838G, abstractC2263a.f20271f, abstractC2263a.m, abstractC2263a.l, abstractC2263a);
            InterfaceC2265c g9 = interfaceC2289c.g();
            if (u8.f(g9) && (abstractC2263a.f20276k || !g9.i())) {
                j2.g.c(g9, "Argument must not be null");
                if (!g9.isRunning()) {
                    g9.h();
                    return;
                }
                return;
            }
            this.f12835D.i(interfaceC2289c);
            interfaceC2289c.a(u8);
            m mVar = this.f12835D;
            synchronized (mVar) {
                mVar.f12871h.b.add(interfaceC2289c);
                p pVar = mVar.f12869f;
                ((Set) pVar.f5404f).add(u8);
                if (!pVar.f5403d) {
                    u8.h();
                } else {
                    u8.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((HashSet) pVar.f5402c).add(u8);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final k y(Object obj) {
        if (this.f20287x) {
            return clone().y(obj);
        }
        this.f12839H = obj;
        this.f12844M = true;
        k();
        return this;
    }
}
