package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.jvm.internal.o;
import q0.l;

/* loaded from: classes3.dex */
final /* synthetic */ class FocusGroupPropertiesNode$applyFocusProperties$2 extends o implements l {
    public final FocusRequester b(int i2) {
        FocusGroupPropertiesNode focusGroupPropertiesNode = (FocusGroupPropertiesNode) this.receiver;
        focusGroupPropertiesNode.getClass();
        View c2 = FocusGroupNode_androidKt.c(focusGroupPropertiesNode);
        if (!c2.hasFocus()) {
            return FocusRequester.f14872b;
        }
        FocusOwner focusOwner = DelegatableNodeKt.g(focusGroupPropertiesNode).getFocusOwner();
        View view = (View) DelegatableNodeKt.g(focusGroupPropertiesNode);
        if (!(c2 instanceof ViewGroup)) {
            if (view.requestFocus()) {
                return FocusRequester.f14872b;
            }
            throw new IllegalStateException("host view did not take focus".toString());
        }
        Rect b2 = FocusGroupNode_androidKt.b(focusOwner, view, c2);
        Integer c3 = FocusInteropUtils_androidKt.c(i2);
        int intValue = c3 != null ? c3.intValue() : 130;
        FocusFinder focusFinder = FocusFinder.getInstance();
        View view2 = focusGroupPropertiesNode.f17585o;
        View findNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, b2, intValue);
        if (findNextFocus != null && FocusGroupNode_androidKt.a(c2, findNextFocus)) {
            findNextFocus.requestFocus(intValue, b2);
            return FocusRequester.f14873c;
        }
        if (view.requestFocus()) {
            return FocusRequester.f14872b;
        }
        throw new IllegalStateException("host view did not take focus".toString());
    }

    @Override // q0.l
    public final /* synthetic */ Object invoke(Object obj) {
        return b(((FocusDirection) obj).f14833a);
    }
}
