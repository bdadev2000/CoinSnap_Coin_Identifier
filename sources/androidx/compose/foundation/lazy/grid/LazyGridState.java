package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import e0.q;
import h0.g;
import i0.a;

@Stable
/* loaded from: classes.dex */
public final class LazyGridState implements ScrollableState {

    /* renamed from: t, reason: collision with root package name */
    public static final SaverKt$Saver$1 f4603t = ListSaverKt.a(LazyGridState$Companion$Saver$2.f4622a, LazyGridState$Companion$Saver$1.f4621a);

    /* renamed from: a, reason: collision with root package name */
    public final LazyGridPrefetchStrategy f4604a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyGridScrollPosition f4605b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4606c;
    public final MutableInteractionSource d;
    public float e;

    /* renamed from: f, reason: collision with root package name */
    public final ScrollableState f4607f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4608g;

    /* renamed from: h, reason: collision with root package name */
    public Remeasurement f4609h;

    /* renamed from: i, reason: collision with root package name */
    public final LazyGridState$remeasurementModifier$1 f4610i;

    /* renamed from: j, reason: collision with root package name */
    public final AwaitFirstLayoutModifier f4611j;

    /* renamed from: k, reason: collision with root package name */
    public final LazyLayoutItemAnimator f4612k;

    /* renamed from: l, reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4613l;

    /* renamed from: m, reason: collision with root package name */
    public final LazyLayoutPrefetchState f4614m;

    /* renamed from: n, reason: collision with root package name */
    public final LazyGridState$prefetchScope$1 f4615n;

    /* renamed from: o, reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4616o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableState f4617p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableState f4618q;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4619r;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4620s;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public LazyGridState(int i2, int i3) {
        this(i2, i3, new DefaultLazyGridPrefetchStrategy(2));
    }

    public static Object j(LazyGridState lazyGridState, int i2, g gVar) {
        lazyGridState.getClass();
        Object b2 = lazyGridState.b(MutatePriority.f2811a, new LazyGridState$scrollToItem$2(lazyGridState, i2, 0, null), gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f4607f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.compose.foundation.gestures.ScrollableState
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(androidx.compose.foundation.MutatePriority r6, q0.p r7, h0.g r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1) r0
            int r1 = r0.f4633g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4633g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.grid.LazyGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f4633g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.jvm.internal.q.m(r8)
            goto L63
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            q0.p r7 = r0.f4631c
            androidx.compose.foundation.MutatePriority r6 = r0.f4630b
            androidx.compose.foundation.lazy.grid.LazyGridState r2 = r0.f4629a
            kotlin.jvm.internal.q.m(r8)
            goto L51
        L3c:
            kotlin.jvm.internal.q.m(r8)
            r0.f4629a = r5
            r0.f4630b = r6
            r0.f4631c = r7
            r0.f4633g = r4
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f4611j
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f4607f
            r2 = 0
            r0.f4629a = r2
            r0.f4630b = r2
            r0.f4631c = r2
            r0.f4633g = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridState.b(androidx.compose.foundation.MutatePriority, q0.p, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean c() {
        return ((Boolean) this.f4620s.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.f4619r.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f4607f.e(f2);
    }

    public final void f(LazyGridMeasureResult lazyGridMeasureResult, boolean z2) {
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr;
        LazyGridMeasuredItem lazyGridMeasuredItem;
        LazyGridMeasuredItem[] lazyGridMeasuredItemArr2;
        LazyGridMeasuredItem lazyGridMeasuredItem2;
        this.e -= lazyGridMeasureResult.d;
        this.f4606c.setValue(lazyGridMeasureResult);
        int i2 = 0;
        LazyGridMeasuredLine lazyGridMeasuredLine = lazyGridMeasureResult.f4536a;
        this.f4620s.setValue(Boolean.valueOf(((lazyGridMeasuredLine == null || lazyGridMeasuredLine.f4574a == 0) && lazyGridMeasureResult.f4537b == 0) ? false : true));
        this.f4619r.setValue(Boolean.valueOf(lazyGridMeasureResult.f4538c));
        LazyGridScrollPosition lazyGridScrollPosition = this.f4605b;
        if (z2) {
            int i3 = lazyGridMeasureResult.f4537b;
            if (i3 >= 0.0f) {
                lazyGridScrollPosition.f4586b.b(i3);
                return;
            }
            lazyGridScrollPosition.getClass();
            throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
        }
        lazyGridScrollPosition.getClass();
        lazyGridScrollPosition.d = (lazyGridMeasuredLine == null || (lazyGridMeasuredItemArr2 = lazyGridMeasuredLine.f4575b) == null || (lazyGridMeasuredItem2 = (LazyGridMeasuredItem) q.b0(lazyGridMeasuredItemArr2)) == null) ? null : lazyGridMeasuredItem2.f4551b;
        if (lazyGridScrollPosition.f4587c || lazyGridMeasureResult.f4545l > 0) {
            lazyGridScrollPosition.f4587c = true;
            int i4 = lazyGridMeasureResult.f4537b;
            if (i4 < 0.0f) {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i4 + ')').toString());
            }
            if (lazyGridMeasuredLine != null && (lazyGridMeasuredItemArr = lazyGridMeasuredLine.f4575b) != null && (lazyGridMeasuredItem = (LazyGridMeasuredItem) q.b0(lazyGridMeasuredItemArr)) != null) {
                i2 = lazyGridMeasuredItem.f4550a;
            }
            lazyGridScrollPosition.a(i2, i4);
        }
        if (this.f4608g) {
            this.f4604a.b(lazyGridMeasureResult);
        }
    }

    public final int g() {
        return this.f4605b.f4585a.g();
    }

    public final int h() {
        return this.f4605b.f4586b.g();
    }

    public final LazyGridLayoutInfo i() {
        return (LazyGridLayoutInfo) this.f4606c.getValue();
    }

    public final void k(int i2, int i3) {
        LazyGridScrollPosition lazyGridScrollPosition = this.f4605b;
        if (lazyGridScrollPosition.f4585a.g() != i2 || lazyGridScrollPosition.f4586b.g() != i3) {
            this.f4612k.f();
        }
        lazyGridScrollPosition.a(i2, i3);
        lazyGridScrollPosition.d = null;
        Remeasurement remeasurement = this.f4609h;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyGridState(int i2, int i3, LazyGridPrefetchStrategy lazyGridPrefetchStrategy) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f4604a = lazyGridPrefetchStrategy;
        this.f4605b = new LazyGridScrollPosition(i2, i3);
        this.f4606c = SnapshotStateKt.f(LazyGridStateKt.f4638a, SnapshotStateKt.h());
        this.d = InteractionSourceKt.a();
        this.f4607f = ScrollableStateKt.a(new LazyGridState$scrollableState$1(this));
        this.f4608g = true;
        this.f4610i = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.grid.LazyGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void o0(LayoutNode layoutNode) {
                LazyGridState.this.f4609h = layoutNode;
            }
        };
        this.f4611j = new Object();
        this.f4612k = new LazyLayoutItemAnimator();
        this.f4613l = new LazyLayoutBeyondBoundsInfo();
        lazyGridPrefetchStrategy.getClass();
        this.f4614m = new LazyLayoutPrefetchState(null, new LazyGridState$prefetchState$1(this, i2));
        this.f4615n = new LazyGridState$prefetchScope$1(this);
        this.f4616o = new LazyLayoutPinnedItemList();
        this.f4617p = ObservableScopeInvalidator.a();
        this.f4618q = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4619r = f2;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4620s = f3;
    }
}
