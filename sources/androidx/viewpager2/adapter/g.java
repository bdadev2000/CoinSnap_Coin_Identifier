package androidx.viewpager2.adapter;

import a4.j;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.b0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;
import androidx.recyclerview.widget.o1;
import androidx.viewpager2.widget.ViewPager2;
import c6.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g extends j0 implements i {

    /* renamed from: i, reason: collision with root package name */
    public final p f2137i;

    /* renamed from: j, reason: collision with root package name */
    public final FragmentManager f2138j;

    /* renamed from: k, reason: collision with root package name */
    public final r.e f2139k;

    /* renamed from: l, reason: collision with root package name */
    public final r.e f2140l;

    /* renamed from: m, reason: collision with root package name */
    public final r.e f2141m;

    /* renamed from: n, reason: collision with root package name */
    public f f2142n;

    /* renamed from: o, reason: collision with root package name */
    public final c f2143o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2144p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2145q;

    public g(FragmentActivity fragmentActivity) {
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        p lifecycle = fragmentActivity.getLifecycle();
        this.f2139k = new r.e();
        this.f2140l = new r.e();
        this.f2141m = new r.e();
        this.f2143o = new c(0);
        this.f2144p = false;
        this.f2145q = false;
        this.f2138j = supportFragmentManager;
        this.f2137i = lifecycle;
        super.setHasStableIds(true);
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

    public final boolean b(long j3) {
        return j3 >= 0 && j3 < ((long) getItemCount());
    }

    public abstract mf.d c(int i10);

    public final void d() {
        r.e eVar;
        r.e eVar2;
        boolean z10;
        Fragment fragment;
        View view;
        if (this.f2145q && !this.f2138j.isStateSaved()) {
            r.c cVar = new r.c(0);
            int i10 = 0;
            while (true) {
                eVar = this.f2139k;
                int h10 = eVar.h();
                eVar2 = this.f2141m;
                if (i10 >= h10) {
                    break;
                }
                long e2 = eVar.e(i10);
                if (!b(e2)) {
                    cVar.add(Long.valueOf(e2));
                    eVar2.g(e2);
                }
                i10++;
            }
            if (!this.f2144p) {
                this.f2145q = false;
                for (int i11 = 0; i11 < eVar.h(); i11++) {
                    long e10 = eVar.e(i11);
                    if (eVar2.f23933b) {
                        eVar2.c();
                    }
                    boolean z11 = true;
                    if (k.e(eVar2.f23934c, eVar2.f23936f, e10) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10 && ((fragment = (Fragment) eVar.d(e10, null)) == null || (view = fragment.getView()) == null || view.getParent() == null)) {
                        z11 = false;
                    }
                    if (!z11) {
                        cVar.add(Long.valueOf(e10));
                    }
                }
            }
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                g(((Long) it.next()).longValue());
            }
        }
    }

    public final Long e(int i10) {
        Long l10 = null;
        int i11 = 0;
        while (true) {
            r.e eVar = this.f2141m;
            if (i11 < eVar.h()) {
                if (((Integer) eVar.i(i11)).intValue() == i10) {
                    if (l10 == null) {
                        l10 = Long.valueOf(eVar.e(i11));
                    } else {
                        throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                    }
                }
                i11++;
            } else {
                return l10;
            }
        }
    }

    public final void f(final h hVar) {
        Fragment fragment = (Fragment) this.f2139k.d(hVar.getItemId(), null);
        if (fragment != null) {
            FrameLayout frameLayout = (FrameLayout) hVar.itemView;
            View view = fragment.getView();
            if (!fragment.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            boolean isAdded = fragment.isAdded();
            FragmentManager fragmentManager = this.f2138j;
            if (isAdded && view == null) {
                fragmentManager.registerFragmentLifecycleCallbacks(new a(this, fragment, frameLayout), false);
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
                fragmentManager.registerFragmentLifecycleCallbacks(new a(this, fragment, frameLayout), false);
                c cVar = this.f2143o;
                cVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator it = cVar.f2129b.iterator();
                if (!it.hasNext()) {
                    try {
                        fragment.setMenuVisibility(false);
                        fragmentManager.beginTransaction().add(fragment, "f" + hVar.getItemId()).setMaxLifecycle(fragment, o.STARTED).commitNow();
                        this.f2142n.b(false);
                        return;
                    } finally {
                        c.c(arrayList);
                    }
                }
                j.t(it.next());
                throw null;
            }
            if (fragmentManager.isDestroyed()) {
                return;
            }
            this.f2137i.a(new t() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$1
                @Override // androidx.lifecycle.t
                public final void a(v vVar, n nVar) {
                    g gVar = g.this;
                    if (gVar.f2138j.isStateSaved()) {
                        return;
                    }
                    vVar.getLifecycle().b(this);
                    h hVar2 = hVar;
                    if (ViewCompat.isAttachedToWindow((FrameLayout) hVar2.itemView)) {
                        gVar.f(hVar2);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void g(long j3) {
        ViewParent parent;
        r.e eVar = this.f2139k;
        Fragment fragment = (Fragment) eVar.d(j3, null);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean b3 = b(j3);
        r.e eVar2 = this.f2140l;
        if (!b3) {
            eVar2.g(j3);
        }
        if (!fragment.isAdded()) {
            eVar.g(j3);
            return;
        }
        FragmentManager fragmentManager = this.f2138j;
        if (fragmentManager.isStateSaved()) {
            this.f2145q = true;
            return;
        }
        boolean isAdded = fragment.isAdded();
        c cVar = this.f2143o;
        if (isAdded && b(j3)) {
            cVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = cVar.f2129b.iterator();
            if (!it.hasNext()) {
                b0 saveFragmentInstanceState = fragmentManager.saveFragmentInstanceState(fragment);
                c.c(arrayList);
                eVar2.f(j3, saveFragmentInstanceState);
            } else {
                j.t(it.next());
                throw null;
            }
        }
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cVar.f2129b.iterator();
        if (!it2.hasNext()) {
            try {
                fragmentManager.beginTransaction().remove(fragment).commitNow();
                eVar.g(j3);
                return;
            } finally {
                c.c(arrayList2);
            }
        }
        j.t(it2.next());
        throw null;
    }

    @Override // androidx.recyclerview.widget.j0
    public final long getItemId(int i10) {
        return i10;
    }

    public final void h(Parcelable parcelable) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        r.e eVar = this.f2140l;
        boolean z14 = false;
        if (eVar.h() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            r.e eVar2 = this.f2139k;
            if (eVar2.h() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        eVar2.f(Long.parseLong(str.substring(2)), this.f2138j.getFragment(bundle, str));
                    } else {
                        if (str.startsWith("s#") && str.length() > 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            long parseLong = Long.parseLong(str.substring(2));
                            b0 b0Var = (b0) bundle.getParcelable(str);
                            if (b(parseLong)) {
                                eVar.f(parseLong, b0Var);
                            }
                        } else {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                    }
                }
                if (eVar2.h() == 0) {
                    z14 = true;
                }
                if (!z14) {
                    this.f2145q = true;
                    this.f2144p = true;
                    d();
                    final Handler handler = new Handler(Looper.getMainLooper());
                    final androidx.activity.i iVar = new androidx.activity.i(this, 9);
                    this.f2137i.a(new t() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$4
                        @Override // androidx.lifecycle.t
                        public final void a(v vVar, n nVar) {
                            if (nVar == n.ON_DESTROY) {
                                handler.removeCallbacks(iVar);
                                vVar.getLifecycle().b(this);
                            }
                        }
                    });
                    handler.postDelayed(iVar, 10000L);
                    return;
                }
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        boolean z10;
        int i10 = 0;
        if (this.f2142n == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            final f fVar = new f(this);
            this.f2142n = fVar;
            ViewPager2 a = f.a(recyclerView);
            fVar.f2134d = a;
            d dVar = new d(fVar, i10);
            fVar.a = dVar;
            a.a(dVar);
            e eVar = new e(fVar);
            fVar.f2132b = eVar;
            registerAdapterDataObserver(eVar);
            t tVar = new t() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$3
                @Override // androidx.lifecycle.t
                public final void a(v vVar, n nVar) {
                    f.this.b(false);
                }
            };
            fVar.f2133c = tVar;
            this.f2137i.a(tVar);
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onBindViewHolder(o1 o1Var, int i10) {
        boolean z10;
        h hVar = (h) o1Var;
        long itemId = hVar.getItemId();
        int id2 = ((FrameLayout) hVar.itemView).getId();
        Long e2 = e(id2);
        r.e eVar = this.f2141m;
        if (e2 != null && e2.longValue() != itemId) {
            g(e2.longValue());
            eVar.g(e2.longValue());
        }
        eVar.f(itemId, Integer.valueOf(id2));
        long j3 = i10;
        r.e eVar2 = this.f2139k;
        if (eVar2.f23933b) {
            eVar2.c();
        }
        if (k.e(eVar2.f23934c, eVar2.f23936f, j3) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            mf.d c10 = c(i10);
            c10.setInitialSavedState((b0) this.f2140l.d(j3, null));
            eVar2.f(j3, c10);
        }
        if (ViewCompat.isAttachedToWindow((FrameLayout) hVar.itemView)) {
            f(hVar);
        }
        d();
    }

    @Override // androidx.recyclerview.widget.j0
    public final o1 onCreateViewHolder(ViewGroup viewGroup, int i10) {
        int i11 = h.f2146b;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new h(frameLayout);
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        f fVar = this.f2142n;
        fVar.getClass();
        ViewPager2 a = f.a(recyclerView);
        ((List) a.f2149d.f2130b).remove(fVar.a);
        e eVar = fVar.f2132b;
        g gVar = fVar.f2136f;
        gVar.unregisterAdapterDataObserver(eVar);
        gVar.f2137i.b(fVar.f2133c);
        fVar.f2134d = null;
        this.f2142n = null;
    }

    @Override // androidx.recyclerview.widget.j0
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(o1 o1Var) {
        return true;
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onViewAttachedToWindow(o1 o1Var) {
        f((h) o1Var);
        d();
    }

    @Override // androidx.recyclerview.widget.j0
    public final void onViewRecycled(o1 o1Var) {
        Long e2 = e(((FrameLayout) ((h) o1Var).itemView).getId());
        if (e2 != null) {
            g(e2.longValue());
            this.f2141m.g(e2.longValue());
        }
    }

    @Override // androidx.recyclerview.widget.j0
    public final void setHasStableIds(boolean z10) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
