package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import p0.a;
import q0.l;

/* loaded from: classes4.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f14831o;

    /* renamed from: p, reason: collision with root package name */
    public FocusState f14832p;

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        if (a.g(this.f14832p, focusStateImpl)) {
            return;
        }
        this.f14832p = focusStateImpl;
        this.f14831o.invoke(focusStateImpl);
    }
}
