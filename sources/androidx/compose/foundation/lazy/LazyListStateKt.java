package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityKt;
import e0.w;
import h0.m;
import p0.a;

/* loaded from: classes.dex */
public final class LazyListStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f4432a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final LazyListMeasureResult f4433b = new LazyListMeasureResult(null, 0, false, 0.0f, new Object(), 0.0f, false, a.c(m.f30726a), DensityKt.b(), ConstraintsKt.b(0, 0, 15), w.f30218a, 0, 0, 0, Orientation.f3394a, 0, 0);

    public static final LazyListState a(int i2, Composer composer, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = LazyListState.x;
        boolean c2 = composer.c(i2) | composer.c(0);
        Object u2 = composer.u();
        if (c2 || u2 == Composer.Companion.f13690a) {
            u2 = new LazyListStateKt$rememberLazyListState$1$1(i2, 0);
            composer.o(u2);
        }
        return (LazyListState) RememberSaveableKt.c(objArr, saverKt$Saver$1, null, (q0.a) u2, composer, 0, 4);
    }
}
