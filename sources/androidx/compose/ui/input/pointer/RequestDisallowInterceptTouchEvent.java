package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import d0.b0;
import q0.l;

@StabilityInferred
@ExperimentalComposeUiApi
/* loaded from: classes4.dex */
public final class RequestDisallowInterceptTouchEvent implements l {

    /* renamed from: a, reason: collision with root package name */
    public PointerInteropFilter f15639a;

    @Override // q0.l
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        PointerInteropFilter pointerInteropFilter = this.f15639a;
        if (pointerInteropFilter != null) {
            pointerInteropFilter.f15621c = booleanValue;
        }
        return b0.f30125a;
    }
}
