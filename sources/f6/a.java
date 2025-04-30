package F6;

import G7.j;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.EnumC0504n;
import androidx.recyclerview.widget.J;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p0;
import androidx.viewpager2.widget.ViewPager2;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n1.C2475f;
import x.f;
import x.h;

/* loaded from: classes3.dex */
public final class a extends J {

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0505o f1210i;

    /* renamed from: j, reason: collision with root package name */
    public final FragmentManager f1211j;

    /* renamed from: k, reason: collision with root package name */
    public final f f1212k;
    public final f l;
    public final f m;

    /* renamed from: n, reason: collision with root package name */
    public R0.d f1213n;

    /* renamed from: o, reason: collision with root package name */
    public final C2475f f1214o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1215p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1216q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f1217r;

    public a(FragmentManager fragmentManager, AbstractC0505o abstractC0505o) {
        j.e(abstractC0505o, "lifecycle");
        this.f1212k = new f();
        this.l = new f();
        this.m = new f();
        C2475f c2475f = new C2475f(6, false);
        c2475f.f21833c = new CopyOnWriteArrayList();
        this.f1214o = c2475f;
        this.f1215p = false;
        this.f1216q = false;
        this.f1211j = fragmentManager;
        this.f1210i = abstractC0505o;
        super.setHasStableIds(true);
        this.f1217r = new ArrayList();
    }

