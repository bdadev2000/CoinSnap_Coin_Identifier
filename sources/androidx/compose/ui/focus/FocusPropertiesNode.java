package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes4.dex */
final class FocusPropertiesNode extends Modifier.Node implements FocusPropertiesModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public FocusPropertiesScope f14871o;

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void e1(FocusProperties focusProperties) {
        this.f14871o.a(focusProperties);
    }
}
