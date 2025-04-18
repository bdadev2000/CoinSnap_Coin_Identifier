package androidx.compose.ui.input.key;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.node.DelegatableNode;

@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public interface SoftKeyboardInterceptionModifierNode extends DelegatableNode {
    boolean R(android.view.KeyEvent keyEvent);

    boolean u0(android.view.KeyEvent keyEvent);
}
