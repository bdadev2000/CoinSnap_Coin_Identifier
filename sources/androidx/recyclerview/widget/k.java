package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends q0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f1947s;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1948g = true;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1949h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1950i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1951j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1952k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1953l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1954m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f1955n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1956o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f1957p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f1958q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1959r = new ArrayList();

    public static void h(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((o1) arrayList.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final boolean a(o1 o1Var, o1 o1Var2, p0 p0Var, p0 p0Var2) {
        int i10;
        int i11;
        int i12 = p0Var.a;
        int i13 = p0Var.f2007b;
        if (o1Var2.shouldIgnore()) {
            int i14 = p0Var.a;
            i11 = p0Var.f2007b;
            i10 = i14;
        } else {
            i10 = p0Var2.a;
            i11 = p0Var2.f2007b;
        }
        if (o1Var == o1Var2) {
            return g(o1Var, i12, i13, i10, i11);
        }
        float translationX = o1Var.itemView.getTranslationX();
        float translationY = o1Var.itemView.getTranslationY();
        float alpha = o1Var.itemView.getAlpha();
        l(o1Var);
        o1Var.itemView.setTranslationX(translationX);
        o1Var.itemView.setTranslationY(translationY);
        o1Var.itemView.setAlpha(alpha);
        l(o1Var2);
        o1Var2.itemView.setTranslationX(-((int) ((i10 - i12) - translationX)));
        o1Var2.itemView.setTranslationY(-((int) ((i11 - i13) - translationY)));
        o1Var2.itemView.setAlpha(0.0f);
        this.f1952k.add(new i(o1Var, o1Var2, i12, i13, i10, i11));
        return true;
    }

    @Override // androidx.recyclerview.widget.q0
    public final void d(o1 o1Var) {
        View view = o1Var.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f1951j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) arrayList.get(size)).a == o1Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(o1Var);
                arrayList.remove(size);
            }
        }
        j(o1Var, this.f1952k);
        if (this.f1949h.remove(o1Var)) {
            view.setAlpha(1.0f);
            c(o1Var);
        }
        if (this.f1950i.remove(o1Var)) {
            view.setAlpha(1.0f);
            c(o1Var);
        }
        ArrayList arrayList2 = this.f1955n;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(o1Var, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f1954m;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList5.get(size4)).a == o1Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(o1Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList6 = this.f1953l;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(o1Var)) {
                    view.setAlpha(1.0f);
                    c(o1Var);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f1958q.remove(o1Var);
                this.f1956o.remove(o1Var);
                this.f1959r.remove(o1Var);
                this.f1957p.remove(o1Var);
                i();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final void e() {
        ArrayList arrayList = this.f1951j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) arrayList.get(size);
            View view = jVar.a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(jVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f1949h;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c((o1) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f1950i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            o1 o1Var = (o1) arrayList3.get(size3);
            o1Var.itemView.setAlpha(1.0f);
            c(o1Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f1952k;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            i iVar = (i) arrayList4.get(size4);
            o1 o1Var2 = iVar.a;
            if (o1Var2 != null) {
                k(iVar, o1Var2);
            }
            o1 o1Var3 = iVar.f1929b;
            if (o1Var3 != null) {
                k(iVar, o1Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.f1954m;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    j jVar2 = (j) arrayList6.get(size6);
                    View view2 = jVar2.a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(jVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f1953l;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    o1 o1Var4 = (o1) arrayList8.get(size8);
                    o1Var4.itemView.setAlpha(1.0f);
                    c(o1Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f1955n;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                break;
            }
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            int size10 = arrayList10.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    i iVar2 = (i) arrayList10.get(size10);
                    o1 o1Var5 = iVar2.a;
                    if (o1Var5 != null) {
                        k(iVar2, o1Var5);
                    }
                    o1 o1Var6 = iVar2.f1929b;
                    if (o1Var6 != null) {
                        k(iVar2, o1Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
        }
        h(this.f1958q);
        h(this.f1957p);
        h(this.f1956o);
        h(this.f1959r);
        ArrayList arrayList11 = this.f2013b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            a4.j.t(arrayList11.get(0));
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.q0
    public final boolean f() {
        if (this.f1950i.isEmpty() && this.f1952k.isEmpty() && this.f1951j.isEmpty() && this.f1949h.isEmpty() && this.f1957p.isEmpty() && this.f1958q.isEmpty() && this.f1956o.isEmpty() && this.f1959r.isEmpty() && this.f1954m.isEmpty() && this.f1953l.isEmpty() && this.f1955n.isEmpty()) {
            return false;
        }
        return true;
    }

    public final boolean g(o1 o1Var, int i10, int i11, int i12, int i13) {
        View view = o1Var.itemView;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) o1Var.itemView.getTranslationY());
        l(o1Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(o1Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f1951j.add(new j(o1Var, translationX, translationY, i12, i13));
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.f2013b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                a4.j.t(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(o1 o1Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                i iVar = (i) arrayList.get(size);
                if (k(iVar, o1Var) && iVar.a == null && iVar.f1929b == null) {
                    arrayList.remove(iVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean k(i iVar, o1 o1Var) {
        if (iVar.f1929b == o1Var) {
            iVar.f1929b = null;
        } else if (iVar.a == o1Var) {
            iVar.a = null;
        } else {
            return false;
        }
        o1Var.itemView.setAlpha(1.0f);
        o1Var.itemView.setTranslationX(0.0f);
        o1Var.itemView.setTranslationY(0.0f);
        c(o1Var);
        return true;
    }

    public final void l(o1 o1Var) {
        if (f1947s == null) {
            f1947s = new ValueAnimator().getInterpolator();
        }
        o1Var.itemView.animate().setInterpolator(f1947s);
        d(o1Var);
    }
}
