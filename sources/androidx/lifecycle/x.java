package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x extends p {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1833b;

    /* renamed from: c, reason: collision with root package name */
    public m.a f1834c;

    /* renamed from: d, reason: collision with root package name */
    public o f1835d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1836e;

    /* renamed from: f, reason: collision with root package name */
    public int f1837f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1838g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1839h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1840i;

    public x(v provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f1833b = true;
        this.f1834c = new m.a();
        this.f1835d = o.INITIALIZED;
        this.f1840i = new ArrayList();
        this.f1836e = new WeakReference(provider);
    }

    @Override // androidx.lifecycle.p
    public final void a(u observer) {
        v vVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("addObserver");
        o oVar = this.f1835d;
        o oVar2 = o.DESTROYED;
        if (oVar != oVar2) {
            oVar2 = o.INITIALIZED;
        }
        w wVar = new w(observer, oVar2);
        if (((w) this.f1834c.b(observer, wVar)) != null || (vVar = (v) this.f1836e.get()) == null) {
            return;
        }
        if (this.f1837f == 0 && !this.f1838g) {
            z10 = false;
        } else {
            z10 = true;
        }
        o c10 = c(observer);
        this.f1837f++;
        while (wVar.a.compareTo(c10) < 0 && this.f1834c.f21406g.containsKey(observer)) {
            o oVar3 = wVar.a;
            ArrayList arrayList = this.f1840i;
            arrayList.add(oVar3);
            l lVar = n.Companion;
            o oVar4 = wVar.a;
            lVar.getClass();
            n b3 = l.b(oVar4);
            if (b3 != null) {
                wVar.a(vVar, b3);
                arrayList.remove(arrayList.size() - 1);
                c10 = c(observer);
            } else {
                throw new IllegalStateException("no event up from " + wVar.a);
            }
        }
        if (!z10) {
            h();
        }
        this.f1837f--;
    }

    @Override // androidx.lifecycle.p
    public final void b(u observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f1834c.c(observer);
    }

    public final o c(u uVar) {
        m.c cVar;
        o state1;
        w wVar;
        m.a aVar = this.f1834c;
        o oVar = null;
        if (aVar.f21406g.containsKey(uVar)) {
            cVar = ((m.c) aVar.f21406g.get(uVar)).f21411f;
        } else {
            cVar = null;
        }
        if (cVar != null && (wVar = (w) cVar.f21409c) != null) {
            state1 = wVar.a;
        } else {
            state1 = null;
        }
        ArrayList arrayList = this.f1840i;
        if (!arrayList.isEmpty()) {
            oVar = (o) arrayList.get(arrayList.size() - 1);
        }
        o state12 = this.f1835d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (oVar == null || oVar.compareTo(state1) >= 0) {
            return state1;
        }
        return oVar;
    }

    public final void d(String str) {
        if (this.f1833b && !l.b.v().w()) {
            throw new IllegalStateException(com.applovin.impl.mediation.ads.e.f("Method ", str, " must be called on the main thread").toString());
        }
    }

    public final void e(n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(o oVar) {
        boolean z10;
        o oVar2 = this.f1835d;
        if (oVar2 == oVar) {
            return;
        }
        o oVar3 = o.INITIALIZED;
        o oVar4 = o.DESTROYED;
        if (oVar2 == oVar3 && oVar == oVar4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f1835d = oVar;
            if (!this.f1838g && this.f1837f == 0) {
                this.f1838g = true;
                h();
                this.f1838g = false;
                if (this.f1835d == oVar4) {
                    this.f1834c = new m.a();
                    return;
                }
                return;
            }
            this.f1839h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f1835d + " in component " + this.f1836e.get()).toString());
    }

    public final void g(o state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.h():void");
    }
}
