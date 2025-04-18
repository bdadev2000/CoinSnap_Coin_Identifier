package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
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
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import kotlin.jvm.internal.e;
import q0.l;

@Stable
/* loaded from: classes2.dex */
public final class LazyListState implements ScrollableState {
    public static final SaverKt$Saver$1 x = ListSaverKt.a(LazyListState$Companion$Saver$2.f4412a, LazyListState$Companion$Saver$1.f4411a);

    /* renamed from: a, reason: collision with root package name */
    public final LazyListPrefetchStrategy f4391a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4392b;

    /* renamed from: c, reason: collision with root package name */
    public LazyListMeasureResult f4393c;
    public final LazyListScrollPosition d;
    public final LazyListAnimateScrollScope e;

    /* renamed from: f, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4394f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableInteractionSource f4395g;

    /* renamed from: h, reason: collision with root package name */
    public float f4396h;

    /* renamed from: i, reason: collision with root package name */
    public final ScrollableState f4397i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f4398j;

    /* renamed from: k, reason: collision with root package name */
    public Remeasurement f4399k;

    /* renamed from: l, reason: collision with root package name */
    public final LazyListState$remeasurementModifier$1 f4400l;

    /* renamed from: m, reason: collision with root package name */
    public final AwaitFirstLayoutModifier f4401m;

    /* renamed from: n, reason: collision with root package name */
    public final LazyLayoutItemAnimator f4402n;

    /* renamed from: o, reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f4403o;

    /* renamed from: p, reason: collision with root package name */
    public final LazyLayoutPrefetchState f4404p;

    /* renamed from: q, reason: collision with root package name */
    public final LazyListState$prefetchScope$1 f4405q;

    /* renamed from: r, reason: collision with root package name */
    public final LazyLayoutPinnedItemList f4406r;

    /* renamed from: s, reason: collision with root package name */
    public final MutableState f4407s;

    /* renamed from: t, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4408t;

    /* renamed from: u, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f4409u;

    /* renamed from: v, reason: collision with root package name */
    public final MutableState f4410v;
    public AnimationState w;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    public LazyListState(int i2, int i3) {
        this(i2, i3, new DefaultLazyListPrefetchStrategy(2));
    }

