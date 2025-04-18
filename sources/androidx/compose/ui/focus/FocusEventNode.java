package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f14834o;

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        this.f14834o.invoke(focusStateImpl);
    }
}
