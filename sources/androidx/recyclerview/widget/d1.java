package androidx.recyclerview.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class d1 {
    public final ArrayList a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1890b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1891c;

    /* renamed from: d, reason: collision with root package name */
    public final List f1892d;

    /* renamed from: e, reason: collision with root package name */
    public int f1893e;

    /* renamed from: f, reason: collision with root package name */
    public int f1894f;

    /* renamed from: g, reason: collision with root package name */
    public c1 f1895g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1896h;

    public d1(RecyclerView recyclerView) {
        this.f1896h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.f1890b = null;
        this.f1891c = new ArrayList();
        this.f1892d = Collections.unmodifiableList(arrayList);
        this.f1893e = 2;
        this.f1894f = 2;
    }

    public static void e(ViewGroup viewGroup, boolean z10) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                e((ViewGroup) childAt, true);
            }
        }
        if (!z10) {
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

    public final void a(o1 o1Var, boolean z10) {
        n0.b bVar;
        RecyclerView.clearNestedRecyclerViewIfNotNested(o1Var);
        View view = o1Var.itemView;
        RecyclerView recyclerView = this.f1896h;
        q1 q1Var = recyclerView.mAccessibilityDelegate;
        if (q1Var != null) {
            p1 p1Var = q1Var.f2019e;
            if (p1Var instanceof p1) {
                bVar = (n0.b) p1Var.f2009e.remove(view);
            } else {
                bVar = null;
            }
            ViewCompat.setAccessibilityDelegate(view, bVar);
        }
        if (z10) {
            if (recyclerView.mRecyclerListeners.size() <= 0) {
                j0 j0Var = recyclerView.mAdapter;
                if (j0Var != null) {
                    j0Var.onViewRecycled(o1Var);
                }
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.d(o1Var);
                }
                if (RecyclerView.sVerboseLoggingEnabled) {
                    Log.d("RecyclerView", "dispatchViewRecycled: " + o1Var);
                }
            } else {
                a4.j.t(recyclerView.mRecyclerListeners.get(0));
                throw null;
            }
        }
        o1Var.mBindingAdapter = null;
        o1Var.mOwnerRecyclerView = null;
        c1 c10 = c();
        c10.getClass();
        int itemViewType = o1Var.getItemViewType();
        ArrayList arrayList = c10.a(itemViewType).a;
        if (((b1) c10.a.get(itemViewType)).f1875b <= arrayList.size()) {
            com.facebook.appevents.i.a(o1Var.itemView);
        } else {
            if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(o1Var)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            o1Var.resetInternal();
            arrayList.add(o1Var);
        }
    }

    public final int b(int i10) {
        RecyclerView recyclerView = this.f1896h;
        if (i10 >= 0 && i10 < recyclerView.mState.b()) {
            if (!recyclerView.mState.f1965g) {
                return i10;
            }
            return recyclerView.mAdapterHelper.f(i10, 0);
        }
        StringBuilder m10 = a4.j.m("invalid position ", i10, ". State item count is ");
        m10.append(recyclerView.mState.b());
        m10.append(recyclerView.exceptionLabel());
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public final c1 c() {
        if (this.f1895g == null) {
            this.f1895g = new c1();
            f();
        }
        return this.f1895g;
    }

    public final View d(int i10) {
        return m(Long.MAX_VALUE, i10).itemView;
    }

    public final void f() {
        if (this.f1895g != null) {
            RecyclerView recyclerView = this.f1896h;
            if (recyclerView.mAdapter != null && recyclerView.isAttachedToWindow()) {
                c1 c1Var = this.f1895g;
                c1Var.f1885c.add(recyclerView.mAdapter);
            }
        }
    }

    public final void g(j0 j0Var, boolean z10) {
        c1 c1Var = this.f1895g;
        if (c1Var != null) {
            Set set = c1Var.f1885c;
            set.remove(j0Var);
            if (set.size() == 0 && !z10) {
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = c1Var.a;
                    if (i10 < sparseArray.size()) {
                        ArrayList arrayList = ((b1) sparseArray.get(sparseArray.keyAt(i10))).a;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            com.facebook.appevents.i.a(((o1) arrayList.get(i11)).itemView);
                        }
                        i10++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f1891c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            i(size);
        }
        arrayList.clear();
        if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
            q qVar = this.f1896h.mPrefetchRegistry;
            int[] iArr = qVar.f2011c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            qVar.f2012d = 0;
        }
    }

    public final void i(int i10) {
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "Recycling cached view at index " + i10);
        }
        ArrayList arrayList = this.f1891c;
        o1 o1Var = (o1) arrayList.get(i10);
        if (RecyclerView.sVerboseLoggingEnabled) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + o1Var);
        }
        a(o1Var, true);
        arrayList.remove(i10);
    }

    public final void j(View view) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean isTmpDetached = childViewHolderInt.isTmpDetached();
        RecyclerView recyclerView = this.f1896h;
        if (isTmpDetached) {
            recyclerView.removeDetachedView(view, false);
        }
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        k(childViewHolderInt);
        if (recyclerView.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
            recyclerView.mItemAnimator.d(childViewHolderInt);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b7, code lost:
    
        if (r5 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00bb, code lost:
    
        if (r4 < 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bd, code lost:
    
        r5 = ((androidx.recyclerview.widget.o1) r6.get(r4)).mPosition;
        r7 = r3.mPrefetchRegistry;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c9, code lost:
    
        if (r7.f2011c == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cb, code lost:
    
        r8 = r7.f2012d * 2;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
    
        if (r9 >= r8) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d6, code lost:
    
        if (r7.f2011c[r9] != r5) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00da, code lost:
    
        r9 = r9 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d8, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00de, code lost:
    
        if (r5 != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00dd, code lost:
    
        r5 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(androidx.recyclerview.widget.o1 r12) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d1.k(androidx.recyclerview.widget.o1):void");
    }

    public final void l(View view) {
        o1 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        boolean hasAnyOfTheFlags = childViewHolderInt.hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.f1896h;
        if (!hasAnyOfTheFlags && childViewHolderInt.isUpdated() && !recyclerView.canReuseUpdatedViewHolder(childViewHolderInt)) {
            if (this.f1890b == null) {
                this.f1890b = new ArrayList();
            }
            childViewHolderInt.setScrapContainer(this, true);
            this.f1890b.add(childViewHolderInt);
            return;
        }
        if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !recyclerView.mAdapter.hasStableIds()) {
            throw new IllegalArgumentException(a4.j.d(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        childViewHolderInt.setScrapContainer(this, false);
        this.a.add(childViewHolderInt);
    }

    /* JADX WARN: Code restructure failed: missing block: B:272:0x0496, code lost:
    
        if (r6 == false) goto L257;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.o1 m(long r20, int r22) {
        /*
            Method dump skipped, instructions count: 1399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d1.m(long, int):androidx.recyclerview.widget.o1");
    }

    public final void n(o1 o1Var) {
        if (o1Var.mInChangeScrap) {
            this.f1890b.remove(o1Var);
        } else {
            this.a.remove(o1Var);
        }
        o1Var.mScrapContainer = null;
        o1Var.mInChangeScrap = false;
        o1Var.clearReturnedFromScrapFlag();
    }

    public final void o() {
        int i10;
        v0 v0Var = this.f1896h.mLayout;
        if (v0Var != null) {
            i10 = v0Var.mPrefetchMaxCountObserved;
        } else {
            i10 = 0;
        }
        this.f1894f = this.f1893e + i10;
        ArrayList arrayList = this.f1891c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f1894f; size--) {
            i(size);
        }
    }
}
