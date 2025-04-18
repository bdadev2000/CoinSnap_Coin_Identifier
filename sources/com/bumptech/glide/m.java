package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class m extends s4.a {
    public final Context C;
    public final o D;
    public final Class E;
    public final g F;
    public a G;
    public Object H;
    public ArrayList I;
    public m J;
    public m K;
    public final boolean L = true;
    public boolean M;
    public boolean N;

    static {
    }

    public m(b bVar, o oVar, Class cls, Context context) {
        s4.f fVar;
        this.D = oVar;
        this.E = cls;
        this.C = context;
        Map map = oVar.f9752b.f9608d.f9668f;
        a aVar = (a) map.get(cls);
        if (aVar == null) {
            for (Map.Entry entry : map.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.G = aVar == null ? g.f9663k : aVar;
        this.F = bVar.f9608d;
        Iterator it = oVar.f9760k.iterator();
        while (it.hasNext()) {
            r((s4.e) it.next());
        }
        synchronized (oVar) {
            fVar = oVar.f9761l;
        }
        s(fVar);
    }

    @Override // s4.a
    public final s4.a a(s4.a aVar) {
        c.l(aVar);
        return (m) super.a(aVar);
    }

    @Override // s4.a
    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (super.equals(mVar)) {
                if (Objects.equals(this.E, mVar.E) && this.G.equals(mVar.G) && Objects.equals(this.H, mVar.H) && Objects.equals(this.I, mVar.I) && Objects.equals(this.J, mVar.J) && Objects.equals(this.K, mVar.K) && this.L == mVar.L && this.M == mVar.M) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // s4.a
    public final int hashCode() {
        return w4.m.g(w4.m.g(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(w4.m.f(super.hashCode(), this.E), this.G), this.H), this.I), this.J), this.K), null), this.L), this.M);
    }

    public final m r(s4.e eVar) {
        if (this.f24204x) {
            return b().r(eVar);
        }
        if (eVar != null) {
            if (this.I == null) {
                this.I = new ArrayList();
            }
            this.I.add(eVar);
        }
        j();
        return this;
    }

    public final m s(s4.a aVar) {
        c.l(aVar);
        return (m) super.a(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final s4.c t(int i10, int i11, a aVar, h hVar, s4.a aVar2, s4.d dVar, t4.e eVar, Object obj) {
        s4.b bVar;
        s4.d dVar2;
        s4.h z10;
        int i12;
        a aVar3;
        h hVar2;
        int i13;
        int i14;
        if (this.K != null) {
            dVar2 = new s4.b(obj, dVar);
            bVar = dVar2;
        } else {
            bVar = 0;
            dVar2 = dVar;
        }
        m mVar = this.J;
        if (mVar != null) {
            if (!this.N) {
                a aVar4 = mVar.G;
                if (mVar.L) {
                    aVar3 = aVar;
                } else {
                    aVar3 = aVar4;
                }
                if (s4.a.e(mVar.f24184b, 8)) {
                    hVar2 = this.J.f24187f;
                } else {
                    int ordinal = hVar.ordinal();
                    if (ordinal != 0 && ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                hVar2 = h.NORMAL;
                            } else {
                                throw new IllegalArgumentException("unknown priority: " + this.f24187f);
                            }
                        } else {
                            hVar2 = h.HIGH;
                        }
                    } else {
                        hVar2 = h.IMMEDIATE;
                    }
                }
                h hVar3 = hVar2;
                m mVar2 = this.J;
                int i15 = mVar2.f24194m;
                int i16 = mVar2.f24193l;
                if (w4.m.h(i10, i11)) {
                    m mVar3 = this.J;
                    if (!w4.m.h(mVar3.f24194m, mVar3.f24193l)) {
                        i14 = aVar2.f24194m;
                        i13 = aVar2.f24193l;
                        s4.i iVar = new s4.i(obj, dVar2);
                        s4.h z11 = z(i10, i11, aVar, hVar, aVar2, iVar, eVar, obj);
                        this.N = true;
                        m mVar4 = this.J;
                        s4.c t5 = mVar4.t(i14, i13, aVar3, hVar3, mVar4, iVar, eVar, obj);
                        this.N = false;
                        iVar.f24237c = z11;
                        iVar.f24238d = t5;
                        z10 = iVar;
                    }
                }
                i13 = i16;
                i14 = i15;
                s4.i iVar2 = new s4.i(obj, dVar2);
                s4.h z112 = z(i10, i11, aVar, hVar, aVar2, iVar2, eVar, obj);
                this.N = true;
                m mVar42 = this.J;
                s4.c t52 = mVar42.t(i14, i13, aVar3, hVar3, mVar42, iVar2, eVar, obj);
                this.N = false;
                iVar2.f24237c = z112;
                iVar2.f24238d = t52;
                z10 = iVar2;
            } else {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
        } else {
            z10 = z(i10, i11, aVar, hVar, aVar2, dVar2, eVar, obj);
        }
        if (bVar == 0) {
            return z10;
        }
        m mVar5 = this.K;
        int i17 = mVar5.f24194m;
        int i18 = mVar5.f24193l;
        if (w4.m.h(i10, i11)) {
            m mVar6 = this.K;
            if (!w4.m.h(mVar6.f24194m, mVar6.f24193l)) {
                int i19 = aVar2.f24194m;
                i12 = aVar2.f24193l;
                i17 = i19;
                m mVar7 = this.K;
                s4.c t10 = mVar7.t(i17, i12, mVar7.G, mVar7.f24187f, mVar7, bVar, eVar, obj);
                bVar.f24208c = z10;
                bVar.f24209d = t10;
                return bVar;
            }
        }
        i12 = i18;
        m mVar72 = this.K;
        s4.c t102 = mVar72.t(i17, i12, mVar72.G, mVar72.f24187f, mVar72, bVar, eVar, obj);
        bVar.f24208c = z10;
        bVar.f24209d = t102;
        return bVar;
    }

    @Override // s4.a
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final m clone() {
        m mVar = (m) super.clone();
        mVar.G = mVar.G.clone();
        if (mVar.I != null) {
            mVar.I = new ArrayList(mVar.I);
        }
        m mVar2 = mVar.J;
        if (mVar2 != null) {
            mVar.J = mVar2.b();
        }
        m mVar3 = mVar.K;
        if (mVar3 != null) {
            mVar.K = mVar3.b();
        }
        return mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(android.widget.ImageView r5) {
        /*
            r4 = this;
            w4.m.a()
            com.bumptech.glide.c.l(r5)
            int r0 = r4.f24184b
            r1 = 2048(0x800, float:2.87E-42)
            boolean r0 = s4.a.e(r0, r1)
            r1 = 1
            if (r0 != 0) goto L71
            boolean r0 = r4.f24197p
            if (r0 == 0) goto L71
            android.widget.ImageView$ScaleType r0 = r5.getScaleType()
            if (r0 == 0) goto L71
            int[] r0 = com.bumptech.glide.l.a
            android.widget.ImageView$ScaleType r2 = r5.getScaleType()
            int r2 = r2.ordinal()
            r0 = r0[r2]
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
            com.bumptech.glide.m r0 = r4.b()
            n4.m r2 = n4.n.f22421b
            n4.i r3 = new n4.i
            r3.<init>()
            s4.a r0 = r0.f(r2, r3)
            r0.A = r1
            goto L72
        L3d:
            com.bumptech.glide.m r0 = r4.b()
            n4.m r2 = n4.n.a
            n4.t r3 = new n4.t
            r3.<init>()
            s4.a r0 = r0.f(r2, r3)
            r0.A = r1
            goto L72
        L4f:
            com.bumptech.glide.m r0 = r4.b()
            n4.m r2 = n4.n.f22421b
            n4.i r3 = new n4.i
            r3.<init>()
            s4.a r0 = r0.f(r2, r3)
            r0.A = r1
            goto L72
        L61:
            com.bumptech.glide.m r0 = r4.b()
            n4.m r2 = n4.n.f22422c
            n4.h r3 = new n4.h
            r3.<init>()
            s4.a r0 = r0.f(r2, r3)
            goto L72
        L71:
            r0 = r4
        L72:
            com.bumptech.glide.g r2 = r4.F
            com.facebook.b r2 = r2.f9665c
            r2.getClass()
            java.lang.Class<android.graphics.Bitmap> r2 = android.graphics.Bitmap.class
            java.lang.Class r3 = r4.E
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8a
            t4.b r1 = new t4.b
            r2 = 0
            r1.<init>(r5, r2)
            goto L98
        L8a:
            java.lang.Class<android.graphics.drawable.Drawable> r2 = android.graphics.drawable.Drawable.class
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L9c
            t4.b r2 = new t4.b
            r2.<init>(r5, r1)
            r1 = r2
        L98:
            r4.w(r1, r0)
            return
        L9c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled class: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", try .as*(Class).transcode(ResourceTranscoder)"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.m.v(android.widget.ImageView):void");
    }

    public final void w(t4.e eVar, s4.a aVar) {
        boolean z10;
        c.l(eVar);
        if (this.M) {
            Object obj = new Object();
            s4.c t5 = t(aVar.f24194m, aVar.f24193l, this.G, aVar.f24187f, aVar, null, eVar, obj);
            s4.c e2 = eVar.e();
            if (t5.h(e2)) {
                if (!aVar.f24192k && e2.g()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    c.l(e2);
                    if (!e2.isRunning()) {
                        e2.j();
                        return;
                    }
                    return;
                }
            }
            this.D.i(eVar);
            eVar.a(t5);
            o oVar = this.D;
            synchronized (oVar) {
                oVar.f9757h.f9749b.add(eVar);
                r rVar = oVar.f9755f;
                ((Set) rVar.f9742c).add(t5);
                if (!rVar.f9743d) {
                    t5.j();
                } else {
                    t5.clear();
                    if (Log.isLoggable("RequestTracker", 2)) {
                        Log.v("RequestTracker", "Paused, delaying request");
                    }
                    ((Set) rVar.f9744f).add(t5);
                }
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    public final m x(rg.a aVar) {
        if (this.f24204x) {
            return b().x(aVar);
        }
        this.I = null;
        return r(aVar);
    }

    public final m y(Object obj) {
        if (this.f24204x) {
            return b().y(obj);
        }
        this.H = obj;
        this.M = true;
        j();
        return this;
    }

    public final s4.h z(int i10, int i11, a aVar, h hVar, s4.a aVar2, s4.d dVar, t4.e eVar, Object obj) {
        Context context = this.C;
        Object obj2 = this.H;
        Class cls = this.E;
        ArrayList arrayList = this.I;
        g gVar = this.F;
        g4.r rVar = gVar.f9669g;
        aVar.getClass();
        return new s4.h(context, gVar, obj, obj2, cls, aVar2, i10, i11, hVar, eVar, arrayList, dVar, rVar);
    }
}
