package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.ui.focus.FocusRequesterModifierNodeKt;
import androidx.compose.ui.text.input.KeyboardType;
import d0.b0;
import e1.l0;
import kotlin.jvm.internal.r;

/* loaded from: classes3.dex */
final class TextFieldDecoratorModifierNode$stylusHandwritingNode$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyboardOptions f6604b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$stylusHandwritingNode$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, KeyboardOptions keyboardOptions) {
        super(0);
        this.f6603a = textFieldDecoratorModifierNode;
        this.f6604b = keyboardOptions;
    }

    @Override // q0.a
    public final Object invoke() {
        l0 l2;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6603a;
        if (!textFieldDecoratorModifierNode.m2()) {
            FocusRequesterModifierNodeKt.a(textFieldDecoratorModifierNode);
        }
        KeyboardOptions keyboardOptions = this.f6604b;
        if (!KeyboardType.a(keyboardOptions.f6018c, 7) && !KeyboardType.a(keyboardOptions.f6018c, 8) && (l2 = textFieldDecoratorModifierNode.l2()) != null) {
            l2.b(b0.f30125a);
        }
        return Boolean.TRUE;
    }
}
