package androidx.compose.material3;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import e0.w;

/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowImpl$1$scope$1$1 implements TabIndicatorScope, TabPositionsHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f11871a;

    public TabRowKt$ScrollableTabRowImpl$1$scope$1$1() {
        ParcelableSnapshotMutableState f2;
        f2 = SnapshotStateKt.f(w.f30218a, StructuralEqualityPolicy.f14078a);
        this.f11871a = f2;
    }

    @Override // androidx.compose.material3.TabIndicatorScope
    public final Modifier a(int i2, boolean z2) {
        return new TabIndicatorModifier(this.f11871a, i2, z2);
    }
}
