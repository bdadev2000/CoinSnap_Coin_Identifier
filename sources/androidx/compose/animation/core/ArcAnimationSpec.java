package androidx.compose.animation.core;

import androidx.collection.IntListKt;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntList;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.runtime.Immutable;

@Immutable
@ExperimentalAnimationSpecApi
/* loaded from: classes4.dex */
public final class ArcAnimationSpec<T> implements DurationBasedAnimationSpec<T> {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcAnimationSpec)) {
            return false;
        }
        ((ArcAnimationSpec) obj).getClass();
        return p0.a.g(null, null);
    }

    public final int hashCode() {
        Integer.hashCode(0);
        throw null;
    }

    @Override // androidx.compose.animation.core.FiniteAnimationSpec, androidx.compose.animation.core.AnimationSpec
    public final /* bridge */ /* synthetic */ VectorizedFiniteAnimationSpec a(TwoWayConverter twoWayConverter) {
        return a(VectorConvertersKt.f2340a);
    }

    @Override // androidx.compose.animation.core.AnimationSpec
    public final VectorizedDurationBasedAnimationSpec a(TwoWayConverter twoWayConverter) {
        int i2 = IntListKt.f1435a;
        MutableIntList mutableIntList = new MutableIntList(2);
        mutableIntList.b(0);
        mutableIntList.b(0);
        MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.f1442a;
        p0.a.q(mutableIntObjectMap, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
        return new VectorizedKeyframesSpec(mutableIntList, mutableIntObjectMap, 0, null);
    }
}
