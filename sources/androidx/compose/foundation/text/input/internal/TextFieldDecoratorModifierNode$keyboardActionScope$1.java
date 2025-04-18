package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.ImeAction;

/* loaded from: classes3.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6572a;

    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.f6572a = textFieldDecoratorModifierNode;
    }

    public final void a(int i2) {
        boolean a2 = ImeAction.a(i2, 6);
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6572a;
        if (a2) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.f16435g)).d(1);
        } else if (ImeAction.a(i2, 5)) {
            ((FocusManager) CompositionLocalConsumerModifierNodeKt.a(textFieldDecoratorModifierNode, CompositionLocalsKt.f16435g)).d(2);
        } else if (ImeAction.a(i2, 7)) {
            textFieldDecoratorModifierNode.o2().hide();
        }
    }
}
