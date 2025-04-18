package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;

@StabilityInferred
/* loaded from: classes4.dex */
public final class TailModifierNode extends Modifier.Node {

    /* renamed from: o, reason: collision with root package name */
    public boolean f16171o;

    @Override // androidx.compose.ui.Modifier.Node
    public final void W1() {
        this.f16171o = true;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        this.f16171o = false;
    }

    public final String toString() {
        return "<tail>";
    }
}
