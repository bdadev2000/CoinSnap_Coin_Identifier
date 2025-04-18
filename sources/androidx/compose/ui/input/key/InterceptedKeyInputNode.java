package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes.dex */
final class InterceptedKeyInputNode extends Modifier.Node implements SoftKeyboardInterceptionModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f15500o;

    /* renamed from: p, reason: collision with root package name */
    public l f15501p;

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    public final boolean R(android.view.KeyEvent keyEvent) {
        l lVar = this.f15501p;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.SoftKeyboardInterceptionModifierNode
    public final boolean u0(android.view.KeyEvent keyEvent) {
        l lVar = this.f15500o;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }
}
