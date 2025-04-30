package M0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import q4.C2645d;

/* loaded from: classes.dex */
public abstract class w implements Cloneable {

    /* renamed from: C, reason: collision with root package name */
    public static final Animator[] f1913C = new Animator[0];

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1914D = {2, 1, 3, 4};

    /* renamed from: E, reason: collision with root package name */
    public static final C2645d f1915E = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static final ThreadLocal f1916F = new ThreadLocal();

    /* renamed from: A, reason: collision with root package name */
    public t f1917A;

    /* renamed from: B, reason: collision with root package name */
    public long f1918B;
    public ArrayList m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f1927n;

    /* renamed from: o, reason: collision with root package name */
    public u[] f1928o;

    /* renamed from: x, reason: collision with root package name */
    public C0219j f1937x;

    /* renamed from: z, reason: collision with root package name */
    public long f1939z;
    public final String b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f1919c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f1920d = -1;

    /* renamed from: f, reason: collision with root package name */
    public TimeInterpolator f1921f = null;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1922g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1923h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public b1.h f1924i = new b1.h(2);

    /* renamed from: j, reason: collision with root package name */
    public b1.h f1925j = new b1.h(2);

    /* renamed from: k, reason: collision with root package name */
    public C f1926k = null;
    public final int[] l = f1914D;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1929p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public Animator[] f1930q = f1913C;

    /* renamed from: r, reason: collision with root package name */
    public int f1931r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1932s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1933t = false;

    /* renamed from: u, reason: collision with root package name */
    public w f1934u = null;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f1935v = null;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f1936w = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public C2645d f1938y = f1915E;

