package androidx.compose.foundation.text.handwriting;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.focus.FocusStateImpl;
import b1.f0;
import d0.h;
import d0.i;
import kotlin.jvm.internal.e;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class HandwritingHandlerNode extends Modifier.Node implements FocusEventModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public FocusState f6270o;

    /* renamed from: p, reason: collision with root package name */
    public final h f6271p = f0.s(i.f30133c, new HandwritingHandlerNode$composeImm$2(this));

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public final void v(FocusStateImpl focusStateImpl) {
        if (a.g(this.f6270o, focusStateImpl)) {
            return;
        }
        this.f6270o = focusStateImpl;
        if (focusStateImpl.b()) {
            e.v(S1(), null, 0, new HandwritingHandlerNode$onFocusEvent$1(this, null), 3);
        }
    }
}
