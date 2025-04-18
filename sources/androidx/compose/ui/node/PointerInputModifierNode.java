package androidx.compose.ui.node;

import androidx.compose.foundation.text.handwriting.StylusHandwritingNodeWithNegativePadding;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;

/* loaded from: classes3.dex */
public interface PointerInputModifierNode extends DelegatableNode {
    default boolean G1() {
        return this instanceof StylusHandwritingNodeWithNegativePadding;
    }

    default void J1() {
        m1();
    }

    void e0(PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j2);

    default void i0() {
    }

    void m1();

    default void v1() {
        m1();
    }
}
