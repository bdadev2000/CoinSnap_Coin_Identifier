package androidx.compose.ui.input.rotary;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes3.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f15686o;

    /* renamed from: p, reason: collision with root package name */
    public l f15687p;

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean d0(RotaryScrollEvent rotaryScrollEvent) {
        l lVar = this.f15687p;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.rotary.RotaryInputModifierNode
    public final boolean k1(RotaryScrollEvent rotaryScrollEvent) {
        l lVar = this.f15686o;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }
}
