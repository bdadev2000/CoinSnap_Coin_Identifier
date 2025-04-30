package M0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.G0;
import androidx.fragment.app.RunnableC0473l;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.ArrayList;

/* renamed from: M0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0223n extends G0 {
    @Override // androidx.fragment.app.G0
    public final void a(View view, Object obj) {
        ((w) obj).b(view);
    }

    @Override // androidx.fragment.app.G0
    public final void b(Object obj, ArrayList arrayList) {
        w wVar = (w) obj;
        if (wVar == null) {
            return;
        }
        int i9 = 0;
        if (wVar instanceof C) {
            C c9 = (C) wVar;
            int size = c9.f1839G.size();
            while (i9 < size) {
                b(c9.O(i9), arrayList);
                i9++;
            }
            return;
        }
        if (!(!G0.k(wVar.f1922g)) && G0.k(wVar.f1923h)) {
            int size2 = arrayList.size();
            while (i9 < size2) {
                wVar.b((View) arrayList.get(i9));
                i9++;
            }
        }
    }

    @Override // androidx.fragment.app.G0
    public final void c(Object obj) {
        t tVar = (t) obj;
        tVar.g();
        tVar.f1904d.a((float) (tVar.f1907g.f1939z + 1));
    }

    @Override // androidx.fragment.app.G0
    public final void d(Object obj, RunnableC0473l runnableC0473l) {
        t tVar = (t) obj;
        tVar.f1906f = runnableC0473l;
        tVar.g();
        tVar.f1904d.a(0.0f);
    }

    @Override // androidx.fragment.app.G0
    public final void e(ViewGroup viewGroup, Object obj) {
        A.a(viewGroup, (w) obj);
    }

    @Override // androidx.fragment.app.G0
    public final boolean g(Object obj) {
        return obj instanceof w;
    }

    @Override // androidx.fragment.app.G0
    public final Object h(Object obj) {
        if (obj != null) {
            return ((w) obj).clone();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, android.view.View$OnAttachStateChangeListener, M0.z] */
    @Override // androidx.fragment.app.G0
    public final Object i(ViewGroup viewGroup, Object obj) {
        w wVar = (w) obj;
        ArrayList arrayList = A.f1837c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (wVar.t()) {
            arrayList.add(viewGroup);
            w clone = wVar.clone();
            C c9 = new C();
            c9.N(clone);
            A.c(viewGroup, c9);
            viewGroup.setTag(R.id.transition_current_scene, null);
            ?? obj2 = new Object();
            obj2.b = c9;
            obj2.f1941c = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj2);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj2);
            viewGroup.invalidate();
            t tVar = new t(c9);
            c9.f1917A = tVar;
            c9.a(tVar);
            return c9.f1917A;
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    @Override // androidx.fragment.app.G0
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.G0
    public final boolean m(Object obj) {
        boolean t9 = ((w) obj).t();
        if (!t9) {
            Log.v(FragmentManager.TAG, "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return t9;
    }

    @Override // androidx.fragment.app.G0
    public final Object n(Object obj, Object obj2, Object obj3) {
        w wVar = (w) obj;
        w wVar2 = (w) obj2;
        w wVar3 = (w) obj3;
        if (wVar != null && wVar2 != null) {
            C c9 = new C();
            c9.N(wVar);
            c9.N(wVar2);
            c9.f1840H = false;
            wVar = c9;
        } else if (wVar == null) {
            if (wVar2 != null) {
                wVar = wVar2;
            } else {
                wVar = null;
            }
        }
        if (wVar3 != null) {
            C c10 = new C();
            if (wVar != null) {
                c10.N(wVar);
            }
            c10.N(wVar3);
            return c10;
        }
        return wVar;
    }

    @Override // androidx.fragment.app.G0
    public final Object o(Object obj, Object obj2) {
        C c9 = new C();
        if (obj != null) {
            c9.N((w) obj);
        }
        c9.N((w) obj2);
        return c9;
    }

    @Override // androidx.fragment.app.G0
    public final void p(Object obj, View view, ArrayList arrayList) {
        ((w) obj).a(new C0220k(view, arrayList));
    }

    @Override // androidx.fragment.app.G0
    public final void q(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((w) obj).a(new C0221l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.G0
    public final void r(Object obj, float f9) {
        t tVar = (t) obj;
        boolean z8 = tVar.b;
        if (z8) {
            w wVar = tVar.f1907g;
            long j7 = wVar.f1939z;
            long j9 = f9 * ((float) j7);
            if (j9 == 0) {
                j9 = 1;
            }
            if (j9 == j7) {
                j9 = j7 - 1;
            }
            if (tVar.f1904d == null) {
                long j10 = tVar.f1902a;
                if (j9 != j10 && z8) {
                    if (!tVar.f1903c) {
                        if (j9 == 0 && j10 > 0) {
                            j9 = -1;
                        } else if (j9 == j7 && j10 < j7) {
                            j9 = j7 + 1;
                        }
                        if (j9 != j10) {
                            wVar.E(j9, j10);
                            tVar.f1902a = j9;
                        }
                    }
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    D0.l lVar = tVar.f1905e;
                    int i9 = (lVar.b + 1) % 20;
                    lVar.b = i9;
                    ((long[]) lVar.f626c)[i9] = currentAnimationTimeMillis;
                    ((float[]) lVar.f627d)[i9] = (float) j9;
                    return;
                }
                return;
            }
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, M0.j] */
    @Override // androidx.fragment.app.G0
    public final void s(View view, Object obj) {
        if (view != null) {
            G0.j(view, new Rect());
            ((w) obj).G(new Object());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, M0.j] */
    @Override // androidx.fragment.app.G0
    public final void t(Object obj, Rect rect) {
        ((w) obj).G(new Object());
    }

    @Override // androidx.fragment.app.G0
    public final void u(Fragment fragment, Object obj, P.e eVar, RunnableC0473l runnableC0473l) {
        v(obj, eVar, null, runnableC0473l);
    }

    @Override // androidx.fragment.app.G0
    public final void v(Object obj, P.e eVar, D3.b bVar, Runnable runnable) {
        w wVar = (w) obj;
        C0218i c0218i = new C0218i(bVar, wVar, runnable);
        synchronized (eVar) {
            while (eVar.f2261c) {
                try {
                    try {
                        eVar.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (eVar.b != c0218i) {
                eVar.b = c0218i;
                if (eVar.f2260a) {
                    Runnable runnable2 = (Runnable) c0218i.f1883c;
                    if (runnable2 == null) {
                        ((w) c0218i.f1885f).cancel();
                        ((Runnable) c0218i.f1884d).run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        wVar.a(new C0222m(runnable));
    }

    @Override // androidx.fragment.app.G0
    public final void w(Object obj, View view, ArrayList arrayList) {
        C c9 = (C) obj;
        ArrayList arrayList2 = c9.f1923h;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            G0.f((View) arrayList.get(i9), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(c9, arrayList);
    }

    @Override // androidx.fragment.app.G0
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C c9 = (C) obj;
        if (c9 != null) {
            ArrayList arrayList3 = c9.f1923h;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(c9, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.G0
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        C c9 = new C();
        c9.N((w) obj);
        return c9;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        int size;
        w wVar = (w) obj;
        int i9 = 0;
        if (wVar instanceof C) {
            C c9 = (C) wVar;
            int size2 = c9.f1839G.size();
            while (i9 < size2) {
                z(c9.O(i9), arrayList, arrayList2);
                i9++;
            }
            return;
        }
        if (!(!G0.k(wVar.f1922g))) {
            ArrayList arrayList3 = wVar.f1923h;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i9 < size) {
                    wVar.b((View) arrayList2.get(i9));
                    i9++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    wVar.B((View) arrayList.get(size3));
                }
            }
        }
    }
}
