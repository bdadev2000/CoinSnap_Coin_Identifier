package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.selection.TextToolbarState;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$7 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6562a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$7(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6562a = textFieldDecoratorModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6562a;
        if (!textFieldDecoratorModifierNode.m2()) {
            FocusRequesterModifierNodeKt.a(textFieldDecoratorModifierNode);
        }
        textFieldDecoratorModifierNode.f6548s.A(TextToolbarState.f6865c);
        return Boolean.TRUE;
    }
}
