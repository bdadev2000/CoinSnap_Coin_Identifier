package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$applySemantics$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6556a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$applySemantics$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6556a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        AnnotatedString annotatedString = (AnnotatedString) obj;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6556a;
        if (!textFieldDecoratorModifierNode.k2()) {
            return Boolean.FALSE;
        }
        TransformedTextFieldState transformedTextFieldState = textFieldDecoratorModifierNode.f6546q;
        InputTransformation inputTransformation = transformedTextFieldState.f6652b;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.f6873a;
        TextFieldState textFieldState = transformedTextFieldState.f6651a;
        textFieldState.f6307b.f6400b.b();
        EditingBuffer editingBuffer = textFieldState.f6307b;
        editingBuffer.f(0, editingBuffer.f6399a.length(), "");
        EditCommandKt.a(editingBuffer, annotatedString.toString(), 1);
        TextFieldState.a(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        return Boolean.TRUE;
    }
}
