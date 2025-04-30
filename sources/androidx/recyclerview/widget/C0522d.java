package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0522d {

    /* renamed from: a, reason: collision with root package name */
    public final H f4963a;

    /* renamed from: e, reason: collision with root package name */
    public View f4966e;

    /* renamed from: d, reason: collision with root package name */
    public int f4965d = 0;
    public final C0520c b = new C0520c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4964c = new ArrayList();

    public C0522d(H h6) {
        this.f4963a = h6;
    }

    public final void a(View view, int i9, boolean z8) {
        int f9;
        H h6 = this.f4963a;
        if (i9 < 0) {
            f9 = h6.f4935a.getChildCount();
        } else {
            f9 = f(i9);
        }
        this.b.e(f9, z8);
        if (z8) {
            i(view);
        }
        RecyclerView recyclerView = h6.f4935a;
        recyclerView.addView(view, f9);
        recyclerView.dispatchChildAttached(view);
    }

    public final void b(View view, int i9, ViewGroup.LayoutParams layoutParams, boolean z8) {
        int f9;
        H h6 = this.f4963a;
        if (i9 < 0) {
            f9 = h6.f4935a.getChildCount();
        } else {
            f9 = f(i9);
        }
        this.b.e(f9, z8);
        if (z8) {
            i(view);
        }
        h6.getClass();
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        RecyclerView recyclerView = h6.f4935a;
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(Q7.n0.h(recyclerView, sb));
            }
            if (RecyclerView.sVerboseLoggingEnabled) {
                Log.d("RecyclerView", "reAttach " + childViewHolderInt);
            }
            childViewHolderInt.clearTmpDetachFlag();
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(f9);
            throw new IllegalArgumentException(Q7.n0.h(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, f9, layoutParams);
    }

    public final void c(int i9) {
        int f9 = f(i9);
        this.b.f(f9);
        RecyclerView recyclerView = this.f4963a.f4935a;
        View childAt = recyclerView.getChildAt(f9);
        if (childAt != null) {
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.isTmpDetached() && !childViewHolderInt.shouldIgnore()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(Q7.n0.h(recyclerView, sb));
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "tmpDetach " + childViewHolderInt);
                }
                childViewHolderInt.addFlags(NotificationCompat.FLAG_LOCAL_ONLY);
            }
        } else if (RecyclerView.sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f9);
            throw new IllegalArgumentException(Q7.n0.h(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f9);
    }

    public final View d(int i9) {
        return this.f4963a.f4935a.getChildAt(f(i9));
    }

    public final int e() {
        return this.f4963a.f4935a.getChildCount() - this.f4964c.size();
    }

    public final int f(int i9) {
        if (i9 < 0) {
            return -1;
        }
        int childCount = this.f4963a.f4935a.getChildCount();
        int i10 = i9;
        while (i10 < childCount) {
            C0520c c0520c = this.b;
            int b = i9 - (i10 - c0520c.b(i10));
            if (b == 0) {
                while (c0520c.d(i10)) {
                    i10++;
                }
                return i10;
            }
            i10 += b;
        }
        return -1;
    }

    public final View g(int i9) {
        return this.f4963a.f4935a.getChildAt(i9);
    }

    public final int h() {
        return this.f4963a.f4935a.getChildCount();
    }

    public final void i(View view) {
        this.f4964c.add(view);
        H h6 = this.f4963a;
        h6.getClass();
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            childViewHolderInt.onEnteredHiddenState(h6.f4935a);
        }
    }

    public final int j(View view) {
        int indexOfChild = this.f4963a.f4935a.indexOfChild(view);
        if (indexOfChild == -1) {
            return -1;
        }
        C0520c c0520c = this.b;
        if (c0520c.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - c0520c.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.f4964c.contains(view);
    }

    public final void l(int i9) {
        H h6 = this.f4963a;
        int i10 = this.f4965d;
        if (i10 != 1) {
            if (i10 != 2) {
                try {
                    int f9 = f(i9);
                    View childAt = h6.f4935a.getChildAt(f9);
                    if (childAt == null) {
                        this.f4965d = 0;
                        this.f4966e = null;
                        return;
                    }
                    this.f4965d = 1;
                    this.f4966e = childAt;
                    if (this.b.f(f9)) {
                        m(childAt);
                    }
                    h6.c(f9);
                    this.f4965d = 0;
                    this.f4966e = null;
                    return;
                } catch (Throwable th) {
                    this.f4965d = 0;
                    this.f4966e = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public final void m(View view) {
        if (this.f4964c.remove(view)) {
            H h6 = this.f4963a;
            h6.getClass();
            p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(h6.f4935a);
            }
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.f4964c.size();
    }
}
