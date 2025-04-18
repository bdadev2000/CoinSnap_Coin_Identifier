package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.gestures.Orientation;
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
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.Remeasurement;
import androidx.compose.ui.layout.RemeasurementModifier;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import e0.u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.n;
import q0.l;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LazyStaggeredGridState implements ScrollableState {

    /* renamed from: u, reason: collision with root package name */
    public static final SaverKt$Saver$1 f5048u = ListSaverKt.a(LazyStaggeredGridState$Companion$Saver$2.f5068a, LazyStaggeredGridState$Companion$Saver$1.f5067a);

    /* renamed from: a, reason: collision with root package name */
    public final LazyStaggeredGridScrollPosition f5049a;

    /* renamed from: b, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f5050b = SnapshotStateKt.f(LazyStaggeredGridMeasureResultKt.f5016a, SnapshotStateKt.h());

    /* renamed from: c, reason: collision with root package name */
    public final LazyStaggeredGridLaneInfo f5051c = new LazyStaggeredGridLaneInfo();
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    /* renamed from: f, reason: collision with root package name */
    public Remeasurement f5052f;

    /* renamed from: g, reason: collision with root package name */
    public final LazyStaggeredGridState$remeasurementModifier$1 f5053g;

    /* renamed from: h, reason: collision with root package name */
    public final AwaitFirstLayoutModifier f5054h;

    /* renamed from: i, reason: collision with root package name */
    public final LazyLayoutBeyondBoundsInfo f5055i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5056j;

    /* renamed from: k, reason: collision with root package name */
    public final LazyLayoutPrefetchState f5057k;

    /* renamed from: l, reason: collision with root package name */
    public final ScrollableState f5058l;

    /* renamed from: m, reason: collision with root package name */
    public float f5059m;

    /* renamed from: n, reason: collision with root package name */
    public int f5060n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashMap f5061o;

    /* renamed from: p, reason: collision with root package name */
    public final MutableInteractionSource f5062p;

    /* renamed from: q, reason: collision with root package name */
    public final LazyLayoutPinnedItemList f5063q;

    /* renamed from: r, reason: collision with root package name */
    public final LazyLayoutItemAnimator f5064r;

    /* renamed from: s, reason: collision with root package name */
    public final MutableState f5065s;

    /* renamed from: t, reason: collision with root package name */
    public final MutableState f5066t;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    /* JADX WARN: Type inference failed for: r8v0, types: [q0.p, kotlin.jvm.internal.n] */
    public LazyStaggeredGridState(int[] iArr, int[] iArr2) {
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f5049a = new LazyStaggeredGridScrollPosition(iArr, iArr2, new n(2, this, LazyStaggeredGridState.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        Boolean bool = Boolean.FALSE;
        f2 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.d = f2;
        f3 = SnapshotStateKt.f(bool, StructuralEqualityPolicy.f14078a);
        this.e = f3;
        this.f5053g = new RemeasurementModifier() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$remeasurementModifier$1
            @Override // androidx.compose.ui.layout.RemeasurementModifier
            public final void o0(LayoutNode layoutNode) {
                LazyStaggeredGridState.this.f5052f = layoutNode;
            }
        };
        this.f5054h = new Object();
        this.f5055i = new LazyLayoutBeyondBoundsInfo();
        this.f5056j = true;
        this.f5057k = new LazyLayoutPrefetchState(null, null);
        this.f5058l = ScrollableStateKt.a(new LazyStaggeredGridState$scrollableState$1(this));
        this.f5060n = -1;
        this.f5061o = new LinkedHashMap();
        this.f5062p = InteractionSourceKt.a();
        this.f5063q = new LazyLayoutPinnedItemList();
        this.f5064r = new LazyLayoutItemAnimator();
        this.f5065s = ObservableScopeInvalidator.a();
        this.f5066t = ObservableScopeInvalidator.a();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean a() {
        return this.f5058l.a();
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
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1) r0
            int r1 = r0.f5076g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5076g = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1 r0 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.d
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f5076g
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
            q0.p r7 = r0.f5074c
            androidx.compose.foundation.MutatePriority r6 = r0.f5073b
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r2 = r0.f5072a
            kotlin.jvm.internal.q.m(r8)
            goto L51
        L3c:
            kotlin.jvm.internal.q.m(r8)
            r0.f5072a = r5
            r0.f5073b = r6
            r0.f5074c = r7
            r0.f5076g = r4
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r8 = r5.f5054h
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L50
            return r1
        L50:
            r2 = r5
        L51:
            androidx.compose.foundation.gestures.ScrollableState r8 = r2.f5058l
            r2 = 0
            r0.f5072a = r2
            r0.f5073b = r2
            r0.f5074c = r2
            r0.f5076g = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            d0.b0 r6 = d0.b0.f30125a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.b(androidx.compose.foundation.MutatePriority, q0.p, h0.g):java.lang.Object");
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean c() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final boolean d() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public final float e(float f2) {
        return this.f5058l.e(f2);
    }

    public final void f(LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult, boolean z2) {
        Object obj;
        this.f5059m -= lazyStaggeredGridMeasureResult.f5002c;
        this.f5050b.setValue(lazyStaggeredGridMeasureResult);
        boolean z3 = true;
        LazyStaggeredGridScrollPosition lazyStaggeredGridScrollPosition = this.f5049a;
        int[] iArr = lazyStaggeredGridMeasureResult.f5000a;
        if (z2) {
            int[] iArr2 = lazyStaggeredGridMeasureResult.f5001b;
            lazyStaggeredGridScrollPosition.d = iArr2;
            lazyStaggeredGridScrollPosition.e.b(LazyStaggeredGridScrollPosition.b(lazyStaggeredGridScrollPosition.f5036b, iArr2));
        } else {
            lazyStaggeredGridScrollPosition.getClass();
            int a2 = LazyStaggeredGridScrollPosition.a(iArr);
            List list = lazyStaggeredGridMeasureResult.f5008k;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    obj = null;
                    break;
                }
                obj = list.get(i2);
                if (((LazyStaggeredGridMeasuredItem) obj).f5018a == a2) {
                    break;
                } else {
                    i2++;
                }
            }
            LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItem = (LazyStaggeredGridMeasuredItem) obj;
            lazyStaggeredGridScrollPosition.f5039g = lazyStaggeredGridMeasuredItem != null ? lazyStaggeredGridMeasuredItem.f5019b : null;
            lazyStaggeredGridScrollPosition.f5040h.a(a2);
            if (lazyStaggeredGridScrollPosition.f5038f || lazyStaggeredGridMeasureResult.f5007j > 0) {
                lazyStaggeredGridScrollPosition.f5038f = true;
                Snapshot a3 = Snapshot.Companion.a();
                l f2 = a3 != null ? a3.f() : null;
                Snapshot c2 = Snapshot.Companion.c(a3);
                try {
                    int[] iArr3 = lazyStaggeredGridMeasureResult.f5001b;
                    lazyStaggeredGridScrollPosition.f5036b = iArr;
                    lazyStaggeredGridScrollPosition.f5037c.b(LazyStaggeredGridScrollPosition.a(iArr));
                    lazyStaggeredGridScrollPosition.d = iArr3;
                    lazyStaggeredGridScrollPosition.e.b(LazyStaggeredGridScrollPosition.b(iArr, iArr3));
                } finally {
                    Snapshot.Companion.f(a3, c2, f2);
                }
            }
            if (this.f5060n != -1 && (!list.isEmpty())) {
                int index = ((LazyStaggeredGridItemInfo) u.E0(list)).getIndex();
                int index2 = ((LazyStaggeredGridItemInfo) u.L0(list)).getIndex();
                int i3 = this.f5060n;
                if (index > i3 || i3 > index2) {
                    this.f5060n = -1;
                    LinkedHashMap linkedHashMap = this.f5061o;
                    Iterator it = linkedHashMap.values().iterator();
                    while (it.hasNext()) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) it.next()).cancel();
                    }
                    linkedHashMap.clear();
                }
            }
        }
        if (iArr[0] == 0 && lazyStaggeredGridMeasureResult.f5001b[0] <= 0) {
            z3 = false;
        }
        this.e.setValue(Boolean.valueOf(z3));
        this.d.setValue(Boolean.valueOf(lazyStaggeredGridMeasureResult.e));
    }

    public final LazyStaggeredGridLayoutInfo g() {
        return (LazyStaggeredGridLayoutInfo) this.f5050b.getValue();
    }

    public final void h(float f2, LazyStaggeredGridMeasureResult lazyStaggeredGridMeasureResult) {
        LinkedHashMap linkedHashMap;
        if (this.f5056j) {
            if (!lazyStaggeredGridMeasureResult.f5008k.isEmpty()) {
                int i2 = 0;
                boolean z2 = f2 < 0.0f;
                List list = lazyStaggeredGridMeasureResult.f5008k;
                int i3 = z2 ? ((LazyStaggeredGridMeasuredItem) u.L0(list)).f5018a : ((LazyStaggeredGridMeasuredItem) u.E0(list)).f5018a;
                if (i3 == this.f5060n) {
                    return;
                }
                this.f5060n = i3;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LazyStaggeredGridSlots lazyStaggeredGridSlots = lazyStaggeredGridMeasureResult.f5004g;
                int length = lazyStaggeredGridSlots.f5046b.length;
                while (true) {
                    linkedHashMap = this.f5061o;
                    if (i2 >= length) {
                        break;
                    }
                    LazyStaggeredGridLaneInfo lazyStaggeredGridLaneInfo = this.f5051c;
                    if (z2) {
                        i3++;
                        int length2 = lazyStaggeredGridLaneInfo.f4963a + lazyStaggeredGridLaneInfo.f4964b.length;
                        while (true) {
                            if (i3 >= length2) {
                                i3 = lazyStaggeredGridLaneInfo.f4963a + lazyStaggeredGridLaneInfo.f4964b.length;
                                break;
                            } else if (lazyStaggeredGridLaneInfo.a(i3, i2)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        i3 = lazyStaggeredGridLaneInfo.d(i3, i2);
                    }
                    if (i3 < 0 || i3 >= lazyStaggeredGridMeasureResult.f5007j || linkedHashSet.contains(Integer.valueOf(i3))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(i3));
                    if (!linkedHashMap.containsKey(Integer.valueOf(i3))) {
                        lazyStaggeredGridMeasureResult.f5005h.a(i3);
                        int i4 = lazyStaggeredGridSlots.f5046b[i2];
                        linkedHashMap.put(Integer.valueOf(i3), this.f5057k.a(i3, lazyStaggeredGridMeasureResult.f5015r == Orientation.f3394a ? Constraints.Companion.e(i4) : Constraints.Companion.d(i4)));
                    }
                    i2++;
                }
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!linkedHashSet.contains(entry.getKey())) {
                        ((LazyLayoutPrefetchState.PrefetchHandle) entry.getValue()).cancel();
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4 A[LOOP:1: B:30:0x00b2->B:31:0x00b4, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r10, int r11) {
        /*
            r9 = this;
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition r0 = r9.f5049a
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r1 = r0.f5037c
            int r1 = r1.g()
            r2 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r3 = r0.e
            if (r1 != r10) goto L16
            int r1 = r3.g()
            if (r1 == r11) goto L14
            goto L16
        L14:
            r1 = r2
            goto L17
        L16:
            r1 = 1
        L17:
            if (r1 == 0) goto L1e
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator r4 = r9.f5064r
            r4.f()
        L1e:
            androidx.compose.runtime.ParcelableSnapshotMutableState r4 = r9.f5050b
            java.lang.Object r4 = r4.getValue()
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r4 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult) r4
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult r5 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt.f5016a
            java.util.List r5 = r4.f5008k
            boolean r5 = r5.isEmpty()
            r6 = 0
            if (r5 == 0) goto L33
        L31:
            r5 = r6
            goto L60
        L33:
            java.util.List r5 = r4.f5008k
            java.lang.Object r7 = e0.u.E0(r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r7 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r7
            int r7 = r7.getIndex()
            java.lang.Object r8 = e0.u.L0(r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r8 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r8
            int r8 = r8.getIndex()
            if (r10 > r8) goto L31
            if (r7 > r10) goto L31
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1 r7 = new androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResultKt$findVisibleItem$index$1
            r7.<init>(r10)
            int r8 = r5.size()
            int r7 = b1.f0.c(r2, r8, r5, r7)
            java.lang.Object r5 = e0.u.G0(r7, r5)
            androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo r5 = (androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridItemInfo) r5
        L60:
            if (r5 == 0) goto L9c
            if (r1 == 0) goto L9c
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.f3394a
            androidx.compose.foundation.gestures.Orientation r1 = r4.f5015r
            if (r1 != r10) goto L76
            long r5 = r5.c()
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r7
        L74:
            int r10 = (int) r5
            goto L7e
        L76:
            long r5 = r5.c()
            r10 = 32
            long r5 = r5 >> r10
            goto L74
        L7e:
            int r10 = r10 + r11
            int[] r11 = r4.f5001b
            int r11 = r11.length
            int[] r1 = new int[r11]
        L84:
            if (r2 >= r11) goto L90
            int[] r5 = r4.f5001b
            r5 = r5[r2]
            int r5 = r5 + r10
            r1[r2] = r5
            int r2 = r2 + 1
            goto L84
        L90:
            r0.d = r1
            int[] r10 = r0.f5036b
            int r10 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition.b(r10, r1)
            r3.b(r10)
            goto Ld4
        L9c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            int[] r4 = r0.f5036b
            int r4 = r4.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            q0.p r5 = r0.f5035a
            java.lang.Object r1 = r5.invoke(r1, r4)
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int[] r5 = new int[r4]
        Lb2:
            if (r2 >= r4) goto Lb9
            r5[r2] = r11
            int r2 = r2 + 1
            goto Lb2
        Lb9:
            r0.f5036b = r1
            int r11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition.a(r1)
            androidx.compose.runtime.ParcelableSnapshotMutableIntState r2 = r0.f5037c
            r2.b(r11)
            r0.d = r5
            int r11 = androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScrollPosition.b(r1, r5)
            r3.b(r11)
            androidx.compose.foundation.lazy.layout.LazyLayoutNearestRangeState r11 = r0.f5040h
            r11.a(r10)
            r0.f5039g = r6
        Ld4:
            androidx.compose.ui.layout.Remeasurement r10 = r9.f5052f
            if (r10 == 0) goto Ldb
            r10.d()
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState.i(int, int):void");
    }
}
