package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes2.dex */
final class KeyInputNode extends Modifier.Node implements KeyInputModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f15517o;

    /* renamed from: p, reason: collision with root package name */
    public l f15518p;

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean P0(android.view.KeyEvent keyEvent) {
        l lVar = this.f15518p;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.key.KeyInputModifierNode
    public final boolean i1(android.view.KeyEvent keyEvent) {
        l lVar = this.f15517o;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new KeyEvent(keyEvent))).booleanValue();
        }
        return false;
    }
}
