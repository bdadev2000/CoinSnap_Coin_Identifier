package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f1900d;

    public /* synthetic */ e(k kVar, ArrayList arrayList, int i10) {
        this.f1898b = i10;
        this.f1900d = kVar;
        this.f1899c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        long j3;
        int i10 = this.f1898b;
        k kVar = this.f1900d;
        ArrayList arrayList = this.f1899c;
        switch (i10) {
            case 0:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j jVar = (j) it.next();
                    o1 o1Var = jVar.a;
                    kVar.getClass();
                    View view3 = o1Var.itemView;
                    int i11 = jVar.f1938d - jVar.f1936b;
                    int i12 = jVar.f1939e - jVar.f1937c;
                    if (i11 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i12 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    kVar.f1957p.add(o1Var);
                    animate.setDuration(kVar.f2016e).setListener(new g(kVar, o1Var, i11, view3, i12, animate)).start();
                }
                arrayList.clear();
                kVar.f1954m.remove(arrayList);
                return;
            case 1:
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    kVar.getClass();
                    o1 o1Var2 = iVar.a;
                    if (o1Var2 == null) {
                        view = null;
                    } else {
                        view = o1Var2.itemView;
                    }
                    o1 o1Var3 = iVar.f1929b;
                    if (o1Var3 != null) {
                        view2 = o1Var3.itemView;
                    } else {
                        view2 = null;
                    }
                    ArrayList arrayList2 = kVar.f1959r;
                    long j10 = kVar.f2017f;
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(j10);
                        arrayList2.add(iVar.a);
                        duration.translationX(iVar.f1932e - iVar.f1930c);
                        duration.translationY(iVar.f1933f - iVar.f1931d);
                        j3 = j10;
                        duration.alpha(0.0f).setListener(new h(kVar, iVar, duration, view, 0)).start();
                    } else {
                        j3 = j10;
                    }
                    if (view2 != null) {
                        ViewPropertyAnimator animate2 = view2.animate();
                        arrayList2.add(iVar.f1929b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j3).alpha(1.0f).setListener(new h(kVar, iVar, animate2, view2, 1)).start();
                    }
                }
                arrayList.clear();
                kVar.f1955n.remove(arrayList);
                return;
            default:
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    o1 o1Var4 = (o1) it3.next();
                    kVar.getClass();
                    View view4 = o1Var4.itemView;
                    ViewPropertyAnimator animate3 = view4.animate();
                    kVar.f1956o.add(o1Var4);
                    animate3.alpha(1.0f).setDuration(kVar.f2014c).setListener(new f(kVar, o1Var4, view4, animate3)).start();
                }
                arrayList.clear();
                kVar.f1953l.remove(arrayList);
                return;
        }
    }
}
