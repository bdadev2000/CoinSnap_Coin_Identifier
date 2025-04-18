package androidx.compose.foundation.pager;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.saveable.ListSaverKt;
import q0.a;

/* loaded from: classes.dex */
final class DefaultPagerState extends PagerState {
    public final ParcelableSnapshotMutableState I;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    static {
        ListSaverKt.a(DefaultPagerState$Companion$Saver$2.f5086a, DefaultPagerState$Companion$Saver$1.f5085a);
    }

    public DefaultPagerState(int i2, float f2, a aVar) {
        super(i2, f2);
        ParcelableSnapshotMutableState f3;
        f3 = SnapshotStateKt.f(aVar, StructuralEqualityPolicy.f14078a);
        this.I = f3;
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int m() {
        return ((Number) ((a) this.I.getValue()).invoke()).intValue();
    }
}
