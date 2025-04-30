package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F implements Runnable {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4933c;

    public /* synthetic */ F(RecyclerView recyclerView, int i9) {
        this.b = i9;
        this.f4933c = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z8;
        long j7;
        switch (this.b) {
            case 0:
                RecyclerView recyclerView = this.f4933c;
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
                RecyclerView recyclerView2 = this.f4933c;
                Q q9 = recyclerView2.mItemAnimator;
                if (q9 != null) {
                    C0531k c0531k = (C0531k) q9;
                    ArrayList arrayList = c0531k.f5009h;
                    boolean z9 = !arrayList.isEmpty();
                    ArrayList arrayList2 = c0531k.f5011j;
                    boolean z10 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c0531k.f5012k;
                    boolean z11 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c0531k.f5010i;
                    boolean z12 = !arrayList4.isEmpty();
                    if (z9 || z10 || z12 || z11) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j9 = c0531k.f4940d;
                            if (hasNext) {
                                p0 p0Var = (p0) it.next();
                                View view = p0Var.itemView;
                                Iterator it2 = it;
                                ViewPropertyAnimator animate = view.animate();
                                c0531k.f5016q.add(p0Var);
                                animate.setDuration(j9).alpha(0.0f).setListener(new C0526f(c0531k, p0Var, animate, view)).start();
                                it = it2;
                            } else {
                                arrayList.clear();
                                if (z10) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0531k.m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0524e runnableC0524e = new RunnableC0524e(c0531k, arrayList5, 0);
                                    if (z9) {
                                        ViewCompat.postOnAnimationDelayed(((C0530j) arrayList5.get(0)).f5003a.itemView, runnableC0524e, j9);
                                    } else {
                                        runnableC0524e.run();
                                    }
                                }
                                if (z11) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0531k.f5013n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0524e runnableC0524e2 = new RunnableC0524e(c0531k, arrayList6, 1);
                                    if (z9) {
                                        ViewCompat.postOnAnimationDelayed(((C0529i) arrayList6.get(0)).f4992a.itemView, runnableC0524e2, j9);
                                    } else {
                                        runnableC0524e2.run();
                                    }
                                }
                                if (z12) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0531k.l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0524e runnableC0524e3 = new RunnableC0524e(c0531k, arrayList7, 2);
                                    if (!z9 && !z10 && !z11) {
                                        runnableC0524e3.run();
                                    } else {
                                        long j10 = 0;
                                        if (!z9) {
                                            j9 = 0;
                                        }
                                        if (z10) {
                                            j7 = c0531k.f4941e;
                                        } else {
                                            j7 = 0;
                                        }
                                        if (z11) {
                                            j10 = c0531k.f4942f;
                                        }
                                        z8 = false;
                                        ViewCompat.postOnAnimationDelayed(((p0) arrayList7.get(0)).itemView, runnableC0524e3, Math.max(j7, j10) + j9);
                                        recyclerView2.mPostedAnimatorRunner = z8;
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
                z8 = false;
                recyclerView2.mPostedAnimatorRunner = z8;
                return;
        }
    }
}
