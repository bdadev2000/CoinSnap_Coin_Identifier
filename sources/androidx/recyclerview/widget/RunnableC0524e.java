package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0524e implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0531k f4970d;

    public /* synthetic */ RunnableC0524e(C0531k c0531k, ArrayList arrayList, int i9) {
        this.b = i9;
        this.f4970d = c0531k;
        this.f4969c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        Iterator it;
        switch (this.b) {
            case 0:
                ArrayList arrayList = this.f4969c;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0531k c0531k = this.f4970d;
                    if (hasNext) {
                        C0530j c0530j = (C0530j) it2.next();
                        p0 p0Var = c0530j.f5003a;
                        c0531k.getClass();
                        View view3 = p0Var.itemView;
                        int i9 = c0530j.f5005d - c0530j.b;
                        int i10 = c0530j.f5006e - c0530j.f5004c;
                        if (i9 != 0) {
                            view3.animate().translationX(0.0f);
                        }
                        if (i10 != 0) {
                            view3.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view3.animate();
                        c0531k.f5015p.add(p0Var);
                        animate.setDuration(c0531k.f4941e).setListener(new C0527g(c0531k, p0Var, i9, view3, i10, animate)).start();
                    } else {
                        arrayList.clear();
                        c0531k.m.remove(arrayList);
                        return;
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f4969c;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0531k c0531k2 = this.f4970d;
                    if (hasNext2) {
                        C0529i c0529i = (C0529i) it3.next();
                        c0531k2.getClass();
                        p0 p0Var2 = c0529i.f4992a;
                        if (p0Var2 == null) {
                            view = null;
                        } else {
                            view = p0Var2.itemView;
                        }
                        p0 p0Var3 = c0529i.b;
                        if (p0Var3 != null) {
                            view2 = p0Var3.itemView;
                        } else {
                            view2 = null;
                        }
                        ArrayList arrayList3 = c0531k2.f5017r;
                        long j7 = c0531k2.f4942f;
                        if (view != null) {
                            ViewPropertyAnimator duration = view.animate().setDuration(j7);
                            arrayList3.add(c0529i.f4992a);
                            duration.translationX(c0529i.f4995e - c0529i.f4993c);
                            duration.translationY(c0529i.f4996f - c0529i.f4994d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0528h(c0531k2, c0529i, duration, view, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view2 != null) {
                            ViewPropertyAnimator animate2 = view2.animate();
                            arrayList3.add(c0529i.b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j7).alpha(1.0f).setListener(new C0528h(c0531k2, c0529i, animate2, view2, 1)).start();
                        }
                        it3 = it;
                    } else {
                        arrayList2.clear();
                        c0531k2.f5013n.remove(arrayList2);
                        return;
                    }
                }
            default:
                ArrayList arrayList4 = this.f4969c;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0531k c0531k3 = this.f4970d;
                    if (hasNext3) {
                        p0 p0Var4 = (p0) it4.next();
                        c0531k3.getClass();
                        View view4 = p0Var4.itemView;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0531k3.f5014o.add(p0Var4);
                        animate3.alpha(1.0f).setDuration(c0531k3.f4939c).setListener(new C0526f(c0531k3, p0Var4, view4, animate3)).start();
                    } else {
                        arrayList4.clear();
                        c0531k3.l.remove(arrayList4);
                        return;
                    }
                }
        }
    }
}
