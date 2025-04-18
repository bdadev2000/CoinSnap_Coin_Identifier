package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes4.dex */
final class TextFieldDecoratorModifierNode$dragAndDropNode$4 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextFieldDecoratorModifierNode f6568a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$dragAndDropNode$4(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        super(1);
        this.f6568a = textFieldDecoratorModifierNode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.compose.foundation.interaction.Interaction, java.lang.Object, androidx.compose.foundation.interaction.HoverInteraction$Enter] */
    @Override // q0.l
    public final Object invoke(Object obj) {
        ReceiveContentListener a2;
        ?? obj2 = new Object();
        TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.f6568a;
        textFieldDecoratorModifierNode.f6552y.b(obj2);
        textFieldDecoratorModifierNode.C = obj2;
        ReceiveContentConfiguration a3 = ReceiveContentConfigurationKt.a(textFieldDecoratorModifierNode);
        if (a3 != null && (a2 = a3.a()) != null) {
            a2.a();
        }
        return b0.f30125a;
    }
}
