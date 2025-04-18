package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes2.dex */
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(374375707);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = new PointerInteropFilter();
            composer.o(u2);
        }
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) u2;
        pointerInteropFilter.f15619a = null;
        RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent = pointerInteropFilter.f15620b;
        if (requestDisallowInterceptTouchEvent != null) {
            requestDisallowInterceptTouchEvent.f15639a = null;
        }
        pointerInteropFilter.f15620b = null;
        composer.D();
        return pointerInteropFilter;
    }
}
