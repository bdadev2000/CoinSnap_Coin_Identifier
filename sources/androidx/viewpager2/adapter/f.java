package androidx.viewpager2.adapter;

import a4.j;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {
    public d a;

    /* renamed from: b, reason: collision with root package name */
    public e f2132b;

    /* renamed from: c, reason: collision with root package name */
    public t f2133c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager2 f2134d;

    /* renamed from: e, reason: collision with root package name */
    public long f2135e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f2136f;

    public f(g gVar) {
        this.f2136f = gVar;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public final void b(boolean z10) {
        boolean z11;
        int currentItem;
        Fragment fragment;
        boolean z12;
        g gVar = this.f2136f;
        if (gVar.f2138j.isStateSaved() || this.f2134d.getScrollState() != 0) {
            return;
        }
        r.e eVar = gVar.f2139k;
        if (eVar.h() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || gVar.getItemCount() == 0 || (currentItem = this.f2134d.getCurrentItem()) >= gVar.getItemCount()) {
            return;
        }
        long j3 = currentItem;
        if ((j3 != this.f2135e || z10) && (fragment = (Fragment) eVar.d(j3, null)) != null && fragment.isAdded()) {
            this.f2135e = j3;
            FragmentTransaction beginTransaction = gVar.f2138j.beginTransaction();
            ArrayList arrayList = new ArrayList();
            Fragment fragment2 = null;
            int i10 = 0;
            while (true) {
                int h10 = eVar.h();
                c cVar = gVar.f2143o;
                if (i10 < h10) {
                    long e2 = eVar.e(i10);
                    Fragment fragment3 = (Fragment) eVar.i(i10);
                    if (fragment3.isAdded()) {
                        if (e2 != this.f2135e) {
                            beginTransaction.setMaxLifecycle(fragment3, o.STARTED);
                            cVar.getClass();
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it = cVar.f2129b.iterator();
                            if (!it.hasNext()) {
                                arrayList.add(arrayList2);
                            } else {
                                j.t(it.next());
                                throw null;
                            }
                        } else {
                            fragment2 = fragment3;
                        }
                        if (e2 == this.f2135e) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fragment3.setMenuVisibility(z12);
                    }
                    i10++;
                } else {
                    if (fragment2 != null) {
                        beginTransaction.setMaxLifecycle(fragment2, o.RESUMED);
                        cVar.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = cVar.f2129b.iterator();
                        if (!it2.hasNext()) {
                            arrayList.add(arrayList3);
                        } else {
                            j.t(it2.next());
                            throw null;
                        }
                    }
                    if (!beginTransaction.isEmpty()) {
                        beginTransaction.commitNow();
                        Collections.reverse(arrayList);
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            List list = (List) it3.next();
                            cVar.getClass();
                            c.c(list);
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