    public static void a(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final boolean b(long j7) {
        if (j7 >= 0 && j7 < getItemCount()) {
            return true;
        }
        return false;
    }

    public final void c() {
        f fVar;
        f fVar2;
        Fragment fragment;
        View view;
        if (this.f1216q && !this.f1211j.isStateSaved()) {
            x.c cVar = new x.c(0);
            int i9 = 0;
            while (true) {
                fVar = this.f1212k;
                int h6 = fVar.h();
                fVar2 = this.m;
                if (i9 >= h6) {
                    break;
                }
                long e4 = fVar.e(i9);
                if (!b(e4)) {
                    cVar.add(Long.valueOf(e4));
                    fVar2.g(e4);
                }
                i9++;
            }
            if (!this.f1215p) {
                this.f1216q = false;
                for (int i10 = 0; i10 < fVar.h(); i10++) {
                    long e9 = fVar.e(i10);
                    if (fVar2.b) {
                        fVar2.c();
                    }
                    if (x.e.b(fVar2.f24070c, fVar2.f24072f, e9) < 0 && ((fragment = (Fragment) fVar.d(null, e9)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        cVar.add(Long.valueOf(e9));
                    }
                }
            }
            Iterator it = cVar.iterator();
            while (true) {
                h hVar = (h) it;
                if (hVar.hasNext()) {
                    f(((Long) hVar.next()).longValue());
                } else {
                    return;
                }
            }
        }
    }

    public final Long d(int i9) {
        Long l = null;
        int i10 = 0;
        while (true) {
            f fVar = this.m;
            if (i10 < fVar.h()) {
                if (((Integer) fVar.i(i10)).intValue() == i9) {
                    if (l == null) {
                        l = Long.valueOf(fVar.e(i10));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i10++;
            } else {
                return l;
            }
        }
    }

    public final void e(R0.e eVar) {
        Fragment fragment = (Fragment) this.f1212k.d(null, eVar.getItemId());
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) eVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = fragment.isAdded();
            FragmentManager fragmentManager = this.f1211j;
            if (isAdded && view == null) {
                fragmentManager.registerFragmentLifecycleCallbacks(new R0.b(this, fragment, frameLayout), false);
                return;
            }
            if (fragment.isAdded() && view.getParent() != null) {
                if (view.getParent() != frameLayout) {
                    a(view, frameLayout);
                    return;
                }
                return;
            }
            if (fragment.isAdded()) {
                a(view, frameLayout);
                return;
            }
            if (!fragmentManager.isStateSaved()) {
                fragmentManager.registerFragmentLifecycleCallbacks(new R0.b(this, fragment, frameLayout), false);
                C2475f c2475f = this.f1214o;
                c2475f.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = ((CopyOnWriteArrayList) c2475f.f21833c).iterator();
                if (!it.hasNext()) {
                    try {
                        fragment.setMenuVisibility(false);
                        fragmentManager.beginTransaction().add(fragment, "f" + eVar.getItemId()).setMaxLifecycle(fragment, EnumC0504n.f4894f).commitNow();
                        this.f1213n.c(false);
                        return;
                    } finally {
                        C2475f.l(arrayList);
                    }
                }
                o.v(it.next());
                throw null;
            }
            if (fragmentManager.isDestroyed()) {
                return;
            }
            this.f1210i.a(new R0.a(this, eVar));
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void f(long j7) {
        ViewParent parent;
        f fVar = this.f1212k;
        Fragment fragment = (Fragment) fVar.d(null, j7);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean b = b(j7);
        f fVar2 = this.l;
        if (!b) {
            fVar2.g(j7);
        }
        if (!fragment.isAdded()) {
            fVar.g(j7);
            return;
        }
        FragmentManager fragmentManager = this.f1211j;
        if (fragmentManager.isStateSaved()) {
            this.f1216q = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        C2475f c2475f = this.f1214o;
        if (isAdded && b(j7)) {
            c2475f.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) c2475f.f21833c).iterator();
            if (!it.hasNext()) {
                G saveFragmentInstanceState = fragmentManager.saveFragmentInstanceState(fragment);
                C2475f.l(arrayList);
                fVar2.f(j7, saveFragmentInstanceState);
            } else {
                o.v(it.next());
                throw null;
            }
        }
        c2475f.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) c2475f.f21833c).iterator();
        if (!it2.hasNext()) {
            try {
                fragmentManager.beginTransaction().remove(fragment).commitNow();
                fVar.g(j7);
                return;
            } finally {
                C2475f.l(arrayList2);
            }
        }
        o.v(it2.next());
        throw null;
    }

    @Override // androidx.recyclerview.widget.J
    public final int getItemCount() {
        return this.f1217r.size();
    }

    @Override // androidx.recyclerview.widget.J
    public final long getItemId(int i9) {
        return i9;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [R0.d, java.lang.Object] */
    @Override // androidx.recyclerview.widget.J
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (this.f1213n == null) {
            ?? obj = new Object();
            obj.f2623f = this;
            obj.f2619a = -1L;
            this.f1213n = obj;
            ViewPager2 b = R0.d.b(recyclerView);
            obj.f2622e = b;
            E6.f fVar = new E6.f(obj, 2);
            obj.b = fVar;
            ((ArrayList) b.f5168d.b).add(fVar);
            R0.c cVar = new R0.c(obj);
            obj.f2620c = cVar;
            registerAdapterDataObserver(cVar);
            G0.b bVar = new G0.b(obj, 1);
            obj.f2621d = bVar;
            this.f1210i.a(bVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.J
    public final void onBindViewHolder(p0 p0Var, int i9) {
        R0.e eVar = (R0.e) p0Var;
        long itemId = eVar.getItemId();
        int id = ((FrameLayout) eVar.itemView).getId();
        Long d2 = d(id);
        f fVar = this.m;
        if (d2 != null && d2.longValue() != itemId) {
            f(d2.longValue());
            fVar.g(d2.longValue());
        }
        fVar.f(itemId, Integer.valueOf(id));
        long j7 = i9;
        f fVar2 = this.f1212k;
        if (fVar2.b) {
            fVar2.c();
        }
        if (x.e.b(fVar2.f24070c, fVar2.f24072f, j7) < 0) {
            Fragment fragment = (Fragment) this.f1217r.get(i9);
            fragment.setInitialSavedState((G) this.l.d(null, j7));
            fVar2.f(j7, fragment);
        }
        if (ViewCompat.isAttachedToWindow((FrameLayout) eVar.itemView)) {
            e(eVar);
        }
        c();
    }

    @Override // androidx.recyclerview.widget.J
    public final p0 onCreateViewHolder(ViewGroup viewGroup, int i9) {
        int i10 = R0.e.b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new p0(frameLayout);
    }

    @Override // androidx.recyclerview.widget.J
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        R0.d dVar = this.f1213n;
        dVar.getClass();
        ViewPager2 b = R0.d.b(recyclerView);
        ((ArrayList) b.f5168d.b).remove((E6.f) dVar.b);
        R0.c cVar = (R0.c) dVar.f2620c;
        a aVar = (a) dVar.f2623f;
        aVar.unregisterAdapterDataObserver(cVar);
        aVar.f1210i.b((G0.b) dVar.f2621d);
        dVar.f2622e = null;
        this.f1213n = null;
    }

    @Override // androidx.recyclerview.widget.J
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(p0 p0Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.J
    public final void onViewAttachedToWindow(p0 p0Var) {
        e((R0.e) p0Var);
        c();
    }

    @Override // androidx.recyclerview.widget.J
    public final void onViewRecycled(p0 p0Var) {
        Long d2 = d(((FrameLayout) ((R0.e) p0Var).itemView).getId());
        if (d2 != null) {
            f(d2.longValue());
            this.m.g(d2.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.J
    public final void setHasStableIds(boolean z8) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
