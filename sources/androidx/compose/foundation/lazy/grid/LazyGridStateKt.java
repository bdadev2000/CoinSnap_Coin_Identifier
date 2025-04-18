package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.unit.DensityKt;
import e0.w;
import h0.m;
import p0.a;

/* loaded from: classes3.dex */
public final class LazyGridStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final LazyGridMeasureResult f4638a;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, androidx.compose.ui.layout.MeasureResult] */
    static {
        ?? obj = new Object();
        w wVar = w.f30218a;
        Orientation orientation = Orientation.f3394a;
        f4638a = new LazyGridMeasureResult(null, 0, false, 0.0f, obj, false, a.c(m.f30726a), DensityKt.b(), 0, LazyGridStateKt$EmptyLazyGridLayoutInfo$2.f4639a, wVar, 0, 0, 0, orientation, 0, 0);
    }

    public static final LazyGridState a(int i2, Composer composer, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        SaverKt$Saver$1 saverKt$Saver$1 = LazyGridState.f4603t;
        boolean c2 = composer.c(i2) | composer.c(0);
        Object u2 = composer.u();
        if (c2 || u2 == Composer.Companion.f13690a) {
            u2 = new LazyGridStateKt$rememberLazyGridState$1$1(i2, 0);
            composer.o(u2);
        }
        return (LazyGridState) RememberSaveableKt.c(objArr, saverKt$Saver$1, null, (q0.a) u2, composer, 0, 4);
    }
}
