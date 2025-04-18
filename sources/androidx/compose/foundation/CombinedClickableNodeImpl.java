package androidx.compose.foundation;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import d0.b0;
import h0.g;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CombinedClickableNodeImpl extends AbstractClickableNode implements CombinedClickableNode {
    public String I;
    public a J;
    public a K;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void h2(SemanticsConfiguration semanticsConfiguration) {
        if (this.J != null) {
            SemanticsPropertiesKt.j(semanticsConfiguration, this.I, new CombinedClickableNodeImpl$applyAdditionalSemantics$1(this));
        }
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final Object i2(PointerInputScope pointerInputScope, g gVar) {
        boolean z2 = this.f2411u;
        Object e = TapGestureDetectorKt.e(pointerInputScope, gVar, (!z2 || this.K == null) ? null : new CombinedClickableNodeImpl$clickPointerInput$2(this), (!z2 || this.J == null) ? null : new CombinedClickableNodeImpl$clickPointerInput$3(this), new CombinedClickableNodeImpl$clickPointerInput$5(this), new CombinedClickableNodeImpl$clickPointerInput$4(this, null));
        return e == i0.a.f30806a ? e : b0.f30125a;
    }
}
