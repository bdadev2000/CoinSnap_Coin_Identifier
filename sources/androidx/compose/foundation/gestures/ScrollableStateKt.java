package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import q0.l;

/* loaded from: classes4.dex */
public final class ScrollableStateKt {
    public static final ScrollableState a(l lVar) {
        return new DefaultScrollableState(lVar);
    }

    public static final ScrollableState b(l lVar, Composer composer) {
        MutableState k2 = SnapshotStateKt.k(lVar, composer);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            DefaultScrollableState defaultScrollableState = new DefaultScrollableState(new ScrollableStateKt$rememberScrollableState$1$1(k2));
            composer.o(defaultScrollableState);
            u2 = defaultScrollableState;
        }
        return (ScrollableState) u2;
    }
}
