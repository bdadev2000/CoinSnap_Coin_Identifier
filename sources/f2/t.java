package f2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f17648m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f17649n;

    /* renamed from: o, reason: collision with root package name */
    public r[] f17650o;

    /* renamed from: x, reason: collision with root package name */
    public va.b f17658x;

    /* renamed from: z, reason: collision with root package name */
    public static final Animator[] f17637z = new Animator[0];
    public static final int[] A = {2, 1, 3, 4};
    public static final com.facebook.b B = new com.facebook.b();
    public static final ThreadLocal C = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public final String f17638b = getClass().getName();

    /* renamed from: c, reason: collision with root package name */
    public long f17639c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f17640d = -1;

    /* renamed from: f, reason: collision with root package name */
    public TimeInterpolator f17641f = null;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17642g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17643h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public ic.t f17644i = new ic.t(4);

    /* renamed from: j, reason: collision with root package name */
    public ic.t f17645j = new ic.t(4);

    /* renamed from: k, reason: collision with root package name */
    public z f17646k = null;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f17647l = A;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f17651p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public Animator[] f17652q = f17637z;

    /* renamed from: r, reason: collision with root package name */
    public int f17653r = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17654s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17655t = false;
    public t u = null;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f17656v = null;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f17657w = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public com.facebook.b f17659y = B;

    public static void c(ic.t tVar, View view, c0 c0Var) {
        ((r.b) tVar.a).put(view, c0Var);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (((SparseArray) tVar.f19574b).indexOfKey(id2) >= 0) {
                ((SparseArray) tVar.f19574b).put(id2, null);
            } else {
                ((SparseArray) tVar.f19574b).put(id2, view);
            }
        }
        String transitionName = ViewCompat.getTransitionName(view);
        if (transitionName != null) {
            if (((r.b) tVar.f19576d).containsKey(transitionName)) {
                ((r.b) tVar.f19576d).put(transitionName, null);
            } else {
                ((r.b) tVar.f19576d).put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                r.e eVar = (r.e) tVar.f19575c;
                if (eVar.f23933b) {
                    eVar.c();
                }
                if (c6.k.e(eVar.f23934c, eVar.f23936f, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((r.e) tVar.f19575c).d(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((r.e) tVar.f19575c).f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((r.e) tVar.f19575c).f(itemIdAtPosition, view);
            }
        }
    }

    public static r.b p() {
        ThreadLocal threadLocal = C;
        r.b bVar = (r.b) threadLocal.get();
        if (bVar == null) {
            r.b bVar2 = new r.b();
            threadLocal.set(bVar2);
            return bVar2;
        }
        return bVar;
    }

    public static boolean v(c0 c0Var, c0 c0Var2, String str) {
        Object obj = c0Var.a.get(str);
        Object obj2 = c0Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(View view) {
        this.f17643h.remove(view);
    }

    public void B(ViewGroup viewGroup) {
        if (this.f17654s) {
            if (!this.f17655t) {
                ArrayList arrayList = this.f17651p;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f17652q);
                this.f17652q = f17637z;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.f17652q = animatorArr;
                w(this, s.f17636e8);
            }
            this.f17654s = false;
        }
    }

    public void C() {
        J();
        r.b p10 = p();
        Iterator it = this.f17657w.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p10.containsKey(animator)) {
                J();
                if (animator != null) {
                    animator.addListener(new p(this, p10));
                    long j3 = this.f17640d;
                    if (j3 >= 0) {
                        animator.setDuration(j3);
                    }
                    long j10 = this.f17639c;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f17641f;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.d(this, 1));
                    animator.start();
                }
            }
        }
        this.f17657w.clear();
        m();
    }

    public void D(long j3) {
        this.f17640d = j3;
    }

    public void E(va.b bVar) {
        this.f17658x = bVar;
    }

    public void F(TimeInterpolator timeInterpolator) {
        this.f17641f = timeInterpolator;
    }

    public void G(com.facebook.b bVar) {
        if (bVar == null) {
            this.f17659y = B;
        } else {
            this.f17659y = bVar;
        }
    }

    public void H() {
    }

    public void I(long j3) {
        this.f17639c = j3;
    }

    public final void J() {
        if (this.f17653r == 0) {
            x(s.f17632a8);
            this.f17655t = false;
        }
        this.f17653r++;
    }

    public String K(String str) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(getClass().getSimpleName());
        sb2.append("@");
        sb2.append(Integer.toHexString(hashCode()));
        sb2.append(": ");
        if (this.f17640d != -1) {
            sb2.append("dur(");
            sb2.append(this.f17640d);
            sb2.append(") ");
        }
        if (this.f17639c != -1) {
            sb2.append("dly(");
            sb2.append(this.f17639c);
            sb2.append(") ");
        }
        if (this.f17641f != null) {
            sb2.append("interp(");
            sb2.append(this.f17641f);
            sb2.append(") ");
        }
        ArrayList arrayList = this.f17642g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17643h;
        if (size > 0 || arrayList2.size() > 0) {
            sb2.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList.get(i10));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(arrayList2.get(i11));
                }
            }
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a(r rVar) {
        if (this.f17656v == null) {
            this.f17656v = new ArrayList();
        }
        this.f17656v.add(rVar);
    }

    public void b(View view) {
        this.f17643h.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.f17651p;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f17652q);
        this.f17652q = f17637z;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.f17652q = animatorArr;
                w(this, s.f17634c8);
                return;
            }
        }
    }

    public abstract void d(c0 c0Var);

    public final void e(View view, boolean z10) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            c0 c0Var = new c0(view);
            if (z10) {
                g(c0Var);
            } else {
                d(c0Var);
            }
            c0Var.f17586c.add(this);
            f(c0Var);
            if (z10) {
                c(this.f17644i, view, c0Var);
            } else {
                c(this.f17645j, view, c0Var);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), z10);
            }
        }
    }

    public void f(c0 c0Var) {
    }

    public abstract void g(c0 c0Var);

    public final void h(ViewGroup viewGroup, boolean z10) {
        i(z10);
        ArrayList arrayList = this.f17642g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17643h;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z10);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (findViewById != null) {
                c0 c0Var = new c0(findViewById);
                if (z10) {
                    g(c0Var);
                } else {
                    d(c0Var);
                }
                c0Var.f17586c.add(this);
                f(c0Var);
                if (z10) {
                    c(this.f17644i, findViewById, c0Var);
                } else {
                    c(this.f17645j, findViewById, c0Var);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            c0 c0Var2 = new c0(view);
            if (z10) {
                g(c0Var2);
            } else {
                d(c0Var2);
            }
            c0Var2.f17586c.add(this);
            f(c0Var2);
            if (z10) {
                c(this.f17644i, view, c0Var2);
            } else {
                c(this.f17645j, view, c0Var2);
            }
        }
    }

    public final void i(boolean z10) {
        if (z10) {
            ((r.b) this.f17644i.a).clear();
            ((SparseArray) this.f17644i.f19574b).clear();
            ((r.e) this.f17644i.f19575c).a();
        } else {
            ((r.b) this.f17645j.a).clear();
            ((SparseArray) this.f17645j.f19574b).clear();
            ((r.e) this.f17645j.f19575c).a();
        }
    }

    @Override // 
    /* renamed from: j */
    public t clone() {
        try {
            t tVar = (t) super.clone();
            tVar.f17657w = new ArrayList();
            tVar.f17644i = new ic.t(4);
            tVar.f17645j = new ic.t(4);
            tVar.f17648m = null;
            tVar.f17649n = null;
            tVar.u = this;
            tVar.f17656v = null;
            return tVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public Animator k(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        return null;
    }

    public void l(ViewGroup viewGroup, ic.t tVar, ic.t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z10;
        View view;
        Animator animator;
        c0 c0Var;
        int i10;
        Animator animator2;
        c0 c0Var2;
        r.b p10 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i11 = 0;
        while (i11 < size) {
            c0 c0Var3 = (c0) arrayList.get(i11);
            c0 c0Var4 = (c0) arrayList2.get(i11);
            if (c0Var3 != null && !c0Var3.f17586c.contains(this)) {
                c0Var3 = null;
            }
            if (c0Var4 != null && !c0Var4.f17586c.contains(this)) {
                c0Var4 = null;
            }
            if (c0Var3 != null || c0Var4 != null) {
                if (c0Var3 != null && c0Var4 != null && !t(c0Var3, c0Var4)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    Animator k10 = k(viewGroup, c0Var3, c0Var4);
                    if (k10 != null) {
                        if (c0Var4 != null) {
                            String[] q10 = q();
                            View view2 = c0Var4.f17585b;
                            if (q10 != null && q10.length > 0) {
                                c0Var2 = new c0(view2);
                                c0 c0Var5 = (c0) ((r.b) tVar2.a).getOrDefault(view2, null);
                                if (c0Var5 != null) {
                                    int i12 = 0;
                                    while (i12 < q10.length) {
                                        HashMap hashMap = c0Var2.a;
                                        Animator animator3 = k10;
                                        String str = q10[i12];
                                        hashMap.put(str, c0Var5.a.get(str));
                                        i12++;
                                        k10 = animator3;
                                        q10 = q10;
                                    }
                                }
                                Animator animator4 = k10;
                                int i13 = p10.f23955d;
                                int i14 = 0;
                                while (true) {
                                    if (i14 < i13) {
                                        q qVar = (q) p10.getOrDefault((Animator) p10.h(i14), null);
                                        if (qVar.f17628c != null && qVar.a == view2 && qVar.f17627b.equals(this.f17638b) && qVar.f17628c.equals(c0Var2)) {
                                            animator2 = null;
                                            break;
                                        }
                                        i14++;
                                    } else {
                                        animator2 = animator4;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = k10;
                                c0Var2 = null;
                            }
                            animator = animator2;
                            view = view2;
                            c0Var = c0Var2;
                        } else {
                            view = c0Var3.f17585b;
                            animator = k10;
                            c0Var = null;
                        }
                        if (animator != null) {
                            i10 = size;
                            p10.put(animator, new q(view, this.f17638b, this, viewGroup.getWindowId(), c0Var, animator));
                            this.f17657w.add(animator);
                            i11++;
                            size = i10;
                        }
                    }
                    i10 = size;
                    i11++;
                    size = i10;
                }
            }
            i10 = size;
            i11++;
            size = i10;
        }
        if (sparseIntArray.size() != 0) {
            for (int i15 = 0; i15 < sparseIntArray.size(); i15++) {
                q qVar2 = (q) p10.getOrDefault((Animator) this.f17657w.get(sparseIntArray.keyAt(i15)), null);
                qVar2.f17631f.setStartDelay(qVar2.f17631f.getStartDelay() + (sparseIntArray.valueAt(i15) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i10 = this.f17653r - 1;
        this.f17653r = i10;
        if (i10 == 0) {
            w(this, s.f17633b8);
            for (int i11 = 0; i11 < ((r.e) this.f17644i.f19575c).h(); i11++) {
                View view = (View) ((r.e) this.f17644i.f19575c).i(i11);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i12 = 0; i12 < ((r.e) this.f17645j.f19575c).h(); i12++) {
                View view2 = (View) ((r.e) this.f17645j.f19575c).i(i12);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f17655t = true;
        }
    }

    public final c0 n(View view, boolean z10) {
        ArrayList arrayList;
        ArrayList arrayList2;
        z zVar = this.f17646k;
        if (zVar != null) {
            return zVar.n(view, z10);
        }
        if (z10) {
            arrayList = this.f17648m;
        } else {
            arrayList = this.f17649n;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                c0 c0Var = (c0) arrayList.get(i10);
                if (c0Var == null) {
                    return null;
                }
                if (c0Var.f17585b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z10) {
            arrayList2 = this.f17649n;
        } else {
            arrayList2 = this.f17648m;
        }
        return (c0) arrayList2.get(i10);
    }

    public final t o() {
        z zVar = this.f17646k;
        if (zVar != null) {
            return zVar.o();
        }
        return this;
    }

    public String[] q() {
        return null;
    }

    public final c0 r(View view, boolean z10) {
        ic.t tVar;
        z zVar = this.f17646k;
        if (zVar != null) {
            return zVar.r(view, z10);
        }
        if (z10) {
            tVar = this.f17644i;
        } else {
            tVar = this.f17645j;
        }
        return (c0) ((r.b) tVar.a).getOrDefault(view, null);
    }

    public boolean s() {
        return !this.f17651p.isEmpty();
    }

    public boolean t(c0 c0Var, c0 c0Var2) {
        if (c0Var == null || c0Var2 == null) {
            return false;
        }
        String[] q10 = q();
        if (q10 != null) {
            for (String str : q10) {
                if (!v(c0Var, c0Var2, str)) {
                }
            }
            return false;
        }
        Iterator it = c0Var.a.keySet().iterator();
        while (it.hasNext()) {
            if (v(c0Var, c0Var2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return K("");
    }

    public final boolean u(View view) {
        int id2 = view.getId();
        ArrayList arrayList = this.f17642g;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f17643h;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id2)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final void w(t tVar, n0.h hVar) {
        t tVar2 = this.u;
        if (tVar2 != null) {
            tVar2.w(tVar, hVar);
        }
        ArrayList arrayList = this.f17656v;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.f17656v.size();
            r[] rVarArr = this.f17650o;
            if (rVarArr == null) {
                rVarArr = new r[size];
            }
            this.f17650o = null;
            r[] rVarArr2 = (r[]) this.f17656v.toArray(rVarArr);
            for (int i10 = 0; i10 < size; i10++) {
                r rVar = rVarArr2[i10];
                switch (hVar.f22278b) {
                    case 2:
                        rVar.b(tVar);
                        break;
                    case 3:
                        rVar.f(tVar);
                        break;
                    case 4:
                        rVar.c(tVar);
                        break;
                    case 5:
                        rVar.a();
                        break;
                    default:
                        rVar.d();
                        break;
                }
                rVarArr2[i10] = null;
            }
            this.f17650o = rVarArr2;
        }
    }

    public final void x(n0.h hVar) {
        w(this, hVar);
    }

    public void y(View view) {
        if (!this.f17655t) {
            ArrayList arrayList = this.f17651p;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f17652q);
            this.f17652q = f17637z;
            for (int i10 = size - 1; i10 >= 0; i10--) {
                Animator animator = animatorArr[i10];
                animatorArr[i10] = null;
                animator.pause();
            }
            this.f17652q = animatorArr;
            w(this, s.f17635d8);
            this.f17654s = true;
        }
    }

    public t z(r rVar) {
        t tVar;
        ArrayList arrayList = this.f17656v;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(rVar) && (tVar = this.u) != null) {
            tVar.z(rVar);
        }
        if (this.f17656v.size() == 0) {
            this.f17656v = null;
        }
        return this;
    }
}
