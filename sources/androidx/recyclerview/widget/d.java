package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {
    public final h0 a;

    /* renamed from: e, reason: collision with root package name */
    public View f1889e;

    /* renamed from: d, reason: collision with root package name */
    public int f1888d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final c f1886b = new c(0);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1887c = new ArrayList();

    public d(h0 h0Var) {
        this.a = h0Var;
    }

    public final void a(View view, int i10, boolean z10) {
        int f10;
        h0 h0Var = this.a;
        if (i10 < 0) {
            f10 = h0Var.c();
        } else {
            f10 = f(i10);
        }
        this.f1886b.i(f10, z10);
        if (z10) {
            i(view);
        }
        RecyclerView recyclerView = h0Var.a;
        recyclerView.addView(view, f10);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int f10;
        h0 h0Var = this.a;
        if (i10 < 0) {
            f10 = h0Var.c();
        } else {
            f10 = f(i10);
        }
        this.f1886b.i(f10, z10);
        if (z10) {
            i(view);
        }
        h0Var.getClass();
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = h0Var.a;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called attach on a child which is not detached: ");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a4.j.d(recyclerView, sb2));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(f10);
            throw new IllegalArgumentException(a4.j.d(recyclerView, sb3));
        }
        recyclerView.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        int f10 = f(i10);
        this.f1886b.k(f10);
        h0 h0Var = this.a;
        View childAt = h0Var.a.getChildAt(f10);
        RecyclerView recyclerView = h0Var.a;
        if (childAt != null) {
            o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb2 = new StringBuilder("called detach on an already detached child ");
                    sb2.append(childViewHolderInt);
                    throw new IllegalArgumentException(a4.j.d(recyclerView, sb2));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No view at offset ");
            sb3.append(f10);
            throw new IllegalArgumentException(a4.j.d(recyclerView, sb3));
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return this.a.a.getChildAt(f(i10));
    }

    public final int e() {
        return this.a.c() - this.f1887c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c10 = this.a.c();
        int i11 = i10;
        while (i11 < c10) {
            c cVar = this.f1886b;
            int b3 = i10 - (i11 - cVar.b(i11));
            if (b3 == 0) {
                while (cVar.f(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b3;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.a.a.getChildAt(i10);
    }

    public final int h() {
        return this.a.c();
    }

    public final void i(View view) {
        this.f1887c.add(view);
        h0 h0Var = this.a;
        h0Var.getClass();
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(h0Var.a);
        }
    }

    public final int j(View view) {
        int indexOfChild = this.a.a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        c cVar = this.f1886b;
        if (cVar.f(indexOfChild)) {
            return -1;
        }
        return indexOfChild - cVar.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f1887c.contains(view);
    }

    public final void l(int i10) {
        h0 h0Var = this.a;
        int i11 = this.f1888d;
        if (i11 != 1) {
            if (i11 != 2) {
                try {
                    int f10 = f(i10);
                    View childAt = h0Var.a.getChildAt(f10);
                    if (childAt != null) {
                        this.f1888d = 1;
                        this.f1889e = childAt;
                        if (this.f1886b.k(f10)) {
                            m(childAt);
                        }
                        h0Var.d(f10);
                    }
                    return;
                } finally {
                    this.f1888d = 0;
                    this.f1889e = null;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void m(View view) {
        if (this.f1887c.remove(view)) {
            h0 h0Var = this.a;
            h0Var.getClass();
            o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(h0Var.a);
            }
        }
    }

    public final String toString() {
        return this.f1886b.toString() + ", hidden list:" + this.f1887c.size();
    }
}
