package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.collection.MutableVector;
import d0.b0;
import e1.g1;
import e1.h;
import e1.j;
import h0.l;
import h0.m;
import q0.p;

/* loaded from: classes4.dex */
public final class SnapshotStateKt {
    public static final MutableState a(h hVar, Object obj, l lVar, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            lVar = m.f30726a;
        }
        boolean w = composer.w(lVar) | composer.w(hVar);
        Object u2 = composer.u();
        Object obj2 = Composer.Companion.f13690a;
        if (w || u2 == obj2) {
            u2 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(lVar, hVar, null);
            composer.o(u2);
        }
        p pVar = (p) u2;
        Object u3 = composer.u();
        if (u3 == obj2) {
            u3 = f(obj, StructuralEqualityPolicy.f14078a);
            composer.o(u3);
        }
        MutableState mutableState = (MutableState) u3;
        boolean w2 = composer.w(pVar);
        Object u4 = composer.u();
        if (w2 || u4 == obj2) {
            u4 = new SnapshotStateKt__ProduceStateKt$produceState$3$1(pVar, mutableState, null);
            composer.o(u4);
        }
        EffectsKt.e(hVar, lVar, (p) u4, composer);
        return mutableState;
    }

    public static final MutableState b(g1 g1Var, Composer composer, int i2) {
        return a(g1Var, g1Var.getValue(), m.f30726a, composer, (i2 & 14) | ((i2 << 3) & 896), 0);
    }

    public static final MutableVector c() {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f14033b;
        MutableVector mutableVector = (MutableVector) snapshotThreadLocal.a();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector mutableVector2 = new MutableVector(new DerivedStateObserver[0]);
        snapshotThreadLocal.b(mutableVector2);
        return mutableVector2;
    }

    public static final State d(SnapshotMutationPolicy snapshotMutationPolicy, q0.a aVar) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f14032a;
        return new DerivedSnapshotState(snapshotMutationPolicy, aVar);
    }

    public static final State e(q0.a aVar) {
        SnapshotThreadLocal snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.f14032a;
        return new DerivedSnapshotState(null, aVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.SnapshotMutableStateImpl, androidx.compose.runtime.ParcelableSnapshotMutableState] */
    public static final ParcelableSnapshotMutableState f(Object obj, SnapshotMutationPolicy snapshotMutationPolicy) {
        int i2 = ActualAndroid_androidKt.f13673b;
        return new SnapshotMutableStateImpl(obj, snapshotMutationPolicy);
    }

    public static /* synthetic */ ParcelableSnapshotMutableState g(Object obj) {
        return f(obj, StructuralEqualityPolicy.f14078a);
    }

    public static final SnapshotMutationPolicy h() {
        return NeverEqualPolicy.f13839a;
    }

    public static final MutableState i(Object obj, p pVar, Composer composer) {
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = f(obj, StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        b0 b0Var = b0.f30125a;
        boolean w = composer.w(pVar);
        Object u3 = composer.u();
        if (w || u3 == composer$Companion$Empty$1) {
            u3 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(pVar, mutableState, null);
            composer.o(u3);
        }
        EffectsKt.f(b0Var, (p) u3, composer);
        return mutableState;
    }

    public static final SnapshotMutationPolicy j() {
        return ReferentialEqualityPolicy.f13969a;
    }

    public static final MutableState k(Object obj, Composer composer) {
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = f(obj, StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        mutableState.setValue(obj);
        return mutableState;
    }

    public static final j l(q0.a aVar) {
        return new j(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, null));
    }

    public static final SnapshotMutationPolicy m() {
        return StructuralEqualityPolicy.f14078a;
    }
}
