package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.ui.node.UiApplier;
import b1.f0;
import d0.k;
import h0.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import q0.p;

@StabilityInferred
/* loaded from: classes2.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices {

    /* renamed from: a, reason: collision with root package name */
    public final CompositionContext f13733a;

    /* renamed from: b, reason: collision with root package name */
    public final Applier f13734b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f13735c = new AtomicReference(null);
    public final Object d = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Set f13736f;

    /* renamed from: g, reason: collision with root package name */
    public final SlotTable f13737g;

    /* renamed from: h, reason: collision with root package name */
    public final ScopeMap f13738h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableScatterSet f13739i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableScatterSet f13740j;

    /* renamed from: k, reason: collision with root package name */
    public final ScopeMap f13741k;

    /* renamed from: l, reason: collision with root package name */
    public final ChangeList f13742l;

    /* renamed from: m, reason: collision with root package name */
    public final ChangeList f13743m;

    /* renamed from: n, reason: collision with root package name */
    public final ScopeMap f13744n;

    /* renamed from: o, reason: collision with root package name */
    public ScopeMap f13745o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f13746p;

    /* renamed from: q, reason: collision with root package name */
    public CompositionImpl f13747q;

    /* renamed from: r, reason: collision with root package name */
    public int f13748r;

    /* renamed from: s, reason: collision with root package name */
    public final CompositionObserverHolder f13749s;

    /* renamed from: t, reason: collision with root package name */
    public final ComposerImpl f13750t;

    /* renamed from: u, reason: collision with root package name */
    public final l f13751u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13752v;
    public p w;

    /* loaded from: classes2.dex */
    public static final class RememberEventDispatcher implements RememberManager {

        /* renamed from: a, reason: collision with root package name */
        public final Set f13753a;
        public MutableScatterSet e;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f13754b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f13755c = new ArrayList();
        public final ArrayList d = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f13756f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        public final MutableIntList f13757g = new MutableIntList();

        /* renamed from: h, reason: collision with root package name */
        public final MutableIntList f13758h = new MutableIntList();

        public RememberEventDispatcher(Set set) {
            this.f13753a = set;
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void a(q0.a aVar) {
            this.d.add(aVar);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void b(RememberObserver rememberObserver) {
            this.f13754b.add(rememberObserver);
        }

        @Override // androidx.compose.runtime.RememberManager
        public final void c(RememberObserver rememberObserver, int i2, int i3, int i4) {
            g(i2, i3, i4, rememberObserver);
        }

        public final void d() {
            Set set = this.f13753a;
            if (!set.isEmpty()) {
                android.os.Trace.beginSection("Compose:abandons");
                try {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        RememberObserver rememberObserver = (RememberObserver) it.next();
                        it.remove();
                        rememberObserver.onAbandoned();
                    }
                } finally {
                    android.os.Trace.endSection();
                }
            }
        }

        public final void e() {
            f(Integer.MIN_VALUE);
            ArrayList arrayList = this.f13755c;
            boolean z2 = !arrayList.isEmpty();
            Set set = this.f13753a;
            if (z2) {
                android.os.Trace.beginSection("Compose:onForgotten");
                try {
                    MutableScatterSet mutableScatterSet = this.e;
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (-1 >= size) {
                            break;
                        }
                        Object obj = arrayList.get(size);
                        if (obj instanceof RememberObserver) {
                            set.remove(obj);
                            ((RememberObserver) obj).onForgotten();
                        }
                        if (obj instanceof ComposeNodeLifecycleCallback) {
                            if (mutableScatterSet == null || !mutableScatterSet.a(obj)) {
                                ((ComposeNodeLifecycleCallback) obj).c();
                            } else {
                                ((ComposeNodeLifecycleCallback) obj).a();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList2 = this.f13754b;
            if (!arrayList2.isEmpty()) {
                android.os.Trace.beginSection("Compose:onRemembered");
                try {
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        RememberObserver rememberObserver = (RememberObserver) arrayList2.get(i2);
                        set.remove(rememberObserver);
                        rememberObserver.onRemembered();
                    }
                } finally {
                    android.os.Trace.endSection();
                }
            }
        }

        public final void f(int i2) {
            ArrayList arrayList = this.f13756f;
            if (!arrayList.isEmpty()) {
                int i3 = 0;
                ArrayList arrayList2 = null;
                int i4 = 0;
                MutableIntList mutableIntList = null;
                MutableIntList mutableIntList2 = null;
                while (true) {
                    MutableIntList mutableIntList3 = this.f13758h;
                    if (i4 >= mutableIntList3.f1434b) {
                        break;
                    }
                    if (i2 <= mutableIntList3.a(i4)) {
                        Object remove = arrayList.remove(i4);
                        int d = mutableIntList3.d(i4);
                        int d2 = this.f13757g.d(i4);
                        if (arrayList2 == null) {
                            arrayList2 = f0.w(remove);
                            mutableIntList2 = new MutableIntList();
                            mutableIntList2.b(d);
                            mutableIntList = new MutableIntList();
                            mutableIntList.b(d2);
                        } else {
                            p0.a.q(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            p0.a.q(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                            arrayList2.add(remove);
                            mutableIntList2.b(d);
                            mutableIntList.b(d2);
                        }
                    } else {
                        i4++;
                    }
                }
                if (arrayList2 != null) {
                    p0.a.q(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    p0.a.q(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    int size = arrayList2.size() - 1;
                    while (i3 < size) {
                        int i5 = i3 + 1;
                        int size2 = arrayList2.size();
                        for (int i6 = i5; i6 < size2; i6++) {
                            int a2 = mutableIntList2.a(i3);
                            int a3 = mutableIntList2.a(i6);
                            if (a2 < a3 || (a3 == a2 && mutableIntList.a(i3) < mutableIntList.a(i6))) {
                                Object obj = CompositionKt.f13759a;
                                Object obj2 = arrayList2.get(i3);
                                arrayList2.set(i3, arrayList2.get(i6));
                                arrayList2.set(i6, obj2);
                                int a4 = mutableIntList.a(i3);
                                mutableIntList.e(i3, mutableIntList.a(i6));
                                mutableIntList.e(i6, a4);
                                int a5 = mutableIntList2.a(i3);
                                mutableIntList2.e(i3, mutableIntList2.a(i6));
                                mutableIntList2.e(i6, a5);
                            }
                        }
                        i3 = i5;
                    }
                    this.f13755c.addAll(arrayList2);
                }
            }
        }

        public final void g(int i2, int i3, int i4, Object obj) {
            f(i2);
            if (i4 < 0 || i4 >= i2) {
                this.f13755c.add(obj);
                return;
            }
            this.f13756f.add(obj);
            this.f13757g.b(i3);
            this.f13758h.b(i4);
        }

        public final void h(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i2) {
            MutableScatterSet mutableScatterSet = this.e;
            if (mutableScatterSet == null) {
                int i3 = ScatterSetKt.f1605a;
                mutableScatterSet = new MutableScatterSet();
                this.e = mutableScatterSet;
            }
            mutableScatterSet.f1592b[mutableScatterSet.g(composeNodeLifecycleCallback)] = composeNodeLifecycleCallback;
            g(i2, -1, -1, composeNodeLifecycleCallback);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.compose.runtime.CompositionObserverHolder, java.lang.Object] */
    public CompositionImpl(CompositionContext compositionContext, UiApplier uiApplier) {
        this.f13733a = compositionContext;
        this.f13734b = uiApplier;
        Set e = new MutableScatterSet().e();
        this.f13736f = e;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.d()) {
            slotTable.f13997k = new MutableIntObjectMap();
        }
        if (compositionContext.f()) {
            slotTable.c();
        }
        this.f13737g = slotTable;
        this.f13738h = new ScopeMap();
        this.f13739i = new MutableScatterSet();
        this.f13740j = new MutableScatterSet();
        this.f13741k = new ScopeMap();
        ChangeList changeList = new ChangeList();
        this.f13742l = changeList;
        ChangeList changeList2 = new ChangeList();
        this.f13743m = changeList2;
        this.f13744n = new ScopeMap();
        this.f13745o = new ScopeMap();
        ?? obj = new Object();
        obj.f13772a = null;
        obj.f13773b = false;
        this.f13749s = obj;
        ComposerImpl composerImpl = new ComposerImpl(uiApplier, compositionContext, slotTable, e, changeList, changeList2, this);
        compositionContext.q(composerImpl);
        this.f13750t = composerImpl;
        this.f13751u = null;
        boolean z2 = compositionContext instanceof Recomposer;
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.f13685a;
    }

    public final void A() {
        AtomicReference atomicReference = this.f13735c;
        Object andSet = atomicReference.getAndSet(null);
        if (p0.a.g(andSet, CompositionKt.f13759a)) {
            return;
        }
        if (andSet instanceof Set) {
            w((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                w(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.d("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw null;
        }
        ComposerKt.d("corrupt pendingModifications drain: " + atomicReference);
        throw null;
    }

    public final InvalidationResult B(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        CompositionImpl compositionImpl;
        int i2;
        synchronized (this.d) {
            try {
                CompositionImpl compositionImpl2 = this.f13747q;
                if (compositionImpl2 != null) {
                    SlotTable slotTable = this.f13737g;
                    int i3 = this.f13748r;
                    if (!(!slotTable.f13993g)) {
                        ComposerKt.c("Writer is active");
                        throw null;
                    }
                    if (i3 < 0 || i3 >= slotTable.f13990b) {
                        ComposerKt.c("Invalid group index");
                        throw null;
                    }
                    if (slotTable.f(anchor)) {
                        int c2 = SlotTableKt.c(i3, slotTable.f13989a) + i3;
                        int i4 = anchor.f13675a;
                        compositionImpl = (i3 <= i4 && i4 < c2) ? compositionImpl2 : null;
                    }
                    compositionImpl2 = null;
                }
                if (compositionImpl == null) {
                    ComposerImpl composerImpl = this.f13750t;
                    if (composerImpl.E && composerImpl.B0(recomposeScopeImpl, obj)) {
                        return InvalidationResult.d;
                    }
                    CompositionObserver D = D();
                    if (obj == null) {
                        this.f13745o.f14161a.k(recomposeScopeImpl, ScopeInvalidated.f13972a);
                    } else if (D != null || (obj instanceof DerivedState)) {
                        Object c3 = this.f13745o.f14161a.c(recomposeScopeImpl);
                        if (c3 != null) {
                            if (c3 instanceof MutableScatterSet) {
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) c3;
                                Object[] objArr = mutableScatterSet.f1592b;
                                long[] jArr = mutableScatterSet.f1591a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i5 = 0;
                                    loop0: while (true) {
                                        long j2 = jArr[i5];
                                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i6 = 8;
                                            int i7 = 8 - ((~(i5 - length)) >>> 31);
                                            int i8 = 0;
                                            while (i8 < i7) {
                                                if ((j2 & 255) >= 128) {
                                                    i2 = i6;
                                                } else {
                                                    if (objArr[(i5 << 3) + i8] == ScopeInvalidated.f13972a) {
                                                        break loop0;
                                                    }
                                                    i2 = 8;
                                                }
                                                j2 >>= i2;
                                                i8++;
                                                i6 = i2;
                                            }
                                            if (i7 != i6) {
                                                break;
                                            }
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            } else if (c3 == ScopeInvalidated.f13972a) {
                            }
                        }
                        this.f13745o.a(recomposeScopeImpl, obj);
                    } else {
                        this.f13745o.f14161a.k(recomposeScopeImpl, ScopeInvalidated.f13972a);
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.B(recomposeScopeImpl, anchor, obj);
                }
                this.f13733a.m(this);
                return this.f13750t.E ? InvalidationResult.f13814c : InvalidationResult.f13813b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C(Object obj) {
        Object c2 = this.f13738h.f14161a.c(obj);
        if (c2 == null) {
            return;
        }
        boolean z2 = c2 instanceof MutableScatterSet;
        ScopeMap scopeMap = this.f13744n;
        InvalidationResult invalidationResult = InvalidationResult.d;
        if (!z2) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) c2;
            if (recomposeScopeImpl.c(obj) == invalidationResult) {
                scopeMap.a(obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) c2;
        Object[] objArr = mutableScatterSet.f1592b;
        long[] jArr = mutableScatterSet.f1591a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i2 << 3) + i4];
                        if (recomposeScopeImpl2.c(obj) == invalidationResult) {
                            scopeMap.a(obj, recomposeScopeImpl2);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final CompositionObserver D() {
        CompositionObserverHolder compositionObserverHolder = this.f13749s;
        if (compositionObserverHolder.f13773b) {
            return compositionObserverHolder.f13772a;
        }
        CompositionObserverHolder j2 = this.f13733a.j();
        CompositionObserver compositionObserver = j2 != null ? j2.f13772a : null;
        if (!p0.a.g(compositionObserver, compositionObserverHolder.f13772a)) {
            compositionObserverHolder.f13772a = compositionObserver;
        }
        return compositionObserver;
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public final void a(Object obj) {
        RecomposeScopeImpl d02;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        ComposerImpl composerImpl = this.f13750t;
        if (composerImpl.f13712z <= 0 && (d02 = composerImpl.d0()) != null) {
            boolean z4 = true;
            int i4 = d02.f13868a | 1;
            d02.f13868a = i4;
            if ((i4 & 32) == 0) {
                MutableObjectIntMap mutableObjectIntMap = d02.f13871f;
                if (mutableObjectIntMap == null) {
                    mutableObjectIntMap = new MutableObjectIntMap();
                    d02.f13871f = mutableObjectIntMap;
                }
                int i5 = d02.e;
                int d = mutableObjectIntMap.d(obj);
                if (d < 0) {
                    d = ~d;
                    i3 = -1;
                } else {
                    i3 = mutableObjectIntMap.f1547c[d];
                }
                mutableObjectIntMap.f1546b[d] = obj;
                mutableObjectIntMap.f1547c[d] = i5;
                if (i3 == d02.e) {
                    return;
                }
            }
            if (obj instanceof StateObjectImpl) {
                ((StateObjectImpl) obj).v(1);
            }
            this.f13738h.a(obj, d02);
            if (obj instanceof DerivedState) {
                DerivedState derivedState = (DerivedState) obj;
                DerivedSnapshotState.ResultRecord s2 = derivedState.s();
                ScopeMap scopeMap = this.f13741k;
                scopeMap.d(obj);
                ObjectIntMap objectIntMap = s2.e;
                Object[] objArr = objectIntMap.f1546b;
                long[] jArr = objectIntMap.f1545a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr[i6];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j2 & 255) < 128) {
                                    StateObject stateObject = (StateObject) objArr[(i6 << 3) + i9];
                                    if (stateObject instanceof StateObjectImpl) {
                                        z3 = true;
                                        ((StateObjectImpl) stateObject).v(1);
                                    } else {
                                        z3 = true;
                                    }
                                    scopeMap.a(stateObject, obj);
                                    i2 = 8;
                                } else {
                                    z3 = z4;
                                    i2 = i7;
                                }
                                j2 >>= i2;
                                i9++;
                                i7 = i2;
                                z4 = z3;
                            }
                            z2 = z4;
                            if (i8 != i7) {
                                break;
                            }
                        } else {
                            z2 = z4;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        z4 = z2;
                    }
                }
                Object obj2 = s2.f13788f;
                MutableScatterMap mutableScatterMap = d02.f13872g;
                if (mutableScatterMap == null) {
                    mutableScatterMap = new MutableScatterMap();
                    d02.f13872g = mutableScatterMap;
                }
                mutableScatterMap.k(derivedState, obj2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public final void b(ScatterSetWrapper scatterSetWrapper) {
        ScatterSetWrapper scatterSetWrapper2;
        while (true) {
            Object obj = this.f13735c.get();
            if (obj == null || p0.a.g(obj, CompositionKt.f13759a)) {
                scatterSetWrapper2 = scatterSetWrapper;
            } else if (obj instanceof Set) {
                scatterSetWrapper2 = new Set[]{obj, scatterSetWrapper};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.f13735c).toString());
                }
                Set[] setArr = (Set[]) obj;
                int length = setArr.length;
                ?? copyOf = Arrays.copyOf(setArr, length + 1);
                copyOf[length] = scatterSetWrapper;
                scatterSetWrapper2 = copyOf;
            }
            AtomicReference atomicReference = this.f13735c;
            while (!atomicReference.compareAndSet(obj, scatterSetWrapper2)) {
                if (atomicReference.get() != obj) {
                    break;
                }
            }
            if (obj == null) {
                synchronized (this.d) {
                    A();
                }
                return;
            }
            return;
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final void c() {
        this.f13746p = true;
    }

    @Override // androidx.compose.runtime.Composition
    public final void d(p pVar) {
        ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) pVar;
        if (!this.f13752v) {
            this.f13733a.a(this, composableLambdaImpl);
        } else {
            PreconditionsKt.b("The composition is disposed");
            throw null;
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void deactivate() {
        synchronized (this.d) {
            try {
                boolean z2 = this.f13737g.f13990b > 0;
                try {
                    if (!z2) {
                        if (!ScatterSet.this.b()) {
                        }
                        this.f13738h.f14161a.e();
                        this.f13741k.f14161a.e();
                        this.f13745o.f14161a.e();
                        this.f13742l.f14080a.c();
                        this.f13743m.f14080a.c();
                        ComposerImpl composerImpl = this.f13750t;
                        composerImpl.D.f14076a.clear();
                        composerImpl.f13706r.clear();
                        composerImpl.e.f14080a.c();
                        composerImpl.f13709u = null;
                    }
                    RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.f13736f);
                    if (z2) {
                        this.f13734b.getClass();
                        SlotWriter e = this.f13737g.e();
                        try {
                            ComposerKt.e(e, rememberEventDispatcher);
                            e.e(true);
                            this.f13734b.d();
                            rememberEventDispatcher.e();
                        } catch (Throwable th) {
                            e.e(false);
                            throw th;
                        }
                    }
                    rememberEventDispatcher.d();
                    android.os.Trace.endSection();
                    this.f13738h.f14161a.e();
                    this.f13741k.f14161a.e();
                    this.f13745o.f14161a.e();
                    this.f13742l.f14080a.c();
                    this.f13743m.f14080a.c();
                    ComposerImpl composerImpl2 = this.f13750t;
                    composerImpl2.D.f14076a.clear();
                    composerImpl2.f13706r.clear();
                    composerImpl2.e.f14080a.c();
                    composerImpl2.f13709u = null;
                } catch (Throwable th2) {
                    android.os.Trace.endSection();
                    throw th2;
                }
                android.os.Trace.beginSection("Compose:deactivate");
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final void dispose() {
        synchronized (this.d) {
            try {
                ComposerImpl composerImpl = this.f13750t;
                if (!(!composerImpl.E)) {
                    PreconditionsKt.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                    throw null;
                }
                if (!this.f13752v) {
                    this.f13752v = true;
                    ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$CompositionKt.f13686b;
                    ChangeList changeList = composerImpl.K;
                    if (changeList != null) {
                        x(changeList);
                    }
                    boolean z2 = this.f13737g.f13990b > 0;
                    if (z2 || (!ScatterSet.this.b())) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.f13736f);
                        if (z2) {
                            this.f13734b.getClass();
                            SlotWriter e = this.f13737g.e();
                            try {
                                ComposerKt.g(e, rememberEventDispatcher);
                                e.e(true);
                                this.f13734b.clear();
                                this.f13734b.d();
                                rememberEventDispatcher.e();
                            } catch (Throwable th) {
                                e.e(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.d();
                    }
                    ComposerImpl composerImpl2 = this.f13750t;
                    composerImpl2.getClass();
                    android.os.Trace.beginSection("Compose:Composer.dispose");
                    try {
                        composerImpl2.f13692b.t(composerImpl2);
                        composerImpl2.D.f14076a.clear();
                        composerImpl2.f13706r.clear();
                        composerImpl2.e.f14080a.c();
                        composerImpl2.f13709u = null;
                        composerImpl2.f13691a.clear();
                        android.os.Trace.endSection();
                    } catch (Throwable th2) {
                        android.os.Trace.endSection();
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f13733a.u(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void e() {
        synchronized (this.d) {
            try {
                if (this.f13743m.f14080a.g()) {
                    x(this.f13743m);
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f13736f.isEmpty()) {
                            new RememberEventDispatcher(this.f13736f).d();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e) {
                    r();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean f() {
        return this.f13752v;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void g(q0.a aVar) {
        ComposerImpl composerImpl = this.f13750t;
        if (!(!composerImpl.E)) {
            ComposerKt.c("Preparing a composition while composing is not supported");
            throw null;
        }
        composerImpl.E = true;
        try {
            ((Recomposer$performRecompose$1$1) aVar).invoke();
        } finally {
            composerImpl.E = false;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void h(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.f13736f);
        SlotWriter e = movableContentState.f13832a.e();
        try {
            ComposerKt.g(e, rememberEventDispatcher);
            e.e(true);
            rememberEventDispatcher.e();
        } catch (Throwable th) {
            e.e(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean i() {
        boolean j02;
        synchronized (this.d) {
            try {
                z();
                try {
                    ScopeMap scopeMap = this.f13745o;
                    this.f13745o = new ScopeMap();
                    try {
                        CompositionObserver D = D();
                        if (D != null) {
                            scopeMap.b();
                            D.b();
                        }
                        j02 = this.f13750t.j0(scopeMap);
                        if (!j02) {
                            A();
                        }
                        if (D != null) {
                            D.a();
                        }
                    } catch (Exception e) {
                        this.f13745o = scopeMap;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j02;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void invalidateAll() {
        synchronized (this.d) {
            try {
                for (Object obj : this.f13737g.f13991c) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        return true;
     */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.util.Set r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            androidx.compose.runtime.collection.ScopeMap r3 = r0.f13741k
            androidx.compose.runtime.collection.ScopeMap r4 = r0.f13738h
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L62
            androidx.compose.runtime.collection.ScatterSetWrapper r1 = (androidx.compose.runtime.collection.ScatterSetWrapper) r1
            androidx.collection.ScatterSet r1 = r1.f14151a
            java.lang.Object[] r2 = r1.f1592b
            long[] r1 = r1.f1591a
            int r7 = r1.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L83
            r8 = r5
        L1c:
            r9 = r1[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5d
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r5
        L36:
            if (r13 >= r11) goto L5b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L57
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r2[r14]
            androidx.collection.MutableScatterMap r15 = r4.f14161a
            boolean r15 = r15.a(r14)
            if (r15 != 0) goto L56
            androidx.collection.MutableScatterMap r15 = r3.f14161a
            boolean r14 = r15.a(r14)
            if (r14 == 0) goto L57
        L56:
            return r6
        L57:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L5b:
            if (r11 != r12) goto L83
        L5d:
            if (r8 == r7) goto L83
            int r8 = r8 + 1
            goto L1c
        L62:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L68:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L83
            java.lang.Object r2 = r1.next()
            androidx.collection.MutableScatterMap r7 = r4.f14161a
            boolean r7 = r7.a(r2)
            if (r7 != 0) goto L82
            androidx.collection.MutableScatterMap r7 = r3.f14161a
            boolean r2 = r7.a(r2)
            if (r2 == 0) goto L68
        L82:
            return r6
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.j(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z2 = true;
                break;
            } else if (!p0.a.g(((MovableContentStateReference) ((k) arrayList.get(i2)).f30134a).f13835c, this)) {
                break;
            } else {
                i2++;
            }
        }
        ComposerKt.h(z2);
        try {
            ComposerImpl composerImpl = this.f13750t;
            composerImpl.getClass();
            try {
                composerImpl.f0(arrayList);
                composerImpl.O();
            } catch (Throwable th) {
                composerImpl.M();
                throw th;
            }
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public final InvalidationResult l(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        int i2 = recomposeScopeImpl.f13868a;
        if ((i2 & 2) != 0) {
            recomposeScopeImpl.f13868a = i2 | 4;
        }
        Anchor anchor = recomposeScopeImpl.f13870c;
        if (anchor == null || !anchor.a()) {
            return InvalidationResult.f13812a;
        }
        if (this.f13737g.f(anchor)) {
            return recomposeScopeImpl.d != null ? B(recomposeScopeImpl, anchor, obj) : InvalidationResult.f13812a;
        }
        synchronized (this.d) {
            compositionImpl = this.f13747q;
        }
        if (compositionImpl != null) {
            ComposerImpl composerImpl = compositionImpl.f13750t;
            if (composerImpl.E && composerImpl.B0(recomposeScopeImpl, obj)) {
                return InvalidationResult.d;
            }
        }
        return InvalidationResult.f13812a;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void m(ComposableLambdaImpl composableLambdaImpl) {
        ScopeMap scopeMap;
        try {
            synchronized (this.d) {
                try {
                    z();
                    scopeMap = this.f13745o;
                    this.f13745o = new ScopeMap();
                    CompositionObserver D = D();
                    if (D != null) {
                        scopeMap.b();
                        D.b();
                    }
                    ComposerImpl composerImpl = this.f13750t;
                    if (!composerImpl.e.f14080a.f()) {
                        ComposerKt.c("Expected applyChanges() to have been called");
                        throw null;
                    }
                    composerImpl.S(scopeMap, composableLambdaImpl);
                    if (D != null) {
                        D.a();
                    }
                } catch (Exception e) {
                    this.f13745o = scopeMap;
                    throw e;
                } finally {
                }
            }
        } catch (Throwable th) {
            try {
                if (!ScatterSet.this.b()) {
                    new RememberEventDispatcher(this.f13736f).d();
                }
                throw th;
            } catch (Exception e2) {
                r();
                throw e2;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void n() {
        synchronized (this.d) {
            try {
                x(this.f13742l);
                A();
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.f13736f.isEmpty()) {
                            new RememberEventDispatcher(this.f13736f).d();
                        }
                        throw th;
                    } catch (Exception e) {
                        r();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final boolean o() {
        return this.f13750t.E;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void p(Object obj) {
        synchronized (this.d) {
            try {
                C(obj);
                Object c2 = this.f13741k.f14161a.c(obj);
                if (c2 != null) {
                    if (c2 instanceof MutableScatterSet) {
                        MutableScatterSet mutableScatterSet = (MutableScatterSet) c2;
                        Object[] objArr = mutableScatterSet.f1592b;
                        long[] jArr = mutableScatterSet.f1591a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i2 = 0;
                            while (true) {
                                long j2 = jArr[i2];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        if ((255 & j2) < 128) {
                                            C((DerivedState) objArr[(i2 << 3) + i4]);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i3 != 8) {
                                        break;
                                    }
                                }
                                if (i2 == length) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        C((DerivedState) c2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.Composition
    public final boolean q() {
        boolean z2;
        synchronized (this.d) {
            z2 = this.f13745o.f14161a.e > 0;
        }
        return z2;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void r() {
        this.f13735c.set(null);
        this.f13742l.f14080a.c();
        this.f13743m.f14080a.c();
        Set set = this.f13736f;
        if (!ScatterSet.this.b()) {
            new RememberEventDispatcher(set).d();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final void s() {
        synchronized (this.d) {
            try {
                this.f13750t.f13709u = null;
                if (!ScatterSet.this.b()) {
                    new RememberEventDispatcher(this.f13736f).d();
                }
            } catch (Throwable th) {
                try {
                    try {
                        if (!ScatterSet.this.b()) {
                            new RememberEventDispatcher(this.f13736f).d();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Exception e) {
                    r();
                    throw e;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public final void t(ComposableLambdaImpl composableLambdaImpl) {
        ComposerImpl composerImpl = this.f13750t;
        composerImpl.f13711y = 100;
        composerImpl.x = true;
        if (!(true ^ this.f13752v)) {
            PreconditionsKt.b("The composition is disposed");
            throw null;
        }
        this.f13733a.a(this, composableLambdaImpl);
        if (composerImpl.E || composerImpl.f13711y != 100) {
            PreconditionsKt.a("Cannot disable reuse from root if it was caused by other groups");
            throw null;
        }
        composerImpl.f13711y = -1;
        composerImpl.x = false;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public final Object u(ControlledComposition controlledComposition, int i2, q0.a aVar) {
        if (controlledComposition == null || p0.a.g(controlledComposition, this) || i2 < 0) {
            return aVar.invoke();
        }
        this.f13747q = (CompositionImpl) controlledComposition;
        this.f13748r = i2;
        try {
            return aVar.invoke();
        } finally {
            this.f13747q = null;
            this.f13748r = 0;
        }
    }

    public final void v(Object obj, boolean z2) {
        int i2;
        Object c2 = this.f13738h.f14161a.c(obj);
        if (c2 == null) {
            return;
        }
        boolean z3 = c2 instanceof MutableScatterSet;
        InvalidationResult invalidationResult = InvalidationResult.f13812a;
        MutableScatterSet mutableScatterSet = this.f13739i;
        MutableScatterSet mutableScatterSet2 = this.f13740j;
        ScopeMap scopeMap = this.f13744n;
        if (!z3) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) c2;
            if (scopeMap.c(obj, recomposeScopeImpl) || recomposeScopeImpl.c(obj) == invalidationResult) {
                return;
            }
            if (recomposeScopeImpl.f13872g == null || z2) {
                mutableScatterSet.d(recomposeScopeImpl);
                return;
            } else {
                mutableScatterSet2.d(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet3 = (MutableScatterSet) c2;
        Object[] objArr = mutableScatterSet3.f1592b;
        long[] jArr = mutableScatterSet3.f1591a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i3 << 3) + i6];
                        if (!scopeMap.c(obj, recomposeScopeImpl2) && recomposeScopeImpl2.c(obj) != invalidationResult) {
                            if (recomposeScopeImpl2.f13872g == null || z2) {
                                mutableScatterSet.d(recomposeScopeImpl2);
                            } else {
                                mutableScatterSet2.d(recomposeScopeImpl2);
                            }
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
                    return;
                }
            }
            if (i3 == length) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x028d, code lost:
    
        if (r5.a(r13) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0271, code lost:
    
        if (r13.b() != false) goto L119;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.util.Set r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1099
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.w(java.util.Set, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0170, code lost:
    
        if (((androidx.compose.runtime.RecomposeScopeImpl) r12).b() == false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(androidx.compose.runtime.changelist.ChangeList r32) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.x(androidx.compose.runtime.changelist.ChangeList):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d9, code lost:
    
        if (r8.b() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f6, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f3, code lost:
    
        r1.j(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
    
        if (r13.f14161a.a((androidx.compose.runtime.DerivedState) r8) == false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.y():void");
    }

    public final void z() {
        AtomicReference atomicReference = this.f13735c;
        Object obj = CompositionKt.f13759a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (p0.a.g(andSet, obj)) {
                ComposerKt.d("pending composition has not been applied");
                throw null;
            }
            if (andSet instanceof Set) {
                w((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.d("corrupt pendingModifications drain: " + atomicReference);
                throw null;
            }
            for (Set set : (Set[]) andSet) {
                w(set, true);
            }
        }
    }
}
