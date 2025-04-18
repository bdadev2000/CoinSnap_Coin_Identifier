package androidx.compose.runtime;

import android.util.Log;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSet;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.SnapshotKt;
import b1.a0;
import b1.f0;
import b1.h1;
import b1.k;
import b1.k1;
import b1.q1;
import d0.b0;
import e0.p;
import e0.w;
import e1.i1;
import e1.t0;
import h0.g;
import h0.l;
import h0.m;
import j0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.e;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Recomposer extends CompositionContext {
    public static final i1 x = t0.c(PersistentOrderedSet.d);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference f13876y = new AtomicReference(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final BroadcastFrameClock f13877a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13878b;

    /* renamed from: c, reason: collision with root package name */
    public h1 f13879c;
    public Throwable d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public List f13880f;

    /* renamed from: g, reason: collision with root package name */
    public MutableScatterSet f13881g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableVector f13882h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f13883i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f13884j;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f13885k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f13886l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f13887m;

    /* renamed from: n, reason: collision with root package name */
    public Set f13888n;

    /* renamed from: o, reason: collision with root package name */
    public k f13889o;

    /* renamed from: p, reason: collision with root package name */
    public int f13890p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13891q;

    /* renamed from: r, reason: collision with root package name */
    public RecomposerErrorState f13892r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f13893s;

    /* renamed from: t, reason: collision with root package name */
    public final i1 f13894t;

    /* renamed from: u, reason: collision with root package name */
    public final k1 f13895u;

    /* renamed from: v, reason: collision with root package name */
    public final l f13896v;
    public final RecomposerInfoImpl w;

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
    public static final class HotReloadable {
    }

    /* loaded from: classes2.dex */
    public static final class RecomposerErrorState implements RecomposerErrorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Exception f13897a;

        public RecomposerErrorState(Exception exc) {
            this.f13897a = exc;
        }
    }

    /* loaded from: classes2.dex */
    public final class RecomposerInfoImpl implements RecomposerInfo {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class State {

        /* renamed from: a, reason: collision with root package name */
        public static final State f13898a;

        /* renamed from: b, reason: collision with root package name */
        public static final State f13899b;

        /* renamed from: c, reason: collision with root package name */
        public static final State f13900c;
        public static final State d;

        /* renamed from: f, reason: collision with root package name */
        public static final State f13901f;

        /* renamed from: g, reason: collision with root package name */
        public static final State f13902g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ State[] f13903h;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, androidx.compose.runtime.Recomposer$State] */
        static {
            ?? r02 = new Enum("ShutDown", 0);
            f13898a = r02;
            ?? r1 = new Enum("ShuttingDown", 1);
            f13899b = r1;
            ?? r2 = new Enum("Inactive", 2);
            f13900c = r2;
            ?? r3 = new Enum("InactivePendingWork", 3);
            d = r3;
            ?? r4 = new Enum("Idle", 4);
            f13901f = r4;
            ?? r5 = new Enum("PendingWork", 5);
            f13902g = r5;
            f13903h = new State[]{r02, r1, r2, r3, r4, r5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f13903h.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.Recomposer$RecomposerInfoImpl, java.lang.Object] */
    public Recomposer(l lVar) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f13877a = broadcastFrameClock;
        this.f13878b = new Object();
        this.e = new ArrayList();
        this.f13881g = new MutableScatterSet();
        this.f13882h = new MutableVector(new ControlledComposition[16]);
        this.f13883i = new ArrayList();
        this.f13884j = new ArrayList();
        this.f13885k = new LinkedHashMap();
        this.f13886l = new LinkedHashMap();
        this.f13894t = t0.c(State.f13900c);
        k1 k1Var = new k1((h1) lVar.i(a0.f22285b));
        k1Var.g0(new Recomposer$effectJob$1$1(this));
        this.f13895u = k1Var;
        this.f13896v = lVar.u(broadcastFrameClock).u(k1Var);
        this.w = new Object();
    }

    public static void A(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.v() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            mutableSnapshot.c();
        }
    }

    public static final void I(ArrayList arrayList, Recomposer recomposer, ControlledComposition controlledComposition) {
        arrayList.clear();
        synchronized (recomposer.f13878b) {
            Iterator it = recomposer.f13884j.iterator();
            while (it.hasNext()) {
                MovableContentStateReference movableContentStateReference = (MovableContentStateReference) it.next();
                if (p0.a.g(movableContentStateReference.f13835c, controlledComposition)) {
                    arrayList.add(movableContentStateReference);
                    it.remove();
                }
            }
        }
    }

    public static /* synthetic */ void L(Recomposer recomposer, Exception exc, boolean z2, int i2) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        recomposer.K(exc, null, z2);
    }

    public static final Object v(Recomposer recomposer, i iVar) {
        b1.l lVar;
        if (recomposer.E()) {
            return b0.f30125a;
        }
        b1.l lVar2 = new b1.l(1, f0.r(iVar));
        lVar2.p();
        synchronized (recomposer.f13878b) {
            if (recomposer.E()) {
                lVar = lVar2;
            } else {
                recomposer.f13889o = lVar2;
                lVar = null;
            }
        }
        if (lVar != null) {
            lVar.resumeWith(b0.f30125a);
        }
        Object o2 = lVar2.o();
        return o2 == i0.a.f30806a ? o2 : b0.f30125a;
    }

    public static final boolean w(Recomposer recomposer) {
        boolean z2;
        synchronized (recomposer.f13878b) {
            z2 = !recomposer.f13891q;
        }
        if (z2) {
            return true;
        }
        k1 k1Var = recomposer.f13895u;
        k1Var.getClass();
        Iterator it = new p(new q1(null, k1Var), 3).iterator();
        while (it.hasNext()) {
            if (((h1) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    public static final ControlledComposition x(Recomposer recomposer, ControlledComposition controlledComposition, MutableScatterSet mutableScatterSet) {
        recomposer.getClass();
        if (controlledComposition.o() || controlledComposition.f()) {
            return null;
        }
        Set set = recomposer.f13888n;
        if (set != null && set.contains(controlledComposition)) {
            return null;
        }
        MutableSnapshot h2 = Snapshot.Companion.h(new Recomposer$readObserverOf$1(controlledComposition), new Recomposer$writeObserverOf$1(mutableScatterSet, controlledComposition));
        try {
            Snapshot j2 = h2.j();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.c()) {
                        controlledComposition.g(new Recomposer$performRecompose$1$1(mutableScatterSet, controlledComposition));
                    }
                } catch (Throwable th) {
                    Snapshot.p(j2);
                    throw th;
                }
            }
            boolean i2 = controlledComposition.i();
            Snapshot.p(j2);
            if (!i2) {
                controlledComposition = null;
            }
            return controlledComposition;
        } finally {
            A(h2);
        }
    }

    public static final boolean y(Recomposer recomposer) {
        boolean z2;
        List F;
        synchronized (recomposer.f13878b) {
            z2 = true;
            if (!recomposer.f13881g.b()) {
                ScatterSetWrapper scatterSetWrapper = new ScatterSetWrapper(recomposer.f13881g);
                recomposer.f13881g = new MutableScatterSet();
                synchronized (recomposer.f13878b) {
                    F = recomposer.F();
                }
                try {
                    int size = F.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ControlledComposition) F.get(i2)).b(scatterSetWrapper);
                        if (((State) recomposer.f13894t.getValue()).compareTo(State.f13899b) <= 0) {
                            break;
                        }
                    }
                    synchronized (recomposer.f13878b) {
                        recomposer.f13881g = new MutableScatterSet();
                    }
                    synchronized (recomposer.f13878b) {
                        if (recomposer.C() != null) {
                            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                        }
                        if (!recomposer.f13882h.m() && !recomposer.D()) {
                            z2 = false;
                        }
                    }
                } catch (Throwable th) {
                    synchronized (recomposer.f13878b) {
                        MutableScatterSet mutableScatterSet = recomposer.f13881g;
                        mutableScatterSet.getClass();
                        Iterator it = scatterSetWrapper.iterator();
                        while (true) {
                            y0.k kVar = (y0.k) it;
                            if (!kVar.hasNext()) {
                                break;
                            }
                            Object next = kVar.next();
                            mutableScatterSet.f1592b[mutableScatterSet.g(next)] = next;
                        }
                        throw th;
                    }
                }
            } else if (!recomposer.f13882h.m() && !recomposer.D()) {
                z2 = false;
            }
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e5, code lost:
    
        if (r2.b0(r12, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00e5 -> B:11:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final i0.a z(androidx.compose.runtime.Recomposer r9, androidx.compose.runtime.MonotonicFrameClock r10, androidx.compose.runtime.ProduceFrameSignal r11, h0.g r12) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.z(androidx.compose.runtime.Recomposer, androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, h0.g):i0.a");
    }

    public final void B() {
        synchronized (this.f13878b) {
            if (((State) this.f13894t.getValue()).compareTo(State.f13901f) >= 0) {
                this.f13894t.h(State.f13899b);
            }
        }
        this.f13895u.a(null);
    }

    public final k C() {
        i1 i1Var = this.f13894t;
        int compareTo = ((State) i1Var.getValue()).compareTo(State.f13899b);
        ArrayList arrayList = this.f13884j;
        ArrayList arrayList2 = this.f13883i;
        MutableVector mutableVector = this.f13882h;
        if (compareTo <= 0) {
            this.e.clear();
            this.f13880f = w.f30218a;
            this.f13881g = new MutableScatterSet();
            mutableVector.g();
            arrayList2.clear();
            arrayList.clear();
            this.f13887m = null;
            k kVar = this.f13889o;
            if (kVar != null) {
                kVar.A(null);
            }
            this.f13889o = null;
            this.f13892r = null;
            return null;
        }
        RecomposerErrorState recomposerErrorState = this.f13892r;
        State state = State.f13902g;
        State state2 = State.f13900c;
        if (recomposerErrorState == null) {
            if (this.f13879c == null) {
                this.f13881g = new MutableScatterSet();
                mutableVector.g();
                if (D()) {
                    state2 = State.d;
                }
            } else {
                state2 = (mutableVector.m() || this.f13881g.c() || (arrayList2.isEmpty() ^ true) || (arrayList.isEmpty() ^ true) || this.f13890p > 0 || D()) ? state : State.f13901f;
            }
        }
        i1Var.h(state2);
        if (state2 != state) {
            return null;
        }
        k kVar2 = this.f13889o;
        this.f13889o = null;
        return kVar2;
    }

    public final boolean D() {
        return (this.f13893s || this.f13877a.f13680g.get() == 0) ? false : true;
    }

    public final boolean E() {
        boolean z2;
        synchronized (this.f13878b) {
            if (!this.f13881g.c() && !this.f13882h.m()) {
                z2 = D();
            }
        }
        return z2;
    }

    public final List F() {
        List list = this.f13880f;
        if (list == null) {
            ArrayList arrayList = this.e;
            list = arrayList.isEmpty() ? w.f30218a : new ArrayList(arrayList);
            this.f13880f = list;
        }
        return list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, q0.p] */
    public final Object G(g gVar) {
        Object f02 = p0.a.f0(this.f13894t, new i(2, null), gVar);
        return f02 == i0.a.f30806a ? f02 : b0.f30125a;
    }

    public final void H(ControlledComposition controlledComposition) {
        synchronized (this.f13878b) {
            ArrayList arrayList = this.f13884j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (p0.a.g(((MovableContentStateReference) arrayList.get(i2)).f13835c, controlledComposition)) {
                    ArrayList arrayList2 = new ArrayList();
                    I(arrayList2, this, controlledComposition);
                    while (!arrayList2.isEmpty()) {
                        J(arrayList2, null);
                        I(arrayList2, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c8, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:
    
        if (r4 >= r3) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d7, code lost:
    
        if (((d0.k) r10.get(r4)).f30135b == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d9, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ea, code lost:
    
        if (r9 >= r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ec, code lost:
    
        r11 = (d0.k) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f4, code lost:
    
        if (r11.f30135b != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.f30134a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
    
        if (r11 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0106, code lost:
    
        r4 = r17.f13878b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:
    
        e0.t.t0(r17.f13884j, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011d, code lost:
    
        if (r9 >= r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011f, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0128, code lost:
    
        if (((d0.k) r11).f30135b == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012d, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0130, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List J(java.util.List r18, androidx.collection.MutableScatterSet r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.J(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    public final void K(Exception exc, ControlledComposition controlledComposition, boolean z2) {
        if (!((Boolean) f13876y.get()).booleanValue() || (exc instanceof ComposeRuntimeError)) {
            synchronized (this.f13878b) {
                RecomposerErrorState recomposerErrorState = this.f13892r;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.f13897a;
                }
                this.f13892r = new RecomposerErrorState(exc);
            }
            throw exc;
        }
        synchronized (this.f13878b) {
            try {
                int i2 = ActualAndroid_androidKt.f13673b;
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", exc);
                this.f13883i.clear();
                this.f13882h.g();
                this.f13881g = new MutableScatterSet();
                this.f13884j.clear();
                this.f13885k.clear();
                this.f13886l.clear();
                this.f13892r = new RecomposerErrorState(exc);
                if (controlledComposition != null) {
                    M(controlledComposition);
                }
                C();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void M(ControlledComposition controlledComposition) {
        ArrayList arrayList = this.f13887m;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f13887m = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        this.e.remove(controlledComposition);
        this.f13880f = null;
    }

    public final Object N(g gVar) {
        Object G = e.G(gVar, this.f13877a, new Recomposer$recompositionRunner$2(this, new Recomposer$runRecomposeAndApplyChanges$2(this, null), MonotonicFrameClockKt.a(gVar.getContext()), null));
        i0.a aVar = i0.a.f30806a;
        b0 b0Var = b0.f30125a;
        if (G != aVar) {
            G = b0Var;
        }
        return G == aVar ? G : b0Var;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void a(ControlledComposition controlledComposition, ComposableLambdaImpl composableLambdaImpl) {
        boolean o2 = controlledComposition.o();
        try {
            MutableSnapshot h2 = Snapshot.Companion.h(new Recomposer$readObserverOf$1(controlledComposition), new Recomposer$writeObserverOf$1(null, controlledComposition));
            try {
                Snapshot j2 = h2.j();
                try {
                    controlledComposition.m(composableLambdaImpl);
                    if (!o2) {
                        SnapshotKt.k().m();
                    }
                    synchronized (this.f13878b) {
                        if (((State) this.f13894t.getValue()).compareTo(State.f13899b) > 0 && !F().contains(controlledComposition)) {
                            this.e.add(controlledComposition);
                            this.f13880f = null;
                        }
                    }
                    try {
                        H(controlledComposition);
                        try {
                            controlledComposition.n();
                            controlledComposition.e();
                            if (o2) {
                                return;
                            }
                            SnapshotKt.k().m();
                        } catch (Exception e) {
                            L(this, e, false, 6);
                        }
                    } catch (Exception e2) {
                        K(e2, controlledComposition, true);
                    }
                } finally {
                    Snapshot.p(j2);
                }
            } finally {
                A(h2);
            }
        } catch (Exception e3) {
            K(e3, controlledComposition, true);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void b(MovableContentStateReference movableContentStateReference) {
        synchronized (this.f13878b) {
            LinkedHashMap linkedHashMap = this.f13885k;
            MovableContent movableContent = movableContentStateReference.f13833a;
            Object obj = RecomposerKt.f13962a;
            Object obj2 = linkedHashMap.get(movableContent);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(movableContent, obj2);
            }
            ((List) obj2).add(movableContentStateReference);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean d() {
        return ((Boolean) f13876y.get()).booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean e() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final int h() {
        return 1000;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final l i() {
        return this.f13896v;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final l k() {
        return m.f30726a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void l(MovableContentStateReference movableContentStateReference) {
        k C;
        synchronized (this.f13878b) {
            this.f13884j.add(movableContentStateReference);
            C = C();
        }
        if (C != null) {
            C.resumeWith(b0.f30125a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void m(ControlledComposition controlledComposition) {
        k kVar;
        synchronized (this.f13878b) {
            if (this.f13882h.h(controlledComposition)) {
                kVar = null;
            } else {
                this.f13882h.b(controlledComposition);
                kVar = C();
            }
        }
        if (kVar != null) {
            kVar.resumeWith(b0.f30125a);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void n(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState) {
        synchronized (this.f13878b) {
            this.f13886l.put(movableContentStateReference, movableContentState);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final MovableContentState o(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentState;
        synchronized (this.f13878b) {
            movableContentState = (MovableContentState) this.f13886l.remove(movableContentStateReference);
        }
        return movableContentState;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void p(Set set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void r(ControlledComposition controlledComposition) {
        synchronized (this.f13878b) {
            try {
                Set set = this.f13888n;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.f13888n = set;
                }
                set.add(controlledComposition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public final void u(ControlledComposition controlledComposition) {
        synchronized (this.f13878b) {
            this.e.remove(controlledComposition);
            this.f13880f = null;
            this.f13882h.n(controlledComposition);
            this.f13883i.remove(controlledComposition);
        }
    }
}