    public static void c(b1.h hVar, View view, F f9) {
        ((x.b) hVar.b).put(view, f9);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) hVar.f5270c;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            x.b bVar = (x.b) hVar.f5272f;
            if (bVar.containsKey(transitionName)) {
                bVar.put(transitionName, null);
            } else {
                bVar.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                x.f fVar = (x.f) hVar.f5271d;
                if (fVar.b) {
                    fVar.c();
                }
                if (x.e.b(fVar.f24070c, fVar.f24072f, itemIdAtPosition) >= 0) {
                    View view2 = (View) fVar.d(null, itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        fVar.f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                fVar.f(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [x.l, java.lang.Object, x.b] */
    public static x.b p() {
        ThreadLocal threadLocal = f1916F;
        x.b bVar = (x.b) threadLocal.get();
        if (bVar == null) {
            ?? lVar = new x.l();
            threadLocal.set(lVar);
            return lVar;
        }
        return bVar;
    }

    public static boolean w(F f9, F f10, String str) {
        Object obj = f9.f1845a.get(str);
        Object obj2 = f10.f1845a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public w A(u uVar) {
        w wVar;
        ArrayList arrayList = this.f1935v;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(uVar) && (wVar = this.f1934u) != null) {
            wVar.A(uVar);
        }
        if (this.f1935v.size() == 0) {
            this.f1935v = null;
        }
        return this;
    }

    public void B(View view) {
        this.f1923h.remove(view);
    }

    public void C(View view) {
        if (this.f1932s) {
            if (!this.f1933t) {
                ArrayList arrayList = this.f1929p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1930q);
                this.f1930q = f1913C;
                for (int i9 = size - 1; i9 >= 0; i9--) {
                    Animator animator = animatorArr[i9];
                    animatorArr[i9] = null;
                    animator.resume();
                }
                this.f1930q = animatorArr;
                x(this, v.f1912V7, false);
            }
            this.f1932s = false;
        }
    }

    public void D() {
        L();
        x.b p2 = p();
        Iterator it = this.f1936w.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p2.containsKey(animator)) {
                L();
                if (animator != null) {
                    animator.addListener(new C0225p(this, p2));
                    long j7 = this.f1920d;
                    if (j7 >= 0) {
                        animator.setDuration(j7);
                    }
                    long j9 = this.f1919c;
                    if (j9 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j9);
                    }
                    TimeInterpolator timeInterpolator = this.f1921f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new B3.c(this, 1));
                    animator.start();
                }
            }
        }
        this.f1936w.clear();
        m();
    }

    public void E(long j7, long j9) {
        boolean z8;
        long j10 = this.f1939z;
        if (j7 < j9) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((j9 < 0 && j7 >= 0) || (j9 > j10 && j7 <= j10)) {
            this.f1933t = false;
            x(this, v.f1908R7, z8);
        }
        ArrayList arrayList = this.f1929p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1930q);
        this.f1930q = f1913C;
        for (int i9 = 0; i9 < size; i9++) {
            Animator animator = animatorArr[i9];
            animatorArr[i9] = null;
            r.b(animator, Math.min(Math.max(0L, j7), r.a(animator)));
        }
        this.f1930q = animatorArr;
        if ((j7 > j10 && j9 <= j10) || (j7 < 0 && j9 >= 0)) {
            if (j7 > j10) {
                this.f1933t = true;
            }
            x(this, v.f1909S7, z8);
        }
    }

    public void F(long j7) {
        this.f1920d = j7;
    }

    public void G(C0219j c0219j) {
        this.f1937x = c0219j;
    }

    public void H(TimeInterpolator timeInterpolator) {
        this.f1921f = timeInterpolator;
    }

    public void I(C2645d c2645d) {
        if (c2645d == null) {
            this.f1938y = f1915E;
        } else {
            this.f1938y = c2645d;
        }
    }

    public void K(long j7) {
        this.f1919c = j7;
    }

    public final void L() {
        if (this.f1931r == 0) {
            x(this, v.f1908R7, false);
            this.f1933t = false;
        }
        this.f1931r++;
    }

    public String M(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f1920d != -1) {
            sb.append("dur(");
            sb.append(this.f1920d);
            sb.append(") ");
        }
        if (this.f1919c != -1) {
            sb.append("dly(");
            sb.append(this.f1919c);
            sb.append(") ");
        }
        if (this.f1921f != null) {
            sb.append("interp(");
            sb.append(this.f1921f);
            sb.append(") ");
        }
        ArrayList arrayList = this.f1922g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1923h;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (i9 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i9));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    if (i10 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i10));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(u uVar) {
        if (this.f1935v == null) {
            this.f1935v = new ArrayList();
        }
        this.f1935v.add(uVar);
    }

    public void b(View view) {
        this.f1923h.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f1929p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1930q);
        this.f1930q = f1913C;
        for (int i9 = size - 1; i9 >= 0; i9--) {
            Animator animator = animatorArr[i9];
            animatorArr[i9] = null;
            animator.cancel();
        }
        this.f1930q = animatorArr;
        x(this, v.f1910T7, false);
    }

    public abstract void d(F f9);

    public final void e(View view, boolean z8) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            F f9 = new F(view);
            if (z8) {
                g(f9);
            } else {
                d(f9);
            }
            f9.f1846c.add(this);
            f(f9);
            if (z8) {
                c(this.f1924i, view, f9);
            } else {
                c(this.f1925j, view, f9);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                e(viewGroup.getChildAt(i9), z8);
            }
        }
    }

    public abstract void g(F f9);

    public final void h(ViewGroup viewGroup, boolean z8) {
        i(z8);
        ArrayList arrayList = this.f1922g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1923h;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z8);
            return;
        }
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i9)).intValue());
            if (findViewById != null) {
                F f9 = new F(findViewById);
                if (z8) {
                    g(f9);
                } else {
                    d(f9);
                }
                f9.f1846c.add(this);
                f(f9);
                if (z8) {
                    c(this.f1924i, findViewById, f9);
                } else {
                    c(this.f1925j, findViewById, f9);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            View view = (View) arrayList2.get(i10);
            F f10 = new F(view);
            if (z8) {
                g(f10);
            } else {
                d(f10);
            }
            f10.f1846c.add(this);
            f(f10);
            if (z8) {
                c(this.f1924i, view, f10);
            } else {
                c(this.f1925j, view, f10);
            }
        }
    }

    public final void i(boolean z8) {
        if (z8) {
            ((x.b) this.f1924i.b).clear();
            ((SparseArray) this.f1924i.f5270c).clear();
            ((x.f) this.f1924i.f5271d).a();
        } else {
            ((x.b) this.f1925j.b).clear();
            ((SparseArray) this.f1925j.f5270c).clear();
            ((x.f) this.f1925j.f5271d).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public w clone() {
        try {
            w wVar = (w) super.clone();
            wVar.f1936w = new ArrayList();
            wVar.f1924i = new b1.h(2);
            wVar.f1925j = new b1.h(2);
            wVar.m = null;
            wVar.f1927n = null;
            wVar.f1917A = null;
            wVar.f1934u = this;
            wVar.f1935v = null;
            return wVar;
        } catch (CloneNotSupportedException e4) {
            throw new RuntimeException(e4);
        }
    }

    public Animator k(ViewGroup viewGroup, F f9, F f10) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [M0.q, java.lang.Object] */
    public void l(ViewGroup viewGroup, b1.h hVar, b1.h hVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z8;
        int i9;
        View view;
        F f9;
        Animator animator;
        F f10;
        x.b p2 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        if (o().f1917A != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i10 = 0;
        while (i10 < size) {
            F f11 = (F) arrayList.get(i10);
            F f12 = (F) arrayList2.get(i10);
            if (f11 != null && !f11.f1846c.contains(this)) {
                f11 = null;
            }
            if (f12 != null && !f12.f1846c.contains(this)) {
                f12 = null;
            }
            if ((f11 != null || f12 != null) && (f11 == null || f12 == null || u(f11, f12))) {
                Animator k6 = k(viewGroup, f11, f12);
                if (k6 != null) {
                    String str = this.b;
                    if (f12 != null) {
                        String[] q9 = q();
                        view = f12.b;
                        if (q9 != null && q9.length > 0) {
                            f10 = new F(view);
                            i9 = size;
                            F f13 = (F) ((x.b) hVar2.b).getOrDefault(view, null);
                            if (f13 != null) {
                                int i11 = 0;
                                while (i11 < q9.length) {
                                    HashMap hashMap = f10.f1845a;
                                    String str2 = q9[i11];
                                    hashMap.put(str2, f13.f1845a.get(str2));
                                    i11++;
                                    q9 = q9;
                                }
                            }
                            int i12 = p2.f24086d;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    C0226q c0226q = (C0226q) p2.getOrDefault((Animator) p2.h(i13), null);
                                    if (c0226q.f1897c != null && c0226q.f1896a == view && c0226q.b.equals(str) && c0226q.f1897c.equals(f10)) {
                                        animator = null;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    animator = k6;
                                    break;
                                }
                            }
                        } else {
                            i9 = size;
                            animator = k6;
                            f10 = null;
                        }
                        k6 = animator;
                        f9 = f10;
                    } else {
                        i9 = size;
                        view = f11.b;
                        f9 = null;
                    }
                    if (k6 != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        ?? obj = new Object();
                        obj.f1896a = view;
                        obj.b = str;
                        obj.f1897c = f9;
                        obj.f1898d = windowId;
                        obj.f1899e = this;
                        obj.f1900f = k6;
                        if (z8) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(k6);
                            k6 = animatorSet;
                        }
                        p2.put(k6, obj);
                        this.f1936w.add(k6);
                    }
                    i10++;
                    size = i9;
                }
            }
            i9 = size;
            i10++;
            size = i9;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                C0226q c0226q2 = (C0226q) p2.getOrDefault((Animator) this.f1936w.get(sparseIntArray.keyAt(i14)), null);
                c0226q2.f1900f.setStartDelay(c0226q2.f1900f.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i9 = this.f1931r - 1;
        this.f1931r = i9;
        if (i9 == 0) {
            x(this, v.f1909S7, false);
            for (int i10 = 0; i10 < ((x.f) this.f1924i.f5271d).h(); i10++) {
                View view = (View) ((x.f) this.f1924i.f5271d).i(i10);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i11 = 0; i11 < ((x.f) this.f1925j.f5271d).h(); i11++) {
                View view2 = (View) ((x.f) this.f1925j.f5271d).i(i11);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f1933t = true;
        }
    }

    public final F n(View view, boolean z8) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C c9 = this.f1926k;
        if (c9 != null) {
            return c9.n(view, z8);
        }
        if (z8) {
            arrayList = this.m;
        } else {
            arrayList = this.f1927n;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 < size) {
                F f9 = (F) arrayList.get(i9);
                if (f9 == null) {
                    return null;
                }
                if (f9.b == view) {
                    break;
                }
                i9++;
            } else {
                i9 = -1;
                break;
            }
        }
        if (i9 < 0) {
            return null;
        }
        if (z8) {
            arrayList2 = this.f1927n;
        } else {
            arrayList2 = this.m;
        }
        return (F) arrayList2.get(i9);
    }

    public final w o() {
        C c9 = this.f1926k;
        if (c9 != null) {
            return c9.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final F r(View view, boolean z8) {
        b1.h hVar;
        C c9 = this.f1926k;
        if (c9 != null) {
            return c9.r(view, z8);
        }
        if (z8) {
            hVar = this.f1924i;
        } else {
            hVar = this.f1925j;
        }
        return (F) ((x.b) hVar.b).getOrDefault(view, null);
    }

    public boolean s() {
        return !this.f1929p.isEmpty();
    }

    public abstract boolean t();

    public final String toString() {
        return M("");
    }

    public boolean u(F f9, F f10) {
        if (f9 == null || f10 == null) {
            return false;
        }
        String[] q9 = q();
        if (q9 != null) {
            for (String str : q9) {
                if (!w(f9, f10, str)) {
                }
            }
            return false;
        }
        Iterator it = f9.f1845a.keySet().iterator();
        while (it.hasNext()) {
            if (w(f9, f10, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean v(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f1922g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f1923h;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void x(w wVar, v vVar, boolean z8) {
        w wVar2 = this.f1934u;
        if (wVar2 != null) {
            wVar2.x(wVar, vVar, z8);
        }
        ArrayList arrayList = this.f1935v;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f1935v.size();
            u[] uVarArr = this.f1928o;
            if (uVarArr == null) {
                uVarArr = new u[size];
            }
            this.f1928o = null;
            u[] uVarArr2 = (u[]) this.f1935v.toArray(uVarArr);
            for (int i9 = 0; i9 < size; i9++) {
                vVar.a(uVarArr2[i9], wVar, z8);
                uVarArr2[i9] = null;
            }
            this.f1928o = uVarArr2;
        }
    }

    public void y(View view) {
        if (!this.f1933t) {
            ArrayList arrayList = this.f1929p;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f1930q);
            this.f1930q = f1913C;
            for (int i9 = size - 1; i9 >= 0; i9--) {
                Animator animator = animatorArr[i9];
                animatorArr[i9] = null;
                animator.pause();
            }
            this.f1930q = animatorArr;
            x(this, v.f1911U7, false);
            this.f1932s = true;
        }
    }

    public void z() {
        x.b p2 = p();
        this.f1939z = 0L;
        for (int i9 = 0; i9 < this.f1936w.size(); i9++) {
            Animator animator = (Animator) this.f1936w.get(i9);
            C0226q c0226q = (C0226q) p2.getOrDefault(animator, null);
            if (animator != null && c0226q != null) {
                long j7 = this.f1920d;
                Animator animator2 = c0226q.f1900f;
                if (j7 >= 0) {
                    animator2.setDuration(j7);
                }
                long j9 = this.f1919c;
                if (j9 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j9);
                }
                TimeInterpolator timeInterpolator = this.f1921f;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.f1929p.add(animator);
                this.f1939z = Math.max(this.f1939z, r.a(animator));
            }
        }
        this.f1936w.clear();
    }

    public void J() {
    }

    public void f(F f9) {
    }
}
