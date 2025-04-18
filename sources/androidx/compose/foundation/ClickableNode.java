package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.PointerInputScope;
import d0.b0;
import h0.g;
import i0.a;

@StabilityInferred
/* loaded from: classes.dex */
public class ClickableNode extends AbstractClickableNode {
    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object i2(PointerInputScope pointerInputScope, g gVar) {
        Object d = TapGestureDetectorKt.d(pointerInputScope, new ClickableNode$clickPointerInput$2(this, null), new ClickableNode$clickPointerInput$3(this), gVar);
        return d == a.f30806a ? d : b0.f30125a;
    }
}
