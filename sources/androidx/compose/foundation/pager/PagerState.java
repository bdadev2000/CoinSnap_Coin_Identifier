package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.foundation.lazy.layout.LazyLayoutPinnedItemList;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import e0.u;
import h0.g;
import java.util.List;
import p0.a;
import q0.l;
import q0.p;

@Stable
/* loaded from: classes2.dex */
public abstract class PagerState implements ScrollableState {
    public long A;
    public final LazyLayoutPinnedItemList B;
    public final MutableState C;
    public final MutableState D;
    public final ParcelableSnapshotMutableState E;
    public final ParcelableSnapshotMutableState F;
    public final ParcelableSnapshotMutableState G;
    public final ParcelableSnapshotMutableState H;

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f5263a;

    /* renamed from: b, reason: collision with root package name */
    public final PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1 f5264b;

    /* renamed from: c, reason: collision with root package name */
    public final PagerScrollPosition f5265c;
    public int d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public long f5266f;

    /* renamed from: g, reason: collision with root package name */
    public long f5267g;

    /* renamed from: h, reason: collision with root package name */
    public float f5268h;

    /* renamed from: i, reason: collision with root package name */
    public float f5269i;

    /* renamed from: j, reason: collision with root package name */
    public final ScrollableState f5270j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5271k;

    /* renamed from: l, reason: collision with root package name */
    public int f5272l;

    /* renamed from: m, reason: collision with root package name */
    public LazyLayoutPrefetchState.PrefetchHandle f5273m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5274n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f5275o;

    /* renamed from: p, reason: collision with root package name */
    public Density f5276p;

    /* renamed from: q, reason: collision with root package name */
    public final MutableInteractionSource f5277q;

    /* renamed from: r, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f5278r;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableIntState f5279s;

    /* renamed from: t, reason: collision with root package name */
    public final State f5280t;

    /* renamed from: u, reason: collision with root package name */
    public final State f5281u;

    /* renamed from: v, reason: collision with root package name */
    public final LazyLayoutPrefetchState f5282v;
    public final LazyLayoutBeyondBoundsInfo w;
    public final AwaitFirstLayoutModifier x;

