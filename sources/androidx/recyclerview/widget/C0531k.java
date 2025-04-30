package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0531k extends Q {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f5007s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5008g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f5009h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f5010i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f5011j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f5012k;
    public ArrayList l;
    public ArrayList m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f5013n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f5014o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f5015p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f5016q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f5017r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((p0) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.recyclerview.widget.i, java.lang.Object] */
    @Override // androidx.recyclerview.widget.Q
    public final boolean a(p0 p0Var, p0 p0Var2, P p2, P p7) {
        int i9;
        int i10;
        int i11 = p2.f4937a;
        int i12 = p2.b;
        if (p0Var2.shouldIgnore()) {
            int i13 = p2.f4937a;
            i10 = p2.b;
            i9 = i13;
        } else {
            i9 = p7.f4937a;
            i10 = p7.b;
        }
        if (p0Var == p0Var2) {
            return g(p0Var, i11, i12, i9, i10);
        }
        float translationX = p0Var.itemView.getTranslationX();
        float translationY = p0Var.itemView.getTranslationY();
        float alpha = p0Var.itemView.getAlpha();
        l(p0Var);
        p0Var.itemView.setTranslationX(translationX);
        p0Var.itemView.setTranslationY(translationY);
        p0Var.itemView.setAlpha(alpha);
        l(p0Var2);
        p0Var2.itemView.setTranslationX(-((int) ((i9 - i11) - translationX)));
        p0Var2.itemView.setTranslationY(-((int) ((i10 - i12) - translationY)));
        p0Var2.itemView.setAlpha(0.0f);
        ArrayList arrayList = this.f5012k;
        ?? obj = new Object();
        obj.f4992a = p0Var;
        obj.b = p0Var2;
        obj.f4993c = i11;
        obj.f4994d = i12;
        obj.f4995e = i9;
        obj.f4996f = i10;
        arrayList.add(obj);
        return true;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void d(p0 p0Var) {
        View view = p0Var.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f5011j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C0530j) arrayList.get(size)).f5003a == p0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(p0Var);
                arrayList.remove(size);
            }
        }
        j(this.f5012k, p0Var);
        if (this.f5009h.remove(p0Var)) {
            view.setAlpha(1.0f);
            c(p0Var);
        }
        if (this.f5010i.remove(p0Var)) {
            view.setAlpha(1.0f);
            c(p0Var);
        }
        ArrayList arrayList2 = this.f5013n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, p0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C0530j) arrayList5.get(size4)).f5003a == p0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(p0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(p0Var)) {
                view.setAlpha(1.0f);
                c(p0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f5016q.remove(p0Var);
        this.f5014o.remove(p0Var);
        this.f5017r.remove(p0Var);
        this.f5015p.remove(p0Var);
        i();
    }

    @Override // androidx.recyclerview.widget.Q
    public final void e() {
        ArrayList arrayList = this.f5011j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0530j c0530j = (C0530j) arrayList.get(size);
            View view = c0530j.f5003a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(c0530j.f5003a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f5009h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((p0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f5010i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            p0 p0Var = (p0) arrayList3.get(size3);
            p0Var.itemView.setAlpha(1.0f);
            c(p0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f5012k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0529i c0529i = (C0529i) arrayList4.get(size4);
            p0 p0Var2 = c0529i.f4992a;
            if (p0Var2 != null) {
                k(c0529i, p0Var2);
            }
            p0 p0Var3 = c0529i.b;
            if (p0Var3 != null) {
                k(c0529i, p0Var3);
            }
        }
        arrayList4.clear();
        if (!f()) {
            return;
        }
        ArrayList arrayList5 = this.m;
        for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                C0530j c0530j2 = (C0530j) arrayList6.get(size6);
                View view2 = c0530j2.f5003a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                c(c0530j2.f5003a);
                arrayList6.remove(size6);
                if (arrayList6.isEmpty()) {
                    arrayList5.remove(arrayList6);
                }
            }
        }
        ArrayList arrayList7 = this.l;
        for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                p0 p0Var4 = (p0) arrayList8.get(size8);
                p0Var4.itemView.setAlpha(1.0f);
                c(p0Var4);
                arrayList8.remove(size8);
                if (arrayList8.isEmpty()) {
                    arrayList7.remove(arrayList8);
                }
            }
        }
        ArrayList arrayList9 = this.f5013n;
        for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
            ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
            for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                C0529i c0529i2 = (C0529i) arrayList10.get(size10);
                p0 p0Var5 = c0529i2.f4992a;
                if (p0Var5 != null) {
                    k(c0529i2, p0Var5);
                }
                p0 p0Var6 = c0529i2.b;
                if (p0Var6 != null) {
                    k(c0529i2, p0Var6);
                }
                if (arrayList10.isEmpty()) {
                    arrayList9.remove(arrayList10);
                }
            }
        }
        h(this.f5016q);
        h(this.f5015p);
        h(this.f5014o);
        h(this.f5017r);
        ArrayList arrayList11 = this.b;
        if (arrayList11.size() <= 0) {
            arrayList11.clear();
        } else {
            com.mbridge.msdk.foundation.entity.o.v(arrayList11.get(0));
            throw null;
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final boolean f() {
        if (this.f5010i.isEmpty() && this.f5012k.isEmpty() && this.f5011j.isEmpty() && this.f5009h.isEmpty() && this.f5015p.isEmpty() && this.f5016q.isEmpty() && this.f5014o.isEmpty() && this.f5017r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.f5013n.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.j, java.lang.Object] */
    public final boolean g(p0 p0Var, int i9, int i10, int i11, int i12) {
        View view = p0Var.itemView;
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) p0Var.itemView.getTranslationY());
        l(p0Var);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            c(p0Var);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        ArrayList arrayList = this.f5011j;
        ?? obj = new Object();
        obj.f5003a = p0Var;
        obj.b = translationX;
        obj.f5004c = translationY;
        obj.f5005d = i11;
        obj.f5006e = i12;
        arrayList.add(obj);
        return true;
    }

    public final void i() {
        if (!f()) {
            ArrayList arrayList = this.b;
            if (arrayList.size() <= 0) {
                arrayList.clear();
            } else {
                com.mbridge.msdk.foundation.entity.o.v(arrayList.get(0));
                throw null;
            }
        }
    }

    public final void j(List list, p0 p0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0529i c0529i = (C0529i) list.get(size);
            if (k(c0529i, p0Var) && c0529i.f4992a == null && c0529i.b == null) {
                list.remove(c0529i);
            }
        }
    }

    public final boolean k(C0529i c0529i, p0 p0Var) {
        if (c0529i.b == p0Var) {
            c0529i.b = null;
        } else if (c0529i.f4992a == p0Var) {
            c0529i.f4992a = null;
        } else {
            return false;
        }
        p0Var.itemView.setAlpha(1.0f);
        p0Var.itemView.setTranslationX(0.0f);
        p0Var.itemView.setTranslationY(0.0f);
        c(p0Var);
        return true;
    }

    public final void l(p0 p0Var) {
        if (f5007s == null) {
            f5007s = new ValueAnimator().getInterpolator();
        }
        p0Var.itemView.animate().setInterpolator(f5007s);
        d(p0Var);
    }
}
