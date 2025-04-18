package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;

/* loaded from: classes3.dex */
final class FocusRequesterNode extends Modifier.Node implements FocusRequesterModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public FocusRequester f14878o;

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        this.f14878o.f14874a.b(this);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f14878o.f14874a.n(this);
    }
}
