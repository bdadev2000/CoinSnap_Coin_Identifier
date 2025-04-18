package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$3 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6557a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$3(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6557a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnnotatedString annotatedString = (AnnotatedString) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6557a;
        if (!textFieldDecoratorModifierNode.k2()) {
            return Boolean.FALSE;
        }
        TransformedTextFieldState.h(textFieldDecoratorModifierNode.f6546q, annotatedString, true, null, 4);
        return Boolean.TRUE;
    }
}