    public static Object j(LazyListState lazyListState, int i2, g gVar) {
        lazyListState.getClass();
        Object b2 = lazyListState.b(MutatePriority.f2811a, new LazyListState$scrollToItem$2(lazyListState, i2, 0, null), gVar);
        return b2 == a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f4397i.a();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.LazyListState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = (androidx.compose.foundation.lazy.LazyListState$scroll$1) r0
            int r1 = r0.f4423g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4423g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.LazyListState$scroll$1 r0 = new androidx.compose.foundation.lazy.LazyListState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f4423g
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
            q0.p r7 = r0.f4421c
            androidx.compose.foundation.MutatePriority r6 = r0.f4420b
            androidx.compose.foundation.lazy.LazyListState r2 = r0.f4419a
            kotlin.jvm.internal.q.m(r8)
            goto L51
        L3c:
            kotlin.jvm.internal.q.m(r8)
            r0.f4419a = r5
            r0.f4420b = r6
            r0.f4421c = r7
            r0.f4423g = r4
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f4401m
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f4397i
            r2 = 0
            r0.f4419a = r2
            r0.f4420b = r2
            r0.f4421c = r2
            r0.f4423g = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.b(androidx.compose.foundation.MutatePriority, q0.p, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean c() {
        return ((Boolean) this.f4409u.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.f4408t.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f4397i.e(f2);
    }

    public final void f(LazyListMeasureResult lazyListMeasureResult, boolean z2, boolean z3) {
        if (!z2 && this.f4392b) {
            this.f4393c = lazyListMeasureResult;
            return;
        }
        if (z2) {
            this.f4392b = true;
        }
        LazyListMeasuredItem lazyListMeasuredItem = lazyListMeasureResult.f4348a;
        this.f4409u.setValue(Boolean.valueOf(((lazyListMeasuredItem == null || lazyListMeasuredItem.f4363a == 0) && lazyListMeasureResult.f4349b == 0) ? false : true));
        this.f4408t.setValue(Boolean.valueOf(lazyListMeasureResult.f4350c));
        this.f4396h -= lazyListMeasureResult.d;
        this.f4394f.setValue(lazyListMeasureResult);
        LazyListScrollPosition lazyListScrollPosition = this.d;
        if (z3) {
            int i2 = lazyListMeasureResult.f4349b;
            if (i2 < 0.0f) {
                lazyListScrollPosition.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i2 + ')').toString());
            }
            lazyListScrollPosition.f4389b.b(i2);
        } else {
            lazyListScrollPosition.getClass();
            lazyListScrollPosition.d = lazyListMeasuredItem != null ? lazyListMeasuredItem.f4372l : null;
            if (lazyListScrollPosition.f4390c || lazyListMeasureResult.f4358m > 0) {
                lazyListScrollPosition.f4390c = true;
                int i3 = lazyListMeasureResult.f4349b;
                if (i3 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
                }
                lazyListScrollPosition.a(lazyListMeasuredItem != null ? lazyListMeasuredItem.f4363a : 0, i3);
            }
            if (this.f4398j) {
                this.f4391a.c(lazyListMeasureResult);
            }
        }
        if (z2) {
            float y1 = lazyListMeasureResult.f4353h.y1(LazyListStateKt.f4432a);
            float f2 = lazyListMeasureResult.e;
            if (f2 <= y1) {
                return;
            }
            Snapshot a2 = Snapshot.Companion.a();
            l f3 = a2 != null ? a2.f() : null;
            Snapshot c2 = Snapshot.Companion.c(a2);
            try {
                float floatValue = ((Number) this.w.f2035b.getValue()).floatValue();
                AnimationState animationState = this.w;
                boolean z4 = animationState.f2038g;
                d0 d0Var = lazyListMeasureResult.f4352g;
                if (z4) {
                    this.w = AnimationStateKt.b(animationState, floatValue - f2, 0.0f, 30);
                    e.v(d0Var, null, 0, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, null), 3);
                } else {
                    this.w = new AnimationState(VectorConvertersKt.f2340a, Float.valueOf(-f2), null, 60);
                    e.v(d0Var, null, 0, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, null), 3);
                }
                Snapshot.Companion.f(a2, c2, f3);
            } catch (Throwable th) {
                Snapshot.Companion.f(a2, c2, f3);
                throw th;
            }
        }
    }

    public final int g() {
        return this.d.f4388a.g();
    }

    public final int h() {
        return this.d.f4389b.g();
    }

    public final LazyListLayoutInfo i() {
        return (LazyListLayoutInfo) this.f4394f.getValue();
    }

    public final void k(int i2, int i3) {
        LazyListScrollPosition lazyListScrollPosition = this.d;
        if (lazyListScrollPosition.f4388a.g() != i2 || lazyListScrollPosition.f4389b.g() != i3) {
            this.f4402n.f();
        }
        lazyListScrollPosition.a(i2, i3);
        lazyListScrollPosition.d = null;
        Remeasurement remeasurement = this.f4399k;
        if (remeasurement != null) {
            remeasurement.d();
        }
    }

    /* JADX WARN: Type inference failed for: r11v8, types: [androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    public LazyListState(int i2, int i3, LazyListPrefetchStrategy lazyListPrefetchStrategy) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f4391a = lazyListPrefetchStrategy;
        this.d = new LazyListScrollPosition(i2, i3);
        this.e = new LazyListAnimateScrollScope(this);
        this.f4394f = SnapshotStateKt.f(LazyListStateKt.f4433b, SnapshotStateKt.h());
        this.f4395g = InteractionSourceKt.a();
        this.f4397i = ScrollableStateKt.a(new LazyListState$scrollableState$1(this));
        this.f4398j = true;
        this.f4400l = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.LazyListState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void o0(LayoutNode layoutNode) {
                LazyListState.this.f4399k = layoutNode;
            }
        };
        this.f4401m = new Object();
        this.f4402n = new LazyLayoutItemAnimator();
        this.f4403o = new LazyLayoutBeyondBoundsInfo();
        lazyListPrefetchStrategy.getClass();
        this.f4404p = new LazyLayoutPrefetchState(null, new LazyListState$prefetchState$1(this, i2));
        this.f4405q = new LazyListState$prefetchScope$1(this);
        this.f4406r = new LazyLayoutPinnedItemList();
        this.f4407s = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4408t = f2;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.f4409u = f3;
        this.f4410v = ObservableScopeInvalidator.a();
        TwoWayConverter twoWayConverter = VectorConvertersKt.f2340a;
        this.w = new AnimationState(twoWayConverter, Float.valueOf(0.0f), (AnimationVector) twoWayConverter.a().invoke(Float.valueOf(0.0f)), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
