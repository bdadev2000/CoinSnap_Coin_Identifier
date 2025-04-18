package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f21125a;

    /* renamed from: b, reason: collision with root package name */
    public final Span[] f21126b;

    /* renamed from: c, reason: collision with root package name */
    public final OrientationHelper f21127c;
    public final OrientationHelper d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public int f21128f;

    /* renamed from: g, reason: collision with root package name */
    public final LayoutState f21129g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21130h;

    /* renamed from: j, reason: collision with root package name */
    public final BitSet f21132j;

    /* renamed from: m, reason: collision with root package name */
    public final LazySpanLookup f21135m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21136n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f21137o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f21138p;

    /* renamed from: q, reason: collision with root package name */
    public SavedState f21139q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f21140r;

    /* renamed from: s, reason: collision with root package name */
    public final AnchorInfo f21141s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f21142t;

    /* renamed from: u, reason: collision with root package name */
    public int[] f21143u;

    /* renamed from: v, reason: collision with root package name */
    public final Runnable f21144v;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21131i = false;

    /* renamed from: k, reason: collision with root package name */
    public int f21133k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f21134l = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public class AnchorInfo {

        /* renamed from: a, reason: collision with root package name */
        public int f21146a;

        /* renamed from: b, reason: collision with root package name */
        public int f21147b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21148c;
        public boolean d;
        public boolean e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f21149f;

        public AnchorInfo() {
            a();
        }

        public final void a() {
            this.f21146a = -1;
            this.f21147b = Integer.MIN_VALUE;
            this.f21148c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f21149f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends RecyclerView.LayoutParams {
        public Span e;
    }

    /* loaded from: classes.dex */
    public static class LazySpanLookup {

        /* renamed from: a, reason: collision with root package name */
        public int[] f21151a;

        /* renamed from: b, reason: collision with root package name */
        public List f21152b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new Object();

            /* renamed from: a, reason: collision with root package name */
            public int f21153a;

            /* renamed from: b, reason: collision with root package name */
            public int f21154b;

            /* renamed from: c, reason: collision with root package name */
            public int[] f21155c;
            public boolean d;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, reason: invalid class name */
            /* loaded from: classes.dex */
            public class AnonymousClass1 implements Parcelable.Creator<FullSpanItem> {
                /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public final FullSpanItem createFromParcel(Parcel parcel) {
                    ?? obj = new Object();
                    obj.f21153a = parcel.readInt();
                    obj.f21154b = parcel.readInt();
                    obj.d = parcel.readInt() == 1;
                    int readInt = parcel.readInt();
                    if (readInt > 0) {
                        int[] iArr = new int[readInt];
                        obj.f21155c = iArr;
                        parcel.readIntArray(iArr);
                    }
                    return obj;
                }

                @Override // android.os.Parcelable.Creator
                public final FullSpanItem[] newArray(int i2) {
                    return new FullSpanItem[i2];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                return "FullSpanItem{mPosition=" + this.f21153a + ", mGapDir=" + this.f21154b + ", mHasUnwantedGapAfter=" + this.d + ", mGapPerSpan=" + Arrays.toString(this.f21155c) + '}';
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f21153a);
                parcel.writeInt(this.f21154b);
                parcel.writeInt(this.d ? 1 : 0);
                int[] iArr = this.f21155c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f21155c);
                }
            }
        }

        public final void a() {
            int[] iArr = this.f21151a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f21152b = null;
        }

        public final void b(int i2) {
            int[] iArr = this.f21151a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i2, 10) + 1];
                this.f21151a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f21151a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f21151a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f21151a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r6 < r0) goto La
                return r1
            La:
                java.util.List r0 = r5.f21152b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L5f
            L10:
                r2 = 0
                if (r0 != 0) goto L14
                goto L2d
            L14:
                int r0 = r0.size()
                int r0 = r0 + (-1)
            L1a:
                if (r0 < 0) goto L2d
                java.util.List r3 = r5.f21152b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.f21153a
                if (r4 != r6) goto L2a
                r2 = r3
                goto L2d
            L2a:
                int r0 = r0 + (-1)
                goto L1a
            L2d:
                if (r2 == 0) goto L34
                java.util.List r0 = r5.f21152b
                r0.remove(r2)
            L34:
                java.util.List r0 = r5.f21152b
                int r0 = r0.size()
                r2 = 0
            L3b:
                if (r2 >= r0) goto L4d
                java.util.List r3 = r5.f21152b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f21153a
                if (r3 < r6) goto L4a
                goto L4e
            L4a:
                int r2 = r2 + 1
                goto L3b
            L4d:
                r2 = r1
            L4e:
                if (r2 == r1) goto Le
                java.util.List r0 = r5.f21152b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List r3 = r5.f21152b
                r3.remove(r2)
                int r0 = r0.f21153a
            L5f:
                if (r0 != r1) goto L6b
                int[] r0 = r5.f21151a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f21151a
                int r6 = r6.length
                return r6
            L6b:
                int r0 = r0 + 1
                int[] r2 = r5.f21151a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f21151a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.c(int):int");
        }

        public final void d(int i2, int i3) {
            int[] iArr = this.f21151a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            b(i4);
            int[] iArr2 = this.f21151a;
            System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
            Arrays.fill(this.f21151a, i2, i4, -1);
            List list = this.f21152b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f21152b.get(size);
                int i5 = fullSpanItem.f21153a;
                if (i5 >= i2) {
                    fullSpanItem.f21153a = i5 + i3;
                }
            }
        }

        public final void e(int i2, int i3) {
            int[] iArr = this.f21151a;
            if (iArr == null || i2 >= iArr.length) {
                return;
            }
            int i4 = i2 + i3;
            b(i4);
            int[] iArr2 = this.f21151a;
            System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
            int[] iArr3 = this.f21151a;
            Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
            List list = this.f21152b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f21152b.get(size);
                int i5 = fullSpanItem.f21153a;
                if (i5 >= i2) {
                    if (i5 < i4) {
                        this.f21152b.remove(size);
                    } else {
                        fullSpanItem.f21153a = i5 - i3;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @RestrictTo
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public int f21156a;

        /* renamed from: b, reason: collision with root package name */
        public int f21157b;

        /* renamed from: c, reason: collision with root package name */
        public int f21158c;
        public int[] d;

        /* renamed from: f, reason: collision with root package name */
        public int f21159f;

        /* renamed from: g, reason: collision with root package name */
        public int[] f21160g;

        /* renamed from: h, reason: collision with root package name */
        public List f21161h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f21162i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f21163j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f21164k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                ?? obj = new Object();
                obj.f21156a = parcel.readInt();
                obj.f21157b = parcel.readInt();
                int readInt = parcel.readInt();
                obj.f21158c = readInt;
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    obj.d = iArr;
                    parcel.readIntArray(iArr);
                }
                int readInt2 = parcel.readInt();
                obj.f21159f = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    obj.f21160g = iArr2;
                    parcel.readIntArray(iArr2);
                }
                obj.f21162i = parcel.readInt() == 1;
                obj.f21163j = parcel.readInt() == 1;
                obj.f21164k = parcel.readInt() == 1;
                obj.f21161h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
                return obj;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f21156a);
            parcel.writeInt(this.f21157b);
            parcel.writeInt(this.f21158c);
            if (this.f21158c > 0) {
                parcel.writeIntArray(this.d);
            }
            parcel.writeInt(this.f21159f);
            if (this.f21159f > 0) {
                parcel.writeIntArray(this.f21160g);
            }
            parcel.writeInt(this.f21162i ? 1 : 0);
            parcel.writeInt(this.f21163j ? 1 : 0);
            parcel.writeInt(this.f21164k ? 1 : 0);
            parcel.writeList(this.f21161h);
        }
    }

    /* loaded from: classes.dex */
    public class Span {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f21165a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f21166b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f21167c = Integer.MIN_VALUE;
        public int d = 0;
        public final int e;

        public Span(int i2) {
            this.e = i2;
        }

        public final void a() {
            View view = (View) this.f21165a.get(r0.size() - 1);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f21167c = StaggeredGridLayoutManager.this.f21127c.b(view);
            layoutParams.getClass();
        }

        public final void b() {
            this.f21165a.clear();
            this.f21166b = Integer.MIN_VALUE;
            this.f21167c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public final int c() {
            return StaggeredGridLayoutManager.this.f21130h ? e(r1.size() - 1, -1) : e(0, this.f21165a.size());
        }

        public final int d() {
            return StaggeredGridLayoutManager.this.f21130h ? e(0, this.f21165a.size()) : e(r1.size() - 1, -1);
        }

        public final int e(int i2, int i3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            int k2 = staggeredGridLayoutManager.f21127c.k();
            int g2 = staggeredGridLayoutManager.f21127c.g();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = (View) this.f21165a.get(i2);
                int e = staggeredGridLayoutManager.f21127c.e(view);
                int b2 = staggeredGridLayoutManager.f21127c.b(view);
                boolean z2 = e <= g2;
                boolean z3 = b2 >= k2;
                if (z2 && z3 && (e < k2 || b2 > g2)) {
                    return staggeredGridLayoutManager.getPosition(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public final int f(int i2) {
            int i3 = this.f21167c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f21165a.size() == 0) {
                return i2;
            }
            a();
            return this.f21167c;
        }

        public final View g(int i2, int i3) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
            ArrayList arrayList = this.f21165a;
            View view = null;
            if (i3 != -1) {
                int size = arrayList.size() - 1;
                while (size >= 0) {
                    View view2 = (View) arrayList.get(size);
                    if ((staggeredGridLayoutManager.f21130h && staggeredGridLayoutManager.getPosition(view2) >= i2) || ((!staggeredGridLayoutManager.f21130h && staggeredGridLayoutManager.getPosition(view2) <= i2) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = arrayList.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = (View) arrayList.get(i4);
                    if ((staggeredGridLayoutManager.f21130h && staggeredGridLayoutManager.getPosition(view3) <= i2) || ((!staggeredGridLayoutManager.f21130h && staggeredGridLayoutManager.getPosition(view3) >= i2) || !view3.hasFocusable())) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public final int h(int i2) {
            int i3 = this.f21166b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f21165a.size() == 0) {
                return i2;
            }
            View view = (View) this.f21165a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            this.f21166b = StaggeredGridLayoutManager.this.f21127c.e(view);
            layoutParams.getClass();
            return this.f21166b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.recyclerview.widget.LayoutState, java.lang.Object] */
    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f21125a = -1;
        this.f21130h = false;
        ?? obj = new Object();
        this.f21135m = obj;
        this.f21136n = 2;
        this.f21140r = new Rect();
        this.f21141s = new AnchorInfo();
        this.f21142t = true;
        this.f21144v = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.1
            @Override // java.lang.Runnable
            public final void run() {
                StaggeredGridLayoutManager.this.e();
            }
        };
        RecyclerView.LayoutManager.Properties properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i2, i3);
        int i4 = properties.f21075a;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        assertNotInLayoutOrScroll(null);
        if (i4 != this.e) {
            this.e = i4;
            OrientationHelper orientationHelper = this.f21127c;
            this.f21127c = this.d;
            this.d = orientationHelper;
            requestLayout();
        }
        int i5 = properties.f21076b;
        assertNotInLayoutOrScroll(null);
        if (i5 != this.f21125a) {
            obj.a();
            requestLayout();
            this.f21125a = i5;
            this.f21132j = new BitSet(this.f21125a);
            this.f21126b = new Span[this.f21125a];
            for (int i6 = 0; i6 < this.f21125a; i6++) {
                this.f21126b[i6] = new Span(i6);
            }
            requestLayout();
        }
        boolean z2 = properties.f21077c;
        assertNotInLayoutOrScroll(null);
        SavedState savedState = this.f21139q;
        if (savedState != null && savedState.f21162i != z2) {
            savedState.f21162i = z2;
        }
        this.f21130h = z2;
        requestLayout();
        ?? obj2 = new Object();
        obj2.f21022a = true;
        obj2.f21025f = 0;
        obj2.f21026g = 0;
        this.f21129g = obj2;
        this.f21127c = OrientationHelper.a(this, this.e);
        this.d = OrientationHelper.a(this, 1 - this.e);
    }

    public static int E(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    public final void A() {
        if (this.e == 1 || !isLayoutRTL()) {
            this.f21131i = this.f21130h;
        } else {
            this.f21131i = !this.f21130h;
        }
    }

    public final void B(int i2) {
        LayoutState layoutState = this.f21129g;
        layoutState.e = i2;
        layoutState.d = this.f21131i != (i2 == -1) ? -1 : 1;
    }

    public final void C(int i2, RecyclerView.State state) {
        int i3;
        int i4;
        int i5;
        LayoutState layoutState = this.f21129g;
        boolean z2 = false;
        layoutState.f21023b = 0;
        layoutState.f21024c = i2;
        if (!isSmoothScrolling() || (i5 = state.f21101a) == -1) {
            i3 = 0;
            i4 = 0;
        } else {
            if (this.f21131i == (i5 < i2)) {
                i3 = this.f21127c.l();
                i4 = 0;
            } else {
                i4 = this.f21127c.l();
                i3 = 0;
            }
        }
        if (getClipToPadding()) {
            layoutState.f21025f = this.f21127c.k() - i4;
            layoutState.f21026g = this.f21127c.g() + i3;
        } else {
            layoutState.f21026g = this.f21127c.f() + i3;
            layoutState.f21025f = -i4;
        }
        layoutState.f21027h = false;
        layoutState.f21022a = true;
        if (this.f21127c.i() == 0 && this.f21127c.f() == 0) {
            z2 = true;
        }
        layoutState.f21028i = z2;
    }

    public final void D(Span span, int i2, int i3) {
        int i4 = span.d;
        int i5 = span.e;
        if (i2 != -1) {
            int i6 = span.f21167c;
            if (i6 == Integer.MIN_VALUE) {
                span.a();
                i6 = span.f21167c;
            }
            if (i6 - i4 >= i3) {
                this.f21132j.set(i5, false);
                return;
            }
            return;
        }
        int i7 = span.f21166b;
        if (i7 == Integer.MIN_VALUE) {
            View view = (View) span.f21165a.get(0);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            span.f21166b = StaggeredGridLayoutManager.this.f21127c.e(view);
            layoutParams.getClass();
            i7 = span.f21166b;
        }
        if (i7 + i4 <= i3) {
            this.f21132j.set(i5, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f21139q == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.e == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return this.e == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void collectAdjacentPrefetchPositions(int i2, int i3, RecyclerView.State state, RecyclerView.LayoutManager.LayoutPrefetchRegistry layoutPrefetchRegistry) {
        LayoutState layoutState;
        int f2;
        int i4;
        if (this.e != 0) {
            i2 = i3;
        }
        if (getChildCount() == 0 || i2 == 0) {
            return;
        }
        w(i2, state);
        int[] iArr = this.f21143u;
        if (iArr == null || iArr.length < this.f21125a) {
            this.f21143u = new int[this.f21125a];
        }
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = this.f21125a;
            layoutState = this.f21129g;
            if (i5 >= i7) {
                break;
            }
            if (layoutState.d == -1) {
                f2 = layoutState.f21025f;
                i4 = this.f21126b[i5].h(f2);
            } else {
                f2 = this.f21126b[i5].f(layoutState.f21026g);
                i4 = layoutState.f21026g;
            }
            int i8 = f2 - i4;
            if (i8 >= 0) {
                this.f21143u[i6] = i8;
                i6++;
            }
            i5++;
        }
        Arrays.sort(this.f21143u, 0, i6);
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = layoutState.f21024c;
            if (i10 < 0 || i10 >= state.b()) {
                return;
            }
            layoutPrefetchRegistry.a(layoutState.f21024c, this.f21143u[i9]);
            layoutState.f21024c += layoutState.d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollExtent(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(RecyclerView.State state) {
        return g(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(RecyclerView.State state) {
        return h(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    public final PointF computeScrollVectorForPosition(int i2) {
        int d = d(i2);
        PointF pointF = new PointF();
        if (d == 0) {
            return null;
        }
        if (this.e == 0) {
            pointF.x = d;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = d;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(RecyclerView.State state) {
        return f(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(RecyclerView.State state) {
        return g(state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(RecyclerView.State state) {
        return h(state);
    }

    public final int d(int i2) {
        if (getChildCount() == 0) {
            return this.f21131i ? 1 : -1;
        }
        return (i2 < n()) != this.f21131i ? -1 : 1;
    }

    public final boolean e() {
        int n2;
        if (getChildCount() != 0 && this.f21136n != 0 && isAttachedToWindow()) {
            if (this.f21131i) {
                n2 = o();
                n();
            } else {
                n2 = n();
                o();
            }
            LazySpanLookup lazySpanLookup = this.f21135m;
            if (n2 == 0 && s() != null) {
                lazySpanLookup.a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    public final int f(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f21127c;
        boolean z2 = this.f21142t;
        return ScrollbarHelper.a(state, orientationHelper, k(!z2), j(!z2), this, this.f21142t);
    }

    public final int g(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f21127c;
        boolean z2 = this.f21142t;
        return ScrollbarHelper.b(state, orientationHelper, k(!z2), j(!z2), this, this.f21142t, this.f21131i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.e == 0 ? new RecyclerView.LayoutParams(-2, -1) : new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    public final int h(RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f21127c;
        boolean z2 = this.f21142t;
        return ScrollbarHelper.c(state, orientationHelper, k(!z2), j(!z2), this, this.f21142t);
    }

    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v56 */
    public final int i(RecyclerView.Recycler recycler, LayoutState layoutState, RecyclerView.State state) {
        Span span;
        ?? r1;
        int i2;
        int c2;
        int k2;
        int c3;
        View view;
        int i3;
        int i4;
        int i5;
        RecyclerView.Recycler recycler2 = recycler;
        int i6 = 0;
        int i7 = 1;
        this.f21132j.set(0, this.f21125a, true);
        LayoutState layoutState2 = this.f21129g;
        int i8 = layoutState2.f21028i ? layoutState.e == 1 ? Api.BaseClientBuilder.API_PRIORITY_OTHER : Integer.MIN_VALUE : layoutState.e == 1 ? layoutState.f21026g + layoutState.f21023b : layoutState.f21025f - layoutState.f21023b;
        int i9 = layoutState.e;
        for (int i10 = 0; i10 < this.f21125a; i10++) {
            if (!this.f21126b[i10].f21165a.isEmpty()) {
                D(this.f21126b[i10], i9, i8);
            }
        }
        int g2 = this.f21131i ? this.f21127c.g() : this.f21127c.k();
        boolean z2 = false;
        while (true) {
            int i11 = layoutState.f21024c;
            int i12 = -1;
            if (((i11 < 0 || i11 >= state.b()) ? i6 : i7) == 0 || (!layoutState2.f21028i && this.f21132j.isEmpty())) {
                break;
            }
            View view2 = recycler2.l(Long.MAX_VALUE, layoutState.f21024c).itemView;
            layoutState.f21024c += layoutState.d;
            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
            int layoutPosition = layoutParams.f21078a.getLayoutPosition();
            LazySpanLookup lazySpanLookup = this.f21135m;
            int[] iArr = lazySpanLookup.f21151a;
            int i13 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i13 == -1) {
                if (v(layoutState.e)) {
                    i4 = this.f21125a - i7;
                    i5 = -1;
                } else {
                    i12 = this.f21125a;
                    i4 = i6;
                    i5 = i7;
                }
                Span span2 = null;
                if (layoutState.e == i7) {
                    int k3 = this.f21127c.k();
                    int i14 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                    while (i4 != i12) {
                        Span span3 = this.f21126b[i4];
                        int f2 = span3.f(k3);
                        if (f2 < i14) {
                            i14 = f2;
                            span2 = span3;
                        }
                        i4 += i5;
                    }
                } else {
                    int g3 = this.f21127c.g();
                    int i15 = Integer.MIN_VALUE;
                    while (i4 != i12) {
                        Span span4 = this.f21126b[i4];
                        int h2 = span4.h(g3);
                        if (h2 > i15) {
                            span2 = span4;
                            i15 = h2;
                        }
                        i4 += i5;
                    }
                }
                span = span2;
                lazySpanLookup.b(layoutPosition);
                lazySpanLookup.f21151a[layoutPosition] = span.e;
            } else {
                span = this.f21126b[i13];
            }
            Span span5 = span;
            layoutParams.e = span5;
            if (layoutState.e == 1) {
                addView(view2);
                r1 = 0;
            } else {
                r1 = 0;
                addView(view2, 0);
            }
            if (this.e == 1) {
                t(view2, RecyclerView.LayoutManager.getChildMeasureSpec(this.f21128f, getWidthMode(), r1, ((ViewGroup.MarginLayoutParams) layoutParams).width, r1), RecyclerView.LayoutManager.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true));
            } else {
                t(view2, RecyclerView.LayoutManager.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.LayoutManager.getChildMeasureSpec(this.f21128f, getHeightMode(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false));
            }
            if (layoutState.e == 1) {
                int f3 = span5.f(g2);
                c2 = f3;
                i2 = this.f21127c.c(view2) + f3;
            } else {
                int h3 = span5.h(g2);
                i2 = h3;
                c2 = h3 - this.f21127c.c(view2);
            }
            if (layoutState.e == 1) {
                Span span6 = layoutParams.e;
                span6.getClass();
                LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                layoutParams2.e = span6;
                ArrayList arrayList = span6.f21165a;
                arrayList.add(view2);
                span6.f21167c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    span6.f21166b = Integer.MIN_VALUE;
                }
                if (layoutParams2.f21078a.isRemoved() || layoutParams2.f21078a.isUpdated()) {
                    span6.d = StaggeredGridLayoutManager.this.f21127c.c(view2) + span6.d;
                }
            } else {
                Span span7 = layoutParams.e;
                span7.getClass();
                LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                layoutParams3.e = span7;
                ArrayList arrayList2 = span7.f21165a;
                arrayList2.add(0, view2);
                span7.f21166b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    span7.f21167c = Integer.MIN_VALUE;
                }
                if (layoutParams3.f21078a.isRemoved() || layoutParams3.f21078a.isUpdated()) {
                    span7.d = StaggeredGridLayoutManager.this.f21127c.c(view2) + span7.d;
                }
            }
            if (isLayoutRTL() && this.e == 1) {
                c3 = this.d.g() - (((this.f21125a - 1) - span5.e) * this.f21128f);
                k2 = c3 - this.d.c(view2);
            } else {
                k2 = this.d.k() + (span5.e * this.f21128f);
                c3 = this.d.c(view2) + k2;
            }
            int i16 = c3;
            int i17 = k2;
            if (this.e == 1) {
                view = view2;
                layoutDecoratedWithMargins(view2, i17, c2, i16, i2);
            } else {
                view = view2;
                layoutDecoratedWithMargins(view, c2, i17, i2, i16);
            }
            D(span5, layoutState2.e, i8);
            x(recycler, layoutState2);
            if (layoutState2.f21027h && view.hasFocusable()) {
                i3 = 0;
                this.f21132j.set(span5.e, false);
            } else {
                i3 = 0;
            }
            recycler2 = recycler;
            i6 = i3;
            z2 = true;
            i7 = 1;
        }
        RecyclerView.Recycler recycler3 = recycler2;
        int i18 = i6;
        if (!z2) {
            x(recycler3, layoutState2);
        }
        int k4 = layoutState2.e == -1 ? this.f21127c.k() - q(this.f21127c.k()) : p(this.f21127c.g()) - this.f21127c.g();
        return k4 > 0 ? Math.min(layoutState.f21023b, k4) : i18;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return this.f21136n != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    public final View j(boolean z2) {
        int k2 = this.f21127c.k();
        int g2 = this.f21127c.g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e = this.f21127c.e(childAt);
            int b2 = this.f21127c.b(childAt);
            if (b2 > k2 && e < g2) {
                if (b2 <= g2 || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final View k(boolean z2) {
        int k2 = this.f21127c.k();
        int g2 = this.f21127c.g();
        int childCount = getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int e = this.f21127c.e(childAt);
            if (this.f21127c.b(childAt) > k2 && e < g2) {
                if (e >= k2 || !z2) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void l(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int g2;
        int p2 = p(Integer.MIN_VALUE);
        if (p2 != Integer.MIN_VALUE && (g2 = this.f21127c.g() - p2) > 0) {
            int i2 = g2 - (-scrollBy(-g2, recycler, state));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.f21127c.p(i2);
        }
    }

    public final void m(RecyclerView.Recycler recycler, RecyclerView.State state, boolean z2) {
        int k2;
        int q2 = q(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (q2 != Integer.MAX_VALUE && (k2 = q2 - this.f21127c.k()) > 0) {
            int scrollBy = k2 - scrollBy(k2, recycler, state);
            if (!z2 || scrollBy <= 0) {
                return;
            }
            this.f21127c.p(-scrollBy);
        }
    }

    public final int n() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final int o() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i2) {
        super.offsetChildrenHorizontal(i2);
        for (int i3 = 0; i3 < this.f21125a; i3++) {
            Span span = this.f21126b[i3];
            int i4 = span.f21166b;
            if (i4 != Integer.MIN_VALUE) {
                span.f21166b = i4 + i2;
            }
            int i5 = span.f21167c;
            if (i5 != Integer.MIN_VALUE) {
                span.f21167c = i5 + i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i2) {
        super.offsetChildrenVertical(i2);
        for (int i3 = 0; i3 < this.f21125a; i3++) {
            Span span = this.f21126b[i3];
            int i4 = span.f21166b;
            if (i4 != Integer.MIN_VALUE) {
                span.f21166b = i4 + i2;
            }
            int i5 = span.f21167c;
            if (i5 != Integer.MIN_VALUE) {
                span.f21167c = i5 + i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f21135m.a();
        for (int i2 = 0; i2 < this.f21125a; i2++) {
            this.f21126b[i2].b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.Recycler recycler) {
        onDetachedFromWindow(recyclerView);
        removeCallbacks(this.f21144v);
        for (int i2 = 0; i2 < this.f21125a; i2++) {
            this.f21126b[i2].b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0039, code lost:
    
        if (r8.e == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x003e, code lost:
    
        if (r8.e == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x004b, code lost:
    
        if (isLayoutRTL() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0058, code lost:
    
        if (isLayoutRTL() == false) goto L38;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.Recycler r11, androidx.recyclerview.widget.RecyclerView.State r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View k2 = k(false);
            View j2 = j(false);
            if (k2 == null || j2 == null) {
                return;
            }
            int position = getPosition(k2);
            int position2 = getPosition(j2);
            if (position < position2) {
                accessibilityEvent.setFromIndex(position);
                accessibilityEvent.setToIndex(position2);
            } else {
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        r(i2, i3, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f21135m.a();
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i2, int i3, int i4) {
        r(i2, i3, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        r(i2, i3, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i2, int i3, Object obj) {
        r(i2, i3, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        u(recycler, state, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutCompleted(RecyclerView.State state) {
        this.f21133k = -1;
        this.f21134l = Integer.MIN_VALUE;
        this.f21139q = null;
        this.f21141s.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f21139q = savedState;
            if (this.f21133k != -1) {
                savedState.d = null;
                savedState.f21158c = 0;
                savedState.f21156a = -1;
                savedState.f21157b = -1;
                savedState.d = null;
                savedState.f21158c = 0;
                savedState.f21159f = 0;
                savedState.f21160g = null;
                savedState.f21161h = null;
            }
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, android.os.Parcelable, java.lang.Object] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final Parcelable onSaveInstanceState() {
        int h2;
        int k2;
        int[] iArr;
        SavedState savedState = this.f21139q;
        if (savedState != null) {
            ?? obj = new Object();
            obj.f21158c = savedState.f21158c;
            obj.f21156a = savedState.f21156a;
            obj.f21157b = savedState.f21157b;
            obj.d = savedState.d;
            obj.f21159f = savedState.f21159f;
            obj.f21160g = savedState.f21160g;
            obj.f21162i = savedState.f21162i;
            obj.f21163j = savedState.f21163j;
            obj.f21164k = savedState.f21164k;
            obj.f21161h = savedState.f21161h;
            return obj;
        }
        ?? obj2 = new Object();
        obj2.f21162i = this.f21130h;
        obj2.f21163j = this.f21137o;
        obj2.f21164k = this.f21138p;
        LazySpanLookup lazySpanLookup = this.f21135m;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f21151a) == null) {
            obj2.f21159f = 0;
        } else {
            obj2.f21160g = iArr;
            obj2.f21159f = iArr.length;
            obj2.f21161h = lazySpanLookup.f21152b;
        }
        if (getChildCount() > 0) {
            obj2.f21156a = this.f21137o ? o() : n();
            View j2 = this.f21131i ? j(true) : k(true);
            obj2.f21157b = j2 != null ? getPosition(j2) : -1;
            int i2 = this.f21125a;
            obj2.f21158c = i2;
            obj2.d = new int[i2];
            for (int i3 = 0; i3 < this.f21125a; i3++) {
                if (this.f21137o) {
                    h2 = this.f21126b[i3].f(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        k2 = this.f21127c.g();
                        h2 -= k2;
                        obj2.d[i3] = h2;
                    } else {
                        obj2.d[i3] = h2;
                    }
                } else {
                    h2 = this.f21126b[i3].h(Integer.MIN_VALUE);
                    if (h2 != Integer.MIN_VALUE) {
                        k2 = this.f21127c.k();
                        h2 -= k2;
                        obj2.d[i3] = h2;
                    } else {
                        obj2.d[i3] = h2;
                    }
                }
            }
        } else {
            obj2.f21156a = -1;
            obj2.f21157b = -1;
            obj2.f21158c = 0;
        }
        return obj2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i2) {
        if (i2 == 0) {
            e();
        }
    }

    public final int p(int i2) {
        int f2 = this.f21126b[0].f(i2);
        for (int i3 = 1; i3 < this.f21125a; i3++) {
            int f3 = this.f21126b[i3].f(i2);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    public final int q(int i2) {
        int h2 = this.f21126b[0].h(i2);
        for (int i3 = 1; i3 < this.f21125a; i3++) {
            int h3 = this.f21126b[i3].h(i2);
            if (h3 < h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f21131i
            if (r0 == 0) goto L9
            int r0 = r7.o()
            goto Ld
        L9:
            int r0 = r7.n()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r7.f21135m
            r4.c(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.e(r8, r5)
            r4.d(r9, r5)
            goto L3a
        L33:
            r4.e(r8, r9)
            goto L3a
        L37:
            r4.d(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f21131i
            if (r8 == 0) goto L46
            int r8 = r7.n()
            goto L4a
        L46:
            int r8 = r7.o()
        L4a:
            if (r3 > r8) goto L4f
            r7.requestLayout()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View s() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s():android.view.View");
    }

    public final int scrollBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (getChildCount() == 0 || i2 == 0) {
            return 0;
        }
        w(i2, state);
        LayoutState layoutState = this.f21129g;
        int i3 = i(recycler, layoutState, state);
        if (layoutState.f21023b >= i3) {
            i2 = i2 < 0 ? -i3 : i3;
        }
        this.f21127c.p(-i2);
        this.f21137o = this.f21131i;
        layoutState.f21023b = 0;
        x(recycler, layoutState);
        return i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i2) {
        SavedState savedState = this.f21139q;
        if (savedState != null && savedState.f21156a != i2) {
            savedState.d = null;
            savedState.f21158c = 0;
            savedState.f21156a = -1;
            savedState.f21157b = -1;
        }
        this.f21133k = i2;
        this.f21134l = Integer.MIN_VALUE;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        return scrollBy(i2, recycler, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void setMeasuredDimension(Rect rect, int i2, int i3) {
        int chooseSize;
        int chooseSize2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.e == 1) {
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i3, rect.height() + paddingBottom, getMinimumHeight());
            chooseSize = RecyclerView.LayoutManager.chooseSize(i2, (this.f21128f * this.f21125a) + paddingRight, getMinimumWidth());
        } else {
            chooseSize = RecyclerView.LayoutManager.chooseSize(i2, rect.width() + paddingRight, getMinimumWidth());
            chooseSize2 = RecyclerView.LayoutManager.chooseSize(i3, (this.f21128f * this.f21125a) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(chooseSize, chooseSize2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.setTargetPosition(i2);
        startSmoothScroll(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return this.f21139q == null;
    }

    public final void t(View view, int i2, int i3) {
        Rect rect = this.f21140r;
        calculateItemDecorationsForChild(view, rect);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int E = E(i2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int E2 = E(i3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect.bottom);
        if (shouldMeasureChild(view, E, E2, layoutParams)) {
            view.measure(E, E2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:251:0x03fe, code lost:
    
        if (e() != false) goto L244;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(androidx.recyclerview.widget.RecyclerView.Recycler r17, androidx.recyclerview.widget.RecyclerView.State r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, boolean):void");
    }

    public final boolean v(int i2) {
        if (this.e == 0) {
            return (i2 == -1) != this.f21131i;
        }
        return ((i2 == -1) == this.f21131i) == isLayoutRTL();
    }

    public final void w(int i2, RecyclerView.State state) {
        int n2;
        int i3;
        if (i2 > 0) {
            n2 = o();
            i3 = 1;
        } else {
            n2 = n();
            i3 = -1;
        }
        LayoutState layoutState = this.f21129g;
        layoutState.f21022a = true;
        C(n2, state);
        B(i3);
        layoutState.f21024c = n2 + layoutState.d;
        layoutState.f21023b = Math.abs(i2);
    }

    public final void x(RecyclerView.Recycler recycler, LayoutState layoutState) {
        if (!layoutState.f21022a || layoutState.f21028i) {
            return;
        }
        if (layoutState.f21023b == 0) {
            if (layoutState.e == -1) {
                y(recycler, layoutState.f21026g);
                return;
            } else {
                z(recycler, layoutState.f21025f);
                return;
            }
        }
        int i2 = 1;
        if (layoutState.e == -1) {
            int i3 = layoutState.f21025f;
            int h2 = this.f21126b[0].h(i3);
            while (i2 < this.f21125a) {
                int h3 = this.f21126b[i2].h(i3);
                if (h3 > h2) {
                    h2 = h3;
                }
                i2++;
            }
            int i4 = i3 - h2;
            y(recycler, i4 < 0 ? layoutState.f21026g : layoutState.f21026g - Math.min(i4, layoutState.f21023b));
            return;
        }
        int i5 = layoutState.f21026g;
        int f2 = this.f21126b[0].f(i5);
        while (i2 < this.f21125a) {
            int f3 = this.f21126b[i2].f(i5);
            if (f3 < f2) {
                f2 = f3;
            }
            i2++;
        }
        int i6 = f2 - layoutState.f21026g;
        z(recycler, i6 < 0 ? layoutState.f21025f : Math.min(i6, layoutState.f21023b) + layoutState.f21025f);
    }

    public final void y(RecyclerView.Recycler recycler, int i2) {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (this.f21127c.e(childAt) < i2 || this.f21127c.o(childAt) < i2) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.e.f21165a.size() == 1) {
                return;
            }
            Span span = layoutParams.e;
            ArrayList arrayList = span.f21165a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.e = null;
            if (layoutParams2.f21078a.isRemoved() || layoutParams2.f21078a.isUpdated()) {
                span.d -= StaggeredGridLayoutManager.this.f21127c.c(view);
            }
            if (size == 1) {
                span.f21166b = Integer.MIN_VALUE;
            }
            span.f21167c = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, recycler);
        }
    }

    public final void z(RecyclerView.Recycler recycler, int i2) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f21127c.b(childAt) > i2 || this.f21127c.n(childAt) > i2) {
                return;
            }
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            layoutParams.getClass();
            if (layoutParams.e.f21165a.size() == 1) {
                return;
            }
            Span span = layoutParams.e;
            ArrayList arrayList = span.f21165a;
            View view = (View) arrayList.remove(0);
            LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
            layoutParams2.e = null;
            if (arrayList.size() == 0) {
                span.f21167c = Integer.MIN_VALUE;
            }
            if (layoutParams2.f21078a.isRemoved() || layoutParams2.f21078a.isUpdated()) {
                span.d -= StaggeredGridLayoutManager.this.f21127c.c(view);
            }
            span.f21166b = Integer.MIN_VALUE;
            removeAndRecycleView(childAt, recycler);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new RecyclerView.LayoutParams(layoutParams);
    }
}