    /* renamed from: y, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f5283y;

    /* renamed from: z, reason: collision with root package name */
    public final PagerState$remeasurementModifier$1 f5284z;

    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.foundation.pager.PagerState$remeasurementModifier$1] */
    public PagerState(int i2, float f2) {
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ParcelableSnapshotMutableState f5;
        ParcelableSnapshotMutableState f6;
        ParcelableSnapshotMutableState f7;
        ParcelableSnapshotMutableState f8;
        double d = f2;
        if (-0.5d > d || d > 0.5d) {
            throw new IllegalArgumentException(("currentPageOffsetFraction " + f2 + " is not within the range -0.5 to 0.5").toString());
        }
        f3 = SnapshotStateKt.f(new Offset(0L), StructuralEqualityPolicy.f14078a);
        this.f5263a = f3;
        this.f5264b = new PagerLazyAnimateScrollScopeKt$PagerLazyAnimateScrollScope$1(this);
        this.f5265c = new PagerScrollPosition(i2, f2, this);
        this.d = i2;
        this.f5266f = Long.MAX_VALUE;
        this.f5270j = ScrollableStateKt.a(new PagerState$scrollableState$1(this));
        this.f5271k = true;
        this.f5272l = -1;
        this.f5275o = SnapshotStateKt.f(PagerStateKt.f5307b, SnapshotStateKt.h());
        this.f5276p = PagerStateKt.f5308c;
        this.f5277q = InteractionSourceKt.a();
        this.f5278r = SnapshotIntStateKt.a(-1);
        this.f5279s = SnapshotIntStateKt.a(i2);
        this.f5280t = SnapshotStateKt.d(SnapshotStateKt.m(), new PagerState$settledPage$2(this));
        this.f5281u = SnapshotStateKt.d(SnapshotStateKt.m(), new PagerState$targetPage$2(this));
        this.f5282v = new LazyLayoutPrefetchState(null, null);
        this.w = new LazyLayoutBeyondBoundsInfo();
        this.x = new Object();
        f4 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f5283y = f4;
        this.f5284z = new RemeasurementModifier() { // from class: androidx.compose.foundation.pager.PagerState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void o0(LayoutNode layoutNode) {
                PagerState.this.f5283y.setValue(layoutNode);
            }
        };
        this.A = ConstraintsKt.b(0, 0, 15);
        this.B = new LazyLayoutPinnedItemList();
        this.C = ObservableScopeInvalidator.a();
        this.D = ObservableScopeInvalidator.a();
        Boolean bool = Boolean.FALSE;
        f5 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.E = f5;
        f6 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.F = f6;
        f7 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.G = f7;
        f8 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.H = f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object s(androidx.compose.foundation.pager.PagerState r6, androidx.compose.foundation.MutatePriority r7, q0.p r8, h0.g r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.f5299g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5299g = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f5299g
            d0.b0 r3 = d0.b0.f30125a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2e
            androidx.compose.foundation.pager.PagerState r6 = r0.f5295a
            kotlin.jvm.internal.q.m(r9)
            goto L7b
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            q0.p r8 = r0.f5297c
            androidx.compose.foundation.MutatePriority r7 = r0.f5296b
            androidx.compose.foundation.pager.PagerState r6 = r0.f5295a
            kotlin.jvm.internal.q.m(r9)
            goto L58
        L40:
            kotlin.jvm.internal.q.m(r9)
            r0.f5295a = r6
            r0.f5296b = r7
            r0.f5297c = r8
            r0.f5299g = r5
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r9 = r6.x
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L54
            goto L55
        L54:
            r9 = r3
        L55:
            if (r9 != r1) goto L58
            return r1
        L58:
            androidx.compose.foundation.gestures.ScrollableState r9 = r6.f5270j
            boolean r9 = r9.a()
            if (r9 != 0) goto L69
            int r9 = r6.j()
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r2 = r6.f5279s
            r2.b(r9)
        L69:
            androidx.compose.foundation.gestures.ScrollableState r9 = r6.f5270j
            r0.f5295a = r6
            r2 = 0
            r0.f5296b = r2
            r0.f5297c = r2
            r0.f5299g = r4
            java.lang.Object r7 = r9.b(r7, r8, r0)
            if (r7 != r1) goto L7b
            return r1
        L7b:
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r6 = r6.f5278r
            r7 = -1
            r6.b(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.s(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, q0.p, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f5270j.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final Object b(MutatePriority mutatePriority, p pVar, g gVar) {
        return s(this, mutatePriority, pVar, gVar);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean c() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f5270j.e(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(int r18, float r19, androidx.compose.animation.core.AnimationSpec r20, h0.g r21) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerState.f(int, float, androidx.compose.animation.core.AnimationSpec, h0.g):java.lang.Object");
    }

    public final void h(PagerMeasureResult pagerMeasureResult, boolean z2) {
        PagerScrollPosition pagerScrollPosition = this.f5265c;
        boolean z3 = true;
        if (z2) {
            pagerScrollPosition.f5260c.n(pagerMeasureResult.f5248l);
        } else {
            pagerScrollPosition.getClass();
            MeasuredPage measuredPage = pagerMeasureResult.f5247k;
            pagerScrollPosition.e = measuredPage != null ? measuredPage.e : null;
            boolean z4 = pagerScrollPosition.d;
            List list = pagerMeasureResult.f5239a;
            if (z4 || (!list.isEmpty())) {
                pagerScrollPosition.d = true;
                int i2 = measuredPage != null ? measuredPage.f5125a : 0;
                float f2 = pagerMeasureResult.f5248l;
                pagerScrollPosition.f5259b.b(i2);
                pagerScrollPosition.f5261f.a(i2);
                pagerScrollPosition.f5260c.n(f2);
            }
            if (this.f5272l != -1 && (!list.isEmpty())) {
                if (this.f5272l != (this.f5274n ? pagerMeasureResult.f5245i + ((PageInfo) u.L0(list)).getIndex() + 1 : (((PageInfo) u.E0(list)).getIndex() - r4) - 1)) {
                    this.f5272l = -1;
                    LazyLayoutPrefetchState.PrefetchHandle prefetchHandle = this.f5273m;
                    if (prefetchHandle != null) {
                        prefetchHandle.cancel();
                    }
                    this.f5273m = null;
                }
            }
        }
        this.f5275o.setValue(pagerMeasureResult);
        this.E.setValue(Boolean.valueOf(pagerMeasureResult.f5250n));
        MeasuredPage measuredPage2 = pagerMeasureResult.f5246j;
        if ((measuredPage2 == null || measuredPage2.f5125a == 0) && pagerMeasureResult.f5249m == 0) {
            z3 = false;
        }
        this.F.setValue(Boolean.valueOf(z3));
        if (measuredPage2 != null) {
            this.d = measuredPage2.f5125a;
        }
        this.e = pagerMeasureResult.f5249m;
        Snapshot a2 = Snapshot.Companion.a();
        l f3 = a2 != null ? a2.f() : null;
        Snapshot c2 = Snapshot.Companion.c(a2);
        try {
            if (Math.abs(this.f5269i) > 0.5f && this.f5271k && q(this.f5269i)) {
                r(this.f5269i, pagerMeasureResult);
            }
            Snapshot.Companion.f(a2, c2, f3);
            this.f5266f = PagerStateKt.b(pagerMeasureResult, m());
            int m2 = m();
            Orientation orientation = Orientation.f3395b;
            Orientation orientation2 = pagerMeasureResult.e;
            long a3 = pagerMeasureResult.a();
            int i3 = (int) (orientation2 == orientation ? a3 >> 32 : a3 & 4294967295L);
            this.f5267g = a.A(pagerMeasureResult.f5251o.a(i3, pagerMeasureResult.f5240b, -pagerMeasureResult.f5242f, pagerMeasureResult.d, 0, m2), 0, i3);
        } catch (Throwable th) {
            Snapshot.Companion.f(a2, c2, f3);
            throw th;
        }
    }

    public final int i(int i2) {
        if (m() > 0) {
            return a.A(i2, 0, m() - 1);
        }
        return 0;
    }

    public final int j() {
        return this.f5265c.f5259b.g();
    }

    public final float k() {
        return this.f5265c.f5260c.c();
    }

    public final PagerLayoutInfo l() {
        return (PagerLayoutInfo) this.f5275o.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((PagerMeasureResult) this.f5275o.getValue()).f5240b;
    }

    public final int o() {
        return ((PagerMeasureResult) this.f5275o.getValue()).f5241c + n();
    }

    public final long p() {
        return ((Offset) this.f5263a.getValue()).f14913a;
    }

    public final boolean q(float f2) {
        if (l().c() != Orientation.f3394a ? Math.signum(f2) != Math.signum(-Offset.g(p())) : Math.signum(f2) != Math.signum(-Offset.h(p()))) {
            if (((int) Offset.g(p())) != 0 || ((int) Offset.h(p())) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void r(float f2, PagerLayoutInfo pagerLayoutInfo) {
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle2;
        LazyLayoutPrefetchState.PrefetchHandle prefetchHandle3;
        if (this.f5271k && (!pagerLayoutInfo.h().isEmpty())) {
            boolean z2 = f2 > 0.0f;
            int j2 = z2 ? pagerLayoutInfo.j() + ((PageInfo) u.L0(pagerLayoutInfo.h())).getIndex() + 1 : (((PageInfo) u.E0(pagerLayoutInfo.h())).getIndex() - pagerLayoutInfo.j()) - 1;
            if (j2 < 0 || j2 >= m()) {
                return;
            }
            if (j2 != this.f5272l) {
                if (this.f5274n != z2 && (prefetchHandle3 = this.f5273m) != null) {
                    prefetchHandle3.cancel();
                }
                this.f5274n = z2;
                this.f5272l = j2;
                this.f5273m = this.f5282v.a(j2, this.A);
            }
            if (z2) {
                if ((((PageInfo) u.L0(pagerLayoutInfo.h())).a() + (pagerLayoutInfo.i() + pagerLayoutInfo.getPageSize())) - pagerLayoutInfo.e() >= f2 || (prefetchHandle2 = this.f5273m) == null) {
                    return;
                }
                prefetchHandle2.b();
                return;
            }
            if (pagerLayoutInfo.g() - ((PageInfo) u.E0(pagerLayoutInfo.h())).a() >= (-f2) || (prefetchHandle = this.f5273m) == null) {
                return;
            }
            prefetchHandle.b();
        }
    }
}
