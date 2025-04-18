package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import b1.a0;
import b1.h1;
import g1.f;
import kotlin.jvm.internal.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusableInteractionNode extends Modifier.Node {

    /* renamed from: o, reason: collision with root package name */
    public MutableInteractionSource f2702o;

    /* renamed from: p, reason: collision with root package name */
    public FocusInteraction.Focus f2703p;

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    public final void e2(MutableInteractionSource mutableInteractionSource, FocusInteraction focusInteraction) {
        if (!this.f14699n) {
            mutableInteractionSource.b(focusInteraction);
            return;
        }
        h1 h1Var = (h1) ((f) S1()).f30606a.i(a0.f22285b);
        e.v(S1(), null, 0, new FocusableInteractionNode$emitWithFallback$1(mutableInteractionSource, focusInteraction, h1Var != null ? h1Var.g0(new FocusableInteractionNode$emitWithFallback$handler$1(mutableInteractionSource, focusInteraction)) : null, null), 3);
    }
}
