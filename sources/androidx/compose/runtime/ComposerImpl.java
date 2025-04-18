package androidx.compose.runtime;

import androidx.collection.MutableIntIntMap;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.changelist.FixupList;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.node.UiApplier;
import d0.k;
import e0.q;
import e0.s;
import e0.w;
import h0.l;
import h0.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.e;
import org.objectweb.asm.Opcodes;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class ComposerImpl implements Composer {
    public int A;
    public boolean B;
    public final ComposerImpl$derivedStateObserver$1 C;
    public final Stack D;
    public boolean E;
    public SlotReader F;
    public SlotTable G;
    public SlotWriter H;
    public boolean I;
    public PersistentCompositionLocalMap J;
    public ChangeList K;
    public final ComposerChangeListWriter L;
    public Anchor M;
    public FixupList N;
    public boolean O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final Applier f13691a;

    /* renamed from: b, reason: collision with root package name */
    public final CompositionContext f13692b;

    /* renamed from: c, reason: collision with root package name */
    public final SlotTable f13693c;
    public final Set d;
    public final ChangeList e;

    /* renamed from: f, reason: collision with root package name */
    public final ChangeList f13694f;

    /* renamed from: g, reason: collision with root package name */
    public final ControlledComposition f13695g;

    /* renamed from: i, reason: collision with root package name */
    public Pending f13697i;

    /* renamed from: j, reason: collision with root package name */
    public int f13698j;

    /* renamed from: k, reason: collision with root package name */
    public int f13699k;

    /* renamed from: l, reason: collision with root package name */
    public int f13700l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f13702n;

    /* renamed from: o, reason: collision with root package name */
    public MutableIntIntMap f13703o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13704p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13705q;

    /* renamed from: u, reason: collision with root package name */
    public IntMap f13709u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13710v;
    public boolean x;

    /* renamed from: z, reason: collision with root package name */
    public int f13712z;

    /* renamed from: h, reason: collision with root package name */
    public final Stack f13696h = new Stack();

    /* renamed from: m, reason: collision with root package name */
    public final IntStack f13701m = new IntStack();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f13706r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final IntStack f13707s = new IntStack();

    /* renamed from: t, reason: collision with root package name */
    public PersistentCompositionLocalMap f13708t = PersistentCompositionLocalHashMap.d;
    public final IntStack w = new IntStack();

    /* renamed from: y, reason: collision with root package name */
    public int f13711y = -1;

    /* loaded from: classes.dex */
    public static final class CompositionContextHolder implements ReusableRememberObserver {

        /* renamed from: a, reason: collision with root package name */
        public final CompositionContextImpl f13713a;

        public CompositionContextHolder(CompositionContextImpl compositionContextImpl) {
            this.f13713a = compositionContextImpl;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onAbandoned() {
            this.f13713a.v();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onForgotten() {
            this.f13713a.v();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public final void onRemembered() {
        }
    }

    /* loaded from: classes.dex */
    public final class CompositionContextImpl extends CompositionContext {

        /* renamed from: a, reason: collision with root package name */
        public final int f13714a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13715b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13716c;
        public final CompositionObserverHolder d;
        public HashSet e;

        /* renamed from: f, reason: collision with root package name */
        public final LinkedHashSet f13717f = new LinkedHashSet();

        /* renamed from: g, reason: collision with root package name */
        public final ParcelableSnapshotMutableState f13718g = SnapshotStateKt.f(PersistentCompositionLocalHashMap.d, ReferentialEqualityPolicy.f13969a);

        public CompositionContextImpl(int i2, boolean z2, boolean z3, CompositionObserverHolder compositionObserverHolder) {
            this.f13714a = i2;
            this.f13715b = z2;
            this.f13716c = z3;
            this.d = compositionObserverHolder;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void a(ControlledComposition controlledComposition, ComposableLambdaImpl composableLambdaImpl) {
            ComposerImpl.this.f13692b.a(controlledComposition, composableLambdaImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void b(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f13692b.b(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void c() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f13712z--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean d() {
            return ComposerImpl.this.f13692b.d();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean e() {
            return this.f13715b;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final boolean f() {
            return this.f13716c;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final PersistentCompositionLocalMap g() {
            return (PersistentCompositionLocalMap) this.f13718g.getValue();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final int h() {
            return this.f13714a;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final l i() {
            return ComposerImpl.this.f13692b.i();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final CompositionObserverHolder j() {
            return this.d;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final l k() {
            ControlledComposition controlledComposition = ComposerImpl.this.f13695g;
            Object obj = CompositionKt.f13759a;
            CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
            if (compositionImpl != null) {
                l lVar = compositionImpl.f13751u;
                if (lVar == null) {
                    lVar = compositionImpl.f13733a.k();
                }
                if (lVar != null) {
                    return lVar;
                }
            }
            return m.f30726a;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void l(MovableContentStateReference movableContentStateReference) {
            ComposerImpl.this.f13692b.l(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void m(ControlledComposition controlledComposition) {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.f13692b.m(composerImpl.f13695g);
            composerImpl.f13692b.m(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void n(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
            ComposerImpl.this.f13692b.n(movableContentStateReference, movableContentState);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final MovableContentState o(MovableContentStateReference movableContentStateReference) {
            return ComposerImpl.this.f13692b.o(movableContentStateReference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void p(Set set) {
            HashSet hashSet = this.e;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.e = hashSet;
            }
            hashSet.add(set);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void q(ComposerImpl composerImpl) {
            this.f13717f.add(composerImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void r(ControlledComposition controlledComposition) {
            ComposerImpl.this.f13692b.r(controlledComposition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void s() {
            ComposerImpl.this.f13712z++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void t(ComposerImpl composerImpl) {
            HashSet hashSet = this.e;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(composerImpl.f13693c);
                }
            }
            LinkedHashSet linkedHashSet = this.f13717f;
            e.c(linkedHashSet);
            linkedHashSet.remove(composerImpl);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public final void u(ControlledComposition controlledComposition) {
            ComposerImpl.this.f13692b.u(controlledComposition);
        }

        public final void v() {
            LinkedHashSet<ComposerImpl> linkedHashSet = this.f13717f;
            if (!linkedHashSet.isEmpty()) {
                HashSet hashSet = this.e;
                if (hashSet != null) {
                    for (ComposerImpl composerImpl : linkedHashSet) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((Set) it.next()).remove(composerImpl.f13693c);
                        }
                    }
                }
                linkedHashSet.clear();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.compose.runtime.ComposerImpl$derivedStateObserver$1] */
    public ComposerImpl(UiApplier uiApplier, CompositionContext compositionContext, SlotTable slotTable, Set set, ChangeList changeList, ChangeList changeList2, ControlledComposition controlledComposition) {
        this.f13691a = uiApplier;
        this.f13692b = compositionContext;
        this.f13693c = slotTable;
        this.d = set;
        this.e = changeList;
        this.f13694f = changeList2;
        this.f13695g = controlledComposition;
        this.B = compositionContext.f() || compositionContext.d();
        this.C = new DerivedStateObserver() { // from class: androidx.compose.runtime.ComposerImpl$derivedStateObserver$1
            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void a() {
                ComposerImpl composerImpl = ComposerImpl.this;
                composerImpl.f13712z--;
            }

            @Override // androidx.compose.runtime.DerivedStateObserver
            public final void start() {
                ComposerImpl.this.f13712z++;
            }
        };
        this.D = new Stack();
        SlotReader d = slotTable.d();
        d.c();
        this.F = d;
        SlotTable slotTable2 = new SlotTable();
        if (compositionContext.f()) {
            slotTable2.c();
        }
        if (compositionContext.d()) {
            slotTable2.f13997k = new MutableIntObjectMap();
        }
        this.G = slotTable2;
        SlotWriter e = slotTable2.e();
        e.e(true);
        this.H = e;
        this.L = new ComposerChangeListWriter(this, changeList);
        SlotReader d2 = this.G.d();
        try {
            Anchor a2 = d2.a(0);
            d2.c();
            this.M = a2;
            this.N = new FixupList();
        } catch (Throwable th) {
            d2.c();
            throw th;
        }
    }

    public static final int q0(ComposerImpl composerImpl, int i2, boolean z2, int i3) {
        SlotReader slotReader = composerImpl.F;
        int[] iArr = slotReader.f13978b;
        int i4 = i2 * 5;
        boolean z3 = (iArr[i4 + 1] & 134217728) != 0;
        ComposerChangeListWriter composerChangeListWriter = composerImpl.L;
        if (z3) {
            int i5 = iArr[i4];
            Object j2 = slotReader.j(i2, iArr);
            CompositionContext compositionContext = composerImpl.f13692b;
            if (i5 == 126665345 && (j2 instanceof MovableContent)) {
                MovableContent movableContent = (MovableContent) j2;
                Object g2 = slotReader.g(i2, 0);
                Anchor a2 = slotReader.a(i2);
                int i6 = iArr[i4 + 3] + i2;
                ArrayList arrayList = composerImpl.f13706r;
                ArrayList arrayList2 = new ArrayList();
                int f2 = ComposerKt.f(i2, arrayList);
                if (f2 < 0) {
                    f2 = -(f2 + 1);
                }
                while (f2 < arrayList.size()) {
                    Invalidation invalidation = (Invalidation) arrayList.get(f2);
                    if (invalidation.f13810b >= i6) {
                        break;
                    }
                    arrayList2.add(invalidation);
                    f2++;
                }
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size = arrayList2.size();
                for (int i7 = 0; i7 < size; i7++) {
                    Invalidation invalidation2 = (Invalidation) arrayList2.get(i7);
                    arrayList3.add(new k(invalidation2.f13809a, invalidation2.f13811c));
                }
                MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, g2, composerImpl.f13695g, composerImpl.f13693c, a2, arrayList3, composerImpl.R(i2));
                compositionContext.b(movableContentStateReference);
                composerChangeListWriter.i();
                ChangeList changeList = composerChangeListWriter.f14082b;
                changeList.getClass();
                Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.f14114c;
                Operations operations = changeList.f14080a;
                operations.j(releaseMovableGroupAtCurrent);
                Operations.WriteScope.b(operations, 0, composerImpl.f13695g);
                Operations.WriteScope.b(operations, 1, compositionContext);
                Operations.WriteScope.b(operations, 2, movableContentStateReference);
                int i8 = operations.f14134g;
                int i9 = releaseMovableGroupAtCurrent.f14093a;
                int b2 = Operations.b(operations, i9);
                int i10 = releaseMovableGroupAtCurrent.f14094b;
                if (i8 == b2 && operations.f14135h == Operations.b(operations, i10)) {
                    if (!z2) {
                        return SlotTableKt.h(i2, iArr);
                    }
                    composerChangeListWriter.g();
                    composerChangeListWriter.f();
                    ComposerImpl composerImpl2 = composerChangeListWriter.f14081a;
                    int h2 = SlotTableKt.f(i2, composerImpl2.F.f13978b) ? 1 : SlotTableKt.h(i2, composerImpl2.F.f13978b);
                    if (h2 <= 0) {
                        return 0;
                    }
                    composerChangeListWriter.j(i3, h2);
                    return 0;
                }
                StringBuilder sb = new StringBuilder();
                int i11 = 0;
                for (int i12 = 0; i12 < i9; i12++) {
                    if (((1 << i12) & operations.f14134g) != 0) {
                        if (i11 > 0) {
                            sb.append(", ");
                        }
                        sb.append(releaseMovableGroupAtCurrent.c(i12));
                        i11++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    if (((1 << i14) & operations.f14135h) != 0) {
                        if (i11 > 0) {
                            s2.append(", ");
                        }
                        s2.append(releaseMovableGroupAtCurrent.d(i14));
                        i13++;
                    }
                }
                String sb3 = s2.toString();
                p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(releaseMovableGroupAtCurrent);
                sb4.append(". Not all arguments were provided. Missing ");
                androidx.compose.foundation.text.input.a.y(sb4, i11, " int arguments (", sb2, ") and ");
                androidx.compose.foundation.text.input.a.C(sb4, i13, " object arguments (", sb3, ").");
                throw null;
            }
            if (i5 == 206 && p0.a.g(j2, ComposerKt.e)) {
                Object g3 = slotReader.g(i2, 0);
                CompositionContextHolder compositionContextHolder = g3 instanceof CompositionContextHolder ? (CompositionContextHolder) g3 : null;
                if (compositionContextHolder != null) {
                    for (ComposerImpl composerImpl3 : compositionContextHolder.f13713a.f13717f) {
                        composerImpl3.p0();
                        compositionContext.r(composerImpl3.f13695g);
                    }
                }
                return SlotTableKt.h(i2, iArr);
            }
            if (!SlotTableKt.f(i2, iArr)) {
                return SlotTableKt.h(i2, iArr);
            }
        } else if (SlotTableKt.a(i2, iArr)) {
            int i15 = iArr[i4 + 3] + i2;
            int i16 = 0;
            for (int i17 = i2 + 1; i17 < i15; i17 += iArr[(i17 * 5) + 3]) {
                boolean f3 = SlotTableKt.f(i17, iArr);
                if (f3) {
                    composerChangeListWriter.g();
                    Object i18 = slotReader.i(i17);
                    composerChangeListWriter.g();
                    composerChangeListWriter.f14086h.f14076a.add(i18);
                }
                i16 += q0(composerImpl, i17, f3 || z2, f3 ? 0 : i3 + i16);
                if (f3) {
                    composerChangeListWriter.g();
                    composerChangeListWriter.e();
                }
            }
            if (!SlotTableKt.f(i2, iArr)) {
                return i16;
            }
        } else if (!SlotTableKt.f(i2, iArr)) {
            return SlotTableKt.h(i2, iArr);
        }
        return 1;
    }

    @Override // androidx.compose.runtime.Composer
    public final void A() {
        if (this.f13699k != 0) {
            ComposerKt.c("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        RecomposeScopeImpl d02 = d0();
        if (d02 != null) {
            d02.f13868a |= 16;
        }
        if (this.f13706r.isEmpty()) {
            s0();
        } else {
            l0();
        }
    }

    public final void A0() {
        this.f13700l = 0;
        SlotTable slotTable = this.f13693c;
        this.F = slotTable.d();
        t0(100, null, null, 0);
        CompositionContext compositionContext = this.f13692b;
        compositionContext.s();
        this.f13708t = compositionContext.g();
        this.w.b(this.f13710v ? 1 : 0);
        this.f13710v = I(this.f13708t);
        this.J = null;
        if (!this.f13704p) {
            this.f13704p = compositionContext.e();
        }
        if (!this.B) {
            this.B = compositionContext.f();
        }
        Set set = (Set) CompositionLocalMapKt.a(this.f13708t, InspectionTablesKt.f14653a);
        if (set != null) {
            set.add(slotTable);
            compositionContext.p(set);
        }
        t0(compositionContext.h(), null, null, 0);
    }

    @Override // androidx.compose.runtime.Composer
    public final void B(q0.a aVar) {
        int i2;
        int i3;
        int i4;
        if (!this.f13705q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f13705q = false;
        if (!this.O) {
            ComposerKt.c("createNode() can only be called when inserting");
            throw null;
        }
        IntStack intStack = this.f13701m;
        int i5 = intStack.f13807a[intStack.f13808b - 1];
        SlotWriter slotWriter = this.H;
        Anchor b2 = slotWriter.b(slotWriter.f14020v);
        this.f13699k++;
        FixupList fixupList = this.N;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.f14108c;
        Operations operations = fixupList.f14091a;
        operations.j(insertNodeFixup);
        Operations.WriteScope.b(operations, 0, aVar);
        Operations.WriteScope.a(operations, 0, i5);
        Operations.WriteScope.b(operations, 1, b2);
        if (!(operations.f14134g == Operations.b(operations, 1) && operations.f14135h == Operations.b(operations, 2))) {
            StringBuilder sb = new StringBuilder();
            if ((operations.f14134g & 1) != 0) {
                sb.append(insertNodeFixup.c(0));
                i4 = 1;
            } else {
                i4 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i6 = 0;
            for (int i7 = 0; i7 < 2; i7++) {
                if (((1 << i7) & operations.f14135h) != 0) {
                    if (i4 > 0) {
                        s2.append(", ");
                    }
                    s2.append(insertNodeFixup.d(i7));
                    i6++;
                }
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(insertNodeFixup);
            sb4.append(". Not all arguments were provided. Missing ");
            androidx.compose.foundation.text.input.a.y(sb4, i4, " int arguments (", sb2, ") and ");
            androidx.compose.foundation.text.input.a.C(sb4, i6, " object arguments (", sb3, ").");
            throw null;
        }
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.f14113c;
        Operations operations2 = fixupList.f14092b;
        operations2.j(postInsertNodeFixup);
        Operations.WriteScope.a(operations2, 0, i5);
        Operations.WriteScope.b(operations2, 0, b2);
        if (operations2.f14134g == Operations.b(operations2, 1) && operations2.f14135h == Operations.b(operations2, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((operations2.f14134g & 1) != 0) {
            sb5.append(postInsertNodeFixup.c(0));
            i2 = 1;
        } else {
            i2 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder s3 = androidx.compose.foundation.text.input.a.s(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((operations2.f14135h & 1) != 0) {
            if (i2 > 0) {
                s3.append(", ");
            }
            s3.append(postInsertNodeFixup.d(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb7 = s3.toString();
        p0.a.r(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(postInsertNodeFixup);
        sb8.append(". Not all arguments were provided. Missing ");
        androidx.compose.foundation.text.input.a.y(sb8, i2, " int arguments (", sb6, ") and ");
        androidx.compose.foundation.text.input.a.C(sb8, i3, " object arguments (", sb7, ").");
        throw null;
    }

    public final boolean B0(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        Anchor anchor = recomposeScopeImpl.f13870c;
        if (anchor == null) {
            return false;
        }
        int b2 = this.F.f13977a.b(anchor);
        if (!this.E || b2 < this.F.f13981g) {
            return false;
        }
        ArrayList arrayList = this.f13706r;
        int f2 = ComposerKt.f(b2, arrayList);
        if (f2 < 0) {
            int i2 = -(f2 + 1);
            if (!(obj instanceof DerivedState)) {
                obj = null;
            }
            arrayList.add(i2, new Invalidation(recomposeScopeImpl, b2, obj));
        } else {
            Invalidation invalidation = (Invalidation) arrayList.get(f2);
            if (obj instanceof DerivedState) {
                Object obj2 = invalidation.f13811c;
                if (obj2 == null) {
                    invalidation.f13811c = obj;
                } else if (obj2 instanceof MutableScatterSet) {
                    ((MutableScatterSet) obj2).d(obj);
                } else {
                    int i3 = ScatterSetKt.f1605a;
                    MutableScatterSet mutableScatterSet = new MutableScatterSet(2);
                    mutableScatterSet.f1592b[mutableScatterSet.g(obj2)] = obj2;
                    mutableScatterSet.f1592b[mutableScatterSet.g(obj)] = obj;
                    invalidation.f13811c = mutableScatterSet;
                }
            } else {
                invalidation.f13811c = null;
            }
        }
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void C(RecomposeScope recomposeScope) {
        RecomposeScopeImpl recomposeScopeImpl = recomposeScope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) recomposeScope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.f13868a |= 1;
    }

    public final void C0(int i2, int i3) {
        if (F0(i2) != i3) {
            if (i2 < 0) {
                MutableIntIntMap mutableIntIntMap = this.f13703o;
                if (mutableIntIntMap == null) {
                    mutableIntIntMap = new MutableIntIntMap();
                    this.f13703o = mutableIntIntMap;
                }
                mutableIntIntMap.g(i2, i3);
                return;
            }
            int[] iArr = this.f13702n;
            if (iArr == null) {
                iArr = new int[this.F.f13979c];
                q.X(iArr, -1, 0, 6);
                this.f13702n = iArr;
            }
            iArr[i2] = i3;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void D() {
        V(false);
    }

    public final void D0(int i2, int i3) {
        int F0 = F0(i2);
        if (F0 != i3) {
            int i4 = i3 - F0;
            Stack stack = this.f13696h;
            int size = stack.f14076a.size() - 1;
            while (i2 != -1) {
                int F02 = F0(i2) + i4;
                C0(i2, F02);
                int i5 = size;
                while (true) {
                    if (-1 < i5) {
                        Pending pending = (Pending) stack.f14076a.get(i5);
                        if (pending != null && pending.a(i2, F02)) {
                            size = i5 - 1;
                            break;
                        }
                        i5--;
                    } else {
                        break;
                    }
                }
                if (i2 < 0) {
                    i2 = this.F.f13983i;
                } else if (SlotTableKt.f(i2, this.F.f13978b)) {
                    return;
                } else {
                    i2 = SlotTableKt.i(i2, this.F.f13978b);
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final int E() {
        return this.P;
    }

    public final void E0(Object obj) {
        int i2;
        int i3;
        if (this.O) {
            this.H.O(obj);
            return;
        }
        SlotReader slotReader = this.F;
        boolean z2 = slotReader.f13988n;
        int i4 = 1;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        if (!z2) {
            Anchor a2 = slotReader.a(slotReader.f13983i);
            ChangeList changeList = composerChangeListWriter.f14082b;
            changeList.getClass();
            Operation.AppendValue appendValue = Operation.AppendValue.f14096c;
            Operations operations = changeList.f14080a;
            operations.j(appendValue);
            int i5 = 0;
            Operations.WriteScope.b(operations, 0, a2);
            Operations.WriteScope.b(operations, 1, obj);
            int i6 = operations.f14134g;
            int i7 = appendValue.f14093a;
            int b2 = Operations.b(operations, i7);
            int i8 = appendValue.f14094b;
            if (i6 == b2 && operations.f14135h == Operations.b(operations, i8)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i9 = 0;
            while (i9 < i7) {
                if (((i4 << i9) & operations.f14134g) != 0) {
                    if (i5 > 0) {
                        sb.append(", ");
                    }
                    sb.append(appendValue.c(i9));
                    i5++;
                }
                i9++;
                i4 = 1;
            }
            String sb2 = sb.toString();
            StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i10 = 0;
            int i11 = 0;
            while (i10 < i8) {
                int i12 = i8;
                if (((1 << i10) & operations.f14135h) != 0) {
                    if (i5 > 0) {
                        s2.append(", ");
                    }
                    s2.append(appendValue.d(i10));
                    i11++;
                }
                i10++;
                i8 = i12;
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(appendValue);
            sb4.append(". Not all arguments were provided. Missing ");
            androidx.compose.foundation.text.input.a.y(sb4, i5, " int arguments (", sb2, ") and ");
            androidx.compose.foundation.text.input.a.C(sb4, i11, " object arguments (", sb3, ").");
            throw null;
        }
        int j2 = (slotReader.f13986l - SlotTableKt.j(slotReader.f13983i, slotReader.f13978b)) - 1;
        if (composerChangeListWriter.f14081a.F.f13983i - composerChangeListWriter.f14084f >= 0) {
            composerChangeListWriter.h(true);
            ChangeList changeList2 = composerChangeListWriter.f14082b;
            Operation.UpdateValue updateValue = Operation.UpdateValue.f14125c;
            Operations operations2 = changeList2.f14080a;
            operations2.j(updateValue);
            Operations.WriteScope.b(operations2, 0, obj);
            Operations.WriteScope.a(operations2, 0, j2);
            if (operations2.f14134g == Operations.b(operations2, 1) && operations2.f14135h == Operations.b(operations2, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((operations2.f14134g & 1) != 0) {
                sb5.append(updateValue.c(0));
                i2 = 1;
            } else {
                i2 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder s3 = androidx.compose.foundation.text.input.a.s(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((operations2.f14135h & 1) != 0) {
                if (i2 > 0) {
                    s3.append(", ");
                }
                s3.append(updateValue.d(0));
            } else {
                i4 = 0;
            }
            String sb7 = s3.toString();
            p0.a.r(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(updateValue);
            sb8.append(". Not all arguments were provided. Missing ");
            androidx.compose.foundation.text.input.a.y(sb8, i2, " int arguments (", sb6, ") and ");
            androidx.compose.foundation.text.input.a.C(sb8, i4, " object arguments (", sb7, ").");
            throw null;
        }
        SlotReader slotReader2 = this.F;
        Anchor a3 = slotReader2.a(slotReader2.f13983i);
        ChangeList changeList3 = composerChangeListWriter.f14082b;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.f14122c;
        Operations operations3 = changeList3.f14080a;
        operations3.j(updateAnchoredValue);
        Operations.WriteScope.b(operations3, 0, obj);
        Operations.WriteScope.b(operations3, 1, a3);
        Operations.WriteScope.a(operations3, 0, j2);
        if (operations3.f14134g == Operations.b(operations3, 1) && operations3.f14135h == Operations.b(operations3, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((operations3.f14134g & 1) != 0) {
            sb9.append(updateAnchoredValue.c(0));
            i3 = 1;
        } else {
            i3 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder s4 = androidx.compose.foundation.text.input.a.s(sb10, "StringBuilder().apply(builderAction).toString()");
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 2; i13 < i15; i15 = 2) {
            if (((1 << i13) & operations3.f14135h) != 0) {
                if (i3 > 0) {
                    s4.append(", ");
                }
                s4.append(updateAnchoredValue.d(i13));
                i14++;
            }
            i13++;
        }
        String sb11 = s4.toString();
        p0.a.r(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(updateAnchoredValue);
        sb12.append(". Not all arguments were provided. Missing ");
        androidx.compose.foundation.text.input.a.y(sb12, i3, " int arguments (", sb10, ") and ");
        androidx.compose.foundation.text.input.a.C(sb12, i14, " object arguments (", sb11, ").");
        throw null;
    }

    @Override // androidx.compose.runtime.Composer
    public final CompositionContext F() {
        v0(206, ComposerKt.e);
        if (this.O) {
            SlotWriter.u(this.H);
        }
        Object h02 = h0();
        CompositionContextHolder compositionContextHolder = h02 instanceof CompositionContextHolder ? (CompositionContextHolder) h02 : null;
        if (compositionContextHolder == null) {
            int i2 = this.P;
            boolean z2 = this.f13704p;
            boolean z3 = this.B;
            ControlledComposition controlledComposition = this.f13695g;
            CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(i2, z2, z3, compositionImpl != null ? compositionImpl.f13749s : null));
            E0(compositionContextHolder);
        }
        PersistentCompositionLocalMap Q = Q();
        CompositionContextImpl compositionContextImpl = compositionContextHolder.f13713a;
        compositionContextImpl.f13718g.setValue(Q);
        V(false);
        return compositionContextImpl;
    }

    public final int F0(int i2) {
        int i3;
        if (i2 >= 0) {
            int[] iArr = this.f13702n;
            return (iArr == null || (i3 = iArr[i2]) < 0) ? SlotTableKt.h(i2, this.F.f13978b) : i3;
        }
        MutableIntIntMap mutableIntIntMap = this.f13703o;
        if (mutableIntIntMap == null || mutableIntIntMap.a(i2) < 0) {
            return 0;
        }
        return mutableIntIntMap.b(i2);
    }

    @Override // androidx.compose.runtime.Composer
    public final void G() {
        V(false);
    }

    public final void G0() {
        if (!this.f13705q) {
            return;
        }
        ComposerKt.c("A call to createNode(), emitNode() or useNode() expected");
        throw null;
    }

    @Override // androidx.compose.runtime.Composer
    public final void H() {
        V(false);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean I(Object obj) {
        if (p0.a.g(h0(), obj)) {
            return false;
        }
        E0(obj);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void J(int i2) {
        int i3;
        int i4;
        if (this.f13697i != null) {
            t0(i2, null, null, 0);
            return;
        }
        G0();
        this.P = this.f13700l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i2, 3);
        this.f13700l++;
        SlotReader slotReader = this.F;
        boolean z2 = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (z2) {
            slotReader.f13985k++;
            this.H.M(composer$Companion$Empty$1, i2, composer$Companion$Empty$1, false);
            b0(false, null);
            return;
        }
        if (slotReader.f() == i2 && ((i4 = slotReader.f13981g) >= slotReader.f13982h || !SlotTableKt.e(i4, slotReader.f13978b))) {
            slotReader.n();
            b0(false, null);
            return;
        }
        if (slotReader.f13985k <= 0 && (i3 = slotReader.f13981g) != slotReader.f13982h) {
            int i5 = this.f13698j;
            m0();
            this.L.j(i5, slotReader.l());
            ComposerKt.a(i3, slotReader.f13981g, this.f13706r);
        }
        slotReader.f13985k++;
        this.O = true;
        this.J = null;
        if (this.H.w) {
            SlotWriter e = this.G.e();
            this.H = e;
            e.H();
            this.I = false;
            this.J = null;
        }
        SlotWriter slotWriter = this.H;
        slotWriter.d();
        int i6 = slotWriter.f14018t;
        slotWriter.M(composer$Companion$Empty$1, i2, composer$Companion$Empty$1, false);
        this.M = slotWriter.b(i6);
        b0(false, null);
    }

    @Override // androidx.compose.runtime.Composer
    public final Object K(ProvidableCompositionLocal providableCompositionLocal) {
        return CompositionLocalMapKt.a(Q(), providableCompositionLocal);
    }

    @Override // androidx.compose.runtime.Composer
    public final void L(q0.a aVar) {
        ChangeList changeList = this.L.f14082b;
        changeList.getClass();
        Operation.SideEffect sideEffect = Operation.SideEffect.f14119c;
        Operations operations = changeList.f14080a;
        operations.j(sideEffect);
        Operations.WriteScope.b(operations, 0, aVar);
        int i2 = operations.f14134g;
        int i3 = sideEffect.f14093a;
        int b2 = Operations.b(operations, i3);
        int i4 = sideEffect.f14094b;
        if (i2 == b2 && operations.f14135h == Operations.b(operations, i4)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        for (int i6 = 0; i6 < i3; i6++) {
            if (((1 << i6) & operations.f14134g) != 0) {
                if (i5 > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.c(i6));
                i5++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            if (((1 << i8) & operations.f14135h) != 0) {
                if (i5 > 0) {
                    s2.append(", ");
                }
                s2.append(sideEffect.d(i8));
                i7++;
            }
        }
        String sb3 = s2.toString();
        p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(sideEffect);
        sb4.append(". Not all arguments were provided. Missing ");
        androidx.compose.foundation.text.input.a.y(sb4, i5, " int arguments (", sb2, ") and ");
        androidx.compose.foundation.text.input.a.C(sb4, i7, " object arguments (", sb3, ").");
        throw null;
    }

    public final void M() {
        O();
        this.f13696h.f14076a.clear();
        this.f13701m.f13808b = 0;
        this.f13707s.f13808b = 0;
        this.w.f13808b = 0;
        this.f13709u = null;
        FixupList fixupList = this.N;
        fixupList.f14092b.c();
        fixupList.f14091a.c();
        this.P = 0;
        this.f13712z = 0;
        this.f13705q = false;
        this.O = false;
        this.x = false;
        this.E = false;
        this.f13711y = -1;
        SlotReader slotReader = this.F;
        if (!slotReader.f13980f) {
            slotReader.c();
        }
        if (this.H.w) {
            return;
        }
        c0();
    }

    public final boolean N(char c2) {
        Object h02 = h0();
        if ((h02 instanceof Character) && c2 == ((Character) h02).charValue()) {
            return false;
        }
        E0(Character.valueOf(c2));
        return true;
    }

    public final void O() {
        this.f13697i = null;
        this.f13698j = 0;
        this.f13699k = 0;
        this.P = 0;
        this.f13705q = false;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.f14083c = false;
        composerChangeListWriter.d.f13808b = 0;
        composerChangeListWriter.f14084f = 0;
        this.D.f14076a.clear();
        this.f13702n = null;
        this.f13703o = null;
    }

    public final int P(int i2, int i3, int i4, int i5) {
        int i6;
        Object b2;
        if (i2 == i4) {
            return i5;
        }
        SlotReader slotReader = this.F;
        boolean e = SlotTableKt.e(i2, slotReader.f13978b);
        int[] iArr = slotReader.f13978b;
        if (e) {
            Object j2 = slotReader.j(i2, iArr);
            i6 = j2 != null ? j2 instanceof Enum ? ((Enum) j2).ordinal() : j2 instanceof MovableContent ? 126665345 : j2.hashCode() : 0;
        } else {
            int i7 = iArr[i2 * 5];
            if (i7 == 207 && (b2 = slotReader.b(i2, iArr)) != null && !p0.a.g(b2, Composer.Companion.f13690a)) {
                i7 = b2.hashCode();
            }
            i6 = i7;
        }
        if (i6 == 126665345) {
            return i6;
        }
        int i8 = SlotTableKt.i(i2, this.F.f13978b);
        if (i8 != i4) {
            i5 = P(i8, i0(i8), i4, i5);
        }
        if (SlotTableKt.e(i2, this.F.f13978b)) {
            i3 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i5, 3) ^ i6, 3) ^ i3;
    }

    public final PersistentCompositionLocalMap Q() {
        PersistentCompositionLocalMap persistentCompositionLocalMap = this.J;
        return persistentCompositionLocalMap != null ? persistentCompositionLocalMap : R(this.F.f13983i);
    }

    public final PersistentCompositionLocalMap R(int i2) {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        Object obj;
        Object obj2;
        boolean z2 = this.O;
        OpaqueKey opaqueKey = ComposerKt.f13730c;
        if (z2 && this.I) {
            int i3 = this.H.f14020v;
            while (i3 > 0) {
                SlotWriter slotWriter = this.H;
                if (slotWriter.f14002b[slotWriter.p(i3) * 5] == 202) {
                    SlotWriter slotWriter2 = this.H;
                    int p2 = slotWriter2.p(i3);
                    if (SlotTableKt.e(p2, slotWriter2.f14002b)) {
                        Object[] objArr = slotWriter2.f14003c;
                        int[] iArr = slotWriter2.f14002b;
                        int i4 = p2 * 5;
                        obj = objArr[SlotTableKt.m(iArr[i4 + 1] >> 30) + iArr[i4 + 4]];
                    } else {
                        obj = null;
                    }
                    if (p0.a.g(obj, opaqueKey)) {
                        SlotWriter slotWriter3 = this.H;
                        int p3 = slotWriter3.p(i3);
                        if (SlotTableKt.d(p3, slotWriter3.f14002b)) {
                            Object[] objArr2 = slotWriter3.f14003c;
                            int[] iArr2 = slotWriter3.f14002b;
                            obj2 = objArr2[SlotTableKt.m(iArr2[(p3 * 5) + 1] >> 29) + slotWriter3.f(p3, iArr2)];
                        } else {
                            obj2 = Composer.Companion.f13690a;
                        }
                        p0.a.q(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        PersistentCompositionLocalMap persistentCompositionLocalMap2 = (PersistentCompositionLocalMap) obj2;
                        this.J = persistentCompositionLocalMap2;
                        return persistentCompositionLocalMap2;
                    }
                }
                SlotWriter slotWriter4 = this.H;
                i3 = slotWriter4.A(i3, slotWriter4.f14002b);
            }
        }
        if (this.F.f13979c > 0) {
            while (i2 > 0) {
                SlotReader slotReader = this.F;
                int[] iArr3 = slotReader.f13978b;
                if (iArr3[i2 * 5] == 202 && p0.a.g(slotReader.j(i2, iArr3), opaqueKey)) {
                    IntMap intMap = this.f13709u;
                    if (intMap == null || (persistentCompositionLocalMap = (PersistentCompositionLocalMap) intMap.f14141a.get(i2)) == null) {
                        SlotReader slotReader2 = this.F;
                        Object b2 = slotReader2.b(i2, slotReader2.f13978b);
                        p0.a.q(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        persistentCompositionLocalMap = (PersistentCompositionLocalMap) b2;
                    }
                    this.J = persistentCompositionLocalMap;
                    return persistentCompositionLocalMap;
                }
                i2 = SlotTableKt.i(i2, this.F.f13978b);
            }
        }
        PersistentCompositionLocalMap persistentCompositionLocalMap3 = this.f13708t;
        this.J = persistentCompositionLocalMap3;
        return persistentCompositionLocalMap3;
    }

    public final void S(ScopeMap scopeMap, ComposableLambdaImpl composableLambdaImpl) {
        int i2;
        if (!(!this.E)) {
            ComposerKt.c("Reentrant composition is not supported");
            throw null;
        }
        android.os.Trace.beginSection("Compose:recompose");
        try {
            this.A = SnapshotKt.k().d();
            this.f13709u = null;
            MutableScatterMap mutableScatterMap = scopeMap.f14161a;
            Object[] objArr = mutableScatterMap.f1558b;
            Object[] objArr2 = mutableScatterMap.f1559c;
            long[] jArr = mutableScatterMap.f1557a;
            int length = jArr.length - 2;
            ArrayList arrayList = this.f13706r;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j2 = jArr[i3];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8;
                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j2 & 255) < 128) {
                                int i7 = (i3 << 3) + i6;
                                Object obj = objArr[i7];
                                Object obj2 = objArr2[i7];
                                p0.a.q(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                Anchor anchor = ((RecomposeScopeImpl) obj).f13870c;
                                if (anchor != null) {
                                    int i8 = anchor.f13675a;
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                                    if (obj2 == ScopeInvalidated.f13972a) {
                                        obj2 = null;
                                    }
                                    arrayList.add(new Invalidation(recomposeScopeImpl, i8, obj2));
                                }
                                i2 = 8;
                            } else {
                                i2 = i4;
                            }
                            j2 >>= i2;
                            i6++;
                            i4 = i2;
                        }
                        if (i5 != i4) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            s.s0(arrayList, ComposerKt.f13731f);
            this.f13698j = 0;
            this.E = true;
            try {
                A0();
                Object h02 = h0();
                if (h02 != composableLambdaImpl && composableLambdaImpl != null) {
                    E0(composableLambdaImpl);
                }
                ComposerImpl$derivedStateObserver$1 composerImpl$derivedStateObserver$1 = this.C;
                MutableVector c2 = SnapshotStateKt.c();
                try {
                    c2.b(composerImpl$derivedStateObserver$1);
                    OpaqueKey opaqueKey = ComposerKt.f13728a;
                    if (composableLambdaImpl != null) {
                        v0(200, opaqueKey);
                        ActualJvm_jvmKt.b(this, composableLambdaImpl);
                        V(false);
                    } else if (!this.f13710v || h02 == null || p0.a.g(h02, Composer.Companion.f13690a)) {
                        r0();
                    } else {
                        v0(200, opaqueKey);
                        e.g(2, h02);
                        ActualJvm_jvmKt.b(this, (p) h02);
                        V(false);
                    }
                    c2.o(c2.f14144c - 1);
                    a0();
                    this.E = false;
                    arrayList.clear();
                    ComposerKt.h(this.H.w);
                    c0();
                    android.os.Trace.endSection();
                } finally {
                    c2.o(c2.f14144c - 1);
                }
            } catch (Throwable th) {
                this.E = false;
                arrayList.clear();
                M();
                ComposerKt.h(this.H.w);
                c0();
                throw th;
            }
        } catch (Throwable th2) {
            android.os.Trace.endSection();
            throw th2;
        }
    }

    public final void T(int i2, int i3) {
        if (i2 <= 0 || i2 == i3) {
            return;
        }
        T(SlotTableKt.i(i2, this.F.f13978b), i3);
        if (SlotTableKt.f(i2, this.F.f13978b)) {
            Object i4 = this.F.i(i2);
            ComposerChangeListWriter composerChangeListWriter = this.L;
            composerChangeListWriter.g();
            composerChangeListWriter.f14086h.f14076a.add(i4);
        }
    }

    public final void U() {
        this.x = this.f13711y >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0637  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(boolean r41) {
        /*
            Method dump skipped, instructions count: 1947
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.V(boolean):void");
    }

    public final void W() {
        V(false);
        RecomposeScopeImpl d02 = d0();
        if (d02 != null) {
            int i2 = d02.f13868a;
            if ((i2 & 1) != 0) {
                d02.f13868a = i2 | 2;
            }
        }
    }

    public final void X() {
        V(false);
        V(false);
        this.f13710v = this.w.a() != 0;
        this.J = null;
    }

    public final void Y() {
        V(false);
        V(false);
        this.f13710v = this.w.a() != 0;
        this.J = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.runtime.RecomposeScopeImpl Z() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.Z():androidx.compose.runtime.RecomposeScopeImpl");
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean a(boolean z2) {
        Object h02 = h0();
        if ((h02 instanceof Boolean) && z2 == ((Boolean) h02).booleanValue()) {
            return false;
        }
        E0(Boolean.valueOf(z2));
        return true;
    }

    public final void a0() {
        V(false);
        this.f13692b.c();
        V(false);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        if (composerChangeListWriter.f14083c) {
            composerChangeListWriter.h(false);
            composerChangeListWriter.h(false);
            ChangeList changeList = composerChangeListWriter.f14082b;
            changeList.getClass();
            changeList.f14080a.i(Operation.EndCurrentGroup.f14104c);
            composerChangeListWriter.f14083c = false;
        }
        composerChangeListWriter.f();
        if (!(composerChangeListWriter.d.f13808b == 0)) {
            ComposerKt.c("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f13696h.f14076a.isEmpty()) {
            ComposerKt.c("Start/end imbalance");
            throw null;
        }
        O();
        this.F.c();
        this.f13710v = this.w.a() != 0;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean b(float f2) {
        Object h02 = h0();
        if ((h02 instanceof Float) && f2 == ((Number) h02).floatValue()) {
            return false;
        }
        E0(Float.valueOf(f2));
        return true;
    }

    public final void b0(boolean z2, Pending pending) {
        this.f13696h.f14076a.add(this.f13697i);
        this.f13697i = pending;
        int i2 = this.f13699k;
        IntStack intStack = this.f13701m;
        intStack.b(i2);
        intStack.b(this.f13700l);
        intStack.b(this.f13698j);
        if (z2) {
            this.f13698j = 0;
        }
        this.f13699k = 0;
        this.f13700l = 0;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean c(int i2) {
        Object h02 = h0();
        if ((h02 instanceof Integer) && i2 == ((Number) h02).intValue()) {
            return false;
        }
        E0(Integer.valueOf(i2));
        return true;
    }

    public final void c0() {
        SlotTable slotTable = new SlotTable();
        if (this.B) {
            slotTable.c();
        }
        if (this.f13692b.d()) {
            slotTable.f13997k = new MutableIntObjectMap();
        }
        this.G = slotTable;
        SlotWriter e = slotTable.e();
        e.e(true);
        this.H = e;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean d(long j2) {
        Object h02 = h0();
        if ((h02 instanceof Long) && j2 == ((Number) h02).longValue()) {
            return false;
        }
        E0(Long.valueOf(j2));
        return true;
    }

    public final RecomposeScopeImpl d0() {
        if (this.f13712z == 0) {
            Stack stack = this.D;
            if (!stack.f14076a.isEmpty()) {
                return (RecomposeScopeImpl) stack.f14076a.get(r0.size() - 1);
            }
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean e() {
        return this.O;
    }

    public final boolean e0() {
        RecomposeScopeImpl d02;
        return (i() && !this.f13710v && ((d02 = d0()) == null || (d02.f13868a & 4) == 0)) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void f(boolean z2) {
        if (!(this.f13699k == 0)) {
            ComposerKt.c("No nodes can be emitted before calling dactivateToEndGroup");
            throw null;
        }
        if (this.O) {
            return;
        }
        if (!z2) {
            s0();
            return;
        }
        SlotReader slotReader = this.F;
        int i2 = slotReader.f13981g;
        int i3 = slotReader.f13982h;
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.getClass();
        composerChangeListWriter.h(false);
        ChangeList changeList = composerChangeListWriter.f14082b;
        changeList.getClass();
        changeList.f14080a.i(Operation.DeactivateCurrentGroup.f14100c);
        ComposerKt.a(i2, i3, this.f13706r);
        this.F.m();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(3:(5:(4:(1:138)(2:41|(2:43|(34:45|(3:47|48|49)(1:131)|(1:51)|53|54|55|56|(2:58|(1:60))|61|62|63|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87)(3:132|133|134))(3:135|136|137))|85|86|87)|81|82|83|84)|79|80)|70|71|72|73|74|75|76|77|78) */
    /* JADX WARN: Can't wrap try/catch for region: R(17:34|(1:139)|(16:(4:(1:138)(2:41|(2:43|(34:45|(3:47|48|49)(1:131)|(1:51)|53|54|55|56|(2:58|(1:60))|61|62|63|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87)(3:132|133|134))(3:135|136|137))|85|86|87)|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84)|52|53|54|55|56|(0)|61|62|63|65|66|67|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b4, code lost:
    
        r13 = r5;
        r22 = r11;
        r8 = r4;
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bc, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
    
        r13 = r5;
        r22 = r11;
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c2, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01e5, code lost:
    
        r22 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0114 A[Catch: all -> 0x012e, TryCatch #5 {all -> 0x012e, blocks: (B:22:0x0197, B:49:0x00c6, B:52:0x00f7, B:53:0x00f9, B:56:0x0109, B:58:0x0114, B:60:0x011d, B:61:0x0130, B:87:0x0194, B:89:0x01e7, B:90:0x01ea, B:124:0x01ec, B:125:0x01ef, B:131:0x00d2, B:133:0x00dd, B:134:0x00e5, B:136:0x00e6, B:137:0x00ee, B:144:0x01f5, B:55:0x0102), top: B:48:0x00c6, inners: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(java.util.ArrayList r24) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.f0(java.util.ArrayList):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final ComposerImpl g(int i2) {
        RecomposeScopeImpl recomposeScopeImpl;
        J(i2);
        boolean z2 = this.O;
        Stack stack = this.D;
        ControlledComposition controlledComposition = this.f13695g;
        if (z2) {
            p0.a.q(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) controlledComposition);
            stack.f14076a.add(recomposeScopeImpl2);
            E0(recomposeScopeImpl2);
            recomposeScopeImpl2.e = this.A;
            recomposeScopeImpl2.f13868a &= -17;
        } else {
            ArrayList arrayList = this.f13706r;
            int f2 = ComposerKt.f(this.F.f13983i, arrayList);
            Invalidation invalidation = f2 >= 0 ? (Invalidation) arrayList.remove(f2) : null;
            Object h2 = this.F.h();
            if (p0.a.g(h2, Composer.Companion.f13690a)) {
                p0.a.q(controlledComposition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) controlledComposition);
                E0(recomposeScopeImpl);
            } else {
                p0.a.q(h2, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                recomposeScopeImpl = (RecomposeScopeImpl) h2;
            }
            if (invalidation == null) {
                int i3 = recomposeScopeImpl.f13868a;
                boolean z3 = (i3 & 64) != 0;
                if (z3) {
                    recomposeScopeImpl.f13868a = i3 & (-65);
                }
                if (!z3) {
                    recomposeScopeImpl.f13868a &= -9;
                    stack.f14076a.add(recomposeScopeImpl);
                    recomposeScopeImpl.e = this.A;
                    recomposeScopeImpl.f13868a &= -17;
                }
            }
            recomposeScopeImpl.f13868a |= 8;
            stack.f14076a.add(recomposeScopeImpl);
            recomposeScopeImpl.e = this.A;
            recomposeScopeImpl.f13868a &= -17;
        }
        return this;
    }

    public final void g0(MovableContent movableContent, PersistentCompositionLocalMap persistentCompositionLocalMap, Object obj, boolean z2) {
        y(126665345, movableContent);
        h0();
        E0(obj);
        int i2 = this.P;
        try {
            this.P = 126665345;
            if (this.O) {
                SlotWriter.u(this.H);
            }
            boolean z3 = (this.O || p0.a.g(this.F.e(), persistentCompositionLocalMap)) ? false : true;
            if (z3) {
                n0(persistentCompositionLocalMap);
            }
            t0(202, ComposerKt.f13730c, persistentCompositionLocalMap, 0);
            this.J = null;
            if (!this.O || z2) {
                boolean z4 = this.f13710v;
                this.f13710v = z3;
                ComposerImpl$invokeMovableContentLambda$1 composerImpl$invokeMovableContentLambda$1 = new ComposerImpl$invokeMovableContentLambda$1(movableContent, obj);
                Object obj2 = ComposableLambdaKt.f14482a;
                ActualJvm_jvmKt.b(this, new ComposableLambdaImpl(316014703, composerImpl$invokeMovableContentLambda$1, true));
                this.f13710v = z4;
            } else {
                this.I = true;
                SlotWriter slotWriter = this.H;
                this.f13692b.l(new MovableContentStateReference(movableContent, obj, this.f13695g, this.G, slotWriter.b(slotWriter.A(slotWriter.f14020v, slotWriter.f14002b)), w.f30218a, Q()));
            }
            V(false);
            this.J = null;
            this.P = i2;
            V(false);
        } catch (Throwable th) {
            V(false);
            this.J = null;
            this.P = i2;
            V(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void h(Object obj, p pVar) {
        int i2 = 0;
        if (this.O) {
            FixupList fixupList = this.N;
            fixupList.getClass();
            Operation.UpdateNode updateNode = Operation.UpdateNode.f14124c;
            Operations operations = fixupList.f14091a;
            operations.j(updateNode);
            Operations.WriteScope.b(operations, 0, obj);
            p0.a.q(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            e.g(2, pVar);
            Operations.WriteScope.b(operations, 1, pVar);
            int i3 = operations.f14134g;
            int i4 = updateNode.f14093a;
            int b2 = Operations.b(operations, i4);
            int i5 = updateNode.f14094b;
            if (i3 == b2 && operations.f14135h == Operations.b(operations, i5)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i4;
                if (((1 << i6) & operations.f14134g) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(updateNode.c(i6));
                    i2++;
                }
                i6++;
                i4 = i7;
            }
            String sb2 = sb.toString();
            StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
            int i8 = 0;
            int i9 = 0;
            while (i9 < i5) {
                int i10 = i5;
                if (((1 << i9) & operations.f14135h) != 0) {
                    if (i2 > 0) {
                        s2.append(", ");
                    }
                    s2.append(updateNode.d(i9));
                    i8++;
                }
                i9++;
                i5 = i10;
            }
            String sb3 = s2.toString();
            p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(updateNode);
            sb4.append(". Not all arguments were provided. Missing ");
            androidx.compose.foundation.text.input.a.y(sb4, i2, " int arguments (", sb2, ") and ");
            androidx.compose.foundation.text.input.a.C(sb4, i8, " object arguments (", sb3, ").");
            throw null;
        }
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.f();
        ChangeList changeList = composerChangeListWriter.f14082b;
        changeList.getClass();
        Operation.UpdateNode updateNode2 = Operation.UpdateNode.f14124c;
        Operations operations2 = changeList.f14080a;
        operations2.j(updateNode2);
        int i11 = 0;
        Operations.WriteScope.b(operations2, 0, obj);
        p0.a.q(pVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        e.g(2, pVar);
        Operations.WriteScope.b(operations2, 1, pVar);
        int i12 = operations2.f14134g;
        int i13 = updateNode2.f14093a;
        int b3 = Operations.b(operations2, i13);
        int i14 = updateNode2.f14094b;
        if (i12 == b3 && operations2.f14135h == Operations.b(operations2, i14)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < i13; i15++) {
            if (((1 << i15) & operations2.f14134g) != 0) {
                if (i11 > 0) {
                    sb5.append(", ");
                }
                sb5.append(updateNode2.c(i15));
                i11++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder s3 = androidx.compose.foundation.text.input.a.s(sb6, "StringBuilder().apply(builderAction).toString()");
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            int i18 = i14;
            if (((1 << i16) & operations2.f14135h) != 0) {
                if (i11 > 0) {
                    s3.append(", ");
                }
                s3.append(updateNode2.d(i16));
                i17++;
            }
            i16++;
            i14 = i18;
        }
        String sb7 = s3.toString();
        p0.a.r(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(updateNode2);
        sb8.append(". Not all arguments were provided. Missing ");
        androidx.compose.foundation.text.input.a.y(sb8, i11, " int arguments (", sb6, ") and ");
        androidx.compose.foundation.text.input.a.C(sb8, i17, " object arguments (", sb7, ").");
        throw null;
    }

    public final Object h0() {
        boolean z2 = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (z2) {
            G0();
            return composer$Companion$Empty$1;
        }
        Object h2 = this.F.h();
        return (!this.x || (h2 instanceof ReusableRememberObserver)) ? h2 : composer$Companion$Empty$1;
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean i() {
        RecomposeScopeImpl d02;
        return (this.O || this.x || this.f13710v || (d02 = d0()) == null || (d02.f13868a & 8) != 0) ? false : true;
    }

    public final int i0(int i2) {
        int i3 = SlotTableKt.i(i2, this.F.f13978b) + 1;
        int i4 = 0;
        while (i3 < i2) {
            if (!SlotTableKt.e(i3, this.F.f13978b)) {
                i4++;
            }
            i3 += SlotTableKt.c(i3, this.F.f13978b);
        }
        return i4;
    }

    @Override // androidx.compose.runtime.Composer
    public final Applier j() {
        return this.f13691a;
    }

    public final boolean j0(ScopeMap scopeMap) {
        ChangeList changeList = this.e;
        if (!changeList.f14080a.f()) {
            ComposerKt.c("Expected applyChanges() to have been called");
            throw null;
        }
        if (scopeMap.f14161a.e <= 0 && !(!this.f13706r.isEmpty())) {
            return false;
        }
        S(scopeMap, null);
        return changeList.f14080a.g();
    }

    @Override // androidx.compose.runtime.Composer
    public final void k(Object obj) {
        p0.a.q(null, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        g0(null, Q(), obj, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k0(androidx.compose.runtime.ControlledComposition r7, androidx.compose.runtime.ControlledComposition r8, java.lang.Integer r9, java.util.List r10, q0.a r11) {
        /*
            r6 = this;
            boolean r0 = r6.E
            int r1 = r6.f13698j
            r2 = 1
            r6.E = r2     // Catch: java.lang.Throwable -> L22
            r2 = 0
            r6.f13698j = r2     // Catch: java.lang.Throwable -> L22
            int r3 = r10.size()     // Catch: java.lang.Throwable -> L22
        Le:
            if (r2 >= r3) goto L2b
            java.lang.Object r4 = r10.get(r2)     // Catch: java.lang.Throwable -> L22
            d0.k r4 = (d0.k) r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r5 = r4.f30134a     // Catch: java.lang.Throwable -> L22
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L22
            java.lang.Object r4 = r4.f30135b     // Catch: java.lang.Throwable -> L22
            if (r4 == 0) goto L24
            r6.B0(r5, r4)     // Catch: java.lang.Throwable -> L22
            goto L28
        L22:
            r7 = move-exception
            goto L44
        L24:
            r4 = 0
            r6.B0(r5, r4)     // Catch: java.lang.Throwable -> L22
        L28:
            int r2 = r2 + 1
            goto Le
        L2b:
            if (r7 == 0) goto L3b
            if (r9 == 0) goto L34
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> L22
            goto L35
        L34:
            r9 = -1
        L35:
            java.lang.Object r7 = r7.u(r8, r9, r11)     // Catch: java.lang.Throwable -> L22
            if (r7 != 0) goto L3f
        L3b:
            java.lang.Object r7 = r11.invoke()     // Catch: java.lang.Throwable -> L22
        L3f:
            r6.E = r0
            r6.f13698j = r1
            return r7
        L44:
            r6.E = r0
            r6.f13698j = r1
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.k0(androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.ControlledComposition, java.lang.Integer, java.util.List, q0.a):java.lang.Object");
    }

    @Override // androidx.compose.runtime.Composer
    public final l l() {
        return this.f13692b.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r10.f13810b < r3) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0082, code lost:
    
        if (androidx.compose.runtime.RecomposeScopeImpl.a((androidx.compose.runtime.DerivedState) r12, r11) != false) goto L20;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l0() {
        /*
            Method dump skipped, instructions count: 760
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.l0():void");
    }

    @Override // androidx.compose.runtime.Composer
    public final PersistentCompositionLocalMap m() {
        return Q();
    }

    public final void m0() {
        q0(this, this.F.f13981g, false, 0);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.g();
        composerChangeListWriter.h(false);
        composerChangeListWriter.i();
        ChangeList changeList = composerChangeListWriter.f14082b;
        changeList.getClass();
        changeList.f14080a.i(Operation.RemoveCurrentGroup.f14116c);
        int i2 = composerChangeListWriter.f14084f;
        SlotReader slotReader = composerChangeListWriter.f14081a.F;
        composerChangeListWriter.f14084f = SlotTableKt.c(slotReader.f13981g, slotReader.f13978b) + i2;
    }

    @Override // androidx.compose.runtime.Composer
    public final void n() {
        boolean z2;
        if (!this.f13705q) {
            ComposerKt.c("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f13705q = false;
        if (!(!this.O)) {
            ComposerKt.c("useNode() called while inserting");
            throw null;
        }
        SlotReader slotReader = this.F;
        Object i2 = slotReader.i(slotReader.f13983i);
        ComposerChangeListWriter composerChangeListWriter = this.L;
        composerChangeListWriter.g();
        composerChangeListWriter.f14086h.f14076a.add(i2);
        if (this.x && ((z2 = i2 instanceof ComposeNodeLifecycleCallback))) {
            composerChangeListWriter.f();
            ChangeList changeList = composerChangeListWriter.f14082b;
            changeList.getClass();
            if (z2) {
                changeList.f14080a.i(Operation.UseCurrentNode.f14127c);
            }
        }
    }

    public final void n0(PersistentCompositionLocalMap persistentCompositionLocalMap) {
        IntMap intMap = this.f13709u;
        if (intMap == null) {
            intMap = new IntMap();
            this.f13709u = intMap;
        }
        intMap.f14141a.put(this.F.f13981g, persistentCompositionLocalMap);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.compose.runtime.RememberObserverHolder, java.lang.Object] */
    @Override // androidx.compose.runtime.Composer
    public final void o(Object obj) {
        int i2;
        SlotReader slotReader;
        int i3;
        SlotWriter slotWriter;
        if (obj instanceof RememberObserver) {
            Anchor anchor = null;
            if (this.O) {
                ChangeList changeList = this.L.f14082b;
                changeList.getClass();
                Operation.Remember remember = Operation.Remember.f14115c;
                Operations operations = changeList.f14080a;
                operations.j(remember);
                Operations.WriteScope.b(operations, 0, (RememberObserver) obj);
                int i4 = operations.f14134g;
                int i5 = remember.f14093a;
                int b2 = Operations.b(operations, i5);
                int i6 = remember.f14094b;
                if (i4 != b2 || operations.f14135h != Operations.b(operations, i6)) {
                    StringBuilder sb = new StringBuilder();
                    int i7 = 0;
                    for (int i8 = 0; i8 < i5; i8++) {
                        if (((1 << i8) & operations.f14134g) != 0) {
                            if (i7 > 0) {
                                sb.append(", ");
                            }
                            sb.append(remember.c(i8));
                            i7++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i9 = 0;
                    for (int i10 = 0; i10 < i6; i10++) {
                        if (((1 << i10) & operations.f14135h) != 0) {
                            if (i7 > 0) {
                                s2.append(", ");
                            }
                            s2.append(remember.d(i10));
                            i9++;
                        }
                    }
                    String sb3 = s2.toString();
                    p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(remember);
                    sb4.append(". Not all arguments were provided. Missing ");
                    androidx.compose.foundation.text.input.a.y(sb4, i7, " int arguments (", sb2, ") and ");
                    androidx.compose.foundation.text.input.a.C(sb4, i9, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.d.add(obj);
            RememberObserver rememberObserver = (RememberObserver) obj;
            if (this.O) {
                SlotWriter slotWriter2 = this.H;
                int i11 = slotWriter2.f14018t;
                if (i11 > slotWriter2.f14020v + 1) {
                    int i12 = i11 - 1;
                    int A = slotWriter2.A(i12, slotWriter2.f14002b);
                    while (true) {
                        i3 = i12;
                        i12 = A;
                        slotWriter = this.H;
                        if (i12 == slotWriter.f14020v || i12 < 0) {
                            break;
                        } else {
                            A = slotWriter.A(i12, slotWriter.f14002b);
                        }
                    }
                    anchor = slotWriter.b(i3);
                }
            } else {
                SlotReader slotReader2 = this.F;
                int i13 = slotReader2.f13981g;
                if (i13 > slotReader2.f13983i + 1) {
                    int i14 = i13 - 1;
                    int i15 = SlotTableKt.i(i14, slotReader2.f13978b);
                    while (true) {
                        i2 = i14;
                        i14 = i15;
                        slotReader = this.F;
                        if (i14 == slotReader.f13983i || i14 < 0) {
                            break;
                        } else {
                            i15 = SlotTableKt.i(i14, slotReader.f13978b);
                        }
                    }
                    anchor = slotReader.a(i2);
                }
            }
            ?? obj2 = new Object();
            obj2.f13970a = rememberObserver;
            obj2.f13971b = anchor;
            obj = obj2;
        }
        E0(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0(int r8, int r9, int r10) {
        /*
            r7 = this;
            androidx.compose.runtime.SlotReader r0 = r7.F
            if (r8 != r9) goto L7
        L4:
            r10 = r8
            goto L79
        L7:
            if (r8 == r10) goto L79
            if (r9 != r10) goto Ld
            goto L79
        Ld:
            int[] r1 = r0.f13978b
            int r1 = androidx.compose.runtime.SlotTableKt.i(r8, r1)
            if (r1 != r9) goto L18
            r10 = r9
            goto L79
        L18:
            int[] r1 = r0.f13978b
            int r2 = androidx.compose.runtime.SlotTableKt.i(r9, r1)
            if (r2 != r8) goto L21
            goto L4
        L21:
            int r2 = r8 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            int r3 = r9 * 5
            int r3 = r3 + 2
            r3 = r1[r3]
            if (r2 != r3) goto L31
            r10 = r2
            goto L79
        L31:
            r2 = 0
            r3 = r8
            r4 = r2
        L34:
            if (r3 <= 0) goto L3f
            if (r3 == r10) goto L3f
            int r3 = androidx.compose.runtime.SlotTableKt.i(r3, r1)
            int r4 = r4 + 1
            goto L34
        L3f:
            r3 = r9
            r5 = r2
        L41:
            if (r3 <= 0) goto L4c
            if (r3 == r10) goto L4c
            int r3 = androidx.compose.runtime.SlotTableKt.i(r3, r1)
            int r5 = r5 + 1
            goto L41
        L4c:
            int r10 = r4 - r5
            r6 = r8
            r3 = r2
        L50:
            if (r3 >= r10) goto L5b
            int r6 = r6 * 5
            int r6 = r6 + 2
            r6 = r1[r6]
            int r3 = r3 + 1
            goto L50
        L5b:
            int r5 = r5 - r4
            r10 = r9
        L5d:
            if (r2 >= r5) goto L68
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 + 1
            goto L5d
        L68:
            r2 = r10
            r10 = r6
        L6a:
            if (r10 == r2) goto L79
            int r10 = r10 * 5
            int r10 = r10 + 2
            r10 = r1[r10]
            int r2 = r2 * 5
            int r2 = r2 + 2
            r2 = r1[r2]
            goto L6a
        L79:
            if (r8 <= 0) goto L91
            if (r8 == r10) goto L91
            int[] r1 = r0.f13978b
            boolean r1 = androidx.compose.runtime.SlotTableKt.f(r8, r1)
            if (r1 == 0) goto L8a
            androidx.compose.runtime.changelist.ComposerChangeListWriter r1 = r7.L
            r1.e()
        L8a:
            int[] r1 = r0.f13978b
            int r8 = androidx.compose.runtime.SlotTableKt.i(r8, r1)
            goto L79
        L91:
            r7.T(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.o0(int, int, int):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void p() {
        V(true);
    }

    public final void p0() {
        ComposerChangeListWriter composerChangeListWriter = this.L;
        SlotTable slotTable = this.f13693c;
        if (slotTable.f13990b <= 0 || !SlotTableKt.a(0, slotTable.f13989a)) {
            return;
        }
        ChangeList changeList = new ChangeList();
        this.K = changeList;
        SlotReader d = slotTable.d();
        try {
            this.F = d;
            ChangeList changeList2 = composerChangeListWriter.f14082b;
            try {
                composerChangeListWriter.f14082b = changeList;
                q0(this, 0, false, 0);
                composerChangeListWriter.g();
                composerChangeListWriter.f();
                if (composerChangeListWriter.f14083c) {
                    ChangeList changeList3 = composerChangeListWriter.f14082b;
                    changeList3.getClass();
                    changeList3.f14080a.i(Operation.SkipToEndOfCurrentGroup.f14120c);
                    if (composerChangeListWriter.f14083c) {
                        composerChangeListWriter.h(false);
                        composerChangeListWriter.h(false);
                        ChangeList changeList4 = composerChangeListWriter.f14082b;
                        changeList4.getClass();
                        changeList4.f14080a.i(Operation.EndCurrentGroup.f14104c);
                        composerChangeListWriter.f14083c = false;
                    }
                }
            } finally {
                composerChangeListWriter.f14082b = changeList2;
            }
        } finally {
            d.c();
        }
    }

    @Override // androidx.compose.runtime.Composer
    public final void q() {
        this.f13704p = true;
        this.B = true;
        this.f13693c.c();
        this.G.c();
        SlotWriter slotWriter = this.H;
        SlotTable slotTable = slotWriter.f14001a;
        slotWriter.e = slotTable.f13996j;
        slotWriter.f14004f = slotTable.f13997k;
    }

    @Override // androidx.compose.runtime.Composer
    public final RecomposeScopeImpl r() {
        return d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r0() {
        /*
            r12 = this;
            java.util.ArrayList r0 = r12.f13706r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L15
            int r0 = r12.f13699k
            androidx.compose.runtime.SlotReader r1 = r12.F
            int r1 = r1.l()
            int r1 = r1 + r0
            r12.f13699k = r1
            goto Ldf
        L15:
            androidx.compose.runtime.SlotReader r0 = r12.F
            int r1 = r0.f()
            int r2 = r0.f13981g
            int r3 = r0.f13982h
            r4 = 0
            int[] r5 = r0.f13978b
            if (r2 >= r3) goto L29
            java.lang.Object r2 = r0.j(r2, r5)
            goto L2a
        L29:
            r2 = r4
        L2a:
            java.lang.Object r3 = r0.e()
            int r6 = r12.f13700l
            androidx.compose.runtime.Composer$Companion$Empty$1 r7 = androidx.compose.runtime.Composer.Companion.f13690a
            r8 = 207(0xcf, float:2.9E-43)
            r9 = 3
            if (r2 != 0) goto L63
            if (r3 == 0) goto L54
            if (r1 != r8) goto L54
            boolean r10 = p0.a.g(r3, r7)
            if (r10 != 0) goto L54
            int r10 = r3.hashCode()
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
            r12.P = r10
            goto L7f
        L54:
            int r10 = r12.P
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r1
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            r10 = r10 ^ r6
        L60:
            r12.P = r10
            goto L7f
        L63:
            boolean r10 = r2 instanceof java.lang.Enum
            if (r10 == 0) goto L7a
            r10 = r2
            java.lang.Enum r10 = (java.lang.Enum) r10
            int r10 = r10.ordinal()
        L6e:
            int r11 = r12.P
            int r11 = java.lang.Integer.rotateLeft(r11, r9)
            r10 = r10 ^ r11
            int r10 = java.lang.Integer.rotateLeft(r10, r9)
            goto L60
        L7a:
            int r10 = r2.hashCode()
            goto L6e
        L7f:
            int r10 = r0.f13981g
            boolean r5 = androidx.compose.runtime.SlotTableKt.f(r10, r5)
            r12.z0(r4, r5)
            r12.l0()
            r0.d()
            if (r2 != 0) goto Lc4
            if (r3 == 0) goto Lb1
            if (r1 != r8) goto Lb1
            boolean r0 = p0.a.g(r3, r7)
            if (r0 != 0) goto Lb1
            int r0 = r3.hashCode()
            int r1 = r12.P
            r1 = r1 ^ r6
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ldf
        Lb1:
            int r0 = r12.P
            r0 = r0 ^ r6
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            int r1 = java.lang.Integer.hashCode(r1)
            r0 = r0 ^ r1
        Lbd:
            int r0 = java.lang.Integer.rotateRight(r0, r9)
            r12.P = r0
            goto Ldf
        Lc4:
            boolean r0 = r2 instanceof java.lang.Enum
            if (r0 == 0) goto Lda
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r0 = r2.ordinal()
        Lce:
            int r1 = r12.P
            int r1 = java.lang.Integer.rotateRight(r1, r9)
            int r0 = java.lang.Integer.hashCode(r0)
            r0 = r0 ^ r1
            goto Lbd
        Lda:
            int r0 = r2.hashCode()
            goto Lce
        Ldf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.r0():void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void s() {
        if (this.x && this.F.f13983i == this.f13711y) {
            this.f13711y = -1;
            this.x = false;
        }
        V(false);
    }

    public final void s0() {
        SlotReader slotReader = this.F;
        int i2 = slotReader.f13983i;
        this.f13699k = i2 >= 0 ? SlotTableKt.h(i2, slotReader.f13978b) : 0;
        this.F.m();
    }

    @Override // androidx.compose.runtime.Composer
    public final void t(int i2) {
        t0(i2, null, null, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t0(int r26, java.lang.Object r27, java.lang.Object r28, int r29) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.t0(int, java.lang.Object, java.lang.Object, int):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final Object u() {
        boolean z2 = this.O;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (z2) {
            G0();
            return composer$Companion$Empty$1;
        }
        Object h2 = this.F.h();
        return (!this.x || (h2 instanceof ReusableRememberObserver)) ? h2 instanceof RememberObserverHolder ? ((RememberObserverHolder) h2).f13970a : h2 : composer$Companion$Empty$1;
    }

    public final void u0() {
        t0(-127, null, null, 0);
    }

    @Override // androidx.compose.runtime.Composer
    public final SlotTable v() {
        return this.f13693c;
    }

    public final void v0(int i2, OpaqueKey opaqueKey) {
        t0(i2, opaqueKey, null, 0);
    }

    @Override // androidx.compose.runtime.Composer
    public final boolean w(Object obj) {
        if (h0() == obj) {
            return false;
        }
        E0(obj);
        return true;
    }

    public final void w0() {
        t0(Opcodes.LUSHR, null, null, 1);
        this.f13705q = true;
    }

    @Override // androidx.compose.runtime.Composer
    public final void x(Object obj) {
        if (!this.O && this.F.f() == 207 && !p0.a.g(this.F.e(), obj) && this.f13711y < 0) {
            this.f13711y = this.F.f13981g;
            this.x = true;
        }
        t0(207, null, obj, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r5 == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(androidx.compose.runtime.ProvidedValue r10) {
        /*
            r9 = this;
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = r9.Q()
            androidx.compose.runtime.OpaqueKey r1 = androidx.compose.runtime.ComposerKt.f13729b
            r2 = 201(0xc9, float:2.82E-43)
            r9.v0(r2, r1)
            java.lang.Object r1 = r9.u()
            androidx.compose.runtime.Composer$Companion$Empty$1 r2 = androidx.compose.runtime.Composer.Companion.f13690a
            boolean r2 = p0.a.g(r1, r2)
            if (r2 == 0) goto L19
            r1 = 0
            goto L20
        L19:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>"
            p0.a.q(r1, r2)
            androidx.compose.runtime.ValueHolder r1 = (androidx.compose.runtime.ValueHolder) r1
        L20:
            androidx.compose.runtime.CompositionLocal r2 = r10.f13862a
            java.lang.String r3 = "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>"
            p0.a.q(r2, r3)
            androidx.compose.runtime.ValueHolder r3 = r2.b(r10, r1)
            boolean r1 = p0.a.g(r3, r1)
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L36
            r9.o(r3)
        L36:
            boolean r5 = r9.O
            r6 = 0
            if (r5 == 0) goto L4d
            boolean r10 = r10.f13867h
            if (r10 != 0) goto L45
            boolean r10 = r0.containsKey(r2)
            if (r10 != 0) goto L49
        L45:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r0 = r0.h(r2, r3)
        L49:
            r9.I = r4
        L4b:
            r4 = r6
            goto L7e
        L4d:
            androidx.compose.runtime.SlotReader r5 = r9.F
            int r7 = r5.f13981g
            int[] r8 = r5.f13978b
            java.lang.Object r5 = r5.b(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            p0.a.q(r5, r7)
            androidx.compose.runtime.PersistentCompositionLocalMap r5 = (androidx.compose.runtime.PersistentCompositionLocalMap) r5
            boolean r7 = r9.i()
            if (r7 == 0) goto L66
            if (r1 == 0) goto L71
        L66:
            boolean r10 = r10.f13867h
            if (r10 != 0) goto L73
            boolean r10 = r0.containsKey(r2)
            if (r10 != 0) goto L71
            goto L73
        L71:
            r0 = r5
            goto L78
        L73:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r10 = r0.h(r2, r3)
            r0 = r10
        L78:
            boolean r10 = r9.x
            if (r10 != 0) goto L7e
            if (r5 == r0) goto L4b
        L7e:
            if (r4 == 0) goto L87
            boolean r10 = r9.O
            if (r10 != 0) goto L87
            r9.n0(r0)
        L87:
            boolean r10 = r9.f13710v
            androidx.compose.runtime.IntStack r1 = r9.w
            r1.b(r10)
            r9.f13710v = r4
            r9.J = r0
            androidx.compose.runtime.OpaqueKey r10 = androidx.compose.runtime.ComposerKt.f13730c
            r1 = 202(0xca, float:2.83E-43)
            r9.t0(r1, r10, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.x0(androidx.compose.runtime.ProvidedValue):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void y(int i2, Object obj) {
        t0(i2, obj, null, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (p0.a.g(r0, r1) != false) goto L5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.runtime.PersistentCompositionLocalMap, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(androidx.compose.runtime.ProvidedValue[] r10) {
        /*
            r9 = this;
            androidx.compose.runtime.PersistentCompositionLocalMap r0 = r9.Q()
            androidx.compose.runtime.OpaqueKey r1 = androidx.compose.runtime.ComposerKt.f13729b
            r2 = 201(0xc9, float:2.82E-43)
            r9.v0(r2, r1)
            boolean r1 = r9.O
            r2 = 204(0xcc, float:2.86E-43)
            androidx.compose.runtime.OpaqueKey r3 = androidx.compose.runtime.ComposerKt.d
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L3c
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r1 = androidx.compose.runtime.internal.PersistentCompositionLocalHashMap.d
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = androidx.compose.runtime.CompositionLocalMapKt.b(r10, r0, r1)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap$Builder r0 = r0.builder()
            r0.putAll(r10)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r0 = r0.build()
            r9.v0(r2, r3)
            r9.h0()
            r9.E0(r0)
            r9.h0()
            r9.E0(r10)
            r9.V(r4)
            r9.I = r5
        L3a:
            r5 = r4
            goto La1
        L3c:
            androidx.compose.runtime.SlotReader r1 = r9.F
            int r6 = r1.f13981g
            java.lang.Object r1 = r1.g(r6, r4)
            java.lang.String r6 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            p0.a.q(r1, r6)
            androidx.compose.runtime.PersistentCompositionLocalMap r1 = (androidx.compose.runtime.PersistentCompositionLocalMap) r1
            androidx.compose.runtime.SlotReader r7 = r9.F
            int r8 = r7.f13981g
            java.lang.Object r7 = r7.g(r8, r5)
            p0.a.q(r7, r6)
            androidx.compose.runtime.PersistentCompositionLocalMap r7 = (androidx.compose.runtime.PersistentCompositionLocalMap) r7
            androidx.compose.runtime.PersistentCompositionLocalMap r10 = androidx.compose.runtime.CompositionLocalMapKt.b(r10, r0, r7)
            boolean r6 = r9.i()
            if (r6 == 0) goto L7a
            boolean r6 = r9.x
            if (r6 != 0) goto L7a
            boolean r6 = p0.a.g(r7, r10)
            if (r6 != 0) goto L6d
            goto L7a
        L6d:
            int r10 = r9.f13699k
            androidx.compose.runtime.SlotReader r0 = r9.F
            int r0 = r0.l()
            int r0 = r0 + r10
            r9.f13699k = r0
            r0 = r1
            goto L3a
        L7a:
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap$Builder r0 = r0.builder()
            r0.putAll(r10)
            androidx.compose.runtime.internal.PersistentCompositionLocalHashMap r0 = r0.build()
            r9.v0(r2, r3)
            r9.h0()
            r9.E0(r0)
            r9.h0()
            r9.E0(r10)
            r9.V(r4)
            boolean r10 = r9.x
            if (r10 != 0) goto La1
            boolean r10 = p0.a.g(r0, r1)
            if (r10 != 0) goto L3a
        La1:
            if (r5 == 0) goto Laa
            boolean r10 = r9.O
            if (r10 != 0) goto Laa
            r9.n0(r0)
        Laa:
            boolean r10 = r9.f13710v
            androidx.compose.runtime.IntStack r1 = r9.w
            r1.b(r10)
            r9.f13710v = r5
            r9.J = r0
            androidx.compose.runtime.OpaqueKey r10 = androidx.compose.runtime.ComposerKt.f13730c
            r1 = 202(0xca, float:2.83E-43)
            r9.t0(r1, r10, r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.y0(androidx.compose.runtime.ProvidedValue[]):void");
    }

    @Override // androidx.compose.runtime.Composer
    public final void z() {
        t0(Opcodes.LUSHR, null, null, 2);
        this.f13705q = true;
    }

    public final void z0(Object obj, boolean z2) {
        if (z2) {
            SlotReader slotReader = this.F;
            if (slotReader.f13985k <= 0) {
                if (SlotTableKt.f(slotReader.f13981g, slotReader.f13978b)) {
                    slotReader.n();
                    return;
                } else {
                    PreconditionsKt.a("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            ComposerChangeListWriter composerChangeListWriter = this.L;
            composerChangeListWriter.getClass();
            composerChangeListWriter.h(false);
            ChangeList changeList = composerChangeListWriter.f14082b;
            changeList.getClass();
            Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.f14123c;
            Operations operations = changeList.f14080a;
            operations.j(updateAuxData);
            Operations.WriteScope.b(operations, 0, obj);
            int i2 = operations.f14134g;
            int i3 = updateAuxData.f14093a;
            int b2 = Operations.b(operations, i3);
            int i4 = updateAuxData.f14094b;
            if (i2 != b2 || operations.f14135h != Operations.b(operations, i4)) {
                StringBuilder sb = new StringBuilder();
                int i5 = 0;
                for (int i6 = 0; i6 < i3; i6++) {
                    if (((1 << i6) & operations.f14134g) != 0) {
                        if (i5 > 0) {
                            sb.append(", ");
                        }
                        sb.append(updateAuxData.c(i6));
                        i5++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder s2 = androidx.compose.foundation.text.input.a.s(sb2, "StringBuilder().apply(builderAction).toString()");
                int i7 = 0;
                for (int i8 = 0; i8 < i4; i8++) {
                    if (((1 << i8) & operations.f14135h) != 0) {
                        if (i5 > 0) {
                            s2.append(", ");
                        }
                        s2.append(updateAuxData.d(i8));
                        i7++;
                    }
                }
                String sb3 = s2.toString();
                p0.a.r(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(updateAuxData);
                sb4.append(". Not all arguments were provided. Missing ");
                androidx.compose.foundation.text.input.a.y(sb4, i5, " int arguments (", sb2, ") and ");
                androidx.compose.foundation.text.input.a.C(sb4, i7, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.F.n();
    }
}
