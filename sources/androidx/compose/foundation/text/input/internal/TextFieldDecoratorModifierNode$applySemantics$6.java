package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import kotlin.jvm.internal.r;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$6 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6561a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(0);
        this.f6561a = textFieldDecoratorModifierNode;
    }

    @Override // q0.a
    public final Object invoke() {
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6561a;
        if (!textFieldDecoratorModifierNode.m2()) {
            FocusRequesterModifierNodeKt.a(textFieldDecoratorModifierNode);
        } else if (!textFieldDecoratorModifierNode.f6551v) {
            textFieldDecoratorModifierNode.o2().show();
        }
        return Boolean.TRUE;
    }
}
