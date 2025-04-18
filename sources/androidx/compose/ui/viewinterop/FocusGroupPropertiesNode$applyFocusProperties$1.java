package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes3.dex */
final /* synthetic */ class FocusGroupPropertiesNode$applyFocusProperties$1 extends o implements l {
    public final FocusRequester b(int i2) {
        FocusGroupPropertiesNode focusGroupPropertiesNode = (FocusGroupPropertiesNode) this.receiver;
        focusGroupPropertiesNode.getClass();
        View c2 = FocusGroupNode_androidKt.c(focusGroupPropertiesNode);
        if (c2.isFocused() || c2.hasFocus()) {
            return FocusRequester.f14872b;
        }
        return FocusInteropUtils_androidKt.b(c2, FocusInteropUtils_androidKt.c(i2), FocusGroupNode_androidKt.b(DelegatableNodeKt.g(focusGroupPropertiesNode).getFocusOwner(), (View) DelegatableNodeKt.g(focusGroupPropertiesNode), c2)) ? FocusRequester.f14872b : FocusRequester.f14873c;
    }

    @Override // q0.l
    public final /* synthetic */ Object invoke(Object obj) {
        return b(((FocusDirection) obj).f14833a);
    }
}
