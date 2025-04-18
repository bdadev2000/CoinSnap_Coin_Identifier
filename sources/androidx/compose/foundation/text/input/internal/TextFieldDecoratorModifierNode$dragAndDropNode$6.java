package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$6 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6570a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$6(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6570a = textFieldDecoratorModifierNode;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        ReceiveContentListener a2;
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6570a;
        TextFieldDecoratorModifierNode.h2(textFieldDecoratorModifierNode);
        textFieldDecoratorModifierNode.f6548s.e();
        ReceiveContentConfiguration a3 = ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode);
        if (a3 != null && (a2 = a3.a()) != null) {
            a2.d();
        }
        return b0.f30125a;
    }
}
