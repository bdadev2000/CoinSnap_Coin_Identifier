package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class g0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1916b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1917c;

    public /* synthetic */ g0(RecyclerView recyclerView, int i10) {
        this.f1916b = i10;
        this.f1917c = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        long j3;
        int i10 = this.f1916b;
        RecyclerView recyclerView = this.f1917c;
        switch (i10) {
            case 0:
                if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.mIsAttached) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.mLayoutSuppressed) {
                        recyclerView.mLayoutWasDefered = true;
                        return;
                    } else {
                        recyclerView.consumePendingUpdateOperations();
                        return;
                    }
                }
                return;
            default:
                q0 q0Var = recyclerView.mItemAnimator;
                if (q0Var != null) {
                    k kVar = (k) q0Var;
                    ArrayList arrayList = kVar.f1949h;
                    boolean z11 = !arrayList.isEmpty();
                    ArrayList arrayList2 = kVar.f1951j;
                    boolean z12 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = kVar.f1952k;
                    boolean z13 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = kVar.f1950i;
                    boolean z14 = !arrayList4.isEmpty();
                    if (z11 || z12 || z14 || z13) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j10 = kVar.f2015d;
                            if (hasNext) {
                                o1 o1Var = (o1) it.next();
                                View view = o1Var.itemView;
                                ViewPropertyAnimator animate = view.animate();
                                kVar.f1958q.add(o1Var);
                                animate.setDuration(j10).alpha(0.0f).setListener(new f(kVar, o1Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (z12) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    kVar.f1954m.add(arrayList5);
                                    arrayList2.clear();
                                    e eVar = new e(kVar, arrayList5, 0);
                                    if (z11) {
                                        ViewCompat.postOnAnimationDelayed(((j) arrayList5.get(0)).a.itemView, eVar, j10);
                                    } else {
                                        eVar.run();
                                    }
                                }
                                if (z13) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    kVar.f1955n.add(arrayList6);
                                    arrayList3.clear();
                                    e eVar2 = new e(kVar, arrayList6, 1);
                                    if (z11) {
                                        ViewCompat.postOnAnimationDelayed(((i) arrayList6.get(0)).a.itemView, eVar2, j10);
                                    } else {
                                        eVar2.run();
                                    }
                                }
                                if (z14) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    kVar.f1953l.add(arrayList7);
                                    arrayList4.clear();
                                    e eVar3 = new e(kVar, arrayList7, 2);
                                    if (!z11 && !z12 && !z13) {
                                        eVar3.run();
                                    } else {
                                        long j11 = 0;
                                        if (!z11) {
                                            j10 = 0;
                                        }
                                        if (z12) {
                                            j3 = kVar.f2016e;
                                        } else {
                                            j3 = 0;
                                        }
                                        if (z13) {
                                            j11 = kVar.f2017f;
                                        }
                                        z10 = false;
                                        ViewCompat.postOnAnimationDelayed(((o1) arrayList7.get(0)).itemView, eVar3, Math.max(j3, j11) + j10);
                                        recyclerView.mPostedAnimatorRunner = z10;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                z10 = false;
                recyclerView.mPostedAnimatorRunner = z10;
                return;
        }
    }
}
