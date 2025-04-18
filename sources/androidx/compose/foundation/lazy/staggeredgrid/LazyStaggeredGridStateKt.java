package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import q0.a;

/* loaded from: classes2.dex */
public final class LazyStaggeredGridStateKt {
    public static final LazyStaggeredGridState a(Composer composer) {
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = LazyStaggeredGridState.f5048u;
        boolean c2 = composer.c(0) | composer.c(0);
        Object u2 = composer.u();
        if (c2 || u2 == Composer.Companion.f13690a) {
            u2 = new LazyStaggeredGridStateKt$rememberLazyStaggeredGridState$1$1(0, 0);
            composer.o(u2);
        }
        return (LazyStaggeredGridState) RememberSaveableKt.c(objArr, saverKt$Saver$1, null, (a) u2, composer, 0, 4);
    }
}
