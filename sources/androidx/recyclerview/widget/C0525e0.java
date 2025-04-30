package androidx.recyclerview.widget;

import T.C0260b;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.recyclerview.widget.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0525e0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4971a;
    public ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4972c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4973d;

    /* renamed from: e, reason: collision with root package name */
    public int f4974e;

    /* renamed from: f, reason: collision with root package name */
    public int f4975f;

    /* renamed from: g, reason: collision with root package name */
    public C0523d0 f4976g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4977h;

    public C0525e0(RecyclerView recyclerView) {
        this.f4977h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f4971a = arrayList;
        this.b = null;
        this.f4972c = new ArrayList();
        this.f4973d = Collections.unmodifiableList(arrayList);
        this.f4974e = 2;
        this.f4975f = 2;
    }

    public static void d(ViewGroup viewGroup, boolean z8) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                d((ViewGroup) childAt, true);
            }
        }
        if (!z8) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    public final void a(p0 p0Var, boolean z8) {
        C0260b c0260b;
        RecyclerView.clearNestedRecyclerViewIfNotNested(p0Var);
        View view = p0Var.itemView;
        RecyclerView recyclerView = this.f4977h;
        r0 r0Var = recyclerView.mAccessibilityDelegate;
        if (r0Var != null) {
            q0 q0Var = r0Var.f5083e;
            if (q0Var instanceof q0) {
                c0260b = (C0260b) q0Var.f5077e.remove(view);
            } else {
                c0260b = null;
            }
            ViewCompat.setAccessibilityDelegate(view, c0260b);
        }
        if (z8) {
            if (recyclerView.mRecyclerListeners.size() <= 0) {
                J j7 = recyclerView.mAdapter;
                if (j7 != null) {
                    j7.onViewRecycled(p0Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(p0Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + p0Var);
                }
            } else {
                com.mbridge.msdk.foundation.entity.o.v(recyclerView.mRecyclerListeners.get(0));
                throw null;
            }
        }
        p0Var.mBindingAdapter = null;
        p0Var.mOwnerRecyclerView = null;
        C0523d0 c9 = c();
        c9.getClass();
        int itemViewType = p0Var.getItemViewType();
        ArrayList arrayList = c9.a(itemViewType).f4960a;
        if (((C0521c0) c9.f4967a.get(itemViewType)).b <= arrayList.size()) {
            r8.k.g(p0Var.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(p0Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            p0Var.resetInternal();
            arrayList.add(p0Var);
        }
    }

    public final int b(int i9) {
        RecyclerView recyclerView = this.f4977h;
        if (i9 >= 0 && i9 < recyclerView.mState.b()) {
            if (!recyclerView.mState.f5031g) {
                return i9;
            }
            return recyclerView.mAdapterHelper.f(i9, 0);
        }
        StringBuilder p2 = Q7.n0.p(i9, "invalid position ", ". State item count is ");
        p2.append(recyclerView.mState.b());
        p2.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(p2.toString());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.recyclerview.widget.d0, java.lang.Object] */
    public final C0523d0 c() {
        if (this.f4976g == null) {
            ?? obj = new Object();
            obj.f4967a = new SparseArray();
            obj.b = 0;
            obj.f4968c = Collections.newSetFromMap(new IdentityHashMap());
            this.f4976g = obj;
            e();
        }
        return this.f4976g;
    }

    public final void e() {
        if (this.f4976g != null) {
            RecyclerView recyclerView = this.f4977h;
            if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                C0523d0 c0523d0 = this.f4976g;
                c0523d0.f4968c.add(recyclerView.mAdapter);
            }
        }
    }

    public final void f(J j7, boolean z8) {
        C0523d0 c0523d0 = this.f4976g;
        if (c0523d0 != null) {
            Set set = c0523d0.f4968c;
            set.remove(j7);
            if (set.size() == 0 && !z8) {
                int i9 = 0;
                while (true) {
                    SparseArray sparseArray = c0523d0.f4967a;
                    if (i9 < sparseArray.size()) {
                        ArrayList arrayList = ((C0521c0) sparseArray.get(sparseArray.keyAt(i9))).f4960a;
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            r8.k.g(((p0) arrayList.get(i10)).itemView);
                        }
                        i9++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            C0537q c0537q = this.f4977h.mPrefetchRegistry;
            int[] iArr = c0537q.f5074c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c0537q.f5075d = 0;
        }
    }

    public final void h(int i9) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i9);
        }
        ArrayList arrayList = this.f4972c;
        p0 p0Var = (p0) arrayList.get(i9);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + p0Var);
        }
        a(p0Var, true);
        arrayList.remove(i9);
    }

    public final void i(View view) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f4977h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        j(childViewHolderInt);
        if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            recyclerView.mItemAnimator.d(childViewHolderInt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d4, code lost:
    
        r4 = r4 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.p0 r12) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0525e0.j(androidx.recyclerview.widget.p0):void");
    }

    public final void k(View view) {
        p0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f4977h;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(Q7.n0.h(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.f4971a.add(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:267:0x0490, code lost:
    
        if ((r7 + r10) >= r27) goto L238;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0087  */
    /* JADX WARN: Type inference failed for: r5v28, types: [androidx.recyclerview.widget.P, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.p0 l(int r26, long r27) {
        /*
            Method dump skipped, instructions count: 1381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0525e0.l(int, long):androidx.recyclerview.widget.p0");
    }

    public final void m(p0 p0Var) {
        if (p0Var.mInChangeScrap) {
            this.b.remove(p0Var);
        } else {
            this.f4971a.remove(p0Var);
        }
        p0Var.mScrapContainer = null;
        p0Var.mInChangeScrap = false;
        p0Var.clearReturnedFromScrapFlag();
    }

    public final void n() {
        int i9;
        W w2 = this.f4977h.mLayout;
        if (w2 != null) {
            i9 = w2.mPrefetchMaxCountObserved;
        } else {
            i9 = 0;
        }
        this.f4975f = this.f4974e + i9;
        ArrayList arrayList = this.f4972c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f4975f; size--) {
            h(size);
        }
    }
}
